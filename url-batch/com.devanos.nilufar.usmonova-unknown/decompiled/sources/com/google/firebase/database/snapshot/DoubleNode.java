package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import o.AbstractC1888sN;

/* loaded from: classes.dex */
public class DoubleNode extends LeafNode<DoubleNode> {
    private final Double value;

    public DoubleNode(Double d, Node node) {
        super(node);
        this.value = d;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public boolean equals(Object obj) {
        if (!(obj instanceof DoubleNode)) {
            return false;
        }
        DoubleNode doubleNode = (DoubleNode) obj;
        return this.value.equals(doubleNode.value) && this.priority.equals(doubleNode.priority);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHashRepresentation(Node.HashVersion hashVersion) {
        return AbstractC1888sN.j(getPriorityHash(hashVersion), "number:") + Utilities.doubleToHashString(this.value.doubleValue());
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType getLeafType() {
        return LeafNode.LeafType.Number;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue() {
        return this.value;
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int hashCode() {
        return this.priority.hashCode() + this.value.hashCode();
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int compareLeafValues(DoubleNode doubleNode) {
        return this.value.compareTo(doubleNode.value);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public DoubleNode updatePriority(Node node) {
        Utilities.hardAssert(PriorityUtilities.isValidPriority(node));
        return new DoubleNode(this.value, node);
    }
}
