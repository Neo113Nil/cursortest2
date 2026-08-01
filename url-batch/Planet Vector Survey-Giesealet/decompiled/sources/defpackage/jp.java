package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jp extends px0 {
    public final /* synthetic */ px0 k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public jp(px0 px0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.k = px0Var;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.px0
    public final void M(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.M(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.px0
    public final void N(k2 k2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.N(k2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
