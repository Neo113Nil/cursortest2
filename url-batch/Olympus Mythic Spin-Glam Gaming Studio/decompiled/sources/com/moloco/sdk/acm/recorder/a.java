package com.moloco.sdk.acm.recorder;

import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.acm.AndroidClientMetrics;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
/* loaded from: classes10.dex */
public final class a implements MetricsRecorder {

    @Nullable
    public final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public void recordCountEvent(@NotNull CountEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.a;
        if (str == null || str.length() == 0) {
            AndroidClientMetrics.INSTANCE.recordCountEvent$moloco_android_client_metrics_release(event);
        } else {
            AndroidClientMetrics.INSTANCE.recordCountEvent$moloco_android_client_metrics_release(event.withTag(b.a, this.a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public void recordTimerEvent(@NotNull TimerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.a;
        if (str == null || str.length() == 0) {
            AndroidClientMetrics.INSTANCE.recordTimerEvent$moloco_android_client_metrics_release(event);
        } else {
            AndroidClientMetrics.INSTANCE.recordTimerEvent$moloco_android_client_metrics_release(event.withTag(b.a, this.a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    @NotNull
    public TimerEvent startTimerEvent(@NotNull String str) {
        return MetricsRecorder.a.a(this, str);
    }

    public a(@Nullable String str) {
        this.a = str;
    }

    public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
