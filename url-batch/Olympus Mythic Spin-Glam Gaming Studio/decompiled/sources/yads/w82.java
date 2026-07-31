package yads;

import android.util.Base64;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class w82 {
    public final String a(yp2 yp2Var) {
        byte[] bArr = yp2Var.b.a;
        if (bArr == null) {
            return null;
        }
        String b = xz0.b(yp2Var.c, a11.T);
        if (!(b == null ? true : Boolean.parseBoolean(b))) {
            return new String(bArr, Charsets.UTF_8);
        }
        try {
            return new String(Base64.decode(bArr, 0), Charsets.UTF_8);
        } catch (Exception unused) {
            String str = new String(bArr, Charsets.UTF_8);
            boolean z = ob1.a;
            return str;
        }
    }
}
