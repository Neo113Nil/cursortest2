package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5194a3 implements BiConsumer {
    public final /* synthetic */ C5220b3 a;

    public C5194a3(C5220b3 c5220b3) {
        this.a = c5220b3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.a) {
            try {
                C5220b3 c5220b3 = this.a;
                c5220b3.b = intent;
                Iterator it = c5220b3.a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
