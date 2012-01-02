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
package org.apache.commons.collections15.set;

import junit.framework.Test;
import org.apache.commons.collections15.BulkTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Extension of {@link AbstractTestSet} for exercising the
 * {@link UnmodifiableSet} implementation.
 *
 * @author Matt Hall, John Watkinson, Phil Steitz
 * @version $Revision: 1.1 $ $Date: 2005/10/11 19:11:58 $
 * @since Commons Collections 3.0
 */
public class TestUnmodifiableSet extends AbstractTestSet {

    public TestUnmodifiableSet(String testName) {
        super(testName);
    }

    public static Test suite() {
        return BulkTest.makeSuite(TestUnmodifiableSet.class);
    }

    public static void main(String args[]) {
        String[] testCaseName = {TestUnmodifiableSet.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    //-------------------------------------------------------------------
    public Set makeEmptySet() {
        return UnmodifiableSet.decorate(new HashSet());
    }

    public Set makeFullSet() {
        HashSet set = new HashSet();
        set.addAll(Arrays.asList(getFullElements()));
        return UnmodifiableSet.decorate(set);
    }

    public boolean isAddSupported() {
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
    //        writeExternalFormToDisk((java.io.Serializable) collection, "D:/dev/collections15/data/test/UnmodifiableSet.emptyCollection.version3.1.obj");
    //        resetFull();
    //        writeExternalFormToDisk((java.io.Serializable) collection, "D:/dev/collections15/data/test/UnmodifiableSet.fullCollection.version3.1.obj");
    //    }

}
