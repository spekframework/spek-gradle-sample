import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

class SampleSpec : Spek({
    given("some context") {
        on("executing some action") {
            it("should pass") {
                assertEquals(2, 2)
            }
        }
    }

})