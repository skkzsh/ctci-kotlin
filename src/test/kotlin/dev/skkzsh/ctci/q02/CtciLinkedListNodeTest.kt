package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach
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

    @Test
    fun atBack() {
        assertEquals(104, n.atBack(0))
        assertEquals(103, n.atBack(1))
        assertEquals(102, n.atBack(2))
        assertEquals(101, n.atBack(3))
        assertEquals(100, n.atBack(4))
    }
}