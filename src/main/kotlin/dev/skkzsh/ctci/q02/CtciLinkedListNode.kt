package dev.skkzsh.ctci.q02

import dev.skkzsh.dsa.linkedlist.TailLinkedListNode

class CtciLinkedListNode(value: Int) : TailLinkedListNode(value) {
    fun atBack(num: Int): Int {
        return at(length - num - 1)
    }

    fun atBackRecursively(num: Int): Int {
        return atBackRecursively(num, this).second!!
    }

    private fun atBackRecursively(num: Int, head: TailLinkedListNode?): Pair<Int, Int?> {
        if (head == null) {
            return Pair(-1, null)
        }

        val next = atBackRecursively(num, head.next)
        val index = next.first + 1

        if (index == num) {
            return Pair(index, head.value)
        }
        return Pair(index, next.second)
    }

    fun atBackByRunner(num: Int): Int {
        var p: TailLinkedListNode = this
        for (i in 0 until num) {
            p = p.next!!
        }

        var a: TailLinkedListNode = this
        while (p.next != null) {
            p = p.next!!
            a = a.next!!
        }

        return a.value
    }
}
