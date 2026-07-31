package yads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public final class kn3 implements ln3 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final wp0 a;
    public final c83 b;
    public final on3 c;
    public final int d;
    public final byte[] e;
    public final xb2 f;
    public final int g;
    public final jw0 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public kn3(wp0 wp0Var, c83 c83Var, on3 on3Var) {
        this.a = wp0Var;
        this.b = c83Var;
        this.c = on3Var;
        int max = Math.max(1, on3Var.b / 10);
        this.g = max;
        byte[] bArr = on3Var.e;
        int length = bArr.length;
        byte b = bArr[0];
        byte b2 = bArr[1];
        int i = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.d = i;
        int i2 = on3Var.a;
        int i3 = on3Var.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (on3Var.d * i2)) + 1;
        if (i != i4) {
            throw new cc2("Expected frames per block: " + i4 + "; got: " + i, null, true, 1);
        }
        int i5 = sb3.a;
        int i6 = ((max + i) - 1) / i;
        this.e = new byte[i3 * i6];
        this.f = new xb2(i * 2 * i2 * i6);
        int i7 = on3Var.b;
        int i8 = ((on3Var.c * i7) * 8) / i;
        iw0 iw0Var = new iw0();
        iw0Var.k = "audio/raw";
        iw0Var.f = i8;
        iw0Var.g = i8;
        iw0Var.l = max * 2 * i2;
        iw0Var.x = on3Var.a;
        iw0Var.y = i7;
        iw0Var.z = 2;
        this.h = new jw0(iw0Var);
    }

    @Override // yads.ln3
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // yads.ln3
    public final void a(int i, long j) {
        this.a.a(new rn3(this.c, this.d, i, j));
        this.b.a(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003e -> B:4:0x0040). Please report as a decompilation issue!!! */
    @Override // yads.ln3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(pd0 pd0Var, long j) {
        pd0 pd0Var2;
        boolean z;
        int i;
        int i2 = this.g;
        int i3 = this.k;
        on3 on3Var = this.c;
        int i4 = i2 - (i3 / (on3Var.a * 2));
        int i5 = this.d;
        int i6 = sb3.a;
        int i7 = 1;
        int i8 = (((i4 + i5) - 1) / i5) * on3Var.c;
        if (j == 0) {
            pd0Var2 = pd0Var;
            z = true;
            while (!z) {
                if (this.i >= i8) {
                    break;
                }
                int c = pd0Var2.c(this.e, this.i, (int) Math.min(i8 - r8, j));
                if (c == -1) {
                    z = true;
                    while (!z) {
                    }
                } else {
                    this.i += c;
                }
            }
            i = this.i / this.c.c;
            if (i > 0) {
                byte[] bArr = this.e;
                xb2 xb2Var = this.f;
                int i9 = 0;
                while (i9 < i) {
                    int i10 = 0;
                    while (true) {
                        on3 on3Var2 = this.c;
                        int i11 = on3Var2.a;
                        if (i10 < i11) {
                            byte[] bArr2 = xb2Var.a;
                            int i12 = on3Var2.c;
                            int i13 = (i10 * 4) + (i9 * i12);
                            int i14 = (i11 * 4) + i13;
                            int i15 = (i12 / i11) - 4;
                            int i16 = (short) (((bArr[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                            int min = Math.min(bArr[i13 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
                            int i17 = n[min];
                            int i18 = ((this.d * i9 * i11) + i10) * 2;
                            bArr2[i18] = (byte) (i16 & 255);
                            bArr2[i18 + 1] = (byte) (i16 >> 8);
                            int i19 = 0;
                            while (i19 < i15 * 2) {
                                byte b = bArr[((i19 / 8) * i11 * 4) + i14 + ((i19 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                int i20 = i19 % 2 == 0 ? b & 15 : (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
                                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                                if ((i20 & 8) != 0) {
                                    i21 = -i21;
                                }
                                int i22 = i16 + i21;
                                int i23 = sb3.a;
                                i16 = Math.max(-32768, Math.min(i22, 32767));
                                i18 += i11 * 2;
                                bArr2[i18] = (byte) (i16 & 255);
                                bArr2[i18 + 1] = (byte) (i16 >> 8);
                                int i24 = min + m[i20];
                                int[] iArr = n;
                                min = Math.max(0, Math.min(i24, 88));
                                i17 = iArr[min];
                                i19++;
                                bArr = bArr3;
                            }
                            i10++;
                            i7 = 1;
                            bArr = bArr;
                        }
                    }
                    i9 += i7;
                    bArr = bArr;
                }
                int i25 = this.d * i * 2 * this.c.a;
                xb2Var.e(0);
                xb2Var.d(i25);
                this.i -= i * this.c.c;
                xb2 xb2Var2 = this.f;
                int i26 = xb2Var2.c;
                this.b.a(i26, xb2Var2);
                int i27 = this.k + i26;
                this.k = i27;
                int i28 = i27 / (this.c.a * 2);
                int i29 = this.g;
                if (i28 >= i29) {
                    long a = this.j + sb3.a(this.l, 1000000L, r2.b);
                    int i30 = i29 * 2 * this.c.a;
                    this.b.a(a, 1, i30, this.k - i30, null);
                    this.l += i29;
                    this.k -= i30;
                }
            }
            if (z) {
                int i31 = this.k / (this.c.a * 2);
                if (i31 > 0) {
                    long a2 = this.j + sb3.a(this.l, 1000000L, r2.b);
                    int i32 = i31 * 2 * this.c.a;
                    this.b.a(a2, 1, i32, this.k - i32, null);
                    this.l += i31;
                    this.k -= i32;
                }
            }
            return z;
        }
        pd0Var2 = pd0Var;
        z = false;
        while (!z) {
        }
        i = this.i / this.c.c;
        if (i > 0) {
        }
        if (z) {
        }
        return z;
    }
}
