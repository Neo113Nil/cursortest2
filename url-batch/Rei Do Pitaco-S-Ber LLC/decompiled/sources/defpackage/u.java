package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class u implements Future {
    public static final boolean i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger j = Logger.getLogger(u.class.getName());
    public static final g8 k;
    public static final Object l;
    public volatile Object f;
    public volatile q g;
    public volatile t h;

    static {
        g8 sVar;
        try {
            sVar = new r(AtomicReferenceFieldUpdater.newUpdater(t.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t.class, t.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u.class, t.class, "h"), AtomicReferenceFieldUpdater.newUpdater(u.class, q.class, "g"), AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "f"));
            th = null;
        } catch (Throwable th) {
            th = th;
            sVar = new s();
        }
        k = sVar;
        if (th != null) {
            j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        l = new Object();
    }

    public static void b(u uVar) {
        t tVar;
        q qVar;
        do {
            tVar = uVar.h;
        } while (!k.l(uVar, tVar, t.c));
        while (tVar != null) {
            Thread thread = tVar.a;
            if (thread != null) {
                tVar.a = null;
                LockSupport.unpark(thread);
            }
            tVar = tVar.b;
        }
        do {
            qVar = uVar.g;
        } while (!k.j(uVar, qVar));
        q qVar2 = null;
        while (qVar != null) {
            q qVar3 = qVar.a;
            qVar.a = qVar2;
            qVar2 = qVar;
            qVar = qVar3;
        }
        while (qVar2 != null) {
            qVar2 = qVar2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof o) {
            Throwable th = ((o) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == l) {
            return null;
        }
        return obj;
    }

    public static Object d(u uVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = uVar.get();
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
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d == this ? "this future" : String.valueOf(d));
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f;
        if (obj != null) {
            return false;
        }
        if (!k.k(this, obj, i ? new o(z, new CancellationException("Future.cancel() was called.")) : z ? o.b : o.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(t tVar) {
        tVar.a = null;
        while (true) {
            t tVar2 = this.h;
            if (tVar2 == t.c) {
                return;
            }
            t tVar3 = null;
            while (tVar2 != null) {
                t tVar4 = tVar2.b;
                if (tVar2.a != null) {
                    tVar3 = tVar2;
                } else if (tVar3 != null) {
                    tVar3.b = tVar4;
                    if (tVar3.a == null) {
                        break;
                    }
                } else if (!k.l(this, tVar2, tVar4)) {
                    break;
                }
                tVar2 = tVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        t tVar = t.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t tVar2 = this.h;
            if (tVar2 != tVar) {
                t tVar3 = new t();
                do {
                    g8 g8Var = k;
                    g8Var.a0(tVar3, tVar2);
                    if (g8Var.l(this, tVar2, tVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(tVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(tVar3);
                    } else {
                        tVar2 = this.h;
                    }
                } while (tVar2 != tVar);
            }
            return c(this.f);
        }
        while (nanos > 0) {
            Object obj3 = this.f;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String uVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + uVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f instanceof o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof o) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        t tVar = t.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f;
            if (obj2 != null) {
                return c(obj2);
            }
            t tVar2 = this.h;
            if (tVar2 != tVar) {
                t tVar3 = new t();
                do {
                    g8 g8Var = k;
                    g8Var.a0(tVar3, tVar2);
                    if (g8Var.l(this, tVar2, tVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f;
                            } else {
                                e(tVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    tVar2 = this.h;
                } while (tVar2 != tVar);
            }
            return c(this.f);
        }
        throw new InterruptedException();
    }
}
