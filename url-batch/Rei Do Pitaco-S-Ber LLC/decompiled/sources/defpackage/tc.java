package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class tc {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final ec I;
    public final ec J;
    public final ec K;
    public final ec L;
    public final ec M;
    public final ec N;
    public final ec O;
    public final ec P;
    public final ec[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public tc T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public l9 b;
    public int b0;
    public l9 c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final tc[] l0;
    public boolean m;
    public final tc[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public tm d = null;
    public q70 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public tc() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        ec ecVar = new ec(this, 2);
        this.I = ecVar;
        ec ecVar2 = new ec(this, 3);
        this.J = ecVar2;
        ec ecVar3 = new ec(this, 4);
        this.K = ecVar3;
        ec ecVar4 = new ec(this, 5);
        this.L = ecVar4;
        ec ecVar5 = new ec(this, 6);
        this.M = ecVar5;
        ec ecVar6 = new ec(this, 8);
        this.N = ecVar6;
        ec ecVar7 = new ec(this, 9);
        this.O = ecVar7;
        ec ecVar8 = new ec(this, 7);
        this.P = ecVar8;
        this.Q = new ec[]{ecVar, ecVar3, ecVar2, ecVar4, ecVar5, ecVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new tc[]{null, null};
        this.m0 = new tc[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(ecVar);
        arrayList.add(ecVar2);
        arrayList.add(ecVar3);
        arrayList.add(ecVar4);
        arrayList.add(ecVar6);
        arrayList.add(ecVar7);
        arrayList.add(ecVar8);
        arrayList.add(ecVar5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, ec ecVar) {
        if (ecVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(ecVar.f);
        sb.append("'");
        if (ecVar.h != Integer.MIN_VALUE || ecVar.g != 0) {
            sb.append(",");
            sb.append(ecVar.g);
            if (ecVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(ecVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        tc tcVar = this.T;
        if (tcVar != null && (tcVar instanceof uc)) {
            ((uc) tcVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ec) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ec ecVar = (ec) arrayList.get(i);
            ecVar.c = false;
            ecVar.b = 0;
        }
    }

    public void F(y5 y5Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        tm tmVar = this.d;
        boolean z3 = z & tmVar.g;
        q70 q70Var = this.e;
        boolean z4 = z2 & q70Var.g;
        int i3 = tmVar.h.g;
        int i4 = q70Var.h.g;
        int i5 = tmVar.i.g;
        int i6 = q70Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(vp vpVar, boolean z) {
        int i;
        int i2;
        q70 q70Var;
        tm tmVar;
        vpVar.getClass();
        int n = vp.n(this.I);
        int n2 = vp.n(this.J);
        int n3 = vp.n(this.K);
        int n4 = vp.n(this.L);
        if (z && (tmVar = this.d) != null) {
            ze zeVar = tmVar.h;
            if (zeVar.j) {
                ze zeVar2 = tmVar.i;
                if (zeVar2.j) {
                    n = zeVar.g;
                    n3 = zeVar2.g;
                }
            }
        }
        if (z && (q70Var = this.e) != null) {
            ze zeVar3 = q70Var.h;
            if (zeVar3.j) {
                ze zeVar4 = q70Var.i;
                if (zeVar4.j) {
                    n2 = zeVar3.g;
                    n4 = zeVar4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Y = n;
        this.Z = n2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(uc ucVar, vp vpVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g8.o(ucVar, vpVar, this);
            hashSet.remove(this);
            b(vpVar, ucVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ec) it.next()).d.a(ucVar, vpVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ec) it2.next()).d.a(ucVar, vpVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ec) it3.next()).d.a(ucVar, vpVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ec) it4.next()).d.a(ucVar, vpVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ec) it5.next()).d.a(ucVar, vpVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.g0 == r14) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [tc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(vp vpVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r17;
        int i;
        boolean z5;
        boolean z6;
        tc tcVar;
        tc tcVar2;
        boolean[] zArr;
        ec ecVar;
        boolean[] zArr2;
        ec ecVar2;
        ec ecVar3;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        int[] iArr;
        float f;
        ec ecVar4;
        o20 o20Var;
        ec ecVar5;
        int i4;
        int i5;
        int i6;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        ec ecVar6;
        boolean z13;
        char c;
        boolean z14;
        int i8;
        int[] iArr2;
        ec ecVar7;
        o20 o20Var2;
        o20 o20Var3;
        ec ecVar8;
        int[] iArr3;
        o20 o20Var4;
        boolean z15;
        boolean z16;
        boolean z17;
        o20 o20Var5;
        ec ecVar9;
        o20 o20Var6;
        int i9;
        boolean[] zArr3;
        o20 o20Var7;
        o20 o20Var8;
        o20 o20Var9;
        int i10;
        int i11;
        boolean z18;
        int i12;
        o20 o20Var10;
        o20 o20Var11;
        ?? r27;
        q70 q70Var;
        ze zeVar;
        tc tcVar3;
        boolean z19;
        tm tmVar;
        ze zeVar2;
        int i13;
        int i14;
        boolean x;
        int i15;
        boolean y;
        tm tmVar2;
        q70 q70Var2;
        boolean z20;
        vp vpVar2 = vpVar;
        ec ecVar10 = this.I;
        o20 k = vpVar2.k(ecVar10);
        ec ecVar11 = this.K;
        o20 k2 = vpVar2.k(ecVar11);
        ec ecVar12 = this.J;
        o20 k3 = vpVar2.k(ecVar12);
        ec ecVar13 = this.L;
        o20 k4 = vpVar2.k(ecVar13);
        ec ecVar14 = this.M;
        o20 k5 = vpVar2.k(ecVar14);
        tc tcVar4 = this.T;
        if (tcVar4 != null) {
            int[] iArr4 = tcVar4.p0;
            r17 = 0;
            z2 = false;
            r17 = 0;
            z4 = iArr4[0] == 2;
            boolean z21 = iArr4[1] == 2;
            int i16 = this.q;
            if (i16 != 1) {
                if (i16 == 2) {
                    z4 = false;
                }
                z3 = z21;
            } else {
                z3 = false;
            }
            i = this.g0;
            boolean[] zArr4 = this.S;
            boolean z22 = z3;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z5 = z4;
                int i17 = r17;
                while (true) {
                    if (i17 < size) {
                        int i18 = size;
                        HashSet hashSet = ((ec) arrayList.get(i17)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i17++;
                        size = i18;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z5 = z4;
            }
            z6 = this.k;
            if (!z6 || this.l) {
                if (z6) {
                    vpVar2.d(k, this.Y);
                    vpVar2.d(k2, this.Y + this.U);
                    if (z5 && (tcVar2 = this.T) != null) {
                        uc ucVar = (uc) tcVar2;
                        WeakReference weakReference = ucVar.H0;
                        if (weakReference == null || weakReference.get() == null || ecVar10.d() > ((ec) ucVar.H0.get()).d()) {
                            ucVar.H0 = new WeakReference(ecVar10);
                        }
                        WeakReference weakReference2 = ucVar.J0;
                        if (weakReference2 == null || weakReference2.get() == null || ecVar11.d() > ((ec) ucVar.J0.get()).d()) {
                            ucVar.J0 = new WeakReference(ecVar11);
                        }
                    }
                }
                if (this.l) {
                    vpVar2.d(k3, this.Z);
                    vpVar2.d(k4, this.Z + this.V);
                    HashSet hashSet2 = ecVar14.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        vpVar2.d(k5, this.Z + this.a0);
                    }
                    if (z22 && (tcVar = this.T) != null) {
                        uc ucVar2 = (uc) tcVar;
                        WeakReference weakReference3 = ucVar2.G0;
                        if (weakReference3 == null || weakReference3.get() == null || ecVar12.d() > ((ec) ucVar2.G0.get()).d()) {
                            ucVar2.G0 = new WeakReference(ecVar12);
                        }
                        WeakReference weakReference4 = ucVar2.I0;
                        if (weakReference4 == null || weakReference4.get() == null || ecVar13.d() > ((ec) ucVar2.I0.get()).d()) {
                            ucVar2.I0 = new WeakReference(ecVar13);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z23 = r17;
                    this.k = z23;
                    this.l = z23;
                    return;
                }
            }
            zArr = this.f;
            if (z || (tmVar2 = this.d) == null || (q70Var2 = this.e) == null) {
                ecVar = ecVar14;
                zArr2 = zArr;
            } else {
                ecVar = ecVar14;
                ze zeVar3 = tmVar2.h;
                zArr2 = zArr;
                if (zeVar3.j && tmVar2.i.j && q70Var2.h.j && q70Var2.i.j) {
                    vpVar2.d(k, zeVar3.g);
                    vpVar2.d(k2, this.d.i.g);
                    vpVar2.d(k3, this.e.h.g);
                    vpVar2.d(k4, this.e.i.g);
                    vpVar2.d(k5, this.e.k.g);
                    if (this.T != null) {
                        if (z5 && zArr2[0] && !x()) {
                            vpVar2.f(vpVar2.k(this.T.K), k2, 0, 8);
                        }
                        if (z22 && zArr2[1] && !y()) {
                            z20 = false;
                            vpVar2.f(vpVar2.k(this.T.L), k4, 0, 8);
                            this.k = z20;
                            this.l = z20;
                            return;
                        }
                    }
                    z20 = false;
                    this.k = z20;
                    this.l = z20;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((uc) this.T).R(this, 0);
                    x = true;
                    i15 = 1;
                } else {
                    x = x();
                    i15 = 1;
                }
                if (w(i15)) {
                    ((uc) this.T).R(this, i15);
                    y = true;
                } else {
                    y = y();
                }
                if (!x && z5 && this.g0 != 8 && ecVar10.f == null && ecVar11.f == null) {
                    ecVar2 = ecVar10;
                    vpVar2.f(vpVar2.k(this.T.K), k2, 0, 1);
                } else {
                    ecVar2 = ecVar10;
                }
                if (!y && z22 && this.g0 != 8 && ecVar12.f == null && ecVar13.f == null && ecVar == null) {
                    vpVar2.f(vpVar2.k(this.T.L), k4, 0, 1);
                }
                ecVar3 = ecVar11;
                z7 = z22;
                z9 = y;
                z8 = x;
            } else {
                ecVar2 = ecVar10;
                ecVar3 = ecVar11;
                z7 = z22;
                z8 = false;
                z9 = false;
            }
            i2 = this.U;
            i3 = this.b0;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i19 = this.V;
            ec ecVar15 = ecVar3;
            int i20 = this.c0;
            int i21 = i19 >= i20 ? i20 : i19;
            iArr = this.p0;
            int i22 = iArr[0];
            boolean z24 = z7;
            boolean z25 = i22 == 3;
            int i23 = iArr[1];
            boolean z26 = i23 == 3;
            int i24 = this.X;
            this.A = i24;
            f = this.W;
            this.B = f;
            int i25 = this.r;
            int i26 = this.s;
            if (f <= 0.0f) {
                ecVar4 = ecVar13;
                if (this.g0 != 8) {
                    int i27 = (i22 == 3 && i25 == 0) ? 3 : i25;
                    if (i23 == 3 && i26 == 0) {
                        o20Var = k4;
                        i14 = 3;
                    } else {
                        o20Var = k4;
                        i14 = i26;
                    }
                    if (i22 == 3 && i23 == 3 && i27 == 3 && i14 == 3) {
                        if (i24 == -1) {
                            if (z25 && !z26) {
                                this.A = 0;
                            } else if (!z25 && z26) {
                                this.A = 1;
                                if (i24 == -1) {
                                    this.B = 1.0f / f;
                                }
                            }
                        }
                        if (this.A == 0 && (!ecVar12.h() || !ecVar4.h())) {
                            this.A = 1;
                        } else if (this.A == 1 && (!ecVar2.h() || !ecVar15.h())) {
                            this.A = 0;
                        }
                        if (this.A == -1 && (!ecVar12.h() || !ecVar4.h() || !ecVar2.h() || !ecVar15.h())) {
                            if (ecVar12.h() && ecVar4.h()) {
                                this.A = 0;
                            } else if (ecVar2.h() && ecVar15.h()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                        if (this.A == -1) {
                            int i28 = this.u;
                            if (i28 > 0 && this.x == 0) {
                                this.A = 0;
                            } else if (i28 == 0 && this.x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i22 == 3 && i27 == 3) {
                        this.A = 0;
                        i3 = (int) (f * i19);
                        if (i23 != 3) {
                            ecVar5 = ecVar;
                            i4 = i21;
                            i5 = 4;
                            z10 = false;
                            i6 = i14;
                            int[] iArr5 = this.t;
                            iArr5[0] = i5;
                            iArr5[1] = i6;
                            if (z10) {
                            }
                            z11 = false;
                            if (z10) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z12) {
                            }
                            ecVar6 = this.P;
                            z13 = !ecVar6.h();
                            c = '\b';
                            z14 = zArr4[0];
                            boolean z27 = zArr4[1];
                            i8 = this.o;
                            iArr2 = this.C;
                            if (i8 != 2) {
                            }
                            ecVar7 = ecVar5;
                            o20Var2 = k;
                            o20Var3 = k2;
                            ecVar8 = ecVar6;
                            iArr3 = iArr2;
                            o20Var4 = k5;
                            z15 = z8;
                            z16 = z5;
                            z17 = z24;
                            o20Var5 = k3;
                            ecVar9 = ecVar4;
                            o20Var6 = o20Var;
                            i9 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            o20Var7 = o20Var5;
                            o20Var8 = o20Var6;
                            o20Var9 = o20Var4;
                            i10 = 0;
                            i11 = 8;
                            z18 = true;
                            i12 = 1;
                            if (this.p == 2) {
                            }
                            if (i12 != 0) {
                            }
                            o20Var10 = o20Var7;
                            o20Var11 = o20Var8;
                            if (z10) {
                            }
                            if (ecVar8.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else if (i23 == 3 && i14 == 3) {
                        this.A = 1;
                        if (i24 == -1) {
                            this.B = 1.0f / f;
                        }
                        i4 = (int) (this.B * i2);
                        if (i22 == 3) {
                            i5 = i27;
                            ecVar5 = ecVar;
                            z10 = true;
                            i6 = i14;
                            int[] iArr52 = this.t;
                            iArr52[0] = i5;
                            iArr52[1] = i6;
                            if (z10) {
                            }
                            z11 = false;
                            if (z10) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z12) {
                            }
                            ecVar6 = this.P;
                            z13 = !ecVar6.h();
                            c = '\b';
                            z14 = zArr4[0];
                            boolean z272 = zArr4[1];
                            i8 = this.o;
                            iArr2 = this.C;
                            if (i8 != 2) {
                            }
                            ecVar7 = ecVar5;
                            o20Var2 = k;
                            o20Var3 = k2;
                            ecVar8 = ecVar6;
                            iArr3 = iArr2;
                            o20Var4 = k5;
                            z15 = z8;
                            z16 = z5;
                            z17 = z24;
                            o20Var5 = k3;
                            ecVar9 = ecVar4;
                            o20Var6 = o20Var;
                            i9 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            o20Var7 = o20Var5;
                            o20Var8 = o20Var6;
                            o20Var9 = o20Var4;
                            i10 = 0;
                            i11 = 8;
                            z18 = true;
                            i12 = 1;
                            if (this.p == 2) {
                            }
                            if (i12 != 0) {
                            }
                            o20Var10 = o20Var7;
                            o20Var11 = o20Var8;
                            if (z10) {
                            }
                            if (ecVar8.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                        i5 = i27;
                        ecVar5 = ecVar;
                        i6 = 4;
                        z10 = false;
                        int[] iArr522 = this.t;
                        iArr522[0] = i5;
                        iArr522[1] = i6;
                        if (z10) {
                            i7 = -1;
                        } else {
                            int i29 = this.A;
                            i7 = -1;
                            if (i29 == 0 || i29 == -1) {
                                z11 = true;
                                boolean z28 = !z10 && ((i13 = this.A) == 1 || i13 == i7);
                                z12 = iArr[0] != 2 && (this instanceof uc);
                                if (z12) {
                                    i3 = 0;
                                }
                                ecVar6 = this.P;
                                z13 = !ecVar6.h();
                                c = '\b';
                                z14 = zArr4[0];
                                boolean z2722 = zArr4[1];
                                i8 = this.o;
                                iArr2 = this.C;
                                if (i8 != 2 && !this.k) {
                                    if (z && (tmVar = this.d) != null) {
                                        zeVar2 = tmVar.h;
                                        if (zeVar2.j || !tmVar.i.j) {
                                            c = '\b';
                                        } else if (z) {
                                            vpVar2.d(k, zeVar2.g);
                                            vpVar2.d(k2, this.d.i.g);
                                            if (this.T != null && z5 && zArr2[0] && !x()) {
                                                vpVar2.f(vpVar2.k(this.T.K), k2, 0, 8);
                                            }
                                        }
                                    }
                                    tc tcVar5 = this.T;
                                    o20 k6 = tcVar5 == null ? vpVar2.k(tcVar5.K) : null;
                                    tc tcVar6 = this.T;
                                    o20 k7 = tcVar6 == null ? vpVar2.k(tcVar6.I) : null;
                                    z16 = z5;
                                    i9 = i5;
                                    z15 = z8;
                                    ecVar8 = ecVar6;
                                    iArr3 = iArr2;
                                    boolean z29 = z11;
                                    o20Var2 = k;
                                    z17 = z24;
                                    o20Var5 = k3;
                                    o20Var3 = k2;
                                    ecVar9 = ecVar4;
                                    o20Var6 = o20Var;
                                    ecVar7 = ecVar5;
                                    o20Var4 = k5;
                                    zArr3 = zArr2;
                                    vpVar2 = vpVar;
                                    d(vpVar2, true, z16, z17, zArr2[0], k7, k6, iArr[0], z12, this.I, this.K, this.Y, i3, this.b0, iArr2[0], this.d0, z29, iArr[1] == 3, z15, z9, z14, i9, i6, this.u, this.v, this.w, z13);
                                    if (z && (q70Var = this.e) != null) {
                                        zeVar = q70Var.h;
                                        if (zeVar.j && q70Var.i.j) {
                                            int i30 = zeVar.g;
                                            o20Var7 = o20Var5;
                                            vpVar2.d(o20Var7, i30);
                                            o20Var8 = o20Var6;
                                            vpVar2.d(o20Var8, this.e.i.g);
                                            o20Var9 = o20Var4;
                                            vpVar2.d(o20Var9, this.e.k.g);
                                            tcVar3 = this.T;
                                            if (tcVar3 == null && !z9 && z17) {
                                                z19 = true;
                                                z19 = true;
                                                if (zArr3[1]) {
                                                    i10 = 0;
                                                    i11 = 8;
                                                    vpVar2.f(vpVar2.k(tcVar3.L), o20Var8, 0, 8);
                                                } else {
                                                    i10 = 0;
                                                    i11 = 8;
                                                }
                                            } else {
                                                i10 = 0;
                                                i11 = 8;
                                                z19 = true;
                                            }
                                            i12 = i10;
                                            z18 = z19;
                                            if (this.p == 2) {
                                                i12 = i10;
                                            }
                                            if (i12 != 0 || this.l) {
                                                o20Var10 = o20Var7;
                                                o20Var11 = o20Var8;
                                            } else {
                                                int i31 = (iArr[z18 ? 1 : 0] == 2 && (this instanceof uc)) ? z18 ? 1 : 0 : i10;
                                                int i32 = i31 != 0 ? i10 : i4;
                                                tc tcVar7 = this.T;
                                                o20 k8 = tcVar7 != null ? vpVar2.k(tcVar7.L) : null;
                                                tc tcVar8 = this.T;
                                                o20 k9 = tcVar8 != null ? vpVar2.k(tcVar8.J) : null;
                                                int i33 = this.a0;
                                                if (i33 <= 0) {
                                                    r27 = z13;
                                                }
                                                ec ecVar16 = ecVar7;
                                                if (ecVar16.f != null) {
                                                    vpVar2.e(o20Var9, o20Var7, i33, i11);
                                                    vpVar2.e(o20Var9, vpVar2.k(ecVar16.f), ecVar16.e(), i11);
                                                    if (z17) {
                                                        vpVar2.f(k8, vpVar2.k(ecVar9), i10, 5);
                                                    }
                                                    r27 = i10;
                                                } else if (this.g0 == i11) {
                                                    vpVar2.e(o20Var9, o20Var7, ecVar16.e(), i11);
                                                    r27 = z13;
                                                } else {
                                                    vpVar2.e(o20Var9, o20Var7, i33, i11);
                                                    r27 = z13;
                                                }
                                                boolean z30 = zArr3[z18 ? 1 : 0];
                                                int i34 = i10;
                                                int i35 = iArr[z18 ? 1 : 0];
                                                int i36 = this.Z;
                                                int i37 = this.c0;
                                                int i38 = iArr3[z18 ? 1 : 0];
                                                float f2 = this.e0;
                                                int i39 = iArr[i34];
                                                boolean z31 = z18 ? 1 : 0;
                                                ?? r18 = z18;
                                                if (i39 != 3) {
                                                    r18 = i34;
                                                }
                                                o20Var11 = o20Var8;
                                                o20Var10 = o20Var7;
                                                vpVar2 = vpVar;
                                                d(vpVar2, false, z17, z16, z30, k9, k8, i35, i31, this.J, this.L, i36, i32, i37, i38, f2, z28, r18, z9, z15, z2722, i6, i9, this.x, this.y, this.z, r27);
                                            }
                                            if (z10) {
                                                int i40 = this.A;
                                                float f3 = this.B;
                                                if (i40 == 1) {
                                                    m6 l = vpVar2.l();
                                                    l.d.g(o20Var11, -1.0f);
                                                    l.d.g(o20Var10, 1.0f);
                                                    l.d.g(o20Var3, f3);
                                                    l.d.g(o20Var2, -f3);
                                                    vpVar2.c(l);
                                                } else {
                                                    m6 l2 = vpVar2.l();
                                                    l2.d.g(o20Var3, -1.0f);
                                                    l2.d.g(o20Var2, 1.0f);
                                                    l2.d.g(o20Var11, f3);
                                                    l2.d.g(o20Var10, -f3);
                                                    vpVar2.c(l2);
                                                }
                                            }
                                            if (ecVar8.h()) {
                                                ec ecVar17 = ecVar8;
                                                tc tcVar9 = ecVar17.f.d;
                                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                                int e = ecVar17.e();
                                                o20 k10 = vpVar2.k(i(2));
                                                o20 k11 = vpVar2.k(i(3));
                                                o20 k12 = vpVar2.k(i(4));
                                                o20 k13 = vpVar2.k(i(5));
                                                o20 k14 = vpVar2.k(tcVar9.i(2));
                                                o20 k15 = vpVar2.k(tcVar9.i(3));
                                                o20 k16 = vpVar2.k(tcVar9.i(4));
                                                o20 k17 = vpVar2.k(tcVar9.i(5));
                                                m6 l3 = vpVar2.l();
                                                double d = radians;
                                                double sin = Math.sin(d);
                                                double d2 = e;
                                                l3.d.g(k15, 0.5f);
                                                l3.d.g(k17, 0.5f);
                                                l3.d.g(k11, -0.5f);
                                                l3.d.g(k13, -0.5f);
                                                l3.b = -((float) (sin * d2));
                                                vpVar2.c(l3);
                                                m6 l4 = vpVar2.l();
                                                float cos = (float) (Math.cos(d) * d2);
                                                l4.d.g(k14, 0.5f);
                                                l4.d.g(k16, 0.5f);
                                                l4.d.g(k10, -0.5f);
                                                l4.d.g(k12, -0.5f);
                                                l4.b = -cos;
                                                vpVar2.c(l4);
                                            }
                                            this.k = false;
                                            this.l = false;
                                        }
                                    }
                                    o20Var7 = o20Var5;
                                    o20Var8 = o20Var6;
                                    o20Var9 = o20Var4;
                                    i10 = 0;
                                    i11 = 8;
                                    z18 = true;
                                    i12 = 1;
                                    if (this.p == 2) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    o20Var10 = o20Var7;
                                    o20Var11 = o20Var8;
                                    if (z10) {
                                    }
                                    if (ecVar8.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                                ecVar7 = ecVar5;
                                o20Var2 = k;
                                o20Var3 = k2;
                                ecVar8 = ecVar6;
                                iArr3 = iArr2;
                                o20Var4 = k5;
                                z15 = z8;
                                z16 = z5;
                                z17 = z24;
                                o20Var5 = k3;
                                ecVar9 = ecVar4;
                                o20Var6 = o20Var;
                                i9 = i5;
                                zArr3 = zArr2;
                                if (z) {
                                    zeVar = q70Var.h;
                                    if (zeVar.j) {
                                        int i302 = zeVar.g;
                                        o20Var7 = o20Var5;
                                        vpVar2.d(o20Var7, i302);
                                        o20Var8 = o20Var6;
                                        vpVar2.d(o20Var8, this.e.i.g);
                                        o20Var9 = o20Var4;
                                        vpVar2.d(o20Var9, this.e.k.g);
                                        tcVar3 = this.T;
                                        if (tcVar3 == null) {
                                        }
                                        i10 = 0;
                                        i11 = 8;
                                        z19 = true;
                                        i12 = i10;
                                        z18 = z19;
                                        if (this.p == 2) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        o20Var10 = o20Var7;
                                        o20Var11 = o20Var8;
                                        if (z10) {
                                        }
                                        if (ecVar8.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                    }
                                }
                                o20Var7 = o20Var5;
                                o20Var8 = o20Var6;
                                o20Var9 = o20Var4;
                                i10 = 0;
                                i11 = 8;
                                z18 = true;
                                i12 = 1;
                                if (this.p == 2) {
                                }
                                if (i12 != 0) {
                                }
                                o20Var10 = o20Var7;
                                o20Var11 = o20Var8;
                                if (z10) {
                                }
                                if (ecVar8.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                        }
                        z11 = false;
                        if (z10) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z12) {
                        }
                        ecVar6 = this.P;
                        z13 = !ecVar6.h();
                        c = '\b';
                        z14 = zArr4[0];
                        boolean z27222 = zArr4[1];
                        i8 = this.o;
                        iArr2 = this.C;
                        if (i8 != 2) {
                            if (z) {
                                zeVar2 = tmVar.h;
                                if (zeVar2.j) {
                                }
                                c = '\b';
                            }
                            tc tcVar52 = this.T;
                            if (tcVar52 == null) {
                            }
                            tc tcVar62 = this.T;
                            if (tcVar62 == null) {
                            }
                            z16 = z5;
                            i9 = i5;
                            z15 = z8;
                            ecVar8 = ecVar6;
                            iArr3 = iArr2;
                            boolean z292 = z11;
                            o20Var2 = k;
                            z17 = z24;
                            o20Var5 = k3;
                            o20Var3 = k2;
                            ecVar9 = ecVar4;
                            o20Var6 = o20Var;
                            ecVar7 = ecVar5;
                            o20Var4 = k5;
                            zArr3 = zArr2;
                            vpVar2 = vpVar;
                            d(vpVar2, true, z16, z17, zArr2[0], k7, k6, iArr[0], z12, this.I, this.K, this.Y, i3, this.b0, iArr2[0], this.d0, z292, iArr[1] == 3, z15, z9, z14, i9, i6, this.u, this.v, this.w, z13);
                            if (z) {
                            }
                            o20Var7 = o20Var5;
                            o20Var8 = o20Var6;
                            o20Var9 = o20Var4;
                            i10 = 0;
                            i11 = 8;
                            z18 = true;
                            i12 = 1;
                            if (this.p == 2) {
                            }
                            if (i12 != 0) {
                            }
                            o20Var10 = o20Var7;
                            o20Var11 = o20Var8;
                            if (z10) {
                            }
                            if (ecVar8.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                        ecVar7 = ecVar5;
                        o20Var2 = k;
                        o20Var3 = k2;
                        ecVar8 = ecVar6;
                        iArr3 = iArr2;
                        o20Var4 = k5;
                        z15 = z8;
                        z16 = z5;
                        z17 = z24;
                        o20Var5 = k3;
                        ecVar9 = ecVar4;
                        o20Var6 = o20Var;
                        i9 = i5;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        o20Var7 = o20Var5;
                        o20Var8 = o20Var6;
                        o20Var9 = o20Var4;
                        i10 = 0;
                        i11 = 8;
                        z18 = true;
                        i12 = 1;
                        if (this.p == 2) {
                        }
                        if (i12 != 0) {
                        }
                        o20Var10 = o20Var7;
                        o20Var11 = o20Var8;
                        if (z10) {
                        }
                        if (ecVar8.h()) {
                        }
                        this.k = false;
                        this.l = false;
                    }
                    i5 = i27;
                    ecVar5 = ecVar;
                    i4 = i21;
                    z10 = true;
                    i6 = i14;
                    int[] iArr5222 = this.t;
                    iArr5222[0] = i5;
                    iArr5222[1] = i6;
                    if (z10) {
                    }
                    z11 = false;
                    if (z10) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z12) {
                    }
                    ecVar6 = this.P;
                    z13 = !ecVar6.h();
                    c = '\b';
                    z14 = zArr4[0];
                    boolean z272222 = zArr4[1];
                    i8 = this.o;
                    iArr2 = this.C;
                    if (i8 != 2) {
                    }
                    ecVar7 = ecVar5;
                    o20Var2 = k;
                    o20Var3 = k2;
                    ecVar8 = ecVar6;
                    iArr3 = iArr2;
                    o20Var4 = k5;
                    z15 = z8;
                    z16 = z5;
                    z17 = z24;
                    o20Var5 = k3;
                    ecVar9 = ecVar4;
                    o20Var6 = o20Var;
                    i9 = i5;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    o20Var7 = o20Var5;
                    o20Var8 = o20Var6;
                    o20Var9 = o20Var4;
                    i10 = 0;
                    i11 = 8;
                    z18 = true;
                    i12 = 1;
                    if (this.p == 2) {
                    }
                    if (i12 != 0) {
                    }
                    o20Var10 = o20Var7;
                    o20Var11 = o20Var8;
                    if (z10) {
                    }
                    if (ecVar8.h()) {
                    }
                    this.k = false;
                    this.l = false;
                }
            } else {
                ecVar4 = ecVar13;
            }
            o20Var = k4;
            ecVar5 = ecVar;
            i4 = i21;
            i5 = i25;
            i6 = i26;
            z10 = false;
            int[] iArr52222 = this.t;
            iArr52222[0] = i5;
            iArr52222[1] = i6;
            if (z10) {
            }
            z11 = false;
            if (z10) {
            }
            if (iArr[0] != 2) {
            }
            if (z12) {
            }
            ecVar6 = this.P;
            z13 = !ecVar6.h();
            c = '\b';
            z14 = zArr4[0];
            boolean z2722222 = zArr4[1];
            i8 = this.o;
            iArr2 = this.C;
            if (i8 != 2) {
            }
            ecVar7 = ecVar5;
            o20Var2 = k;
            o20Var3 = k2;
            ecVar8 = ecVar6;
            iArr3 = iArr2;
            o20Var4 = k5;
            z15 = z8;
            z16 = z5;
            z17 = z24;
            o20Var5 = k3;
            ecVar9 = ecVar4;
            o20Var6 = o20Var;
            i9 = i5;
            zArr3 = zArr2;
            if (z) {
            }
            o20Var7 = o20Var5;
            o20Var8 = o20Var6;
            o20Var9 = o20Var4;
            i10 = 0;
            i11 = 8;
            z18 = true;
            i12 = 1;
            if (this.p == 2) {
            }
            if (i12 != 0) {
            }
            o20Var10 = o20Var7;
            o20Var11 = o20Var8;
            if (z10) {
            }
            if (ecVar8.h()) {
            }
            this.k = false;
            this.l = false;
        }
        z2 = false;
        z3 = z2 ? 1 : 0;
        z4 = z3;
        r17 = z2;
        i = this.g0;
        boolean[] zArr42 = this.S;
        boolean z222 = z3;
        if (i != 8) {
        }
        z6 = this.k;
        if (!z6) {
        }
        if (z6) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z232 = r17;
            this.k = z232;
            this.l = z232;
            return;
        }
        zArr = this.f;
        if (z) {
        }
        ecVar = ecVar14;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i2 = this.U;
        i3 = this.b0;
        if (i2 >= i3) {
        }
        int i192 = this.V;
        ec ecVar152 = ecVar3;
        int i202 = this.c0;
        if (i192 >= i202) {
        }
        iArr = this.p0;
        int i222 = iArr[0];
        boolean z242 = z7;
        if (i222 == 3) {
        }
        int i232 = iArr[1];
        if (i232 == 3) {
        }
        int i242 = this.X;
        this.A = i242;
        f = this.W;
        this.B = f;
        int i252 = this.r;
        int i262 = this.s;
        if (f <= 0.0f) {
        }
        o20Var = k4;
        ecVar5 = ecVar;
        i4 = i21;
        i5 = i252;
        i6 = i262;
        z10 = false;
        int[] iArr522222 = this.t;
        iArr522222[0] = i5;
        iArr522222[1] = i6;
        if (z10) {
        }
        z11 = false;
        if (z10) {
        }
        if (iArr[0] != 2) {
        }
        if (z12) {
        }
        ecVar6 = this.P;
        z13 = !ecVar6.h();
        c = '\b';
        z14 = zArr42[0];
        boolean z27222222 = zArr42[1];
        i8 = this.o;
        iArr2 = this.C;
        if (i8 != 2) {
        }
        ecVar7 = ecVar5;
        o20Var2 = k;
        o20Var3 = k2;
        ecVar8 = ecVar6;
        iArr3 = iArr2;
        o20Var4 = k5;
        z15 = z8;
        z16 = z5;
        z17 = z242;
        o20Var5 = k3;
        ecVar9 = ecVar4;
        o20Var6 = o20Var;
        i9 = i5;
        zArr3 = zArr2;
        if (z) {
        }
        o20Var7 = o20Var5;
        o20Var8 = o20Var6;
        o20Var9 = o20Var4;
        i10 = 0;
        i11 = 8;
        z18 = true;
        i12 = 1;
        if (this.p == 2) {
        }
        if (i12 != 0) {
        }
        o20Var10 = o20Var7;
        o20Var11 = o20Var8;
        if (z10) {
        }
        if (ecVar8.h()) {
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(vp vpVar, boolean z, boolean z2, boolean z3, boolean z4, o20 o20Var, o20 o20Var2, int i, boolean z5, ec ecVar, ec ecVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        boolean z16;
        o20 k;
        o20 k2;
        ec ecVar3;
        o20 o20Var3;
        boolean z17;
        int i13;
        o20 o20Var4;
        o20 o20Var5;
        o20 o20Var6;
        o20 o20Var7;
        int i14;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        tc tcVar;
        int i17;
        int i18;
        ec ecVar4;
        boolean z22;
        int i19;
        boolean z23;
        int i20;
        int i21;
        HashSet hashSet;
        boolean z24;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z25;
        boolean z26;
        int i27;
        vp vpVar2 = vpVar;
        int i28 = i8;
        int i29 = i9;
        o20 k3 = vpVar2.k(ecVar);
        o20 k4 = vpVar2.k(ecVar2);
        o20 k5 = vpVar2.k(ecVar.f);
        o20 k6 = vpVar2.k(ecVar2.f);
        boolean h = ecVar.h();
        boolean h2 = ecVar2.h();
        boolean h3 = this.P.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i6;
        int h4 = n20.h(i);
        boolean z27 = (h4 == 0 || h4 == 1 || h4 != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 == -1 || !z) {
            i33 = i3;
            z12 = z27;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i33 = i34;
            z13 = false;
        }
        boolean z28 = z13;
        if (this.g0 == 8) {
            z14 = false;
            i10 = 0;
        } else {
            i10 = i33;
            z14 = z28;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                vpVar2.d(k3, i2);
            } else if (h && !h2) {
                z15 = z14;
                i11 = 8;
                vpVar2.e(k3, k5, ecVar.e(), 8);
            }
            z15 = z14;
            i11 = 8;
        } else {
            z15 = z14;
            i11 = 8;
        }
        if (z15) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i10;
                }
                if (i29 == -2) {
                    i29 = i10;
                }
                if (i10 > 0 && i32 != 1) {
                    i10 = 0;
                }
                if (i28 > 0) {
                    vpVar2.f(k4, k3, i28, 8);
                    i10 = Math.max(i10, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        vpVar2.g(k4, k3, i29, 8);
                    }
                    i10 = Math.min(i10, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        vpVar2.e(k4, k3, i10, 8);
                    } else if (z8) {
                        vpVar2.e(k4, k3, i10, 5);
                        vpVar2.g(k4, k3, i10, 8);
                    } else {
                        vpVar2.e(k4, k3, i10, 5);
                        vpVar2.g(k4, k3, i10, 8);
                    }
                } else if (i32 == 2) {
                    int i35 = ecVar.e;
                    if (i35 == 3 || i35 == 5) {
                        k = vpVar2.k(this.T.i(3));
                        k2 = vpVar2.k(this.T.i(5));
                    } else {
                        k = vpVar2.k(this.T.i(2));
                        k2 = vpVar2.k(this.T.i(4));
                    }
                    m6 l = vpVar2.l();
                    int i36 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    vpVar2.c(l);
                    if (z2) {
                        z15 = false;
                    }
                    z16 = z4;
                    i12 = i36;
                } else {
                    i12 = i28;
                    z16 = true;
                }
            } else {
                int max = Math.max(i28, i10);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                vpVar2.e(k4, k3, max, 8);
                z16 = z4;
                i12 = i28;
                z15 = false;
            }
            if (z11 || z8) {
                boolean z29 = z16;
                if (i31 >= 2 && z2 && z29) {
                    vpVar2.f(k3, o20Var, 0, 8);
                    ec ecVar5 = this.M;
                    boolean z30 = z || ecVar5.f == null;
                    if (!z && (ecVar3 = ecVar5.f) != null) {
                        tc tcVar2 = ecVar3.d;
                        if (tcVar2.W != 0.0f) {
                            int[] iArr = tcVar2.p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z30 = true;
                            }
                        }
                        z30 = false;
                    }
                    if (z30) {
                        vpVar2.f(o20Var2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                ecVar4 = ecVar2;
                o20Var6 = k4;
                z17 = z16;
                o20Var3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    o20Var3 = k6;
                    if (h && h2) {
                        tc tcVar3 = ecVar.f.d;
                        tc tcVar4 = ecVar2.f.d;
                        z17 = z16;
                        tc tcVar5 = this.T;
                        int i37 = 6;
                        if (z15) {
                            if (i32 == 0) {
                                if (i29 != 0 || i12 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z19 = true;
                                } else if (k5.k && o20Var3.k) {
                                    vpVar2.e(k3, k5, ecVar.e(), 8);
                                    vpVar2.e(k4, o20Var3, -ecVar2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z19 = false;
                                }
                                if ((tcVar3 instanceof d7) || (tcVar4 instanceof d7)) {
                                    vpVar2 = vpVar;
                                    i13 = i32;
                                    o20Var5 = k3;
                                    o20Var6 = k4;
                                    z20 = z26;
                                    o20Var4 = o20Var2;
                                    i15 = i25;
                                    o20Var7 = k5;
                                    i14 = 6;
                                    z18 = z25;
                                    i16 = 4;
                                    if (z19 || o20Var7 != o20Var3 || tcVar3 == tcVar5) {
                                        z21 = true;
                                    } else {
                                        z19 = false;
                                        z21 = false;
                                    }
                                    if (z18) {
                                        tcVar = tcVar4;
                                        i17 = i12;
                                        i18 = i13;
                                        ecVar4 = ecVar2;
                                        z22 = z2;
                                    } else {
                                        if (z15 || z7 || z9 || o20Var7 != o20Var || o20Var3 != o20Var4) {
                                            z22 = z2;
                                            z24 = z21;
                                            i22 = i15;
                                        } else {
                                            i14 = 8;
                                            z22 = false;
                                            i22 = 8;
                                            z24 = false;
                                        }
                                        o20 o20Var8 = o20Var7;
                                        i17 = i12;
                                        i18 = i13;
                                        tcVar = tcVar4;
                                        ecVar4 = ecVar2;
                                        vpVar2.b(o20Var5, o20Var8, ecVar.e(), f, o20Var3, o20Var6, ecVar2.e(), i14);
                                        o20Var7 = o20Var8;
                                        i15 = i22;
                                        z21 = z24;
                                    }
                                    if (this.g0 != 8 && ((hashSet = ecVar4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z19) {
                                        if (z22 && o20Var7 != o20Var3 && !z15 && ((tcVar3 instanceof d7) || (tcVar instanceof d7))) {
                                            i15 = 6;
                                        }
                                        vpVar2.f(o20Var5, o20Var7, ecVar.e(), i15);
                                        vpVar2.g(o20Var6, o20Var3, -ecVar4.e(), i15);
                                    }
                                    if (z22 || !z10 || (tcVar3 instanceof d7) || (tcVar instanceof d7) || tcVar == tcVar5) {
                                        i19 = i16;
                                        z23 = z21;
                                    } else {
                                        i19 = 6;
                                        i15 = 6;
                                        z23 = true;
                                    }
                                    if (z23) {
                                        if (z20 && (!z9 || z3)) {
                                            if (tcVar3 != tcVar5 && tcVar != tcVar5) {
                                                i37 = i19;
                                            }
                                            if ((tcVar3 instanceof gm) || (tcVar instanceof gm)) {
                                                i37 = 5;
                                            }
                                            if ((tcVar3 instanceof d7) || (tcVar instanceof d7)) {
                                                i37 = 5;
                                            }
                                            i19 = Math.max(z9 ? 5 : i37, i19);
                                        }
                                        if (z22) {
                                            i19 = Math.min(i15, i19);
                                            if (z6 && !z9 && (tcVar3 == tcVar5 || tcVar == tcVar5)) {
                                                i21 = 4;
                                                vpVar2.e(o20Var5, o20Var7, ecVar.e(), i21);
                                                vpVar2.e(o20Var6, o20Var3, -ecVar4.e(), i21);
                                            }
                                        }
                                        i21 = i19;
                                        vpVar2.e(o20Var5, o20Var7, ecVar.e(), i21);
                                        vpVar2.e(o20Var6, o20Var3, -ecVar4.e(), i21);
                                    }
                                    if (z22) {
                                        int e = o20Var == o20Var7 ? ecVar.e() : 0;
                                        if (o20Var7 != o20Var) {
                                            vpVar2.f(o20Var5, o20Var, e, 5);
                                        }
                                    }
                                    if (z22 && z15 && i4 == 0 && i17 == 0) {
                                        if (z15 || i18 != 3) {
                                            i20 = 5;
                                            vpVar2.f(o20Var6, o20Var5, 0, 5);
                                        } else {
                                            vpVar2.f(o20Var6, o20Var5, 0, 8);
                                        }
                                    }
                                    i20 = 5;
                                } else {
                                    vpVar2 = vpVar;
                                    o20Var5 = k3;
                                    o20Var6 = k4;
                                    z20 = z26;
                                    i15 = i25;
                                    o20Var7 = k5;
                                    i14 = 6;
                                    z18 = z25;
                                    i16 = i26;
                                    i13 = i32;
                                    o20Var4 = o20Var2;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.g0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = i16;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                        if (z15) {
                                        }
                                        i20 = 5;
                                        vpVar2.f(o20Var6, o20Var5, 0, 5);
                                    }
                                    i20 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((tcVar3 instanceof d7) || (tcVar4 instanceof d7)) {
                                        vpVar2 = vpVar;
                                        i13 = i32;
                                        o20Var5 = k3;
                                        o20Var6 = k4;
                                        o20Var7 = k5;
                                        i14 = 6;
                                        i15 = 5;
                                    } else {
                                        vpVar2 = vpVar;
                                        i13 = i32;
                                        o20Var5 = k3;
                                        o20Var6 = k4;
                                        o20Var7 = k5;
                                        i14 = 6;
                                        i15 = 5;
                                        i16 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = false;
                                        o20Var4 = o20Var2;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.g0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = i16;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i20 = 5;
                                    }
                                } else if (i32 == 1) {
                                    vpVar2 = vpVar;
                                    i13 = i32;
                                    o20Var5 = k3;
                                    o20Var6 = k4;
                                    o20Var7 = k5;
                                    i14 = 6;
                                    i15 = 8;
                                } else if (i32 == 3) {
                                    i13 = i32;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i16 = i24;
                                            o20Var5 = k3;
                                            o20Var6 = k4;
                                            o20Var7 = k5;
                                            i14 = 6;
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            o20Var4 = o20Var2;
                                        } else if (i29 > 0) {
                                            vpVar2 = vpVar;
                                            o20Var4 = o20Var2;
                                            o20Var5 = k3;
                                            o20Var6 = k4;
                                            o20Var7 = k5;
                                            i14 = 6;
                                            i15 = 5;
                                        } else {
                                            if (i29 != 0 || i12 != 0) {
                                                vpVar2 = vpVar;
                                                o20Var4 = o20Var2;
                                                o20Var5 = k3;
                                                o20Var6 = k4;
                                                o20Var7 = k5;
                                                i14 = 6;
                                                i15 = 5;
                                                i16 = 4;
                                            } else if (z9) {
                                                i23 = (tcVar3 == tcVar5 || tcVar4 == tcVar5) ? 5 : 4;
                                                o20Var4 = o20Var2;
                                                o20Var5 = k3;
                                                o20Var6 = k4;
                                                o20Var7 = k5;
                                                i14 = 6;
                                                i16 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else {
                                                vpVar2 = vpVar;
                                                o20Var4 = o20Var2;
                                                o20Var5 = k3;
                                                o20Var6 = k4;
                                                o20Var7 = k5;
                                                i14 = 6;
                                                i15 = 5;
                                                i16 = 8;
                                            }
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            if (z19) {
                                            }
                                            z21 = true;
                                            if (z18) {
                                            }
                                            if (this.g0 != 8) {
                                            }
                                            if (z19) {
                                            }
                                            if (z22) {
                                            }
                                            i19 = i16;
                                            z23 = z21;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (z22) {
                                            }
                                            i20 = 5;
                                        }
                                        i15 = i23;
                                        vpVar2 = vpVar;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.g0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = i16;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i20 = 5;
                                    } else if (z9) {
                                        vpVar2 = vpVar;
                                        o20Var4 = o20Var2;
                                        o20Var5 = k3;
                                        o20Var6 = k4;
                                        o20Var7 = k5;
                                        i15 = 8;
                                        i14 = z2 ? 5 : 4;
                                    } else {
                                        vpVar2 = vpVar;
                                        o20Var4 = o20Var2;
                                        o20Var5 = k3;
                                        o20Var6 = k4;
                                        o20Var7 = k5;
                                        i15 = 8;
                                        i14 = 8;
                                    }
                                    i16 = 5;
                                    z18 = true;
                                    z19 = true;
                                    z20 = true;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.g0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = i16;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                    }
                                    i20 = 5;
                                } else {
                                    i13 = i32;
                                    vpVar2 = vpVar;
                                    o20Var4 = o20Var2;
                                    o20Var5 = k3;
                                    o20Var6 = k4;
                                    o20Var7 = k5;
                                    i14 = 6;
                                    i15 = 5;
                                    i16 = 4;
                                    z18 = false;
                                    z19 = false;
                                }
                                i16 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                o20Var4 = o20Var2;
                                if (z19) {
                                }
                                z21 = true;
                                if (z18) {
                                }
                                if (this.g0 != 8) {
                                }
                                if (z19) {
                                }
                                if (z22) {
                                }
                                i19 = i16;
                                z23 = z21;
                                if (z23) {
                                }
                                if (z22) {
                                }
                                if (z22) {
                                }
                                i20 = 5;
                            }
                            i27 = i20;
                            if (z22 && z17) {
                                int e2 = ecVar4.f != null ? ecVar4.e() : 0;
                                if (o20Var3 != o20Var2) {
                                    vpVar2.f(o20Var2, o20Var6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i13 = i32;
                        if (k5.k && o20Var3.k) {
                            vpVar.b(k3, k5, ecVar.e(), f, o20Var3, k4, ecVar2.e(), 8);
                            if (z2 && z17) {
                                int e3 = ecVar2.f != null ? ecVar2.e() : 0;
                                if (o20Var3 != o20Var2) {
                                    vpVar.f(o20Var2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        vpVar2 = vpVar;
                        o20Var4 = o20Var2;
                        o20Var5 = k3;
                        o20Var6 = k4;
                        o20Var7 = k5;
                        i14 = 6;
                        i15 = 5;
                        i16 = 4;
                        z18 = true;
                        z19 = true;
                        z20 = false;
                        if (z19) {
                        }
                        z21 = true;
                        if (z18) {
                        }
                        if (this.g0 != 8) {
                        }
                        if (z19) {
                        }
                        if (z22) {
                        }
                        i19 = i16;
                        z23 = z21;
                        if (z23) {
                        }
                        if (z22) {
                        }
                        if (z22) {
                        }
                        i20 = 5;
                        i27 = i20;
                        if (z22) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    o20Var3 = k6;
                    vpVar2.e(k4, o20Var3, -ecVar2.e(), 8);
                    if (z2) {
                        vpVar2.f(k3, o20Var, 0, 5);
                        ecVar4 = ecVar2;
                        i20 = 5;
                        o20Var6 = k4;
                        z17 = z16;
                        z22 = z2;
                        i27 = i20;
                        if (z22) {
                        }
                    }
                }
                ecVar4 = ecVar2;
                o20Var6 = k4;
                z17 = z16;
            } else {
                ecVar4 = ecVar2;
                o20Var6 = k4;
                z17 = z16;
                o20Var3 = k6;
                z22 = z2;
                i27 = (z2 && (ecVar.f.d instanceof d7)) ? 8 : 5;
                if (z22) {
                }
            }
            i20 = 5;
            z22 = z2;
            i27 = i20;
            if (z22) {
            }
        } else if (z5) {
            vpVar2.e(k4, k3, 0, 3);
            if (i4 > 0) {
                vpVar2.f(k4, k3, i4, i11);
            }
            if (i5 < Integer.MAX_VALUE) {
                vpVar2.g(k4, k3, i5, i11);
            }
        } else {
            vpVar2.e(k4, k3, i10, i11);
        }
        z16 = z4;
        i12 = i28;
        if (z11) {
        }
        boolean z292 = z16;
        if (i31 >= 2) {
        }
    }

    public final void e(int i, tc tcVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, tcVar, i2, 0);
                    e(4, tcVar, i2, 0);
                    i(7).a(tcVar.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, tcVar, i2, 0);
                        e(5, tcVar, i2, 0);
                        i(7).a(tcVar.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            ec i4 = i(2);
            ec i5 = i(4);
            ec i6 = i(3);
            ec i7 = i(5);
            boolean z2 = true;
            if ((i4 == null || !i4.h()) && (i5 == null || !i5.h())) {
                e(2, tcVar, 2, 0);
                e(4, tcVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(3, tcVar, 3, 0);
                e(5, tcVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(tcVar.i(7), 0);
                return;
            } else if (z) {
                i(8).a(tcVar.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(tcVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            ec i8 = i(2);
            ec i9 = tcVar.i(i2);
            ec i10 = i(4);
            i8.a(i9, 0);
            i10.a(i9, 0);
            i(8).a(i9, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            ec i11 = tcVar.i(i2);
            i(3).a(i11, 0);
            i(5).a(i11, 0);
            i(9).a(i11, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(tcVar.i(2), 0);
            i(4).a(tcVar.i(4), 0);
            i(8).a(tcVar.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(tcVar.i(3), 0);
            i(5).a(tcVar.i(5), 0);
            i(9).a(tcVar.i(i2), 0);
            return;
        }
        ec i12 = i(i);
        ec i13 = tcVar.i(i2);
        if (i12.i(i13)) {
            if (i == 6) {
                ec i14 = i(3);
                ec i15 = i(5);
                if (i14 != null) {
                    i14.j();
                }
                if (i15 != null) {
                    i15.j();
                }
            } else if (i == 3 || i == 5) {
                ec i16 = i(6);
                if (i16 != null) {
                    i16.j();
                }
                ec i17 = i(7);
                if (i17.f != i13) {
                    i17.j();
                }
                ec f = i(i).f();
                ec i18 = i(9);
                if (i18.h()) {
                    f.j();
                    i18.j();
                }
            } else if (i == 2 || i == 4) {
                ec i19 = i(7);
                if (i19.f != i13) {
                    i19.j();
                }
                ec f2 = i(i).f();
                ec i20 = i(8);
                if (i20.h()) {
                    f2.j();
                    i20.j();
                }
            }
            i12.a(i13, i3);
        }
    }

    public final void f(ec ecVar, ec ecVar2, int i) {
        if (ecVar.d == this) {
            e(ecVar.e, ecVar2.d, ecVar2.e, i);
        }
    }

    public final void g(vp vpVar) {
        vpVar.k(this.I);
        vpVar.k(this.J);
        vpVar.k(this.K);
        vpVar.k(this.L);
        if (this.a0 > 0) {
            vpVar.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            tm tmVar = new tm(this);
            tmVar.h.e = 4;
            tmVar.i.e = 5;
            tmVar.f = 0;
            this.d = tmVar;
        }
        if (this.e == null) {
            q70 q70Var = new q70(this);
            ze zeVar = new ze(q70Var);
            q70Var.k = zeVar;
            q70Var.l = null;
            q70Var.h.e = 6;
            q70Var.i.e = 7;
            zeVar.e = 8;
            q70Var.f = 1;
            this.e = q70Var;
        }
    }

    public ec i(int i) {
        switch (n20.h(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(n20.g(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final tc l(int i) {
        ec ecVar;
        ec ecVar2;
        if (i != 0) {
            if (i == 1 && (ecVar2 = (ecVar = this.L).f) != null && ecVar2.f == ecVar) {
                return ecVar2.d;
            }
            return null;
        }
        ec ecVar3 = this.K;
        ec ecVar4 = ecVar3.f;
        if (ecVar4 == null || ecVar4.f != ecVar3) {
            return null;
        }
        return ecVar4.d;
    }

    public final tc m(int i) {
        ec ecVar;
        ec ecVar2;
        if (i != 0) {
            if (i == 1 && (ecVar2 = (ecVar = this.J).f) != null && ecVar2.f == ecVar) {
                return ecVar2.d;
            }
            return null;
        }
        ec ecVar3 = this.I;
        ec ecVar4 = ecVar3.f;
        if (ecVar4 == null || ecVar4.f != ecVar3) {
            return null;
        }
        return ecVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.p0;
        int i6 = iArr2[0];
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.W;
        int i13 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        tc tcVar = this.T;
        return (tcVar == null || !(tcVar instanceof uc)) ? this.Y : ((uc) tcVar).x0 + this.Y;
    }

    public final int s() {
        tc tcVar = this.T;
        return (tcVar == null || !(tcVar instanceof uc)) ? this.Z : ((uc) tcVar).y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2;
        }
        if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.h0 != null) {
            str = "id: " + this.h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        ec ecVar;
        ec ecVar2;
        ec ecVar3;
        ec ecVar4;
        if (i == 0) {
            ec ecVar5 = this.I;
            ec ecVar6 = ecVar5.f;
            if (ecVar6 == null || !ecVar6.c || (ecVar4 = (ecVar3 = this.K).f) == null || !ecVar4.c) {
                return false;
            }
            return (ecVar4.d() - ecVar3.e()) - (ecVar5.e() + ecVar5.f.d()) >= i2;
        }
        ec ecVar7 = this.J;
        ec ecVar8 = ecVar7.f;
        if (ecVar8 == null || !ecVar8.c || (ecVar2 = (ecVar = this.L).f) == null || !ecVar2.c) {
            return false;
        }
        return (ecVar2.d() - ecVar.e()) - (ecVar7.e() + ecVar7.f.d()) >= i2;
    }

    public final void v(int i, int i2, int i3, int i4, tc tcVar) {
        i(i).b(tcVar.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        ec ecVar;
        ec ecVar2;
        int i2 = i * 2;
        ec[] ecVarArr = this.Q;
        ec ecVar3 = ecVarArr[i2];
        ec ecVar4 = ecVar3.f;
        return (ecVar4 == null || ecVar4.f == ecVar3 || (ecVar2 = (ecVar = ecVarArr[i2 + 1]).f) == null || ecVar2.f != ecVar) ? false : true;
    }

    public final boolean x() {
        ec ecVar = this.I;
        ec ecVar2 = ecVar.f;
        if (ecVar2 != null && ecVar2.f == ecVar) {
            return true;
        }
        ec ecVar3 = this.K;
        ec ecVar4 = ecVar3.f;
        return ecVar4 != null && ecVar4.f == ecVar3;
    }

    public final boolean y() {
        ec ecVar = this.J;
        ec ecVar2 = ecVar.f;
        if (ecVar2 != null && ecVar2.f == ecVar) {
            return true;
        }
        ec ecVar3 = this.L;
        ec ecVar4 = ecVar3.f;
        return ecVar4 != null && ecVar4.f == ecVar3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
