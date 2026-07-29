package o;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public final /* synthetic */ class J2 extends AbstractC0511Tp implements InterfaceC1455lp {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.j = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [o.Pn] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r6v14, types: [o.TC] */
    /* JADX WARN: Type inference failed for: r6v15, types: [o.TC] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [o.TC] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        ContentCaptureSession a;
        QD qd;
        char c;
        Throwable th;
        long j;
        QD qd2;
        Object[] objArr;
        long[] jArr;
        QD qd3;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        QD qd4;
        Object[] objArr4;
        char c2;
        switch (this.j) {
            case 0:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    DZ.a(view, 1);
                }
                if (i < 29 || (a = CZ.a(view)) == null) {
                    return null;
                }
                return new C1182he(a, view);
            case 1:
                S2 s2 = (S2) this.receiver;
                if (s2.isFocused() || s2.hasFocus()) {
                    s2.clearFocus();
                }
                return C0782bY.a;
            case 2:
                return ((S2) this.receiver).v();
            case 3:
                C0172Gn c0172Gn = (C0172Gn) this.receiver;
                QD qd5 = c0172Gn.d;
                QD qd6 = c0172Gn.f;
                QD qd7 = c0172Gn.c;
                QD qd8 = c0172Gn.e;
                Object[] objArr5 = qd8.b;
                long[] jArr3 = qd8.a;
                int length = jArr3.length - 2;
                char c3 = 7;
                if (length >= 0) {
                    int i2 = 0;
                    th = null;
                    j = 255;
                    while (true) {
                        long j2 = jArr3[i2];
                        int i3 = i2;
                        if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j2 & 255) < 128) {
                                    c2 = c3;
                                    TC tc = ((TC) ((InterfaceC0302Ln) objArr5[(i3 << 3) + i5])).b;
                                    if (tc.m) {
                                        TC tc2 = tc;
                                        while (tc2 != null) {
                                            QD qd9 = qd8;
                                            if (tc2 instanceof C0405Pn) {
                                                qd7.a((C0405Pn) tc2);
                                            }
                                            tc2 = null;
                                            qd8 = qd9;
                                        }
                                        qd4 = qd8;
                                        if (!tc.m) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        objArr4 = objArr5;
                                        YD yd = new YD(new TC[16]);
                                        TC tc3 = tc.f;
                                        if (tc3 == null) {
                                            AbstractC0946e20.c(yd, tc);
                                        } else {
                                            yd.b(tc3);
                                        }
                                        while (yd.l()) {
                                            TC tc4 = (TC) yd.n(yd.j - 1);
                                            if ((tc4.d & 1024) == 0) {
                                                AbstractC0946e20.c(yd, tc4);
                                            } else {
                                                while (true) {
                                                    if (tc4 == null) {
                                                        break;
                                                    }
                                                    if ((tc4.c & 1024) != 0) {
                                                        while (tc4 != null) {
                                                            if (tc4 instanceof C0405Pn) {
                                                                qd7.a((C0405Pn) tc4);
                                                            }
                                                            tc4 = null;
                                                        }
                                                    } else {
                                                        tc4 = tc4.f;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        qd4 = qd8;
                                        objArr4 = objArr5;
                                    }
                                } else {
                                    qd4 = qd8;
                                    objArr4 = objArr5;
                                    c2 = c3;
                                }
                                j2 >>= 8;
                                i5++;
                                c3 = c2;
                                qd8 = qd4;
                                objArr5 = objArr4;
                            }
                            qd = qd8;
                            objArr3 = objArr5;
                            c = c3;
                            if (i4 != 8) {
                            }
                        } else {
                            qd = qd8;
                            objArr3 = objArr5;
                            c = c3;
                        }
                        if (i3 != length) {
                            i2 = i3 + 1;
                            c3 = c;
                            qd8 = qd;
                            objArr5 = objArr3;
                        }
                    }
                } else {
                    qd = qd8;
                    c = 7;
                    th = null;
                    j = 255;
                }
                qd.b();
                Object[] objArr6 = qd5.b;
                long[] jArr4 = qd5.a;
                int length2 = jArr4.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr4[i6];
                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j3 & j) < 128) {
                                    X7 x7 = (X7) objArr6[(i6 << 3) + i8];
                                    TC tc5 = x7.b;
                                    qd3 = qd5;
                                    if (!tc5.m) {
                                        AbstractC0868ct.W("onFocusEvent called on wrong node");
                                        throw th;
                                    }
                                    Object obj = tc5;
                                    boolean z = true;
                                    boolean z2 = false;
                                    ?? r31 = th;
                                    while (obj != null) {
                                        Object[] objArr7 = objArr6;
                                        if (obj instanceof C0405Pn) {
                                            C0405Pn c0405Pn = (C0405Pn) obj;
                                            if (r31 != 0) {
                                                z2 = true;
                                            }
                                            if (qd7.c(c0405Pn)) {
                                                qd6.a(c0405Pn);
                                                z = false;
                                            }
                                            r31 = c0405Pn;
                                        }
                                        obj = th;
                                        objArr6 = objArr7;
                                        r31 = r31;
                                    }
                                    objArr2 = objArr6;
                                    if (!tc5.m) {
                                        throw new IllegalStateException("visitChildren called on an unattached node");
                                    }
                                    jArr2 = jArr4;
                                    YD yd2 = new YD(new TC[16]);
                                    TC tc6 = tc5.f;
                                    if (tc6 == null) {
                                        AbstractC0946e20.c(yd2, tc5);
                                    } else {
                                        yd2.b(tc6);
                                    }
                                    while (yd2.l()) {
                                        ?? r6 = (TC) yd2.n(yd2.j - 1);
                                        if ((r6.d & 1024) == 0) {
                                            AbstractC0946e20.c(yd2, r6);
                                        } else {
                                            while (true) {
                                                if (r6 == 0) {
                                                    break;
                                                }
                                                if ((r6.c & 1024) != 0) {
                                                    while (r6 != 0) {
                                                        if (r6 instanceof C0405Pn) {
                                                            C0405Pn c0405Pn2 = (C0405Pn) r6;
                                                            if (r31 != 0) {
                                                                z2 = true;
                                                            }
                                                            if (qd7.c(c0405Pn2)) {
                                                                qd6.a(c0405Pn2);
                                                                z = false;
                                                            }
                                                            r31 = c0405Pn2;
                                                        }
                                                        r6 = th;
                                                    }
                                                } else {
                                                    r6 = r6.f;
                                                }
                                            }
                                        }
                                    }
                                    if (z) {
                                        if (z2) {
                                            PX.M(x7);
                                        } else if (r31 != 0) {
                                            r31.s();
                                        }
                                        x7.getClass();
                                        AbstractC0868ct.W("onFocusEvent called on wrong node");
                                        throw th;
                                    }
                                } else {
                                    qd3 = qd5;
                                    objArr2 = objArr6;
                                    jArr2 = jArr4;
                                }
                                j3 >>= 8;
                                i8++;
                                qd5 = qd3;
                                jArr4 = jArr2;
                                objArr6 = objArr2;
                            }
                            qd2 = qd5;
                            objArr = objArr6;
                            jArr = jArr4;
                            if (i7 != 8) {
                            }
                        } else {
                            qd2 = qd5;
                            objArr = objArr6;
                            jArr = jArr4;
                        }
                        if (i6 != length2) {
                            i6++;
                            qd5 = qd2;
                            jArr4 = jArr;
                            objArr6 = objArr;
                        }
                    }
                } else {
                    qd2 = qd5;
                }
                qd2.b();
                Object[] objArr8 = qd7.b;
                long[] jArr5 = qd7.a;
                int length3 = jArr5.length - 2;
                if (length3 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j4 = jArr5[i9];
                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j4 & j) < 128) {
                                    C0405Pn c0405Pn3 = (C0405Pn) objArr8[(i9 << 3) + i11];
                                    if (c0405Pn3.m) {
                                        EnumC0379On s = c0405Pn3.s();
                                        c0405Pn3.v();
                                        if (s != c0405Pn3.s() || qd6.c(c0405Pn3)) {
                                            PX.I0(c0405Pn3);
                                        }
                                    }
                                }
                                j4 >>= 8;
                            }
                            if (i10 != 8) {
                            }
                        }
                        if (i9 != length3) {
                            i9++;
                        }
                    }
                }
                qd7.b();
                qd6.b();
                c0172Gn.b.invoke();
                if (!qd.g()) {
                    AbstractC0868ct.W("Unprocessed FocusProperties nodes");
                    throw th;
                }
                if (!qd2.g()) {
                    AbstractC0868ct.W("Unprocessed FocusEvent nodes");
                    throw th;
                }
                if (qd7.g()) {
                    return C0782bY.a;
                }
                AbstractC0868ct.W("Unprocessed FocusTarget nodes");
                throw th;
            case 4:
                androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) this.receiver;
                if (aVar.d.s() == EnumC0379On.j) {
                    aVar.b.invoke();
                }
                return C0782bY.a;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((YF) this.receiver).d();
                return C0782bY.a;
            default:
                ((YF) this.receiver).d();
                return C0782bY.a;
        }
    }
}
