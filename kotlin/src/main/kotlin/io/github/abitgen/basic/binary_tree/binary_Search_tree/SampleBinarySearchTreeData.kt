package io.github.abitgen.basic.binary_tree.binary_Search_tree

import io.github.abitgen.basic.binary_tree.traversal.IntNode

class SampleBinarySearchTreeData {
}

/**
 *
 *                   8
 *                /     \
 *               7       14
 *             /  \     /   \
 *            4    -   12   16
 *           / \      / \   / \
 *          2   5    -  13  - 18
 */
val sampleValidBinarySearchTreeData =
    IntNode(8,
        IntNode(14,
            IntNode(16,
                IntNode(18)),
            IntNode(12,
                IntNode(13))
        ),
        IntNode(7,
            null,
            IntNode(4,
                IntNode(5),
                IntNode(2)
            )
        )
    )

val sampleInvalidBinarySearchTreeData =
    IntNode(8,
        IntNode(14,
            IntNode(11,
                IntNode(18)),
            IntNode(12,
                IntNode(13))
        ),
        IntNode(7,
            null,
            IntNode(4,
                IntNode(5),
                IntNode(2)
            )
        )
    )

val sampleInvalidBinarySearchTreeData2 =
    IntNode(8,
        IntNode(14,
            IntNode(15,
                IntNode(18)),
            IntNode(12,
                IntNode(13))
        ),
        IntNode(7,
            null,
            null)
    )