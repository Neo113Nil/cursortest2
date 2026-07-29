package o;

import android.os.Trace;

/* renamed from: o.Nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0349Nj implements Runnable {
    public final /* synthetic */ int h = 0;

    public /* synthetic */ RunnableC0349Nj() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                try {
                    int i = AbstractC1502mW.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C0272Kj.k != null) {
                        C0272Kj.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = AbstractC1502mW.a;
                    Trace.endSection();
                    throw th;
                }
            default:
                throw null;
        }
    }

    public RunnableC0349Nj(AbstractBinderC1933t20 abstractBinderC1933t20) {
    }
}
