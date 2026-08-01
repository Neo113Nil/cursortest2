package U;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1214a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1215b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1216c = 0;

    public y(v vVar, int i) {
        this.f1215b = vVar;
        this.f1214a = i;
    }

    public final int a(int i) {
        V.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.d;
        int i2 = a2 + c2.f623a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        V.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f623a;
        return ((ByteBuffer) c2.d).getInt(((ByteBuffer) c2.d).getInt(i) + i);
    }

    public final V.a c() {
        ThreadLocal threadLocal = d;
        V.a aVar = (V.a) threadLocal.get();
        if (aVar == null) {
            aVar = new V.a();
            threadLocal.set(aVar);
        }
        V.b bVar = (V.b) this.f1215b.f1207a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f623a;
            int i2 = (this.f1214a * 4) + ((ByteBuffer) bVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f623a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f624b = i4;
                aVar.f625c = ((ByteBuffer) aVar.d).getShort(i4);
            } else {
                aVar.f623a = 0;
                aVar.f624b = 0;
                aVar.f625c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        V.a c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.d).getInt(a2 + c2.f623a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
