package com.yandex.div.core;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramNamesKt;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivCreationTracker.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\r\u001a\u00020\u0006R\u0016\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/DivCreationTracker;", "", "contextCreationStarted", "", "(J)V", "contextCreateCallType", "", "getContextCreateCallType$annotations", "()V", "contextCreatedTime", "contextCreationReported", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstViewCreate", "viewCreateCallType", "getViewCreateCallType", "()Ljava/lang/String;", "onContextCreationFinished", "", "sendContextCreationHistogram", "histogramReporter", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "sendHistograms", "viewCreationStart", "viewCreationFinish", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DivCreationTracker {
    private static final long INVALID_TIME = -1;

    @NotNull
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;

    @NotNull
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;

    @NotNull
    private final AtomicBoolean isFirstViewCreate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);

    @NotNull
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);

    @HistogramCallType
    private static /* synthetic */ void getContextCreateCallType$annotations() {
    }

    public DivCreationTracker(long j) {
        this.contextCreationStarted = j;
        this.contextCreateCallType = isColdContextCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        this.isFirstViewCreate = new AtomicBoolean(true);
    }

    @HistogramCallType
    @NotNull
    public final String getViewCreateCallType() {
        if (this.isFirstViewCreate.compareAndSet(true, false)) {
            if (isColdViewCreate.compareAndSet(true, false)) {
                return "Cold";
            }
            return "Cool";
        }
        return "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = INSTANCE.getCurrentUptimeMillis();
    }

    public final void sendHistograms(long viewCreationStart, long viewCreationFinish, @NotNull HistogramReporter histogramReporter, @HistogramCallType @NotNull String viewCreateCallType) {
        if (viewCreationFinish < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_VIEW_CREATE_HISTOGRAM, viewCreationFinish - viewCreationStart, null, viewCreateCallType, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j = this.contextCreatedTime;
        if (j < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_CONTEXT_CREATE_HISTOGRAM, j - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    /* compiled from: DivCreationTracker.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/DivCreationTracker$Companion;", "", "()V", "INVALID_TIME", "", "currentUptimeMillis", "getCurrentUptimeMillis", "()J", "isColdContextCreate", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isColdViewCreate", "resetColdCreation", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @VisibleForTesting
        public final void resetColdCreation() {
            DivCreationTracker.isColdContextCreate.set(true);
            DivCreationTracker.isColdViewCreate.set(true);
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }
    }
}
