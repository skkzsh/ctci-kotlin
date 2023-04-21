package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CtciDoublyLinkedListNodeTest {
    private val n = CtciDoublyLinkedListNode(100)

    @BeforeEach
    fun setUp() {
        n.append(CtciDoublyLinkedListNode(101))
        n.append(CtciDoublyLinkedListNode(101))
        n.append(CtciDoublyLinkedListNode(102))
        n.append(CtciDoublyLinkedListNode(100))

        // n.print() // debug
    }

    @Test
    fun deleteDupsWithHash() {
        n.deleteDupsWithHash()

        // n.print() // debug
        assertEquals(3, n.length())
        assertEquals(100, n.at(0).value)
        assertEquals(101, n.at(1).value)
        assertEquals(102, n.at(2).value)
    }

    @Test
    fun deleteDups() {
        n.deleteDups()

        // n.print() // debug
        assertEquals(3, n.length())
        assertEquals(100, n.at(0).value)
        assertEquals(101, n.at(1).value)
        assertEquals(102, n.at(2).value)
    }
}
