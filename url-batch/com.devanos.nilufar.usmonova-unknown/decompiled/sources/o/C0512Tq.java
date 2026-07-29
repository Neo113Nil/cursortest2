package o;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: o.Tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512Tq {
    public final InterfaceC0538Uq a;
    public Outline f;
    public float j;
    public DH k;
    public C1143h2 l;
    public int m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f112o;
    public long p;
    public long q;
    public long r;
    public RectF s;
    public InterfaceC1119gh b = EB.g;
    public EnumC2057uy c = EnumC2057uy.h;
    public AbstractC1596ny d = I2.J;
    public final C1400l e = new C1400l(19, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final C0785bb n = new C0785bb();

    static {
        int i = AbstractC1794qy.a;
        int i2 = AbstractC1794qy.a;
    }

    public C0512Tq(InterfaceC0538Uq interfaceC0538Uq) {
        this.a = interfaceC0538Uq;
        interfaceC0538Uq.t();
        this.p = 0L;
        this.q = 0L;
        this.r = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            InterfaceC0538Uq interfaceC0538Uq = this.a;
            Outline outline2 = null;
            if (interfaceC0538Uq.E() > 0.0f) {
                DH dh = this.k;
                if (dh != null) {
                    RectF rectF = this.s;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.s = rectF;
                    }
                    boolean z = dh instanceof E3;
                    if (!z) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = ((E3) dh).a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || ((E3) dh).a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            TG.a.a(outline, dh);
                        } else {
                            if (!z) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        outline = null;
                    }
                    this.k = dh;
                    if (outline != null) {
                        outline.setAlpha(interfaceC0538Uq.a());
                        outline2 = outline;
                    }
                    interfaceC0538Uq.r(outline2, AbstractC0946e20.a(Math.round(rectF.width()), Math.round(rectF.height())));
                    interfaceC0538Uq.t();
                } else {
                    interfaceC0538Uq.t();
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long T = AbstractC0946e20.T(this.q);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? T : j2;
                    outline5.setRoundRect(Math.round(BF.b(j)), Math.round(BF.c(j)), Math.round(ZR.b(j3) + BF.b(j)), Math.round(ZR.a(j3) + BF.c(j)), this.j);
                    outline5.setAlpha(interfaceC0538Uq.a());
                    interfaceC0538Uq.r(outline5, (Math.round(ZR.b(j3)) << 32) | (Math.round(ZR.a(j3)) & 4294967295L));
                }
            } else {
                interfaceC0538Uq.t();
                interfaceC0538Uq.r(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.f112o && this.m == 0) {
            C0785bb c0785bb = this.n;
            C0512Tq c0512Tq = (C0512Tq) c0785bb.b;
            if (c0512Tq != null) {
                c0512Tq.c();
                c0785bb.b = null;
            }
            QD qd = (QD) c0785bb.d;
            if (qd != null) {
                Object[] objArr = qd.b;
                long[] jArr = qd.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((C0512Tq) objArr[(i << 3) + i3]).c();
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
                qd.b();
            }
            this.a.f();
        }
    }

    public final void c() {
        this.m--;
        b();
    }

    public final void d() {
        C0785bb c0785bb = this.n;
        c0785bb.c = (C0512Tq) c0785bb.b;
        QD qd = (QD) c0785bb.d;
        if (qd != null && qd.h()) {
            QD qd2 = (QD) c0785bb.e;
            if (qd2 == null) {
                int i = WP.a;
                qd2 = new QD();
                c0785bb.e = qd2;
            }
            qd2.i(qd);
            qd.b();
        }
        c0785bb.a = true;
        this.a.m(this.b, this.c, this, this.e);
        c0785bb.a = false;
        C0512Tq c0512Tq = (C0512Tq) c0785bb.c;
        if (c0512Tq != null) {
            c0512Tq.c();
        }
        QD qd3 = (QD) c0785bb.e;
        if (qd3 == null || !qd3.h()) {
            return;
        }
        Object[] objArr = qd3.b;
        long[] jArr = qd3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((C0512Tq) objArr[(i2 << 3) + i4]).c();
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
        qd3.b();
    }
}
