package com.mobilefuse.sdk;

import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdInstanceInfo.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/AdInstanceInfo;", "", "owner", "adType", "", "placementId", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "adSize", "instanceId", "", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "renderType", "telemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "createTelemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "config", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "fillTelemetryExtras", "", "telemetryExtras", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public class AdInstanceInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int NEXT_AD_INSTANCE_ID = 1;

    @Nullable
    public String adSize;

    @NotNull
    public final String adType;
    public final int instanceId;

    @Nullable
    private String placementId;

    @NotNull
    public String renderType;

    @NotNull
    public final TelemetryAgent telemetryAgent;

    @NotNull
    public final TelemetryAdInfo createTelemetryAdInfo(@Nullable ObservableConfig config) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Boolean bool = null;
        if (config != null) {
            try {
                ObservableConfigKey observableConfigKey = ObservableConfigKey.VIDEO_STREAM_ENABLED;
                if (!config.hasValue(observableConfigKey)) {
                    config = null;
                }
                if (config != null) {
                    bool = Boolean.valueOf(ObservableConfig.getBooleanValue$default(config, observableConfigKey, false, 2, null));
                }
            } catch (Throwable th) {
                int i = AdInstanceInfo$createTelemetryAdInfo$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return new TelemetryAdInfo(this.instanceId, this.adType, this.placementId, this.adSize, this.renderType, bool);
    }

    public AdInstanceInfo(@NotNull Object owner, @NotNull String adType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.placementId = str;
        int i = NEXT_AD_INSTANCE_ID;
        NEXT_AD_INSTANCE_ID = i + 1;
        this.instanceId = i;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        String upperCase = adType.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.adType = upperCase;
        this.telemetryAgent = new TelemetryAgent(owner);
        this.renderType = "";
    }

    public /* synthetic */ AdInstanceInfo(Object obj, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i & 4) != 0 ? null : str2);
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    public final void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    /* compiled from: AdInstanceInfo.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/AdInstanceInfo$Companion;", "", "()V", "NEXT_AD_INSTANCE_ID", "", "getNEXT_AD_INSTANCE_ID$annotations", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private static /* synthetic */ void getNEXT_AD_INSTANCE_ID$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void fillTelemetryExtras(@NotNull List<TelemetryActionParam> telemetryExtras) {
        Intrinsics.checkNotNullParameter(telemetryExtras, "telemetryExtras");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            telemetryExtras.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(this.instanceId), true));
            telemetryExtras.add(new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_TYPE, this.adType, true));
            String str = this.placementId;
            if (str != null) {
                telemetryExtras.add(new TelemetryActionParam(TelemetrySdkParamType.PLACEMENT_ID, str, true));
            }
            String str2 = this.adSize;
            if (str2 != null) {
                telemetryExtras.add(new TelemetryActionParam(TelemetrySdkParamType.AD_SIZE, str2, true));
            }
        } catch (Throwable th) {
            int i = AdInstanceInfo$fillTelemetryExtras$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final TelemetryAdInfo createTelemetryAdInfo() {
        return new TelemetryAdInfo(this.instanceId, this.adType, this.placementId, this.adSize, this.renderType, null, 32, null);
    }
}
