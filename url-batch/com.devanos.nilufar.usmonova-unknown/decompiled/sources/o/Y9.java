package o;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class Y9 implements SE {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ Y9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC2114vp) this.b).getClass().getSimpleName() + '@' + AbstractC1052fg.B(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC0297Li) this.b) + ']';
        }
    }
}
