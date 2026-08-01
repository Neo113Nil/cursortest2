package o1;

import java.util.concurrent.ScheduledFuture;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287d implements Z, f1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3307a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3308b;

    public /* synthetic */ C0287d(int i, Object obj) {
        this.f3307a = i;
        this.f3308b = obj;
    }

    public final void a(Throwable th) {
        switch (this.f3307a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f3308b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((C) this.f3308b).e();
                break;
            default:
                ((f1.l) this.f3308b).g(th);
                break;
        }
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        switch (this.f3307a) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return U0.i.f870a;
    }

    public final String toString() {
        switch (this.f3307a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f3308b) + ']';
            case 1:
                return "DisposeOnCancel[" + ((C) this.f3308b) + ']';
            default:
                return "InvokeOnCancel[" + ((f1.l) this.f3308b).getClass().getSimpleName() + '@' + AbstractC0302t.e(this) + ']';
        }
    }
}
