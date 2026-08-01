package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T.e f832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f833b;

    public m(T.e eVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f832a = eVar;
        this.f833b = threadPoolExecutor;
    }

    @Override // T.e
    public final void G(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f833b;
        try {
            this.f832a.G(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // T.e
    public final void J(v vVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f833b;
        try {
            this.f832a.J(vVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
