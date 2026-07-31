package com.mobilefuse.sdk.service.impl;

import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExceptionHandlerSampleRateUpdateService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0002\b\bJ\b\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/ExceptionHandlerSampleRateUpdateService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "()V", "initServiceImpl", "", "completeAction", "Lkotlin/Function2;", "", "initServiceImpl$mobilefuse_sdk_core_release", "resetImpl", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class ExceptionHandlerSampleRateUpdateService extends MobileFuseService {

    @NotNull
    public static final ExceptionHandlerSampleRateUpdateService INSTANCE = new ExceptionHandlerSampleRateUpdateService();

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }

    private ExceptionHandlerSampleRateUpdateService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2 completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        TelemetryManager.INSTANCE.updateSampleRateFromServer();
        completeAction.invoke(this, Boolean.TRUE);
    }
}
