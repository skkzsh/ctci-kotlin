package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Ctci0501LinkedListNodeTest {
    @Test
    fun 繰り上がりがない() {
        val m = Ctci0501LinkedListNode(7)
        m.append(1)
        m.append(6)
        // m.print() // debug

        val n = Ctci0501LinkedListNode(2)
        n.append(8)
        n.append(2)
        // n.print() // debug

        val a = m + n
        /// a.print() // debug

        assertEquals(3, a.length())
        assertEquals(9, a.at(0))
        assertEquals(9, a.at(1))
        assertEquals(8, a.at(2))
    }

    @Test
    fun 繰り上がりがある() {
        val m = Ctci0501LinkedListNode(7)
        m.append(1)
        m.append(6)
        // m.print() // debug

        val n = Ctci0501LinkedListNode(5)
        n.append(9)
        n.append(2)
        // n.print() // debug

        val a = m + n
        /// a.print() // debug

        assertEquals(3, a.length())
        assertEquals(2, a.at(0))
        assertEquals(1, a.at(1))
        assertEquals(9, a.at(2))
    }

    @Test
    fun 最後の桁が繰り上がる() {
        val m = Ctci0501LinkedListNode(7)
        m.append(1)
        m.append(6)
        // m.print() // debug

        val n = Ctci0501LinkedListNode(5)
        n.append(9)
        n.append(3)
        // n.print() // debug

        val a = m + n
        /// a.print() // debug

        assertEquals(4, a.length())
        assertEquals(2, a.at(0))
        assertEquals(1, a.at(1))
        assertEquals(0, a.at(2))
        assertEquals(1, a.at(3))
    }

    @Test
    fun 桁が違う() {
        val m = Ctci0501LinkedListNode(7)
        m.append(1)
        m.append(6)
        // m.print() // debug

        val n = Ctci0501LinkedListNode(5)
        n.append(9)
        // n.print() // debug

        val a = m + n
        /// a.print() // debug

        assertEquals(3, a.length())
        assertEquals(2, a.at(0))
        assertEquals(1, a.at(1))
        assertEquals(7, a.at(2))
    }
}