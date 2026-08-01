package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wn extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ qo0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn(qo0 qo0Var, int i) {
        super(0);
        this.e = i;
        this.f = qo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4 != false) goto L13;
     */
    @Override // defpackage.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean z;
        boolean z2;
        int i = this.e;
        ky0 ky0Var = ky0.a;
        qo0 qo0Var = this.f;
        switch (i) {
            case 0:
                eb ebVar = qo0Var.x;
                if (ebVar != null) {
                    ebVar.r(on.a);
                }
                return ky0Var;
            case 1:
                zo0 zo0Var = qo0Var.F;
                if (!zo0Var.a.c()) {
                    bd0 bd0Var = zo0Var.b;
                    z = false;
                    if (bd0Var == null) {
                        z2 = false;
                        break;
                    } else {
                        z2 = bd0Var.f();
                        break;
                    }
                }
                z = true;
                return Boolean.valueOf(!z);
            default:
                qo0Var.E.e = new p01(3, new p01((sl) mz.A(qo0Var, hi.h)));
                return ky0Var;
        }
    }
}
