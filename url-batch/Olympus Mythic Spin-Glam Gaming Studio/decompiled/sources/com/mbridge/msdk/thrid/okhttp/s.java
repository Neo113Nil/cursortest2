package com.mbridge.msdk.thrid.okhttp;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.B5;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Marker;

/* compiled from: HttpUrl.java */
/* loaded from: classes13.dex */
public final class s {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;
    final String d;
    final int e;
    private final List<String> f;
    private final List<String> g;
    private final String h;
    private final String i;

    /* compiled from: HttpUrl.java */
    public static final class a {
        String a;
        String d;
        final List<String> f;
        List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public a a(int i) {
            if (i > 0 && i <= 65535) {
                this.e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String a = a(str, 0, str.length());
            if (a != null) {
                this.d = a;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a d() {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.set(i, s.a(this.f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.a = "https";
            }
            return this;
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (this.e != -1 || this.a != null) {
                int b = b();
                String str3 = this.a;
                if (str3 == null || b != s.a(str3)) {
                    sb.append(':');
                    sb.append(b);
                }
            }
            s.b(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                s.a(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        private void c() {
            if (!this.f.remove(r0.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
            } else {
                this.f.set(r0.size() - 1, "");
            }
        }

        private static int e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public a a(String str) {
            this.g = str != null ? s.d(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int b() {
            int i = this.e;
            return i != -1 ? i : s.a(this.a);
        }

        private static int b(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(s.a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private static int f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        a a(s sVar, String str) {
            int a;
            int i;
            int b = com.mbridge.msdk.thrid.okhttp.internal.c.b(str, 0, str.length());
            int c = com.mbridge.msdk.thrid.okhttp.internal.c.c(str, b, str.length());
            int e = e(str, b, c);
            if (e != -1) {
                if (str.regionMatches(true, b, "https:", 0, 6)) {
                    this.a = "https";
                    b += 6;
                } else if (str.regionMatches(true, b, "http:", 0, 5)) {
                    this.a = "http";
                    b += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, e) + "'");
                }
            } else if (sVar != null) {
                this.a = sVar.a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int f = f(str, b, c);
            char c2 = '?';
            char c3 = '#';
            if (f < 2 && sVar != null && sVar.a.equals(this.a)) {
                this.b = sVar.f();
                this.c = sVar.b();
                this.d = sVar.d;
                this.e = sVar.e;
                this.f.clear();
                this.f.addAll(sVar.d());
                if (b == c || str.charAt(b) == '#') {
                    a(sVar.e());
                }
            } else {
                boolean z = false;
                boolean z2 = false;
                int i2 = b + f;
                while (true) {
                    a = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i2, c, "@/\\?#");
                    char charAt = a != c ? str.charAt(a) : (char) 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z) {
                            int a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i2, a, ':');
                            i = a;
                            String a3 = s.a(str, i2, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a3 = this.b + "%40" + a3;
                            }
                            this.b = a3;
                            if (a2 != i) {
                                this.c = s.a(str, a2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = a;
                            this.c += "%40" + s.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int c4 = c(str, i2, a);
                int i3 = c4 + 1;
                if (i3 < a) {
                    this.d = a(str, i2, c4);
                    int b2 = b(str, i3, a);
                    this.e = b2;
                    if (b2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, a) + '\"');
                    }
                } else {
                    this.d = a(str, i2, c4);
                    this.e = s.a(this.a);
                }
                if (this.d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, c4) + '\"');
                }
                b = a;
            }
            int a4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, b, c, "?#");
            d(str, b, a4);
            if (a4 < c && str.charAt(a4) == '?') {
                int a5 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, a4, c, '#');
                this.g = s.d(s.a(str, a4 + 1, a5, " \"'<>#", true, false, true, true, null));
                a4 = a5;
            }
            if (a4 < c && str.charAt(a4) == '#') {
                this.h = s.a(str, 1 + a4, c, "", true, false, false, false, null);
            }
            return this;
        }

        private void d(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.f;
                list.set(list.size() - 1, "");
            } else {
                this.f.clear();
                this.f.add("");
                i++;
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i3, i2, "/\\");
                    boolean z = i < i2;
                    a(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String a = s.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (c(a)) {
                return;
            }
            if (d(a)) {
                c();
                return;
            }
            if (this.f.get(r11.size() - 1).isEmpty()) {
                this.f.set(r11.size() - 1, a);
            } else {
                this.f.add(a);
            }
            if (z) {
                this.f.add("");
            }
        }

        private static String a(String str, int i, int i2) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i, i2, false));
        }
    }

    s(a aVar) {
        this.a = aVar.a;
        this.b = a(aVar.b, false);
        this.c = a(aVar.c, false);
        this.d = aVar.d;
        this.e = aVar.b();
        this.f = a(aVar.f, false);
        List<String> list = aVar.g;
        this.g = list != null ? a(list, true) : null;
        String str = aVar.h;
        this.h = str != null ? a(str, false) : null;
        this.i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String b() {
        if (this.c.isEmpty()) {
            return "";
        }
        return this.i.substring(this.i.indexOf(58, this.a.length() + 3) + 1, this.i.indexOf(64));
    }

    public String c() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        return this.i.substring(indexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, indexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        int a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.i, i, a2, '/');
            arrayList.add(this.i.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public String e() {
        if (this.g == null) {
            return null;
        }
        int indexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(indexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).i.equals(this.i);
    }

    public String f() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return this.i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.d;
    }

    public boolean h() {
        return this.a.equals("https");
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = f();
        aVar.c = b();
        aVar.d = this.d;
        aVar.e = this.e != a(this.a) ? this.e : -1;
        aVar.f.clear();
        aVar.f.addAll(d());
        aVar.a(e());
        aVar.h = a();
        return aVar;
    }

    public int j() {
        return this.e;
    }

    public String k() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.g);
        return sb.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.a;
    }

    public URI n() {
        String aVar = i().d().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.i;
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(B5.U);
                sb.append(str2);
            }
        }
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public s e(String str) {
        a c = c(str);
        if (c != null) {
            return c.a();
        }
        return null;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i, i3);
                a(cVar, str, i3, i2, z);
                return cVar.p();
            }
        }
        return str.substring(i, i2);
    }

    static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i + 1));
                int a3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i3));
                if (a2 != -1 && a3 != -1) {
                    cVar.writeByte((a2 << 4) + a3);
                    i = i3;
                }
                cVar.f(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    cVar.writeByte(32);
                }
                cVar.f(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i3)) != -1;
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
            cVar.a(str, i, i3);
            a(cVar, str, i3, i2, str2, z, z2, z3, z4, charset);
            return cVar.p();
        }
        return str.substring(i, i2);
    }

    static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.a(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || a(str, i, i2)))))) {
                    cVar.f(codePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.j)) {
                        cVar2.a(str, i, Character.charCount(codePointAt) + i, charset);
                    } else {
                        cVar2.f(codePointAt);
                    }
                    while (!cVar2.f()) {
                        byte readByte = cVar2.readByte();
                        int i3 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        cVar.writeByte(37);
                        char[] cArr = j;
                        cVar.writeByte((int) cArr[(i3 >> 4) & 15]);
                        cVar.writeByte((int) cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
