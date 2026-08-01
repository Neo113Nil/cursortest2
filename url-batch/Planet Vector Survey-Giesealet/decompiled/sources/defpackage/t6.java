package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t6 implements pr {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;
    public final Object g;

    public t6(pr prVar, rj rjVar) {
        this.d = 3;
        this.e = rjVar;
        this.f = mz.V(rjVar);
        this.g = new c(prVar, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    @Override // defpackage.pr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, kj kjVar) {
        vr vrVar;
        int i;
        int i2 = this.d;
        ck ckVar = ck.d;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i2) {
            case 0:
                cx0 cx0Var = (cx0) obj3;
                ((vh0) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((qu) ((f70) obj2).getValue()).invoke(cx0Var.a.b(), cx0Var.d.getValue())).booleanValue() : false));
                return ky0Var;
            case 1:
                if (kjVar instanceof vr) {
                    vrVar = (vr) kjVar;
                    int i3 = vrVar.h;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vrVar.h = i3 - Integer.MIN_VALUE;
                        Object obj5 = vrVar.f;
                        i = vrVar.h;
                        if (i != 0) {
                            rg0.u(obj5);
                            if (((cj0) obj4).d) {
                                vrVar.h = 1;
                                if (((pr) obj3).e(obj, vrVar) == ckVar) {
                                    return ckVar;
                                }
                                return ky0Var;
                            }
                            vrVar.d = this;
                            vrVar.e = obj;
                            vrVar.h = 2;
                            obj5 = ((ti0) obj2).invoke(obj, vrVar);
                            if (obj5 == ckVar) {
                                return ckVar;
                            }
                            if (!((Boolean) obj5).booleanValue()) {
                            }
                            return ky0Var;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                obj = vrVar.e;
                                this = vrVar.d;
                                rg0.u(obj5);
                                if (!((Boolean) obj5).booleanValue()) {
                                    ((cj0) this.e).d = true;
                                    pr prVar = (pr) this.f;
                                    vrVar.d = null;
                                    vrVar.e = null;
                                    vrVar.h = 3;
                                    if (prVar.e(obj, vrVar) == ckVar) {
                                        return ckVar;
                                    }
                                }
                                return ky0Var;
                            }
                            if (i != 3) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        rg0.u(obj5);
                        return ky0Var;
                    }
                }
                vrVar = new vr(this, kjVar);
                Object obj52 = vrVar.f;
                i = vrVar.h;
                if (i != 0) {
                }
            case 2:
                x8 x8Var = (x8) obj;
                if (((List) ((f70) obj2).getValue()).size() > 1) {
                    ((f70) obj4).setValue(Boolean.TRUE);
                    ((yd0) obj3).h(x8Var.c);
                }
                return ky0Var;
            default:
                Object L = d31.L((rj) obj4, obj, obj3, (c) obj2, kjVar);
                return L == ckVar ? L : ky0Var;
        }
    }

    public /* synthetic */ t6(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public t6(f70 f70Var, f70 f70Var2, yd0 yd0Var) {
        this.d = 2;
        this.g = f70Var;
        this.e = f70Var2;
        this.f = yd0Var;
    }
}
