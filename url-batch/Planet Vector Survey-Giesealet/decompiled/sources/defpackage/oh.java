package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qh qhVar = (qh) obj;
                qhVar.z--;
                break;
            default:
                hs0 hs0Var = (hs0) obj;
                hs0Var.j--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((qh) obj).z++;
                break;
            default:
                ((hs0) obj).j++;
                break;
        }
    }
}
