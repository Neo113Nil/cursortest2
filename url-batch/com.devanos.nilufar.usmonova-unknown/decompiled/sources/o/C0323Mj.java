package o;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: o.Mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323Mj extends AbstractC0868ct {
    public final /* synthetic */ AbstractC0868ct s;
    public final /* synthetic */ ThreadPoolExecutor t;

    public C0323Mj(AbstractC0868ct abstractC0868ct, ThreadPoolExecutor threadPoolExecutor) {
        this.s = abstractC0868ct;
        this.t = threadPoolExecutor;
    }

    @Override // o.AbstractC0868ct
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.t;
        try {
            this.s.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // o.AbstractC0868ct
    public final void P(C1334k c1334k) {
        ThreadPoolExecutor threadPoolExecutor = this.t;
        try {
            this.s.P(c1334k);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
