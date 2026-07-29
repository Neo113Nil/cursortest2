package o;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class IN {
    public static HN a(String str, NB nb) {
        AbstractC0048Bt.n(str, "<this>");
        Charset charset = AbstractC0470Sa.a;
        if (nb != null) {
            Pattern pattern = NB.d;
            Charset a = nb.a(null);
            if (a == null) {
                String str2 = nb + "; charset=utf-8";
                AbstractC0048Bt.n(str2, "<this>");
                try {
                    nb = AbstractC0868ct.v(str2);
                } catch (IllegalArgumentException unused) {
                    nb = null;
                }
            } else {
                charset = a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC0048Bt.m(bytes, "this as java.lang.String).getBytes(charset)");
        return b(nb, bytes, 0, bytes.length);
    }

    public static HN b(NB nb, byte[] bArr, int i, int i2) {
        AbstractC0048Bt.n(bArr, "<this>");
        long length = bArr.length;
        long j = i;
        long j2 = i2;
        byte[] bArr2 = HY.a;
        if ((j | j2) < 0 || j > length || length - j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new HN(nb, bArr, i2, i);
    }

    public static /* synthetic */ HN c(IN in, byte[] bArr, NB nb, int i, int i2) {
        if ((i2 & 1) != 0) {
            nb = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        in.getClass();
        return b(nb, bArr, i, length);
    }
}
