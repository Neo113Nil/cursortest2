package J1;

import W0.s;
import a1.AbstractC0067d;
import i1.f;
import i1.i;
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
import p1.l;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f612a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        s sVar = s.f1284a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return sVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && f.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return sVar;
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length2 + " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int i2 = 0;
        while (i2 < length2) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char charAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i2 = i3;
                    } else {
                        j2 += 4;
                        i2 += 2;
                    }
                }
                j2 += i;
            }
            i2++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x0070->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z2;
        int length;
        f.e(str, "host");
        byte[] bArr = y1.b.f4648a;
        i iVar = y1.b.f4652f;
        iVar.getClass();
        if (((Pattern) iVar.f3051b).matcher(str).matches()) {
            String v2 = AbstractC0067d.v(str);
            List a2 = a(x509Certificate, 7);
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (f.a(v2, AbstractC0067d.v((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                f.d(locale, "US");
                str = str.toLowerCase(locale);
                f.d(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a3 = a(x509Certificate, 2);
            if (!a3.isEmpty()) {
                for (String str2 : a3) {
                    if (str.length() != 0 && !l.J(str, ".", false) && !l.E(str, "..") && str2 != null && str2.length() != 0 && !l.J(str2, ".", false) && !l.E(str2, "..")) {
                        String concat = !l.E(str, ".") ? str.concat(".") : str;
                        if (!l.E(str2, ".")) {
                            str2 = str2.concat(".");
                        }
                        if (b(str2)) {
                            Locale locale2 = Locale.US;
                            f.d(locale2, "US");
                            str2 = str2.toLowerCase(locale2);
                            f.d(str2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!p1.d.L(str2, "*")) {
                            z2 = f.a(concat, str2);
                        } else if (l.J(str2, "*.", false) && p1.d.P(str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                            String substring = str2.substring(1);
                            f.d(substring, "this as java.lang.String).substring(startIndex)");
                            if (l.E(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || p1.d.T(concat, '.', length - 1, 4) == -1)) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            return true;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        f.e(str, "host");
        f.e(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            f.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
