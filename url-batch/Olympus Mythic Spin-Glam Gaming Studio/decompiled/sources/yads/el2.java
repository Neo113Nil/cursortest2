package yads;

/* loaded from: classes10.dex */
public final class el2 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final m73 a = new m73(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final xb2 b = new xb2();

    public static long a(xb2 xb2Var) {
        int i = xb2Var.b;
        if (xb2Var.c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        xb2Var.a(bArr, 0, 9);
        xb2Var.e(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
