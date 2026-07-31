package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class us2 {
    public final ub0 a;
    public final xb2 b;
    public ts2 c;
    public ts2 d;
    public ts2 e;
    public long f;

    public us2(ub0 ub0Var) {
        this.a = ub0Var;
        ub0Var.getClass();
        this.b = new xb2(32);
        ts2 ts2Var = new ts2(0L);
        this.c = ts2Var;
        this.d = ts2Var;
        this.e = ts2Var;
    }

    public final void a(long j) {
        ts2 ts2Var;
        if (j == -1) {
            return;
        }
        while (true) {
            ts2Var = this.c;
            if (j < ts2Var.b) {
                break;
            }
            ub0 ub0Var = this.a;
            id idVar = ts2Var.c;
            synchronized (ub0Var) {
                id[] idVarArr = ub0Var.d;
                int i = ub0Var.c;
                ub0Var.c = i + 1;
                idVarArr[i] = idVar;
                ub0Var.b--;
                ub0Var.notifyAll();
            }
            ts2 ts2Var2 = this.c;
            ts2Var2.c = null;
            ts2 ts2Var3 = ts2Var2.d;
            ts2Var2.d = null;
            this.c = ts2Var3;
        }
        if (this.d.a < ts2Var.a) {
            this.d = ts2Var;
        }
    }

    public static ts2 a(ts2 ts2Var, fb0 fb0Var, vs2 vs2Var, xb2 xb2Var) {
        ts2 ts2Var2;
        int i;
        if (fb0Var.b(1073741824)) {
            long j = vs2Var.b;
            xb2Var.c(1);
            ts2 a = a(ts2Var, j, xb2Var.a, 1);
            long j2 = j + 1;
            byte b = xb2Var.a[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            q20 q20Var = fb0Var.c;
            byte[] bArr = q20Var.a;
            if (bArr == null) {
                q20Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ts2Var2 = a(a, j2, q20Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                xb2Var.c(2);
                ts2Var2 = a(ts2Var2, j3, xb2Var.a, 2);
                j3 += 2;
                i = xb2Var.p();
            } else {
                i = 1;
            }
            int[] iArr = q20Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = q20Var.e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = i * 6;
                xb2Var.c(i3);
                ts2Var2 = a(ts2Var2, j3, xb2Var.a, i3);
                j3 += i3;
                xb2Var.e(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr2[i4] = xb2Var.p();
                    iArr4[i4] = xb2Var.n();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = vs2Var.a - ((int) (j3 - vs2Var.b));
            }
            b83 b83Var = vs2Var.c;
            int i5 = sb3.a;
            q20Var.a(i, iArr2, iArr4, b83Var.b, q20Var.a, b83Var.a, b83Var.c, b83Var.d);
            long j4 = vs2Var.b;
            int i6 = (int) (j3 - j4);
            vs2Var.b = j4 + i6;
            vs2Var.a -= i6;
        } else {
            ts2Var2 = ts2Var;
        }
        if (fb0Var.b(268435456)) {
            xb2Var.c(4);
            ts2 a2 = a(ts2Var2, vs2Var.b, xb2Var.a, 4);
            int n = xb2Var.n();
            vs2Var.b += 4;
            vs2Var.a -= 4;
            fb0Var.c(n);
            ts2 a3 = a(a2, vs2Var.b, fb0Var.d, n);
            vs2Var.b += n;
            int i7 = vs2Var.a - n;
            vs2Var.a = i7;
            ByteBuffer byteBuffer = fb0Var.g;
            if (byteBuffer != null && byteBuffer.capacity() >= i7) {
                fb0Var.g.clear();
            } else {
                fb0Var.g = ByteBuffer.allocate(i7);
            }
            return a(a3, vs2Var.b, fb0Var.g, vs2Var.a);
        }
        fb0Var.c(vs2Var.a);
        return a(ts2Var2, vs2Var.b, fb0Var.d, vs2Var.a);
    }

    public final void a(ts2 ts2Var) {
        if (ts2Var.c == null) {
            return;
        }
        ub0 ub0Var = this.a;
        synchronized (ub0Var) {
            ts2 ts2Var2 = ts2Var;
            while (ts2Var2 != null) {
                try {
                    id[] idVarArr = ub0Var.d;
                    int i = ub0Var.c;
                    ub0Var.c = i + 1;
                    id idVar = ts2Var2.c;
                    idVar.getClass();
                    idVarArr[i] = idVar;
                    ub0Var.b--;
                    ts2Var2 = ts2Var2.d;
                    if (ts2Var2 != null && ts2Var2.c != null) {
                    }
                    ts2Var2 = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ub0Var.notifyAll();
        }
        ts2Var.c = null;
        ts2Var.d = null;
    }

    public static ts2 a(ts2 ts2Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ts2Var.b) {
            ts2Var = ts2Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (ts2Var.b - j));
            id idVar = ts2Var.c;
            byteBuffer.put(idVar.a, ((int) (j - ts2Var.a)) + idVar.b, min);
            i -= min;
            j += min;
            if (j == ts2Var.b) {
                ts2Var = ts2Var.d;
            }
        }
        return ts2Var;
    }

    public static ts2 a(ts2 ts2Var, long j, byte[] bArr, int i) {
        while (j >= ts2Var.b) {
            ts2Var = ts2Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (ts2Var.b - j));
            id idVar = ts2Var.c;
            System.arraycopy(idVar.a, ((int) (j - ts2Var.a)) + idVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == ts2Var.b) {
                ts2Var = ts2Var.d;
            }
        }
        return ts2Var;
    }
}
