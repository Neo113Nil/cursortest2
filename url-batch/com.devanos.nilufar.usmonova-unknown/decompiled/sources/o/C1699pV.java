package o;

/* renamed from: o.pV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1699pV {
    public static final C1699pV d;
    public final LS a;
    public final C1751qH b;
    public final C1883sI c;

    static {
        long j = C1114gc.f;
        long j2 = C1830rV.c;
        d = new C1699pV(new LS(j, j2, null, null, j2, null, null, null, j, null, null), new C1751qH(Integer.MIN_VALUE, Integer.MIN_VALUE, j2, null, null, null, 0, Integer.MIN_VALUE), null);
    }

    public C1699pV(LS ls, C1751qH c1751qH, C1883sI c1883sI) {
        this.a = ls;
        this.b = c1751qH;
        this.c = c1883sI;
    }

    public static C1699pV a(C1699pV c1699pV, long j, C1586no c1586no, FU fu, long j2, long j3, C0521Tz c0521Tz, int i) {
        Z7 z7;
        C0910dV c0910dV;
        long j4;
        int i2;
        Z7 z72;
        C0910dV c0910dV2;
        FA fa;
        InterfaceC0844cV interfaceC0844cV;
        C1883sI c1883sI = AbstractC1052fg.c;
        long f = c1699pV.a.a.f();
        long j5 = (i & 2) != 0 ? c1699pV.a.b : j;
        C1586no c1586no2 = (i & 4) != 0 ? c1699pV.a.c : c1586no;
        LS ls = c1699pV.a;
        FU fu2 = (i & 32) != 0 ? ls.d : fu;
        String str = ls.e;
        long j6 = (i & 128) != 0 ? ls.f : j2;
        Z7 z73 = ls.g;
        C0910dV c0910dV3 = ls.h;
        FA fa2 = ls.i;
        long j7 = ls.j;
        YU yu = ls.k;
        C0709aR c0709aR = ls.l;
        AbstractC1807r8 abstractC1807r8 = ls.m;
        C1751qH c1751qH = c1699pV.b;
        int i3 = c1751qH.a;
        int i4 = c1751qH.b;
        if ((i & 131072) != 0) {
            z7 = z73;
            c0910dV = c0910dV3;
            j4 = c1751qH.c;
        } else {
            z7 = z73;
            c0910dV = c0910dV3;
            j4 = j3;
        }
        C0975eV c0975eV = c1751qH.d;
        C1883sI c1883sI2 = (i & 524288) != 0 ? c1699pV.c : c1883sI;
        C0521Tz c0521Tz2 = (i & 1048576) != 0 ? c1751qH.f : c0521Tz;
        int i5 = c1751qH.g;
        int i6 = c1751qH.h;
        InterfaceC0844cV interfaceC0844cV2 = ls.a;
        if (C1114gc.b(f, interfaceC0844cV2.f())) {
            i2 = i5;
            z72 = z7;
            c0910dV2 = c0910dV;
            fa = fa2;
            interfaceC0844cV = interfaceC0844cV2;
        } else {
            InterfaceC0844cV c1772qc = f != 16 ? new C1772qc(f) : C1623oL.f206o;
            i2 = i5;
            z72 = z7;
            c0910dV2 = c0910dV;
            fa = fa2;
            interfaceC0844cV = c1772qc;
        }
        return new C1699pV(new LS(interfaceC0844cV, j5, c1586no2, fu2, str, j6, z72, c0910dV2, fa, j7, yu, c0709aR, abstractC1807r8), new C1751qH(i3, i4, j4, c0975eV, c1883sI2 != null ? c1883sI2.a : null, c0521Tz2, i2, i6), c1883sI2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1699pV)) {
            return false;
        }
        C1699pV c1699pV = (C1699pV) obj;
        return AbstractC0048Bt.h(this.a, c1699pV.a) && AbstractC0048Bt.h(this.b, c1699pV.b) && AbstractC0048Bt.h(this.c, c1699pV.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        C1883sI c1883sI = this.c;
        return hashCode + (c1883sI != null ? c1883sI.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        LS ls = this.a;
        InterfaceC0844cV interfaceC0844cV = ls.a;
        sb.append((Object) C1114gc.g(interfaceC0844cV.f()));
        sb.append(", brush=null, alpha=");
        interfaceC0844cV.getClass();
        sb.append(interfaceC0844cV.a());
        sb.append(", fontSize=");
        sb.append((Object) C1830rV.d(ls.b));
        sb.append(", fontWeight=");
        sb.append(ls.c);
        sb.append(", fontStyle=null, fontSynthesis=null, fontFamily=");
        sb.append(ls.d);
        sb.append(", fontFeatureSettings=");
        sb.append(ls.e);
        sb.append(", letterSpacing=");
        sb.append((Object) C1830rV.d(ls.f));
        sb.append(", baselineShift=");
        sb.append(ls.g);
        sb.append(", textGeometricTransform=");
        sb.append(ls.h);
        sb.append(", localeList=");
        sb.append(ls.i);
        sb.append(", background=");
        AbstractC2188wx.l(ls.j, sb, ", textDecoration=");
        sb.append(ls.k);
        sb.append(", shadow=");
        sb.append(ls.l);
        sb.append(", drawStyle=");
        sb.append(ls.m);
        sb.append(", textAlign=");
        C1751qH c1751qH = this.b;
        sb.append((Object) XU.a(c1751qH.a));
        sb.append(", textDirection=");
        sb.append((Object) ZU.a(c1751qH.b));
        sb.append(", lineHeight=");
        sb.append((Object) C1830rV.d(c1751qH.c));
        sb.append(", textIndent=");
        sb.append(c1751qH.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(c1751qH.f);
        sb.append(", lineBreak=");
        sb.append((Object) AbstractC1473m3.b0(c1751qH.g));
        sb.append(", hyphens=");
        int i = c1751qH.h;
        sb.append((Object) (i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid"));
        sb.append(", textMotion=null)");
        return sb.toString();
    }
}
