package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class Ctci03LinkedListNodeTest {
    private val n = Ctci03LinkedListNode(100)

    @BeforeEach
    fun setUp() {
        n.append(101)
        n.append(102)
        n.append(103)

        // n.print() // debug
    }

    @Test
    fun deleteMid() {
        n.deleteMid(102)
        // n.print() // debug

        assertEquals(3, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(103, n.at(2))
    }

    @Test
    fun deleteMid_Last() {
        n.deleteMid(103)
        // n.print() // debug

        assertEquals(3, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
    }

    @Test
    fun deleteMid_NotExist() {
        assertThrows<NullPointerException> {
            n.deleteMid(99)
        }

        // n.print() // debug

        assertEquals(4, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
        assertEquals(103, n.at(3))
    }
}