package x1;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4540c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f4541a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4542b;

    public n(String str, String[] strArr) {
        this.f4541a = str;
        this.f4542b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && i1.f.a(((n) obj).f4541a, this.f4541a);
    }

    public final int hashCode() {
        return this.f4541a.hashCode();
    }

    public final String toString() {
        return this.f4541a;
    }
}
