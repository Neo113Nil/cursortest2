package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import o.AbstractC1888sN;

/* loaded from: classes.dex */
public class LongNode extends LeafNode<LongNode> {
    private final long value;

    public LongNode(Long l, Node node) {
        super(node);
        this.value = l.longValue();
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public boolean equals(Object obj) {
        if (!(obj instanceof LongNode)) {
            return false;
        }
        LongNode longNode = (LongNode) obj;
        return this.value == longNode.value && this.priority.equals(longNode.priority);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String getHashRepresentation(Node.HashVersion hashVersion) {
        return AbstractC1888sN.j(getPriorityHash(hashVersion), "number:") + Utilities.doubleToHashString(this.value);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType getLeafType() {
        return LeafNode.LeafType.Number;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object getValue() {
        return Long.valueOf(this.value);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int hashCode() {
        long j = this.value;
        return this.priority.hashCode() + ((int) (j ^ (j >>> 32)));
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public int compareLeafValues(LongNode longNode) {
        return Utilities.compareLongs(this.value, longNode.value);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public LongNode updatePriority(Node node) {
        return new LongNode(Long.valueOf(this.value), node);
    }
}
