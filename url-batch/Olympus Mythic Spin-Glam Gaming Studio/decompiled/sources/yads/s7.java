package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s7 implements t7 {
    public final AdQualityVerificationBlockingReasons a;

    public s7(AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
        this.a = adQualityVerificationBlockingReasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7) && Intrinsics.areEqual(this.a, ((s7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdQualityVerifierControllerBlockedResult(reasons=" + this.a + ")";
    }
}
