package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

class LinkedListNode02Test {
    private val n = LinkedListNode02(100)

    @Test
    fun deleteDups() {
        n.append(101)
        n.append(100)
        n.append(102)

        // n.print() // debug
        n.deleteDups()

        n.print() // debug
        assertEquals(3, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
    }

    @Ignore
    @Test
    fun deleteDups_last() {
        n.append(101)
        n.append(102)
        n.append(100)

        // n.print() // debug
        n.deleteDups()

        n.print() // debug
        assertEquals(3, n.length())
        assertEquals(100, n.at(0))
        assertEquals(101, n.at(1))
        assertEquals(102, n.at(2))
    }
}
