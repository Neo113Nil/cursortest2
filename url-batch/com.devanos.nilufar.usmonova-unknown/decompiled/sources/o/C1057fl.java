package o;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057fl {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public C1057fl(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }

    public static C1057fl a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1319jl.C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C1057fl(wrap.array(), 4, 1);
    }

    public static C1057fl b(C1189hl c1189hl, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1319jl.C[5]]);
        wrap.order(byteOrder);
        C1189hl c1189hl2 = new C1189hl[]{c1189hl}[0];
        wrap.putInt((int) c1189hl2.a);
        wrap.putInt((int) c1189hl2.b);
        return new C1057fl(wrap.array(), 5, 1);
    }

    public static C1057fl c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1319jl.C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new C1057fl(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g instanceof String) {
            return Double.parseDouble((String) g);
        }
        if (g instanceof long[]) {
            if (((long[]) g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof int[]) {
            if (((int[]) g).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof C1189hl[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C1189hl[] c1189hlArr = (C1189hl[]) g;
        if (c1189hlArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C1189hl c1189hl = c1189hlArr[0];
        return c1189hl.a / c1189hl.b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g instanceof String) {
            return Integer.parseInt((String) g);
        }
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g instanceof C1189hl[])) {
            return null;
        }
        C1189hl[] c1189hlArr = (C1189hl[]) g;
        while (i < c1189hlArr.length) {
            sb.append(c1189hlArr[i].a);
            sb.append('/');
            sb.append(c1189hlArr[i].b);
            i++;
            if (i != c1189hlArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [o.hl[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [o.hl[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        C0991el c0991el;
        InputStream inputStream;
        ?? str;
        byte b;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                c0991el = new C0991el(bArr);
                try {
                    c0991el.j = byteOrder;
                    int i = this.a;
                    int i2 = 0;
                    int i3 = this.b;
                    switch (i) {
                        case 1:
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) {
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    c0991el.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(bArr, C1319jl.L);
                            break;
                            break;
                        case 2:
                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (i3 >= C1319jl.D.length) {
                                int i4 = 0;
                                while (true) {
                                    byte[] bArr2 = C1319jl.D;
                                    if (i4 >= bArr2.length) {
                                        i2 = bArr2.length;
                                    } else if (bArr[i4] == bArr2[i4]) {
                                        i4++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i2 < i3) {
                                byte b2 = bArr[i2];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    break;
                                } else {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i2++;
                                }
                            }
                            str = sb.toString();
                        case 3:
                            str = new int[i3];
                            while (i2 < i3) {
                                str[i2] = c0991el.readUnsignedShort();
                                i2++;
                            }
                        case 4:
                            str = new long[i3];
                            while (i2 < i3) {
                                str[i2] = c0991el.readInt() & 4294967295L;
                                i2++;
                            }
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            str = new C1189hl[i3];
                            while (i2 < i3) {
                                str[i2] = new C1189hl(c0991el.readInt() & 4294967295L, c0991el.readInt() & 4294967295L);
                                i2++;
                            }
                        case 8:
                            str = new int[i3];
                            while (i2 < i3) {
                                str[i2] = c0991el.readShort();
                                i2++;
                            }
                        case 9:
                            str = new int[i3];
                            while (i2 < i3) {
                                str[i2] = c0991el.readInt();
                                i2++;
                            }
                        case 10:
                            str = new C1189hl[i3];
                            while (i2 < i3) {
                                str[i2] = new C1189hl(c0991el.readInt(), c0991el.readInt());
                                i2++;
                            }
                        case 11:
                            str = new double[i3];
                            while (i2 < i3) {
                                str[i2] = c0991el.readFloat();
                                i2++;
                            }
                        case 12:
                            str = new double[i3];
                            while (i2 < i3) {
                                str[i2] = c0991el.readDouble();
                                i2++;
                            }
                        default:
                            try {
                                c0991el.close();
                                return null;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return null;
                            }
                    }
                    try {
                        c0991el.close();
                        return str;
                    } catch (IOException e3) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        return str;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c0991el != null) {
                        try {
                            c0991el.close();
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e6) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            c0991el = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + C1319jl.B[this.a] + ", data length:" + this.d.length + ")";
    }

    public C1057fl(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }
}
