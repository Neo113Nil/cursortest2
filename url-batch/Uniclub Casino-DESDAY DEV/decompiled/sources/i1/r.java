package i1;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2511a = true;

    public static v1.e a() {
        v1.e eVar = v1.e.f4047l;
        X0.d.b(eVar);
        v1.e eVar2 = eVar.f4049f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            v1.e.i.await(v1.e.f4045j, TimeUnit.MILLISECONDS);
            v1.e eVar3 = v1.e.f4047l;
            X0.d.b(eVar3);
            if (eVar3.f4049f != null || System.nanoTime() - nanoTime < v1.e.f4046k) {
                return null;
            }
            return v1.e.f4047l;
        }
        long nanoTime2 = eVar2.f4050g - System.nanoTime();
        if (nanoTime2 > 0) {
            v1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        v1.e eVar4 = v1.e.f4047l;
        X0.d.b(eVar4);
        eVar4.f4049f = eVar2.f4049f;
        eVar2.f4049f = null;
        return eVar2;
    }

    public static void b(long j2, v1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        v1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((v1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        v1.i iVar = (v1.i) arrayList.get(i2);
        v1.i iVar2 = (v1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            v1.i iVar3 = (v1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j3 = 4;
            long j4 = (fVar.f4052b / j3) + j2 + 2 + i12 + 1;
            fVar.u(-i12);
            fVar.u(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.u(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((v1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.u(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                v1.f fVar3 = new v1.f();
                fVar.u(((int) ((fVar3.f4052b / j3) + j4)) * (-1));
                b(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.r(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((v1.i) arrayList.get(i16 - 1)).d(i8) != ((v1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f4052b / j5) + j2 + 2 + (i15 * 2);
        fVar.u(i15);
        fVar.u(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d = ((v1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d != ((v1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.u(d & 255);
            }
        }
        v1.f fVar4 = new v1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d2 = ((v1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d2 != ((v1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((v1.i) arrayList.get(i18)).a()) {
                fVar.u(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.u(((int) ((fVar4.f4052b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                b(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.r(fVar4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress d(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 16;
        byte[] bArr = new byte[16];
        boolean z2 = false;
        int i7 = i;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i2) {
                i3 = i6;
                break;
            }
            if (i8 != i6) {
                int i11 = i7 + 2;
                if (i11 <= i2 && e1.l.f0(str, "::", i7, z2)) {
                    if (i9 == -1) {
                        i8 += 2;
                        if (i11 != i2) {
                            i9 = i8;
                            i10 = i11;
                            i7 = i10;
                            int i12 = 0;
                            while (i7 < i2) {
                            }
                            i5 = i7 - i10;
                            if (i5 == 0) {
                                break;
                            }
                            break;
                        }
                        i3 = i6;
                        i9 = i8;
                        break;
                    }
                    return null;
                }
                if (i8 != 0) {
                    if (!e1.l.f0(str, ":", i7, z2)) {
                        if (e1.l.f0(str, ".", i7, z2)) {
                            int i13 = i8 - 2;
                            int i14 = i13;
                            loop2: while (true) {
                                if (i10 < i2) {
                                    if (i14 == i6) {
                                        break;
                                    }
                                    if (i14 != i13) {
                                        if (str.charAt(i10) != '.') {
                                            break;
                                        }
                                        i10++;
                                    }
                                    ?? r14 = z2;
                                    int i15 = i10;
                                    while (i15 < i2) {
                                        char charAt = str.charAt(i15);
                                        if (X0.d.f(charAt, 48) < 0 || X0.d.f(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i10 != i15) || (i4 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i15++;
                                        r14 = i4;
                                    }
                                    if (i15 - i10 == 0) {
                                        break;
                                    }
                                    bArr[i14] = (byte) r14;
                                    i14++;
                                    i10 = i15;
                                    i6 = 16;
                                    z2 = false;
                                } else if (i14 == i8 + 2) {
                                    i8 += 2;
                                    i3 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i7++;
                }
                i10 = i7;
                i7 = i10;
                int i122 = 0;
                while (i7 < i2) {
                    int p2 = j1.b.p(str.charAt(i7));
                    if (p2 == -1) {
                        break;
                    }
                    i122 = (i122 << 4) + p2;
                    i7++;
                }
                i5 = i7 - i10;
                if (i5 == 0 || i5 > 4) {
                    break;
                }
                int i16 = i8 + 1;
                bArr[i8] = (byte) ((i122 >>> 8) & 255);
                i8 += 2;
                bArr[i16] = (byte) (i122 & 255);
                i6 = 16;
                z2 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static x e(String str) {
        X0.d.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return x.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return x.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return x.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return x.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return x.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static s f(String str) {
        if (str.equals("http/1.0")) {
            return s.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return s.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return s.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return s.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return s.SPDY_3;
        }
        if (str.equals("quic")) {
            return s.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static void g(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static B.d h(String str) {
        int i;
        String str2;
        X0.d.e(str, "statusLine");
        boolean g02 = e1.l.g0(str, "HTTP/1.", false);
        s sVar = s.HTTP_1_0;
        if (g02) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sVar = s.HTTP_1_1;
            }
        } else {
            if (!e1.l.g0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                X0.d.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new B.d(sVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static void i(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            k0.v.b(viewGroup, z2);
        } else if (f2511a) {
            try {
                k0.v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2511a = false;
            }
        }
    }

    public static final String j(String str) {
        X0.d.e(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!e1.d.i0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                X0.d.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                X0.d.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                X0.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (X0.d.f(charAt, 31) <= 0 || X0.d.f(charAt, 127) >= 0 || e1.d.l0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress d = (e1.l.g0(str, "[", false) && str.endsWith("]")) ? d(str, 1, str.length() - 1) : d(str, 0, str.length());
        if (d == null) {
            return null;
        }
        byte[] address = d.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return d.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        v1.f fVar = new v1.f();
        while (i < address.length) {
            if (i == i2) {
                fVar.s(58);
                i += i5;
                if (i == 16) {
                    fVar.s(58);
                }
            } else {
                if (i > 0) {
                    fVar.s(58);
                }
                byte b2 = address[i];
                byte[] bArr = j1.b.f2609a;
                fVar.t(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.l(fVar.f4052b, e1.a.f1917a);
    }

    public abstract List c(List list, String str);
}
