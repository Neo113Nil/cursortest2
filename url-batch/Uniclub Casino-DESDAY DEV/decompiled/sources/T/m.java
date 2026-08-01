package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.l f735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f736b;

    public m(q1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f735a = lVar;
        this.f736b = threadPoolExecutor;
    }

    @Override // q1.l
    public final void b0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f736b;
        try {
            this.f735a.b0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.l
    public final void g0(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f736b;
        try {
            this.f735a.g0(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
