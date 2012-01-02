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
package org.apache.commons.collections15.map;

import junit.framework.Test;
import junit.framework.TestSuite;

import java.util.HashMap;
import java.util.Map;

/**
 * Extension of {@link AbstractTestMap} for exercising the {@link FixedSizeMap}
 * implementation.
 *
 * @author Matt Hall, John Watkinson, Stephen Colebourne
 * @version $Revision: 1.1 $ $Date: 2005/10/11 19:11:58 $
 * @since Commons Collections 3.0
 */
public class TestFixedSizeMap extends AbstractTestMap {

    public TestFixedSizeMap(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestFixedSizeMap.class);
    }

    public static void main(String args[]) {
        String[] testCaseName = {TestFixedSizeMap.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    public Map makeEmptyMap() {
        return FixedSizeMap.decorate(new HashMap());
    }

    public Map makeFullMap() {
        Map map = new HashMap();
        addSampleMappings(map);
        return FixedSizeMap.decorate(map);
    }

    public boolean isPutAddSupported() {
        return false;
    }

    public boolean isRemoveSupported() {
        return false;
    }

    public String getCompatibilityVersion() {
        return "3.1";
    }

    //    public void testCreate() throws Exception {
    //        resetEmpty();
    //        writeExternalFormToDisk(
    //            (java.io.Serializable) map,
    //            "D:/dev/collections15/data/test/FixedSizeMap.emptyCollection.version3.1.obj");
    //        resetFull();
    //        writeExternalFormToDisk(
    //            (java.io.Serializable) map,
    //            "D:/dev/collections15/data/test/FixedSizeMap.fullCollection.version3.1.obj");
    //    }
}
