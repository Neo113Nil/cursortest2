package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.d f731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f732f;

    public m(q1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f731e = dVar;
        this.f732f = threadPoolExecutor;
    }

    @Override // q1.d
    public final void b0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f732f;
        try {
            this.f731e.b0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.d
    public final void e0(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f732f;
        try {
            this.f731e.e0(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
