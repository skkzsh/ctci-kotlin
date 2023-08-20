package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Ctci03LinkedListNodeTest {
    private val n = Ctci03LinkedListNode(100)

    @BeforeEach
    fun setUp() {
        n.append(101)
        n.append(102)
        n.append(103)
        n.append(104)

        // n.print() // debug
    }

    @Test
    fun deleteMid() {
        n.deleteMid(103)
        // n.print() // debug

        assertEquals(4, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
        assertEquals(104, n.at(3))
    }

}