package yads;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class v6 implements AdQualityVerificationStateFlow {
    public final AdQualityVerificationMode a = AdQualityVerificationMode.LONG_VERIFICATION;
    public final MutableStateFlow b;

    public v6(MutableStateFlow mutableStateFlow) {
        Intrinsics.checkNotNull(mutableStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.monetization.ads.quality.base.state.AdQualityVerificationState>");
        this.b = mutableStateFlow;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final AdQualityVerificationMode getVerificationMode() {
        return this.a;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final StateFlow getVerificationResultStateFlow() {
        return this.b;
    }
}
