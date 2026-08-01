package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t60 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final oe b;
    public volatile int c = 0;

    public t60(oe oeVar, int i) {
        this.b = oeVar;
        this.a = i;
    }

    public final int a(int i) {
        nt b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final nt b() {
        ThreadLocal threadLocal = d;
        nt ntVar = (nt) threadLocal.get();
        if (ntVar == null) {
            ntVar = new nt();
            threadLocal.set(ntVar);
        }
        ot otVar = (ot) this.b.f;
        int a = otVar.a(6);
        if (a != 0) {
            int i = a + otVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) otVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) otVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) otVar.d;
            ntVar.d = byteBuffer;
            if (byteBuffer != null) {
                ntVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ntVar.b = i4;
                ntVar.c = ((ByteBuffer) ntVar.d).getShort(i4);
                return ntVar;
            }
            ntVar.a = 0;
            ntVar.b = 0;
            ntVar.c = 0;
        }
        return ntVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        nt b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        nt b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
