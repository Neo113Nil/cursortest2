package com.mobilefuse.sdk.telemetry.loggers;

import com.mobilefuse.sdk.AppLifecycleHelper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: DeviceLogsHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes13.dex */
final class DeviceLogsHandler$startExecutors$1 extends Lambda implements Function0 {
    final /* synthetic */ DeviceLogsHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceLogsHandler$startExecutors$1(DeviceLogsHandler deviceLogsHandler) {
        super(0);
        this.this$0 = deviceLogsHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        long j;
        long j2;
        long j3;
        long j4;
        this.this$0.setDeleteScheduler$mobilefuse_sdk_telemetry_release(Executors.newSingleThreadScheduledExecutor());
        ScheduledExecutorService deleteScheduler = this.this$0.getDeleteScheduler();
        if (deleteScheduler != null) {
            Runnable runnable = new Runnable() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler$startExecutors$1.1
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceLogsHandler$startExecutors$1.this.this$0.removeLogs();
                }
            };
            j3 = this.this$0.TIME_TO_DELETE_LOGS;
            j4 = this.this$0.TIME_TO_DELETE_LOGS;
            deleteScheduler.scheduleWithFixedDelay(runnable, j3, j4, TimeUnit.MILLISECONDS);
        }
        this.this$0.setSessionScheduler$mobilefuse_sdk_telemetry_release(Executors.newSingleThreadScheduledExecutor());
        ScheduledExecutorService sessionScheduler = this.this$0.getSessionScheduler();
        if (sessionScheduler != null) {
            Runnable runnable2 = new Runnable() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler$startExecutors$1.2
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceLogsHandler$startExecutors$1.this.this$0.checkTimeLimitExpiry();
                }
            };
            j = this.this$0.TIME_SESSION;
            j2 = this.this$0.TIME_SESSION;
            sessionScheduler.scheduleWithFixedDelay(runnable2, j, j2, TimeUnit.MILLISECONDS);
        }
        AppLifecycleHelper.addActivityLifecycleObserver(new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.telemetry.loggers.DeviceLogsHandler$startExecutors$1$activityLifecycleObserver$1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onApplicationInBackground() {
                DeviceLogsHandler$startExecutors$1.this.this$0.isAppInBackground = true;
            }

            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onApplicationInForeground() {
                boolean z;
                DeviceLogsHandler$startExecutors$1.this.this$0.isAppInBackground = false;
                z = DeviceLogsHandler$startExecutors$1.this.this$0.hasPendingFlush;
                if (z) {
                    DeviceLogsHandler$startExecutors$1.this.this$0.hasPendingFlush = false;
                    DeviceLogsHandler$startExecutors$1.this.this$0.sendDeviceLogs();
                }
            }
        });
    }
}
