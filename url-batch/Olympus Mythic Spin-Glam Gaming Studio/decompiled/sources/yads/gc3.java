package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes5.dex */
public final class gc3 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public final long a(pd0 pd0Var, boolean z, boolean z2, int i) {
        int i2;
        if (this.b == 0) {
            if (!pd0Var.a(this.a, 0, 1, z)) {
                return -1L;
            }
            int i3 = this.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = 0;
            while (true) {
                long[] jArr = d;
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((i3 & jArr[i4]) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            pd0Var.a(this.a, 1, i5 - 1, false);
        }
        this.b = 0;
        return a(this.a, this.c, z2);
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
