import org.specs2.mutable._

class HelloWorldSpec extends Specification {

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      Main.greeting must have size(11)
    }
    "start with 'Hello'" in {
      Main.greeting must startWith("Hello")
    }
    "end with 'world'" in {
      Main.greeting must endWith("world")
    }
  }
}
