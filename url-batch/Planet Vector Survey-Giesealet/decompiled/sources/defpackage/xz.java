package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xz extends c00 {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ xz(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.c00
    public final boolean k() {
        switch (this.h) {
        }
        return false;
    }

    @Override // defpackage.c00
    public final void l(Throwable th) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((mu) obj).c(th);
                break;
            default:
                Object obj2 = g00.d.get(j());
                d00 d00Var = (d00) obj;
                if (!(obj2 instanceof jf)) {
                    d00Var.resumeWith(nk.R(obj2));
                    break;
                } else {
                    d00Var.resumeWith(rg0.i(((jf) obj2).a));
                    break;
                }
        }
    }
}
