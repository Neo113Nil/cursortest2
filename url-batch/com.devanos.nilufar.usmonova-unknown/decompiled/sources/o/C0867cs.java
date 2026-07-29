package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.cs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867cs {
    public String a;
    public String d;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public C0867cs() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final C0932ds a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String B = C0140Fh.B(0, 0, 7, this.b);
        String B2 = C0140Fh.B(0, 0, 7, this.c);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0140Fh.B(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0786bc.d0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C0140Fh.B(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new C0932ds(str, B, B2, str2, b, arrayList3, arrayList, str4 != null ? C0140Fh.B(0, 0, 7, str4) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        AbstractC0048Bt.k(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x020d, code lost:
    
        if (r9 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r12 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0932ds c0932ds, String str) {
        int i;
        int e;
        int i2;
        char charAt;
        AbstractC0048Bt.n(str, "input");
        byte[] bArr = HY.a;
        int l = HY.l(str, 0, str.length());
        int m = HY.m(str, l, str.length());
        if (m - l >= 2) {
            char charAt2 = str.charAt(l);
            if ((AbstractC0048Bt.t(charAt2, 97) >= 0 && AbstractC0048Bt.t(charAt2, 122) <= 0) || (AbstractC0048Bt.t(charAt2, 65) >= 0 && AbstractC0048Bt.t(charAt2, 90) <= 0)) {
                i = l + 1;
                while (true) {
                    if (i >= m) {
                        break;
                    }
                    char charAt3 = str.charAt(i);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i++;
                    }
                }
            }
        }
        i = -1;
        if (i == -1) {
            if (c0932ds == null) {
                throw new IllegalArgumentException(AbstractC1888sN.s("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? UT.S(6, str).concat("...") : str));
            }
            this.a = c0932ds.a;
        } else if (AbstractC0778bU.A(l, str, "https:", true)) {
            this.a = "https";
            l += 6;
        } else {
            if (!AbstractC0778bU.A(l, str, "http:", true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = str.substring(0, i);
                AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.a = "http";
            l += 5;
        }
        int i3 = 0;
        for (int i4 = l; i4 < m && ((charAt = str.charAt(i4)) == '\\' || charAt == '/'); i4++) {
            i3++;
        }
        ArrayList arrayList = this.f;
        char c = '#';
        if (i3 >= 2 || c0932ds == null || !AbstractC0048Bt.h(c0932ds.a, this.a)) {
            int i5 = l + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                e = HY.e(i5, m, str, "@/\\?#");
                char charAt4 = e != m ? str.charAt(e) : (char) 65535;
                if (charAt4 == 65535 || charAt4 == c || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z) {
                        this.c += "%40" + C0140Fh.t(str, i5, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z = z;
                    } else {
                        boolean z3 = z;
                        int f = HY.f(str, ':', i5, e);
                        String t = C0140Fh.t(str, i5, f, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z2) {
                            t = this.b + "%40" + t;
                        }
                        this.b = t;
                        if (f != e) {
                            this.c = C0140Fh.t(str, f + 1, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z = true;
                        } else {
                            z = z3;
                        }
                        z2 = true;
                    }
                    i5 = e + 1;
                    c = '#';
                }
            }
            int i6 = i5;
            while (true) {
                if (i6 >= e) {
                    i6 = e;
                    break;
                }
                char charAt5 = str.charAt(i6);
                if (charAt5 != '[') {
                    if (charAt5 == ':') {
                        break;
                    }
                } else {
                    do {
                        i6++;
                        if (i6 >= e) {
                            break;
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            int i7 = i6 + 1;
            if (i7 < e) {
                this.d = AbstractC1305jX.K(C0140Fh.B(i5, i6, 4, str));
                try {
                    i2 = Integer.parseInt(C0140Fh.t(str, i7, e, "", 248));
                    if (1 <= i2) {
                    }
                } catch (NumberFormatException unused) {
                }
                i2 = -1;
                this.e = i2;
                if (i2 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String substring2 = str.substring(i7, e);
                    AbstractC0048Bt.m(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.d = AbstractC1305jX.K(C0140Fh.B(i5, i6, 4, str));
                String str2 = this.a;
                AbstractC0048Bt.k(str2);
                this.e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String substring3 = str.substring(i5, i6);
                AbstractC0048Bt.m(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            l = e;
        } else {
            this.b = c0932ds.e();
            this.c = c0932ds.a();
            this.d = c0932ds.d;
            this.e = c0932ds.e;
            arrayList.clear();
            arrayList.addAll(c0932ds.c());
            if (l == m || str.charAt(l) == '#') {
                String d = c0932ds.d();
                this.g = d != null ? C0140Fh.C(C0140Fh.t(d, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int e2 = HY.e(l, m, str, "?#");
        if (l != e2) {
            char charAt6 = str.charAt(l);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                l++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (l < e2) {
                int e3 = HY.e(l, e2, str, "/\\");
                boolean z4 = e3 < e2;
                String t2 = C0140Fh.t(str, l, e3, " \"<>^`{}|/\\?#", 240);
                if (!t2.equals(".") && !t2.equalsIgnoreCase("%2e")) {
                    if (!t2.equals("..") && !t2.equalsIgnoreCase("%2e.") && !t2.equalsIgnoreCase(".%2e") && !t2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, t2);
                        } else {
                            arrayList.add(t2);
                        }
                        if (z4) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                l = z4 ? e3 + 1 : e3;
            }
        }
        if (e2 < m && str.charAt(e2) == '?') {
            int f2 = HY.f(str, '#', e2, m);
            this.g = C0140Fh.C(C0140Fh.t(str, e2 + 1, f2, " \"'<>#", 208));
            e2 = f2;
        }
        if (e2 >= m || str.charAt(e2) != '#') {
            return;
        }
        this.h = C0140Fh.t(str, e2 + 1, m, "", 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (UT.D(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int b = b();
            String str3 = this.a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
            }
            sb.append(':');
            sb.append(b);
        }
        ArrayList arrayList = this.f;
        AbstractC0048Bt.n(arrayList, "<this>");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            AbstractC0048Bt.k(arrayList2);
            C1065ft Y = AbstractC1807r8.Y(AbstractC1807r8.c0(0, arrayList2.size()), 2);
            int i3 = Y.h;
            int i4 = Y.i;
            int i5 = Y.j;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
