package o;

import java.nio.charset.Charset;

/* renamed from: o.Sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0470Sa {
    public static final Charset a;
    public static volatile Charset b;
    public static volatile Charset c;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC0048Bt.m(forName, "forName(...)");
        a = forName;
        AbstractC0048Bt.m(Charset.forName("UTF-16"), "forName(...)");
        AbstractC0048Bt.m(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC0048Bt.m(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC0048Bt.m(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC0048Bt.m(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
