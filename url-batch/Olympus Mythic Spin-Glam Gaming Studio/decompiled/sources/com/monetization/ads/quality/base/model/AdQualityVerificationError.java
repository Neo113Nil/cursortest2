package com.monetization.ads.quality.base.model;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import yads.e7;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\t\u0082\u0001\t\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "", "", "code", "", "description", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "I", "getCode", "()I", "Ljava/lang/String;", "getDescription", "Code", "yads/e7", "DisabledError", "InitializationAlreadyInProcess", "InternalError", "InvalidAdObject", "InvalidInit", "LowUsagePercent", "TimeoutError", NativeProtocol.ERROR_UNKNOWN_ERROR, "UnsupportedNetwork", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$DisabledError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InitializationAlreadyInProcess;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InternalError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InvalidAdObject;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InvalidInit;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$LowUsagePercent;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$TimeoutError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$UnknownError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$UnsupportedNetwork;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AdQualityVerificationError {

    @NotNull
    private static final e7 Code = new e7();

    @Deprecated
    public static final int INTERNAL_ERROR = 1;

    @Deprecated
    public static final int INVALID_REQUEST = 2;

    @Deprecated
    public static final int UNKNOWN_ERROR = 0;
    private final int code;

    @NotNull
    private final String description;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$DisabledError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisabledError extends AdQualityVerificationError {

        @NotNull
        public static final DisabledError INSTANCE = new DisabledError();

        private DisabledError() {
            super(1, "The ad verification is disabled by configuration", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InitializationAlreadyInProcess;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitializationAlreadyInProcess extends AdQualityVerificationError {
        public InitializationAlreadyInProcess() {
            super(1, "The verification initialization is already in progress", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InternalError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "description", "", "(Ljava/lang/String;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternalError extends AdQualityVerificationError {
        public InternalError(@NotNull String str) {
            super(1, "The ad verification build in error: " + str, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InvalidAdObject;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidAdObject extends AdQualityVerificationError {
        public InvalidAdObject() {
            super(2, "The ad object for verification is invalid", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$InvalidInit;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "errorDescription", "", "(Ljava/lang/String;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidInit extends AdQualityVerificationError {
        public InvalidInit(@NotNull String str) {
            super(1, "The verifier initialization error: " + str, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$LowUsagePercent;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LowUsagePercent extends AdQualityVerificationError {

        @NotNull
        public static final LowUsagePercent INSTANCE = new LowUsagePercent();

        private LowUsagePercent() {
            super(1, "The ad verification is not in percent usage", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$TimeoutError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "timeout", "", "(J)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimeoutError extends AdQualityVerificationError {
        public TimeoutError(long j) {
            super(1, "The ad verifications timed out after " + j, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$UnknownError;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "description", "", "(Ljava/lang/String;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnknownError extends AdQualityVerificationError {
        public UnknownError(@NotNull String str) {
            super(0, "The ad verification failed with error: " + str, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/monetization/ads/quality/base/model/AdQualityVerificationError$UnsupportedNetwork;", "Lcom/monetization/ads/quality/base/model/AdQualityVerificationError;", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnsupportedNetwork extends AdQualityVerificationError {
        public UnsupportedNetwork() {
            super(2, "The network is unsupported for verification", null);
        }
    }

    public /* synthetic */ AdQualityVerificationError(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public String toString() {
        return "Ad verification error: (code: " + this.code + ", description: " + this.description + ")";
    }

    private AdQualityVerificationError(int i, String str) {
        this.code = i;
        this.description = str;
    }
}
