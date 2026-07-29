package o;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* loaded from: classes.dex */
public final class SG {
    public boolean a = true;
    public final Outline b;
    public RG c;
    public E3 d;
    public DH e;
    public boolean f;
    public boolean g;
    public DH h;
    public OO i;
    public float j;
    public long k;
    public long l;
    public boolean m;

    public SG() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.b = outline;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0980ea interfaceC0980ea) {
        DH dh;
        DH dh2;
        E3 e3;
        int v;
        Path.Direction direction;
        d();
        DH dh3 = this.e;
        if (dh3 != null) {
            interfaceC0980ea.e(dh3);
            return;
        }
        float f = this.j;
        if (f <= 0.0f) {
            interfaceC0980ea.i(BF.b(this.k), BF.c(this.k), ZR.b(this.l) + BF.b(this.k), ZR.a(this.l) + BF.c(this.k));
            return;
        }
        DH dh4 = this.h;
        OO oo = this.i;
        if (dh4 != null) {
            long j = this.k;
            long j2 = this.l;
            if (oo != null) {
                long j3 = oo.e;
                long j4 = oo.h;
                long j5 = oo.g;
                dh = dh4;
                long j6 = oo.f;
                float b = AbstractC0111Ee.b(j3);
                long j7 = oo.e;
                if ((b == AbstractC0111Ee.c(j7) && AbstractC0111Ee.b(j7) == AbstractC0111Ee.b(j6) && AbstractC0111Ee.b(j7) == AbstractC0111Ee.c(j6) && AbstractC0111Ee.b(j7) == AbstractC0111Ee.b(j5) && AbstractC0111Ee.b(j7) == AbstractC0111Ee.c(j5) && AbstractC0111Ee.b(j7) == AbstractC0111Ee.b(j4) && AbstractC0111Ee.b(j7) == AbstractC0111Ee.c(j4)) && oo.a == BF.b(j) && oo.b == BF.c(j)) {
                    if (oo.c == ZR.b(j2) + BF.b(j)) {
                        if (oo.d == ZR.a(j2) + BF.c(j) && AbstractC0111Ee.b(oo.e) == f) {
                            dh2 = dh;
                            interfaceC0980ea.e(dh2);
                        }
                    }
                }
                float b2 = BF.b(this.k);
                float c = BF.c(this.k);
                float b3 = ZR.b(this.l) + BF.b(this.k);
                float a = ZR.a(this.l) + BF.c(this.k);
                long b4 = AbstractC1305jX.b(this.j);
                long floatToRawIntBits = (Float.floatToRawIntBits(AbstractC0111Ee.b(b4)) << 32) | (Float.floatToRawIntBits(AbstractC0111Ee.c(b4)) & 4294967295L);
                OO oo2 = new OO(b2, c, b3, a, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
                if (dh != null) {
                    dh2 = new E3();
                } else {
                    ((E3) dh).a.reset();
                    dh2 = dh;
                }
                e3 = (E3) dh2;
                if (e3.b == null) {
                    e3.b = new RectF();
                }
                RectF rectF = e3.b;
                AbstractC0048Bt.k(rectF);
                rectF.set(oo2.a, oo2.b, oo2.c, oo2.d);
                if (e3.c == null) {
                    e3.c = new float[8];
                }
                float[] fArr = e3.c;
                AbstractC0048Bt.k(fArr);
                long j8 = oo2.e;
                fArr[0] = AbstractC0111Ee.b(j8);
                fArr[1] = AbstractC0111Ee.c(j8);
                long j9 = oo2.f;
                fArr[2] = AbstractC0111Ee.b(j9);
                fArr[3] = AbstractC0111Ee.c(j9);
                long j10 = oo2.g;
                fArr[4] = AbstractC0111Ee.b(j10);
                fArr[5] = AbstractC0111Ee.c(j10);
                long j11 = oo2.h;
                fArr[6] = AbstractC0111Ee.b(j11);
                fArr[7] = AbstractC0111Ee.c(j11);
                Path path = e3.a;
                RectF rectF2 = e3.b;
                AbstractC0048Bt.k(rectF2);
                float[] fArr2 = e3.c;
                AbstractC0048Bt.k(fArr2);
                v = AbstractC1888sN.v(1);
                if (v != 0) {
                    direction = Path.Direction.CCW;
                } else {
                    if (v != 1) {
                        throw new C0057Cc();
                    }
                    direction = Path.Direction.CW;
                }
                path.addRoundRect(rectF2, fArr2, direction);
                this.i = oo2;
                this.h = dh2;
                interfaceC0980ea.e(dh2);
            }
        }
        dh = dh4;
        float b22 = BF.b(this.k);
        float c2 = BF.c(this.k);
        float b32 = ZR.b(this.l) + BF.b(this.k);
        float a2 = ZR.a(this.l) + BF.c(this.k);
        long b42 = AbstractC1305jX.b(this.j);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(AbstractC0111Ee.b(b42)) << 32) | (Float.floatToRawIntBits(AbstractC0111Ee.c(b42)) & 4294967295L);
        OO oo22 = new OO(b22, c2, b32, a2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2);
        if (dh != null) {
        }
        e3 = (E3) dh2;
        if (e3.b == null) {
        }
        RectF rectF3 = e3.b;
        AbstractC0048Bt.k(rectF3);
        rectF3.set(oo22.a, oo22.b, oo22.c, oo22.d);
        if (e3.c == null) {
        }
        float[] fArr3 = e3.c;
        AbstractC0048Bt.k(fArr3);
        long j82 = oo22.e;
        fArr3[0] = AbstractC0111Ee.b(j82);
        fArr3[1] = AbstractC0111Ee.c(j82);
        long j92 = oo22.f;
        fArr3[2] = AbstractC0111Ee.b(j92);
        fArr3[3] = AbstractC0111Ee.c(j92);
        long j102 = oo22.g;
        fArr3[4] = AbstractC0111Ee.b(j102);
        fArr3[5] = AbstractC0111Ee.c(j102);
        long j112 = oo22.h;
        fArr3[6] = AbstractC0111Ee.b(j112);
        fArr3[7] = AbstractC0111Ee.c(j112);
        Path path2 = e3.a;
        RectF rectF22 = e3.b;
        AbstractC0048Bt.k(rectF22);
        float[] fArr22 = e3.c;
        AbstractC0048Bt.k(fArr22);
        v = AbstractC1888sN.v(1);
        if (v != 0) {
        }
        path2.addRoundRect(rectF22, fArr22, direction);
        this.i = oo22;
        this.h = dh2;
        interfaceC0980ea.e(dh2);
    }

    public final Outline b() {
        d();
        if (this.m && this.a) {
            return this.b;
        }
        return null;
    }

    public final boolean c(RG rg, boolean z, long j) {
        this.b.setAlpha(1.0f);
        boolean h = AbstractC0048Bt.h(this.c, rg);
        boolean z2 = !h;
        if (!h) {
            this.c = rg;
            this.f = true;
        }
        this.l = j;
        boolean z3 = rg != null && z;
        if (this.m != z3) {
            this.m = z3;
            this.f = true;
        }
        return z2;
    }

    public final void d() {
        if (this.f) {
            this.k = 0L;
            this.j = 0.0f;
            this.e = null;
            this.f = false;
            this.g = false;
            RG rg = this.c;
            Outline outline = this.b;
            if (rg == null || !this.m || ZR.b(this.l) <= 0.0f || ZR.a(this.l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.a = true;
            if (rg instanceof PG) {
                C1032fM c1032fM = ((PG) rg).a;
                float f = c1032fM.a;
                float f2 = c1032fM.b;
                this.k = PX.h(f, f2);
                this.l = AbstractC1035fP.a(c1032fM.c(), c1032fM.b());
                outline.setRect(Math.round(f), Math.round(f2), Math.round(c1032fM.c), Math.round(c1032fM.d));
                return;
            }
            if (rg instanceof QG) {
                throw null;
            }
            if (rg instanceof OG) {
                int i = Build.VERSION.SDK_INT;
                E3 e3 = null;
                Outline outline2 = this.b;
                if (i > 28 || e3.a.isConvex()) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                this.a = false;
                outline2.setEmpty();
                this.g = true;
                this.e = null;
            }
        }
    }
}
