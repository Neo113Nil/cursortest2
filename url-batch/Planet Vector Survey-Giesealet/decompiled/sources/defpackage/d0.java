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

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class d0 implements Future {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(d0.class.getName());
    public static final px0 i;
    public static final Object j;
    public volatile Object d;
    public volatile z e;
    public volatile c0 f;

    static {
        px0 b0Var;
        try {
            b0Var = new a0(AtomicReferenceFieldUpdater.newUpdater(c0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(c0.class, c0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(d0.class, c0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(d0.class, z.class, "e"), AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            b0Var = new b0();
        }
        i = b0Var;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static void b(d0 d0Var) {
        c0 c0Var;
        z zVar;
        do {
            c0Var = d0Var.f;
        } while (!i.o(d0Var, c0Var, c0.c));
        while (c0Var != null) {
            Thread thread = c0Var.a;
            if (thread != null) {
                c0Var.a = null;
                LockSupport.unpark(thread);
            }
            c0Var = c0Var.b;
        }
        do {
            zVar = d0Var.e;
        } while (!i.m(d0Var, zVar));
        z zVar2 = null;
        while (zVar != null) {
            z zVar3 = zVar.a;
            zVar.a = zVar2;
            zVar2 = zVar;
            zVar = zVar3;
        }
        while (zVar2 != null) {
            zVar2 = zVar2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof x) {
            Throwable th = ((x) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof y) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    public static Object d(d0 d0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = d0Var.get();
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
        Object obj = this.d;
        if (obj != null) {
            return false;
        }
        if (!i.n(this, obj, g ? new x(new CancellationException("Future.cancel() was called."), z) : z ? x.b : x.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(c0 c0Var) {
        c0Var.a = null;
        while (true) {
            c0 c0Var2 = this.f;
            if (c0Var2 == c0.c) {
                return;
            }
            c0 c0Var3 = null;
            while (c0Var2 != null) {
                c0 c0Var4 = c0Var2.b;
                if (c0Var2.a != null) {
                    c0Var3 = c0Var2;
                } else if (c0Var3 != null) {
                    c0Var3.b = c0Var4;
                    if (c0Var3.a == null) {
                        break;
                    }
                } else if (!i.o(this, c0Var2, c0Var4)) {
                    break;
                }
                c0Var2 = c0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        c0 c0Var = c0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            c0 c0Var2 = this.f;
            if (c0Var2 != c0Var) {
                c0 c0Var3 = new c0();
                do {
                    px0 px0Var = i;
                    px0Var.O(c0Var3, c0Var2);
                    if (px0Var.o(this, c0Var2, c0Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            long nanoTime2 = nanoTime - System.nanoTime();
                            if (nanoTime2 < 1000) {
                                e(c0Var3);
                                nanos = nanoTime2;
                                break;
                            }
                            nanos = nanoTime2;
                        }
                    } else {
                        c0Var2 = this.f;
                    }
                } while (c0Var2 != c0Var);
            }
            return c(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String d0Var = toString();
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
        throw new TimeoutException(str + " for " + d0Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof x;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof x) {
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
        c0 c0Var = c0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if (obj2 != null) {
                return c(obj2);
            }
            c0 c0Var2 = this.f;
            if (c0Var2 != c0Var) {
                c0 c0Var3 = new c0();
                do {
                    px0 px0Var = i;
                    px0Var.O(c0Var3, c0Var2);
                    if (px0Var.o(this, c0Var2, c0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                e(c0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0Var2 = this.f;
                } while (c0Var2 != c0Var);
            }
            return c(this.d);
        }
        throw new InterruptedException();
    }
}
