package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

class LinkedListNode02Test {
    private val n = LinkedListNode02(100)

    @Test
    fun deleteDups() {
        n.append(LinkedListNode02(101))
        n.append(LinkedListNode02(100))
        n.append(LinkedListNode02(102))

        // n.print() // debug
        n.deleteDups()

        // n.print() // debug
        assertEquals(3, n.length())
        assertEquals(100, n.at(0).value)
        assertEquals(101, n.at(1).value)
        assertEquals(102, n.at(2).value)
    }

    @Test
    fun deleteDups_last() {
        n.append(LinkedListNode02(101))
        n.append(LinkedListNode02(102))
        n.append(LinkedListNode02(100))

        // n.print() // debug
        n.deleteDups()

        // n.print() // debug
        assertEquals(3, n.length())
        assertEquals(100, n.at(0).value)
        assertEquals(101, n.at(1).value)
        assertEquals(102, n.at(2).value)
    }
}
