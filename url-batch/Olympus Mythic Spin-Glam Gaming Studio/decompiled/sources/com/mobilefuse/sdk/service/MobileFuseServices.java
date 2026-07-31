package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseServices.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J(\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c\u0012\u0004\u0012\u00020\u00190\u001bH\u0007J6\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c\u0012\u0004\u0012\u00020\u00190\u001bH\u0007J\u001b\u0010\"\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!H\u0000¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\u0019H\u0007J\u0016\u0010$\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0007J$\u0010&\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0007J\b\u0010'\u001a\u00020\u0019H\u0007R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\r8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/mobilefuse/sdk/service/MobileFuseServices;", "", "()V", "<set-?>", "", "allServicesInitialized", "getAllServicesInitialized", "()Z", "registeredServices", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "getRegisteredServices$mobilefuse_sdk_core_release", "()Ljava/util/Set;", "", "sdkDisableReason", "getSdkDisableReason$annotations", "getSdkDisableReason", "()Ljava/lang/String;", "sdkEnabled", "getSdkEnabled$annotations", "getSdkEnabled", "servicesResultMap", "", "deviceMeetsMobileFuseSdkRequirements", "initAllServices", "", "completeAction", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/service/ServicesInitError;", "Lcom/mobilefuse/sdk/service/ServicesInitResult;", "initServices", "services", "", "registerServices", "registerServices$mobilefuse_sdk_core_release", "requireAllServices", "Lkotlin/Function0;", "requireServices", "resetAllServices", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class MobileFuseServices {
    private static boolean allServicesInitialized;

    @Nullable
    private static String sdkDisableReason;

    @NotNull
    public static final MobileFuseServices INSTANCE = new MobileFuseServices();
    private static boolean sdkEnabled = true;

    @NotNull
    private static final Set<MobileFuseService> registeredServices = new LinkedHashSet();
    private static final Map<MobileFuseService, Boolean> servicesResultMap = new LinkedHashMap();

    public static /* synthetic */ void getSdkDisableReason$annotations() {
    }

    public static /* synthetic */ void getSdkEnabled$annotations() {
    }

    public static final void resetAllServices() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            allServicesInitialized = false;
            sdkEnabled = true;
            sdkDisableReason = null;
            servicesResultMap.clear();
            Iterator<T> it = registeredServices.iterator();
            while (it.hasNext()) {
                ((MobileFuseService) it.next()).reset();
            }
            registeredServices.clear();
        } catch (Throwable th) {
            int i = MobileFuseServices$resetAllServices$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private MobileFuseServices() {
    }

    public static final boolean getSdkEnabled() {
        return sdkEnabled;
    }

    @Nullable
    public static final String getSdkDisableReason() {
        return sdkDisableReason;
    }

    @NotNull
    public final Set<MobileFuseService> getRegisteredServices$mobilefuse_sdk_core_release() {
        return registeredServices;
    }

    public final boolean getAllServicesInitialized() {
        return allServicesInitialized;
    }

    public final void registerServices$mobilefuse_sdk_core_release(@NotNull Set<? extends MobileFuseService> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        CollectionsKt.addAll(registeredServices, services);
    }

    public static final void requireAllServices() {
        requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$requireAllServices$1
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

    public static final void requireAllServices(@NotNull final Function0 completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initAllServices(new Function1() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$requireAllServices$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Either<ServicesInitError, ServicesInitResult>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Either<ServicesInitError, ServicesInitResult> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    Function0.this.mo4828invoke();
                } else {
                    boolean z = result instanceof ErrorResult;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deviceMeetsMobileFuseSdkRequirements() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (MobileFuseServices$deviceMeetsMobileFuseSdkRequirements$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!sdkEnabled) {
            return false;
        }
        if (!Utils.isJavaVersionSupported()) {
            sdkDisableReason = "The MobileFuse SDK requires Java 8 or higher.";
            sdkEnabled = false;
        }
        errorResult = new SuccessResult(Boolean.valueOf(sdkEnabled));
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        } else {
            value = Boolean.FALSE;
        }
        return ((Boolean) value).booleanValue();
    }

    public static final void initAllServices(@NotNull Function1 completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initServices(registeredServices, completeAction);
    }

    public static final void requireServices(@NotNull Set<? extends MobileFuseService> services, @NotNull final Function0 completeAction) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initServices(services, new Function1() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$requireServices$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Either<ServicesInitError, ServicesInitResult>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Either<ServicesInitError, ServicesInitResult> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    Function0.this.mo4828invoke();
                } else {
                    boolean z = result instanceof ErrorResult;
                }
            }
        });
    }

    public static final void initServices(@NotNull Set<? extends MobileFuseService> services, @NotNull Function1 completeAction) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        SchedulersKt.safelyRunOnMainThread$default(null, new MobileFuseServices$initServices$1(services, completeAction), 1, null);
    }
}
