package com.google.firebase.database.core.view;

import com.google.firebase.database.core.CompoundWrite;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.WriteTreeRef;
import com.google.firebase.database.core.operation.AckUserWrite;
import com.google.firebase.database.core.operation.Merge;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.operation.Overwrite;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.filter.ChildChangeAccumulator;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.ChildrenNode;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.KeyIndex;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ViewProcessor {
    private static NodeFilter.CompleteChildSource NO_COMPLETE_SOURCE = new NodeFilter.CompleteChildSource() { // from class: com.google.firebase.database.core.view.ViewProcessor.1
        @Override // com.google.firebase.database.core.view.filter.NodeFilter.CompleteChildSource
        public NamedNode getChildAfterChild(Index index, NamedNode namedNode, boolean z) {
            return null;
        }

        @Override // com.google.firebase.database.core.view.filter.NodeFilter.CompleteChildSource
        public Node getCompleteChild(ChildKey childKey) {
            return null;
        }
    };
    private final NodeFilter filter;

    /* renamed from: com.google.firebase.database.core.view.ViewProcessor$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$core$operation$Operation$OperationType;

        static {
            int[] iArr = new int[Operation.OperationType.values().length];
            $SwitchMap$com$google$firebase$database$core$operation$Operation$OperationType = iArr;
            try {
                iArr[Operation.OperationType.Overwrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$database$core$operation$Operation$OperationType[Operation.OperationType.Merge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$database$core$operation$Operation$OperationType[Operation.OperationType.AckUserWrite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$database$core$operation$Operation$OperationType[Operation.OperationType.ListenComplete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class ProcessorResult {
        public final List<Change> changes;
        public final ViewCache viewCache;

        public ProcessorResult(ViewCache viewCache, List<Change> list) {
            this.viewCache = viewCache;
            this.changes = list;
        }
    }

    public static class WriteTreeCompleteChildSource implements NodeFilter.CompleteChildSource {
        private final Node optCompleteServerCache;
        private final ViewCache viewCache;
        private final WriteTreeRef writes;

        public WriteTreeCompleteChildSource(WriteTreeRef writeTreeRef, ViewCache viewCache, Node node) {
            this.writes = writeTreeRef;
            this.viewCache = viewCache;
            this.optCompleteServerCache = node;
        }

        @Override // com.google.firebase.database.core.view.filter.NodeFilter.CompleteChildSource
        public NamedNode getChildAfterChild(Index index, NamedNode namedNode, boolean z) {
            Node node = this.optCompleteServerCache;
            if (node == null) {
                node = this.viewCache.getCompleteServerSnap();
            }
            return this.writes.calcNextNodeAfterPost(node, namedNode, z, index);
        }

        @Override // com.google.firebase.database.core.view.filter.NodeFilter.CompleteChildSource
        public Node getCompleteChild(ChildKey childKey) {
            CacheNode eventCache = this.viewCache.getEventCache();
            if (eventCache.isCompleteForChild(childKey)) {
                return eventCache.getNode().getImmediateChild(childKey);
            }
            Node node = this.optCompleteServerCache;
            return this.writes.calcCompleteChild(childKey, node != null ? new CacheNode(IndexedNode.from(node, KeyIndex.getInstance()), true, false) : this.viewCache.getServerCache());
        }
    }

    public ViewProcessor(NodeFilter nodeFilter) {
        this.filter = nodeFilter;
    }

    private ViewCache ackUserWrite(ViewCache viewCache, Path path, ImmutableTree<Boolean> immutableTree, WriteTreeRef writeTreeRef, Node node, ChildChangeAccumulator childChangeAccumulator) {
        Path key;
        Path child;
        if (writeTreeRef.shadowingWrite(path) != null) {
            return viewCache;
        }
        boolean isFiltered = viewCache.getServerCache().isFiltered();
        CacheNode serverCache = viewCache.getServerCache();
        if (immutableTree.getValue() != null) {
            if ((path.isEmpty() && serverCache.isFullyInitialized()) || serverCache.isCompleteForPath(path)) {
                return applyServerOverwrite(viewCache, path, serverCache.getNode().getChild(path), writeTreeRef, node, isFiltered, childChangeAccumulator);
            }
            if (!path.isEmpty()) {
                return viewCache;
            }
            CompoundWrite emptyWrite = CompoundWrite.emptyWrite();
            CompoundWrite compoundWrite = emptyWrite;
            for (NamedNode namedNode : serverCache.getNode()) {
                compoundWrite = compoundWrite.addWrite(namedNode.getName(), namedNode.getNode());
            }
            return applyServerMerge(viewCache, path, compoundWrite, writeTreeRef, node, isFiltered, childChangeAccumulator);
        }
        CompoundWrite emptyWrite2 = CompoundWrite.emptyWrite();
        Iterator<Map.Entry<Path, Boolean>> it = immutableTree.iterator();
        while (true) {
            CompoundWrite compoundWrite2 = emptyWrite2;
            while (it.hasNext()) {
                key = it.next().getKey();
                child = path.child(key);
                if (serverCache.isCompleteForPath(child)) {
                    break;
                }
            }
            return applyServerMerge(viewCache, path, compoundWrite2, writeTreeRef, node, isFiltered, childChangeAccumulator);
            emptyWrite2 = compoundWrite2.addWrite(key, serverCache.getNode().getChild(child));
        }
    }

    private ViewCache applyServerMerge(ViewCache viewCache, Path path, CompoundWrite compoundWrite, WriteTreeRef writeTreeRef, Node node, boolean z, ChildChangeAccumulator childChangeAccumulator) {
        if (viewCache.getServerCache().getNode().isEmpty() && !viewCache.getServerCache().isFullyInitialized()) {
            return viewCache;
        }
        Utilities.hardAssert(compoundWrite.rootWrite() == null, "Can't have a merge that is an overwrite");
        CompoundWrite addWrites = path.isEmpty() ? compoundWrite : CompoundWrite.emptyWrite().addWrites(path, compoundWrite);
        Node node2 = viewCache.getServerCache().getNode();
        Map<ChildKey, CompoundWrite> childCompoundWrites = addWrites.childCompoundWrites();
        ViewCache viewCache2 = viewCache;
        for (Map.Entry<ChildKey, CompoundWrite> entry : childCompoundWrites.entrySet()) {
            ChildKey key = entry.getKey();
            if (node2.hasChild(key)) {
                viewCache2 = applyServerOverwrite(viewCache2, new Path(key), entry.getValue().apply(node2.getImmediateChild(key)), writeTreeRef, node, z, childChangeAccumulator);
            }
        }
        ViewCache viewCache3 = viewCache2;
        for (Map.Entry<ChildKey, CompoundWrite> entry2 : childCompoundWrites.entrySet()) {
            ChildKey key2 = entry2.getKey();
            boolean z2 = !viewCache.getServerCache().isCompleteForChild(key2) && entry2.getValue().rootWrite() == null;
            if (!node2.hasChild(key2) && !z2) {
                viewCache3 = applyServerOverwrite(viewCache3, new Path(key2), entry2.getValue().apply(node2.getImmediateChild(key2)), writeTreeRef, node, z, childChangeAccumulator);
            }
        }
        return viewCache3;
    }

    private ViewCache applyServerOverwrite(ViewCache viewCache, Path path, Node node, WriteTreeRef writeTreeRef, Node node2, boolean z, ChildChangeAccumulator childChangeAccumulator) {
        IndexedNode updatePriority;
        CacheNode serverCache = viewCache.getServerCache();
        NodeFilter nodeFilter = this.filter;
        if (!z) {
            nodeFilter = nodeFilter.getIndexedFilter();
        }
        NodeFilter nodeFilter2 = nodeFilter;
        boolean z2 = true;
        if (path.isEmpty()) {
            updatePriority = nodeFilter2.updateFullNode(serverCache.getIndexedNode(), IndexedNode.from(node, nodeFilter2.getIndex()), null);
        } else if (!nodeFilter2.filtersNodes() || serverCache.isFiltered()) {
            ChildKey front = path.getFront();
            if (!serverCache.isCompleteForPath(path) && path.size() > 1) {
                return viewCache;
            }
            Path popFront = path.popFront();
            Node updateChild = serverCache.getNode().getImmediateChild(front).updateChild(popFront, node);
            updatePriority = front.isPriorityChildName() ? nodeFilter2.updatePriority(serverCache.getIndexedNode(), updateChild) : nodeFilter2.updateChild(serverCache.getIndexedNode(), front, updateChild, popFront, NO_COMPLETE_SOURCE, null);
        } else {
            Utilities.hardAssert(!path.isEmpty(), "An empty path should have been caught in the other branch");
            ChildKey front2 = path.getFront();
            updatePriority = nodeFilter2.updateFullNode(serverCache.getIndexedNode(), serverCache.getIndexedNode().updateChild(front2, serverCache.getNode().getImmediateChild(front2).updateChild(path.popFront(), node)), null);
        }
        if (!serverCache.isFullyInitialized() && !path.isEmpty()) {
            z2 = false;
        }
        ViewCache updateServerSnap = viewCache.updateServerSnap(updatePriority, z2, nodeFilter2.filtersNodes());
        return generateEventCacheAfterServerEvent(updateServerSnap, path, writeTreeRef, new WriteTreeCompleteChildSource(writeTreeRef, updateServerSnap, node2), childChangeAccumulator);
    }

    private ViewCache applyUserMerge(ViewCache viewCache, Path path, CompoundWrite compoundWrite, WriteTreeRef writeTreeRef, Node node, ChildChangeAccumulator childChangeAccumulator) {
        Utilities.hardAssert(compoundWrite.rootWrite() == null, "Can't have a merge that is an overwrite");
        Iterator<Map.Entry<Path, Node>> it = compoundWrite.iterator();
        ViewCache viewCache2 = viewCache;
        while (it.hasNext()) {
            Map.Entry<Path, Node> next = it.next();
            Path child = path.child(next.getKey());
            if (cacheHasChild(viewCache, child.getFront())) {
                viewCache2 = applyUserOverwrite(viewCache2, child, next.getValue(), writeTreeRef, node, childChangeAccumulator);
            }
        }
        Iterator<Map.Entry<Path, Node>> it2 = compoundWrite.iterator();
        ViewCache viewCache3 = viewCache2;
        while (it2.hasNext()) {
            Map.Entry<Path, Node> next2 = it2.next();
            Path child2 = path.child(next2.getKey());
            if (!cacheHasChild(viewCache, child2.getFront())) {
                viewCache3 = applyUserOverwrite(viewCache3, child2, next2.getValue(), writeTreeRef, node, childChangeAccumulator);
            }
        }
        return viewCache3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ViewCache applyUserOverwrite(ViewCache viewCache, Path path, Node node, WriteTreeRef writeTreeRef, Node node2, ChildChangeAccumulator childChangeAccumulator) {
        Node node3;
        CacheNode eventCache = viewCache.getEventCache();
        WriteTreeCompleteChildSource writeTreeCompleteChildSource = new WriteTreeCompleteChildSource(writeTreeRef, viewCache, node2);
        if (path.isEmpty()) {
            return viewCache.updateEventSnap(this.filter.updateFullNode(viewCache.getEventCache().getIndexedNode(), IndexedNode.from(node, this.filter.getIndex()), childChangeAccumulator), true, this.filter.filtersNodes());
        }
        ChildKey front = path.getFront();
        if (front.isPriorityChildName()) {
            return viewCache.updateEventSnap(this.filter.updatePriority(viewCache.getEventCache().getIndexedNode(), node), eventCache.isFullyInitialized(), eventCache.isFiltered());
        }
        Path popFront = path.popFront();
        Node immediateChild = eventCache.getNode().getImmediateChild(front);
        if (!popFront.isEmpty()) {
            Node completeChild = writeTreeCompleteChildSource.getCompleteChild(front);
            if (completeChild == null) {
                node = EmptyNode.Empty();
            } else {
                if (popFront.getBack().isPriorityChildName() && completeChild.getChild(popFront.getParent()).isEmpty()) {
                    node3 = completeChild;
                    return immediateChild.equals(node3) ? viewCache.updateEventSnap(this.filter.updateChild(eventCache.getIndexedNode(), front, node3, popFront, writeTreeCompleteChildSource, childChangeAccumulator), eventCache.isFullyInitialized(), this.filter.filtersNodes()) : viewCache;
                }
                node = completeChild.updateChild(popFront, node);
            }
        }
        node3 = node;
        if (immediateChild.equals(node3)) {
        }
    }

    private static boolean cacheHasChild(ViewCache viewCache, ChildKey childKey) {
        return viewCache.getEventCache().isCompleteForChild(childKey);
    }

    private ViewCache generateEventCacheAfterServerEvent(ViewCache viewCache, Path path, WriteTreeRef writeTreeRef, NodeFilter.CompleteChildSource completeChildSource, ChildChangeAccumulator childChangeAccumulator) {
        Node calcCompleteChild;
        IndexedNode updateChild;
        Node calcCompleteEventCache;
        CacheNode eventCache = viewCache.getEventCache();
        if (writeTreeRef.shadowingWrite(path) != null) {
            return viewCache;
        }
        if (path.isEmpty()) {
            Utilities.hardAssert(viewCache.getServerCache().isFullyInitialized(), "If change path is empty, we must have complete server data");
            if (viewCache.getServerCache().isFiltered()) {
                Node completeServerSnap = viewCache.getCompleteServerSnap();
                if (!(completeServerSnap instanceof ChildrenNode)) {
                    completeServerSnap = EmptyNode.Empty();
                }
                calcCompleteEventCache = writeTreeRef.calcCompleteEventChildren(completeServerSnap);
            } else {
                calcCompleteEventCache = writeTreeRef.calcCompleteEventCache(viewCache.getCompleteServerSnap());
            }
            updateChild = this.filter.updateFullNode(viewCache.getEventCache().getIndexedNode(), IndexedNode.from(calcCompleteEventCache, this.filter.getIndex()), childChangeAccumulator);
        } else {
            ChildKey front = path.getFront();
            if (front.isPriorityChildName()) {
                Utilities.hardAssert(path.size() == 1, "Can't have a priority with additional path components");
                Node calcEventCacheAfterServerOverwrite = writeTreeRef.calcEventCacheAfterServerOverwrite(path, eventCache.getNode(), viewCache.getServerCache().getNode());
                updateChild = calcEventCacheAfterServerOverwrite != null ? this.filter.updatePriority(eventCache.getIndexedNode(), calcEventCacheAfterServerOverwrite) : eventCache.getIndexedNode();
            } else {
                Path popFront = path.popFront();
                if (eventCache.isCompleteForChild(front)) {
                    Node calcEventCacheAfterServerOverwrite2 = writeTreeRef.calcEventCacheAfterServerOverwrite(path, eventCache.getNode(), viewCache.getServerCache().getNode());
                    calcCompleteChild = calcEventCacheAfterServerOverwrite2 != null ? eventCache.getNode().getImmediateChild(front).updateChild(popFront, calcEventCacheAfterServerOverwrite2) : eventCache.getNode().getImmediateChild(front);
                } else {
                    calcCompleteChild = writeTreeRef.calcCompleteChild(front, viewCache.getServerCache());
                }
                Node node = calcCompleteChild;
                updateChild = node != null ? this.filter.updateChild(eventCache.getIndexedNode(), front, node, popFront, completeChildSource, childChangeAccumulator) : eventCache.getIndexedNode();
            }
        }
        return viewCache.updateEventSnap(updateChild, eventCache.isFullyInitialized() || path.isEmpty(), this.filter.filtersNodes());
    }

    private ViewCache listenComplete(ViewCache viewCache, Path path, WriteTreeRef writeTreeRef, Node node, ChildChangeAccumulator childChangeAccumulator) {
        CacheNode serverCache = viewCache.getServerCache();
        return generateEventCacheAfterServerEvent(viewCache.updateServerSnap(serverCache.getIndexedNode(), serverCache.isFullyInitialized() || path.isEmpty(), serverCache.isFiltered()), path, writeTreeRef, NO_COMPLETE_SOURCE, childChangeAccumulator);
    }

    private void maybeAddValueEvent(ViewCache viewCache, ViewCache viewCache2, List<Change> list) {
        CacheNode eventCache = viewCache2.getEventCache();
        if (eventCache.isFullyInitialized()) {
            boolean z = eventCache.getNode().isLeafNode() || eventCache.getNode().isEmpty();
            if (list.isEmpty() && viewCache.getEventCache().isFullyInitialized() && ((!z || eventCache.getNode().equals(viewCache.getCompleteEventSnap())) && eventCache.getNode().getPriority().equals(viewCache.getCompleteEventSnap().getPriority()))) {
                return;
            }
            list.add(Change.valueChange(eventCache.getIndexedNode()));
        }
    }

    public ProcessorResult applyOperation(ViewCache viewCache, Operation operation, WriteTreeRef writeTreeRef, Node node) {
        ChildChangeAccumulator childChangeAccumulator;
        ViewCache viewCache2;
        ViewCache applyServerOverwrite;
        ChildChangeAccumulator childChangeAccumulator2 = new ChildChangeAccumulator();
        int i = AnonymousClass2.$SwitchMap$com$google$firebase$database$core$operation$Operation$OperationType[operation.getType().ordinal()];
        if (i == 1) {
            Overwrite overwrite = (Overwrite) operation;
            if (overwrite.getSource().isFromUser()) {
                viewCache2 = viewCache;
                applyServerOverwrite = applyUserOverwrite(viewCache2, overwrite.getPath(), overwrite.getSnapshot(), writeTreeRef, node, childChangeAccumulator2);
            } else {
                Utilities.hardAssert(overwrite.getSource().isFromServer());
                if (overwrite.getSource().isTagged() || (viewCache.getServerCache().isFiltered() && !overwrite.getPath().isEmpty())) {
                    r1 = true;
                }
                childChangeAccumulator = childChangeAccumulator2;
                boolean z = r1;
                viewCache2 = viewCache;
                applyServerOverwrite = applyServerOverwrite(viewCache2, overwrite.getPath(), overwrite.getSnapshot(), writeTreeRef, node, z, childChangeAccumulator);
                childChangeAccumulator2 = childChangeAccumulator;
            }
        } else if (i == 2) {
            Merge merge = (Merge) operation;
            if (merge.getSource().isFromUser()) {
                viewCache2 = viewCache;
                applyServerOverwrite = applyUserMerge(viewCache2, merge.getPath(), merge.getChildren(), writeTreeRef, node, childChangeAccumulator2);
            } else {
                Utilities.hardAssert(merge.getSource().isFromServer());
                childChangeAccumulator = childChangeAccumulator2;
                viewCache2 = viewCache;
                applyServerOverwrite = applyServerMerge(viewCache2, merge.getPath(), merge.getChildren(), writeTreeRef, node, merge.getSource().isTagged() || viewCache.getServerCache().isFiltered(), childChangeAccumulator);
                childChangeAccumulator2 = childChangeAccumulator;
            }
        } else if (i == 3) {
            viewCache2 = viewCache;
            AckUserWrite ackUserWrite = (AckUserWrite) operation;
            applyServerOverwrite = !ackUserWrite.isRevert() ? ackUserWrite(viewCache2, ackUserWrite.getPath(), ackUserWrite.getAffectedTree(), writeTreeRef, node, childChangeAccumulator2) : revertUserWrite(viewCache2, ackUserWrite.getPath(), writeTreeRef, node, childChangeAccumulator2);
        } else {
            if (i != 4) {
                throw new AssertionError("Unknown operation: " + operation.getType());
            }
            viewCache2 = viewCache;
            applyServerOverwrite = listenComplete(viewCache2, operation.getPath(), writeTreeRef, node, childChangeAccumulator2);
        }
        ArrayList arrayList = new ArrayList(childChangeAccumulator2.getChanges());
        maybeAddValueEvent(viewCache2, applyServerOverwrite, arrayList);
        return new ProcessorResult(applyServerOverwrite, arrayList);
    }

    public ViewCache revertUserWrite(ViewCache viewCache, Path path, WriteTreeRef writeTreeRef, Node node, ChildChangeAccumulator childChangeAccumulator) {
        ChildChangeAccumulator childChangeAccumulator2;
        if (writeTreeRef.shadowingWrite(path) != null) {
            return viewCache;
        }
        WriteTreeCompleteChildSource writeTreeCompleteChildSource = new WriteTreeCompleteChildSource(writeTreeRef, viewCache, node);
        IndexedNode indexedNode = viewCache.getEventCache().getIndexedNode();
        if (path.isEmpty() || path.getFront().isPriorityChildName()) {
            indexedNode = this.filter.updateFullNode(indexedNode, IndexedNode.from(viewCache.getServerCache().isFullyInitialized() ? writeTreeRef.calcCompleteEventCache(viewCache.getCompleteServerSnap()) : writeTreeRef.calcCompleteEventChildren(viewCache.getServerCache().getNode()), this.filter.getIndex()), childChangeAccumulator);
        } else {
            ChildKey front = path.getFront();
            Node calcCompleteChild = writeTreeRef.calcCompleteChild(front, viewCache.getServerCache());
            if (calcCompleteChild == null && viewCache.getServerCache().isCompleteForChild(front)) {
                calcCompleteChild = indexedNode.getNode().getImmediateChild(front);
            }
            Node node2 = calcCompleteChild;
            if (node2 != null) {
                childChangeAccumulator2 = childChangeAccumulator;
                indexedNode = this.filter.updateChild(indexedNode, front, node2, path.popFront(), writeTreeCompleteChildSource, childChangeAccumulator2);
            } else {
                childChangeAccumulator2 = childChangeAccumulator;
                if (node2 == null && viewCache.getEventCache().getNode().hasChild(front)) {
                    indexedNode = this.filter.updateChild(indexedNode, front, EmptyNode.Empty(), path.popFront(), writeTreeCompleteChildSource, childChangeAccumulator2);
                }
            }
            if (indexedNode.getNode().isEmpty() && viewCache.getServerCache().isFullyInitialized()) {
                Node calcCompleteEventCache = writeTreeRef.calcCompleteEventCache(viewCache.getCompleteServerSnap());
                if (calcCompleteEventCache.isLeafNode()) {
                    indexedNode = this.filter.updateFullNode(indexedNode, IndexedNode.from(calcCompleteEventCache, this.filter.getIndex()), childChangeAccumulator2);
                }
            }
        }
        return viewCache.updateEventSnap(indexedNode, viewCache.getServerCache().isFullyInitialized() || writeTreeRef.shadowingWrite(Path.getEmptyPath()) != null, this.filter.filtersNodes());
    }
}
