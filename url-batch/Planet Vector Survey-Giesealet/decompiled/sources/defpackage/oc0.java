package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class oc0 {
    public final int a;
    public final int b;

    public /* synthetic */ oc0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var);

    public h2 b(qc0 qc0Var) {
        return null;
    }

    public final String toString() {
        String a = hj0.a(getClass()).a();
        return a == null ? "" : a;
    }

    public oc0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
