package o;

/* loaded from: classes.dex */
public abstract class UP {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new MD(0);
    }

    public static final void a(long[] jArr, int i) {
        AbstractC0048Bt.n(jArr, "metadata");
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int length = jArr.length;
        int i4 = length - 1;
        int i5 = length - 2;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[i4] = jArr[0];
    }

    public static final int b(long[] jArr, int i, int i2) {
        AbstractC0048Bt.n(jArr, "metadata");
        while (i < i2) {
            if (((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int c(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int d(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int e(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int f(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
