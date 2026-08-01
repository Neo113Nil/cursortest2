package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class m0 {
    public String a;
    public final int[] b = new int[2];

    public abstract int[] a(int i);

    public final int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        nz.f0("text");
        throw null;
    }

    public abstract int[] d(int i);
}
