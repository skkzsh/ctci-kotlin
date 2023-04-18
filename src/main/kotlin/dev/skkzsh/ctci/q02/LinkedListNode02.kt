package dev.skkzsh.ctci.q02

import dev.skkzsh.dsa.linkedlist.TailLinkedListNode

class LinkedListNode02(value: Int) : TailLinkedListNode(value) {

    fun deleteDups() {
        val set: MutableSet<Int> = mutableSetOf()

        var n: TailLinkedListNode = this
        set.add(n.value)
//        println(set)

        // FIXME: 境界値 (last)
        while (n.next != null) {
            println(set)
            if (set.contains(n.next!!.value)) {
                n.next = n.next!!.next
                length--
            } else {
                set.add(n.next!!.value)
            }
            n = n.next!!
        }
    }
}
