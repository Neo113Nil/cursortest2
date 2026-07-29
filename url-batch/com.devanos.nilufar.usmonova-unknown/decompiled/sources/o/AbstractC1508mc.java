package o;

/* renamed from: o.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1508mc {
    public final String a;
    public final long b;
    public final int c;

    public AbstractC1508mc(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1508mc abstractC1508mc = (AbstractC1508mc) obj;
        if (this.c == abstractC1508mc.c && AbstractC0048Bt.h(this.a, abstractC1508mc.a)) {
            return AbstractC1310jc.a(this.b, abstractC1508mc.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, AbstractC1508mc abstractC1508mc);

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = AbstractC1310jc.e;
        return ((Long.hashCode(this.b) + hashCode) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        long j = AbstractC1310jc.a;
        long j2 = this.b;
        sb.append((Object) (AbstractC1310jc.a(j2, j) ? "Rgb" : AbstractC1310jc.a(j2, AbstractC1310jc.b) ? "Xyz" : AbstractC1310jc.a(j2, AbstractC1310jc.c) ? "Lab" : AbstractC1310jc.a(j2, AbstractC1310jc.d) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
