package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class RT implements CC {
    public static final Charset h = Charset.forName("UTF8");
    public static final RT i = new RT();

    public static String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i2;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new String(bArr, i2, remaining, h);
    }

    public static ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(h);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // o.CC
    public final /* bridge */ /* synthetic */ ByteBuffer d(Object obj) {
        return b((String) obj);
    }

    @Override // o.CC
    public final /* bridge */ /* synthetic */ Object h(ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }
}
