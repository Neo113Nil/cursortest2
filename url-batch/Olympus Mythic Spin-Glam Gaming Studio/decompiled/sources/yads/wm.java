package yads;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public abstract class wm implements hd2, iu, bo {
    public final Context a;
    public final i5 b;
    public final v3 c;
    public final yu2 d;
    public final CoroutineScope e;
    public final r7 f;
    public final na g;
    public final fy2 h;
    public final xf1 i;
    public final pv2 j;
    public final uz0 k;
    public final zg2 l;
    public final y43 m;
    public final up2 n;
    public final id2 o;
    public final h4 p;
    public final e4 q;
    public l5 r;
    public boolean s;
    public long t;
    public CoroutineScope u;
    public el v;
    public t8 w;
    public final km x;

    public wm(Context context, i5 i5Var, v3 v3Var, yu2 yu2Var, CoroutineScope coroutineScope, e4 e4Var) {
        r7 r7Var = new r7(context, v3Var, yu2Var);
        na naVar = new na();
        fy2 fy2Var = new fy2();
        xf1 xf1Var = new xf1(context, v3Var);
        pv2 pv2Var = new pv2(context, yu2Var, coroutineScope, i5Var, null, null, 4194288);
        uz0 uz0Var = new uz0(v3Var, yu2Var);
        zg2 zg2Var = new zg2(v3Var, yu2Var);
        if (y43.b == null) {
            synchronized (y43.c) {
                try {
                    if (y43.b == null) {
                        y43.b = new y43();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y43 y43Var = y43.b;
        if (y43Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        up2 up2Var = new up2();
        id2 a = id2.h.a(context);
        h4 h4Var = new h4(context);
        this.a = context;
        this.b = i5Var;
        this.c = v3Var;
        this.d = yu2Var;
        this.e = coroutineScope;
        this.f = r7Var;
        this.g = naVar;
        this.h = fy2Var;
        this.i = xf1Var;
        this.j = pv2Var;
        this.k = uz0Var;
        this.l = zg2Var;
        this.m = y43Var;
        this.n = up2Var;
        this.o = a;
        this.p = h4Var;
        this.q = e4Var;
        this.r = l5.c;
        this.x = new km(i5Var, v3Var, yu2Var, r7Var);
    }

    public final void a(l03 l03Var) {
        m03 m03Var = this.c.d;
        if (l03Var == null) {
            m03Var.getClass();
            ab1.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        l03 l03Var2 = m03Var.a;
        if (l03Var2 == null || Intrinsics.areEqual(l03Var2, l03Var)) {
            m03Var.a = l03Var;
        } else {
            ab1.c("Ad size can't be set twice.", new Object[0]);
        }
    }

    public void b(d4 d4Var) {
        String str;
        ab1.c(d4Var.c, new Object[0]);
        a(l5.f);
        go2 go2Var = go2.d;
        er1 er1Var = this.c.k;
        if (er1Var == null || (str = er1Var.b) == null) {
            str = do2.a;
        }
        this.b.a(h5.c, new va(go2Var, str), null);
        this.b.a(h5.e);
        this.m.a(cd1.b, this);
        CoroutineScope coroutineScope = this.u;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.u = null;
        a(d4Var);
    }

    public final synchronized void c(d8 d8Var) {
        try {
            a(l5.d);
            this.c.e = d8Var;
            d4 j = j();
            if (j == null) {
                CoroutineScope coroutineScope = this.u;
                if (coroutineScope != null) {
                    CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                }
                Context context = ((nt3) this.d).a;
                mt1 a = pr.a(context, context);
                om omVar = new om(this);
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new cy(CollectionsKt.listOf((Object[]) new CoroutineExceptionHandler[]{new b20(a), new x10(CoroutineExceptionHandler.Key, omVar)}))));
                this.u = CoroutineScope;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new mm(this, null), 3, null);
            } else {
                b(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d() {
        e();
    }

    public synchronized void e() {
        boolean z = ob1.a;
        el elVar = this.v;
        if (elVar != null) {
            elVar.b();
        }
    }

    public final void f() {
        String str;
        go2 go2Var = go2.c;
        er1 er1Var = this.c.k;
        if (er1Var == null || (str = er1Var.b) == null) {
            str = do2.a;
        }
        this.b.a(h5.c, new va(go2Var, str), null);
        this.b.a(h5.e);
        this.m.a(cd1.b, this);
        a(l5.e);
        this.t = SystemClock.elapsedRealtime();
    }

    public void g() {
        i4.a(this.c.a.b);
        CoroutineScope coroutineScope = this.u;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.u = null;
        f();
        e();
    }

    public final void h() {
        getClass().toString();
        boolean z = ob1.a;
        this.o.a(this);
    }

    public final void i() {
        getClass().toString();
        boolean z = ob1.a;
        this.o.b(this);
    }

    public d4 j() {
        xf1 xf1Var = this.i;
        List plus = CollectionsKt.plus((Collection) xf1Var.a(), (Iterable) CollectionsKt.listOfNotNull(xf1Var.b.d.a == null ? e8.m : null));
        String str = xf1Var.b.a.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(((d4) it.next()).c);
        }
        i4.a(str, arrayList);
        return (d4) CollectionsKt.firstOrNull(plus);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ap apVar, ContinuationImpl continuationImpl) {
        pm pmVar;
        int i;
        i5 i5Var;
        h5 h5Var;
        if (continuationImpl instanceof pm) {
            pmVar = (pm) continuationImpl;
            int i2 = pmVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pmVar.f = i2 - Integer.MIN_VALUE;
                Object obj = pmVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pmVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i5 i5Var2 = this.b;
                    h5 h5Var2 = h5.g;
                    i5Var2.a(h5Var2, null);
                    sm smVar = new sm(this, apVar, null);
                    pmVar.b = i5Var2;
                    pmVar.c = h5Var2;
                    pmVar.f = 1;
                    if (CoroutineScopeKt.coroutineScope(smVar, pmVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i5Var = i5Var2;
                    h5Var = h5Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5Var = pmVar.c;
                    i5Var = pmVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                i5Var.a(h5Var);
                return unit;
            }
        }
        pmVar = new pm(this, continuationImpl);
        Object obj2 = pmVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pmVar.f;
        if (i != 0) {
        }
        Unit unit2 = Unit.INSTANCE;
        i5Var.a(h5Var);
        return unit2;
    }

    public synchronized void b(d8 d8Var) {
        try {
            Objects.toString(this.r);
            boolean z = ob1.a;
            if (this.r != l5.d) {
                if (a(d8Var)) {
                    this.b.a();
                    this.b.b(h5.e);
                    this.m.b(cd1.b, this);
                    c(d8Var);
                } else {
                    d();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() {
        b();
        getClass().toString();
        boolean z = ob1.a;
    }

    public synchronized void b() {
        try {
            if (!a()) {
                this.s = true;
                i();
                JobKt__JobKt.cancelChildren$default(this.j.c.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                h4 h4Var = this.p;
                zo2 zo2Var = h4Var.a;
                zo2.a(h4Var.b);
                this.m.a(cd1.b, this);
                this.w = null;
                this.f.a();
                CoroutineScopeKt.cancel$default(this.e, null, 1, null);
                CoroutineScope coroutineScope = this.u;
                if (coroutineScope != null) {
                    CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                }
                getClass().toString();
                boolean z = ob1.a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(db3 db3Var) {
        boolean z;
        synchronized (this) {
            z = this.s;
        }
        if (z) {
            return;
        }
        String a = db3Var.a(this.c);
        if (a != null && a.length() != 0) {
            this.b.a(h5.s, null);
            this.c.g = db3Var.a();
            v3 v3Var = this.c;
            up2 up2Var = this.n;
            Context context = this.a;
            up2Var.getClass();
            v3Var.n = context.getResources().getConfiguration().orientation;
            this.p.a(this.q.a(a, db3Var.a(this.a, this.c, this.h), this));
            return;
        }
        b(e8.j);
    }

    public final synchronized void a(l5 l5Var) {
        Objects.toString(l5Var);
        boolean z = ob1.a;
        this.r = l5Var;
    }

    @Override // yads.iu
    public final synchronized boolean a() {
        return this.s;
    }

    public synchronized boolean a(d8 d8Var) {
        boolean z;
        try {
            t8 t8Var = this.w;
            if (this.r != l5.f) {
                if (t8Var != null) {
                    if (this.t > 0) {
                        if (SystemClock.elapsedRealtime() - this.t <= t8Var.J) {
                            if (d8Var != null) {
                                if (Intrinsics.areEqual(d8Var, this.c.e)) {
                                }
                            }
                            z = pz.b(this.a).b != this.c.n;
                        }
                    }
                }
            }
        } finally {
        }
        return z;
    }

    @Override // yads.hd2
    public void a(dd2 dd2Var) {
        Objects.toString(dd2Var);
        boolean z = ob1.a;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        if (hm3Var instanceof z3) {
            b(g4.a(this.c, ((z3) hm3Var).c));
        }
    }

    public synchronized void a(d4 d4Var) {
        el elVar = this.v;
        if (elVar != null) {
            elVar.a(d4Var);
        }
    }
}
