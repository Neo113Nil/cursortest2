package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import kotlin.random.Random;

/* loaded from: classes4.dex */
public final class w7 {
    public final g7 a;

    public w7(g7 g7Var) {
        this.a = g7Var;
    }

    public final AdQualityVerificationResult.NotVerified a(AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration) {
        v7 v7Var = (v7) this.a.d.get(adQualityVerificationAdConfiguration.getVerifiableAdNetwork());
        int i = v7Var != null ? v7Var.a : this.a.a;
        boolean z = true;
        boolean z2 = v7Var != null ? !v7Var.b : this.a.b;
        if (!this.a.e.contains(adQualityVerificationAdConfiguration.getAdUnitId()) && !this.a.e.isEmpty()) {
            z = false;
        }
        if (!z2 || !z) {
            return new AdQualityVerificationResult.NotVerified(AdQualityVerificationError.DisabledError.INSTANCE);
        }
        if (Random.Default.nextInt(0, 100) < i) {
            return null;
        }
        return new AdQualityVerificationResult.NotVerified(AdQualityVerificationError.LowUsagePercent.INSTANCE);
    }
}
