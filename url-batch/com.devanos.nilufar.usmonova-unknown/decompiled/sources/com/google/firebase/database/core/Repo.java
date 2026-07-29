package com.google.firebase.database.core;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.InternalHelpers;
import com.google.firebase.database.Query;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.annotations.NotNull;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.ListenHashProvider;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.connection.RangeMerge;
import com.google.firebase.database.connection.RequestResultCallback;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.SparseSnapshotTree;
import com.google.firebase.database.core.SyncTree;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.database.core.persistence.NoopPersistenceManager;
import com.google.firebase.database.core.persistence.PersistenceManager;
import com.google.firebase.database.core.utilities.DefaultClock;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.core.utilities.OffsetClock;
import com.google.firebase.database.core.utilities.Tree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.Event;
import com.google.firebase.database.core.view.EventRaiser;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.EmptyNode;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.NodeUtilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC0764bG;
import o.MU;
import o.NU;

/* loaded from: classes.dex */
public class Repo implements PersistentConnection.Delegate {
    private static final int GET_TIMEOUT_MS = 3000;
    private static final String INTERRUPT_REASON = "repo_interrupt";
    private static final int TRANSACTION_MAX_RETRIES = 25;
    private static final String TRANSACTION_OVERRIDE_BY_SET = "overriddenBySet";
    private static final String TRANSACTION_TOO_MANY_RETRIES = "maxretries";
    private PersistentConnection connection;
    private final Context ctx;
    private final LogWrapper dataLogger;
    private FirebaseDatabase database;
    private final EventRaiser eventRaiser;
    private SnapshotHolder infoData;
    private SyncTree infoSyncTree;
    private SparseSnapshotTree onDisconnect;
    private final LogWrapper operationLogger;
    private final RepoInfo repoInfo;
    private SyncTree serverSyncTree;
    private final LogWrapper transactionLogger;
    private Tree<List<TransactionData>> transactionQueueTree;
    private final OffsetClock serverClock = new OffsetClock(new DefaultClock(), 0);
    private boolean hijackHash = false;
    public long dataUpdateCount = 0;
    private long nextWriteId = 1;
    private boolean loggedTransactionPersistenceWarning = false;
    private long transactionOrder = 0;

    /* renamed from: com.google.firebase.database.core.Repo$9, reason: invalid class name */
    public class AnonymousClass9 implements Runnable {
        final /* synthetic */ Query val$query;
        final /* synthetic */ Repo val$repo;
        final /* synthetic */ NU val$source;

        public AnonymousClass9(Query query, NU nu, Repo repo) {
            this.val$query = query;
            this.val$source = nu;
            this.val$repo = repo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$run$1(NU nu, DataSnapshot dataSnapshot, Query query, Repo repo, MU mu) {
            if (nu.a.h()) {
                return;
            }
            if (mu.i()) {
                Node NodeFromJSON = NodeUtilities.NodeFromJSON(mu.g());
                QuerySpec spec = query.getSpec();
                Repo.this.keepSynced(spec, true, true);
                repo.postEvents(spec.loadsAllData() ? Repo.this.serverSyncTree.applyServerOverwrite(spec.getPath(), NodeFromJSON) : Repo.this.serverSyncTree.applyTaggedQueryOverwrite(spec.getPath(), NodeFromJSON, Repo.this.getServerSyncTree().tagForQuery(spec)));
                nu.b(InternalHelpers.createDataSnapshot(query.getRef(), IndexedNode.from(NodeFromJSON, query.getSpec().getIndex())));
                Repo.this.keepSynced(spec, false, true);
                return;
            }
            if (dataSnapshot.exists()) {
                nu.b(dataSnapshot);
                return;
            }
            Exception f = mu.f();
            Objects.requireNonNull(f);
            nu.a(f);
        }

        @Override // java.lang.Runnable
        public void run() {
            Node serverValue = Repo.this.serverSyncTree.getServerValue(this.val$query.getSpec());
            if (serverValue != null) {
                this.val$source.b(InternalHelpers.createDataSnapshot(this.val$query.getRef(), IndexedNode.from(serverValue)));
                return;
            }
            Repo.this.serverSyncTree.setQueryActive(this.val$query.getSpec());
            final DataSnapshot persistenceServerCache = Repo.this.serverSyncTree.persistenceServerCache(this.val$query);
            if (persistenceServerCache.exists()) {
                Repo.this.scheduleDelayed(new a(this.val$source, 2, persistenceServerCache), 3000L);
            }
            MU mu = Repo.this.connection.get(this.val$query.getPath().asList(), this.val$query.getSpec().getParams().getWireProtocolParams());
            ScheduledExecutorService executorService = ((DefaultRunLoop) Repo.this.ctx.getRunLoop()).getExecutorService();
            final NU nu = this.val$source;
            final Query query = this.val$query;
            final Repo repo = this.val$repo;
            mu.a(executorService, new InterfaceC0764bG() { // from class: com.google.firebase.database.core.b
                @Override // o.InterfaceC0764bG
                public final void onComplete(MU mu2) {
                    Repo.AnonymousClass9.this.lambda$run$1(nu, persistenceServerCache, query, repo, mu2);
                }
            });
        }
    }

    public static class TransactionData implements Comparable<TransactionData> {
        private DatabaseError abortReason;
        private boolean applyLocally;
        private Node currentInputSnapshot;
        private Node currentOutputSnapshotRaw;
        private Node currentOutputSnapshotResolved;
        private long currentWriteId;
        private Transaction.Handler handler;
        private long order;
        private ValueEventListener outstandingListener;
        private Path path;
        private int retryCount;
        private TransactionStatus status;

