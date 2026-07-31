package yads;

import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener;
import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes15.dex */
public final class fh2 implements MediatedAdapterPrefetchListener {
    public final /* synthetic */ gh2 a;
    public final /* synthetic */ er1 b;
    public final /* synthetic */ CancellableContinuationImpl c;

    public fh2(gh2 gh2Var, er1 er1Var, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = gh2Var;
        this.b = er1Var;
        this.c = cancellableContinuationImpl;
    }

    @Override // com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener
    public final void onPrefetchFailed(Integer num, String str) {
        dh2 dh2Var = this.a.a;
        ch2 a = dh2.a(this.b.b, str, num);
        if (this.c.isActive()) {
            this.c.resumeWith(Result.m8023constructorimpl(a));
        }
    }

    @Override // com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener
    public final void onPrefetched(MediatedPrefetchAdapterData mediatedPrefetchAdapterData) {
        dh2 dh2Var = this.a.a;
        ch2 ch2Var = new ch2(this.b.b, new kh2(mediatedPrefetchAdapterData.getNetworkWinner().getNetworkName(), mediatedPrefetchAdapterData.getNetworkWinner().getNetworkAdUnit()), new bi2(mediatedPrefetchAdapterData.getRevenue().getValue()), new vh2(yh2.c, null, null), mediatedPrefetchAdapterData.getNetworkAdInfo());
        if (this.c.isActive()) {
            this.c.resumeWith(Result.m8023constructorimpl(ch2Var));
        }
    }
}
