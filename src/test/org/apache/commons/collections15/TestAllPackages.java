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
package org.apache.commons.collections15;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Entry point for all Collections project tests.
 *
 * @author Matt Hall, John Watkinson, Stephen Colebourne
 * @version $Revision: 1.1 $ $Date: 2005/10/11 17:05:39 $
 */
public class TestAllPackages extends TestCase {
    public TestAllPackages(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(org.apache.commons.collections15.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.bag.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.bidimap.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.buffer.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.collection.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.comparators.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.iterators.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.keyvalue.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.list.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.map.TestAll.suite());
        suite.addTest(org.apache.commons.collections15.set.TestAll.suite());
        return suite;
    }

    public static void main(String args[]) {
        String[] testCaseName = {TestAllPackages.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

}
