package o;

/* renamed from: o.qH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1751qH {
    public final int a;
    public final int b;
    public final long c;
    public final C0975eV d;
    public final C1488mI e;
    public final C0521Tz f;
    public final int g;
    public final int h;

    public C1751qH(int i, int i2, long j, C0975eV c0975eV, C1488mI c1488mI, C0521Tz c0521Tz, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = c0975eV;
        this.e = c1488mI;
        this.f = c0521Tz;
        this.g = i3;
        this.h = i4;
        if (C1830rV.a(j, C1830rV.c) || C1830rV.c(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + C1830rV.c(j) + ')').toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1751qH)) {
            return false;
        }
        C1751qH c1751qH = (C1751qH) obj;
        if (this.a != c1751qH.a || this.b != c1751qH.b || !C1830rV.a(this.c, c1751qH.c) || !AbstractC0048Bt.h(this.d, c1751qH.d) || !AbstractC0048Bt.h(this.e, c1751qH.e) || !AbstractC0048Bt.h(this.f, c1751qH.f) || this.g != c1751qH.g || this.h != c1751qH.h) {
            return false;
        }
        c1751qH.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31;
        C1896sV[] c1896sVArr = C1830rV.b;
        int hashCode2 = (Long.hashCode(this.c) + hashCode) * 31;
        C0975eV c0975eV = this.d;
        int hashCode3 = (hashCode2 + (c0975eV != null ? c0975eV.hashCode() : 0)) * 31;
        C1488mI c1488mI = this.e;
        int hashCode4 = (hashCode3 + (c1488mI != null ? c1488mI.hashCode() : 0)) * 31;
        C0521Tz c0521Tz = this.f;
        return (Integer.hashCode(this.h) + ((Integer.hashCode(this.g) + ((hashCode4 + (c0521Tz != null ? c0521Tz.hashCode() : 0)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphStyle(textAlign=");
        sb.append((Object) XU.a(this.a));
        sb.append(", textDirection=");
        sb.append((Object) ZU.a(this.b));
        sb.append(", lineHeight=");
        sb.append((Object) C1830rV.d(this.c));
        sb.append(", textIndent=");
        sb.append(this.d);
        sb.append(", platformStyle=");
        sb.append(this.e);
        sb.append(", lineHeightStyle=");
        sb.append(this.f);
        sb.append(", lineBreak=");
        sb.append((Object) AbstractC1473m3.b0(this.g));
        sb.append(", hyphens=");
        int i = this.h;
        sb.append((Object) (i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid"));
        sb.append(", textMotion=null)");
        return sb.toString();
    }
}
