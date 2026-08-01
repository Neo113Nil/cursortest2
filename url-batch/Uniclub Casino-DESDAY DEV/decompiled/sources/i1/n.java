package i1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f2461j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f2462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2463b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2464c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2465e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2466f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2467g;
    public final String h;
    public final boolean i;

    public n(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        X0.d.e(str, "scheme");
        X0.d.e(str4, "host");
        this.f2462a = str;
        this.f2463b = str2;
        this.f2464c = str3;
        this.d = str4;
        this.f2465e = i;
        this.f2466f = arrayList2;
        this.f2467g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f2464c.length() == 0) {
            return "";
        }
        int length = this.f2462a.length() + 3;
        String str = this.h;
        String substring = str.substring(e1.d.l0(str, ':', length, false, 4) + 1, e1.d.l0(str, '@', 0, false, 6));
        X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f2462a.length() + 3;
        String str = this.h;
        int l02 = e1.d.l0(str, '/', length, false, 4);
        String substring = str.substring(l02, j1.b.e(str, "?#", l02, str.length()));
        X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f2462a.length() + 3;
        String str = this.h;
        int l02 = e1.d.l0(str, '/', length, false, 4);
        int e2 = j1.b.e(str, "?#", l02, str.length());
        ArrayList arrayList = new ArrayList();
        while (l02 < e2) {
            int i = l02 + 1;
            int d = j1.b.d(str, '/', i, e2);
            String substring = str.substring(i, d);
            X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            l02 = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2466f == null) {
            return null;
        }
        String str = this.h;
        int l02 = e1.d.l0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(l02, j1.b.d(str, '#', l02, str.length()));
        X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f2463b.length() == 0) {
            return "";
        }
        int length = this.f2462a.length() + 3;
        String str = this.h;
        String substring = str.substring(length, j1.b.e(str, ":@", length, str.length()));
        X0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && X0.d.a(((n) obj).h, this.h);
    }

    public final String f() {
        m mVar;
        try {
            mVar = new m();
            mVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        X0.d.b(mVar);
        mVar.f2456b = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        mVar.f2457c = b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return mVar.a().h;
    }

    public final URI g() {
        String substring;
        String str;
        m mVar = new m();
        String str2 = this.f2462a;
        mVar.f2455a = str2;
        mVar.f2456b = e();
        mVar.f2457c = a();
        mVar.d = this.d;
        X0.d.e(str2, "scheme");
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i2 = this.f2465e;
        mVar.f2458e = i2 != i ? i2 : -1;
        ArrayList arrayList = mVar.f2459f;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        mVar.f2460g = d != null ? b.f(b.b(d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f2467g == null) {
            substring = null;
        } else {
            String str3 = this.h;
            substring = str3.substring(e1.d.l0(str3, '#', 0, false, 6) + 1);
            X0.d.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        mVar.h = substring;
        String str4 = mVar.d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            X0.d.d(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll("");
            X0.d.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        mVar.d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, b.b((String) arrayList.get(i3), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = mVar.f2460g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? b.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str6 = mVar.h;
        mVar.h = str6 != null ? b.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String mVar2 = mVar.toString();
        try {
            return new URI(mVar2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                X0.d.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(mVar2).replaceAll("");
                X0.d.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                X0.d.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
