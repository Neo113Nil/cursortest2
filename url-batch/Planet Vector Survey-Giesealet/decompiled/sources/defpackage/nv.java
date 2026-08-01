package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nv {
    public final ov a;
    public Outline f;
    public float j;
    public xc0 k;
    public e5 l;
    public e5 m;
    public boolean n;
    public nc o;
    public y4 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public sl b = nk.f;
    public c10 c = c10.d;
    public mu d = o1.B;
    public final f2 e = new f2(13, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final w4 r = new w4();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public nv(ov ovVar) {
        this.a = ovVar;
        ovVar.t(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            ov ovVar = this.a;
            if (z || ovVar.G() > 0.0f) {
                e5 e5Var = this.l;
                if (e5Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = e5Var instanceof e5;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = e5Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = e5Var;
                    if (outline != null) {
                        outline.setAlpha(ovVar.a());
                        outline2 = outline;
                    }
                    ovVar.k(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.w) {
                        ovVar.t(false);
                        ovVar.p();
                    } else {
                        ovVar.t(this.w);
                    }
                } else {
                    ovVar.t(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long W = px0.W(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        W = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (W >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (W & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(ovVar.a());
                    ovVar.k(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                ovVar.t(false);
                ovVar.k(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            w4 w4Var = this.r;
            nv nvVar = (nv) w4Var.b;
            if (nvVar != null) {
                nvVar.e();
                w4Var.b = null;
            }
            b70 b70Var = (b70) w4Var.d;
            if (b70Var != null) {
                Object[] objArr = b70Var.b;
                long[] jArr = b70Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((nv) objArr[(i << 3) + i3]).e();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                b70Var.b();
            }
            this.a.p();
        }
    }

    public final void c(oo ooVar) {
        w4 w4Var = this.r;
        w4Var.c = (nv) w4Var.b;
        b70 b70Var = (b70) w4Var.d;
        if (b70Var != null && b70Var.h()) {
            b70 b70Var2 = (b70) w4Var.e;
            if (b70Var2 == null) {
                int i = wn0.a;
                b70Var2 = new b70();
                w4Var.e = b70Var2;
            }
            b70Var2.i(b70Var);
            b70Var.b();
        }
        w4Var.a = true;
        this.d.c(ooVar);
        w4Var.a = false;
        nv nvVar = (nv) w4Var.c;
        if (nvVar != null) {
            nvVar.e();
        }
        b70 b70Var3 = (b70) w4Var.e;
        if (b70Var3 == null || !b70Var3.h()) {
            return;
        }
        Object[] objArr = b70Var3.b;
        long[] jArr = b70Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((nv) objArr[(i2 << 3) + i4]).e();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        b70Var3.b();
    }

    public final xc0 d() {
        xc0 vc0Var;
        xc0 xc0Var = this.k;
        e5 e5Var = this.l;
        if (xc0Var != null) {
            return xc0Var;
        }
        if (e5Var != null) {
            uc0 uc0Var = new uc0(e5Var);
            this.k = uc0Var;
            return uc0Var;
        }
        long W = px0.W(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            W = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (W >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (W & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            vc0Var = new wc0(ld0.a(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            vc0Var = new vc0(new zi0(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = vc0Var;
        return vc0Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f(float f, long j, long j2) {
        if (ra0.b(this.h, j) && fr0.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
