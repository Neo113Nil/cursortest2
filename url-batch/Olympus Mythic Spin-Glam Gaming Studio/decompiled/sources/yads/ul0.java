package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes6.dex */
public final class ul0 {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final nl0 d;
    public final ml0 e;
    public final tl0 f;
    public Bitmap g;

    public ul0(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new nl0(719, 575, 0, 719, 0, 575);
        this.e = new ml0(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f = new tl0(i2, i3);
    }

    public static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static ml0 a(wb2 wb2Var, int i2) {
        int a;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int a2 = wb2Var.a(8);
        wb2Var.c(8);
        int i8 = 2;
        int i9 = i2 - 2;
        int i10 = 4;
        int i11 = 1;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] a3 = a();
        int[] b = b();
        while (i9 > 0) {
            int a4 = wb2Var.a(i7);
            int a5 = wb2Var.a(i7);
            int[] iArr2 = (a5 & 128) != 0 ? iArr : (a5 & 64) != 0 ? a3 : b;
            if ((a5 & i11) != 0) {
                i3 = wb2Var.a(i7);
                i4 = wb2Var.a(i7);
                i5 = wb2Var.a(i7);
                a = wb2Var.a(i7);
                i9 -= 6;
            } else {
                int a6 = wb2Var.a(6) << i8;
                int a7 = wb2Var.a(i10) << i10;
                int a8 = wb2Var.a(i10) << 4;
                i9 -= 4;
                a = wb2Var.a(i8) << 6;
                i3 = a6;
                i4 = a7;
                i5 = a8;
            }
            if (i3 == 0) {
                i6 = 255;
                i4 = 0;
                i5 = 0;
            } else {
                i6 = a;
            }
            double d = i3;
            double d2 = i4 - 128;
            int i12 = a2;
            double d3 = i5 - 128;
            int i13 = sb3.a;
            iArr2[a4] = a((byte) (255 - (i6 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            a2 = i12;
            iArr = iArr;
            a3 = a3;
            i7 = 8;
            i8 = 2;
            i10 = 4;
            i11 = 1;
        }
        return new ml0(a2, iArr, a3, b);
    }

    public static int[] b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = a(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static ol0 a(wb2 wb2Var) {
        byte[] bArr;
        int a = wb2Var.a(16);
        wb2Var.c(4);
        int a2 = wb2Var.a(2);
        boolean e = wb2Var.e();
        wb2Var.c(1);
        byte[] bArr2 = sb3.f;
        if (a2 == 1) {
            wb2Var.c(wb2Var.a(8) * 16);
        } else if (a2 == 0) {
            int a3 = wb2Var.a(16);
            int a4 = wb2Var.a(16);
            if (a3 > 0) {
                bArr2 = new byte[a3];
                if (wb2Var.c == 0) {
                    System.arraycopy(wb2Var.a, wb2Var.b, bArr2, 0, a3);
                    wb2Var.b += a3;
                    wb2Var.a();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (a4 > 0) {
                bArr = new byte[a4];
                if (wb2Var.c == 0) {
                    System.arraycopy(wb2Var.a, wb2Var.b, bArr, 0, a4);
                    wb2Var.b += a4;
                    wb2Var.a();
                    return new ol0(a, e, bArr2, bArr);
                }
                throw new IllegalStateException();
            }
        }
        bArr = bArr2;
        return new ol0(a, e, bArr2, bArr);
    }

    public static int[] a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026a A[LOOP:3: B:90:0x019a->B:100:0x026a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int a;
        char c;
        char c2;
        int i6;
        int i7;
        boolean z2;
        int a2;
        int i8;
        int i9;
        byte[] bArr4;
        boolean z3;
        int i10;
        int a3;
        int a4;
        int i11;
        int i12;
        int i13;
        int a5;
        int i14;
        wb2 wb2Var = new wb2(bArr);
        int i15 = i3;
        int i16 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (wb2Var.b() != 0) {
            int i17 = 8;
            int a6 = wb2Var.a(8);
            if (a6 != 240) {
                int i18 = 4;
                int i19 = 2;
                int i20 = 0;
                int i21 = 1;
                switch (a6) {
                    case 16:
                        int i22 = 0;
                        int i23 = 2;
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            i5 = i15;
                            z = false;
                            while (true) {
                                a = wb2Var.a(i23);
                                if (a != 0) {
                                }
                                if (i7 != 0) {
                                }
                                i8 = i5;
                                i9 = i22;
                                i5 = i8 + i7;
                                if (z2) {
                                }
                                i22 = i9;
                                z = z2;
                                i23 = 2;
                            }
                        } else if (bArr5 == null) {
                            bArr3 = i;
                            bArr2 = bArr3;
                            i5 = i15;
                            z = false;
                            while (true) {
                                a = wb2Var.a(i23);
                                if (a != 0) {
                                    z2 = z;
                                    i7 = 1;
                                    c = 4;
                                    c2 = '\b';
                                    i6 = a;
                                } else {
                                    if (wb2Var.e()) {
                                        int a7 = wb2Var.a(3) + 3;
                                        a2 = wb2Var.a(i23);
                                        i7 = a7;
                                        z2 = z;
                                        c2 = '\b';
                                    } else {
                                        if (wb2Var.e()) {
                                            z2 = z;
                                            i6 = i22;
                                            i7 = 1;
                                        } else {
                                            int a8 = wb2Var.a(i23);
                                            if (a8 == 0) {
                                                c = 4;
                                                c2 = '\b';
                                                i6 = i22;
                                                i7 = i6;
                                                z2 = true;
                                            } else if (a8 == 1) {
                                                c = 4;
                                                c2 = '\b';
                                                z2 = z;
                                                i6 = i22;
                                                i7 = i23;
                                            } else if (a8 == i23) {
                                                c = 4;
                                                c2 = '\b';
                                                i7 = wb2Var.a(4) + 12;
                                                z2 = z;
                                                i6 = wb2Var.a(i23);
                                            } else if (a8 != 3) {
                                                z2 = z;
                                                i6 = i22;
                                                i7 = i6;
                                            } else {
                                                c2 = '\b';
                                                int a9 = wb2Var.a(8) + 29;
                                                a2 = wb2Var.a(i23);
                                                i7 = a9;
                                                z2 = z;
                                            }
                                        }
                                        c = 4;
                                        c2 = '\b';
                                    }
                                    i6 = a2;
                                    c = 4;
                                }
                                if (i7 != 0 || paint == null) {
                                    i8 = i5;
                                    i9 = i22;
                                } else {
                                    if (bArr2 != null) {
                                        i6 = bArr2[i6];
                                    }
                                    paint.setColor(iArr[i6]);
                                    i8 = i5;
                                    i9 = i22;
                                    canvas.drawRect(i5, i16, i5 + i7, i16 + 1, paint);
                                }
                                i5 = i8 + i7;
                                if (z2) {
                                    if (wb2Var.c != 0) {
                                        wb2Var.c = i9;
                                        wb2Var.b++;
                                        wb2Var.a();
                                    }
                                    i15 = i5;
                                    break;
                                } else {
                                    i22 = i9;
                                    z = z2;
                                    i23 = 2;
                                }
                            }
                        } else {
                            bArr2 = bArr5;
                            i5 = i15;
                            z = false;
                            while (true) {
                                a = wb2Var.a(i23);
                                if (a != 0) {
                                }
                                if (i7 != 0) {
                                }
                                i8 = i5;
                                i9 = i22;
                                i5 = i8 + i7;
                                if (z2) {
                                }
                                i22 = i9;
                                z = z2;
                                i23 = 2;
                            }
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        int i24 = i15;
                        boolean z4 = false;
                        while (true) {
                            int a10 = wb2Var.a(i18);
                            if (a10 != 0) {
                                z3 = z4;
                                a4 = a10;
                                i10 = 1;
                            } else if (!wb2Var.e()) {
                                int a11 = wb2Var.a(3);
                                if (a11 != 0) {
                                    z3 = z4;
                                    i10 = a11 + 2;
                                    a4 = 0;
                                } else {
                                    z3 = true;
                                    a4 = 0;
                                    i10 = 0;
                                }
                            } else {
                                if (!wb2Var.e()) {
                                    a3 = wb2Var.a(i19) + i18;
                                    a4 = wb2Var.a(i18);
                                } else {
                                    int a12 = wb2Var.a(i19);
                                    if (a12 == 0) {
                                        z3 = z4;
                                        i10 = 1;
                                    } else if (a12 == 1) {
                                        z3 = z4;
                                        i10 = i19;
                                    } else if (a12 == i19) {
                                        a3 = wb2Var.a(i18) + 9;
                                        a4 = wb2Var.a(i18);
                                    } else if (a12 != 3) {
                                        z3 = z4;
                                        a4 = 0;
                                        i10 = 0;
                                    } else {
                                        a3 = wb2Var.a(i17) + 25;
                                        a4 = wb2Var.a(i18);
                                    }
                                    a4 = 0;
                                }
                                z3 = z4;
                                i10 = a3;
                            }
                            if (i10 == 0 || paint == null) {
                                i11 = i24;
                                i12 = i19;
                            } else {
                                if (bArr4 != 0) {
                                    a4 = bArr4[a4];
                                }
                                paint.setColor(iArr[a4]);
                                i11 = i24;
                                i12 = 2;
                                canvas.drawRect(i24, i16, i24 + i10, i16 + 1, paint);
                            }
                            i24 = i11 + i10;
                            if (z3) {
                                if (wb2Var.c != 0) {
                                    wb2Var.c = 0;
                                    wb2Var.b++;
                                    wb2Var.a();
                                }
                                i15 = i24;
                                break;
                            } else {
                                i19 = i12;
                                z4 = z3;
                                i18 = 4;
                                i17 = 8;
                            }
                        }
                    case 18:
                        int i25 = i15;
                        int i26 = 0;
                        while (true) {
                            int a13 = wb2Var.a(8);
                            if (a13 != 0) {
                                i13 = i26;
                                a5 = i21;
                            } else if (!wb2Var.e()) {
                                int a14 = wb2Var.a(7);
                                if (a14 != 0) {
                                    i13 = i26;
                                    a5 = a14;
                                    a13 = i20;
                                } else {
                                    i13 = i21;
                                    a13 = i20;
                                    a5 = a13;
                                }
                            } else {
                                i13 = i26;
                                a5 = wb2Var.a(7);
                                a13 = wb2Var.a(8);
                            }
                            if (a5 == 0 || paint == null) {
                                i14 = i21;
                            } else {
                                paint.setColor(iArr[a13]);
                                i14 = i21;
                                canvas.drawRect(i25, i16, i25 + a5, i16 + 1, paint);
                            }
                            i25 += a5;
                            if (i13 != 0) {
                                i15 = i25;
                                break;
                            } else {
                                i21 = i14;
                                i26 = i13;
                                i20 = 0;
                            }
                        }
                    default:
                        switch (a6) {
                            case 32:
                                bArr7 = new byte[4];
                                while (i20 < 4) {
                                    bArr7[i20] = (byte) wb2Var.a(4);
                                    i20++;
                                }
                                break;
                            case 33:
                                bArr5 = new byte[4];
                                while (i20 < 4) {
                                    bArr5[i20] = (byte) wb2Var.a(8);
                                    i20++;
                                }
                                break;
                            case 34:
                                bArr6 = new byte[16];
                                while (i20 < 16) {
                                    bArr6[i20] = (byte) wb2Var.a(8);
                                    i20++;
                                }
                                break;
                        }
                }
            } else {
                i16 += 2;
                i15 = i3;
            }
        }
    }
}
