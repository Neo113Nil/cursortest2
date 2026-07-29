package o;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: o.gO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100gO {
    public static SL a(String str, NB nb) {
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
        G8 g8 = new G8();
        AbstractC0048Bt.n(charset, "charset");
        int length = str.length();
        AbstractC0048Bt.n(str, "string");
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.g(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder i = AbstractC2188wx.i(length, "endIndex > string.length: ", " > ");
            i.append(str.length());
            throw new IllegalArgumentException(i.toString().toString());
        }
        if (charset.equals(AbstractC0470Sa.a)) {
            g8.T(str, 0, length);
        } else {
            String substring = str.substring(0, length);
            AbstractC0048Bt.m(substring, "substring(...)");
            byte[] bytes = substring.getBytes(charset);
            AbstractC0048Bt.m(bytes, "getBytes(...)");
            g8.m5write(bytes, 0, bytes.length);
        }
        return b(g8, nb, g8.i);
    }

    public static SL b(N8 n8, NB nb, long j) {
        AbstractC0048Bt.n(n8, "<this>");
        return new SL(nb, j, n8, 1);
    }

    public static SL c(byte[] bArr, NB nb) {
        AbstractC0048Bt.n(bArr, "<this>");
        G8 g8 = new G8();
        g8.m5write(bArr, 0, bArr.length);
        return b(g8, nb, bArr.length);
    }
}
