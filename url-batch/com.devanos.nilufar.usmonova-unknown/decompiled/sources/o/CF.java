package o;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class CF implements HostnameVerifier {
    public static final CF a = new CF();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return C1318jk.h;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && AbstractC0048Bt.h(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.h(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder i2 = AbstractC2188wx.i(length2, "endIndex > string.length: ", " > ");
            i2.append(str.length());
            throw new IllegalArgumentException(i2.toString().toString());
        }
        long j = 0;
        int i3 = 0;
        while (i3 < length2) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i4 = i3 + 1;
                    char charAt2 = i4 < length2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i3 = i4;
                    } else {
                        j += 4;
                        i3 += 2;
                    }
                }
                j += i;
            }
            i3++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x006e->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        AbstractC0048Bt.n(str, "host");
        byte[] bArr = HY.a;
        C0705aN c0705aN = HY.f;
        c0705aN.getClass();
        if (c0705aN.h.matcher(str).matches()) {
            String K = AbstractC1305jX.K(str);
            List a2 = a(x509Certificate, 7);
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (AbstractC0048Bt.h(K, AbstractC1305jX.K((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            AbstractC0048Bt.m(locale, "US");
            str = str.toLowerCase(locale);
            AbstractC0048Bt.m(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> a3 = a(x509Certificate, 2);
        if (!a3.isEmpty()) {
            for (String str2 : a3) {
                if (str.length() != 0 && !AbstractC0778bU.B(str, ".", false) && !AbstractC0778bU.v(str, "..", false) && str2 != null && str2.length() != 0 && !AbstractC0778bU.B(str2, ".", false) && !AbstractC0778bU.v(str2, "..", false)) {
                    String concat = !AbstractC0778bU.v(str, ".", false) ? str.concat(".") : str;
                    if (!AbstractC0778bU.v(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        AbstractC0048Bt.m(locale2, "US");
                        str2 = str2.toLowerCase(locale2);
                        AbstractC0048Bt.m(str2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!UT.E(str2, "*")) {
                        z = AbstractC0048Bt.h(concat, str2);
                    } else if (AbstractC0778bU.B(str2, "*.", false) && UT.H(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
                        if (AbstractC0778bU.v(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || UT.K(concat, '.', length - 1, 4) == -1)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC0048Bt.n(str, "host");
        AbstractC0048Bt.n(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                AbstractC0048Bt.l(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
