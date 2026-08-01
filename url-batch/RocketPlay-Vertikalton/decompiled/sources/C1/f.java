package C1;

import K1.i;
import a1.AbstractC0067d;
import c1.AbstractC0104b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import x1.j;
import x1.l;
import x1.s;

/* loaded from: classes.dex */
public abstract class f {
    static {
        i iVar = i.d;
        M0.e.h("\"\\");
        M0.e.h("\t ,=");
    }

    public static final boolean a(s sVar) {
        if (i1.f.a((String) sVar.f4600a.f546b, "HEAD")) {
            return false;
        }
        int i = sVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && y1.b.i(sVar) == -1 && !"chunked".equalsIgnoreCase(s.a("Transfer-Encoding", sVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01eb, code lost:
    
        if (((java.util.regex.Pattern) r3.f3051b).matcher(r0).matches() == false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023b  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(x1.b bVar, l lVar, j jVar) {
        List list;
        x1.h hVar;
        String str;
        int i = 1;
        i1.f.e(bVar, "<this>");
        i1.f.e(lVar, "url");
        i1.f.e(jVar, "headers");
        if (bVar == x1.b.f4475b) {
            return;
        }
        Pattern pattern = x1.h.f4513j;
        int size = jVar.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(jVar.b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(jVar.d(i3));
            }
        }
        List list2 = W0.s.f1284a;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            i1.f.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size2; i4++) {
            String str2 = (String) list.get(i4);
            i1.f.e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = y1.b.f4648a;
            char c2 = ';';
            int e2 = y1.b.e(str2, ';', i2, str2.length());
            char c3 = '=';
            int e3 = y1.b.e(str2, '=', i2, e2);
            if (e3 != e2) {
                String x2 = y1.b.x(str2, i2, e3);
                if (x2.length() != 0 && y1.b.k(x2) == -1) {
                    String x3 = y1.b.x(str2, e3 + i, e2);
                    if (y1.b.k(x3) == -1) {
                        int i5 = e2 + i;
                        int length = str2.length();
                        long j2 = 253402300799999L;
                        boolean z2 = i;
                        long j3 = 253402300799999L;
                        String str3 = null;
                        long j4 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = 0;
                        String str4 = null;
                        while (true) {
                            if (i5 < length) {
                                int e4 = y1.b.e(str2, c2, i5, length);
                                int e5 = y1.b.e(str2, c3, i5, e4);
                                String x4 = y1.b.x(str2, i5, e5);
                                String x5 = e5 < e4 ? y1.b.x(str2, e5 + i, e4) : "";
                                if (x4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = AbstractC0104b.t(x5, x5.length());
                                        z5 = i;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (x4.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(x5);
                                        j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e6) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        i1.f.d(compile, "compile(...)");
                                        if (!compile.matcher(x5).matches()) {
                                            throw e6;
                                        }
                                        j4 = p1.l.J(x5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i = 1;
                                    z5 = 1;
                                } else if (!x4.equalsIgnoreCase("domain")) {
                                    if (x4.equalsIgnoreCase("path")) {
                                        str4 = x5;
                                    } else if (x4.equalsIgnoreCase("secure")) {
                                        i = 1;
                                        z3 = true;
                                    } else if (x4.equalsIgnoreCase("httponly")) {
                                        i = 1;
                                        z4 = true;
                                    }
                                    i = 1;
                                } else {
                                    if (p1.l.E(x5, ".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String v2 = AbstractC0067d.v(p1.d.V(x5, "."));
                                    if (v2 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str3 = v2;
                                    i = 1;
                                    z2 = 0;
                                }
                                i5 = e4 + 1;
                                c2 = ';';
                                c3 = '=';
                                z5 = z5;
                                z2 = z2;
                            } else {
                                if (j4 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j4 != -1) {
                                    long j5 = currentTimeMillis + (j4 <= 9223372036854775L ? j4 * 1000 : Long.MAX_VALUE);
                                    if (j5 >= currentTimeMillis && j5 <= 253402300799999L) {
                                        j2 = j5;
                                    }
                                } else {
                                    j2 = j3;
                                }
                                String str5 = lVar.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!i1.f.a(str5, str3)) {
                                    if (p1.l.E(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        i1.i iVar = y1.b.f4652f;
                                        iVar.getClass();
                                    }
                                    i2 = 0;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.f3717g.a(str3) != null) {
                                    String str6 = "/";
                                    String str7 = str4;
                                    i2 = 0;
                                    if (str7 == null || !p1.l.J(str7, "/", false)) {
                                        String b2 = lVar.b();
                                        int T2 = p1.d.T(b2, '/', 0, 6);
                                        if (T2 != 0) {
                                            str6 = b2.substring(0, T2);
                                            i1.f.d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str6;
                                    } else {
                                        str = str7;
                                    }
                                    hVar = new x1.h(x2, x3, j2, str3, str, z3, z4, z5, z2);
                                }
                            }
                        }
                    }
                }
                hVar = null;
                i2 = 0;
                if (hVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(hVar);
                }
                i = 1;
            }
            hVar = null;
            if (hVar != null) {
            }
            i = 1;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            i1.f.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
