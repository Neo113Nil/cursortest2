package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ki0 {
    public final ii0 a;
    public final boolean b;
    public final b2 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public ki0(ii0 ii0Var, Object obj, boolean z, b2 b2Var, boolean z2) {
        this.a = ii0Var;
        this.b = z;
        this.c = b2Var;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        th.d("Unexpected form of a provided value");
        throw new kf();
    }
}
