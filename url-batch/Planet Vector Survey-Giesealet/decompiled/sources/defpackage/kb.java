package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kb implements pr {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kb(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.pr
    public final Object e(Object obj, kj kjVar) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                kz kzVar = (kz) obj;
                gs0 gs0Var = (gs0) obj2;
                if (!(kzVar instanceof ow)) {
                    if (!(kzVar instanceof pw)) {
                        if (!(kzVar instanceof gs)) {
                            if (!(kzVar instanceof hs)) {
                                if (!(kzVar instanceof qh0)) {
                                    if (!(kzVar instanceof rh0)) {
                                        if (kzVar instanceof ph0) {
                                            gs0Var.remove(((ph0) kzVar).a);
                                            break;
                                        }
                                    } else {
                                        gs0Var.remove(((rh0) kzVar).a);
                                        break;
                                    }
                                } else {
                                    gs0Var.add(kzVar);
                                    break;
                                }
                            } else {
                                gs0Var.remove(((hs) kzVar).a);
                                break;
                            }
                        } else {
                            gs0Var.add(kzVar);
                            break;
                        }
                    } else {
                        gs0Var.remove(((pw) kzVar).a);
                        break;
                    }
                } else {
                    gs0Var.add(kzVar);
                    break;
                }
                break;
            default:
                ((c60) obj2).d.h(((Number) obj).floatValue());
                break;
        }
        return ky0Var;
    }
}
