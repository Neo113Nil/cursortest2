package com.monetization.ads.quality.base.state;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationIncidentReport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/monetization/ads/quality/base/state/AdQualityVerificationState;", "", "Blocked", "Error", "NotStarted", "ShouldBeBlockedOnDisplay", "Verified", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$Blocked;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$Error;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$NotStarted;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$ShouldBeBlockedOnDisplay;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$Verified;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface AdQualityVerificationState {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$Blocked;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState;", "reason", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationBlockingReasons;", "(Lcom/monetization/ads/quality/base/model/AdQualityVerificationBlockingReasons;)V", "getReason", "()Lcom/monetization/ads/quality/base/model/AdQualityVerificationBlockingReasons;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Blocked implements AdQualityVerificationState {

        @NotNull
        private final AdQualityVerificationBlockingReasons reason;

        public Blocked(@NotNull AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
            this.reason = adQualityVerificationBlockingReasons;
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationBlockingReasons = blocked.reason;
            }
            return blocked.copy(adQualityVerificationBlockingReasons);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        @NotNull
        public final Blocked copy(@NotNull AdQualityVerificationBlockingReasons reason) {
            return new Blocked(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Blocked) && Intrinsics.areEqual(this.reason, ((Blocked) other).reason);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Blocked(reason=" + this.reason + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$Error;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState;", "error", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "(Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;)V", "getError", "()Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AdQualityVerificationState {

        @NotNull
        private final AdQualityVerificationError error;

        public Error(@NotNull AdQualityVerificationError adQualityVerificationError) {
            this.error = adQualityVerificationError;
        }

        public static /* synthetic */ Error copy$default(Error error, AdQualityVerificationError adQualityVerificationError, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationError = error.error;
            }
            return error.copy(adQualityVerificationError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdQualityVerificationError getError() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull AdQualityVerificationError error) {
            return new Error(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        @NotNull
        public final AdQualityVerificationError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$NotStarted;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotStarted implements AdQualityVerificationState {

        @NotNull
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return 1691080461;
        }

        @NotNull
        public String toString() {
            return "NotStarted";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$ShouldBeBlockedOnDisplay;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState;", "reason", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationBlockingReasons;", "(Lcom/monetization/ads/quality/base/model/AdQualityVerificationBlockingReasons;)V", "getReason", "()Lcom/monetization/ads/quality/base/model/AdQualityVerificationBlockingReasons;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {

        @NotNull
        private final AdQualityVerificationBlockingReasons reason;

        public ShouldBeBlockedOnDisplay(@NotNull AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
            this.reason = adQualityVerificationBlockingReasons;
        }

        public static /* synthetic */ ShouldBeBlockedOnDisplay copy$default(ShouldBeBlockedOnDisplay shouldBeBlockedOnDisplay, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationBlockingReasons = shouldBeBlockedOnDisplay.reason;
            }
            return shouldBeBlockedOnDisplay.copy(adQualityVerificationBlockingReasons);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        @NotNull
        public final ShouldBeBlockedOnDisplay copy(@NotNull AdQualityVerificationBlockingReasons reason) {
            return new ShouldBeBlockedOnDisplay(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShouldBeBlockedOnDisplay) && Intrinsics.areEqual(this.reason, ((ShouldBeBlockedOnDisplay) other).reason);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShouldBeBlockedOnDisplay(reason=" + this.reason + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/quality/base/state/AdQualityVerificationState$Verified;", "Lcom/monetization/ads/quality/base/state/AdQualityVerificationState;", "incidentReport", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationIncidentReport;", "(Lcom/monetization/ads/quality/base/model/AdQualityVerificationIncidentReport;)V", "getIncidentReport", "()Lcom/monetization/ads/quality/base/model/AdQualityVerificationIncidentReport;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Verified implements AdQualityVerificationState {

        @Nullable
        private final AdQualityVerificationIncidentReport incidentReport;

        /* JADX WARN: Multi-variable type inference failed */
        public Verified() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Verified copy$default(Verified verified, AdQualityVerificationIncidentReport adQualityVerificationIncidentReport, int i, Object obj) {
            if ((i & 1) != 0) {
                adQualityVerificationIncidentReport = verified.incidentReport;
            }
            return verified.copy(adQualityVerificationIncidentReport);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final AdQualityVerificationIncidentReport getIncidentReport() {
            return this.incidentReport;
        }

        @NotNull
        public final Verified copy(@Nullable AdQualityVerificationIncidentReport incidentReport) {
            return new Verified(incidentReport);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Verified) && Intrinsics.areEqual(this.incidentReport, ((Verified) other).incidentReport);
        }

        @Nullable
        public final AdQualityVerificationIncidentReport getIncidentReport() {
            return this.incidentReport;
        }

        public int hashCode() {
            AdQualityVerificationIncidentReport adQualityVerificationIncidentReport = this.incidentReport;
            if (adQualityVerificationIncidentReport == null) {
                return 0;
            }
            return adQualityVerificationIncidentReport.hashCode();
        }

        @NotNull
        public String toString() {
            return "Verified(incidentReport=" + this.incidentReport + ")";
        }

        public Verified(@Nullable AdQualityVerificationIncidentReport adQualityVerificationIncidentReport) {
            this.incidentReport = adQualityVerificationIncidentReport;
        }

        public /* synthetic */ Verified(AdQualityVerificationIncidentReport adQualityVerificationIncidentReport, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : adQualityVerificationIncidentReport);
        }
    }
}
