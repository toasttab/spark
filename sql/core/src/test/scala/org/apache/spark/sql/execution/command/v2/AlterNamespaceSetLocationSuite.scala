/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.execution.command.v2

import org.apache.spark.sql.execution.command

/**
 * The class contains tests for the `ALTER NAMESPACE ... SET LOCATION` command to check V2 table
 * catalogs.
 */
class AlterNamespaceSetLocationSuite extends command.AlterNamespaceSetLocationSuiteBase
    with CommandSuiteBase {
  override def namespace: String = "ns1.ns2"
  override def notFoundMsgPrefix: String = "Namespace"

  test("basic test") {
    runBasicTest()
  }
}
