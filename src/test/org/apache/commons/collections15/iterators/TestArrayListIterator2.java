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

import java.util.Iterator;

/**
 * Test the ArrayListIterator class with primitives.
 *
 * @author Matt Hall, John Watkinson, Neil O'Toole
 * @version $Revision: 1.1 $ $Date: 2005/10/11 19:11:58 $
 */
public class TestArrayListIterator2 extends TestArrayIterator2 {

    public TestArrayListIterator2(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestArrayListIterator2.class);
    }

    public Iterator makeEmptyIterator() {
        return new ArrayListIterator(new int[0]);
    }

    public Iterator makeFullIterator() {
        return new ArrayListIterator(testArray);
    }

    public ArrayIterator makeArrayIterator() {
        return (ArrayIterator) makeEmptyIterator();
    }

    public ArrayIterator makeArrayIterator(Object array) {
        return new ArrayListIterator(array);
    }

    public ArrayIterator makeArrayIterator(Object array, int index) {
        return new ArrayListIterator(array, index);
    }

    public ArrayIterator makeArrayIterator(Object array, int start, int end) {
        return new ArrayListIterator(array, start, end);
    }

}
