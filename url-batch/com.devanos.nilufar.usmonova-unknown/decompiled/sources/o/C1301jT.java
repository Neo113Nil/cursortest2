package o;

import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.jT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301jT implements CC {
    public static final C1301jT h = new C1301jT();
    public static final boolean i;
    public static final Charset j;

    static {
        i = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        j = Charset.forName("UTF8");
    }

    public static void a(ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i2 = byteBuffer.get() & 255;
        return i2 < 254 ? i2 : i2 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [float[], java.io.Serializable] */
    public static Serializable c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        byte b = byteBuffer.get();
        Charset charset = j;
        int i2 = 0;
        switch (b) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[b(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[b(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                ?? r0 = new byte[b(byteBuffer)];
                byteBuffer.get((byte[]) r0);
                return r0;
            case 9:
                int b2 = b(byteBuffer);
                ?? r1 = new int[b2];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get((int[]) r1);
                byteBuffer.position((b2 * 4) + byteBuffer.position());
                return r1;
            case 10:
                int b3 = b(byteBuffer);
                ?? r12 = new long[b3];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get((long[]) r12);
                byteBuffer.position((b3 * 8) + byteBuffer.position());
                return r12;
            case 11:
                int b4 = b(byteBuffer);
                ?? r13 = new double[b4];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get((double[]) r13);
                byteBuffer.position((b4 * 8) + byteBuffer.position());
                return r13;
            case 12:
                int b5 = b(byteBuffer);
                ArrayList arrayList = new ArrayList(b5);
                while (i2 < b5) {
                    arrayList.add(c(byteBuffer));
                    i2++;
                }
                return arrayList;
            case 13:
                int b6 = b(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i2 < b6) {
                    hashMap.put(c(byteBuffer), c(byteBuffer));
                    i2++;
                }
                return hashMap;
            case 14:
                int b7 = b(byteBuffer);
                ?? r14 = new float[b7];
                a(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get((float[]) r14);
                byteBuffer.position((b7 * 4) + byteBuffer.position());
                return r14;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public static void e(C1237iT c1237iT, int i2) {
        int size = c1237iT.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                c1237iT.write(0);
            }
        }
    }

    public static void f(C1237iT c1237iT, int i2) {
        if (i) {
            c1237iT.write(i2);
            c1237iT.write(i2 >>> 8);
            c1237iT.write(i2 >>> 16);
            c1237iT.write(i2 >>> 24);
            return;
        }
        c1237iT.write(i2 >>> 24);
        c1237iT.write(i2 >>> 16);
        c1237iT.write(i2 >>> 8);
        c1237iT.write(i2);
    }

    public static void g(C1237iT c1237iT, long j2) {
        if (i) {
            c1237iT.write((byte) j2);
            c1237iT.write((byte) (j2 >>> 8));
            c1237iT.write((byte) (j2 >>> 16));
            c1237iT.write((byte) (j2 >>> 24));
            c1237iT.write((byte) (j2 >>> 32));
            c1237iT.write((byte) (j2 >>> 40));
            c1237iT.write((byte) (j2 >>> 48));
            c1237iT.write((byte) (j2 >>> 56));
            return;
        }
        c1237iT.write((byte) (j2 >>> 56));
        c1237iT.write((byte) (j2 >>> 48));
        c1237iT.write((byte) (j2 >>> 40));
        c1237iT.write((byte) (j2 >>> 32));
        c1237iT.write((byte) (j2 >>> 24));
        c1237iT.write((byte) (j2 >>> 16));
        c1237iT.write((byte) (j2 >>> 8));
        c1237iT.write((byte) j2);
    }

    public static void i(C1237iT c1237iT, int i2) {
        if (i2 < 254) {
            c1237iT.write(i2);
            return;
        }
        if (i2 > 65535) {
            c1237iT.write(255);
            f(c1237iT, i2);
            return;
        }
        c1237iT.write(254);
        if (i) {
            c1237iT.write(i2);
            c1237iT.write(i2 >>> 8);
        } else {
            c1237iT.write(i2 >>> 8);
            c1237iT.write(i2);
        }
    }

    public static void j(C1237iT c1237iT, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            c1237iT.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            c1237iT.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z = obj instanceof Number;
        Charset charset = j;
        if (z) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                c1237iT.write(3);
                f(c1237iT, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                c1237iT.write(4);
                g(c1237iT, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                c1237iT.write(6);
                e(c1237iT, 8);
                g(c1237iT, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                c1237iT.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                i(c1237iT, bytes.length);
                c1237iT.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            c1237iT.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            i(c1237iT, bytes2.length);
            c1237iT.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            c1237iT.write(8);
            byte[] bArr = (byte[]) obj;
            i(c1237iT, bArr.length);
            c1237iT.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            c1237iT.write(9);
            int[] iArr = (int[]) obj;
            i(c1237iT, iArr.length);
            e(c1237iT, 4);
            int length = iArr.length;
            while (i2 < length) {
                f(c1237iT, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            c1237iT.write(10);
            long[] jArr = (long[]) obj;
            i(c1237iT, jArr.length);
            e(c1237iT, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                g(c1237iT, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            c1237iT.write(11);
            double[] dArr = (double[]) obj;
            i(c1237iT, dArr.length);
            e(c1237iT, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                g(c1237iT, Double.doubleToLongBits(dArr[i2]));
                i2++;
            }
            return;
        }
        if (obj instanceof List) {
            c1237iT.write(12);
            List list = (List) obj;
            i(c1237iT, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j(c1237iT, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            c1237iT.write(13);
            Map map = (Map) obj;
            i(c1237iT, map.size());
            for (Map.Entry entry : map.entrySet()) {
                j(c1237iT, entry.getKey());
                j(c1237iT, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        c1237iT.write(14);
        float[] fArr = (float[]) obj;
        i(c1237iT, fArr.length);
        e(c1237iT, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            f(c1237iT, Float.floatToIntBits(fArr[i2]));
            i2++;
        }
    }

    @Override // o.CC
    public final ByteBuffer d(Object obj) {
        if (obj == null) {
            return null;
        }
        C1237iT c1237iT = new C1237iT();
        j(c1237iT, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c1237iT.size());
        allocateDirect.put(c1237iT.b(), 0, c1237iT.size());
        return allocateDirect;
    }

    @Override // o.CC
    public final Object h(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Serializable c = c(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return c;
    }
}
