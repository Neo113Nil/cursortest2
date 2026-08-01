package e0;

import java.util.concurrent.Executor;
import m.C0251a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2117a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2117a) {
            case 0:
                runnable.run();
                break;
            default:
                C0251a.s().f3121g.h.execute(runnable);
                break;
        }
    }
}
