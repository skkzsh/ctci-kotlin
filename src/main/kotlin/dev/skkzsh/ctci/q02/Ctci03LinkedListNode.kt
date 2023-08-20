package dev.skkzsh.ctci.q02

import dev.skkzsh.dsa.linkedlist.TailLinkedListNode

class Ctci03LinkedListNode(value: Int) : TailLinkedListNode(value) {
    fun deleteMid(num: Int) {
        var n: TailLinkedListNode = this

        while (n.next != null) {
            if (n.next!!.value == num) {
                break
            }
            n = n.next!!
        }
        n.next = n.next!!.next

        length--
    }
}
