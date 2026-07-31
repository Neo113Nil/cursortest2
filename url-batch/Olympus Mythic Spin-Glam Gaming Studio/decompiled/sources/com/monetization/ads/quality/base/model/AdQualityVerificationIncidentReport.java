package com.monetization.ads.quality.base.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationIncidentReport;", "", "blockReasons", "", "", "reportReasons", "(Ljava/util/List;Ljava/util/List;)V", "getBlockReasons", "()Ljava/util/List;", "getReportReasons", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdQualityVerificationIncidentReport {

    @NotNull
    private final List<String> blockReasons;

    @NotNull
    private final List<String> reportReasons;

    public AdQualityVerificationIncidentReport(@NotNull List<String> list, @NotNull List<String> list2) {
        this.blockReasons = list;
        this.reportReasons = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQualityVerificationIncidentReport copy$default(AdQualityVerificationIncidentReport adQualityVerificationIncidentReport, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adQualityVerificationIncidentReport.blockReasons;
        }
        if ((i & 2) != 0) {
            list2 = adQualityVerificationIncidentReport.reportReasons;
        }
        return adQualityVerificationIncidentReport.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.blockReasons;
    }

    @NotNull
    public final List<String> component2() {
        return this.reportReasons;
    }

    @NotNull
    public final AdQualityVerificationIncidentReport copy(@NotNull List<String> blockReasons, @NotNull List<String> reportReasons) {
        return new AdQualityVerificationIncidentReport(blockReasons, reportReasons);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityVerificationIncidentReport)) {
            return false;
        }
        AdQualityVerificationIncidentReport adQualityVerificationIncidentReport = (AdQualityVerificationIncidentReport) other;
        return Intrinsics.areEqual(this.blockReasons, adQualityVerificationIncidentReport.blockReasons) && Intrinsics.areEqual(this.reportReasons, adQualityVerificationIncidentReport.reportReasons);
    }

    @NotNull
    public final List<String> getBlockReasons() {
        return this.blockReasons;
    }

    @NotNull
    public final List<String> getReportReasons() {
        return this.reportReasons;
    }

    public int hashCode() {
        return this.reportReasons.hashCode() + (this.blockReasons.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AdQualityVerificationIncidentReport(blockReasons=" + this.blockReasons + ", reportReasons=" + this.reportReasons + ")";
    }
}
