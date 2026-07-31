package com.moloco.sdk.internal.client_metrics_data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C1526a c = new C1526a(null);
    public static final int d = 8;

    @NotNull
    public static final String e = "AcmClickDeduper";

    @NotNull
    public final MetricsRecorder a;

    @NotNull
    public AtomicBoolean b;

    /* renamed from: com.moloco.sdk.internal.client_metrics_data.a$a, reason: collision with other inner class name */
    public static final class C1526a {
        public /* synthetic */ C1526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1526a() {
        }
    }

    public a(@NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = metricsRecorder;
        this.b = new AtomicBoolean(false);
    }

    public final void a() {
        this.b.set(false);
    }

    public final void a(@NotNull AdFormatType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (this.b.compareAndSet(false, true)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Deduped click logged", null, false, 12, null);
            MetricsRecorder metricsRecorder = this.a;
            CountEvent countEvent = new CountEvent(b.E.c());
            String c2 = d.c.c();
            String lowerCase = adType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        }
        this.b.set(true);
    }
}
