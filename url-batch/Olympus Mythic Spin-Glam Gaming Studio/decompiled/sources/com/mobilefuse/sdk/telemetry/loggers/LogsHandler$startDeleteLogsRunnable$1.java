package com.mobilefuse.sdk.telemetry.loggers;

import android.os.Handler;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: LogsHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes10.dex */
final class LogsHandler$startDeleteLogsRunnable$1 extends Lambda implements Function0 {
    final /* synthetic */ LogsHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogsHandler$startDeleteLogsRunnable$1(LogsHandler logsHandler) {
        super(0);
        this.this$0 = logsHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1$deleteRunnable$1, java.lang.Runnable] */
    public final void invoke() {
        final ?? r0 = new Runnable() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1$deleteRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                long j;
                LogsHandler$startDeleteLogsRunnable$1.this.this$0.removeLogs$mobilefuse_sdk_telemetry_release();
                Handler globalHandler = SchedulersKt.getGlobalHandler();
                j = LogsHandler$startDeleteLogsRunnable$1.this.this$0.JOB_TIME_TO_CHECK_LOGS;
                globalHandler.postDelayed(this, j);
            }
        };
        SchedulersKt.getGlobalHandler().post(r0);
        AppLifecycleHelper.addActivityLifecycleObserver(new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.telemetry.loggers.LogsHandler$startDeleteLogsRunnable$1$activityLifecycleObserver$1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onApplicationInBackground() {
                SchedulersKt.getGlobalHandler().removeCallbacks(LogsHandler$startDeleteLogsRunnable$1$deleteRunnable$1.this);
            }

            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onApplicationInForeground() {
                SchedulersKt.getGlobalHandler().post(LogsHandler$startDeleteLogsRunnable$1$deleteRunnable$1.this);
            }
        });
    }
}
