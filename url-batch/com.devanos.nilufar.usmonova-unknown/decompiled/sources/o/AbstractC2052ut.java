package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: o.ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2052ut {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0471Sb(bArr, 0, 0, false).e(0);
        } catch (C0230It e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
