package yads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class t8 {
    public final bt0 A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final String G;
    public final boolean H;
    public final int I;
    public final int J;
    public final boolean K;
    public final e00 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final List h;
    public final c i;
    public final Long j;
    public final String k;
    public final String l;
    public final nz m;
    public final k03 n;
    public final String o;
    public final String p;
    public final vq1 q;
    public final sq2 r;
    public final Long s;
    public final Object t;
    public final Map u;
    public final String v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public t8(e00 e00Var, String str, String str2, String str3, String str4, int i, int i2, ArrayList arrayList, c cVar, Long l, String str5, String str6, nz nzVar, k03 k03Var, String str7, String str8, vq1 vq1Var, sq2 sq2Var, Long l2, Object obj, Map map, String str9, String str10, boolean z, boolean z2, int i3, int i4, int i5, boolean z3, bt0 bt0Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str11, boolean z9, int i6, int i7) {
        e00 e00Var2 = (i6 & 1) != 0 ? null : e00Var;
        String str12 = (i6 & 2) != 0 ? null : str;
        String str13 = (i6 & 4) != 0 ? null : str2;
        String str14 = (i6 & 8) != 0 ? null : str3;
        String str15 = (i6 & 16) != 0 ? null : str4;
        int i8 = (i6 & 32) != 0 ? 0 : i;
        int i9 = (i6 & 64) != 0 ? 0 : i2;
        ArrayList arrayList2 = (i6 & 128) != 0 ? null : arrayList;
        c cVar2 = (i6 & 256) != 0 ? null : cVar;
        Long l3 = (i6 & 512) != 0 ? null : l;
        String str16 = (i6 & 1024) != 0 ? null : str5;
        String str17 = (i6 & 16384) != 0 ? null : str6;
        nz nzVar2 = (i6 & 65536) != 0 ? null : nzVar;
        k03 k03Var2 = (i6 & 131072) != 0 ? null : k03Var;
        String str18 = (i6 & 262144) != 0 ? null : str7;
        String str19 = (i6 & 524288) != 0 ? null : str8;
        vq1 vq1Var2 = (i6 & 1048576) != 0 ? null : vq1Var;
        sq2 sq2Var2 = (i6 & 2097152) != 0 ? null : sq2Var;
        Long l4 = (i6 & 4194304) != 0 ? null : l2;
        Map map2 = (i6 & 16777216) != 0 ? null : map;
        String str20 = (i6 & 33554432) != 0 ? null : str9;
        String str21 = (i6 & 67108864) != 0 ? null : str10;
        boolean z10 = (i6 & 134217728) != 0 ? false : z;
        boolean z11 = (i6 & 268435456) != 0 ? false : z2;
        int i10 = (i7 & 1) != 0 ? 0 : i3;
        int i11 = (i7 & 2) != 0 ? 0 : i4;
        boolean z12 = (i7 & 8) != 0 ? false : z3;
        bt0 bt0Var2 = (i7 & 16) != 0 ? null : bt0Var;
        boolean z13 = (i7 & 32) != 0 ? true : z4;
        boolean z14 = (i7 & 64) != 0 ? false : z5;
        boolean z15 = z11;
        boolean z16 = (i7 & 1024) != 0 ? true : z6;
        boolean z17 = (i7 & 2048) != 0 ? false : z7;
        boolean z18 = (i7 & 4096) != 0 ? false : z8;
        String str22 = (i7 & 8192) != 0 ? null : str11;
        boolean z19 = (i7 & 16384) != 0 ? false : z9;
        this.a = e00Var2;
        this.b = str12;
        this.c = str13;
        this.d = str14;
        this.e = str15;
        this.f = i8;
        this.g = i9;
        this.h = arrayList2;
        this.i = cVar2;
        this.j = l3;
        this.k = str16;
        this.l = str17;
        this.m = nzVar2;
        this.n = k03Var2;
        this.o = str18;
        this.p = str19;
        this.q = vq1Var2;
        this.r = sq2Var2;
        this.s = l4;
        this.t = obj;
        this.u = map2;
        this.v = str20;
        this.w = str21;
        this.x = z10;
        this.y = z15;
        this.z = z12;
        this.A = bt0Var2;
        this.B = z13;
        this.C = z14;
        this.D = z16;
        this.E = z17;
        this.F = z18;
        this.G = str22;
        this.H = z19;
        int i12 = i10;
        this.I = i12 * 1000;
        this.J = i11 * 1000;
        this.K = i12 > 0;
    }

    public final c a() {
        return this.i;
    }

    public final String b() {
        return this.w;
    }

    public final ju0 c() {
        int i = this.f;
        int i2 = this.g;
        k03 k03Var = this.n;
        if (k03Var == null) {
            k03Var = k03.c;
        }
        return new ju0(i, i2, k03Var, null, 24);
    }
}
