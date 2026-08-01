package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ long f;
    public Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, Object obj2, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.h = obj;
        this.f = j;
        this.i = obj2;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new d((qd) obj3, this.f, (r60) obj2, kjVar, 0);
            default:
                d dVar = new d((zo0) obj3, this.f, (dj0) obj2, kjVar, 1);
                dVar.g = obj;
                return dVar;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                return ((d) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            default:
                return ((d) create((xo0) obj, (kj) obj2)).invokeSuspend(ky0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0174, code lost:
    
        if (((defpackage.r60) r1).a(r0, r18) == r7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0160, code lost:
    
        if (defpackage.mz.B(r0, r18) == r7) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [t50] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        ca0 ca0Var;
        int i;
        boolean z3;
        qh0 qh0Var;
        int i2 = this.d;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.i;
        long j = this.f;
        ck ckVar = ck.d;
        Object obj3 = this.h;
        switch (i2) {
            case 0:
                qd qdVar = (qd) obj3;
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    if (!qdVar.d.q) {
                        cy.b("visitAncestors called on an unattached node");
                    }
                    t50 t50Var = qdVar.d.h;
                    p10 a0 = nz.a0(qdVar);
                    boolean z4 = false;
                    while (a0 != null) {
                        int i4 = 262144;
                        if ((((t50) a0.F.j).g & 262144) != 0) {
                            while (t50Var != null) {
                                if ((t50Var.f & i4) != 0) {
                                    ol olVar = t50Var;
                                    l70 l70Var = null;
                                    while (olVar != 0) {
                                        if (olVar instanceof ix0) {
                                            ix0 ix0Var = (ix0) olVar;
                                            if (io0.r != ix0Var.j()) {
                                                z3 = true;
                                            } else {
                                                if (!z4) {
                                                }
                                                z4 = true;
                                                z3 = false;
                                            }
                                            if (!z3) {
                                                if (!z4) {
                                                    int i5 = rd.b;
                                                    if (!qdVar.d.q) {
                                                        cy.b("Cannot get View because the Modifier node is not currently attached.");
                                                    }
                                                    ViewParent parent = ((View) mz.Q(nz.a0(qdVar))).getParent();
                                                    while (parent != null && (parent instanceof ViewGroup)) {
                                                        ViewGroup viewGroup = (ViewGroup) parent;
                                                        if (viewGroup.shouldDelayChildPressedState()) {
                                                            z2 = true;
                                                            if (!z2) {
                                                                z = false;
                                                                if (z) {
                                                                    long j2 = rd.a;
                                                                    this.e = 1;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            parent = viewGroup.getParent();
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (!z2) {
                                                    }
                                                }
                                                z = true;
                                                if (z) {
                                                }
                                            }
                                        } else if ((olVar.f & i4) != 0 && (olVar instanceof ol)) {
                                            t50 t50Var2 = olVar.s;
                                            int i6 = 0;
                                            t50 t50Var3 = olVar;
                                            while (t50Var2 != null) {
                                                int i7 = i4;
                                                if ((t50Var2.f & i7) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        t50Var3 = t50Var2;
                                                    } else {
                                                        l70 l70Var2 = l70Var == null ? new l70(new t50[16]) : l70Var;
                                                        if (t50Var3 != null) {
                                                            l70Var2.b(t50Var3);
                                                            t50Var3 = null;
                                                        }
                                                        l70Var2.b(t50Var2);
                                                        l70Var = l70Var2;
                                                    }
                                                }
                                                t50Var2 = t50Var2.i;
                                                i4 = i7;
                                                t50Var3 = t50Var3;
                                            }
                                            i = i4;
                                            if (i6 == 1) {
                                                i4 = i;
                                                olVar = t50Var3;
                                            }
                                            t50Var3 = nz.j(l70Var);
                                            i4 = i;
                                            olVar = t50Var3;
                                        }
                                        i = i4;
                                        t50Var3 = nz.j(l70Var);
                                        i4 = i;
                                        olVar = t50Var3;
                                    }
                                }
                                t50Var = t50Var.h;
                                i4 = i4;
                            }
                        }
                        a0 = a0.n();
                        t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
                    }
                    if (!z4) {
                    }
                    z = true;
                    if (z) {
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qh0Var = (qh0) this.g;
                        rg0.u(obj);
                        qdVar.C = qh0Var;
                        return ky0Var;
                    }
                    rg0.u(obj);
                }
                qh0Var = new qh0(j);
                this.g = qh0Var;
                this.e = 2;
                break;
            default:
                zo0 zo0Var = (zo0) obj3;
                int i8 = this.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                xo0 xo0Var = (xo0) this.g;
                float f = zo0Var.f(j);
                v3 v3Var = new v3((dj0) obj2, zo0Var, xo0Var, 5);
                this.e = 1;
                return ze0.c(0.0f, f, null, v3Var, this, 12) == ckVar ? ckVar : ky0Var;
        }
    }
}
