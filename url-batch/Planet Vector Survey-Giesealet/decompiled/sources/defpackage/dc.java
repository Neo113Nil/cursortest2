package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dc implements la0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((mu) obj).getClass().getSimpleName() + '@' + nk.u(this) + ']';
            default:
                return "DisposeOnCancel[" + ((bn) obj) + ']';
        }
    }
}
