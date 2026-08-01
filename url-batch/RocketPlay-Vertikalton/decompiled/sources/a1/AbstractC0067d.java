package a1;

import U.g;
import W0.s;
import Z0.i;
import Z0.j;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import androidx.room.t;
import b1.AbstractC0092a;
import b1.AbstractC0094c;
import c1.AbstractC0104b;
import g0.AbstractC0139I;
import g0.V;
import h1.p;
import i1.f;
import j0.InterfaceC0178a;
import j0.InterfaceC0181d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l.N0;
import o0.v;
import p1.l;
import q1.AbstractC0352s;
import q1.C0344j;
import q1.I;
import q1.J;
import u1.q;
import x1.n;
import x1.u;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0067d {

    /* renamed from: a, reason: collision with root package name */
    public static long f1638a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1639b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1640c = true;

    public static void a(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new m1.c(2, 36, 1));
        }
    }

    public static int b(V v2, g gVar, View view, View view2, AbstractC0139I abstractC0139I, boolean z2) {
        if (abstractC0139I.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0139I.H(view) - AbstractC0139I.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int c(V v2, g gVar, View view, View view2, AbstractC0139I abstractC0139I, boolean z2, boolean z3) {
        if (abstractC0139I.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (v2.b() - Math.max(AbstractC0139I.H(view), AbstractC0139I.H(view2))) - 1) : Math.max(0, Math.min(AbstractC0139I.H(view), AbstractC0139I.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC0139I.H(view) - AbstractC0139I.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int d(V v2, g gVar, View view, View view2, AbstractC0139I abstractC0139I, boolean z2) {
        if (abstractC0139I.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return v2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC0139I.H(view) - AbstractC0139I.H(view2)) + 1)) * v2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Z0.d e(Z0.d dVar, Z0.d dVar2, p pVar) {
        f.e(pVar, "<this>");
        if (pVar instanceof AbstractC0092a) {
            return ((AbstractC0092a) pVar).create(dVar, dVar2);
        }
        i context = dVar2.getContext();
        return context == j.f1558a ? new C0065b(dVar2, dVar, pVar) : new C0066c(dVar2, context, pVar, dVar);
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
    public static final InetAddress f(String str, int i, int i2) {
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
                if (i11 <= i2 && l.I(str, "::", i7, z2)) {
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
                    if (!l.I(str, ":", i7, z2)) {
                        if (l.I(str, ".", i7, z2)) {
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
                                        if (f.f(charAt, 48) < 0 || f.f(charAt, 57) > 0) {
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
                    int p2 = y1.b.p(str.charAt(i7));
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

    public static final boolean g(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View h(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x1.i i(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = s.f1284a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        x1.f c2 = x1.f.f4491b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        u k2 = AbstractC0104b.k(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = y1.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = y1.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new x1.i(k2, c2, list2, new K(3, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new x1.i(k2, c2, list2, new K(3, list));
    }

    public static n j(String str) {
        f.e(str, "<this>");
        Matcher matcher = n.f4540c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        f.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        f.d(locale, "US");
        f.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        f.d(group2, "typeSubtype.group(2)");
        f.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = n.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                f.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (l.J(group4, "'", false) && l.E(group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    f.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new n(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static Drawable k(Context context, int i) {
        return N0.b().c(context, i);
    }

    public static k0.c l(k0.d dVar, SQLiteDatabase sQLiteDatabase) {
        f.e(dVar, "refHolder");
        f.e(sQLiteDatabase, "sqLiteDatabase");
        k0.c cVar = dVar.f3261a;
        if (cVar != null && f.a(cVar.f3260a, sQLiteDatabase)) {
            return cVar;
        }
        k0.c cVar2 = new k0.c(sQLiteDatabase);
        dVar.f3261a = cVar2;
        return cVar2;
    }

    public static Z0.d m(Z0.d dVar) {
        Z0.d intercepted;
        f.e(dVar, "<this>");
        AbstractC0094c abstractC0094c = dVar instanceof AbstractC0094c ? (AbstractC0094c) dVar : null;
        return (abstractC0094c == null || (intercepted = abstractC0094c.intercepted()) == null) ? dVar : intercepted;
    }

    public static boolean n() {
        boolean isEnabled;
        try {
            if (f1639b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1639b == null) {
                f1638a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1639b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1639b.invoke(null, Long.valueOf(f1638a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static String p(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        K1.i iVar = K1.i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        f.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        F1.d.p(encoded.length, 0, length);
        F1.d.s(length, encoded.length);
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        f.d(copyOfRange, "copyOfRange(...)");
        K1.i iVar2 = new K1.i(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        f.b(digest);
        new K1.i(digest);
        byte[] bArr = K1.a.f732a;
        f.e(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b2 = digest[i];
            int i3 = i + 2;
            byte b3 = digest[i + 1];
            i += 3;
            byte b4 = digest[i3];
            bArr2[i2] = bArr[(b2 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[1 + i2] = bArr[(b5 & 3) << 4];
            bArr2[2 + i2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b6 = digest[i];
            byte b7 = digest[i5];
            bArr2[i2] = bArr[(b6 & 255) >> 2];
            bArr2[1 + i2] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, p1.a.f3802a));
        return sb.toString();
    }

    public static final Cursor q(t tVar, InterfaceC0181d interfaceC0181d) {
        f.e(tVar, "db");
        f.e(interfaceC0181d, "sqLiteQuery");
        return tVar.query(interfaceC0181d, (CancellationSignal) null);
    }

    public static final List r(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        X0.c cVar = new X0.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            f.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            f.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new h0.c(i, i2, string, string2));
        }
        X0.c b2 = F1.l.b(cVar);
        f.e(b2, "<this>");
        if (b2.a() <= 1) {
            return W0.j.z0(b2);
        }
        Object[] array = b2.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return W0.i.r0(array);
    }

    public static final h0.d s(InterfaceC0178a interfaceC0178a, String str, boolean z2) {
        Cursor t2 = interfaceC0178a.t("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = t2.getColumnIndex("seqno");
            int columnIndex2 = t2.getColumnIndex("cid");
            int columnIndex3 = t2.getColumnIndex("name");
            int columnIndex4 = t2.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (t2.moveToNext()) {
                    if (t2.getInt(columnIndex2) >= 0) {
                        int i = t2.getInt(columnIndex);
                        String string = t2.getString(columnIndex3);
                        String str2 = t2.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        f.d(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                f.d(values, "columnsMap.values");
                List z02 = W0.j.z0(values);
                Collection values2 = treeMap2.values();
                f.d(values2, "ordersMap.values");
                h0.d dVar = new h0.d(str, z2, z02, W0.j.z0(values2));
                AbstractC0104b.g(t2, null);
                return dVar;
            }
            AbstractC0104b.g(t2, null);
            return null;
        } finally {
        }
    }

    public static final Object t(q qVar, q qVar2, androidx.room.c cVar) {
        Object c0344j;
        Object z2;
        I i;
        try {
            i1.l.a(cVar);
            c0344j = cVar.d(qVar2, qVar);
        } catch (Throwable th) {
            c0344j = new C0344j(th, false);
        }
        EnumC0064a enumC0064a = EnumC0064a.f1630a;
        if (c0344j == enumC0064a || (z2 = qVar.z(c0344j)) == AbstractC0352s.f3916c) {
            return enumC0064a;
        }
        if (z2 instanceof C0344j) {
            throw ((C0344j) z2).f3903a;
        }
        J j2 = z2 instanceof J ? (J) z2 : null;
        return (j2 == null || (i = j2.f3868a) == null) ? z2 : i;
    }

    public static void u(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f1640c) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f1640c = false;
            }
        }
    }

    public static final String v(String str) {
        f.e(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!p1.d.L(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                f.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                f.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (f.f(charAt, 31) <= 0 || f.f(charAt, 127) >= 0 || p1.d.P(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress f2 = (l.J(str, "[", false) && l.E(str, "]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (f2 == null) {
            return null;
        }
        byte[] address = f2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return f2.getHostAddress();
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
        K1.f fVar = new K1.f();
        while (i < address.length) {
            if (i == i2) {
                fVar.M(58);
                i += i5;
                if (i == 16) {
                    fVar.M(58);
                }
            } else {
                if (i > 0) {
                    fVar.M(58);
                }
                byte b2 = address[i];
                byte[] bArr = y1.b.f4648a;
                fVar.N(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.F(fVar.f746b, p1.a.f3802a);
    }

    public abstract Object o(Intent intent, int i);
}
