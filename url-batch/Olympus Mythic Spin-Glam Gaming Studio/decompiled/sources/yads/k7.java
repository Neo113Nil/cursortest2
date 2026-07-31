package yads;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes3.dex */
public final class k7 implements AdQualityVerificationStateFlow {
    public final AdQualityVerificationMode a;
    public final AdQualityVerificationError b;
    public final StateFlow c;

    public k7(AdQualityVerificationMode adQualityVerificationMode, AdQualityVerificationError adQualityVerificationError) {
        this.a = adQualityVerificationMode;
        this.b = adQualityVerificationError;
        this.c = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(new AdQualityVerificationState.Blocked(new AdQualityVerificationBlockingReasons(CollectionsKt.listOf((Object[]) new String[]{"Ad is blocked by validation policy", adQualityVerificationError.getDescription()}), CollectionsKt.listOf((Object[]) new String[]{"Ad is blocked by validation policy", adQualityVerificationError.getDescription()})))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.a == k7Var.a && Intrinsics.areEqual(this.b, k7Var.b);
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final AdQualityVerificationMode getVerificationMode() {
        return this.a;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final StateFlow getVerificationResultStateFlow() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdQualityVerificationStateFlowBlockedByPolicy(verificationMode=" + this.a + ", error=" + this.b + ")";
    }
}
