package com.yandex.mobile.ads.common;

import com.inmobi.unification.sdk.InitializationStatus;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/common/AdBindingResult;", "", "()V", "Failure", InitializationStatus.SUCCESS, "Lcom/yandex/mobile/ads/common/AdBindingResult$Failure;", "Lcom/yandex/mobile/ads/common/AdBindingResult$Success;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AdBindingResult {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/common/AdBindingResult$Failure;", "Lcom/yandex/mobile/ads/common/AdBindingResult;", "missingAssetName", "", TelemetryCategory.EXCEPTION, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "getMissingAssetName", "()Ljava/lang/String;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends AdBindingResult {

        @NotNull
        private final Throwable exception;

        @Nullable
        private final String missingAssetName;

        public Failure(@Nullable String str, @NotNull Throwable th) {
            super(null);
            this.missingAssetName = str;
            this.exception = th;
        }

        @NotNull
        public final Throwable getException() {
            return this.exception;
        }

        @Nullable
        public final String getMissingAssetName() {
            return this.missingAssetName;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/mobile/ads/common/AdBindingResult$Success;", "Lcom/yandex/mobile/ads/common/AdBindingResult;", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends AdBindingResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ AdBindingResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AdBindingResult() {
    }
}
