package o;

/* renamed from: o.Tz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521Tz {
    public final float a;

    static {
        float f = AbstractC0495Sz.a;
        float f2 = AbstractC0495Sz.a;
    }

    public C0521Tz(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0521Tz)) {
            return false;
        }
        float f = ((C0521Tz) obj).a;
        float f2 = AbstractC0495Sz.a;
        return Float.compare(this.a, f) == 0;
    }

    public final int hashCode() {
        float f = AbstractC0495Sz.a;
        return Integer.hashCode(0) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = this.a;
        if (f == 0.0f) {
            float f2 = AbstractC0495Sz.a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f == AbstractC0495Sz.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f == AbstractC0495Sz.b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f == AbstractC0495Sz.c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        sb.append((Object) "LineHeightStyle.Trim.None");
        sb.append(')');
        return sb.toString();
    }
}
