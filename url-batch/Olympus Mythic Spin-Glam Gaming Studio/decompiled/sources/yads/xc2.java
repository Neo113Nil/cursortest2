package yads;

import android.graphics.Bitmap;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes15.dex */
public final class xc2 extends uz2 {
    public final xb2 m = new xb2();
    public final xb2 n = new xb2();
    public final wc2 o = new wc2();
    public Inflater p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uz2
    public final c53 a(byte[] bArr, int i, boolean z) {
        char c;
        boolean z2;
        s20 s20Var;
        xb2 xb2Var;
        int i2;
        int i3;
        int m;
        int i4;
        xb2 xb2Var2 = this.m;
        xb2Var2.a = bArr;
        xb2Var2.c = i;
        int i5 = 0;
        xb2Var2.b = 0;
        char c2 = 255;
        if (i > 0 && (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            if (sb3.a(xb2Var2, this.n, this.p)) {
                xb2 xb2Var3 = this.n;
                byte[] bArr2 = xb2Var3.a;
                int i6 = xb2Var3.c;
                xb2Var2.a = bArr2;
                xb2Var2.c = i6;
                xb2Var2.b = 0;
            }
        }
        wc2 wc2Var = this.o;
        wc2Var.d = 0;
        wc2Var.e = 0;
        wc2Var.f = 0;
        wc2Var.g = 0;
        wc2Var.h = 0;
        wc2Var.i = 0;
        wc2Var.a.c(0);
        wc2Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            xb2 xb2Var4 = this.m;
            int i7 = xb2Var4.c;
            if (i7 - xb2Var4.b < 3) {
                return new yc2(Collections.unmodifiableList(arrayList));
            }
            wc2 wc2Var2 = this.o;
            int k = xb2Var4.k();
            int p = xb2Var4.p();
            int i8 = xb2Var4.b + p;
            if (i8 > i7) {
                xb2Var4.e(i7);
                i4 = i5;
                c = c2;
                s20Var = null;
            } else {
                if (k != 128) {
                    switch (k) {
                        case 20:
                            wc2Var2.getClass();
                            if (p % 5 == 2) {
                                xb2Var4.e(xb2Var4.b + 2);
                                Arrays.fill(wc2Var2.b, i5);
                                int i9 = p / 5;
                                int i10 = i5;
                                while (i10 < i9) {
                                    int k2 = xb2Var4.k();
                                    int k3 = xb2Var4.k();
                                    int i11 = i10;
                                    double d = k3;
                                    double k4 = xb2Var4.k() - 128;
                                    int i12 = i9;
                                    double k5 = xb2Var4.k() - 128;
                                    int[] iArr = wc2Var2.b;
                                    int i13 = sb3.a;
                                    iArr[k2] = Math.max(0, Math.min((int) ((k5 * 1.772d) + d), 255)) | (Math.max(0, Math.min((int) ((1.402d * k4) + d), 255)) << 16) | (xb2Var4.k() << 24) | (Math.max(0, Math.min((int) ((d - (0.34414d * k5)) - (k4 * 0.71414d)), 255)) << 8);
                                    i10 = i11 + 1;
                                    c2 = 255;
                                    i9 = i12;
                                }
                                c = c2;
                                wc2Var2.c = true;
                                break;
                            }
                            c = c2;
                            break;
                        case 21:
                            wc2Var2.getClass();
                            if (p >= 4) {
                                xb2Var4.e(xb2Var4.b + 3);
                                int i14 = p - 4;
                                if (((xb2Var4.k() & 128) != 0 ? 1 : i5) != 0) {
                                    if (i14 >= 7 && (m = xb2Var4.m()) >= 4) {
                                        wc2Var2.h = xb2Var4.p();
                                        wc2Var2.i = xb2Var4.p();
                                        wc2Var2.a.c(m - 4);
                                        i14 = p - 11;
                                    }
                                }
                                xb2 xb2Var5 = wc2Var2.a;
                                int i15 = xb2Var5.b;
                                int i16 = xb2Var5.c;
                                if (i15 < i16 && i14 > 0) {
                                    int min = Math.min(i14, i16 - i15);
                                    xb2Var4.a(wc2Var2.a.a, i15, min);
                                    wc2Var2.a.e(i15 + min);
                                }
                            }
                            c = c2;
                            break;
                        case 22:
                            wc2Var2.getClass();
                            if (p >= 19) {
                                wc2Var2.d = xb2Var4.p();
                                wc2Var2.e = xb2Var4.p();
                                xb2Var4.e(xb2Var4.b + 11);
                                wc2Var2.f = xb2Var4.p();
                                wc2Var2.g = xb2Var4.p();
                            }
                            c = c2;
                            break;
                        default:
                            c = c2;
                            break;
                    }
                    i3 = 0;
                    s20Var = null;
                } else {
                    c = c2;
                    if (wc2Var2.d == 0 || wc2Var2.e == 0 || wc2Var2.h == 0 || wc2Var2.i == 0 || (i2 = (xb2Var = wc2Var2.a).c) == 0 || xb2Var.b != i2 || !wc2Var2.c) {
                        z2 = 0;
                        s20Var = null;
                    } else {
                        xb2Var.e(0);
                        int i17 = wc2Var2.h * wc2Var2.i;
                        int[] iArr2 = new int[i17];
                        int i18 = 0;
                        while (i18 < i17) {
                            int k6 = wc2Var2.a.k();
                            if (k6 != 0) {
                                iArr2[i18] = wc2Var2.b[k6];
                                i18++;
                            } else {
                                int k7 = wc2Var2.a.k();
                                if (k7 != 0) {
                                    int k8 = ((k7 & 64) == 0 ? k7 & 63 : ((k7 & 63) << 8) | wc2Var2.a.k()) + i18;
                                    Arrays.fill(iArr2, i18, k8, (k7 & 128) == 0 ? 0 : wc2Var2.b[wc2Var2.a.k()]);
                                    i18 = k8;
                                }
                            }
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, wc2Var2.h, wc2Var2.i, Bitmap.Config.ARGB_8888);
                        float f = wc2Var2.f;
                        float f2 = wc2Var2.d;
                        float f3 = f / f2;
                        float f4 = wc2Var2.g;
                        float f5 = wc2Var2.e;
                        s20Var = new s20(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, wc2Var2.h / f2, wc2Var2.i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        z2 = 0;
                    }
                    wc2Var2.d = z2 ? 1 : 0;
                    wc2Var2.e = z2 ? 1 : 0;
                    wc2Var2.f = z2 ? 1 : 0;
                    wc2Var2.g = z2 ? 1 : 0;
                    wc2Var2.h = z2 ? 1 : 0;
                    wc2Var2.i = z2 ? 1 : 0;
                    wc2Var2.a.c(z2 ? 1 : 0);
                    wc2Var2.c = z2;
                    i3 = z2;
                }
                xb2Var4.e(i8);
                i4 = i3;
            }
            if (s20Var != null) {
                arrayList.add(s20Var);
            }
            i5 = i4;
            c2 = c;
        }
    }
}
