package s;

import K.C0019l;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.C0330c;
import q.C0333f;
import t.C0365b;
import t.C0366c;
import t.C0368e;
import t.o;
import t.p;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f4017A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0362b[] f4018B0;
    public C0362b[] C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4019D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4020E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f4021F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f4022G0;
    public WeakReference H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f4023I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f4024J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f4025K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0365b f4026L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f4027q0 = new ArrayList();
    public final C0019l r0;

    /* renamed from: s0, reason: collision with root package name */
    public final C0368e f4028s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4029t0;

    /* renamed from: u0, reason: collision with root package name */
    public v.f f4030u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4031v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0330c f4032w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4033x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f4034y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4035z0;

    public e() {
        C0019l c0019l = new C0019l();
        c0019l.f683a = new ArrayList();
        c0019l.f684b = new C0365b();
        c0019l.f685c = this;
        this.r0 = c0019l;
        C0368e c0368e = new C0368e();
        c0368e.f4129b = true;
        c0368e.f4130c = true;
        c0368e.f4131e = new ArrayList();
        new ArrayList();
        c0368e.f4132f = null;
        c0368e.f4133g = new C0365b();
        c0368e.h = new ArrayList();
        c0368e.f4128a = this;
        c0368e.d = this;
        this.f4028s0 = c0368e;
        this.f4030u0 = null;
        this.f4031v0 = false;
        this.f4032w0 = new C0330c();
        this.f4035z0 = 0;
        this.f4017A0 = 0;
        this.f4018B0 = new C0362b[4];
        this.C0 = new C0362b[4];
        this.f4019D0 = 257;
        this.f4020E0 = false;
        this.f4021F0 = false;
        this.f4022G0 = null;
        this.H0 = null;
        this.f4023I0 = null;
        this.f4024J0 = null;
        this.f4025K0 = new HashSet();
        this.f4026L0 = new C0365b();
    }

    public static void V(d dVar, v.f fVar, C0365b c0365b) {
        int i;
        int i2;
        if (fVar == null) {
            return;
        }
        if (dVar.f3991g0 == 8 || (dVar instanceof h) || (dVar instanceof C0361a)) {
            c0365b.f4122e = 0;
            c0365b.f4123f = 0;
            return;
        }
        int[] iArr = dVar.f4006p0;
        c0365b.f4119a = iArr[0];
        c0365b.f4120b = iArr[1];
        c0365b.f4121c = dVar.q();
        c0365b.d = dVar.k();
        c0365b.i = false;
        c0365b.f4125j = 0;
        boolean z2 = c0365b.f4119a == 3;
        boolean z3 = c0365b.f4120b == 3;
        boolean z4 = z2 && dVar.f3975W > RecyclerView.f1949A0;
        boolean z5 = z3 && dVar.f3975W > RecyclerView.f1949A0;
        if (z2 && dVar.t(0) && dVar.f4008r == 0 && !z4) {
            c0365b.f4119a = 2;
            if (z3 && dVar.f4009s == 0) {
                c0365b.f4119a = 1;
            }
            z2 = false;
        }
        if (z3 && dVar.t(1) && dVar.f4009s == 0 && !z5) {
            c0365b.f4120b = 2;
            if (z2 && dVar.f4008r == 0) {
                c0365b.f4120b = 1;
            }
            z3 = false;
        }
        if (dVar.A()) {
            c0365b.f4119a = 1;
            z2 = false;
        }
        if (dVar.B()) {
            c0365b.f4120b = 1;
            z3 = false;
        }
        int[] iArr2 = dVar.f4010t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0365b.f4119a = 1;
            } else if (!z3) {
                if (c0365b.f4120b == 1) {
                    i2 = c0365b.d;
                } else {
                    c0365b.f4119a = 2;
                    fVar.b(dVar, c0365b);
                    i2 = c0365b.f4123f;
                }
                c0365b.f4119a = 1;
                c0365b.f4121c = (int) (dVar.f3975W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0365b.f4120b = 1;
            } else if (!z2) {
                if (c0365b.f4119a == 1) {
                    i = c0365b.f4121c;
                } else {
                    c0365b.f4120b = 2;
                    fVar.b(dVar, c0365b);
                    i = c0365b.f4122e;
                }
                c0365b.f4120b = 1;
                if (dVar.f3976X == -1) {
                    c0365b.d = (int) (i / dVar.f3975W);
                } else {
                    c0365b.d = (int) (dVar.f3975W * i);
                }
            }
        }
        fVar.b(dVar, c0365b);
        dVar.O(c0365b.f4122e);
        dVar.L(c0365b.f4123f);
        dVar.f3958E = c0365b.h;
        dVar.I(c0365b.f4124g);
        c0365b.f4125j = 0;
    }

    @Override // s.d
    public final void C() {
        this.f4032w0.t();
        this.f4033x0 = 0;
        this.f4034y0 = 0;
        this.f4027q0.clear();
        super.C();
    }

    @Override // s.d
    public final void F(C0019l c0019l) {
        super.F(c0019l);
        int size = this.f4027q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f4027q0.get(i)).F(c0019l);
        }
    }

    @Override // s.d
    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f4027q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f4027q0.get(i)).P(z2, z3);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i2 = this.f4035z0 + 1;
            C0362b[] c0362bArr = this.C0;
            if (i2 >= c0362bArr.length) {
                this.C0 = (C0362b[]) Arrays.copyOf(c0362bArr, c0362bArr.length * 2);
            }
            C0362b[] c0362bArr2 = this.C0;
            int i3 = this.f4035z0;
            c0362bArr2[i3] = new C0362b(dVar, 0, this.f4031v0);
            this.f4035z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f4017A0 + 1;
            C0362b[] c0362bArr3 = this.f4018B0;
            if (i4 >= c0362bArr3.length) {
                this.f4018B0 = (C0362b[]) Arrays.copyOf(c0362bArr3, c0362bArr3.length * 2);
            }
            C0362b[] c0362bArr4 = this.f4018B0;
            int i5 = this.f4017A0;
            c0362bArr4[i5] = new C0362b(dVar, 1, this.f4031v0);
            this.f4017A0 = i5 + 1;
        }
    }

    public final void S(C0330c c0330c) {
        boolean W2 = W(64);
        b(c0330c, W2);
        int size = this.f4027q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f4027q0.get(i);
            boolean[] zArr = dVar.f3971S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0361a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar2 = (d) this.f4027q0.get(i2);
                if (dVar2 instanceof C0361a) {
                    C0361a c0361a = (C0361a) dVar2;
                    for (int i3 = 0; i3 < c0361a.r0; i3++) {
                        d dVar3 = c0361a.f4090q0[i3];
                        if (c0361a.f3931t0 || dVar3.c()) {
                            int i4 = c0361a.f3930s0;
                            if (i4 == 0 || i4 == 1) {
                                dVar3.f3971S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                dVar3.f3971S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4025K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar4 = (d) this.f4027q0.get(i5);
            dVar4.getClass();
            boolean z3 = dVar4 instanceof g;
            if (z3 || (dVar4 instanceof h)) {
                if (z3) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(c0330c, W2);
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
                    if (hashSet.contains(gVar.f4090q0[i6])) {
                        gVar.b(c0330c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(c0330c, W2);
                }
                hashSet.clear();
            }
        }
        if (C0330c.f3826p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar5 = (d) this.f4027q0.get(i7);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            a(this, c0330c, hashSet2, this.f4006p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, c0330c, dVar6);
                dVar6.b(c0330c, W2);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = (d) this.f4027q0.get(i8);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f4006p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        dVar7.M(1);
                    }
                    if (i10 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(c0330c, W2);
                    if (i9 == 2) {
                        dVar7.M(i9);
                    }
                    if (i10 == 2) {
                        dVar7.N(i10);
                    }
                } else {
                    j.b(this, c0330c, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(c0330c, W2);
                    }
                }
            }
        }
        if (this.f4035z0 > 0) {
            j.a(this, c0330c, null, 0);
        }
        if (this.f4017A0 > 0) {
            j.a(this, c0330c, null, 1);
        }
    }

    public final boolean T(int i, boolean z2) {
        boolean z3;
        C0368e c0368e = this.f4028s0;
        e eVar = c0368e.f4128a;
        boolean z4 = false;
        int j2 = eVar.j(0);
        int j3 = eVar.j(1);
        int r2 = eVar.r();
        int s2 = eVar.s();
        ArrayList arrayList = c0368e.f4131e;
        if (z2 && (j2 == 2 || j3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f4159f == i && !pVar.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && j2 == 2) {
                    eVar.M(1);
                    eVar.O(c0368e.d(eVar, 0));
                    eVar.d.f4158e.d(eVar.q());
                }
            } else if (z2 && j3 == 2) {
                eVar.N(1);
                eVar.L(c0368e.d(eVar, 1));
                eVar.f3986e.f4158e.d(eVar.k());
            }
        }
        int[] iArr = eVar.f4006p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int q2 = eVar.q() + r2;
                eVar.d.i.d(q2);
                eVar.d.f4158e.d(q2 - r2);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int k2 = eVar.k() + s2;
                eVar.f3986e.i.d(k2);
                eVar.f3986e.f4158e.d(k2 - s2);
                z3 = true;
            }
            z3 = false;
        }
        c0368e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f4159f == i && (pVar2.f4156b != eVar || pVar2.f4160g)) {
                pVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            p pVar3 = (p) it3.next();
            if (pVar3.f4159f == i && (z3 || pVar3.f4156b != eVar)) {
                if (!pVar3.h.f4140j) {
                    break;
                }
                if (!pVar3.i.f4140j) {
                    break;
                }
                if (!(pVar3 instanceof C0366c) && !pVar3.f4158e.f4140j) {
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
        C0330c c0330c;
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
        C0333f k2;
        C0330c c0330c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0330c c0330c3;
        c cVar3;
        int i11;
        int i12;
        int i13;
        char c3;
        o oVar;
        o oVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int b2;
        o oVar3;
        o oVar4;
        int[] iArr;
        this.f3977Y = 0;
        this.f3978Z = 0;
        this.f4020E0 = false;
        this.f4021F0 = false;
        int size = this.f4027q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr2 = this.f4006p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f4029t0;
        c cVar4 = this.f3962J;
        c cVar5 = this.f3961I;
        if (i20 == 0 && j.c(this.f4019D0, 1)) {
            v.f fVar = this.f4030u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            E();
            ArrayList arrayList = this.f4027q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((d) arrayList.get(i23)).E();
            }
            boolean z10 = this.f4031v0;
            if (i21 == 1) {
                J(0, q());
            } else {
                cVar5.l(0);
                this.f3977Y = 0;
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
                    if (hVar.f4088u0 == 1) {
                        int i26 = hVar.r0;
                        if (i26 != -1) {
                            hVar.R(i26);
                        } else if (hVar.f4086s0 != -1 && A()) {
                            hVar.R(q() - hVar.f4086s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f4085q0 * q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((dVar instanceof C0361a) && ((C0361a) dVar).U() == 0) {
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
                        if (hVar2.f4088u0 == 1) {
                            t.h.c(0, hVar2, fVar, z10);
                        }
                    }
                }
            }
            t.h.c(0, this, fVar, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    d dVar3 = (d) arrayList.get(i28);
                    if (dVar3 instanceof C0361a) {
                        C0361a c0361a = (C0361a) dVar3;
                        if (c0361a.U() == 0 && c0361a.T()) {
                            t.h.c(1, c0361a, fVar, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                K(0, k());
            } else {
                cVar4.l(0);
                this.f3978Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                d dVar4 = (d) arrayList.get(i29);
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f4088u0 == 0) {
                        int i30 = hVar3.r0;
                        if (i30 != -1) {
                            hVar3.R(i30);
                        } else if (hVar3.f4086s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f4086s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f4085q0 * k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((dVar4 instanceof C0361a) && ((C0361a) dVar4).U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    d dVar5 = (d) arrayList.get(i31);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f4088u0 == 0) {
                            t.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            t.h.i(0, this, fVar);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    d dVar6 = (d) arrayList.get(i32);
                    if (dVar6 instanceof C0361a) {
                        C0361a c0361a2 = (C0361a) dVar6;
                        if (c0361a2.U() == 1 && c0361a2.T()) {
                            t.h.i(1, c0361a2, fVar);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                d dVar7 = (d) arrayList.get(i33);
                if (dVar7.z() && t.h.a(dVar7)) {
                    V(dVar7, fVar, t.h.f4144a);
                    if (!(dVar7 instanceof h)) {
                        t.h.c(0, dVar7, fVar, z10);
                        t.h.i(0, dVar7, fVar);
                    } else if (((h) dVar7).f4088u0 == 0) {
                        t.h.i(0, dVar7, fVar);
                    } else {
                        t.h.c(0, dVar7, fVar, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                d dVar8 = (d) this.f4027q0.get(i34);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof C0361a) && !(dVar8 instanceof g) && !dVar8.F) {
                    int j2 = dVar8.j(0);
                    int j3 = dVar8.j(1);
                    if (j2 != 3 || dVar8.f4008r == 1 || j3 != 3 || dVar8.f4009s == 1) {
                        V(dVar8, this.f4030u0, new C0365b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            cVar = cVar5;
        }
        C0330c c0330c4 = this.f4032w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && j.c(this.f4019D0, 1024))) {
            i2 = size;
            i3 = i18;
            cVar2 = cVar4;
            i4 = i;
            i5 = max5;
            c0330c = c0330c4;
            i6 = i19;
        } else {
            v.f fVar2 = this.f4030u0;
            ArrayList arrayList2 = this.f4027q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                d dVar9 = (d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = dVar9.f4006p0;
                cVar2 = cVar4;
                if (!t.h.h(c4, c5, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c0330c = c0330c4;
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
                int[] iArr4 = dVar10.f4006p0;
                C0330c c0330c5 = c0330c4;
                if (!t.h.h(c6, c7, iArr4[0], iArr4[1])) {
                    V(dVar10, fVar2, this.f4026L0);
                }
                boolean z15 = dVar10 instanceof h;
                if (z15) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f4088u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(hVar5);
                    }
                    if (hVar5.f4088u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(hVar5);
                    }
                }
                if (dVar10 instanceof i) {
                    if (dVar10 instanceof C0361a) {
                        C0361a c0361a3 = (C0361a) dVar10;
                        if (c0361a3.U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0361a3);
                        }
                        if (c0361a3.U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0361a3);
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
                if (dVar10.f3961I.f3952f == null && dVar10.f3963K.f3952f == null && !z15 && !(dVar10 instanceof C0361a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(dVar10);
                }
                if (dVar10.f3962J.f3952f == null && dVar10.f3964L.f3952f == null && dVar10.f3965M.f3952f == null && !z15 && !(dVar10 instanceof C0361a)) {
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
                c0330c4 = c0330c5;
            }
            i11 = max5;
            C0330c c0330c6 = c0330c4;
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
            o oVar5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    o b3 = t.h.b(iVar2, i41, arrayList9, oVar5);
                    iVar2.R(i41, arrayList9, b3);
                    b3.a(arrayList9);
                    i41 = 0;
                    oVar5 = null;
                }
            }
            HashSet hashSet = i(2).f3948a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    t.h.b(((c) it3.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f3948a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    t.h.b(((c) it4.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f3948a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    t.h.b(((c) it5.next()).d, 0, arrayList9, null);
                }
            }
            o oVar6 = null;
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
                    o b4 = t.h.b(iVar3, i42, arrayList9, oVar6);
                    iVar3.R(i42, arrayList9, b4);
                    b4.a(arrayList9);
                    i42 = 1;
                    oVar6 = null;
                }
            }
            HashSet hashSet4 = i(3).f3948a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    t.h.b(((c) it9.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f3948a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    t.h.b(((c) it10.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f3948a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    t.h.b(((c) it11.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f3948a;
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
                int[] iArr5 = dVar11.f4006p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = dVar11.n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            oVar3 = null;
                            break;
                        }
                        oVar3 = (o) arrayList9.get(i45);
                        if (i44 == oVar3.f4152b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = dVar11.f4004o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            oVar4 = null;
                            break;
                        }
                        oVar4 = (o) arrayList9.get(i47);
                        if (i46 == oVar4.f4152b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (oVar3 != null && oVar4 != null) {
                        oVar3.c(0, oVar4);
                        oVar4.f4153c = 2;
                        arrayList9.remove(oVar3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    oVar = null;
                    while (it14.hasNext()) {
                        o oVar7 = (o) it14.next();
                        if (oVar7.f4153c != 1) {
                            C0330c c0330c7 = c0330c6;
                            int b5 = oVar7.b(c0330c7, 0);
                            if (b5 > i48) {
                                oVar = oVar7;
                                i48 = b5;
                            }
                            c0330c6 = c0330c7;
                        }
                    }
                    c0330c = c0330c6;
                    c3 = 1;
                    if (oVar != null) {
                        M(1);
                        O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            oVar2 = null;
                            while (it15.hasNext()) {
                                o oVar8 = (o) it15.next();
                                if (oVar8.f4153c != 0 && (b2 = oVar8.b(c0330c, 1)) > i49) {
                                    oVar2 = oVar8;
                                    i49 = b2;
                                }
                            }
                            if (oVar2 != null) {
                                N(1);
                                L(i49);
                                if (oVar == null || oVar2 != null) {
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
                                                    c0330c.getClass();
                                                    c0330c.f3833g = false;
                                                    if (this.f4019D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c0330c.f3833g = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f4027q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.f4035z0 = 0;
                                                    this.f4017A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        d dVar12 = (d) this.f4027q0.get(i8);
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
                                                            c0330c.t();
                                                            this.f4035z0 = 0;
                                                            this.f4017A0 = 0;
                                                            g(c0330c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((d) this.f4027q0.get(i52)).g(c0330c);
                                                            }
                                                            S(c0330c);
                                                            try {
                                                                weakReference = this.f4022G0;
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
                                                                c cVar7 = (c) this.f4022G0.get();
                                                                c cVar8 = cVar2;
                                                                try {
                                                                    k2 = c0330c.k(cVar8);
                                                                    c0330c2 = this.f4032w0;
                                                                    z5 = z18;
                                                                    cVar2 = cVar8;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z5 = z18;
                                                                    cVar2 = cVar8;
                                                                }
                                                                try {
                                                                    c0330c2.f(c0330c2.k(cVar7), k2, 0, 5);
                                                                    this.f4022G0 = null;
                                                                    weakReference2 = this.f4023I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        c cVar9 = (c) this.f4023I0.get();
                                                                        C0333f k3 = c0330c.k(this.f3964L);
                                                                        C0330c c0330c8 = this.f4032w0;
                                                                        c0330c8.f(k3, c0330c8.k(cVar9), 0, 5);
                                                                        this.f4023I0 = null;
                                                                    }
                                                                    weakReference3 = this.H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        c cVar10 = (c) this.H0.get();
                                                                        cVar3 = cVar;
                                                                        try {
                                                                            C0333f k4 = c0330c.k(cVar3);
                                                                            C0330c c0330c9 = this.f4032w0;
                                                                            cVar = cVar3;
                                                                            c0330c9.f(c0330c9.k(cVar10), k4, 0, 5);
                                                                            this.H0 = null;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            cVar = cVar3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = j.f4091a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3982b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3984c0, k());
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
                                                                    weakReference4 = this.f4024J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        c cVar11 = (c) this.f4024J0.get();
                                                                        C0333f k5 = c0330c.k(this.f3963K);
                                                                        try {
                                                                            c0330c3 = this.f4032w0;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = j.f4091a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3982b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3984c0, k());
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
                                                                            c0330c3.f(k5, c0330c3.k(cVar11), 0, 5);
                                                                            try {
                                                                                this.f4024J0 = null;
                                                                            } catch (Exception e8) {
                                                                                e = e8;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f4091a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f3982b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3984c0, k());
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
                                                                            boolean[] zArr222 = j.f4091a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f3982b0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f3984c0, k());
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
                                                                    c0330c.p();
                                                                    z3 = true;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = j.f4091a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f3982b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f3984c0, k());
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
                                                                boolean[] zArr22222 = j.f4091a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean W3 = W(64);
                                                                    Q(c0330c, W3);
                                                                    int size6 = this.f4027q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        d dVar13 = (d) this.f4027q0.get(i53);
                                                                        dVar13.Q(c0330c, W3);
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
                                                                    Q(c0330c, W2);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((d) this.f4027q0.get(i55)).Q(c0330c, W2);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        d dVar14 = (d) this.f4027q0.get(i10);
                                                                        i56 = Math.max(i56, dVar14.q() + dVar14.f3977Y);
                                                                        i57 = Math.max(i57, dVar14.k() + dVar14.f3978Z);
                                                                    }
                                                                    max3 = Math.max(this.f3982b0, i56);
                                                                    max4 = Math.max(this.f3984c0, i57);
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
                                                                max = Math.max(this.f3982b0, q());
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
                                                                max2 = Math.max(this.f3984c0, k());
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
                                                                        this.f4020E0 = r6;
                                                                        objArr[0] = r6;
                                                                        O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && k() > i4) {
                                                                        this.f4021F0 = r6;
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
                                                        weakReference2 = this.f4023I0;
                                                        if (weakReference2 != null) {
                                                            c cVar92 = (c) this.f4023I0.get();
                                                            C0333f k32 = c0330c.k(this.f3964L);
                                                            C0330c c0330c82 = this.f4032w0;
                                                            c0330c82.f(k32, c0330c82.k(cVar92), 0, 5);
                                                            this.f4023I0 = null;
                                                        }
                                                        weakReference3 = this.H0;
                                                        if (weakReference3 != null) {
                                                            c cVar102 = (c) this.H0.get();
                                                            cVar3 = cVar;
                                                            C0333f k42 = c0330c.k(cVar3);
                                                            C0330c c0330c92 = this.f4032w0;
                                                            cVar = cVar3;
                                                            c0330c92.f(c0330c92.k(cVar102), k42, 0, 5);
                                                            this.H0 = null;
                                                        }
                                                        weakReference4 = this.f4024J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c0330c.p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = j.f4091a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f3982b0, i562);
                                                            max4 = Math.max(this.f3984c0, i572);
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
                                                        max = Math.max(this.f3982b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f3984c0, k());
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
                                                    this.f4027q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    F(c0330c.f3836l);
                                                }
                                                L(i16);
                                                this.f4021F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (W(64)) {
                                            }
                                            c0330c.getClass();
                                            c0330c.f3833g = false;
                                            if (this.f4019D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f4027q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f4035z0 = 0;
                                            this.f4017A0 = 0;
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
                                            this.f4027q0 = arrayList102;
                                            if (z4) {
                                            }
                                            F(c0330c.f3836l);
                                        }
                                        O(i14);
                                        this.f4020E0 = true;
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
                                    c0330c.getClass();
                                    c0330c.f3833g = false;
                                    if (this.f4019D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f4027q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f4035z0 = 0;
                                    this.f4017A0 = 0;
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
                                    this.f4027q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    F(c0330c.f3836l);
                                }
                            }
                        }
                        oVar2 = null;
                        if (oVar == null) {
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
                        c0330c.getClass();
                        c0330c.f3833g = false;
                        if (this.f4019D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f4027q0;
                        if (objArr[0] != 2) {
                        }
                        this.f4035z0 = 0;
                        this.f4017A0 = 0;
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
                        this.f4027q0 = arrayList10222;
                        if (z4) {
                        }
                        F(c0330c.f3836l);
                    }
                } else {
                    c0330c = c0330c6;
                    c3 = 1;
                }
                oVar = null;
                if (objArr[c3] == 2) {
                }
                oVar2 = null;
                if (oVar == null) {
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
                c0330c.getClass();
                c0330c.f3833g = false;
                if (this.f4019D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f4027q0;
                if (objArr[0] != 2) {
                }
                this.f4035z0 = 0;
                this.f4017A0 = 0;
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
                this.f4027q0 = arrayList102222;
                if (z4) {
                }
                F(c0330c.f3836l);
            }
            c0330c = c0330c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (W(64)) {
        }
        c0330c.getClass();
        c0330c.f3833g = false;
        if (this.f4019D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f4027q0;
        if (objArr[0] != 2) {
        }
        this.f4035z0 = 0;
        this.f4017A0 = 0;
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
        this.f4027q0 = arrayList1022222;
        if (z4) {
        }
        F(c0330c.f3836l);
    }

    public final boolean W(int i) {
        return (this.f4019D0 & i) == i;
    }

    @Override // s.d
    public final void n(StringBuilder sb) {
        sb.append(this.f3994j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f3973U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f3974V);
        sb.append("\n");
        Iterator it = this.f4027q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
