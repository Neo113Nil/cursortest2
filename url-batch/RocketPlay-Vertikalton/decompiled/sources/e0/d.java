package e0;

import java.util.concurrent.Executor;
import m.C0293a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2538a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2538a) {
            case 0:
                runnable.run();
                break;
            default:
                C0293a.w().d.f3552e.execute(runnable);
                break;
        }
    }
}
