package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ut implements Comparable {
    public static final ut e;
    public static final ut f;
    public static final ut g;
    public static final ut h;
    public static final ut i;
    public final int d;

    static {
        ut utVar = new ut(100);
        ut utVar2 = new ut(200);
        ut utVar3 = new ut(300);
        ut utVar4 = new ut(400);
        ut utVar5 = new ut(500);
        ut utVar6 = new ut(600);
        e = utVar6;
        ut utVar7 = new ut(700);
        ut utVar8 = new ut(800);
        ut utVar9 = new ut(900);
        f = utVar4;
        g = utVar5;
        h = utVar6;
        i = utVar7;
        px0.I(utVar, utVar2, utVar3, utVar4, utVar5, utVar6, utVar7, utVar8, utVar9);
    }

    public ut(int i2) {
        this.d = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        dy.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nz.s(this.d, ((ut) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ut) {
            return this.d == ((ut) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.d + ')';
    }
}
