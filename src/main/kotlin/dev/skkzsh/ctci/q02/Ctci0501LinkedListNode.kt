package dev.skkzsh.ctci.q02

import dev.skkzsh.dsa.linkedlist.TailLinkedListNode

class Ctci0501LinkedListNode(value: Int) : TailLinkedListNode(value) {
    operator fun plus(other: TailLinkedListNode): TailLinkedListNode {
        var m: TailLinkedListNode = this
        var n: TailLinkedListNode = other

        val one = m.value + n.value
        val a = Ctci0501LinkedListNode(one % 10)
        var carry = one / 10

        while (m.next != null || n.next != null || carry > 0) {
            val sum = (m.next?.value ?: 0) + (n.next?.value ?: 0) + carry
            carry = sum / 10
            a.append(sum % 10)

            if (m.next != null) {
                m = m.next!!
            }
            if (n.next != null) {
                n = n.next!!
            }
        }

        return a
    }
}
