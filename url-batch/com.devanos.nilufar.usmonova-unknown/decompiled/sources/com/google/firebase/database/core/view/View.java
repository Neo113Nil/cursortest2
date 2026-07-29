package com.google.firebase.database.core.view;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.annotations.NotNull;
import com.google.firebase.database.annotations.Nullable;
import com.google.firebase.database.core.EventRegistration;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.WriteTreeRef;
import com.google.firebase.database.core.operation.Operation;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.ViewProcessor;
import com.google.firebase.database.core.view.filter.IndexedFilter;
import com.google.firebase.database.core.view.filter.NodeFilter;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.NamedNode;
import com.google.firebase.database.snapshot.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class View {
    private final EventGenerator eventGenerator;
    private final List<EventRegistration> eventRegistrations;
    private final ViewProcessor processor;
    private final QuerySpec query;
    private ViewCache viewCache;

    public static class OperationResult {
        public final List<Change> changes;
        public final List<DataEvent> events;

        public OperationResult(List<DataEvent> list, List<Change> list2) {
            this.events = list;
            this.changes = list2;
        }
    }

    public View(QuerySpec querySpec, ViewCache viewCache) {
        this.query = querySpec;
        IndexedFilter indexedFilter = new IndexedFilter(querySpec.getIndex());
        NodeFilter nodeFilter = querySpec.getParams().getNodeFilter();
        this.processor = new ViewProcessor(nodeFilter);
        CacheNode serverCache = viewCache.getServerCache();
        CacheNode eventCache = viewCache.getEventCache();
        IndexedNode from = IndexedNode.from(EmptyNode.Empty(), querySpec.getIndex());
        IndexedNode updateFullNode = indexedFilter.updateFullNode(from, serverCache.getIndexedNode(), null);
        IndexedNode updateFullNode2 = nodeFilter.updateFullNode(from, eventCache.getIndexedNode(), null);
        this.viewCache = new ViewCache(new CacheNode(updateFullNode2, eventCache.isFullyInitialized(), nodeFilter.filtersNodes()), new CacheNode(updateFullNode, serverCache.isFullyInitialized(), indexedFilter.filtersNodes()));
        this.eventRegistrations = new ArrayList();
        this.eventGenerator = new EventGenerator(querySpec);
    }

    private List<DataEvent> generateEventsForChanges(List<Change> list, IndexedNode indexedNode, EventRegistration eventRegistration) {
        return this.eventGenerator.generateEventsForChanges(list, indexedNode, eventRegistration == null ? this.eventRegistrations : Arrays.asList(eventRegistration));
    }

    public void addEventRegistration(@NotNull EventRegistration eventRegistration) {
        this.eventRegistrations.add(eventRegistration);
    }

    public OperationResult applyOperation(Operation operation, WriteTreeRef writeTreeRef, Node node) {
        if (operation.getType() == Operation.OperationType.Merge && operation.getSource().getQueryParams() != null) {
            Utilities.hardAssert(this.viewCache.getCompleteServerSnap() != null, "We should always have a full cache before handling merges");
            Utilities.hardAssert(this.viewCache.getCompleteEventSnap() != null, "Missing event cache, even though we have a server cache");
        }
        ViewCache viewCache = this.viewCache;
        ViewProcessor.ProcessorResult applyOperation = this.processor.applyOperation(viewCache, operation, writeTreeRef, node);
        Utilities.hardAssert(applyOperation.viewCache.getServerCache().isFullyInitialized() || !viewCache.getServerCache().isFullyInitialized(), "Once a server snap is complete, it should never go back");
        ViewCache viewCache2 = applyOperation.viewCache;
        this.viewCache = viewCache2;
        return new OperationResult(generateEventsForChanges(applyOperation.changes, viewCache2.getEventCache().getIndexedNode(), null), applyOperation.changes);
    }

    public Node getCompleteNode() {
        return this.viewCache.getCompleteEventSnap();
    }

    public Node getCompleteServerCache(Path path) {
        Node completeServerSnap = this.viewCache.getCompleteServerSnap();
        if (completeServerSnap == null) {
            return null;
        }
        if (this.query.loadsAllData() || !(path.isEmpty() || completeServerSnap.getImmediateChild(path.getFront()).isEmpty())) {
            return completeServerSnap.getChild(path);
        }
        return null;
    }

    public Node getEventCache() {
        return this.viewCache.getEventCache().getNode();
    }

    public List<EventRegistration> getEventRegistrations() {
        return this.eventRegistrations;
    }

    public List<DataEvent> getInitialEvents(EventRegistration eventRegistration) {
        CacheNode eventCache = this.viewCache.getEventCache();
        ArrayList arrayList = new ArrayList();
        for (NamedNode namedNode : eventCache.getNode()) {
            arrayList.add(Change.childAddedChange(namedNode.getName(), namedNode.getNode()));
        }
        if (eventCache.isFullyInitialized()) {
            arrayList.add(Change.valueChange(eventCache.getIndexedNode()));
        }
        return generateEventsForChanges(arrayList, eventCache.getIndexedNode(), eventRegistration);
    }

    public QuerySpec getQuery() {
        return this.query;
    }

    public Node getServerCache() {
        return this.viewCache.getServerCache().getNode();
    }

    public boolean isEmpty() {
        return this.eventRegistrations.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.google.firebase.database.core.view.Event>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public List<Event> removeEventRegistration(@Nullable EventRegistration eventRegistration, DatabaseError databaseError) {
        ?? r1;
        int i = 0;
        if (databaseError != null) {
            r1 = new ArrayList();
            Utilities.hardAssert(eventRegistration == null, "A cancel should cancel all event registrations");
            Path path = this.query.getPath();
            Iterator<EventRegistration> it = this.eventRegistrations.iterator();
            while (it.hasNext()) {
                r1.add(new CancelEvent(it.next(), databaseError, path));
            }
        } else {
            r1 = Collections.EMPTY_LIST;
        }
        if (eventRegistration == null) {
            Iterator<EventRegistration> it2 = this.eventRegistrations.iterator();
            while (it2.hasNext()) {
                it2.next().zombify();
            }
            this.eventRegistrations.clear();
            return r1;
        }
        int i2 = -1;
        while (true) {
            if (i >= this.eventRegistrations.size()) {
                i = i2;
                break;
            }
            EventRegistration eventRegistration2 = this.eventRegistrations.get(i);
            if (eventRegistration2.isSameListener(eventRegistration)) {
                if (eventRegistration2.isZombied()) {
                    break;
                }
                i2 = i;
            }
            i++;
        }
        if (i != -1) {
            EventRegistration eventRegistration3 = this.eventRegistrations.get(i);
            this.eventRegistrations.remove(i);
            eventRegistration3.zombify();
        }
        return r1;
    }
}
