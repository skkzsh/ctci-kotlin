package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class CtciLinkedListNodeTest {
    private val n = CtciLinkedListNode(100)

    @BeforeEach
    fun setUp() {
        n.append(101)
        n.append(102)
        n.append(103)
        n.append(104)

        // n.print() // debug
    }

    @ParameterizedTest
    @CsvSource(
        "104, 0",
        "103, 1",
        "102, 2",
        "101, 3",
        "100, 4",
    )
    fun atBack(expected: Int, num: Int) {
        assertEquals(expected, n.atBack(num))
    }

    @ParameterizedTest
    @CsvSource(
        "104, 0",
        "103, 1",
        "102, 2",
        "101, 3",
        "100, 4",
    )
    fun atBackRecursively(expected: Int, num: Int) {
        assertEquals(expected, n.atBackRecursively(num))
    }
}
