package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.AdRevenueEventRequestKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandleAdRevenueEvent.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "", "adRevenueRepository", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getAdRevenueEventData", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;)V", "invoke", "", "data", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "mediationProvider", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "origin", "Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;", "(Lcom/unity3d/ads/core/data/model/AdRevenueData;Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;Lcom/unity3d/ads/core/data/model/AdRevenueOrigin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandleAdRevenueEvent {

    @NotNull
    private final AdRevenueRepository adRevenueRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetAdRevenueEventData getAdRevenueEventData;

    public HandleAdRevenueEvent(@NotNull AdRevenueRepository adRevenueRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GetAdRevenueEventData getAdRevenueEventData) {
        Intrinsics.checkNotNullParameter(adRevenueRepository, "adRevenueRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getAdRevenueEventData, "getAdRevenueEventData");
        this.adRevenueRepository = adRevenueRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getAdRevenueEventData = getAdRevenueEventData;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull AdRevenueData adRevenueData, @NotNull ClientInfoOuterClass.MediationProvider mediationProvider, @NotNull AdRevenueOrigin adRevenueOrigin, @NotNull Continuation continuation) {
        HandleAdRevenueEvent$invoke$1 handleAdRevenueEvent$invoke$1;
        Object coroutine_suspended;
        int i;
        AdRevenueEventRequestKt.Dsl _create;
        Object staticDeviceInfo;
        AdRevenueData adRevenueData2;
        ClientInfoOuterClass.MediationProvider mediationProvider2;
        AdRevenueEventRequestKt.Dsl dsl;
        AdRevenueEventRequestKt.Dsl dsl2;
        AdRevenueEventRequestOuterClass.AdRevenueOrigin proto;
        AdRevenueEventRequestOuterClass.AdRevenueEventRequest _build;
        MutableSharedFlow adRevenueEvents;
        if (continuation instanceof HandleAdRevenueEvent$invoke$1) {
            handleAdRevenueEvent$invoke$1 = (HandleAdRevenueEvent$invoke$1) continuation;
            int i2 = handleAdRevenueEvent$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                handleAdRevenueEvent$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = handleAdRevenueEvent$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = handleAdRevenueEvent$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AdRevenueEventRequestKt.Dsl.Companion companion = AdRevenueEventRequestKt.Dsl.INSTANCE;
                    AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder newBuilder = AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    handleAdRevenueEvent$invoke$1.L$0 = adRevenueData;
                    handleAdRevenueEvent$invoke$1.L$1 = mediationProvider;
                    handleAdRevenueEvent$invoke$1.L$2 = adRevenueOrigin;
                    handleAdRevenueEvent$invoke$1.L$3 = _create;
                    handleAdRevenueEvent$invoke$1.L$4 = _create;
                    handleAdRevenueEvent$invoke$1.L$5 = _create;
                    handleAdRevenueEvent$invoke$1.label = 1;
                    staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(handleAdRevenueEvent$invoke$1);
                    if (staticDeviceInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adRevenueData2 = adRevenueData;
                    mediationProvider2 = mediationProvider;
                    dsl = _create;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    dsl = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$5;
                    dsl2 = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$4;
                    AdRevenueEventRequestKt.Dsl dsl3 = (AdRevenueEventRequestKt.Dsl) handleAdRevenueEvent$invoke$1.L$3;
                    AdRevenueOrigin adRevenueOrigin2 = (AdRevenueOrigin) handleAdRevenueEvent$invoke$1.L$2;
                    mediationProvider2 = (ClientInfoOuterClass.MediationProvider) handleAdRevenueEvent$invoke$1.L$1;
                    adRevenueData2 = (AdRevenueData) handleAdRevenueEvent$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    _create = dsl3;
                    adRevenueOrigin = adRevenueOrigin2;
                    staticDeviceInfo = obj;
                }
                dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
                dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setMediationProvider(mediationProvider2);
                proto = HandleAdRevenueEventKt.toProto(adRevenueOrigin);
                dsl2.setAdRevenueOrigin(proto);
                dsl2.setAdRevenueData(this.getAdRevenueEventData.invoke(adRevenueData2));
                _build = _create._build();
                adRevenueEvents = this.adRevenueRepository.getAdRevenueEvents();
                handleAdRevenueEvent$invoke$1.L$0 = null;
                handleAdRevenueEvent$invoke$1.L$1 = null;
                handleAdRevenueEvent$invoke$1.L$2 = null;
                handleAdRevenueEvent$invoke$1.L$3 = null;
                handleAdRevenueEvent$invoke$1.L$4 = null;
                handleAdRevenueEvent$invoke$1.L$5 = null;
                handleAdRevenueEvent$invoke$1.label = 2;
                if (adRevenueEvents.emit(_build, handleAdRevenueEvent$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        handleAdRevenueEvent$invoke$1 = new HandleAdRevenueEvent$invoke$1(this, continuation);
        Object obj2 = handleAdRevenueEvent$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = handleAdRevenueEvent$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
        dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setMediationProvider(mediationProvider2);
        proto = HandleAdRevenueEventKt.toProto(adRevenueOrigin);
        dsl2.setAdRevenueOrigin(proto);
        dsl2.setAdRevenueData(this.getAdRevenueEventData.invoke(adRevenueData2));
        _build = _create._build();
        adRevenueEvents = this.adRevenueRepository.getAdRevenueEvents();
        handleAdRevenueEvent$invoke$1.L$0 = null;
        handleAdRevenueEvent$invoke$1.L$1 = null;
        handleAdRevenueEvent$invoke$1.L$2 = null;
        handleAdRevenueEvent$invoke$1.L$3 = null;
        handleAdRevenueEvent$invoke$1.L$4 = null;
        handleAdRevenueEvent$invoke$1.L$5 = null;
        handleAdRevenueEvent$invoke$1.label = 2;
        if (adRevenueEvents.emit(_build, handleAdRevenueEvent$invoke$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
