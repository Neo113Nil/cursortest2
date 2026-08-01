package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class u3 implements zm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zm
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((cn) obj).e.a();
                break;
            case 1:
                om omVar = (om) obj;
                omVar.dismiss();
                jm jmVar = omVar.k;
                a31 a31Var = jmVar.f;
                if (a31Var != null) {
                    a31Var.h();
                }
                jmVar.f = null;
                jmVar.requestLayout();
                break;
            default:
                cx0 cx0Var = (cx0) obj;
                cx0Var.i();
                cx0Var.a.g();
                break;
        }
    }
}
