package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kp implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = sw0.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (gp.k != null) {
                gp.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = sw0.a;
            Trace.endSection();
            throw th;
        }
    }
}
