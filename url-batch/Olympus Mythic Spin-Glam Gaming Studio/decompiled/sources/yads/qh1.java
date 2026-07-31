package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class qh1 {
    public final Context a;
    public final AtomicBoolean b = new AtomicBoolean();

    public qh1(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a() {
        if (!pa.a(this.a) || q63.a() || this.b.getAndSet(true)) {
            return;
        }
        ab1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
    }
}
