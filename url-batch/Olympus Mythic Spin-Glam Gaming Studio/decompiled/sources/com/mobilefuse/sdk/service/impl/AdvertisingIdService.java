package com.mobilefuse.sdk.service.impl;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices_LogsKt;
import com.mobilefuse.sdk.service.impl.ifa.IfaDataModelKt;
import com.mobilefuse.sdk.service.impl.ifa.IfaDetails;
import com.mobilefuse.sdk.service.impl.ifa.IfaException;
import com.mobilefuse.sdk.service.impl.ifa.IfaSource;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionType;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.telemetry.metricslogging.DefaultMetricIdGenerator;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdvertisingIdService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0012\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J'\u0010\u0014\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0016H\u0010¢\u0006\u0002\b\u0017J\u001c\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001aH\u0002J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001aH\u0002J\b\u0010\u001d\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0014J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/AdvertisingIdService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "()V", "advertisingIdObtainInProgress", "", "completeCallbacks", "", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/service/impl/ifa/IfaDetails;", "", "<set-?>", "ifaDetails", "getIfaDetails", "()Lcom/mobilefuse/sdk/service/impl/ifa/IfaDetails;", "maxInitAttempts", "", "getMaxInitAttempts", "()I", "getAdvertisingIdInfo", "callback", "initServiceImpl", "completeAction", "Lkotlin/Function2;", "initServiceImpl$mobilefuse_sdk_core_release", "obtainAdvertisingId", "obtainAmazonIfaDetailsSync", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/service/impl/ifa/IfaException;", "obtainGoogleIfaDetailsSync", "obtainIfaDetailsSync", "onAdvertisingIdObtained", "resetImpl", "sanitizeAdvertisingId", "", "advertisingId", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final class AdvertisingIdService extends MobileFuseService {
    private static boolean advertisingIdObtainInProgress;

    @NotNull
    public static final AdvertisingIdService INSTANCE = new AdvertisingIdService();
    private static final int maxInitAttempts = 3;
    private static List<? extends Function1> completeCallbacks = CollectionsKt.emptyList();

    @NotNull
    private static IfaDetails ifaDetails = IfaDataModelKt.getIfaDefault();

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdvertisingIdObtained(IfaDetails ifaDetails2) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdvertisingIdService advertisingIdService = INSTANCE;
            DebuggingKt.logDebug$default(advertisingIdService, "Propagate advertisingId: " + ifaDetails2.getAdvertisingId(), null, 2, null);
            MobileFuseSettings.setAdvertisingId(advertisingIdService.sanitizeAdvertisingId(ifaDetails2.getAdvertisingId()));
            MobileFuseSettings.setLimitTrackingEnabled(ifaDetails2.isLimitTrackingEnabled());
            String advertisingId = ifaDetails2.getAdvertisingId();
            if (advertisingId != null) {
                TelemetryManager.INSTANCE.registerVariable("ifa", advertisingId);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.IFA, advertisingId, true));
                IfaSource ifaSource = ifaDetails2.getIfaSource();
                if (ifaSource != null) {
                    arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.IFA_SOURCE, ifaSource.name(), true));
                }
                MobileFuse.INSTANCE.getTelemetryAgent().onAction(TelemetryActionFactory.createInfoAction(advertisingIdService, TelemetryActionSdkEvents.ADVERTISING_ID_OBTAINED.updateExtraMessageField(advertisingId), arrayList));
            }
        } catch (Throwable th) {
            int i = AdvertisingIdService$onAdvertisingIdObtained$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private AdvertisingIdService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected int getMaxInitAttempts() {
        return maxInitAttempts;
    }

    @NotNull
    public final IfaDetails getIfaDetails() {
        return ifaDetails;
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull final Function2 completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        getAdvertisingIdInfo(new Function1() { // from class: com.mobilefuse.sdk.service.impl.AdvertisingIdService$initServiceImpl$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IfaDetails) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
            
                if ((!kotlin.text.StringsKt.isBlank(r4)) == true) goto L8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(@NotNull IfaDetails ifaDetails2) {
                Intrinsics.checkNotNullParameter(ifaDetails2, "ifaDetails");
                Function2 function2 = Function2.this;
                AdvertisingIdService advertisingIdService = AdvertisingIdService.INSTANCE;
                boolean z = ifaDetails2.getAdvertisingId() != null;
                function2.invoke(advertisingIdService, Boolean.valueOf(z));
            }
        });
    }

    private final void getAdvertisingIdInfo(Function1 callback) {
        Either errorResult;
        AdvertisingIdService advertisingIdService;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            advertisingIdService = INSTANCE;
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "get advertisingId info");
            String advertisingId = ifaDetails.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "advertisingId is known, use it and call callback");
                callback.invoke(ifaDetails);
                return;
            }
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "register callback");
            completeCallbacks = CollectionsKt.plus(completeCallbacks, callback);
        } catch (Throwable th) {
            if (AdvertisingIdService$getAdvertisingIdInfo$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (advertisingIdObtainInProgress) {
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "advertisingId obtain process is in progress, wait for result");
            return;
        }
        advertisingIdService.obtainAdvertisingId(new Function1() { // from class: com.mobilefuse.sdk.service.impl.AdvertisingIdService$getAdvertisingIdInfo$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IfaDetails) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull IfaDetails details) {
                List list;
                Intrinsics.checkNotNullParameter(details, "details");
                AdvertisingIdService advertisingIdService2 = AdvertisingIdService.INSTANCE;
                MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService2, "advertisingId info obtained with details: " + details);
                AdvertisingIdService.ifaDetails = details;
                advertisingIdService2.onAdvertisingIdObtained(details);
                list = AdvertisingIdService.completeCallbacks;
                AdvertisingIdService.completeCallbacks = CollectionsKt.emptyList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(details);
                }
            }
        });
        errorResult = new SuccessResult(Unit.INSTANCE);
        if (errorResult instanceof ErrorResult) {
            MobileFuseServices_LogsKt.logServiceDebug(INSTANCE, "handled error when scheduling ifa obtain call, use details: " + IfaDataModelKt.getIfaError());
            callback.invoke(IfaDataModelKt.getIfaError());
        }
    }

    private final void obtainAdvertisingId(final Function1 completeAction) {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (AdvertisingIdService$obtainAdvertisingId$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (advertisingIdObtainInProgress) {
            return;
        }
        advertisingIdObtainInProgress = true;
        MobileFuseServices_LogsKt.logServiceDebug(INSTANCE, "advertisingId obtain has been requested");
        final int nextId = DefaultMetricIdGenerator.INSTANCE.getNextId();
        Telemetry.INSTANCE.reportAdMetric(new TelemetryAdInfo(nextId, null, null, null, null, null, 62, null), MetricRecordName.ADVERTISING_ID_REQUESTED);
        SchedulersKt.safelyRunOnBgThread(new Function1() { // from class: com.mobilefuse.sdk.service.impl.AdvertisingIdService$obtainAdvertisingId$$inlined$gracefullyHandleException$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MobileFuseServices_LogsKt.logServiceDebug(AdvertisingIdService.INSTANCE, "handled error when calling task on bg thread, use details: " + IfaDataModelKt.getIfaError());
                Function1.this.invoke(IfaDataModelKt.getIfaError());
            }
        }, new Function0() { // from class: com.mobilefuse.sdk.service.impl.AdvertisingIdService$obtainAdvertisingId$$inlined$gracefullyHandleException$lambda$2
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
                final IfaDetails obtainIfaDetailsSync;
                obtainIfaDetailsSync = AdvertisingIdService.INSTANCE.obtainIfaDetailsSync();
                SchedulersKt.safelyRunOnMainThread(new Function1() { // from class: com.mobilefuse.sdk.service.impl.AdvertisingIdService$obtainAdvertisingId$1$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        MobileFuseServices_LogsKt.logServiceDebug(AdvertisingIdService.INSTANCE, "Exception happened when calling main thread: " + it);
                    }
                }, new Function0() { // from class: com.mobilefuse.sdk.service.impl.AdvertisingIdService$obtainAdvertisingId$$inlined$gracefullyHandleException$lambda$2.1
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
                        if (Intrinsics.areEqual(obtainIfaDetailsSync, IfaDataModelKt.getIfaError())) {
                            Telemetry.INSTANCE.reportAdMetric(new TelemetryAdInfo(nextId, null, null, null, null, null, 62, null), MetricRecordName.ADVERTISING_ID_REQUEST_FAILED);
                        }
                        MobileFuseServices_LogsKt.logServiceDebug(AdvertisingIdService.INSTANCE, "Dispatch Ifa: " + obtainIfaDetailsSync);
                        AdvertisingIdService.advertisingIdObtainInProgress = false;
                        completeAction.invoke(obtainIfaDetailsSync);
                    }
                });
            }
        });
        errorResult = new SuccessResult(Unit.INSTANCE);
        if (errorResult instanceof ErrorResult) {
            MobileFuseServices_LogsKt.logServiceDebug(INSTANCE, "Experienced an error in the main ifa obtain function, use Ifa " + IfaDataModelKt.getIfaError());
            completeAction.invoke(IfaDataModelKt.getIfaError());
        }
    }

    private final Either<IfaException, IfaDetails> obtainAmazonIfaDetailsSync() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdvertisingIdService advertisingIdService = INSTANCE;
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Try to obtain Ifa from Amazon");
            errorResult = new SuccessResult(new SuccessResult(AdvertisingIdServiceKt.amazonIfaFactory(advertisingIdService)));
        } catch (Throwable th) {
            if (AdvertisingIdService$obtainAmazonIfaDetailsSync$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            value = new ErrorResult(new IfaException((Throwable) ((ErrorResult) errorResult).getValue()));
        }
        return (Either) value;
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
        MobileFuseServices_LogsKt.logServiceDebug(this, "Reset AdvertisingId service");
        ifaDetails = IfaDataModelKt.getIfaDefault();
        completeCallbacks = CollectionsKt.emptyList();
        advertisingIdObtainInProgress = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IfaDetails obtainIfaDetailsSync() {
        Object value;
        Either<IfaException, IfaDetails> errorResult;
        Object value2;
        Either<IfaException, IfaDetails> obtainGoogleIfaDetailsSync = obtainGoogleIfaDetailsSync();
        AdvertisingIdService advertisingIdService = INSTANCE;
        MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "obtained Google Ifa details: " + obtainGoogleIfaDetailsSync);
        if (obtainGoogleIfaDetailsSync instanceof ErrorResult) {
            IfaException ifaException = (IfaException) ((ErrorResult) obtainGoogleIfaDetailsSync).getValue();
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Google has returned an error: " + ifaException);
            if (ifaException.getException() instanceof GooglePlayServicesNotAvailableException) {
                MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Google error is a 'GooglePlayServicesNotAvailableException'. Try to get Ifa from Amazon");
                ifaException.getException().printStackTrace();
                Either<IfaException, IfaDetails> obtainAmazonIfaDetailsSync = advertisingIdService.obtainAmazonIfaDetailsSync();
                MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "obtained Amazon Ifa details: " + obtainAmazonIfaDetailsSync);
                Unit unit = Unit.INSTANCE;
                if (obtainAmazonIfaDetailsSync instanceof ErrorResult) {
                    MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Amazon has returned an error: " + ((IfaException) ((ErrorResult) obtainAmazonIfaDetailsSync).getValue()));
                    MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Use zeroed Ifa");
                    MobileFuse.INSTANCE.getTelemetryAgent().onAction(TelemetryActionFactory.createWarnAction(advertisingIdService, TelemetrySdkActionType.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE, CollectionsKt.emptyList()));
                    value2 = IfaDetails.copy$default(IfaDataModelKt.getIfaZeros(), null, false, IfaSource.GOOGLE, 3, null);
                } else {
                    if (!(obtainAmazonIfaDetailsSync instanceof SuccessResult)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    value2 = ((SuccessResult) obtainAmazonIfaDetailsSync).getValue();
                }
                errorResult = new SuccessResult<>(value2);
            } else {
                MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Forward Google error");
                errorResult = new ErrorResult<>(ifaException);
            }
            obtainGoogleIfaDetailsSync = errorResult;
        } else if (!(obtainGoogleIfaDetailsSync instanceof SuccessResult)) {
            throw new NoWhenBranchMatchedException();
        }
        if (obtainGoogleIfaDetailsSync instanceof ErrorResult) {
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Experienced an error from ifa obtain process, use Ifa " + IfaDataModelKt.getIfaError());
            value = IfaDataModelKt.getIfaError();
        } else {
            if (!(obtainGoogleIfaDetailsSync instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) obtainGoogleIfaDetailsSync).getValue();
        }
        return (IfaDetails) value;
    }

    private final Either<IfaException, IfaDetails> obtainGoogleIfaDetailsSync() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            AdvertisingIdService advertisingIdService = INSTANCE;
            MobileFuseServices_LogsKt.logServiceDebug(advertisingIdService, "Try to obtain Ifa from Google");
            errorResult = new SuccessResult(new SuccessResult(AdvertisingIdServiceKt.googleIfaFactory(advertisingIdService)));
        } catch (Throwable th) {
            if (AdvertisingIdService$obtainGoogleIfaDetailsSync$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            value = new ErrorResult(new IfaException((Throwable) ((ErrorResult) errorResult).getValue()));
        }
        return (Either) value;
    }

    private final String sanitizeAdvertisingId(String advertisingId) {
        if (advertisingId == null) {
            return "";
        }
        if (Intrinsics.areEqual(advertisingId, MobileFuseDefaults.ADVERTISING_ID_ZEROS)) {
            advertisingId = "";
        }
        return advertisingId;
    }
}
