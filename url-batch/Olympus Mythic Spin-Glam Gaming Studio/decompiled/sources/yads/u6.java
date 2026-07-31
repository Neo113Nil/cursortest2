package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;

/* loaded from: classes4.dex */
public final class u6 implements y7 {
    @Override // yads.y7
    public final Object a(Context context, Object obj, t8 t8Var, v3 v3Var, String str, MediatedAdObjectInfo mediatedAdObjectInfo, q7 q7Var) {
        return AdQualityVerificationResult.NotImplemented.INSTANCE;
    }

    @Override // yads.y7
    public final void onAdClicked() {
    }

    @Override // yads.y7
    public final void onAdClosed() {
    }

    @Override // yads.y7
    public final void onAdDisplayed() {
    }

    @Override // yads.y7
    public final void onInvalidated() {
    }
}
