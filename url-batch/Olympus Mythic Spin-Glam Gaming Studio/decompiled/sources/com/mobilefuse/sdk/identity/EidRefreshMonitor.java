package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.internal.IntervalTaskRunner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: EidRefreshMonitor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0005R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidRefreshMonitor;", "", "()V", "onTimeout", "Lkotlin/Function0;", "", "getOnTimeout", "()Lkotlin/jvm/functions/Function0;", "setOnTimeout", "(Lkotlin/jvm/functions/Function0;)V", "taskRunner", "Lcom/mobilefuse/sdk/internal/IntervalTaskRunner;", "onTaskRunnerComplete", "start", "", "timeoutTimestamp", "", "onlyFutureAllowed", "stop", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class EidRefreshMonitor {

    @Nullable
    private Function0 onTimeout;
    private IntervalTaskRunner taskRunner;

    @Nullable
    public final Function0 getOnTimeout() {
        return this.onTimeout;
    }

    public final void setOnTimeout(@Nullable Function0 function0) {
        this.onTimeout = function0;
    }

    public static /* synthetic */ boolean start$default(EidRefreshMonitor eidRefreshMonitor, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return eidRefreshMonitor.start(j, z);
    }

    public final boolean start(long timeoutTimestamp, boolean onlyFutureAllowed) {
        stop();
        if (timeoutTimestamp <= 0) {
            return false;
        }
        if (onlyFutureAllowed && timeoutTimestamp <= System.currentTimeMillis()) {
            return false;
        }
        long currentTimeMillis = timeoutTimestamp - System.currentTimeMillis();
        final EidRefreshMonitor$start$1 eidRefreshMonitor$start$1 = new EidRefreshMonitor$start$1(this);
        IntervalTaskRunner intervalTaskRunner = new IntervalTaskRunner(currentTimeMillis, false, new IntervalTaskRunner.Listener() { // from class: com.mobilefuse.sdk.identity.EidRefreshMonitor$sam$com_mobilefuse_sdk_internal_IntervalTaskRunner_Listener$0
            @Override // com.mobilefuse.sdk.internal.IntervalTaskRunner.Listener
            public final /* synthetic */ void onTaskRun() {
                Intrinsics.checkNotNullExpressionValue(Function0.this.mo4828invoke(), "invoke(...)");
            }
        });
        intervalTaskRunner.setRunInBackground(false);
        intervalTaskRunner.start();
        Unit unit = Unit.INSTANCE;
        this.taskRunner = intervalTaskRunner;
        return true;
    }

    public final void stop() {
        IntervalTaskRunner intervalTaskRunner = this.taskRunner;
        if (intervalTaskRunner != null) {
            intervalTaskRunner.reset();
        }
        this.taskRunner = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTaskRunnerComplete() {
        stop();
        Function0 function0 = this.onTimeout;
        if (function0 != null) {
        }
    }
}
