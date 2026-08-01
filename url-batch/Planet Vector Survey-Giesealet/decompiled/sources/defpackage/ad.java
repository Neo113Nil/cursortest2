package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ad implements pr {
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ad(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = serializable;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    @Override // defpackage.pr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, kj kjVar) {
        zc zcVar;
        int i;
        int i2 = this.d;
        ky0 ky0Var = ky0.a;
        boolean z = true;
        Serializable serializable = this.e;
        boolean z2 = false;
        switch (i2) {
            case 0:
                if (kjVar instanceof zc) {
                    zcVar = (zc) kjVar;
                    int i3 = zcVar.h;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zcVar.h = i3 - Integer.MIN_VALUE;
                        Object obj2 = zcVar.f;
                        i = zcVar.h;
                        if (i != 0) {
                            rg0.u(obj2);
                            zz zzVar = (zz) ((gj0) serializable).d;
                            if (zzVar != null) {
                                zzVar.a(new gd("Child of the scoped flow was cancelled", 0));
                                zcVar.d = this;
                                zcVar.e = obj;
                                zcVar.h = 1;
                                Object u = zzVar.u(zcVar);
                                ck ckVar = ck.d;
                                if (u == ckVar) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = zcVar.e;
                            this = zcVar.d;
                            rg0.u(obj2);
                        }
                        ((gj0) this.e).d = d31.E((bk) this.f, null, new yc((bd) this.g, (pr) this.h, obj, null), 1);
                        break;
                    }
                }
                zcVar = new zc(this, kjVar);
                Object obj22 = zcVar.f;
                i = zcVar.h;
                if (i != 0) {
                }
                ((gj0) this.e).d = d31.E((bk) this.f, null, new yc((bd) this.g, (pr) this.h, obj, null), 1);
            default:
                kz kzVar = (kz) obj;
                ej0 ej0Var = (ej0) this.g;
                ej0 ej0Var2 = (ej0) this.f;
                ej0 ej0Var3 = (ej0) serializable;
                if (kzVar instanceof qh0) {
                    ej0Var3.d++;
                } else if (kzVar instanceof rh0) {
                    ej0Var3.d--;
                } else if (kzVar instanceof ph0) {
                    ej0Var3.d--;
                } else if (kzVar instanceof ow) {
                    ej0Var2.d++;
                } else if (kzVar instanceof pw) {
                    ej0Var2.d--;
                } else if (kzVar instanceof gs) {
                    ej0Var.d++;
                } else if (kzVar instanceof hs) {
                    ej0Var.d--;
                }
                boolean z3 = ej0Var3.d > 0;
                boolean z4 = ej0Var2.d > 0;
                boolean z5 = ej0Var.d > 0;
                rk rkVar = (rk) this.h;
                if (rkVar.s != z3) {
                    rkVar.s = z3;
                    z2 = true;
                }
                if (rkVar.t != z4) {
                    rkVar.t = z4;
                    z2 = true;
                }
                if (rkVar.u != z5) {
                    rkVar.u = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    mz.H(rkVar);
                    break;
                }
                break;
        }
        return ky0Var;
    }
}
