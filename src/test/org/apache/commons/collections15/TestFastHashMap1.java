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

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections15.map.FastHashMap;

/**
 * Test FastHashMap in <strong>fast</strong> mode.
 *
 * @author Matt Hall, John Watkinson, Jason van Zyl
 * @version $Revision: 1.1 $ $Date: 2005/10/11 17:05:39 $
 */
public class TestFastHashMap1 extends TestFastHashMap {

    public TestFastHashMap1(String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(TestFastHashMap1.class);
    }

    public static void main(String args[]) {
        String[] testCaseName = {TestFastHashMap1.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    public Map makeEmptyMap() {
        FastHashMap fhm = new FastHashMap();
        fhm.setFast(true);
        return (fhm);
    }

    public void setUp() {
        map = (HashMap) makeEmptyMap();
    }

}
