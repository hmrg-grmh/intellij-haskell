/*
 * Copyright 2014-2020 Rik van der Kleij
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package intellij.haskell.external.execution

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.{BeforeAndAfterEach, GivenWhenThen}

class HaskellCompilationResultHelperSpec extends AnyFunSpec with Matchers with GivenWhenThen with BeforeAndAfterEach {

  describe("LoadComponent") {
    it("should parse `:load` output") {
      Given("output load")
      val output = "/file/path/HaskellFile.hs:1:11:parse error on input     and so on"

      When("parsed to problem")
      val problem = HaskellCompilationResultHelper.parseErrorLine(output).get

      Then("it should contain right data")
      problem.lineNr should equal(1)
      problem.columnNr should equal(11)
      problem.plainMessage should equal(s"parse error on input and so on")
    }
  }
}
