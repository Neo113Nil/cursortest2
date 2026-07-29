package o;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: o.ds, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932ds {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    public C0932ds(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC0048Bt.n(str, "scheme");
        AbstractC0048Bt.n(str4, "host");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String substring = str.substring(UT.H(str, ':', length, 4) + 1, UT.H(str, '@', 0, 6));
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int H = UT.H(str, '/', length, 4);
        String substring = str.substring(H, HY.e(H, str.length(), str, "?#"));
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int H = UT.H(str, '/', length, 4);
        int e = HY.e(H, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (H < e) {
            int i = H + 1;
            int f = HY.f(str, '/', i, e);
            String substring = str.substring(i, f);
            AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            H = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int H = UT.H(str, '?', 0, 6) + 1;
        String substring = str.substring(H, HY.f(str, '#', H, str.length()));
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String substring = str.substring(length, HY.e(length, str.length(), str, ":@"));
        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0932ds) && AbstractC0048Bt.h(((C0932ds) obj).i, this.i);
    }

    public final C0867cs f(String str) {
        AbstractC0048Bt.n(str, "link");
        try {
            C0867cs c0867cs = new C0867cs();
            c0867cs.c(this, str);
            return c0867cs;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        C0867cs f = f("/...");
        AbstractC0048Bt.k(f);
        f.b = C0140Fh.t("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        f.c = C0140Fh.t("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return f.a().i;
    }

    public final URI h() {
        String substring;
        String str;
        C0867cs c0867cs = new C0867cs();
        String str2 = this.a;
        c0867cs.a = str2;
        c0867cs.b = e();
        c0867cs.c = a();
        c0867cs.d = this.d;
        AbstractC0048Bt.n(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.e;
        c0867cs.e = i2 != i ? i2 : -1;
        ArrayList arrayList = c0867cs.f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        c0867cs.g = d != null ? C0140Fh.C(C0140Fh.t(d, 0, 0, " \"'<>#", 211)) : null;
        if (this.h == null) {
            substring = null;
        } else {
            String str3 = this.i;
            substring = str3.substring(UT.H(str3, '#', 0, 6) + 1);
            AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
        }
        c0867cs.h = substring;
        String str4 = c0867cs.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            AbstractC0048Bt.m(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            AbstractC0048Bt.m(str, "replaceAll(...)");
        } else {
            str = null;
        }
        c0867cs.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C0140Fh.t((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = c0867cs.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? C0140Fh.t(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = c0867cs.h;
        c0867cs.h = str6 != null ? C0140Fh.t(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String c0867cs2 = c0867cs.toString();
        try {
            return new URI(c0867cs2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC0048Bt.m(compile2, "compile(...)");
                String replaceAll = compile2.matcher(c0867cs2).replaceAll("");
                AbstractC0048Bt.m(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                AbstractC0048Bt.m(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
