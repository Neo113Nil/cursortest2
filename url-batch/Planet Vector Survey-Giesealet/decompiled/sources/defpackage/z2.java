package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 extends av implements bu {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    @Override // defpackage.bu
    public final Object a() {
        ContentCaptureSession a;
        ca0 ca0Var;
        int i = this.l;
        int i2 = 1;
        Object obj = this.e;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    z0.e(view);
                }
                if (i3 < 29 || (a = zi.a(view)) == null) {
                    return null;
                }
                return new j3(i2, a, view);
            default:
                is isVar = (is) obj;
                b70 b70Var = isVar.c;
                b70 b70Var2 = isVar.d;
                ks ksVar = isVar.a;
                ts tsVar = ksVar.h;
                rs rsVar = rs.g;
                if (tsVar == null) {
                    Object[] objArr = b70Var2.b;
                    long[] jArr = b70Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        ((cs) objArr[(i4 << 3) + i6]).C(rsVar);
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                }
                            }
                            if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                } else if (tsVar.q) {
                    if (b70Var.c(tsVar)) {
                        tsVar.m0();
                    }
                    rs l0 = tsVar.l0();
                    if (!tsVar.d.q) {
                        cy.b("visitAncestors called on an unattached node");
                    }
                    t50 t50Var = tsVar.d;
                    p10 a0 = nz.a0(tsVar);
                    int i7 = 0;
                    while (a0 != null) {
                        if ((((t50) a0.F.j).g & 5120) != 0) {
                            while (t50Var != null) {
                                int i8 = t50Var.f;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & 1024) != 0) {
                                        i7++;
                                    }
                                    if ((t50Var instanceof cs) && b70Var2.c(t50Var)) {
                                        if (i7 <= 1) {
                                            ((cs) t50Var).C(l0);
                                        } else {
                                            ((cs) t50Var).C(rs.e);
                                        }
                                        b70Var2.k(t50Var);
                                    }
                                }
                                t50Var = t50Var.h;
                            }
                        }
                        a0 = a0.n();
                        t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
                    }
                    Object[] objArr2 = b70Var2.b;
                    long[] jArr2 = b70Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr2[i9];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((j2 & 255) < 128) {
                                        ((cs) objArr2[(i9 << 3) + i11]).C(rsVar);
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i9 != length2) {
                                i9++;
                            }
                        }
                    }
                }
                if (ksVar.h == null || ksVar.c.l0() == rsVar) {
                    ksVar.c();
                }
                b70Var.b();
                b70Var2.b();
                isVar.e = false;
                return ky0.a;
        }
    }
}
