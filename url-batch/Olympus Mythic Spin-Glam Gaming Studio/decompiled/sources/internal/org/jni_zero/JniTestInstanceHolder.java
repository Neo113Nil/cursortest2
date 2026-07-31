package internal.org.jni_zero;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public class JniTestInstanceHolder {
    static ArrayList sAllOverrides;
    public Object value;

    private JniTestInstanceHolder() {
    }

    public static synchronized JniTestInstanceHolder create() {
        JniTestInstanceHolder jniTestInstanceHolder;
        synchronized (JniTestInstanceHolder.class) {
            try {
                if (sAllOverrides == null) {
                    sAllOverrides = new ArrayList();
                }
                jniTestInstanceHolder = new JniTestInstanceHolder();
                sAllOverrides.add(jniTestInstanceHolder);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jniTestInstanceHolder;
    }
}
