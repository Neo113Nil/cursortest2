package o;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class Y8 {
    public static InputStream a(String str) {
        AbstractC0048Bt.n(str, "path");
        ClassLoader classLoader = Y8.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
