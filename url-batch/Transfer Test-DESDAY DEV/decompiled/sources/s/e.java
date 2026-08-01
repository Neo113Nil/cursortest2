package s;

import K.C0014m;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.C0319c;
import q.C0322f;
import t.C0331b;
import t.C0332c;
import t.C0334e;
import t.n;
import t.o;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f3566A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0328b[] f3567B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0328b[] f3568C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3569D0;
    public boolean E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f3570F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f3571G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f3572H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f3573I0;
    public WeakReference J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f3574K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0331b f3575L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f3576q0 = new ArrayList();
    public final C0014m r0;

    /* renamed from: s0, reason: collision with root package name */
    public final C0334e f3577s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3578t0;

    /* renamed from: u0, reason: collision with root package name */
    public v.f f3579u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3580v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0319c f3581w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3582x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3583y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3584z0;

    public e() {
        C0014m c0014m = new C0014m();
        c0014m.f424a = new ArrayList();
        c0014m.f425b = new C0331b();
        c0014m.f426c = this;
        this.r0 = c0014m;
        C0334e c0334e = new C0334e();
        c0334e.f3734b = true;
        c0334e.f3735c = true;
        c0334e.f3736e = new ArrayList();
        new ArrayList();
        c0334e.f3737f = null;
        c0334e.f3738g = new C0331b();
        c0334e.h = new ArrayList();
        c0334e.f3733a = this;
        c0334e.d = this;
        this.f3577s0 = c0334e;
        this.f3579u0 = null;
        this.f3580v0 = false;
        this.f3581w0 = new C0319c();
        this.f3584z0 = 0;
        this.f3566A0 = 0;
        this.f3567B0 = new C0328b[4];
        this.f3568C0 = new C0328b[4];
        this.f3569D0 = 257;
        this.E0 = false;
        this.f3570F0 = false;
        this.f3571G0 = null;
        this.f3572H0 = null;
        this.f3573I0 = null;
        this.J0 = null;
        this.f3574K0 = new HashSet();
        this.f3575L0 = new C0331b();
    }

    public static void V(d dVar, v.f fVar, C0331b c0331b) {
        int i;
        int i2;
        if (fVar == null) {
            return;
        }
        if (dVar.f3540g0 == 8 || (dVar instanceof h) || (dVar instanceof C0327a)) {
            c0331b.f3727e = 0;
            c0331b.f3728f = 0;
            return;
        }
        int[] iArr = dVar.f3555p0;
        c0331b.f3724a = iArr[0];
        c0331b.f3725b = iArr[1];
        c0331b.f3726c = dVar.q();
        c0331b.d = dVar.k();
        c0331b.i = false;
        c0331b.f3730j = 0;
        boolean z2 = c0331b.f3724a == 3;
        boolean z3 = c0331b.f3725b == 3;
        boolean z4 = z2 && dVar.f3524W > RecyclerView.f1570A0;
        boolean z5 = z3 && dVar.f3524W > RecyclerView.f1570A0;
        if (z2 && dVar.t(0) && dVar.f3557r == 0 && !z4) {
            c0331b.f3724a = 2;
            if (z3 && dVar.f3558s == 0) {
                c0331b.f3724a = 1;
            }
            z2 = false;
        }
        if (z3 && dVar.t(1) && dVar.f3558s == 0 && !z5) {
            c0331b.f3725b = 2;
            if (z2 && dVar.f3557r == 0) {
                c0331b.f3725b = 1;
            }
            z3 = false;
        }
        if (dVar.A()) {
            c0331b.f3724a = 1;
            z2 = false;
        }
        if (dVar.B()) {
            c0331b.f3725b = 1;
            z3 = false;
        }
        int[] iArr2 = dVar.f3559t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0331b.f3724a = 1;
            } else if (!z3) {
                if (c0331b.f3725b == 1) {
                    i2 = c0331b.d;
                } else {
                    c0331b.f3724a = 2;
                    fVar.b(dVar, c0331b);
                    i2 = c0331b.f3728f;
                }
                c0331b.f3724a = 1;
                c0331b.f3726c = (int) (dVar.f3524W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0331b.f3725b = 1;
            } else if (!z2) {
                if (c0331b.f3724a == 1) {
                    i = c0331b.f3726c;
                } else {
                    c0331b.f3725b = 2;
                    fVar.b(dVar, c0331b);
                    i = c0331b.f3727e;
                }
                c0331b.f3725b = 1;
                if (dVar.f3525X == -1) {
                    c0331b.d = (int) (i / dVar.f3524W);
                } else {
                    c0331b.d = (int) (dVar.f3524W * i);
                }
            }
        }
        fVar.b(dVar, c0331b);
        dVar.O(c0331b.f3727e);
        dVar.L(c0331b.f3728f);
        dVar.f3507E = c0331b.h;
        dVar.I(c0331b.f3729g);
        c0331b.f3730j = 0;
    }

    @Override // s.d
    public final void C() {
        this.f3581w0.t();
        this.f3582x0 = 0;
        this.f3583y0 = 0;
        this.f3576q0.clear();
        super.C();
    }

    @Override // s.d
    public final void F(C0014m c0014m) {
        super.F(c0014m);
        int size = this.f3576q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f3576q0.get(i)).F(c0014m);
        }
    }

    @Override // s.d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f3576q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f3576q0.get(i)).P(z2, z3);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i2 = this.f3584z0 + 1;
            C0328b[] c0328bArr = this.f3568C0;
            if (i2 >= c0328bArr.length) {
                this.f3568C0 = (C0328b[]) Arrays.copyOf(c0328bArr, c0328bArr.length * 2);
            }
            C0328b[] c0328bArr2 = this.f3568C0;
            int i3 = this.f3584z0;
            c0328bArr2[i3] = new C0328b(dVar, 0, this.f3580v0);
            this.f3584z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f3566A0 + 1;
            C0328b[] c0328bArr3 = this.f3567B0;
            if (i4 >= c0328bArr3.length) {
                this.f3567B0 = (C0328b[]) Arrays.copyOf(c0328bArr3, c0328bArr3.length * 2);
            }
            C0328b[] c0328bArr4 = this.f3567B0;
            int i5 = this.f3566A0;
            c0328bArr4[i5] = new C0328b(dVar, 1, this.f3580v0);
            this.f3566A0 = i5 + 1;
        }
    }

    public final void S(C0319c c0319c) {
        boolean W2 = W(64);
        b(c0319c, W2);
        int size = this.f3576q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f3576q0.get(i);
            boolean[] zArr = dVar.f3520S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0327a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar2 = (d) this.f3576q0.get(i2);
                if (dVar2 instanceof C0327a) {
                    C0327a c0327a = (C0327a) dVar2;
                    for (int i3 = 0; i3 < c0327a.r0; i3++) {
                        d dVar3 = c0327a.f3639q0[i3];
                        if (c0327a.f3480t0 || dVar3.c()) {
                            int i4 = c0327a.f3479s0;
                            if (i4 == 0 || i4 == 1) {
                                dVar3.f3520S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                dVar3.f3520S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f3574K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar4 = (d) this.f3576q0.get(i5);
            dVar4.getClass();
            boolean z3 = dVar4 instanceof g;
            if (z3 || (dVar4 instanceof h)) {
                if (z3) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(c0319c, W2);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i6 = 0; i6 < gVar.r0; i6++) {
                    if (hashSet.contains(gVar.f3639q0[i6])) {
                        gVar.b(c0319c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(c0319c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0319c.f3442p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar5 = (d) this.f3576q0.get(i7);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            a(this, c0319c, hashSet2, this.f3555p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, c0319c, dVar6);
                dVar6.b(c0319c, W2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = (d) this.f3576q0.get(i8);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f3555p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        dVar7.M(1);
                    }
                    if (i10 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(c0319c, W2);
                    if (i9 == 2) {
                        dVar7.M(i9);
                    }
                    if (i10 == 2) {
                        dVar7.N(i10);
                    }
                } else {
                    j.b(this, c0319c, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(c0319c, W2);
                    }
                }
            }
        }
        if (this.f3584z0 > 0) {
            j.a(this, c0319c, null, 0);
        }
        if (this.f3566A0 > 0) {
            j.a(this, c0319c, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0334e c0334e = this.f3577s0;
        e eVar = c0334e.f3733a;
        boolean z4 = false;
        int j2 = eVar.j(0);
        int j3 = eVar.j(1);
        int r2 = eVar.r();
        int s2 = eVar.s();
        ArrayList arrayList = c0334e.f3736e;
        if (z2 && (j2 == 2 || j3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f3764f == i && !oVar.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j2 == 2) {
                    eVar.M(1);
                    eVar.O(c0334e.d(eVar, 0));
                    eVar.d.f3763e.d(eVar.q());
                }
            } else if (z2 && j3 == 2) {
                eVar.N(1);
                eVar.L(c0334e.d(eVar, 1));
                eVar.f3535e.f3763e.d(eVar.k());
            }
        }
        int[] iArr = eVar.f3555p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = eVar.q() + r2;
                eVar.d.i.d(q2);
                eVar.d.f3763e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = eVar.k() + s2;
                eVar.f3535e.i.d(k2);
                eVar.f3535e.f3763e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0334e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f3764f == i && (oVar2.f3761b != eVar || oVar2.f3765g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            o oVar3 = (o) it3.next();
            if (oVar3.f3764f == i && (z3 || oVar3.f3761b != eVar)) {
                if (!oVar3.h.f3745j) {
                    break;
                }
                if (!oVar3.i.f3745j) {
                    break;
                }
                if (!(oVar3 instanceof C0332c) && !oVar3.f3763e.f3745j) {
                    break;
                }
            }
        }
        eVar.M(j2);
        eVar.N(j3);
        return z4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:227|228|229|(1:231)|232|233|(2:234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        int i;
        Object[] objArr;
        c cVar;
        int i2;
        int i3;
        c cVar2;
        int i4;
        int i5;
        C0319c c0319c;
        int i6;
        boolean z2;
        char c2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int max;
        ?? r6;
        boolean z7;
        int max2;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int max3;
        int max4;
        WeakReference weakReference;
        C0322f k2;
        C0319c c0319c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0319c c0319c3;
        c cVar3;
        int i11;
        int i12;
        int i13;
        char c3;
        n nVar;
        n nVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int b2;
        n nVar3;
        n nVar4;
        int[] iArr;
        this.f3526Y = 0;
        this.f3527Z = 0;
        this.E0 = false;
        this.f3570F0 = false;
        int size = this.f3576q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f3555p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f3578t0;
        c cVar4 = this.f3511J;
        c cVar5 = this.f3510I;
        if (i20 == 0 && j.c(this.f3569D0, 1)) {
            v.f fVar = this.f3579u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            E();
            ArrayList arrayList = this.f3576q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((d) arrayList.get(i23)).E();
            }
            boolean z10 = this.f3580v0;
            if (i21 == 1) {
                J(0, q());
            } else {
                cVar5.l(0);
                this.f3526Y = 0;
            }
            int i24 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i24 < size2) {
                c cVar6 = cVar5;
                d dVar = (d) arrayList.get(i24);
                int i25 = max6;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    iArr = iArr2;
                    if (hVar.f3637u0 == 1) {
                        int i26 = hVar.r0;
                        if (i26 != -1) {
                            hVar.R(i26);
                        } else if (hVar.f3635s0 != -1 && A()) {
                            hVar.R(q() - hVar.f3635s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f3634q0 * q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((dVar instanceof C0327a) && ((C0327a) dVar).U() == 0) {
                        z12 = true;
                    }
                }
                i24++;
                max6 = i25;
                cVar5 = cVar6;
                iArr2 = iArr;
            }
            i = max6;
            objArr = iArr2;
            cVar = cVar5;
            if (z11) {
                for (int i27 = 0; i27 < size2; i27++) {
                    d dVar2 = (d) arrayList.get(i27);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        if (hVar2.f3637u0 == 1) {
                            t.h.c(0, hVar2, fVar, z10);
                        }
                    }
                }
            }
            t.h.c(0, this, fVar, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    d dVar3 = (d) arrayList.get(i28);
                    if (dVar3 instanceof C0327a) {
                        C0327a c0327a = (C0327a) dVar3;
                        if (c0327a.U() == 0 && c0327a.T()) {
                            t.h.c(1, c0327a, fVar, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                K(0, k());
            } else {
                cVar4.l(0);
                this.f3527Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                d dVar4 = (d) arrayList.get(i29);
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f3637u0 == 0) {
                        int i30 = hVar3.r0;
                        if (i30 != -1) {
                            hVar3.R(i30);
                        } else if (hVar3.f3635s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f3635s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f3634q0 * k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((dVar4 instanceof C0327a) && ((C0327a) dVar4).U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    d dVar5 = (d) arrayList.get(i31);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f3637u0 == 0) {
                            t.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            t.h.i(0, this, fVar);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    d dVar6 = (d) arrayList.get(i32);
                    if (dVar6 instanceof C0327a) {
                        C0327a c0327a2 = (C0327a) dVar6;
                        if (c0327a2.U() == 1 && c0327a2.T()) {
                            t.h.i(1, c0327a2, fVar);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                d dVar7 = (d) arrayList.get(i33);
                if (dVar7.z() && t.h.a(dVar7)) {
                    V(dVar7, fVar, t.h.f3749a);
                    if (!(dVar7 instanceof h)) {
                        t.h.c(0, dVar7, fVar, z10);
                        t.h.i(0, dVar7, fVar);
                    } else if (((h) dVar7).f3637u0 == 0) {
                        t.h.i(0, dVar7, fVar);
                    } else {
                        t.h.c(0, dVar7, fVar, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                d dVar8 = (d) this.f3576q0.get(i34);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof C0327a) && !(dVar8 instanceof g) && !dVar8.F) {
                    int j2 = dVar8.j(0);
                    int j3 = dVar8.j(1);
                    if (j2 != 3 || dVar8.f3557r == 1 || j3 != 3 || dVar8.f3558s == 1) {
                        V(dVar8, this.f3579u0, new C0331b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            cVar = cVar5;
        }
        C0319c c0319c4 = this.f3581w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && j.c(this.f3569D0, 1024))) {
            i2 = size;
            i3 = i18;
            cVar2 = cVar4;
            i4 = i;
            i5 = max5;
            c0319c = c0319c4;
            i6 = i19;
        } else {
            v.f fVar2 = this.f3579u0;
            ArrayList arrayList2 = this.f3576q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                d dVar9 = (d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = dVar9.f3555p0;
                cVar2 = cVar4;
                if (!t.h.h(c4, c5, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c0319c = c0319c4;
                    break;
                }
                i35++;
                cVar4 = cVar2;
            }
            cVar2 = cVar4;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = size;
                d dVar10 = (d) arrayList2.get(i36);
                int i38 = i18;
                char c6 = objArr[0];
                int i39 = max5;
                char c7 = objArr[1];
                int i40 = i19;
                int[] iArr4 = dVar10.f3555p0;
                C0319c c0319c5 = c0319c4;
                if (!t.h.h(c6, c7, iArr4[0], iArr4[1])) {
                    V(dVar10, fVar2, this.f3575L0);
                }
                boolean z15 = dVar10 instanceof h;
                if (z15) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f3637u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f3637u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (dVar10 instanceof i) {
                    if (dVar10 instanceof C0327a) {
                        C0327a c0327a3 = (C0327a) dVar10;
                        if (c0327a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0327a3);
                        }
                        if (c0327a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0327a3);
                        }
                    } else {
                        i iVar = (i) dVar10;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iVar);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(iVar);
                    }
                }
                if (dVar10.f3510I.f3501f == null && dVar10.f3512K.f3501f == null && !z15 && !(dVar10 instanceof C0327a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(dVar10);
                }
                if (dVar10.f3511J.f3501f == null && dVar10.f3513L.f3501f == null && dVar10.f3514M.f3501f == null && !z15 && !(dVar10 instanceof C0327a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(dVar10);
                }
                i36++;
                i18 = i38;
                size = i37;
                max5 = i39;
                i19 = i40;
                c0319c4 = c0319c5;
            }
            i11 = max5;
            C0319c c0319c6 = c0319c4;
            i2 = size;
            i12 = i18;
            i13 = i19;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    t.h.b((h) it.next(), 0, arrayList9, null);
                }
            }
            int i41 = 0;
            n nVar5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    n b3 = t.h.b(iVar2, i41, arrayList9, nVar5);
                    iVar2.R(i41, arrayList9, b3);
                    b3.a(arrayList9);
                    i41 = 0;
                    nVar5 = null;
                }
            }
            HashSet hashSet = i(2).f3497a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    t.h.b(((c) it3.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f3497a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    t.h.b(((c) it4.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f3497a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    t.h.b(((c) it5.next()).d, 0, arrayList9, null);
                }
            }
            n nVar6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    t.h.b((d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    t.h.b((h) it7.next(), 1, arrayList9, null);
                }
            }
            int i42 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    i iVar3 = (i) it8.next();
                    n b4 = t.h.b(iVar3, i42, arrayList9, nVar6);
                    iVar3.R(i42, arrayList9, b4);
                    b4.a(arrayList9);
                    i42 = 1;
                    nVar6 = null;
                }
            }
            HashSet hashSet4 = i(3).f3497a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    t.h.b(((c) it9.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f3497a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    t.h.b(((c) it10.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f3497a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    t.h.b(((c) it11.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f3497a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    t.h.b(((c) it12.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    t.h.b((d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                d dVar11 = (d) arrayList2.get(i43);
                int[] iArr5 = dVar11.f3555p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = dVar11.n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            nVar3 = null;
                            break;
                        }
                        nVar3 = (n) arrayList9.get(i45);
                        if (i44 == nVar3.f3757b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = dVar11.f3553o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            nVar4 = null;
                            break;
                        }
                        nVar4 = (n) arrayList9.get(i47);
                        if (i46 == nVar4.f3757b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (nVar3 != null && nVar4 != null) {
                        nVar3.c(0, nVar4);
                        nVar4.f3758c = 2;
                        arrayList9.remove(nVar3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    nVar = null;
                    while (it14.hasNext()) {
                        n nVar7 = (n) it14.next();
                        if (nVar7.f3758c != 1) {
                            C0319c c0319c7 = c0319c6;
                            int b5 = nVar7.b(c0319c7, 0);
                            if (b5 > i48) {
                                nVar = nVar7;
                                i48 = b5;
                            }
                            c0319c6 = c0319c7;
                        }
                    }
                    c0319c = c0319c6;
                    c3 = 1;
                    if (nVar != null) {
                        M(1);
                        O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            nVar2 = null;
                            while (it15.hasNext()) {
                                n nVar8 = (n) it15.next();
                                if (nVar8.f3758c != 0 && (b2 = nVar8.b(c0319c, 1)) > i49) {
                                    nVar2 = nVar8;
                                    i49 = b2;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i49);
                                if (nVar == null || nVar2 != null) {
                                    i6 = i13;
                                    if (i6 == 2) {
                                        i14 = i11;
                                        if (i14 >= q() || i14 <= 0) {
                                            i15 = q();
                                            i3 = i12;
                                            if (i3 != 2) {
                                                i16 = i;
                                                if (i16 >= k() || i16 <= 0) {
                                                    i17 = k();
                                                    i4 = i17;
                                                    i5 = i15;
                                                    z2 = true;
                                                    boolean z16 = !W(64) || W(128);
                                                    c0319c.getClass();
                                                    c0319c.f3449g = false;
                                                    if (this.f3569D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c0319c.f3449g = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f3576q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.f3584z0 = 0;
                                                    this.f3566A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        d dVar12 = (d) this.f3576q0.get(i8);
                                                        if (dVar12 instanceof e) {
                                                            ((e) dVar12).U();
                                                        }
                                                    }
                                                    boolean W2 = W(64);
                                                    boolean z18 = z2;
                                                    int i50 = 0;
                                                    z3 = true;
                                                    while (z3) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            c0319c.t();
                                                            this.f3584z0 = 0;
                                                            this.f3566A0 = 0;
                                                            g(c0319c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((d) this.f3576q0.get(i52)).g(c0319c);
                                                            }
                                                            S(c0319c);
                                                            try {
                                                                weakReference = this.f3571G0;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                z5 = z18;
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            z5 = z18;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                z5 = z18;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                c cVar7 = (c) this.f3571G0.get();
                                                                c cVar8 = cVar2;
                                                                try {
                                                                    k2 = c0319c.k(cVar8);
                                                                    c0319c2 = this.f3581w0;
                                                                    z5 = z18;
                                                                    cVar2 = cVar8;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z5 = z18;
                                                                    cVar2 = cVar8;
                                                                }
                                                                try {
                                                                    c0319c2.f(c0319c2.k(cVar7), k2, 0, 5);
                                                                    this.f3571G0 = null;
                                                                    weakReference2 = this.f3573I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        c cVar9 = (c) this.f3573I0.get();
                                                                        C0322f k3 = c0319c.k(this.f3513L);
                                                                        C0319c c0319c8 = this.f3581w0;
                                                                        c0319c8.f(k3, c0319c8.k(cVar9), 0, 5);
                                                                        this.f3573I0 = null;
                                                                    }
                                                                    weakReference3 = this.f3572H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        c cVar10 = (c) this.f3572H0.get();
                                                                        cVar3 = cVar;
                                                                        try {
                                                                            C0322f k4 = c0319c.k(cVar3);
                                                                            C0319c c0319c9 = this.f3581w0;
                                                                            cVar = cVar3;
                                                                            c0319c9.f(c0319c9.k(cVar10), k4, 0, 5);
                                                                            this.f3572H0 = null;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            cVar = cVar3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f3640a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3531b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3533c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    weakReference4 = this.J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        c cVar11 = (c) this.J0.get();
                                                                        C0322f k5 = c0319c.k(this.f3512K);
                                                                        try {
                                                                            c0319c3 = this.f3581w0;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f3640a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3531b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3533c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                        try {
                                                                            c0319c3.f(k5, c0319c3.k(cVar11), 0, 5);
                                                                            try {
                                                                                this.J0 = null;
                                                                            } catch (Exception e8) {
                                                                                e = e8;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f3640a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f3531b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3533c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z8) {
                                                                                }
                                                                                z18 = z8;
                                                                                z9 = z6;
                                                                                i9 = 8;
                                                                                if (i51 <= i9) {
                                                                                }
                                                                                z3 = z9;
                                                                                i50 = i51;
                                                                            }
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = j.f3640a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3531b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3533c0, k());
                                                                            if (max2 > k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    c0319c.p();
                                                                    z3 = true;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f3640a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f3531b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f3533c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z8) {
                                                                    }
                                                                    z18 = z8;
                                                                    z9 = z6;
                                                                    i9 = 8;
                                                                    if (i51 <= i9) {
                                                                    }
                                                                    z3 = z9;
                                                                    i50 = i51;
                                                                }
                                                                boolean[] zArr22222 = j.f3640a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean W3 = W(64);
                                                                    Q(c0319c, W3);
                                                                    int size6 = this.f3576q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        d dVar13 = (d) this.f3576q0.get(i53);
                                                                        dVar13.Q(c0319c, W3);
                                                                        boolean z19 = W3;
                                                                        int i54 = size6;
                                                                        if (dVar13.h != -1 || dVar13.i != -1) {
                                                                            z6 = true;
                                                                        }
                                                                        i53++;
                                                                        W3 = z19;
                                                                        size6 = i54;
                                                                    }
                                                                } else {
                                                                    Q(c0319c, W2);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((d) this.f3576q0.get(i55)).Q(c0319c, W2);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        d dVar14 = (d) this.f3576q0.get(i10);
                                                                        i56 = Math.max(i56, dVar14.q() + dVar14.f3526Y);
                                                                        i57 = Math.max(i57, dVar14.k() + dVar14.f3527Z);
                                                                    }
                                                                    max3 = Math.max(this.f3531b0, i56);
                                                                    max4 = Math.max(this.f3533c0, i57);
                                                                    if (i6 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                    if (i3 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f3531b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r6 = 1;
                                                                    objArr[0] = 1;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                } else {
                                                                    r6 = 1;
                                                                    z7 = z5;
                                                                }
                                                                max2 = Math.max(this.f3533c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r6] = r6;
                                                                    z8 = r6;
                                                                    z6 = z8;
                                                                } else {
                                                                    z8 = z7;
                                                                }
                                                                if (!z8) {
                                                                    if (objArr[0] == 2 && i5 > 0 && q() > i5) {
                                                                        this.E0 = r6;
                                                                        objArr[0] = r6;
                                                                        O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && k() > i4) {
                                                                        this.f3570F0 = r6;
                                                                        objArr[r6] = r6;
                                                                        L(i4);
                                                                        i9 = 8;
                                                                        z9 = true;
                                                                        z18 = true;
                                                                        if (i51 <= i9) {
                                                                            z9 = false;
                                                                        }
                                                                        z3 = z9;
                                                                        i50 = i51;
                                                                    }
                                                                }
                                                                z18 = z8;
                                                                z9 = z6;
                                                                i9 = 8;
                                                                if (i51 <= i9) {
                                                                }
                                                                z3 = z9;
                                                                i50 = i51;
                                                            }
                                                        }
                                                        z5 = z18;
                                                        weakReference2 = this.f3573I0;
                                                        if (weakReference2 != null) {
                                                            c cVar92 = (c) this.f3573I0.get();
                                                            C0322f k32 = c0319c.k(this.f3513L);
                                                            C0319c c0319c82 = this.f3581w0;
                                                            c0319c82.f(k32, c0319c82.k(cVar92), 0, 5);
                                                            this.f3573I0 = null;
                                                        }
                                                        weakReference3 = this.f3572H0;
                                                        if (weakReference3 != null) {
                                                            c cVar102 = (c) this.f3572H0.get();
                                                            cVar3 = cVar;
                                                            C0322f k42 = c0319c.k(cVar3);
                                                            C0319c c0319c92 = this.f3581w0;
                                                            cVar = cVar3;
                                                            c0319c92.f(c0319c92.k(cVar102), k42, 0, 5);
                                                            this.f3572H0 = null;
                                                        }
                                                        weakReference4 = this.J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c0319c.p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = j.f3640a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f3531b0, i562);
                                                            max4 = Math.max(this.f3533c0, i572);
                                                            if (i6 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                            if (i3 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f3531b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f3533c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z8) {
                                                        }
                                                        z18 = z8;
                                                        z9 = z6;
                                                        i9 = 8;
                                                        if (i51 <= i9) {
                                                        }
                                                        z3 = z9;
                                                        i50 = i51;
                                                    }
                                                    z4 = z18;
                                                    this.f3576q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    F(c0319c.f3452l);
                                                }
                                                L(i16);
                                                this.f3570F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (W(64)) {
                                            }
                                            c0319c.getClass();
                                            c0319c.f3449g = false;
                                            if (this.f3569D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f3576q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f3584z0 = 0;
                                            this.f3566A0 = 0;
                                            i7 = i2;
                                            while (i8 < i7) {
                                            }
                                            boolean W22 = W(64);
                                            boolean z182 = z2;
                                            int i502 = 0;
                                            z3 = true;
                                            while (z3) {
                                            }
                                            z4 = z182;
                                            this.f3576q0 = arrayList102;
                                            if (z4) {
                                            }
                                            F(c0319c.f3452l);
                                        }
                                        O(i14);
                                        this.E0 = true;
                                    } else {
                                        i14 = i11;
                                    }
                                    i15 = i14;
                                    i3 = i12;
                                    if (i3 != 2) {
                                    }
                                    i17 = i16;
                                    i4 = i17;
                                    i5 = i15;
                                    z2 = true;
                                    if (W(64)) {
                                    }
                                    c0319c.getClass();
                                    c0319c.f3449g = false;
                                    if (this.f3569D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f3576q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f3584z0 = 0;
                                    this.f3566A0 = 0;
                                    i7 = i2;
                                    while (i8 < i7) {
                                    }
                                    boolean W222 = W(64);
                                    boolean z1822 = z2;
                                    int i5022 = 0;
                                    z3 = true;
                                    while (z3) {
                                    }
                                    z4 = z1822;
                                    this.f3576q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    F(c0319c.f3452l);
                                }
                            }
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        i6 = i13;
                        if (i6 == 2) {
                        }
                        i15 = i14;
                        i3 = i12;
                        if (i3 != 2) {
                        }
                        i17 = i16;
                        i4 = i17;
                        i5 = i15;
                        z2 = true;
                        if (W(64)) {
                        }
                        c0319c.getClass();
                        c0319c.f3449g = false;
                        if (this.f3569D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f3576q0;
                        if (objArr[0] != 2) {
                        }
                        this.f3584z0 = 0;
                        this.f3566A0 = 0;
                        i7 = i2;
                        while (i8 < i7) {
                        }
                        boolean W2222 = W(64);
                        boolean z18222 = z2;
                        int i50222 = 0;
                        z3 = true;
                        while (z3) {
                        }
                        z4 = z18222;
                        this.f3576q0 = arrayList10222;
                        if (z4) {
                        }
                        F(c0319c.f3452l);
                    }
                } else {
                    c0319c = c0319c6;
                    c3 = 1;
                }
                nVar = null;
                if (objArr[c3] == 2) {
                }
                nVar2 = null;
                if (nVar == null) {
                }
                i6 = i13;
                if (i6 == 2) {
                }
                i15 = i14;
                i3 = i12;
                if (i3 != 2) {
                }
                i17 = i16;
                i4 = i17;
                i5 = i15;
                z2 = true;
                if (W(64)) {
                }
                c0319c.getClass();
                c0319c.f3449g = false;
                if (this.f3569D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f3576q0;
                if (objArr[0] != 2) {
                }
                this.f3584z0 = 0;
                this.f3566A0 = 0;
                i7 = i2;
                while (i8 < i7) {
                }
                boolean W22222 = W(64);
                boolean z182222 = z2;
                int i502222 = 0;
                z3 = true;
                while (z3) {
                }
                z4 = z182222;
                this.f3576q0 = arrayList102222;
                if (z4) {
                }
                F(c0319c.f3452l);
            }
            c0319c = c0319c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (W(64)) {
        }
        c0319c.getClass();
        c0319c.f3449g = false;
        if (this.f3569D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f3576q0;
        if (objArr[0] != 2) {
        }
        this.f3584z0 = 0;
        this.f3566A0 = 0;
        i7 = i2;
        while (i8 < i7) {
        }
        boolean W222222 = W(64);
        boolean z1822222 = z2;
        int i5022222 = 0;
        z3 = true;
        while (z3) {
        }
        z4 = z1822222;
        this.f3576q0 = arrayList1022222;
        if (z4) {
        }
        F(c0319c.f3452l);
    }

    public final boolean W(int i) {
        return (this.f3569D0 & i) == i;
    }

    @Override // s.d
    public final void n(StringBuilder sb) {
        sb.append(this.f3543j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f3522U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f3523V);
        sb.append("\n");
        Iterator it = this.f3576q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
