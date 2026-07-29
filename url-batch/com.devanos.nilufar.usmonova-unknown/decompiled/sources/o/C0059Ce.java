package o;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: o.Ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059Ce {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C0059Ce(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0059Ce)) {
            return false;
        }
        C0059Ce c0059Ce = (C0059Ce) obj;
        return AbstractC0048Bt.h(c0059Ce.a, this.a) && AbstractC0048Bt.h(c0059Ce.b, this.b) && c0059Ce.c == this.c && AbstractC0048Bt.h(c0059Ce.d, this.d) && AbstractC0048Bt.h(c0059Ce.e, this.e) && c0059Ce.f == this.f && c0059Ce.g == this.g && c0059Ce.h == this.h && c0059Ce.i == this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.c) + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) AbstractC0921dg.a.get()).format(new Date(j2));
                AbstractC0048Bt.m(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "toString()");
        return sb2;
    }
}
