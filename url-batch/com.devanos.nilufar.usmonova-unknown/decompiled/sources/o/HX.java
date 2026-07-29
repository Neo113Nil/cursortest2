package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class HX {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final C1334k b;
    public volatile int c = 0;

    public HX(C1334k c1334k, int i) {
        this.b = c1334k;
        this.a = i;
    }

    public final int a(int i) {
        KC b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.k;
        int i2 = a + b.h;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final KC b() {
        ThreadLocal threadLocal = d;
        KC kc = (KC) threadLocal.get();
        if (kc == null) {
            kc = new KC();
            threadLocal.set(kc);
        }
        LC lc = (LC) this.b.i;
        int a = lc.a(6);
        if (a != 0) {
            int i = a + lc.h;
            int i2 = (this.a * 4) + ((ByteBuffer) lc.k).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) lc.k).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) lc.k;
            kc.k = byteBuffer;
            if (byteBuffer != null) {
                kc.h = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                kc.i = i4;
                kc.j = ((ByteBuffer) kc.k).getShort(i4);
                return kc;
            }
            kc.h = 0;
            kc.i = 0;
            kc.j = 0;
        }
        return kc;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        KC b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.k).getInt(a + b.h) : 0));
        sb.append(", codepoints:");
        KC b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.h;
            i = ((ByteBuffer) b2.k).getInt(((ByteBuffer) b2.k).getInt(i2) + i2);
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
