package dev.skkzsh.ctci.q02

import dev.skkzsh.dsa.linkedlist.TailLinkedListNode

class CtciLinkedListNode(value: Int) : TailLinkedListNode(value) {
    fun atBack(num: Int): Int {
        return at(length - num - 1)
    }
}
