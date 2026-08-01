package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p70 extends fu0 implements qu {
    public final /* synthetic */ int d = 1;
    public int e;
    public Object f;
    public Object g;
    public /* synthetic */ Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(gj0 gj0Var, wi0 wi0Var, o20 o20Var, r21 r21Var, View view, kj kjVar) {
        super(2, kjVar);
        this.g = gj0Var;
        this.h = wi0Var;
        this.i = o20Var;
        this.j = r21Var;
        this.k = view;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                p70 p70Var = new p70((s70) obj3, (mu) obj2, kjVar);
                p70Var.h = obj;
                return p70Var;
            default:
                p70 p70Var2 = new p70((gj0) this.g, (wi0) this.h, (o20) this.i, (r21) obj3, (View) obj2, kjVar);
                p70Var2.f = obj;
                return p70Var2;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        bk bkVar = (bk) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
        }
        return ((p70) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u70] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o70 o70Var;
        u70 u70Var;
        mu muVar;
        Throwable th;
        o70 o70Var2;
        s70 s70Var;
        u70 u70Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Throwable th2;
        zz zzVar;
        ws0 ws0Var;
        int i = this.d;
        ?? r1 = this.k;
        ck ckVar = ck.d;
        Object obj2 = this.j;
        kj kjVar = null;
        switch (i) {
            case 0:
                s70 s70Var2 = (s70) obj2;
                int i2 = this.e;
                try {
                    try {
                        if (i2 == 0) {
                            rg0.u(obj);
                            pj k = ((bk) this.h).f().k(b2.C);
                            k.getClass();
                            o70Var = new o70((zz) k);
                            AtomicReference atomicReference3 = s70Var2.a;
                            while (true) {
                                o70 o70Var3 = (o70) atomicReference3.get();
                                if (o70Var3 != null && y6.l(1, 1) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference3.compareAndSet(o70Var3, o70Var)) {
                                    if (atomicReference3.get() != o70Var3) {
                                        break;
                                    }
                                }
                                if (o70Var3 != null) {
                                    o70Var3.a.a(new gd("Mutation interrupted", 2));
                                }
                                u70Var = s70Var2.b;
                                muVar = (mu) r1;
                                this.h = o70Var;
                                this.g = u70Var;
                                this.f = muVar;
                                this.i = s70Var2;
                                this.e = 1;
                                if (u70Var.c(this) == ckVar) {
                                    return ckVar;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    g8.s("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                s70Var = (s70) this.f;
                                u70Var2 = (u70) this.g;
                                o70Var2 = (o70) this.h;
                                try {
                                    rg0.u(obj);
                                    atomicReference2 = s70Var.a;
                                    while (!atomicReference2.compareAndSet(o70Var2, null) && atomicReference2.get() == o70Var2) {
                                    }
                                    u70Var2.d(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    atomicReference = s70Var.a;
                                    while (!atomicReference.compareAndSet(o70Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            s70Var2 = (s70) this.i;
                            mu muVar2 = (mu) this.f;
                            u70 u70Var3 = (u70) this.g;
                            o70 o70Var4 = (o70) this.h;
                            rg0.u(obj);
                            u70Var = u70Var3;
                            muVar = muVar2;
                            o70Var = o70Var4;
                        }
                        this.h = o70Var;
                        this.g = u70Var;
                        this.f = s70Var2;
                        this.i = null;
                        this.e = 2;
                        Object c = muVar.c(this);
                        if (c == ckVar) {
                            return ckVar;
                        }
                        u70Var2 = u70Var;
                        obj = c;
                        o70Var2 = o70Var;
                        s70Var = s70Var2;
                        atomicReference2 = s70Var.a;
                        while (!atomicReference2.compareAndSet(o70Var2, null)) {
                        }
                        u70Var2.d(null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        o70Var2 = o70Var;
                        s70Var = s70Var2;
                        atomicReference = s70Var.a;
                        while (!atomicReference.compareAndSet(o70Var2, null) && atomicReference.get() == o70Var2) {
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    r1.d(null);
                    throw th5;
                }
            default:
                r21 r21Var = (r21) obj2;
                o20 o20Var = (o20) this.i;
                int i3 = this.e;
                ky0 ky0Var = ky0.a;
                if (i3 == 0) {
                    rg0.u(obj);
                    bk bkVar = (bk) this.f;
                    try {
                        try {
                            c60 c60Var = (c60) ((gj0) this.g).d;
                            if (c60Var != null) {
                                ct0 a = t21.a(((View) r1).getContext().getApplicationContext());
                                c60Var.d.h(((Number) a.getValue()).floatValue());
                                ws0Var = d31.E(bkVar, null, new c(a, c60Var, kjVar, 16), 3);
                            } else {
                                ws0Var = null;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            zzVar = null;
                            if (zzVar != null) {
                            }
                            o20Var.getLifecycle().b(r21Var);
                            throw th2;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                    try {
                        wi0 wi0Var = (wi0) this.h;
                        this.f = ws0Var;
                        this.e = 1;
                        Object K = d31.K(wi0Var.a, new cj(wi0Var, new vi0(wi0Var, null), x40.D(getContext()), (kj) null), this);
                        if (K != ckVar) {
                            K = ky0Var;
                        }
                        if (K != ckVar) {
                            K = ky0Var;
                        }
                        if (K == ckVar) {
                            return ckVar;
                        }
                        zzVar = ws0Var;
                    } catch (Throwable th8) {
                        ws0 ws0Var2 = ws0Var;
                        th2 = th8;
                        zzVar = ws0Var2;
                        if (zzVar != null) {
                        }
                        o20Var.getLifecycle().b(r21Var);
                        throw th2;
                    }
                } else {
                    if (i3 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzVar = (zz) this.f;
                    try {
                        rg0.u(obj);
                    } catch (Throwable th9) {
                        th2 = th9;
                        if (zzVar != null) {
                            zzVar.a(null);
                        }
                        o20Var.getLifecycle().b(r21Var);
                        throw th2;
                    }
                }
                if (zzVar != null) {
                    zzVar.a(null);
                }
                o20Var.getLifecycle().b(r21Var);
                return ky0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(s70 s70Var, mu muVar, kj kjVar) {
        super(2, kjVar);
        this.j = s70Var;
        this.k = muVar;
    }
}
