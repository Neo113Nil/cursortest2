package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class ha0 {
    public final l70 a = new l70(new z90[16]);
    public final x60 b = new x60(10);

    public boolean a(b40 b40Var, b10 b10Var, j3 j3Var, boolean z) {
        l70 l70Var = this.a;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((z90) objArr[i2]).a(b40Var, b10Var, j3Var, z) || z2;
        }
        return z2;
    }

    public void b(j3 j3Var) {
        l70 l70Var = this.a;
        int i = l70Var.f;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((z90) l70Var.d[i]).d.b == 0) {
                l70Var.j(i);
            }
        }
    }
}
