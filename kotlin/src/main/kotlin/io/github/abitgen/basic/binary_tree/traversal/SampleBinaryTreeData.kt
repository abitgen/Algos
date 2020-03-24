package io.github.abitgen.basic.binary_tree.traversal

import io.github.abitgen.basic.binary_tree.BinaryNode

typealias CharNode = BinaryNode<Char>
typealias IntNode = BinaryNode<Int>


/**
 * rotate the code rootNode to 90 deg to get a below tree diagram.
 * Each indentation refers to each increasing level.
 * rightNode is the second parameter, leftNode is the last one, to get the tree as shown.
 *
 *                   A
 *                /    \
 *               E      B
 *              / \    / \
 *             -  F   D  C
 *               / \
 *              J  G
 *                / \
 *               I  H
 */
val sampleBinaryTreeCharData =
    CharNode(
        'A',
        CharNode(
            'B',
            CharNode('C'),
            CharNode('D')),
        CharNode(
            'E',
            CharNode(
                'F',
                CharNode('G',
                    CharNode('H'),
                    CharNode('I')),
                CharNode('J'))))


val sampleBinaryTreeIntData = IntNode(
    0,
    IntNode(
        1,
        IntNode(3),
        IntNode(99)),
    IntNode(
        2,
        IntNode(
            4,
            IntNode(5),
            IntNode(6)))
)
