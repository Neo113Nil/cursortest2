package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ch extends vv {
    public final /* synthetic */ vv l;
    public final /* synthetic */ ThreadPoolExecutor m;

    public ch(vv vvVar, ThreadPoolExecutor threadPoolExecutor) {
        this.l = vvVar;
        this.m = threadPoolExecutor;
    }

    @Override // defpackage.vv
    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.m;
        try {
            this.l.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.vv
    public final void C(oe oeVar) {
        ThreadPoolExecutor threadPoolExecutor = this.m;
        try {
            this.l.C(oeVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
