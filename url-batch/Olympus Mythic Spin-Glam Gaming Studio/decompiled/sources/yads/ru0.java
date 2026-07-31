package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes.dex */
public abstract class ru0 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r13 == r21.f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        if ((r20.k() * 1000) == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r6 == r5) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(xb2 xb2Var, xu0 xu0Var, int i, qu0 qu0Var) {
        int i2;
        int i3;
        int i4;
        int k;
        long l = xb2Var.l();
        long j = l >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i5 = (int) ((l >> 12) & 15);
        int i6 = (int) ((l >> 8) & 15);
        int i7 = (int) ((l >> 4) & 15);
        int i8 = (int) ((l >> 1) & 7);
        boolean z2 = (l & 1) == 1;
        if (i7 > 7 ? !(i7 > 10 || xu0Var.g != 2) : i7 == xu0Var.g - 1) {
            if ((i8 == 0 || i8 == xu0Var.i) && !z2) {
                try {
                    long q = xb2Var.q();
                    if (!z) {
                        q *= xu0Var.b;
                    }
                    qu0Var.a = q;
                    switch (i5) {
                        case 1:
                            i2 = 192;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i3 = i5 - 2;
                            i4 = 576;
                            i2 = i4 << i3;
                            break;
                        case 6:
                            k = xb2Var.k();
                            i2 = k + 1;
                            break;
                        case 7:
                            k = xb2Var.p();
                            i2 = k + 1;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i3 = i5 - 8;
                            i4 = 256;
                            i2 = i4 << i3;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    if (i2 != -1 && i2 <= xu0Var.b) {
                        int i9 = xu0Var.e;
                        if (i6 != 0) {
                            if (i6 > 11) {
                                if (i6 != 12) {
                                    if (i6 <= 14) {
                                        int p = xb2Var.p();
                                        if (i6 == 14) {
                                            p *= 10;
                                        }
                                    }
                                }
                            }
                        }
                        int k2 = xb2Var.k();
                        int i10 = xb2Var.b;
                        byte[] bArr = xb2Var.a;
                        int i11 = i10 - 1;
                        int i12 = 0;
                        for (int i13 = xb2Var.b; i13 < i11; i13++) {
                            i12 = sb3.o[i12 ^ (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                        }
                        int i14 = sb3.a;
                        if (k2 == i12) {
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }
}
