package o;

/* loaded from: classes.dex */
public final class LS {
    public final InterfaceC0844cV a;
    public final long b;
    public final C1586no c;
    public final FU d;
    public final String e;
    public final long f;
    public final Z7 g;
    public final C0910dV h;
    public final FA i;
    public final long j;
    public final YU k;
    public final C0709aR l;
    public final AbstractC1807r8 m;

    public LS(long j, long j2, C1586no c1586no, String str, long j3, Z7 z7, C0910dV c0910dV, FA fa, long j4, YU yu, C0709aR c0709aR) {
        this(j != 16 ? new C1772qc(j) : C1623oL.f206o, j2, c1586no, null, str, j3, z7, c0910dV, fa, j4, yu, c0709aR, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LS)) {
            return false;
        }
        LS ls = (LS) obj;
        return (this == ls || (C1830rV.a(this.b, ls.b) && AbstractC0048Bt.h(this.c, ls.c) && AbstractC0048Bt.h(this.d, ls.d) && AbstractC0048Bt.h(this.e, ls.e) && C1830rV.a(this.f, ls.f) && AbstractC0048Bt.h(this.g, ls.g) && AbstractC0048Bt.h(this.h, ls.h) && AbstractC0048Bt.h(this.i, ls.i) && C1114gc.b(this.j, ls.j))) && AbstractC0048Bt.h(this.a, ls.a) && AbstractC0048Bt.h(this.k, ls.k) && AbstractC0048Bt.h(this.l, ls.l) && AbstractC0048Bt.h(this.m, ls.m);
    }

    public final int hashCode() {
        InterfaceC0844cV interfaceC0844cV = this.a;
        long f = interfaceC0844cV.f();
        int i = C1114gc.g;
        int hashCode = Long.hashCode(f);
        interfaceC0844cV.getClass();
        int hashCode2 = (Float.hashCode(interfaceC0844cV.a()) + (hashCode * 961)) * 31;
        C1896sV[] c1896sVArr = C1830rV.b;
        int hashCode3 = (Long.hashCode(this.b) + hashCode2) * 31;
        C1586no c1586no = this.c;
        int i2 = (hashCode3 + (c1586no != null ? c1586no.h : 0)) * 29791;
        FU fu = this.d;
        int hashCode4 = (i2 + (fu != null ? fu.hashCode() : 0)) * 31;
        String str = this.e;
        int hashCode5 = (Long.hashCode(this.f) + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        Z7 z7 = this.g;
        int hashCode6 = (hashCode5 + (z7 != null ? Float.hashCode(z7.a) : 0)) * 31;
        C0910dV c0910dV = this.h;
        int hashCode7 = (hashCode6 + (c0910dV != null ? c0910dV.hashCode() : 0)) * 31;
        FA fa = this.i;
        int hashCode8 = (Long.hashCode(this.j) + ((hashCode7 + (fa != null ? fa.h.hashCode() : 0)) * 31)) * 31;
        YU yu = this.k;
        int i3 = (hashCode8 + (yu != null ? yu.a : 0)) * 31;
        C0709aR c0709aR = this.l;
        int hashCode9 = (i3 + (c0709aR != null ? c0709aR.hashCode() : 0)) * 961;
        AbstractC1807r8 abstractC1807r8 = this.m;
        return hashCode9 + (abstractC1807r8 != null ? abstractC1807r8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC0844cV interfaceC0844cV = this.a;
        sb.append((Object) C1114gc.g(interfaceC0844cV.f()));
        sb.append(", brush=null, alpha=");
        interfaceC0844cV.getClass();
        sb.append(interfaceC0844cV.a());
        sb.append(", fontSize=");
        sb.append((Object) C1830rV.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=null, fontSynthesis=null, fontFamily=");
        sb.append(this.d);
        sb.append(", fontFeatureSettings=");
        sb.append(this.e);
        sb.append(", letterSpacing=");
        sb.append((Object) C1830rV.d(this.f));
        sb.append(", baselineShift=");
        sb.append(this.g);
        sb.append(", textGeometricTransform=");
        sb.append(this.h);
        sb.append(", localeList=");
        sb.append(this.i);
        sb.append(", background=");
        AbstractC2188wx.l(this.j, sb, ", textDecoration=");
        sb.append(this.k);
        sb.append(", shadow=");
        sb.append(this.l);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.m);
        sb.append(')');
        return sb.toString();
    }

    public LS(InterfaceC0844cV interfaceC0844cV, long j, C1586no c1586no, FU fu, String str, long j2, Z7 z7, C0910dV c0910dV, FA fa, long j3, YU yu, C0709aR c0709aR, AbstractC1807r8 abstractC1807r8) {
        this.a = interfaceC0844cV;
        this.b = j;
        this.c = c1586no;
        this.d = fu;
        this.e = str;
        this.f = j2;
        this.g = z7;
        this.h = c0910dV;
        this.i = fa;
        this.j = j3;
        this.k = yu;
        this.l = c0709aR;
        this.m = abstractC1807r8;
    }
}
