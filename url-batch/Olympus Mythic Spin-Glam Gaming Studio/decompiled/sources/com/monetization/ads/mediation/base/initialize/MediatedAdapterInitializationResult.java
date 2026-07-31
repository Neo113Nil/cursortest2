package com.monetization.ads.mediation.base.initialize;

import com.inmobi.unification.sdk.InitializationStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult;", "", "Failure", InitializationStatus.SUCCESS, "Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult$Failure;", "Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult$Success;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MediatedAdapterInitializationResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult$Failure;", "Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult;", IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMessage", "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure implements MediatedAdapterInitializationResult {
        private final int errorCode;

        @NotNull
        private final String errorMessage;

        public Failure(int i, @NotNull String str) {
            this.errorCode = i;
            this.errorMessage = str;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failure.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final Failure copy(int errorCode, @NotNull String errorMessage) {
            return new Failure(errorCode, errorMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.errorCode == failure.errorCode && Intrinsics.areEqual(this.errorMessage, failure.errorMessage);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
        }

        @NotNull
        public String toString() {
            return "Failure(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult$Success;", "Lcom/monetization/ads/mediation/base/initialize/MediatedAdapterInitializationResult;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements MediatedAdapterInitializationResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return 287796421;
        }

        @NotNull
        public String toString() {
            return InitializationStatus.SUCCESS;
        }
    }
}
