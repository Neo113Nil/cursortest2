package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends F1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F1.l f1190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1191f;

    public m(F1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1190e = lVar;
        this.f1191f = threadPoolExecutor;
    }

    @Override // F1.l
    public final void W(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1191f;
        try {
            this.f1190e.W(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // F1.l
    public final void X(v vVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1191f;
        try {
            this.f1190e.X(vVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
