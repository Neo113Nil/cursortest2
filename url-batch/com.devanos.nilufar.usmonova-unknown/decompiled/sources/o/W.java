package o;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class W implements InterfaceFutureC2139wA {
    static final M ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile Q listeners;
    volatile Object value;
    volatile V waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(W.class.getName());

    static {
        M u;
        try {
            u = new S(AtomicReferenceFieldUpdater.newUpdater(V.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(V.class, V.class, "b"), AtomicReferenceFieldUpdater.newUpdater(W.class, V.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(W.class, Q.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            u = new U();
        }
        ATOMIC_HELPER = u;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof N) {
            Throwable th = ((N) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof P) {
            throw new ExecutionException(((P) obj).a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void complete(W w) {
        Q q;
        Q q2;
        Q q3 = null;
        while (true) {
            V v = w.waiters;
            if (ATOMIC_HELPER.c(w, v, V.c)) {
                while (v != null) {
                    Thread thread = v.a;
                    if (thread != null) {
                        v.a = null;
                        LockSupport.unpark(thread);
                    }
                    v = v.b;
                }
                w.afterDone();
                do {
                    q = w.listeners;
                } while (!ATOMIC_HELPER.a(w, q, Q.d));
                while (true) {
                    q2 = q3;
                    q3 = q;
                    if (q3 == null) {
                        break;
                    }
                    q = q3.c;
                    q3.c = q2;
                }
                while (q2 != null) {
                    q3 = q2.c;
                    Runnable runnable = q2.a;
                    if (runnable instanceof T) {
                        T t = (T) runnable;
                        w = t.h;
                        if (w.value == t) {
                            if (ATOMIC_HELPER.b(w, t, getFutureValue(t.i))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, q2.b);
                    }
                    q2 = q3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(InterfaceFutureC2139wA interfaceFutureC2139wA) {
        if (interfaceFutureC2139wA instanceof W) {
            Object obj = ((W) interfaceFutureC2139wA).value;
            if (!(obj instanceof N)) {
                return obj;
            }
            N n = (N) obj;
            return n.a ? n.b != null ? new N(n.b, false) : N.d : obj;
        }
        boolean isCancelled = interfaceFutureC2139wA.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            return N.d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(interfaceFutureC2139wA);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new N(e, false);
            }
            return new P(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC2139wA, e));
        } catch (ExecutionException e2) {
            return new P(e2.getCause());
        } catch (Throwable th) {
            return new P(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public final void a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // o.InterfaceFutureC2139wA
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        Q q = this.listeners;
        Q q2 = Q.d;
        if (q != q2) {
            Q q3 = new Q(runnable, executor);
            do {
                q3.c = q;
                if (ATOMIC_HELPER.a(this, q, q3)) {
                    return;
                } else {
                    q = this.listeners;
                }
            } while (q != q2);
        }
        b(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof T)) {
            return false;
        }
        N n = GENERATE_CANCELLATION_CAUSES ? new N(new CancellationException("Future.cancel() was called."), z) : z ? N.c : N.d;
        W w = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.b(w, obj, n)) {
                if (z) {
                    w.interruptTask();
                }
                complete(w);
                if (!(obj instanceof T)) {
                    break;
                }
                InterfaceFutureC2139wA interfaceFutureC2139wA = ((T) obj).i;
                if (!(interfaceFutureC2139wA instanceof W)) {
                    interfaceFutureC2139wA.cancel(z);
                    break;
                }
                w = (W) interfaceFutureC2139wA;
                obj = w.value;
                if (!(obj == null) && !(obj instanceof T)) {
                    break;
                }
                z2 = true;
            } else {
                obj = w.value;
                if (!(obj instanceof T)) {
                    return z2;
                }
            }
        }
    }

    public final void d(V v) {
        v.a = null;
        while (true) {
            V v2 = this.waiters;
            if (v2 == V.c) {
                return;
            }
            V v3 = null;
            while (v2 != null) {
                V v4 = v2.b;
                if (v2.a != null) {
                    v3 = v2;
                } else if (v3 != null) {
                    v3.b = v4;
                    if (v3.a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, v2, v4)) {
                    break;
                }
                v2 = v4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        V v = V.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof T))) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            V v2 = this.waiters;
            if (v2 != v) {
                V v3 = new V();
                z = true;
                do {
                    M m = ATOMIC_HELPER;
                    m.d(v3, v2);
                    if (m.c(this, v2, v3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                d(v3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof T))) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        d(v3);
                    } else {
                        v2 = this.waiters;
                    }
                } while (v2 != v);
            }
            return c(this.value);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof T))) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String w = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String j2 = AbstractC1888sN.j(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = (convert == 0 || nanos2 > SPIN_THRESHOLD_NANOS) ? z : false;
            if (convert > 0) {
                String str2 = j2 + convert + " " + lowerCase;
                if (z2) {
                    str2 = AbstractC1888sN.j(str2, ",");
                }
                j2 = AbstractC1888sN.j(str2, " ");
            }
            if (z2) {
                j2 = j2 + nanos2 + " nanoseconds ";
            }
            str = AbstractC1888sN.j(j2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC1888sN.j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + w);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof N;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof T)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof T) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC2139wA interfaceFutureC2139wA = ((T) obj).i;
            return AbstractC1888sN.l(sb, interfaceFutureC2139wA == this ? "this future" : String.valueOf(interfaceFutureC2139wA), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new P((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(InterfaceFutureC2139wA interfaceFutureC2139wA) {
        P p;
        checkNotNull(interfaceFutureC2139wA);
        Object obj = this.value;
        if (obj == null) {
            if (interfaceFutureC2139wA.isDone()) {
                if (ATOMIC_HELPER.b(this, null, getFutureValue(interfaceFutureC2139wA))) {
                    complete(this);
                    return true;
                }
                return false;
            }
            T t = new T(this, interfaceFutureC2139wA);
            if (ATOMIC_HELPER.b(this, null, t)) {
                try {
                    interfaceFutureC2139wA.addListener(t, EnumC2305yi.h);
                    return true;
                } catch (Throwable th) {
                    try {
                        p = new P(th);
                    } catch (Throwable unused) {
                        p = P.b;
                    }
                    ATOMIC_HELPER.b(this, t, p);
                    return true;
                }
            }
            obj = this.value;
        }
        if (obj instanceof N) {
            interfaceFutureC2139wA.cancel(((N) obj).a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof N) && ((N) obj).a;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        V v = V.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof T))) {
                return c(obj2);
            }
            V v2 = this.waiters;
            if (v2 != v) {
                V v3 = new V();
                do {
                    M m = ATOMIC_HELPER;
                    m.d(v3, v2);
                    if (m.c(this, v2, v3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                d(v3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof T))));
                        return c(obj);
                    }
                    v2 = this.waiters;
                } while (v2 != v);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
