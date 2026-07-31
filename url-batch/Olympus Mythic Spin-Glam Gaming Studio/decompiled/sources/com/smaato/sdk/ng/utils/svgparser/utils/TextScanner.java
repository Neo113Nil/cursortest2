package com.smaato.sdk.ng.utils.svgparser.utils;

import com.smaato.sdk.ng.utils.svgparser.utils.SVGBase;
import java.util.Locale;

/* loaded from: classes11.dex */
public class TextScanner {
    final String a;
    int c;
    int b = 0;
    private final b d = new b();

    public TextScanner(String str) {
        String trim = str.trim();
        this.a = trim;
        this.c = trim.length();
    }

    boolean a(int i) {
        return i == 10 || i == 13;
    }

    boolean b(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    boolean c() {
        int i = this.b;
        if (i == this.c) {
            return false;
        }
        char charAt = this.a.charAt(i);
        if (charAt < 'a' || charAt > 'z') {
            return charAt >= 'A' && charAt <= 'Z';
        }
        return true;
    }

    public boolean consume(char c) {
        int i = this.b;
        boolean z = i < this.c && this.a.charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    Integer d() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = this.a;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    Boolean e() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char charAt = this.a.charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(charAt == '1');
    }

    public boolean empty() {
        return this.b == this.c;
    }

    String f() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        int charAt = this.a.charAt(i);
        while (true) {
            if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                break;
            }
            charAt = a();
        }
        int i2 = this.b;
        while (b(charAt)) {
            charAt = a();
        }
        if (charAt == 40) {
            this.b++;
            return this.a.substring(i, i2);
        }
        this.b = i;
        return null;
    }

    SVGBase.Length g() {
        float nextFloat = nextFloat();
        if (Float.isNaN(nextFloat)) {
            return null;
        }
        SVGBase.S h = h();
        return h == null ? new SVGBase.Length(nextFloat, SVGBase.S.px) : new SVGBase.Length(nextFloat, h);
    }

    SVGBase.S h() {
        if (empty()) {
            return null;
        }
        if (this.a.charAt(this.b) == '%') {
            this.b++;
            return SVGBase.S.percent;
        }
        int i = this.b;
        if (i > this.c - 2) {
            return null;
        }
        try {
            SVGBase.S valueOf = SVGBase.S.valueOf(this.a.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return valueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    float i() {
        skipCommaWhitespace();
        float a = this.d.a(this.a, this.b, this.c);
        if (!Float.isNaN(a)) {
            this.b = this.d.a();
        }
        return a;
    }

    String j() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        this.b = this.c;
        return this.a.substring(i);
    }

    public float nextFloat() {
        float a = this.d.a(this.a, this.b, this.c);
        if (!Float.isNaN(a)) {
            this.b = this.d.a();
        }
        return a;
    }

    public String nextQuotedString() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        char charAt = this.a.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int a = a();
        while (a != -1 && a != charAt) {
            a = a();
        }
        if (a == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return this.a.substring(i + 1, i2);
    }

    public String nextToken() {
        return a(' ', false);
    }

    public String nextWord() {
        if (empty()) {
            return null;
        }
        int i = this.b;
        char charAt = this.a.charAt(i);
        if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
            this.b = i;
            return null;
        }
        int a = a();
        while (true) {
            if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                break;
            }
            a = a();
        }
        return this.a.substring(i, this.b);
    }

    public boolean skipCommaWhitespace() {
        skipWhitespace();
        int i = this.b;
        if (i == this.c || this.a.charAt(i) != ',') {
            return false;
        }
        this.b++;
        skipWhitespace();
        return true;
    }

    public void skipWhitespace() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !b(this.a.charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    float a(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        skipCommaWhitespace();
        return nextFloat();
    }

    String b() {
        int i = this.b;
        while (!empty() && !b(this.a.charAt(this.b))) {
            this.b++;
        }
        String substring = this.a.substring(i, this.b);
        this.b = i;
        return substring;
    }

    public String nextToken(char c) {
        return a(c, false);
    }

    public boolean consume(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    float a(Boolean bool) {
        if (bool == null) {
            return Float.NaN;
        }
        skipCommaWhitespace();
        return nextFloat();
    }

    Integer a(boolean z) {
        a a = a.a(this.a, this.b, this.c, z);
        if (a == null) {
            return null;
        }
        this.b = a.a();
        return Integer.valueOf(a.b());
    }

    Boolean a(Object obj) {
        if (obj == null) {
            return null;
        }
        skipCommaWhitespace();
        return e();
    }

    int a() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return this.a.charAt(i3);
        }
        return -1;
    }

    String a(char c) {
        return a(c, true);
    }

    String a(char c, boolean z) {
        if (empty()) {
            return null;
        }
        char charAt = this.a.charAt(this.b);
        if ((!z && b(charAt)) || charAt == c) {
            return null;
        }
        int i = this.b;
        int a = a();
        while (a != -1 && a != c && (z || !b(a))) {
            a = a();
        }
        return this.a.substring(i, this.b);
    }
}
