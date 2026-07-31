package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationIncidentReport;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class j7 {
    public static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotImplemented) {
            return "Not implemented by design";
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified)) {
            if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
                return a((AdQualityVerificationState) ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue());
            }
            throw new NoWhenBranchMatchedException();
        }
        return "Not verified by reason: " + ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason().getDescription();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(AdQualityVerificationState adQualityVerificationState) {
        String str;
        if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
            str = "Blocked: " + ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason().getBlockReasons();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.Error) {
            str = "Error occurred during verification: " + ((AdQualityVerificationState.Error) adQualityVerificationState).getError().getDescription();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.NotStarted) {
            str = "Not verification started for the ad object";
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay) {
            str = "Should be blocked on display: " + ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason().getBlockReasons();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.Verified) {
            AdQualityVerificationIncidentReport incidentReport = ((AdQualityVerificationState.Verified) adQualityVerificationState).getIncidentReport();
            if (incidentReport != null) {
                str = "Verified: incident: " + a(incidentReport);
            }
            str = "Verified";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return "Verification Completed. With result: " + str;
    }

    public static String a(AdQualityVerificationIncidentReport adQualityVerificationIncidentReport) {
        return "blockReasons: " + CollectionsKt.joinToString$default(adQualityVerificationIncidentReport.getBlockReasons(), ", ", null, null, 0, null, null, 62, null) + "; reportReasons: " + CollectionsKt.joinToString$default(adQualityVerificationIncidentReport.getReportReasons(), ", ", null, null, 0, null, null, 62, null);
    }
}
