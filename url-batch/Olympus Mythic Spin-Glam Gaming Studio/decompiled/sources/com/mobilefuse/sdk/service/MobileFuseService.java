package com.mobilefuse.sdk.service;

import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0014\u001a\u00020\u00072\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002J \u0010\u0016\u001a\u00020\u00072\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J'\u0010\u0017\u001a\u00020\u00072\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H!¢\u0006\u0002\b\u0019J\u0006\u0010\u001a\u001a\u00020\u0007J\b\u0010\u001b\u001a\u00020\u0007H$R&\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\tX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/service/MobileFuseService;", "", "()V", "awaitingCallbacks", "", "Lkotlin/Function2;", "", "", "currentInitAttempt", "", "maxInitAttempts", "getMaxInitAttempts", "()I", "value", "Lcom/mobilefuse/sdk/service/ServiceInitState;", "state", "getState", "()Lcom/mobilefuse/sdk/service/ServiceInitState;", "setState", "(Lcom/mobilefuse/sdk/service/ServiceInitState;)V", "doInitialization", "onComplete", "initService", "initServiceImpl", "completeAction", "initServiceImpl$mobilefuse_sdk_core_release", TimerController.RESET_COMMAND, "resetImpl", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public abstract class MobileFuseService {
    private int currentInitAttempt;

    @NotNull
    private ServiceInitState state = ServiceInitState.IDLE;
    private final int maxInitAttempts = 1;
    private final List<Function2> awaitingCallbacks = new ArrayList();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceInitState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ServiceInitState.IDLE.ordinal()] = 1;
            iArr[ServiceInitState.INITIALIZING.ordinal()] = 2;
            iArr[ServiceInitState.INITIALIZED.ordinal()] = 3;
            iArr[ServiceInitState.ERROR.ordinal()] = 4;
        }
    }

    @VisibleForTesting
    public abstract void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2 completeAction);

    protected abstract void resetImpl();

    @NotNull
    public final ServiceInitState getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ServiceInitState serviceInitState) {
        MobileFuseServices_LogsKt.logServiceDebug(this, "Change state from " + this.state + " to " + serviceInitState);
        this.state = serviceInitState;
    }

    protected int getMaxInitAttempts() {
        return this.maxInitAttempts;
    }

    public final void initService(@NotNull Function2 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            doInitialization(onComplete);
            return;
        }
        if (i == 2) {
            this.awaitingCallbacks.add(onComplete);
            return;
        }
        if (i == 3) {
            onComplete.invoke(this, Boolean.TRUE);
        } else {
            if (i != 4) {
                return;
            }
            if (this.currentInitAttempt < getMaxInitAttempts()) {
                doInitialization(onComplete);
            } else {
                onComplete.invoke(this, Boolean.TRUE);
            }
        }
    }

    private final void doInitialization(Function2 onComplete) {
        this.currentInitAttempt++;
        setState(ServiceInitState.INITIALIZING);
        this.awaitingCallbacks.add(onComplete);
        initServiceImpl$mobilefuse_sdk_core_release(new Function2() { // from class: com.mobilefuse.sdk.service.MobileFuseService$doInitialization$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((MobileFuseService) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull MobileFuseService mfService, boolean z) {
                List list;
                List list2;
                int i;
                Intrinsics.checkNotNullParameter(mfService, "mfService");
                MobileFuseService.this.setState(z ? ServiceInitState.INITIALIZED : ServiceInitState.ERROR);
                list = MobileFuseService.this.awaitingCallbacks;
                List<Function2> list3 = CollectionsKt.toList(list);
                list2 = MobileFuseService.this.awaitingCallbacks;
                list2.clear();
                for (Function2 function2 : list3) {
                    i = MobileFuseService.this.currentInitAttempt;
                    function2.invoke(mfService, Boolean.valueOf(i >= MobileFuseService.this.getMaxInitAttempts() ? true : z));
                }
            }
        });
    }

    public final void reset() {
        setState(ServiceInitState.IDLE);
        this.currentInitAttempt = 0;
        this.awaitingCallbacks.clear();
        resetImpl();
    }
}
