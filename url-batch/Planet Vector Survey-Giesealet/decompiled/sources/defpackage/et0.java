package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class et0 extends f0 implements g70, or, bv {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(et0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int h;

    public et0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r1 = r1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r13.equals(r15) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r9 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x0081, B:19:0x0088, B:20:0x008c, B:24:0x008f, B:26:0x00b0, B:29:0x00c0, B:30:0x00dc, B:36:0x00ec, B:32:0x00e3, B:35:0x00e9, B:45:0x0095, B:48:0x009c, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x0081, B:19:0x0088, B:20:0x008c, B:24:0x008f, B:26:0x00b0, B:29:0x00c0, B:30:0x00dc, B:36:0x00ec, B:32:0x00e3, B:35:0x00e9, B:45:0x0095, B:48:0x009c, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [ft0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ft0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ft0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ft0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [f0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [et0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [et0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [et0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bf -> B:14:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.or
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pr prVar, kj kjVar) {
        dt0 dt0Var;
        ?? r1;
        ck ckVar;
        ?? r8;
        pr prVar2;
        zz zzVar;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (kjVar instanceof dt0) {
                dt0Var = (dt0) kjVar;
                int i2 = dt0Var.k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dt0Var.k = i2 - Integer.MIN_VALUE;
                    Object obj3 = dt0Var.i;
                    r1 = dt0Var.k;
                    ckVar = ck.d;
                    if (r1 != 0) {
                        rg0.u(obj3);
                        r1 = (ft0) c();
                    } else if (r1 == 1) {
                        r1 = dt0Var.f;
                        prVar = dt0Var.e;
                        this = dt0Var.d;
                        try {
                            rg0.u(obj3);
                            r1 = r1;
                        } catch (Throwable th) {
                            r8 = this;
                            th = th;
                            r8.g(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = dt0Var.h;
                        zzVar = dt0Var.g;
                        ft0 ft0Var = dt0Var.f;
                        prVar2 = dt0Var.e;
                        et0 et0Var = dt0Var.d;
                        rg0.u(obj3);
                        r1 = ft0Var;
                        r8 = et0Var;
                        AtomicReference atomicReference = r1.a;
                        op opVar = nk.p;
                        andSet = atomicReference.getAndSet(opVar);
                        andSet.getClass();
                        if (andSet == nk.q) {
                        }
                        Object obj4 = i.get(r8);
                        if (zzVar != null) {
                        }
                        if (obj4 == d31.e) {
                        }
                        dt0Var.d = r8;
                        dt0Var.e = prVar2;
                        dt0Var.f = r1;
                        dt0Var.g = zzVar;
                        dt0Var.h = obj4;
                        dt0Var.k = 2;
                        if (prVar2.e(obj2, dt0Var) == ckVar) {
                        }
                    } else {
                        if (r1 != 3) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = dt0Var.h;
                        zzVar = dt0Var.g;
                        r1 = dt0Var.f;
                        prVar2 = dt0Var.e;
                        r8 = dt0Var.d;
                        rg0.u(obj3);
                        Object obj42 = i.get(r8);
                        if (zzVar != null && !zzVar.b()) {
                            throw zzVar.n();
                        }
                        obj2 = obj42 == d31.e ? null : obj42;
                        dt0Var.d = r8;
                        dt0Var.e = prVar2;
                        dt0Var.f = r1;
                        dt0Var.g = zzVar;
                        dt0Var.h = obj42;
                        dt0Var.k = 2;
                        if (prVar2.e(obj2, dt0Var) == ckVar) {
                            return ckVar;
                        }
                        obj = obj42;
                        r1 = r1;
                        r8 = r8;
                        AtomicReference atomicReference2 = r1.a;
                        op opVar2 = nk.p;
                        andSet = atomicReference2.getAndSet(opVar2);
                        andSet.getClass();
                        if (andSet == nk.q) {
                            dt0Var.d = r8;
                            dt0Var.e = prVar2;
                            dt0Var.f = r1;
                            dt0Var.g = zzVar;
                            dt0Var.h = obj;
                            dt0Var.k = 3;
                            ky0 ky0Var = ky0.a;
                            hc hcVar = new hc(1, d31.B(dt0Var));
                            hcVar.q();
                            AtomicReference atomicReference3 = r1.a;
                            while (true) {
                                if (atomicReference3.compareAndSet(opVar2, hcVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != opVar2) {
                                    hcVar.resumeWith(ky0Var);
                                    break;
                                }
                            }
                            Object p = hcVar.p();
                            if (p == ckVar) {
                            }
                        }
                        Object obj422 = i.get(r8);
                        if (zzVar != null) {
                            throw zzVar.n();
                        }
                        if (obj422 == d31.e) {
                        }
                        dt0Var.d = r8;
                        dt0Var.e = prVar2;
                        dt0Var.f = r1;
                        dt0Var.g = zzVar;
                        dt0Var.h = obj422;
                        dt0Var.k = 2;
                        if (prVar2.e(obj2, dt0Var) == ckVar) {
                        }
                    }
                    r8 = this;
                    prVar2 = prVar;
                    zzVar = (zz) dt0Var.getContext().k(b2.C);
                    obj = null;
                    Object obj4222 = i.get(r8);
                    if (zzVar != null) {
                    }
                    if (obj4222 == d31.e) {
                    }
                    dt0Var.d = r8;
                    dt0Var.e = prVar2;
                    dt0Var.f = r1;
                    dt0Var.g = zzVar;
                    dt0Var.h = obj4222;
                    dt0Var.k = 2;
                    if (prVar2.e(obj2, dt0Var) == ckVar) {
                    }
                }
            }
            if (r1 != 0) {
            }
            r8 = this;
            prVar2 = prVar;
            zzVar = (zz) dt0Var.getContext().k(b2.C);
            obj = null;
            Object obj42222 = i.get(r8);
            if (zzVar != null) {
            }
            if (obj42222 == d31.e) {
            }
            dt0Var.d = r8;
            dt0Var.e = prVar2;
            dt0Var.f = r1;
            dt0Var.g = zzVar;
            dt0Var.h = obj42222;
            dt0Var.k = 2;
            if (prVar2.e(obj2, dt0Var) == ckVar) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        dt0Var = new dt0(this, kjVar);
        Object obj32 = dt0Var.i;
        r1 = dt0Var.k;
        ckVar = ck.d;
    }

    @Override // defpackage.bv
    public final or b(rj rjVar, int i2, cb cbVar) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || cbVar != cb.e) ? a50.t(this, rjVar, i2, cbVar) : this;
    }

    @Override // defpackage.f0
    public final g0 d() {
        return new ft0();
    }

    @Override // defpackage.pr
    public final Object e(Object obj, kj kjVar) {
        j(obj);
        return ky0.a;
    }

    @Override // defpackage.f0
    public final g0[] f() {
        return new ft0[2];
    }

    @Override // defpackage.ct0
    public final Object getValue() {
        op opVar = d31.e;
        Object obj = i.get(this);
        if (obj == opVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        op opVar = d31.e;
        if (obj == null) {
            obj = opVar;
        }
        if (obj2 == null) {
            obj2 = opVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = d31.e;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i2;
        g0[] g0VarArr;
        op opVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !nz.l(obj3, obj)) {
                return false;
            }
            if (nz.l(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.h;
            if ((i3 & 1) != 0) {
                this.h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.h = i4;
            g0[] g0VarArr2 = this.d;
            while (true) {
                ft0[] ft0VarArr = (ft0[]) g0VarArr2;
                if (ft0VarArr != null) {
                    for (ft0 ft0Var : ft0VarArr) {
                        if (ft0Var != null) {
                            AtomicReference atomicReference = ft0Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (opVar = nk.q)) {
                                    op opVar2 = nk.p;
                                    if (obj4 != opVar2) {
                                        while (!atomicReference.compareAndSet(obj4, opVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((hc) obj4).resumeWith(ky0.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, opVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.h;
                    if (i2 == i4) {
                        this.h = i4 + 1;
                        return true;
                    }
                    g0VarArr = this.d;
                }
                g0VarArr2 = g0VarArr;
                i4 = i2;
            }
        }
    }
}
