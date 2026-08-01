package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yx0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final k2 b;
    public volatile int c = 0;

    public yx0(k2 k2Var, int i) {
        this.b = k2Var;
        this.a = i;
    }

    public final int a(int i) {
        l50 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.g;
        int i2 = a + b.d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final l50 b() {
        ThreadLocal threadLocal = d;
        l50 l50Var = (l50) threadLocal.get();
        if (l50Var == null) {
            l50Var = new l50();
            threadLocal.set(l50Var);
        }
        m50 m50Var = (m50) this.b.d;
        int a = m50Var.a(6);
        if (a != 0) {
            int i = a + m50Var.d;
            int i2 = (this.a * 4) + ((ByteBuffer) m50Var.g).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) m50Var.g).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) m50Var.g;
            l50Var.g = byteBuffer;
            if (byteBuffer != null) {
                l50Var.d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                l50Var.e = i4;
                l50Var.f = ((ByteBuffer) l50Var.g).getShort(i4);
                return l50Var;
            }
            l50Var.d = 0;
            l50Var.e = 0;
            l50Var.f = 0;
        }
        return l50Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        l50 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.g).getInt(a + b.d) : 0));
        sb.append(", codepoints:");
        l50 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.d;
            i = ((ByteBuffer) b2.g).getInt(((ByteBuffer) b2.g).getInt(i2) + i2);
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
