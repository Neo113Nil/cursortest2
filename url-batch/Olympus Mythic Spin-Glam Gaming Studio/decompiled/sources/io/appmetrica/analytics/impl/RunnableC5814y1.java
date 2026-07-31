package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5814y1 implements Runnable {
    public final /* synthetic */ Context a;

    public RunnableC5814y1(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5340fk c5340fk = Dj.a;
        Context context = this.a;
        synchronized (c5340fk) {
            try {
                if (c5340fk.b == null) {
                    c5340fk.b = Ai.a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = c5340fk.a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5486lb) it.next()).a(c5340fk.b);
                    }
                    c5340fk.a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
