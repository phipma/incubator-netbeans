<!--

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

-->

This is an extension for VS Code. Based on "lsp-sample" from:
https://github.com/microsoft/vscode-extension-samples

# Building

To build the VS Code extension do:
 * cd java/java.lsp.server
 * ant build-vscode-ext

The resulting extension is then in the build directory, with the vsix extension.

#Building for Development

If you want to develop the extension, use these steps for building instead:
 * cd java/java.lsp.server
 * ant build-lsp-server
 * cd vscode
 * npm install
 * npm run compile
