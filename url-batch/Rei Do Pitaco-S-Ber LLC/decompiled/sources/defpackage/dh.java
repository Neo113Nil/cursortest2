package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class dh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = u50.b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (ah.k != null) {
                ah.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = u50.b;
            Trace.endSection();
            throw th;
        }
    }
}
