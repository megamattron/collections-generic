/*
 *  Copyright 2003-2004 The Apache Software Foundation
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
package org.apache.commons.collections15.bag;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Entry point for tests.
 *
 * @author Matt Hall, John Watkinson, Stephen Colebourne
 * @version $Revision: 1.1 $ $Date: 2005/10/11 17:05:44 $
 * @since Commons Collections 3.0
 */
public class TestAll extends TestCase {

    public TestAll(String testName) {
        super(testName);
    }

    public static void main(String args[]) {
        String[] testCaseName = {TestAll.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTest(TestHashBag.suite());
        suite.addTest(TestPredicatedBag.suite());
        suite.addTest(TestPredicatedSortedBag.suite());
        suite.addTest(TestTransformedBag.suite());
        suite.addTest(TestTransformedSortedBag.suite());
        suite.addTest(TestTreeBag.suite());
        suite.addTest(TestTypedBag.suite());
        suite.addTest(TestTypedSortedBag.suite());

        return suite;
    }

}