        public static /* synthetic */ int access$2108(TransactionData transactionData) {
            int i = transactionData.retryCount;
            transactionData.retryCount = i + 1;
            return i;
        }

        private TransactionData(Path path, Transaction.Handler handler, ValueEventListener valueEventListener, TransactionStatus transactionStatus, boolean z, long j) {
            this.path = path;
            this.handler = handler;
            this.outstandingListener = valueEventListener;
            this.status = transactionStatus;
            this.retryCount = 0;
            this.applyLocally = z;
            this.order = j;
            this.abortReason = null;
            this.currentInputSnapshot = null;
            this.currentOutputSnapshotRaw = null;
            this.currentOutputSnapshotResolved = null;
        }

        @Override // java.lang.Comparable
        public int compareTo(TransactionData transactionData) {
            long j = this.order;
            long j2 = transactionData.order;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    public enum TransactionStatus {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    public Repo(RepoInfo repoInfo, Context context, FirebaseDatabase firebaseDatabase) {
        this.repoInfo = repoInfo;
        this.ctx = context;
        this.database = firebaseDatabase;
        this.operationLogger = context.getLogger("RepoOperation");
        this.transactionLogger = context.getLogger("Transaction");
        this.dataLogger = context.getLogger("DataOperation");
        this.eventRaiser = new EventRaiser(context);
        scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.Repo.1
            @Override // java.lang.Runnable
            public void run() {
                Repo.this.deferredInitialization();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Path abortTransactions(Path path, final int i) {
        Path path2 = getAncestorTransactionNode(path).getPath();
        if (this.transactionLogger.logsDebug()) {
            this.operationLogger.debug("Aborting transactions for path: " + path + ". Affected: " + path2, new Object[0]);
        }
        Tree<List<TransactionData>> subTree = this.transactionQueueTree.subTree(path);
        subTree.forEachAncestor(new Tree.TreeFilter<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.23
            @Override // com.google.firebase.database.core.utilities.Tree.TreeFilter
            public boolean filterTreeNode(Tree<List<TransactionData>> tree) {
                Repo.this.abortTransactionsAtNode(tree, i);
                return false;
            }
        });
        abortTransactionsAtNode(subTree, i);
        subTree.forEachDescendant(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.24
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public void visitTree(Tree<List<TransactionData>> tree) {
                Repo.this.abortTransactionsAtNode(tree, i);
            }
        });
        return path2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void abortTransactionsAtNode(Tree<List<TransactionData>> tree, int i) {
        final DatabaseError fromCode;
        List<TransactionData> value = tree.getValue();
        ArrayList arrayList = new ArrayList();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            if (i == -9) {
                fromCode = DatabaseError.fromStatus(TRANSACTION_OVERRIDE_BY_SET);
            } else {
                Utilities.hardAssert(i == -25, "Unknown transaction abort reason: " + i);
                fromCode = DatabaseError.fromCode(-25);
            }
            int i2 = -1;
            for (int i3 = 0; i3 < value.size(); i3++) {
                final TransactionData transactionData = value.get(i3);
                TransactionStatus transactionStatus = transactionData.status;
                TransactionStatus transactionStatus2 = TransactionStatus.SENT_NEEDS_ABORT;
                if (transactionStatus != transactionStatus2) {
                    if (transactionData.status == TransactionStatus.SENT) {
                        Utilities.hardAssert(i2 == i3 + (-1));
                        transactionData.status = transactionStatus2;
                        transactionData.abortReason = fromCode;
                        i2 = i3;
                    } else {
                        Utilities.hardAssert(transactionData.status == TransactionStatus.RUN);
                        removeEventCallback(new ValueEventRegistration(this, transactionData.outstandingListener, QuerySpec.defaultQueryAtPath(transactionData.path)));
                        if (i == -9) {
                            arrayList.addAll(this.serverSyncTree.ackUserWrite(transactionData.currentWriteId, true, false, this.serverClock));
                        } else {
                            Utilities.hardAssert(i == -25, "Unknown transaction abort reason: " + i);
                        }
                        arrayList2.add(new Runnable() { // from class: com.google.firebase.database.core.Repo.25
                            @Override // java.lang.Runnable
                            public void run() {
                                transactionData.handler.onComplete(fromCode, false, null);
                            }
                        });
                    }
                }
            }
            if (i2 == -1) {
                tree.setValue(null);
            } else {
                tree.setValue(value.subList(0, i2 + 1));
            }
            postEvents(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                postEvent((Runnable) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ackWriteAndRerunTransactions(long j, Path path, DatabaseError databaseError) {
        if (databaseError == null || databaseError.getCode() != -25) {
            List<? extends Event> ackUserWrite = this.serverSyncTree.ackUserWrite(j, !(databaseError == null), true, this.serverClock);
            if (ackUserWrite.size() > 0) {
                rerunTransactions(path);
            }
            postEvents(ackUserWrite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aggregateTransactionQueues(final List<TransactionData> list, Tree<List<TransactionData>> tree) {
        List<TransactionData> value = tree.getValue();
        if (value != null) {
            list.addAll(value);
        }
        tree.forEachChild(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.22
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public void visitTree(Tree<List<TransactionData>> tree2) {
                Repo.this.aggregateTransactionQueues(list, tree2);
            }
        });
    }

    private List<TransactionData> buildTransactionQueue(Tree<List<TransactionData>> tree) {
        ArrayList arrayList = new ArrayList();
        aggregateTransactionQueues(arrayList, tree);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deferredInitialization() {
        RepoInfo repoInfo = this.repoInfo;
        this.connection = this.ctx.newPersistentConnection(new HostInfo(repoInfo.host, repoInfo.namespace, repoInfo.secure), this);
        this.ctx.getAuthTokenProvider().addTokenChangeListener(((DefaultRunLoop) this.ctx.getRunLoop()).getExecutorService(), new TokenProvider.TokenChangeListener() { // from class: com.google.firebase.database.core.Repo.2
            @Override // com.google.firebase.database.core.TokenProvider.TokenChangeListener
            public void onTokenChange() {
                Repo.this.operationLogger.debug("Auth token changed, triggering auth token refresh", new Object[0]);
                Repo.this.connection.refreshAuthToken();
            }

            @Override // com.google.firebase.database.core.TokenProvider.TokenChangeListener
            public void onTokenChange(String str) {
                Repo.this.operationLogger.debug("Auth token changed, triggering auth token refresh", new Object[0]);
                Repo.this.connection.refreshAuthToken(str);
            }
        });
        this.ctx.getAppCheckTokenProvider().addTokenChangeListener(((DefaultRunLoop) this.ctx.getRunLoop()).getExecutorService(), new TokenProvider.TokenChangeListener() { // from class: com.google.firebase.database.core.Repo.3
            @Override // com.google.firebase.database.core.TokenProvider.TokenChangeListener
            public void onTokenChange() {
                Repo.this.operationLogger.debug("App check token changed, triggering app check token refresh", new Object[0]);
                Repo.this.connection.refreshAppCheckToken();
            }

            @Override // com.google.firebase.database.core.TokenProvider.TokenChangeListener
            public void onTokenChange(String str) {
                Repo.this.operationLogger.debug("App check token changed, triggering app check token refresh", new Object[0]);
                Repo.this.connection.refreshAppCheckToken(str);
            }
        });
        this.connection.initialize();
        PersistenceManager persistenceManager = this.ctx.getPersistenceManager(this.repoInfo.host);
        this.infoData = new SnapshotHolder();
        this.onDisconnect = new SparseSnapshotTree();
        this.transactionQueueTree = new Tree<>();
        this.infoSyncTree = new SyncTree(this.ctx, new NoopPersistenceManager(), new SyncTree.ListenProvider() { // from class: com.google.firebase.database.core.Repo.4
            @Override // com.google.firebase.database.core.SyncTree.ListenProvider
            public void startListening(final QuerySpec querySpec, Tag tag, ListenHashProvider listenHashProvider, final SyncTree.CompletionListener completionListener) {
                Repo.this.scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.Repo.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Node node = Repo.this.infoData.getNode(querySpec.getPath());
                        if (node.isEmpty()) {
                            return;
                        }
                        Repo.this.postEvents(Repo.this.infoSyncTree.applyServerOverwrite(querySpec.getPath(), node));
                        completionListener.onListenComplete(null);
                    }
                });
            }

            @Override // com.google.firebase.database.core.SyncTree.ListenProvider
            public void stopListening(QuerySpec querySpec, Tag tag) {
            }
        });
        this.serverSyncTree = new SyncTree(this.ctx, persistenceManager, new SyncTree.ListenProvider() { // from class: com.google.firebase.database.core.Repo.5
            @Override // com.google.firebase.database.core.SyncTree.ListenProvider
            public void startListening(QuerySpec querySpec, Tag tag, ListenHashProvider listenHashProvider, final SyncTree.CompletionListener completionListener) {
                Repo.this.connection.listen(querySpec.getPath().asList(), querySpec.getParams().getWireProtocolParams(), listenHashProvider, tag != null ? Long.valueOf(tag.getTagNumber()) : null, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.5.1
                    @Override // com.google.firebase.database.connection.RequestResultCallback
                    public void onRequestResult(String str, String str2) {
                        Repo.this.postEvents(completionListener.onListenComplete(Repo.fromErrorCode(str, str2)));
                    }
                });
            }

            @Override // com.google.firebase.database.core.SyncTree.ListenProvider
            public void stopListening(QuerySpec querySpec, Tag tag) {
                Repo.this.connection.unlisten(querySpec.getPath().asList(), querySpec.getParams().getWireProtocolParams());
            }
        });
        restoreWrites(persistenceManager);
        ChildKey childKey = Constants.DOT_INFO_AUTHENTICATED;
        Boolean bool = Boolean.FALSE;
        updateInfo(childKey, bool);
        updateInfo(Constants.DOT_INFO_CONNECTED, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DatabaseError fromErrorCode(String str, String str2) {
        if (str != null) {
            return DatabaseError.fromStatus(str, str2);
        }
        return null;
    }

    private Tree<List<TransactionData>> getAncestorTransactionNode(Path path) {
        Tree<List<TransactionData>> tree = this.transactionQueueTree;
        while (!path.isEmpty() && tree.getValue() == null) {
            tree = tree.subTree(new Path(path.getFront()));
            path = path.popFront();
        }
        return tree;
    }

    private Node getLatestState(Path path) {
        return getLatestState(path, new ArrayList());
    }

    private long getNextWriteId() {
        long j = this.nextWriteId;
        this.nextWriteId = 1 + j;
        return j;
    }

    private long nextTransactionOrder() {
        long j = this.transactionOrder;
        this.transactionOrder = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postEvents(List<? extends Event> list) {
        if (list.isEmpty()) {
            return;
        }
        this.eventRaiser.raiseEvents(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pruneCompletedTransactions(Tree<List<TransactionData>> tree) {
        List<TransactionData> value = tree.getValue();
        if (value != null) {
            int i = 0;
            while (i < value.size()) {
                if (value.get(i).status == TransactionStatus.COMPLETED) {
                    value.remove(i);
                } else {
                    i++;
                }
            }
            if (value.size() > 0) {
                tree.setValue(value);
            } else {
                tree.setValue(null);
            }
        }
        tree.forEachChild(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.19
            @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
            public void visitTree(Tree<List<TransactionData>> tree2) {
                Repo.this.pruneCompletedTransactions(tree2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void rerunTransactionQueue(List<TransactionData> list, Path path) {
        int i;
        final DatabaseError databaseError;
        DatabaseError fromException;
        Transaction.Result abort;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<TransactionData> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(it.next().currentWriteId));
        }
        Iterator<TransactionData> it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            final TransactionData next = it2.next();
            Path relative = Path.getRelative(path, next.path);
            ArrayList arrayList3 = new ArrayList();
            Utilities.hardAssert(relative != null);
            if (next.status == TransactionStatus.NEEDS_ABORT) {
                databaseError = next.abortReason;
                if (databaseError.getCode() != -25) {
                    arrayList3.addAll(this.serverSyncTree.ackUserWrite(next.currentWriteId, true, false, this.serverClock));
                }
            } else {
                if (next.status == TransactionStatus.RUN) {
                    if (next.retryCount >= TRANSACTION_MAX_RETRIES) {
                        databaseError = DatabaseError.fromStatus(TRANSACTION_TOO_MANY_RETRIES);
                        arrayList3.addAll(this.serverSyncTree.ackUserWrite(next.currentWriteId, true, false, this.serverClock));
                    } else {
                        Node latestState = getLatestState(next.path, arrayList2);
                        next.currentInputSnapshot = latestState;
                        try {
                            abort = next.handler.doTransaction(InternalHelpers.createMutableData(latestState));
                            fromException = null;
                        } catch (Throwable th) {
                            this.operationLogger.error("Caught Throwable.", th);
                            fromException = DatabaseError.fromException(th);
                            abort = Transaction.abort();
                        }
                        if (abort.isSuccess()) {
                            long j = next.currentWriteId;
                            Long valueOf = Long.valueOf(j);
                            Map<String, Object> generateServerValues = ServerValues.generateServerValues(this.serverClock);
                            Node node = abort.getNode();
                            Node resolveDeferredValueSnapshot = ServerValues.resolveDeferredValueSnapshot(node, latestState, generateServerValues);
                            next.currentOutputSnapshotRaw = node;
                            next.currentOutputSnapshotResolved = resolveDeferredValueSnapshot;
                            next.currentWriteId = getNextWriteId();
                            arrayList2.remove(valueOf);
                            arrayList3.addAll(this.serverSyncTree.applyUserOverwrite(next.path, node, resolveDeferredValueSnapshot, next.currentWriteId, next.applyLocally, false));
                            arrayList3.addAll(this.serverSyncTree.ackUserWrite(j, true, false, this.serverClock));
                        } else {
                            arrayList3.addAll(this.serverSyncTree.ackUserWrite(next.currentWriteId, true, false, this.serverClock));
                            i = 1;
                            databaseError = fromException;
                            postEvents(arrayList3);
                            if (i != 0) {
                                next.status = TransactionStatus.COMPLETED;
                                final DataSnapshot createDataSnapshot = InternalHelpers.createDataSnapshot(InternalHelpers.createReference(this, next.path), IndexedNode.from(next.currentInputSnapshot));
                                scheduleNow(new Runnable() { // from class: com.google.firebase.database.core.Repo.20
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Repo repo = Repo.this;
                                        repo.removeEventCallback(new ValueEventRegistration(repo, next.outstandingListener, QuerySpec.defaultQueryAtPath(next.path)));
                                    }
                                });
                                arrayList.add(new Runnable() { // from class: com.google.firebase.database.core.Repo.21
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        next.handler.onComplete(databaseError, false, createDataSnapshot);
                                    }
                                });
                            }
                        }
                    }
                }
                databaseError = null;
                postEvents(arrayList3);
                if (i != 0) {
                }
            }
            i = 1;
            postEvents(arrayList3);
            if (i != 0) {
            }
        }
        pruneCompletedTransactions(this.transactionQueueTree);
        while (i < arrayList.size()) {
            postEvent((Runnable) arrayList.get(i));
            i++;
        }
        sendAllReadyTransactions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Path rerunTransactions(Path path) {
        Tree<List<TransactionData>> ancestorTransactionNode = getAncestorTransactionNode(path);
        Path path2 = ancestorTransactionNode.getPath();
        rerunTransactionQueue(buildTransactionQueue(ancestorTransactionNode), path2);
        return path2;
    }

    private void restoreWrites(PersistenceManager persistenceManager) {
        List<UserWriteRecord> loadUserWrites = persistenceManager.loadUserWrites();
        Map<String, Object> generateServerValues = ServerValues.generateServerValues(this.serverClock);
        long j = Long.MIN_VALUE;
        for (final UserWriteRecord userWriteRecord : loadUserWrites) {
            RequestResultCallback requestResultCallback = new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.6
                @Override // com.google.firebase.database.connection.RequestResultCallback
                public void onRequestResult(String str, String str2) {
                    DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                    Repo.this.warnIfWriteFailed("Persisted write", userWriteRecord.getPath(), fromErrorCode);
                    Repo.this.ackWriteAndRerunTransactions(userWriteRecord.getWriteId(), userWriteRecord.getPath(), fromErrorCode);
                }
            };
            if (j >= userWriteRecord.getWriteId()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            j = userWriteRecord.getWriteId();
            this.nextWriteId = userWriteRecord.getWriteId() + 1;
            if (userWriteRecord.isOverwrite()) {
                if (this.operationLogger.logsDebug()) {
                    this.operationLogger.debug("Restoring overwrite with id " + userWriteRecord.getWriteId(), new Object[0]);
                }
                this.connection.put(userWriteRecord.getPath().asList(), userWriteRecord.getOverwrite().getValue(true), requestResultCallback);
                this.serverSyncTree.applyUserOverwrite(userWriteRecord.getPath(), userWriteRecord.getOverwrite(), ServerValues.resolveDeferredValueSnapshot(userWriteRecord.getOverwrite(), this.serverSyncTree, userWriteRecord.getPath(), generateServerValues), userWriteRecord.getWriteId(), true, false);
            } else {
                if (this.operationLogger.logsDebug()) {
                    this.operationLogger.debug("Restoring merge with id " + userWriteRecord.getWriteId(), new Object[0]);
                }
                this.connection.merge(userWriteRecord.getPath().asList(), userWriteRecord.getMerge().getValue(true), requestResultCallback);
                this.serverSyncTree.applyUserMerge(userWriteRecord.getPath(), userWriteRecord.getMerge(), ServerValues.resolveDeferredValueMerge(userWriteRecord.getMerge(), this.serverSyncTree, userWriteRecord.getPath(), generateServerValues), userWriteRecord.getWriteId(), false);
            }
        }
    }

    private void runOnDisconnectEvents() {
        final Map<String, Object> generateServerValues = ServerValues.generateServerValues(this.serverClock);
        final ArrayList arrayList = new ArrayList();
        this.onDisconnect.forEachTree(Path.getEmptyPath(), new SparseSnapshotTree.SparseSnapshotTreeVisitor() { // from class: com.google.firebase.database.core.Repo.14
            @Override // com.google.firebase.database.core.SparseSnapshotTree.SparseSnapshotTreeVisitor
            public void visitTree(Path path, Node node) {
                arrayList.addAll(Repo.this.serverSyncTree.applyServerOverwrite(path, ServerValues.resolveDeferredValueSnapshot(node, Repo.this.serverSyncTree.calcCompleteEventCache(path, new ArrayList()), (Map<String, Object>) generateServerValues)));
                Repo.this.rerunTransactions(Repo.this.abortTransactions(path, -9));
            }
        });
        this.onDisconnect = new SparseSnapshotTree();
        postEvents(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAllReadyTransactions() {
        Tree<List<TransactionData>> tree = this.transactionQueueTree;
        pruneCompletedTransactions(tree);
        sendReadyTransactions(tree);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReadyTransactions(Tree<List<TransactionData>> tree) {
        if (tree.getValue() == null) {
            if (tree.hasChildren()) {
                tree.forEachChild(new Tree.TreeVisitor<List<TransactionData>>() { // from class: com.google.firebase.database.core.Repo.17
                    @Override // com.google.firebase.database.core.utilities.Tree.TreeVisitor
                    public void visitTree(Tree<List<TransactionData>> tree2) {
                        Repo.this.sendReadyTransactions(tree2);
                    }
                });
                return;
            }
            return;
        }
        List<TransactionData> buildTransactionQueue = buildTransactionQueue(tree);
        Utilities.hardAssert(buildTransactionQueue.size() > 0);
        Boolean bool = Boolean.TRUE;
        Iterator<TransactionData> it = buildTransactionQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().status != TransactionStatus.RUN) {
                bool = Boolean.FALSE;
                break;
            }
        }
        if (bool.booleanValue()) {
            sendTransactionQueue(buildTransactionQueue, tree.getPath());
        }
    }

    private void sendTransactionQueue(final List<TransactionData> list, final Path path) {
        ArrayList arrayList = new ArrayList();
        Iterator<TransactionData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().currentWriteId));
        }
        Node latestState = getLatestState(path, arrayList);
        String hash = !this.hijackHash ? latestState.getHash() : "badhash";
        Iterator<TransactionData> it2 = list.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                this.connection.compareAndPut(path.asList(), latestState.getValue(true), hash, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.18
                    @Override // com.google.firebase.database.connection.RequestResultCallback
                    public void onRequestResult(String str, String str2) {
                        DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                        Repo.this.warnIfWriteFailed("Transaction", path, fromErrorCode);
                        ArrayList arrayList2 = new ArrayList();
                        if (fromErrorCode != null) {
                            if (fromErrorCode.getCode() == -1) {
                                for (TransactionData transactionData : list) {
                                    if (transactionData.status == TransactionStatus.SENT_NEEDS_ABORT) {
                                        transactionData.status = TransactionStatus.NEEDS_ABORT;
                                    } else {
                                        transactionData.status = TransactionStatus.RUN;
                                    }
                                }
                            } else {
                                for (TransactionData transactionData2 : list) {
                                    transactionData2.status = TransactionStatus.NEEDS_ABORT;
                                    transactionData2.abortReason = fromErrorCode;
                                }
                            }
                            Repo.this.rerunTransactions(path);
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (final TransactionData transactionData3 : list) {
                            transactionData3.status = TransactionStatus.COMPLETED;
                            arrayList2.addAll(Repo.this.serverSyncTree.ackUserWrite(transactionData3.currentWriteId, false, false, Repo.this.serverClock));
                            final DataSnapshot createDataSnapshot = InternalHelpers.createDataSnapshot(InternalHelpers.createReference(this, transactionData3.path), IndexedNode.from(transactionData3.currentOutputSnapshotResolved));
                            arrayList3.add(new Runnable() { // from class: com.google.firebase.database.core.Repo.18.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    transactionData3.handler.onComplete(null, true, createDataSnapshot);
                                }
                            });
                            Repo repo = Repo.this;
                            repo.removeEventCallback(new ValueEventRegistration(repo, transactionData3.outstandingListener, QuerySpec.defaultQueryAtPath(transactionData3.path)));
                        }
                        Repo repo2 = Repo.this;
                        repo2.pruneCompletedTransactions(repo2.transactionQueueTree.subTree(path));
                        Repo.this.sendAllReadyTransactions();
                        this.postEvents(arrayList2);
                        for (int i = 0; i < arrayList3.size(); i++) {
                            Repo.this.postEvent((Runnable) arrayList3.get(i));
                        }
                    }
                });
                return;
            }
            TransactionData next = it2.next();
            if (next.status != TransactionStatus.RUN) {
                z = false;
            }
            Utilities.hardAssert(z);
            next.status = TransactionStatus.SENT;
            TransactionData.access$2108(next);
            latestState = latestState.updateChild(Path.getRelative(path, next.path), next.currentOutputSnapshotRaw);
        }
    }

    private void updateInfo(ChildKey childKey, Object obj) {
        if (childKey.equals(Constants.DOT_INFO_SERVERTIME_OFFSET)) {
            this.serverClock.setOffset(((Long) obj).longValue());
        }
        Path path = new Path(Constants.DOT_INFO, childKey);
        try {
            Node NodeFromJSON = NodeUtilities.NodeFromJSON(obj);
            this.infoData.update(path, NodeFromJSON);
            postEvents(this.infoSyncTree.applyServerOverwrite(path, NodeFromJSON));
        } catch (DatabaseException e) {
            this.operationLogger.error("Failed to parse info update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void warnIfWriteFailed(String str, Path path, DatabaseError databaseError) {
        if (databaseError == null || databaseError.getCode() == -1 || databaseError.getCode() == -25) {
            return;
        }
        this.operationLogger.warn(str + " at " + path.toString() + " failed: " + databaseError.toString());
    }

    public void addEventCallback(@NotNull EventRegistration eventRegistration) {
        ChildKey front = eventRegistration.getQuerySpec().getPath().getFront();
        postEvents((front == null || !front.equals(Constants.DOT_INFO)) ? this.serverSyncTree.addEventRegistration(eventRegistration) : this.infoSyncTree.addEventRegistration(eventRegistration));
    }

    public void callOnComplete(final DatabaseReference.CompletionListener completionListener, final DatabaseError databaseError, Path path) {
        if (completionListener != null) {
            ChildKey back = path.getBack();
            final DatabaseReference createReference = (back == null || !back.isPriorityChildName()) ? InternalHelpers.createReference(this, path) : InternalHelpers.createReference(this, path.getParent());
            postEvent(new Runnable() { // from class: com.google.firebase.database.core.Repo.7
                @Override // java.lang.Runnable
                public void run() {
                    completionListener.onComplete(databaseError, createReference);
                }
            });
        }
    }

    public PersistentConnection getConnection() {
        return this.connection;
    }

    public FirebaseDatabase getDatabase() {
        return this.database;
    }

    public SyncTree getInfoSyncTree() {
        return this.infoSyncTree;
    }

    public RepoInfo getRepoInfo() {
        return this.repoInfo;
    }

    public SyncTree getServerSyncTree() {
        return this.serverSyncTree;
    }

    public long getServerTime() {
        return this.serverClock.millis();
    }

    public MU getValue(Query query) {
        NU nu = new NU();
        scheduleNow(new AnonymousClass9(query, nu, this));
        return nu.a;
    }

    public boolean hasListeners() {
        return (this.infoSyncTree.isEmpty() && this.serverSyncTree.isEmpty()) ? false : true;
    }

    public void interrupt() {
        this.connection.interrupt(INTERRUPT_REASON);
    }

    public void keepSynced(QuerySpec querySpec, boolean z) {
        keepSynced(querySpec, z, false);
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public void onConnect() {
        onServerInfoUpdate(Constants.DOT_INFO_CONNECTED, Boolean.TRUE);
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public void onConnectionStatus(boolean z) {
        onServerInfoUpdate(Constants.DOT_INFO_AUTHENTICATED, Boolean.valueOf(z));
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public void onDataUpdate(List<String> list, Object obj, boolean z, Long l) {
        List<? extends Event> applyServerOverwrite;
        Path path = new Path(list);
        if (this.operationLogger.logsDebug()) {
            this.operationLogger.debug("onDataUpdate: " + path, new Object[0]);
        }
        if (this.dataLogger.logsDebug()) {
            this.operationLogger.debug("onDataUpdate: " + path + " " + obj, new Object[0]);
        }
        this.dataUpdateCount++;
        try {
            if (l != null) {
                Tag tag = new Tag(l.longValue());
                if (z) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new Path((String) entry.getKey()), NodeUtilities.NodeFromJSON(entry.getValue()));
                    }
                    applyServerOverwrite = this.serverSyncTree.applyTaggedQueryMerge(path, hashMap, tag);
                } else {
                    applyServerOverwrite = this.serverSyncTree.applyTaggedQueryOverwrite(path, NodeUtilities.NodeFromJSON(obj), tag);
                }
            } else if (z) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    hashMap2.put(new Path((String) entry2.getKey()), NodeUtilities.NodeFromJSON(entry2.getValue()));
                }
                applyServerOverwrite = this.serverSyncTree.applyServerMerge(path, hashMap2);
            } else {
                applyServerOverwrite = this.serverSyncTree.applyServerOverwrite(path, NodeUtilities.NodeFromJSON(obj));
            }
            if (applyServerOverwrite.size() > 0) {
                rerunTransactions(path);
            }
            postEvents(applyServerOverwrite);
        } catch (DatabaseException e) {
            this.operationLogger.error("FIREBASE INTERNAL ERROR", e);
        }
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public void onDisconnect() {
        onServerInfoUpdate(Constants.DOT_INFO_CONNECTED, Boolean.FALSE);
        runOnDisconnectEvents();
    }

    public void onDisconnectCancel(final Path path, final DatabaseReference.CompletionListener completionListener) {
        this.connection.onDisconnectCancel(path.asList(), new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.13
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public void onRequestResult(String str, String str2) {
                DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                if (fromErrorCode == null) {
                    Repo.this.onDisconnect.forget(path);
                }
                Repo.this.callOnComplete(completionListener, fromErrorCode, path);
            }
        });
    }

    public void onDisconnectSetValue(final Path path, final Node node, final DatabaseReference.CompletionListener completionListener) {
        this.connection.onDisconnectPut(path.asList(), node.getValue(true), new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.11
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public void onRequestResult(String str, String str2) {
                DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                Repo.this.warnIfWriteFailed("onDisconnect().setValue", path, fromErrorCode);
                if (fromErrorCode == null) {
                    Repo.this.onDisconnect.remember(path, node);
                }
                Repo.this.callOnComplete(completionListener, fromErrorCode, path);
            }
        });
    }

    public void onDisconnectUpdate(final Path path, final Map<Path, Node> map, final DatabaseReference.CompletionListener completionListener, Map<String, Object> map2) {
        this.connection.onDisconnectMerge(path.asList(), map2, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.12
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public void onRequestResult(String str, String str2) {
                DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                Repo.this.warnIfWriteFailed("onDisconnect().updateChildren", path, fromErrorCode);
                if (fromErrorCode == null) {
                    for (Map.Entry entry : map.entrySet()) {
                        Repo.this.onDisconnect.remember(path.child((Path) entry.getKey()), (Node) entry.getValue());
                    }
                }
                Repo.this.callOnComplete(completionListener, fromErrorCode, path);
            }
        });
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public void onRangeMergeUpdate(List<String> list, List<RangeMerge> list2, Long l) {
        Path path = new Path(list);
        if (this.operationLogger.logsDebug()) {
            this.operationLogger.debug("onRangeMergeUpdate: " + path, new Object[0]);
        }
        if (this.dataLogger.logsDebug()) {
            this.operationLogger.debug("onRangeMergeUpdate: " + path + " " + list2, new Object[0]);
        }
        this.dataUpdateCount++;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<RangeMerge> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.firebase.database.snapshot.RangeMerge(it.next()));
        }
        List<? extends Event> applyTaggedRangeMerges = l != null ? this.serverSyncTree.applyTaggedRangeMerges(path, arrayList, new Tag(l.longValue())) : this.serverSyncTree.applyServerRangeMerges(path, arrayList);
        if (applyTaggedRangeMerges.size() > 0) {
            rerunTransactions(path);
        }
        postEvents(applyTaggedRangeMerges);
    }

    public void onServerInfoUpdate(ChildKey childKey, Object obj) {
        updateInfo(childKey, obj);
    }

    public void postEvent(Runnable runnable) {
        this.ctx.requireStarted();
        this.ctx.getEventTarget().postEvent(runnable);
    }

    public void purgeOutstandingWrites() {
        if (this.operationLogger.logsDebug()) {
            this.operationLogger.debug("Purging writes", new Object[0]);
        }
        postEvents(this.serverSyncTree.removeAllWrites());
        abortTransactions(Path.getEmptyPath(), -25);
        this.connection.purgeOutstandingWrites();
    }

    public void removeEventCallback(@NotNull EventRegistration eventRegistration) {
        postEvents(Constants.DOT_INFO.equals(eventRegistration.getQuerySpec().getPath().getFront()) ? this.infoSyncTree.removeEventRegistration(eventRegistration) : this.serverSyncTree.removeEventRegistration(eventRegistration));
    }

    public void resume() {
        this.connection.resume(INTERRUPT_REASON);
    }

    public void scheduleDelayed(Runnable runnable, long j) {
        this.ctx.requireStarted();
        this.ctx.getRunLoop().schedule(runnable, j);
    }

    public void scheduleNow(Runnable runnable) {
        this.ctx.requireStarted();
        this.ctx.getRunLoop().scheduleNow(runnable);
    }

    public void setHijackHash(boolean z) {
        this.hijackHash = z;
    }

    public void setValue(final Path path, Node node, final DatabaseReference.CompletionListener completionListener) {
        if (this.operationLogger.logsDebug()) {
            this.operationLogger.debug("set: " + path, new Object[0]);
        }
        if (this.dataLogger.logsDebug()) {
            this.dataLogger.debug("set: " + path + " " + node, new Object[0]);
        }
        Node resolveDeferredValueSnapshot = ServerValues.resolveDeferredValueSnapshot(node, this.serverSyncTree.calcCompleteEventCache(path, new ArrayList()), ServerValues.generateServerValues(this.serverClock));
        final long nextWriteId = getNextWriteId();
        postEvents(this.serverSyncTree.applyUserOverwrite(path, node, resolveDeferredValueSnapshot, nextWriteId, true, true));
        this.connection.put(path.asList(), node.getValue(true), new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.8
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public void onRequestResult(String str, String str2) {
                DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                Repo.this.warnIfWriteFailed("setValue", path, fromErrorCode);
                Repo.this.ackWriteAndRerunTransactions(nextWriteId, path, fromErrorCode);
                Repo.this.callOnComplete(completionListener, fromErrorCode, path);
            }
        });
        rerunTransactions(abortTransactions(path, -9));
    }

    public void startTransaction(Path path, final Transaction.Handler handler, boolean z) {
        final DatabaseError fromException;
        Transaction.Result abort;
        if (this.operationLogger.logsDebug()) {
            this.operationLogger.debug("transaction: " + path, new Object[0]);
        }
        if (this.dataLogger.logsDebug()) {
            this.operationLogger.debug("transaction: " + path, new Object[0]);
        }
        if (this.ctx.isPersistenceEnabled() && !this.loggedTransactionPersistenceWarning) {
            this.loggedTransactionPersistenceWarning = true;
            this.transactionLogger.info("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        DatabaseReference createReference = InternalHelpers.createReference(this, path);
        ValueEventListener valueEventListener = new ValueEventListener() { // from class: com.google.firebase.database.core.Repo.15
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
            }
        };
        addEventCallback(new ValueEventRegistration(this, valueEventListener, createReference.getSpec()));
        TransactionData transactionData = new TransactionData(path, handler, valueEventListener, TransactionStatus.INITIALIZING, z, nextTransactionOrder());
        Node latestState = getLatestState(path);
        transactionData.currentInputSnapshot = latestState;
        try {
            abort = handler.doTransaction(InternalHelpers.createMutableData(latestState));
        } catch (Throwable th) {
            this.operationLogger.error("Caught Throwable.", th);
            fromException = DatabaseError.fromException(th);
            abort = Transaction.abort();
        }
        if (abort == null) {
            throw new NullPointerException("Transaction returned null as result");
        }
        fromException = null;
        if (!abort.isSuccess()) {
            transactionData.currentOutputSnapshotRaw = null;
            transactionData.currentOutputSnapshotResolved = null;
            final DataSnapshot createDataSnapshot = InternalHelpers.createDataSnapshot(createReference, IndexedNode.from(transactionData.currentInputSnapshot));
            postEvent(new Runnable() { // from class: com.google.firebase.database.core.Repo.16
                @Override // java.lang.Runnable
                public void run() {
                    handler.onComplete(fromException, false, createDataSnapshot);
                }
            });
            return;
        }
        transactionData.status = TransactionStatus.RUN;
        Tree<List<TransactionData>> subTree = this.transactionQueueTree.subTree(path);
        List<TransactionData> value = subTree.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        value.add(transactionData);
        subTree.setValue(value);
        Map<String, Object> generateServerValues = ServerValues.generateServerValues(this.serverClock);
        Node node = abort.getNode();
        Node resolveDeferredValueSnapshot = ServerValues.resolveDeferredValueSnapshot(node, transactionData.currentInputSnapshot, generateServerValues);
        transactionData.currentOutputSnapshotRaw = node;
        transactionData.currentOutputSnapshotResolved = resolveDeferredValueSnapshot;
        transactionData.currentWriteId = getNextWriteId();
        postEvents(this.serverSyncTree.applyUserOverwrite(path, node, resolveDeferredValueSnapshot, transactionData.currentWriteId, z, false));
        sendAllReadyTransactions();
    }

    public String toString() {
        return this.repoInfo.toString();
    }

    public void updateChildren(final Path path, CompoundWrite compoundWrite, final DatabaseReference.CompletionListener completionListener, Map<String, Object> map) {
        if (this.operationLogger.logsDebug()) {
            this.operationLogger.debug("update: " + path, new Object[0]);
        }
        if (this.dataLogger.logsDebug()) {
            this.dataLogger.debug("update: " + path + " " + map, new Object[0]);
        }
        if (compoundWrite.isEmpty()) {
            if (this.operationLogger.logsDebug()) {
                this.operationLogger.debug("update called with no changes. No-op", new Object[0]);
            }
            callOnComplete(completionListener, null, path);
            return;
        }
        CompoundWrite resolveDeferredValueMerge = ServerValues.resolveDeferredValueMerge(compoundWrite, this.serverSyncTree, path, ServerValues.generateServerValues(this.serverClock));
        final long nextWriteId = getNextWriteId();
        postEvents(this.serverSyncTree.applyUserMerge(path, compoundWrite, resolveDeferredValueMerge, nextWriteId, true));
        this.connection.merge(path.asList(), map, new RequestResultCallback() { // from class: com.google.firebase.database.core.Repo.10
            @Override // com.google.firebase.database.connection.RequestResultCallback
            public void onRequestResult(String str, String str2) {
                DatabaseError fromErrorCode = Repo.fromErrorCode(str, str2);
                Repo.this.warnIfWriteFailed("updateChildren", path, fromErrorCode);
                Repo.this.ackWriteAndRerunTransactions(nextWriteId, path, fromErrorCode);
                Repo.this.callOnComplete(completionListener, fromErrorCode, path);
            }
        });
        Iterator<Map.Entry<Path, Node>> it = compoundWrite.iterator();
        while (it.hasNext()) {
            rerunTransactions(abortTransactions(path.child(it.next().getKey()), -9));
        }
    }

    private Node getLatestState(Path path, List<Long> list) {
        Node calcCompleteEventCache = this.serverSyncTree.calcCompleteEventCache(path, list);
        return calcCompleteEventCache == null ? EmptyNode.Empty() : calcCompleteEventCache;
    }

    public void keepSynced(QuerySpec querySpec, boolean z, boolean z2) {
        Utilities.hardAssert(querySpec.getPath().isEmpty() || !querySpec.getPath().getFront().equals(Constants.DOT_INFO));
        this.serverSyncTree.keepSynced(querySpec, z, z2);
    }

    @Override // com.google.firebase.database.connection.PersistentConnection.Delegate
    public void onServerInfoUpdate(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            updateInfo(ChildKey.fromString(entry.getKey()), entry.getValue());
        }
    }
}
