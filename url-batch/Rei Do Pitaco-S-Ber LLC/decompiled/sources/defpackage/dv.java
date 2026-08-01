package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class dv implements HostnameVerifier {
    public static final dv a = new dv();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return uh.f;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && oo.b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            l8.r(length2, " < 0", "endIndex < beginIndex: ");
            return false;
        }
        if (length2 > str.length()) {
            l8.n("endIndex > string.length: ", length2, " > ", str.length());
            return false;
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0068->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        gz gzVar = z60.f;
        gzVar.getClass();
        if (((Pattern) gzVar.g).matcher(str).matches()) {
            String j0 = g8.j0(str);
            List a2 = a(x509Certificate, 7);
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (oo.b(j0, g8.j0((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> a3 = a(x509Certificate, 2);
        if (!a3.isEmpty()) {
            for (String str2 : a3) {
                if (str.length() != 0 && !u30.l0(str, ".", false) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !u30.l0(str2, ".", false) && !str2.endsWith("..")) {
                    String concat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!str2.endsWith(".")) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str2 = str2.toLowerCase(locale2);
                        str2.getClass();
                    }
                    if (!m30.n0(str2, "*")) {
                        z = concat.equals(str2);
                    } else if (u30.l0(str2, "*.", false) && m30.q0(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || m30.t0(concat, '.', length - 1, 4) == -1)) {
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
        str.getClass();
        sSLSession.getClass();
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
