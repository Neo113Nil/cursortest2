package o;

import java.util.concurrent.ScheduledFuture;

/* renamed from: o.Ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271Ki implements InterfaceC0297Li {
    public final ScheduledFuture h;

    public C0271Ki(ScheduledFuture scheduledFuture) {
        this.h = scheduledFuture;
    }

    @Override // o.InterfaceC0297Li
    public final void a() {
        this.h.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.h + ']';
    }
}
