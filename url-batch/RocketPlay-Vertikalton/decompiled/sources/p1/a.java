package p1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3802a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3803b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3804c;

    static {
        Charset forName = Charset.forName("UTF-8");
        i1.f.d(forName, "forName(...)");
        f3802a = forName;
        i1.f.d(Charset.forName("UTF-16"), "forName(...)");
        i1.f.d(Charset.forName("UTF-16BE"), "forName(...)");
        i1.f.d(Charset.forName("UTF-16LE"), "forName(...)");
        i1.f.d(Charset.forName("US-ASCII"), "forName(...)");
        i1.f.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
