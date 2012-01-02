Commons-Collections with Generics
=================================

This package is a new version of the popular [Jakarta Commons-Collections](http://jakarta.apache.org/commons/collections/) project that introduces support for
 [Java 1.5 Generics](http://java.sun.com/j2se/1.5.0/docs/guide/language/generics.html).
 Generics introduce a whole new level of usability and type-safety to the Commons-Collections classes.
 The functionality of the package is otherwise left unchanged.

See the [here](http://jakarta.apache.org/commons/collections/team-list.html) for the list of
authors of the original Jakarta Commons-Collections.

How To Use Collections with Generics
====================================

The Jakarta Commons-Collections [User's Guide](http://jakarta.apache.org/commons/collections/userguide.html)
explains how to use the collections. These tutorial will demonstrate how to upgrade your code to use generics with
those collections.

Consider a situation where we want to store the results of a marathon.
For each runner's name, we want to be able to efficiently look up their ranking in the race.
Also, for each ranking, we want to be able to efficiently look up the name of the runner who finished in that place.
Finally, we would like to be able to view the complete results of the race by ranking or by runner name.
This can be accomplished in the Commons-Collections with an `OrderedBidiMap`.

Here is how it we would have implemented it with the old collections (with no generics):

    public static void tutorialWithoutGenerics() {
        // Create the map
        OrderedBidiMap map = new TreeBidiMap();
        // Populate it with the rankings
        map.put(3, "Joe");
        map.put(4, "Cathy");
        map.put(1, "Anne");
        map.put(2, "Jim");
        map.put(6, "Bill");
        map.put(5, "Wendy");
        // Get the winner
        String winner = (String)map.get(1);
        System.out.println("Winner: " + winner);
        // Get Cathy's ranking
        Integer ranking = (Integer)map.getKey("Cathy");
        System.out.println("Cathy's ranking: " + ranking);
        // Show all runners sorted by ranking
        {
            System.out.println("Runners by ranking:");
            OrderedMapIterator iterator = map.orderedMapIterator();
            while (iterator.hasNext()) {
                iterator.next();
                Integer rank = (Integer)iterator.getKey();
                String runner = (String)iterator.getValue();
                System.out.println("  " + rank + ": " + runner);
            }
        }
        // Invert the map
        OrderedBidiMap inverseMap = map.inverseOrderedBidiMap();
        // Show all rankings sorted by runner name
        {
            System.out.println("Ranking by runner name:");
            OrderedMapIterator iterator = inverseMap.orderedMapIterator();
            while (iterator.hasNext()) {
                iterator.next();
                String runner = (String)iterator.getKey();
                Integer rank = (Integer)iterator.getValue();
                System.out.println("  " + runner + "(" + rank + ")");
            }
        }
    }

Now, here is the same code, but with the generics added:

    public static void tutorialWithGenerics() {
        // Create the map
        OrderedBidiMap<font color="blue">&lt;Integer, String&gt;</font> map = new TreeBidiMap<font color="blue">&lt;Integer, String&gt;</font>();
        // Populate it with the rankings
        map.put(3, "Joe");
        map.put(4, "Cathy");
        map.put(1, "Anne");
        map.put(2, "Jim");
        map.put(6, "Bill");
        map.put(5, "Wendy");
        // Get the winner
        String winner = map.get(1);
        System.out.println("Winner: " + winner);
        // Get Cathy's ranking
        Integer ranking = map.getKey("Cathy");
        System.out.println("Cathy's ranking: " + ranking);
        // Show all runners sorted by ranking
        {
            System.out.println("Runners by ranking:");
            OrderedMapIterator<font color="blue">&lt;Integer, String&gt;</font> iterator = map.orderedMapIterator();
            while (iterator.hasNext()) {
                iterator.next();
                Integer rank = iterator.getKey();
                String runner = iterator.getValue();
                System.out.println("  " + rank + ": " + runner);
            }
        }
        // Invert the map
        OrderedBidiMap<font color="blue">&lt;String, Integer&gt;</font> inverseMap = map.inverseOrderedBidiMap();
        // Show all rankings sorted by runner name
        {
            System.out.println("Ranking by runner name:");
            OrderedMapIterator<font color="blue">&lt;String,Integer&gt;</font> iterator = inverseMap.orderedMapIterator();
            while (iterator.hasNext()) {
                iterator.next();
                String runner = iterator.getKey();
                Integer rank = iterator.getValue();
                System.out.println("  " + runner + "(" + rank + ")");
            }
        }
    }

Notice how there are no casts in the second listing. The code is also much more clear and understandable. Incidentally, the result of running the above code is:

    Winner: Anne
    Cathy's ranking: 4
    Runners by ranking:
      1: Anne
      2: Jim
      3: Joe
      4: Cathy
      5: Wendy
      6: Bill
    Ranking by runner name:
      Anne(1)
      Bill(6)
      Cathy(4)
      Jim(2)
      Joe(3)
      Wendy(5)
