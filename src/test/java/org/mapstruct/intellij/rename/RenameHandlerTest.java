/*
 *  Copyright 2017 the MapStruct authors (http://www.mapstruct.org/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
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
package org.mapstruct.intellij.rename;

import org.mapstruct.intellij.MapstructBaseCompletionTestCase;

/**
 * @author Filip Hrisafov
 */
public class RenameHandlerTest extends MapstructBaseCompletionTestCase {

    @Override
    protected String getTestDataPath() {
        return "testData/rename";
    }

    public void testRenameSourceParameter() {
        myFixture.configureByFile( "RenameSourceParameter.java" );
        myFixture.renameElementAtCaretUsingHandler( "getAnotherName" );
        myFixture.checkResultByFile( "RenameSourceParameterAfter.java" );
    }

    public void testRenameMethodSourceParameter() {
        myFixture.configureByFile( "RenameSourceParameterForMethod.java" );
        myFixture.renameElementAtCaret( "param" );
        myFixture.checkResultByFile( "RenameSourceParameterForMethodAfter.java" );
    }

    public void testRenameTargetParameter() {
        myFixture.configureByFile( "RenameTargetParameter.java" );
        myFixture.renameElementAtCaretUsingHandler( "setNewName" );
        myFixture.checkResultByFile( "RenameTargetParameterAfter.java" );
    }

    public void testRenameMethodTargetParameter() {
        myFixture.configureByFile( "RenameTargetParameterForMethod.java" );
        myFixture.renameElementAtCaret( "newTarget" );
        myFixture.checkResultByFile( "RenameTargetParameterForMethodAfter.java" );
    }
}
