package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import j0.InterfaceC0178a;
import j0.InterfaceC0179b;
import j0.InterfaceC0181d;
import j0.InterfaceC0182e;
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
    private AbstractC0086a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private InterfaceC0179b internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<Object> mCallbacks;
    protected volatile InterfaceC0178a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final o invalidationTracker = createInvalidationTracker();
    private Map<Class<Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public t() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        i1.f.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
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

    public static /* synthetic */ Cursor query$default(t tVar, InterfaceC0181d interfaceC0181d, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return tVar.query(interfaceC0181d, cancellationSignal);
    }

    public final void a() {
        assertNotMainThread();
        InterfaceC0178a a2 = ((k0.h) getOpenHelper()).a();
        getInvalidationTracker().c(a2);
        if (a2.n()) {
            a2.c();
        } else {
            a2.e();
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
        ((k0.h) getOpenHelper()).a().d();
        if (inTransaction()) {
            return;
        }
        o invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f2073e.compareAndSet(false, true)) {
            invalidationTracker.f2070a.getQueryExecutor().execute(invalidationTracker.f2078l);
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
            i1.f.d(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                ((k0.h) getOpenHelper()).close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public InterfaceC0182e compileStatement(String str) {
        i1.f.e(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((k0.h) getOpenHelper()).a().C(str);
    }

    public abstract o createInvalidationTracker();

    public abstract InterfaceC0179b createOpenHelper(g gVar);

    public void endTransaction() {
        b();
    }

    public final Map<Class<Object>, Object> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<Object> getAutoMigrations(Map<Class<Object>, Object> map) {
        i1.f.e(map, "autoMigrationSpecs");
        return W0.s.f1284a;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        i1.f.d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public InterfaceC0179b getOpenHelper() {
        InterfaceC0179b interfaceC0179b = this.internalOpenHelper;
        if (interfaceC0179b != null) {
            return interfaceC0179b;
        }
        i1.f.h("internalOpenHelper");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        i1.f.h("internalQueryExecutor");
        throw null;
    }

    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return W0.u.f1286a;
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return W0.t.f1285a;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        i1.f.h("internalTransactionExecutor");
        throw null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        i1.f.e(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return ((k0.h) getOpenHelper()).a().x();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015d A[LOOP:4: B:50:0x012e->B:62:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(g gVar) {
        i1.f.e(gVar, "configuration");
        this.internalOpenHelper = createOpenHelper(gVar);
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = gVar.f2062j;
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
                InterfaceC0179b openHelper = getOpenHelper();
                if (!x.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                if (openHelper != null) {
                    throw new ClassCastException();
                }
                InterfaceC0179b openHelper2 = getOpenHelper();
                if ((b.class.isInstance(openHelper2) ? openHelper2 : null) != null) {
                    throw new ClassCastException();
                }
                boolean z2 = gVar.d == 3;
                k0.h hVar = (k0.h) getOpenHelper();
                if (hVar.d.f1247b != V0.h.f1249a) {
                    k0.g gVar2 = (k0.g) hVar.d.a();
                    i1.f.e(gVar2, "sQLiteOpenHelper");
                    gVar2.setWriteAheadLoggingEnabled(z2);
                }
                hVar.f3275e = z2;
                this.mCallbacks = gVar.f2058c;
                this.internalQueryExecutor = gVar.f2059e;
                this.internalTransactionExecutor = new A(gVar.f2060f);
                this.allowMainThreadQueries = false;
                this.writeAheadLoggingEnabled = z2;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    ArrayList arrayList2 = gVar.i;
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

    public void internalInitInvalidationTracker(InterfaceC0178a interfaceC0178a) {
        i1.f.e(interfaceC0178a, "db");
        o invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f2077k) {
            if (invalidationTracker.f2074f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC0178a.p("PRAGMA temp_store = MEMORY;");
            interfaceC0178a.p("PRAGMA recursive_triggers='ON';");
            interfaceC0178a.p("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.c(interfaceC0178a);
            invalidationTracker.f2075g = interfaceC0178a.C("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f2074f = true;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        InterfaceC0178a interfaceC0178a = this.mDatabase;
        return i1.f.a(interfaceC0178a != null ? Boolean.valueOf(interfaceC0178a.isOpen()) : null, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        InterfaceC0178a interfaceC0178a = this.mDatabase;
        return interfaceC0178a != null && interfaceC0178a.isOpen();
    }

    public final Cursor query(InterfaceC0181d interfaceC0181d) {
        i1.f.e(interfaceC0181d, "query");
        return query$default(this, interfaceC0181d, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        i1.f.e(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map<Class<Object>, Object> map) {
        i1.f.e(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        ((k0.h) getOpenHelper()).a().w();
    }

    public Cursor query(String str, Object[] objArr) {
        i1.f.e(str, "query");
        return ((k0.h) getOpenHelper()).a().v(new B.j(str, objArr));
    }

    public Cursor query(InterfaceC0181d interfaceC0181d, CancellationSignal cancellationSignal) {
        i1.f.e(interfaceC0181d, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((k0.h) getOpenHelper()).a().B(interfaceC0181d, cancellationSignal);
        }
        return ((k0.h) getOpenHelper()).a().v(interfaceC0181d);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        i1.f.e(callable, "body");
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
