/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.php.phpunit.util;

import java.io.File;
import org.netbeans.api.annotations.common.CheckForNull;
import org.netbeans.modules.php.api.executable.PhpExecutableValidator;
import org.openide.util.NbBundle;

public final class PhpUnitUtils {

    public static final File TMP_DIR = new File(System.getProperty("java.io.tmpdir")); // NOI18N


    private PhpUnitUtils() {
    }

    @NbBundle.Messages("PhpUnitUtils.phpunit.label=PHPUnit file")
    @CheckForNull
    public static String validatePhpUnitPath(String phpUnitPath) {
        return PhpExecutableValidator.validateCommand(phpUnitPath, Bundle.PhpUnitUtils_phpunit_label());
    }

}
