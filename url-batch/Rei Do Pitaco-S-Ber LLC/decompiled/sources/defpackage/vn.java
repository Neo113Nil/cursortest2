package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class vn {
    static {
        r8 r8Var = r8.i;
        tg.l("\"\\");
        tg.l("\t ,=");
    }

    public static final boolean a(zz zzVar) {
        if (oo.b((String) zzVar.f.c, "HEAD")) {
            return false;
        }
        int i = zzVar.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && z60.h(zzVar) == -1 && !"chunked".equalsIgnoreCase(zz.m(zzVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0200, code lost:
    
        if (((java.util.regex.Pattern) r9.g).matcher(r0).matches() == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(tg tgVar, xn xnVar, nm nmVar) {
        List list;
        fd fdVar;
        xn xnVar2;
        fd fdVar2;
        String str;
        tgVar.getClass();
        xnVar.getClass();
        nmVar.getClass();
        if (tgVar == tg.h) {
            return;
        }
        Pattern pattern = fd.j;
        int size = nmVar.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(nmVar.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(nmVar.d(i));
            }
        }
        List list2 = uh.f;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            unmodifiableList.getClass();
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = (String) list.get(i2);
            str2.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = z60.a;
            char c = ';';
            int e = z60.e(str2, ';', 0, str2.length());
            char c2 = '=';
            int e2 = z60.e(str2, '=', 0, e);
            if (e2 != e) {
                int k = z60.k(str2, 0, e2);
                String substring = str2.substring(k, z60.l(str2, k, e2));
                if (substring.length() != 0 && z60.j(substring) == -1) {
                    int k2 = z60.k(str2, e2 + 1, e);
                    String substring2 = str2.substring(k2, z60.l(str2, k2, e));
                    if (z60.j(substring2) == -1) {
                        int i3 = e + 1;
                        int length = str2.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long j2 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        long j3 = -1;
                        boolean z4 = true;
                        while (true) {
                            if (i3 < length) {
                                int e3 = z60.e(str2, c, i3, length);
                                int e4 = z60.e(str2, c2, i3, e3);
                                int k3 = z60.k(str2, i3, e4);
                                String substring3 = str2.substring(k3, z60.l(str2, k3, e4));
                                if (e4 < e3) {
                                    int k4 = z60.k(str2, e4 + 1, e3);
                                    str = str2.substring(k4, z60.l(str2, k4, e3));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j2 = vv.D(str, str.length());
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i3 = e3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (substring3.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(str);
                                        j3 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e5) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        compile.getClass();
                                        if (!compile.matcher(str).matches()) {
                                            throw e5;
                                        }
                                        j3 = u30.l0(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                    i3 = e3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (substring3.equalsIgnoreCase("domain")) {
                                        if (str.endsWith(".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String j0 = g8.j0(m30.u0(str, "."));
                                        if (j0 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = j0;
                                        z4 = false;
                                    } else if (substring3.equalsIgnoreCase("path")) {
                                        str4 = str;
                                    } else if (substring3.equalsIgnoreCase("secure")) {
                                        z = true;
                                    } else if (substring3.equalsIgnoreCase("httponly")) {
                                        z2 = true;
                                    }
                                    i3 = e3 + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j3 == Long.MIN_VALUE) {
                                    xnVar2 = xnVar;
                                    j = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j4 = currentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        xnVar2 = xnVar;
                                    } else {
                                        xnVar2 = xnVar;
                                        j = j4;
                                    }
                                } else {
                                    xnVar2 = xnVar;
                                    j = j2;
                                }
                                String str5 = xnVar2.d;
                                if (str3 == null) {
                                    str3 = str5;
                                } else if (!oo.b(str5, str3)) {
                                    if (u30.h0(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                                        gz gzVar = z60.f;
                                        gzVar.getClass();
                                    }
                                    fdVar2 = null;
                                    fdVar = fdVar2;
                                }
                                if (str5.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    if (str4 == null || !u30.l0(str4, "/", false)) {
                                        String b = xnVar2.b();
                                        int t0 = m30.t0(b, '/', 0, 6);
                                        str4 = t0 != 0 ? b.substring(0, t0) : "/";
                                    }
                                    fdVar2 = new fd(substring, substring2, j, str3, str4, z, z2, z3, z4);
                                    fdVar = fdVar2;
                                }
                                fdVar2 = null;
                                fdVar = fdVar2;
                            }
                        }
                    }
                }
            }
            fdVar = null;
            if (fdVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(fdVar);
            }
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        }
        list2.isEmpty();
    }
}
