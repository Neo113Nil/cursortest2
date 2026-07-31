package com.mobilefuse.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.SensorService;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.identity.DeviceIpService;
import com.mobilefuse.sdk.identity.EidServiceKt;
import com.mobilefuse.sdk.omid.OmidService;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.service.impl.AdvertisingIdService;
import com.mobilefuse.sdk.service.impl.DeviceCacheService;
import com.mobilefuse.sdk.service.impl.ExceptionHandlerSampleRateUpdateService;
import com.mobilefuse.sdk.service.impl.UserAgentService;
import com.mobilefuse.sdk.service.impl.ifv.AppSetIdService;
import com.mobilefuse.sdk.telemetry.Telemetry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: SdkInitializer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/internal/SdkInitializer;", "", "()V", "isInitialized", "", "ensureSdkSetup", "", "allowMfServicesAutoInit", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class SdkInitializer {

    @NotNull
    public static final SdkInitializer INSTANCE = new SdkInitializer();
    private static boolean isInitialized;

    public static final void ensureSdkSetup(boolean allowMfServicesAutoInit) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (isInitialized) {
                return;
            }
            isInitialized = true;
            Context globalContext = AppLifecycleHelper.getGlobalContext();
            Telemetry.INSTANCE.initialize(globalContext, "1.11.0");
            MobileFuseSettings.initSettings();
            Set of = SetsKt.setOf((Object[]) new MobileFuseService[]{AdvertisingIdService.INSTANCE, SensorService.INSTANCE, ExceptionHandlerSampleRateUpdateService.INSTANCE, EidServiceKt.getEidService(), DeviceCacheService.INSTANCE, AppSetIdService.INSTANCE, DeviceIpService.INSTANCE});
            MobileFuseServices mobileFuseServices = MobileFuseServices.INSTANCE;
            Set<? extends MobileFuseService> mutableSetOf = SetsKt.mutableSetOf(UserAgentService.INSTANCE, OmidService.INSTANCE);
            mutableSetOf.addAll(of);
            Unit unit = Unit.INSTANCE;
            mobileFuseServices.registerServices$mobilefuse_sdk_core_release(mutableSetOf);
            ApplicationInfo applicationInfo = globalContext.getPackageManager().getApplicationInfo(globalContext.getPackageName(), 128);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            if (bundle != null ? bundle.getBoolean("com.mobilefuse.sdk.disable_user_location") : false) {
                MobileFuseTargetingData.INSTANCE.setAllowLocation(false);
            }
            if (bundle != null && bundle.containsKey("com.mobilefuse.sdk.enable_eids")) {
                EidServiceKt.getEidService().setManagedModeEnabled(bundle.getBoolean("com.mobilefuse.sdk.enable_eids"));
            }
            if (allowMfServicesAutoInit) {
                if (bundle != null ? bundle.getBoolean("com.mobilefuse.sdk.disable_auto_init") : false) {
                    return;
                }
                MobileFuseServices.requireServices(of, new Function0() { // from class: com.mobilefuse.sdk.internal.SdkInitializer$ensureSdkSetup$1$2
                    public final void invoke() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }
                });
            }
        } catch (Throwable th) {
            int i = SdkInitializer$ensureSdkSetup$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private SdkInitializer() {
    }

    public static /* synthetic */ void ensureSdkSetup$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        ensureSdkSetup(z);
    }
}
