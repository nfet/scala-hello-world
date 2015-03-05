import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class ExampleSuite extends FunSuite {


  test("pop is invoked on a non-empty stack") {

    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    val oldSize = stack.size
    val result = stack.pop()
    assert(result === 2)
    assert(stack.size === oldSize - 1)
  }

  test("pop is invoked on an empty stack") {

    val emptyStack = new mutable.Stack[Int]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }


}
