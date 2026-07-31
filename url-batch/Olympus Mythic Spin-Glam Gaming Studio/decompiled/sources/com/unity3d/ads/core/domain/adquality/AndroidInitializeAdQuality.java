package com.unity3d.ads.core.domain.adquality;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.O6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.TimeSource$Monotonic;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidInitializeAdQuality.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0082\bJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/AndroidInitializeAdQuality;", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "context", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/GetGameId;)V", "invoke", "", "appKey", "", "sessionToken", "Lcom/google/protobuf/ByteString;", "invokeWithGameId", "startInitialization", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;", "buildConfig", "startTime", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "buildConfig-LaDbsBc", "(JLcom/google/protobuf/ByteString;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;", "safeRun", "block", "Lkotlin/Function0;", "reportLoadFailure", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "fallbackReason", "mapLogLevel", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "logLevelInternal", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidInitializeAdQuality implements InitializeAdQuality {

    @NotNull
    private final Context context;

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: AndroidInitializeAdQuality.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevelInternal.values().length];
            try {
                iArr[LogLevelInternal.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevelInternal.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevelInternal.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevelInternal.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevelInternal.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidInitializeAdQuality(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger, @NotNull GetGameId getGameId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.getGameId = getGameId;
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invoke(@NotNull String appKey, @NotNull ByteString sessionToken) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        try {
            IronSourceAdQuality.getInstance().initialize(this.context, appKey, startInitialization(sessionToken));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, MapsKt.mapOf(TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invokeWithGameId(@NotNull ByteString sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        String invoke = this.getGameId.invoke();
        if (invoke == null || StringsKt.isBlank(invoke)) {
            return;
        }
        try {
            IronSourceAdQuality.getInstance().initializeWithGameId(this.context, invoke, startInitialization(sessionToken));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, MapsKt.mapOf(TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final ISAdQualityConfig startInitialization(ByteString sessionToken) {
        long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
        return m6942buildConfigLaDbsBc(m8186markNowz9LOYto, sessionToken);
    }

    /* renamed from: buildConfig-LaDbsBc, reason: not valid java name */
    private final ISAdQualityConfig m6942buildConfigLaDbsBc(final long startTime, ByteString sessionToken) {
        ISAdQualityConfig.Builder addAdQualityInitListener = new ISAdQualityConfig.Builder().setInitializationSource(O6.H1).setLogLevel(mapLogLevel(this.logger.getLogLevel())).setMetaData(AdQualityConstants.SESSION_TOKEN_METADATA_KEY, ProtobufExtensionsKt.toBase64$default(sessionToken, false, 1, null)).addAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$buildConfig$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() {
                SendDiagnosticEvent sendDiagnosticEvent;
                double m8147getInWholeMillisecondsimpl = Duration.m8147getInWholeMillisecondsimpl(TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(startTime));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME, Double.valueOf(m8147getInWholeMillisecondsimpl), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) {
                SendDiagnosticEvent sendDiagnosticEvent;
                Logger logger;
                Intrinsics.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                Intrinsics.checkNotNullParameter(message, "message");
                double m8147getInWholeMillisecondsimpl = Duration.m8147getInWholeMillisecondsimpl(TimeSource$Monotonic.ValueTimeMark.m8189elapsedNowUwyO8pc(startTime));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME, Double.valueOf(m8147getInWholeMillisecondsimpl), MapsKt.mapOf(TuplesKt.to("reason", isAdQualityInitError.name()), TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                logger = this.logger;
                Logger.DefaultImpls.error$default(logger, "Ad Quality failed to initialize: " + message, null, 2, null);
            }
        });
        String userIdentifier = UnityAds.getUserIdentifier();
        if (userIdentifier != null) {
            addAdQualityInitListener.setUserId(userIdentifier);
        }
        ISAdQualityConfig build = addAdQualityInitListener.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void safeRun(Function0 block) {
        try {
            block.mo4828invoke();
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, MapsKt.mapOf(TuplesKt.to("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final void reportLoadFailure(final Throwable e, String fallbackReason) {
        this.logger.debug(new Function0() { // from class: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String reportLoadFailure$lambda$3;
                reportLoadFailure$lambda$3 = AndroidInitializeAdQuality.reportLoadFailure$lambda$3(e);
                return reportLoadFailure$lambda$3;
            }
        });
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
        Double valueOf = Double.valueOf(0.0d);
        String message = e.getMessage();
        if (message != null) {
            fallbackReason = message;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, MapsKt.mapOf(TuplesKt.to("reason_debug", fallbackReason)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reportLoadFailure$lambda$3(Throwable th) {
        return "Ad Quality SDK not available: " + th.getMessage();
    }

    private final ISAdQualityLogLevel mapLogLevel(LogLevelInternal logLevelInternal) {
        int i = WhenMappings.$EnumSwitchMapping$0[logLevelInternal.ordinal()];
        if (i == 1) {
            return ISAdQualityLogLevel.NONE;
        }
        if (i == 2) {
            return ISAdQualityLogLevel.ERROR;
        }
        if (i == 3) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i == 4) {
            return ISAdQualityLogLevel.DEBUG;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return ISAdQualityLogLevel.VERBOSE;
    }
}
