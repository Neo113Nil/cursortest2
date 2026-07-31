package yads;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes15.dex */
public abstract class zt {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName(C.ISO88591_NAME);
    public static final Charset c = Charset.forName("UTF-8");
    public static final Charset d;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName(C.UTF16LE_NAME);
        d = Charset.forName("UTF-16");
    }
}
