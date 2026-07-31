package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LifecycleEventObserver.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0017\u001a\u00020\u0018H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/log/Logger;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LifecycleEventObserver {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetByteStringId getByteStringId;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final MutableStateFlow isRunning;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final Logger logger;

    @NotNull
    private final CoroutineScope scope;

    public LifecycleEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull CoroutineScope scope, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GatewayClient gatewayClient, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GetByteStringId getByteStringId, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(getByteStringId, "getByteStringId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.lifecycleDataSource = lifecycleDataSource;
        this.deviceInfoRepository = deviceInfoRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.getByteStringId = getByteStringId;
        this.logger = logger;
        this.isRunning = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this.isRunning;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.drop(this.lifecycleDataSource.getAppActive(), 1), new LifecycleEventObserver$invoke$2(this, null)), this.scope).invokeOnCompletion(new Function1() { // from class: com.unity3d.ads.core.domain.events.LifecycleEventObserver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$1;
                invoke$lambda$1 = LifecycleEventObserver.invoke$lambda$1(LifecycleEventObserver.this, (Throwable) obj);
                return invoke$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(LifecycleEventObserver lifecycleEventObserver, Throwable th) {
        lifecycleEventObserver.isRunning.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
