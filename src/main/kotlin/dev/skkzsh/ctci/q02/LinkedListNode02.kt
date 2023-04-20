package dev.skkzsh.ctci.q02

import dev.skkzsh.dsa.linkedlist.TailDoublyLinkedListNode

class LinkedListNode02(value: Int) : TailDoublyLinkedListNode(value) {

    fun deleteDupsHash() {
        val set: MutableSet<Int> = mutableSetOf()

        var n: TailDoublyLinkedListNode? = this

        while (n != null) {
            if (set.contains(n.value)) {
                delete(n)
            } else {
                set.add(n.value)
            }
            // println(set) // debug
            n = n.next
        }
    }

    fun deleteDups() {
        var n: TailDoublyLinkedListNode? = this

        while (n != null) {
            var m: TailDoublyLinkedListNode? = n.next
            while (m != null) {
                if (m.value == n.value) {
                    delete(m)
                }
                m = m.next
            }
            n = n.next
        }
    }
}
