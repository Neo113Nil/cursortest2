package com.mobilefuse.sdk.internal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.privacy.PrivacyPrefsDefaultsResolver;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenProvider;", "", "()V", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes.dex */
public final class MobileFuseBiddingTokenProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int adInstanceId;

    public static final void getToken(@NotNull IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenGeneratorListener tokenGeneratorListener) {
        INSTANCE.getToken(iMobileFuseBiddingTokenRequest, context, tokenGeneratorListener);
    }

    public static final void getToken(@NotNull MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenGeneratorListener tokenGeneratorListener) {
        INSTANCE.getToken(mobileFuseBiddingTokenRequest, context, tokenGeneratorListener);
    }

    public static final void getTokenData(@NotNull IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenDataListener tokenDataListener) {
        INSTANCE.getTokenData(iMobileFuseBiddingTokenRequest, context, tokenDataListener);
    }

    /* compiled from: MobileFuseBiddingTokenProvider.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0007J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenProvider$Companion;", "", "()V", "adInstanceId", "", "buildJsonObjectWithRequest", "Lorg/json/JSONObject;", "request", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "getTelemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "getToken", "", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/internal/TokenGeneratorListener;", "Lcom/mobilefuse/sdk/internal/MobileFuseBiddingTokenRequest;", "getTokenData", "Lcom/mobilefuse/sdk/internal/TokenDataListener;", "getTokenInternal", "mergePrivacyPreferences", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "mediatorPrefs", "mergePrivacyPreferences$mobilefuse_sdk_core_release", "reportTelemetryTokenGenerated", "token", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void getToken(@NotNull IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenGeneratorListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            getTokenInternal(request, context, listener);
        }

        public final void getToken(@NotNull MobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenGeneratorListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            getTokenInternal(request, context, listener);
        }

        private final void getTokenInternal(final IMobileFuseBiddingTokenRequest request, Context context, final TokenGeneratorListener listener) {
            MobileFuseBiddingTokenProvider.adInstanceId = BiddingTokenIdGenerator.INSTANCE.getNextBidTokenId();
            Telemetry.INSTANCE.reportAdMetric(getTelemetryAdInfo(), MetricRecordName.BID_TOKEN_REQUESTED_WITH_JIT);
            SdkInitializer.ensureSdkSetup(false);
            MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider$Companion$getTokenInternal$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    TelemetryAdInfo telemetryAdInfo;
                    JSONObject buildJsonObjectWithRequest;
                    TelemetryAdInfo telemetryAdInfo2;
                    try {
                        Telemetry.Companion companion = Telemetry.INSTANCE;
                        MobileFuseBiddingTokenProvider.Companion companion2 = MobileFuseBiddingTokenProvider.INSTANCE;
                        telemetryAdInfo = companion2.getTelemetryAdInfo();
                        companion.reportAdMetric(telemetryAdInfo, MetricRecordName.BID_TOKEN_REQUESTED);
                        buildJsonObjectWithRequest = companion2.buildJsonObjectWithRequest(IMobileFuseBiddingTokenRequest.this);
                        String jSONObject = buildJsonObjectWithRequest.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
                        String token = Base64.encodeToString(Gzip.toGzipByteArray(jSONObject), 2);
                        telemetryAdInfo2 = companion2.getTelemetryAdInfo();
                        companion.reportAdMetric(telemetryAdInfo2, MetricRecordName.BID_TOKEN_GENERATED);
                        Intrinsics.checkNotNullExpressionValue(token, "token");
                        companion2.reportTelemetryTokenGenerated(token);
                        listener.onTokenGenerated(token);
                    } catch (Throwable th) {
                        listener.onTokenGenerationFailed("Failed to generate token with internal error: " + th.getMessage());
                    }
                }
            });
        }

        public final void getTokenData(@NotNull IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenDataListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            MobileFuseBiddingTokenProvider_getTokenDataKt.getBiddingTokenData(request, context, listener);
        }

        @NotNull
        public final MobileFusePrivacyPreferences mergePrivacyPreferences$mobilefuse_sdk_core_release(@NotNull MobileFusePrivacyPreferences mediatorPrefs) {
            Intrinsics.checkNotNullParameter(mediatorPrefs, "mediatorPrefs");
            PrivacyPrefsDefaultsResolver.resolveDefaults();
            MobileFusePrivacyPreferences privacyPreferences = MobileFuse.INSTANCE.getPrivacyPreferences();
            MobileFusePrivacyPreferences.Builder builder = new MobileFusePrivacyPreferences.Builder();
            String usPrivacyConsentString = mediatorPrefs.getUsPrivacyConsentString();
            if (usPrivacyConsentString != null && !StringsKt.isBlank(usPrivacyConsentString)) {
                builder.setUsPrivacyConsentString(mediatorPrefs.getUsPrivacyConsentString());
            } else {
                String usPrivacyConsentString2 = privacyPreferences.getUsPrivacyConsentString();
                if (usPrivacyConsentString2 != null && !StringsKt.isBlank(usPrivacyConsentString2)) {
                    builder.setUsPrivacyConsentString(privacyPreferences.getUsPrivacyConsentString());
                }
            }
            String gppConsentString = mediatorPrefs.getGppConsentString();
            if (gppConsentString != null && !StringsKt.isBlank(gppConsentString)) {
                builder.setGppConsentString(mediatorPrefs.getGppConsentString());
            } else {
                String gppConsentString2 = privacyPreferences.getGppConsentString();
                if (gppConsentString2 != null && !StringsKt.isBlank(gppConsentString2)) {
                    builder.setGppConsentString(privacyPreferences.getGppConsentString());
                }
            }
            boolean z = true;
            builder.setSubjectToCoppa(mediatorPrefs.isSubjectToCoppa() || privacyPreferences.isSubjectToCoppa());
            if (!mediatorPrefs.isDoNotTrack() && !privacyPreferences.isDoNotTrack()) {
                z = false;
            }
            builder.setDoNotTrack(z);
            return builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject buildJsonObjectWithRequest(IMobileFuseBiddingTokenRequest request) {
            Map<String, Object> buildBaseDataMap = BiddingTokenUtils.INSTANCE.buildBaseDataMap(request);
            if (buildBaseDataMap != null) {
                return new JSONObject(buildBaseDataMap);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reportTelemetryTokenGenerated(String token) {
            Telemetry.INSTANCE.onAction(TelemetrySdkActionFactory.createBiddingTokenAction(token, TelemetryActionSdkEvents.BID_TOKEN_GENERATED, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TelemetryAdInfo getTelemetryAdInfo() {
            return new TelemetryAdInfo(MobileFuseBiddingTokenProvider.adInstanceId, "", "", "", "", null, 32, null);
        }
    }
}
