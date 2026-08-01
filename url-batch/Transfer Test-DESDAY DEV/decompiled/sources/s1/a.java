package s1;

import Y.V;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import o1.AbstractC0299p;
import o1.AbstractC0302t;
import o1.C0294k;
import o1.C0295l;
import o1.C0300q;
import o1.G;
import o1.O;
import o1.W;
import o1.d0;
import o1.e0;
import o1.g0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f3687a = new U.q("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final U.q f3688b = new U.q("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final U.q f3689c = new U.q("REUSABLE_CLAIMED", 1);
    public static final U.q d = new U.q("CONDITION_FALSE", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final U.q f3690e = new U.q("NO_THREAD_ELEMENTS", 1);

    public static final void a(X0.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f3693a.iterator();
        while (it.hasNext()) {
            try {
                ((p1.b) it.next()).z(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    T.e.g(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            T.e.g(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void b(X0.i iVar, Object obj) {
        if (obj == f3690e) {
            return;
        }
        if (!(obj instanceof u)) {
            g1.f.c(iVar.t(null, s.d), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            throw new ClassCastException();
        }
        u uVar = (u) obj;
        d0[] d0VarArr = uVar.f3723b;
        int length = d0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        d0 d0Var = d0VarArr[length];
        g1.f.b(null);
        Object obj2 = uVar.f3722a[length];
        throw null;
    }

    public static final void c(X0.d dVar, Object obj, f1.l lVar) {
        if (!(dVar instanceof f)) {
            dVar.b(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable a2 = U0.f.a(obj);
        Object c0295l = a2 == null ? lVar != null ? new C0295l(obj, lVar) : obj : new C0294k(a2, false);
        AbstractC0299p abstractC0299p = fVar.d;
        Z0.c cVar = fVar.f3695e;
        cVar.h();
        boolean A2 = abstractC0299p.A();
        X0.i iVar = cVar.f1176b;
        if (A2) {
            fVar.f3696f = c0295l;
            fVar.f3344c = 1;
            g1.f.b(iVar);
            fVar.d.z(iVar, fVar);
            return;
        }
        G a3 = e0.a();
        if (a3.f3283c >= 4294967296L) {
            fVar.f3696f = c0295l;
            fVar.f3344c = 1;
            V0.c cVar2 = a3.f3284e;
            if (cVar2 == null) {
                cVar2 = new V0.c();
                a3.f3284e = cVar2;
            }
            cVar2.addLast(fVar);
            return;
        }
        a3.D(true);
        try {
            g1.f.b(iVar);
            O o2 = (O) iVar.j(C0300q.f3334b);
            if (o2 == null || o2.a()) {
                Object obj2 = fVar.f3697g;
                g1.f.b(iVar);
                Object g2 = g(iVar, obj2);
                g0 m2 = g2 != f3690e ? AbstractC0302t.m(cVar, iVar, g2) : null;
                try {
                    cVar.b(obj);
                } finally {
                    if (m2 == null || m2.J()) {
                        b(iVar, g2);
                    }
                }
            } else {
                CancellationException s2 = ((W) o2).s();
                fVar.a(c0295l, s2);
                fVar.b(T.e.s(s2));
            }
            while (a3.E()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(String str, long j2, long j3, long j4) {
        String str2;
        int i;
        String str3;
        Long valueOf;
        int i2;
        int i3 = r.f3716a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        int length = str2.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if ((charAt < '0' ? (char) 65535 : charAt == '0' ? (char) 0 : (char) 1) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i = 0;
                        i4 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i4 < length) {
                            int digit = Character.digit((int) str2.charAt(i4), 10);
                            if (digit >= 0) {
                                if (j6 >= j7) {
                                    str3 = str2;
                                    i2 = length;
                                } else if (j7 == -256204778801521550L) {
                                    str3 = str2;
                                    i2 = length;
                                    j7 = j5 / 10;
                                    if (j6 < j7) {
                                        valueOf = null;
                                        break;
                                    }
                                }
                                long j8 = j6 * 10;
                                long j9 = digit;
                                if (j8 < j5 + j9) {
                                    valueOf = null;
                                    break;
                                }
                                j6 = j8 - j9;
                                i4++;
                                length = i2;
                                str2 = str3;
                            }
                        }
                        str3 = str2;
                        if (i == 0) {
                            j6 = -j6;
                        }
                        valueOf = Long.valueOf(j6);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue && longValue <= j4) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
            }
            i = i4;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i4 < length) {
            }
            str3 = str2;
            if (i == 0) {
            }
            valueOf = Long.valueOf(j62);
            if (valueOf == null) {
            }
        }
        str3 = str2;
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int e(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) d(str, i, i2, i3);
    }

    public static final Object f(X0.i iVar) {
        Object t2 = iVar.t(0, s.f3717c);
        g1.f.b(t2);
        return t2;
    }

    public static final Object g(X0.i iVar, Object obj) {
        if (obj == null) {
            obj = f(iVar);
        }
        if (obj == 0) {
            return f3690e;
        }
        if (obj instanceof Integer) {
            return iVar.t(new u(iVar, ((Number) obj).intValue()), s.f3718e);
        }
        V.g(obj);
        throw null;
    }
}
