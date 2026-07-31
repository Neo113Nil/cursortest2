package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class B5 implements Runnable {
    public final /* synthetic */ InterfaceC5749ve a;
    public final /* synthetic */ C5 b;

    public B5(C5 c5, InterfaceC5749ve interfaceC5749ve) {
        this.b = c5;
        this.a = interfaceC5749ve;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                C5 c5 = this.b;
                Object obj = c5.a;
                if (obj == null) {
                    c5.b.add(this.a);
                } else {
                    this.a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
