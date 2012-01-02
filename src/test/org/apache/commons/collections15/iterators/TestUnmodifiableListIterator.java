/*
 *  Copyright 2001-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.commons.collections15.iterators;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.apache.commons.collections15.Unmodifiable;

import java.util.*;

/**
 * Tests the UnmodifiableListIterator.
 *
 * @author Matt Hall, John Watkinson, Stephen Colebourne
 * @version $Revision: 1.1 $ $Date: 2005/10/11 19:11:58 $
 */
public class TestUnmodifiableListIterator extends AbstractTestListIterator {

    protected String[] testArray = {"One", "Two", "Three"};
    protected List testList = new ArrayList(Arrays.asList(testArray));

    public static Test suite() {
        return new TestSuite(TestUnmodifiableListIterator.class);
    }

    public TestUnmodifiableListIterator(String testName) {
        super(testName);
    }

    public ListIterator makeEmptyListIterator() {
        return UnmodifiableListIterator.decorate(Collections.EMPTY_LIST.listIterator());
    }

    public ListIterator makeFullListIterator() {
        return UnmodifiableListIterator.decorate(testList.listIterator());
    }

    public boolean supportsRemove() {
        return false;
    }

    public boolean supportsAdd() {
        return false;
    }

    public boolean supportsSet() {
        return false;
    }

    //-----------------------------------------------------------------------
    public void testListIterator() {
        assertTrue(makeEmptyListIterator() instanceof Unmodifiable);
    }

    public void testDecorateFactory() {
        ListIterator it = makeFullListIterator();
        assertSame(it, UnmodifiableListIterator.decorate(it));

        it = testList.listIterator();
        assertTrue(it != UnmodifiableListIterator.decorate(it));

        try {
            UnmodifiableListIterator.decorate(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

}
