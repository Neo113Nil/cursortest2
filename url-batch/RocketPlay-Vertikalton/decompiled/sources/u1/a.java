package u1;

import E1.AbstractC0001b;
import a1.AbstractC0067d;
import b1.AbstractC0094c;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import q1.AbstractC0349o;
import q1.AbstractC0352s;
import q1.C0344j;
import q1.C0345k;
import q1.C0350p;
import q1.D;
import q1.M;
import q1.U;
import q1.b0;
import q1.c0;
import q1.e0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f4174a = new U.q("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final U.q f4175b = new U.q("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final U.q f4176c = new U.q("REUSABLE_CLAIMED", 1);
    public static final U.q d = new U.q("CONDITION_FALSE", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final U.q f4177e = new U.q("NO_THREAD_ELEMENTS", 1);

    public static final void a(Z0.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f4180a.iterator();
        while (it.hasNext()) {
            try {
                ((r1.b) it.next()).D(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    F1.d.k(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            F1.d.k(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void b(Z0.i iVar, Object obj) {
        if (obj == f4177e) {
            return;
        }
        if (!(obj instanceof u)) {
            Object q2 = iVar.q(null, s.d);
            i1.f.c(q2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0001b.i(q2);
            throw null;
        }
        u uVar = (u) obj;
        b0[] b0VarArr = uVar.f4209b;
        int length = b0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        b0 b0Var = b0VarArr[length];
        i1.f.b(null);
        Object obj2 = uVar.f4208a[length];
        throw null;
    }

    public static final void c(Z0.d dVar, Object obj, h1.l lVar) {
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable a2 = V0.f.a(obj);
        Object c0345k = a2 == null ? lVar != null ? new C0345k(obj, lVar) : obj : new C0344j(a2, false);
        AbstractC0094c abstractC0094c = fVar.f4182e;
        abstractC0094c.getContext();
        AbstractC0349o abstractC0349o = fVar.d;
        if (abstractC0349o.E()) {
            fVar.f4183f = c0345k;
            fVar.f3923c = 1;
            abstractC0349o.D(abstractC0094c.getContext(), fVar);
            return;
        }
        D a3 = c0.a();
        if (a3.f3863c >= 4294967296L) {
            fVar.f4183f = c0345k;
            fVar.f3923c = 1;
            W0.h hVar = a3.f3864e;
            if (hVar == null) {
                hVar = new W0.h();
                a3.f3864e = hVar;
            }
            hVar.addLast(fVar);
            return;
        }
        a3.H(true);
        try {
            M m2 = (M) abstractC0094c.getContext().f(C0350p.f3913b);
            if (m2 == null || m2.a()) {
                Object obj2 = fVar.f4184g;
                Z0.i context = abstractC0094c.getContext();
                Object g2 = g(context, obj2);
                e0 k2 = g2 != f4177e ? AbstractC0352s.k(abstractC0094c, context, g2) : null;
                try {
                    abstractC0094c.resumeWith(obj);
                } finally {
                    if (k2 == null || k2.H()) {
                        b(context, g2);
                    }
                }
            } else {
                CancellationException r2 = ((U) m2).r();
                fVar.a(c0345k, r2);
                fVar.resumeWith(F1.l.t(r2));
            }
            while (a3.I()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long e(String str, long j2, long j3, long j4) {
        String str2;
        int i;
        Long valueOf;
        long j5;
        int i2 = r.f4203a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        AbstractC0067d.a(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if (i1.f.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i = 0;
                        i3 = 1;
                        long j7 = 0;
                        long j8 = -256204778801521550L;
                        while (i3 < length) {
                            int digit = Character.digit((int) str2.charAt(i3), 10);
                            if (digit >= 0) {
                                if (j7 < j8) {
                                    if (j8 == -256204778801521550L) {
                                        j8 = j6 / 10;
                                        if (j7 < j8) {
                                        }
                                    }
                                }
                                long j9 = j7 * 10;
                                long j10 = digit;
                                if (j9 >= j6 + j10) {
                                    j7 = j9 - j10;
                                    i3++;
                                }
                            }
                        }
                        valueOf = i == 0 ? Long.valueOf(j7) : Long.valueOf(-j7);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue) {
                            j5 = j4;
                            if (longValue <= j5) {
                                return longValue;
                            }
                        } else {
                            j5 = j4;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j5 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            }
            i = i3;
            long j72 = 0;
            long j82 = -256204778801521550L;
            while (i3 < length) {
            }
            valueOf = i == 0 ? Long.valueOf(j72) : Long.valueOf(-j72);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int f(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) e(str, i, i2, i3);
    }

    public static final Object g(Z0.i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.q(0, s.f4204c);
            i1.f.b(obj);
        }
        if (obj == 0) {
            return f4177e;
        }
        if (obj instanceof Integer) {
            return iVar.q(new u(iVar, ((Number) obj).intValue()), s.f4205e);
        }
        AbstractC0001b.i(obj);
        throw null;
    }
}
