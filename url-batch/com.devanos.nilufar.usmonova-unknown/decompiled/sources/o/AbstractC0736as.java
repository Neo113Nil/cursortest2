package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: o.as, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0736as {
    static {
        C1347k9 c1347k9 = C1347k9.k;
        C1097gL.d0("\"\\");
        C1097gL.d0("\t ,=");
    }

    public static final boolean a(C0968eO c0968eO) {
        if (AbstractC0048Bt.h(c0968eO.h.b, "HEAD")) {
            return false;
        }
        int i = c0968eO.k;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && HY.i(c0968eO) == -1 && !"chunked".equalsIgnoreCase(C0968eO.b("Transfer-Encoding", c0968eO))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01ea, code lost:
    
        if (r3.h.matcher(r0).matches() == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(HO ho, C0932ds c0932ds, C1852rr c1852rr) {
        List list;
        int i;
        C0059Ce c0059Ce;
        long j;
        AbstractC0048Bt.n(ho, "<this>");
        AbstractC0048Bt.n(c0932ds, "url");
        AbstractC0048Bt.n(c1852rr, "headers");
        if (ho == HO.n) {
            return;
        }
        Pattern pattern = C0059Ce.j;
        int size = c1852rr.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(c1852rr.k(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c1852rr.m(i3));
            }
        }
        List list2 = C1318jk.h;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC0048Bt.m(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size2) {
            String str = (String) list.get(i4);
            AbstractC0048Bt.n(str, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = HY.a;
            char c = ';';
            int f = HY.f(str, ';', i2, str.length());
            char c2 = '=';
            int f2 = HY.f(str, '=', i2, f);
            if (f2 != f) {
                String x = HY.x(str, i2, f2);
                if (x.length() != 0 && HY.k(x) == -1) {
                    String x2 = HY.x(str, f2 + 1, f);
                    if (HY.k(x2) == -1) {
                        int i5 = f + 1;
                        int length = str.length();
                        int i6 = i2;
                        int i7 = i6;
                        int i8 = i7;
                        long j2 = -1;
                        long j3 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z = true;
                        while (true) {
                            if (i5 < length) {
                                int f3 = HY.f(str, c, i5, length);
                                int f4 = HY.f(str, c2, i5, f3);
                                String x3 = HY.x(str, i5, f4);
                                String x4 = f4 < f3 ? HY.x(str, f4 + 1, f3) : "";
                                if (x3.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = EB.K(x4.length(), x4);
                                        i7 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i5 = f3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (x3.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(x4);
                                        j2 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        AbstractC0048Bt.m(compile, "compile(...)");
                                        if (!compile.matcher(x4).matches()) {
                                            throw e;
                                        }
                                        j2 = AbstractC0778bU.B(x4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i7 = 1;
                                    i5 = f3 + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (x3.equalsIgnoreCase("domain")) {
                                        if (AbstractC0778bU.v(x4, ".", false)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String K = AbstractC1305jX.K(UT.M(x4, "."));
                                        if (K == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str3 = K;
                                        z = false;
                                    } else if (x3.equalsIgnoreCase("path")) {
                                        str2 = x4;
                                    } else if (x3.equalsIgnoreCase("secure")) {
                                        i8 = 1;
                                    } else if (x3.equalsIgnoreCase("httponly")) {
                                        i6 = 1;
                                    }
                                    i5 = f3 + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = currentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    j = (j4 < currentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                } else {
                                    j = j3;
                                }
                                String str4 = c0932ds.d;
                                if (str3 == null) {
                                    str3 = str4;
                                } else if (!AbstractC0048Bt.h(str4, str3)) {
                                    if (AbstractC0778bU.v(str4, str3, false) && str4.charAt((str4.length() - str3.length()) - 1) == '.') {
                                        C0705aN c0705aN = HY.f;
                                        c0705aN.getClass();
                                    }
                                    i = 0;
                                }
                                if (str4.length() == str3.length() || PublicSuffixDatabase.g.a(str3) != null) {
                                    String str5 = "/";
                                    i = 0;
                                    if (str2 == null || !AbstractC0778bU.B(str2, "/", false)) {
                                        String b = c0932ds.b();
                                        int K2 = UT.K(b, '/', 0, 6);
                                        if (K2 != 0) {
                                            str5 = b.substring(0, K2);
                                            AbstractC0048Bt.m(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str2 = str5;
                                    }
                                    c0059Ce = new C0059Ce(x, x2, j, str3, str2, i8, i6, i7, z);
                                }
                                i = 0;
                            }
                        }
                    }
                }
            }
            i = i2;
            c0059Ce = null;
            if (c0059Ce != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c0059Ce);
            }
            i4++;
            i2 = i;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            AbstractC0048Bt.m(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
