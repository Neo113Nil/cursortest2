package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class t {
    public static final s Companion = new s();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AbstractC0078a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private j0.b internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<Object> mCallbacks;
    protected volatile j0.a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final o invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public t() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        g1.f.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(t tVar, j0.d dVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return tVar.query(dVar, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        j0.a a2 = ((k0.h) getOpenHelper()).a();
        getInvalidationTracker().c(a2);
        if (a2.k()) {
            a2.b();
        } else {
            a2.d();
        }
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void b() {
        ((k0.h) getOpenHelper()).a().c();
        if (inTransaction()) {
            return;
        }
        o invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f1695e.compareAndSet(false, true)) {
            invalidationTracker.f1692a.getQueryExecutor().execute(invalidationTracker.f1700l);
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            g1.f.d(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                ((k0.h) getOpenHelper()).close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public j0.e compileStatement(String str) {
        g1.f.e(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((k0.h) getOpenHelper()).a().y(str);
    }

    public abstract o createInvalidationTracker();

    public abstract j0.b createOpenHelper(g gVar);

    public void endTransaction() {
        b();
    }

    public final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        g1.f.e(map, "autoMigrationSpecs");
        return V0.m.f875a;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        g1.f.d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public j0.b getOpenHelper() {
        j0.b bVar = this.internalOpenHelper;
        if (bVar != null) {
            return bVar;
        }
        g1.f.g("internalOpenHelper");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        g1.f.g("internalQueryExecutor");
        throw null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return V0.o.f877a;
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return V0.n.f876a;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        g1.f.g("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        g1.f.e(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return ((k0.h) getOpenHelper()).a().u();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015d A[LOOP:4: B:50:0x012e->B:62:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(g gVar) {
        g1.f.e(gVar, "configuration");
        this.internalOpenHelper = createOpenHelper(gVar);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = gVar.f1684k;
            int i = -1;
            if (hasNext) {
                Class<Object> next = it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, arrayList.get(i));
            } else {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                Iterator<Object> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                j0.b openHelper = getOpenHelper();
                if (!x.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                if (openHelper != null) {
                    throw new ClassCastException();
                }
                j0.b openHelper2 = getOpenHelper();
                if ((b.class.isInstance(openHelper2) ? openHelper2 : null) != null) {
                    throw new ClassCastException();
                }
                boolean z2 = gVar.d == 3;
                k0.h hVar = (k0.h) getOpenHelper();
                if (hVar.d.f867b != U0.h.f869a) {
                    k0.g gVar2 = (k0.g) hVar.d.a();
                    g1.f.e(gVar2, "sQLiteOpenHelper");
                    gVar2.setWriteAheadLoggingEnabled(z2);
                }
                hVar.f2844e = z2;
                this.mCallbacks = gVar.f1679c;
                this.internalQueryExecutor = gVar.f1680e;
                this.internalTransactionExecutor = new A(gVar.f1681f);
                this.allowMainThreadQueries = false;
                this.writeAheadLoggingEnabled = z2;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    ArrayList arrayList2 = gVar.f1683j;
                    if (hasNext2) {
                        Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                        Class<?> key = next2.getKey();
                        for (Class<?> cls : next2.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i4 = size3 - 1;
                                    if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                        bitSet2.set(size3);
                                        break;
                                    } else if (i4 < 0) {
                                        break;
                                    } else {
                                        size3 = i4;
                                    }
                                }
                                if (size3 >= 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                this.typeConverters.put(cls, arrayList2.get(size3));
                            }
                            size3 = -1;
                            if (size3 >= 0) {
                            }
                        }
                    } else {
                        int size4 = arrayList2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i5 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i5 < 0) {
                                return;
                            } else {
                                size4 = i5;
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(j0.a aVar) {
        g1.f.e(aVar, "db");
        o invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f1699k) {
            if (invalidationTracker.f1696f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            aVar.l("PRAGMA temp_store = MEMORY;");
            aVar.l("PRAGMA recursive_triggers='ON';");
            aVar.l("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.c(aVar);
            invalidationTracker.f1697g = aVar.y("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f1696f = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        j0.a aVar = this.mDatabase;
        return g1.f.a(aVar != null ? Boolean.valueOf(aVar.i()) : null, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        j0.a aVar = this.mDatabase;
        return aVar != null && aVar.i();
    }

    public final Cursor query(j0.d dVar) {
        g1.f.e(dVar, "query");
        return query$default(this, dVar, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        g1.f.e(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        g1.f.e(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        ((k0.h) getOpenHelper()).a().s();
    }

    public Cursor query(String str, Object[] objArr) {
        g1.f.e(str, "query");
        return ((k0.h) getOpenHelper()).a().r(new B.j(str, objArr));
    }

    public Cursor query(j0.d dVar, CancellationSignal cancellationSignal) {
        g1.f.e(dVar, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((k0.h) getOpenHelper()).a().x(dVar, cancellationSignal);
        }
        return ((k0.h) getOpenHelper()).a().r(dVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        g1.f.e(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
