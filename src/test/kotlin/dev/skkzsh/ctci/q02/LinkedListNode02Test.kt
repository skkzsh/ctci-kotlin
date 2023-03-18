package dev.skkzsh.ctci.q02

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LinkedListNode02Test {
    private val n = LinkedListNode02(100)

    @BeforeEach
    fun setUp() {
        n.append(101)
        n.append(102)
        n.append(100)
    }

    @Test
    fun deleteDups() {
        n.deleteDups()
        assertEquals(101, n.at(0))
        assertEquals(102, n.at(1))
    }
}
