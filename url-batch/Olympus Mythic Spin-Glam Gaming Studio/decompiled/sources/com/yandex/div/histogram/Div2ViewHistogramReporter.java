package com.yandex.div.histogram;

import android.os.SystemClock;
import androidx.annotation.MainThread;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Div2ViewHistogramReporter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\u0006\u0010'\u001a\u00020#J\u0006\u0010(\u001a\u00020#J\u0006\u0010)\u001a\u00020#J\u0006\u0010*\u001a\u00020#J\u0006\u0010+\u001a\u00020#J\u0006\u0010,\u001a\u00020#J\u0006\u0010-\u001a\u00020#J\u0006\u0010.\u001a\u00020#J\u0006\u0010/\u001a\u00020#JL\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#06H\u0082\b¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u00109\u001a\u00020#H\u0002J\f\u0010:\u001a\u00020\t*\u00020\tH\u0002R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "", "histogramReporter", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/reporter/HistogramReporter;", "renderConfig", "Lcom/yandex/div/histogram/RenderConfiguration;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "bindingPausedTime", "", "Ljava/lang/Long;", "bindingResumedTime", "bindingStartedTime", "component", "", "getComponent", "()Ljava/lang/String;", "setComponent", "(Ljava/lang/String;)V", "currentUptime", "getCurrentUptime", "()J", "drawStartedTime", "layoutStartedTime", "measureStartedTime", "rebindingStartedTime", "renderMetrics", "Lcom/yandex/div/histogram/metrics/RenderMetrics;", "getRenderMetrics", "()Lcom/yandex/div/histogram/metrics/RenderMetrics;", "renderMetrics$delegate", "Lkotlin/Lazy;", "renderStarted", "", "onBindingFinished", "", "onBindingPaused", "onBindingResumed", "onBindingStarted", "onDrawFinished", "onDrawStarted", "onLayoutFinished", "onLayoutStarted", "onMeasureFinished", "onMeasureStarted", "onRebindingFinished", "onRebindingStarted", "onRenderStarted", "reportHistogram", "histogramName", "startTime", "pausedTime", "resumedTime", "onDuration", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "reportRenderMetrics", "resetRenderMetrics", "toTimePassed", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@MainThread
/* loaded from: classes12.dex */
public final class Div2ViewHistogramReporter {

    @Nullable
    private Long bindingPausedTime;

    @Nullable
    private Long bindingResumedTime;

    @Nullable
    private Long bindingStartedTime;

    @Nullable
    private String component;

    @Nullable
    private Long drawStartedTime;

    @NotNull
    private final Function0 histogramReporter;

    @Nullable
    private Long layoutStartedTime;

    @Nullable
    private Long measureStartedTime;

    @Nullable
    private Long rebindingStartedTime;

    @NotNull
    private final Function0 renderConfig;

    /* renamed from: renderMetrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy renderMetrics = LazyKt.lazy(LazyThreadSafetyMode.NONE, Div2ViewHistogramReporter$renderMetrics$2.INSTANCE);
    private boolean renderStarted;

    public Div2ViewHistogramReporter(@NotNull Function0 function0, @NotNull Function0 function02) {
        this.histogramReporter = function0;
        this.renderConfig = function02;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    public final void setComponent(@Nullable String str) {
        this.component = str;
    }

    private final RenderMetrics getRenderMetrics() {
        return (RenderMetrics) this.renderMetrics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    public final void onRenderStarted() {
        this.renderStarted = true;
    }

    public final void onBindingStarted() {
        this.bindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingPaused() {
        this.bindingPausedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingResumed() {
        this.bindingResumedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingFinished() {
        String str;
        long currentUptime;
        Long l = this.bindingStartedTime;
        Long l2 = this.bindingPausedTime;
        Long l3 = this.bindingResumedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l != null) {
            if (l2 != null && l3 != null) {
                currentUptime = ((getCurrentUptime() - l3.longValue()) + l2.longValue()) - l.longValue();
            } else if (l2 == null && l3 == null) {
                currentUptime = getCurrentUptime() - l.longValue();
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    str = "when " + HistogramNamesKt.DIV_BINDING_HISTOGRAM + " has paused time it should have resumed time and otherwise";
                    Assert.fail(str);
                }
            }
            renderMetrics.binding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.mo4828invoke(), HistogramNamesKt.DIV_BINDING_HISTOGRAM, currentUptime, getComponent(), null, null, 24, null);
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                str = "start time of " + HistogramNamesKt.DIV_BINDING_HISTOGRAM + " is null";
                Assert.fail(str);
            }
        }
        this.bindingStartedTime = null;
        this.bindingPausedTime = null;
        this.bindingResumedTime = null;
    }

    public final void onRebindingStarted() {
        this.rebindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRebindingFinished() {
        Long l = this.rebindingStartedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l != null) {
            long currentUptime = getCurrentUptime() - l.longValue();
            renderMetrics.rebinding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.mo4828invoke(), HistogramNamesKt.DIV_REBINDING_HISTOGRAM, currentUptime, getComponent(), null, null, 24, null);
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of " + HistogramNamesKt.DIV_REBINDING_HISTOGRAM + " is null");
            }
        }
        this.rebindingStartedTime = null;
    }

    public final void onMeasureStarted() {
        this.measureStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onMeasureFinished() {
        Long l = this.measureStartedTime;
        if (l != null) {
            getRenderMetrics().addMeasure(toTimePassed(l.longValue()));
        }
    }

    public final void onLayoutStarted() {
        this.layoutStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onLayoutFinished() {
        Long l = this.layoutStartedTime;
        if (l != null) {
            getRenderMetrics().addLayout(toTimePassed(l.longValue()));
        }
    }

    public final void onDrawStarted() {
        this.drawStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onDrawFinished() {
        Long l = this.drawStartedTime;
        if (l != null) {
            getRenderMetrics().addDraw(toTimePassed(l.longValue()));
        }
        if (this.renderStarted) {
            reportRenderMetrics(getRenderMetrics());
        }
        resetRenderMetrics();
    }

    private final void reportHistogram(String histogramName, Long startTime, Long pausedTime, Long resumedTime, Function1 onDuration) {
        long currentUptime;
        long longValue;
        if (startTime == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of " + histogramName + " is null");
                return;
            }
            return;
        }
        if (pausedTime != null && resumedTime != null) {
            currentUptime = (getCurrentUptime() - resumedTime.longValue()) + pausedTime.longValue();
            longValue = startTime.longValue();
        } else if (pausedTime == null && resumedTime == null) {
            currentUptime = getCurrentUptime();
            longValue = startTime.longValue();
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("when " + histogramName + " has paused time it should have resumed time and otherwise");
                return;
            }
            return;
        }
        long j = currentUptime - longValue;
        onDuration.invoke(Long.valueOf(j));
        HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.mo4828invoke(), histogramName, j, getComponent(), null, null, 24, null);
    }

    static /* synthetic */ void reportHistogram$default(Div2ViewHistogramReporter div2ViewHistogramReporter, String str, Long l, Long l2, Long l3, Function1 function1, int i, Object obj) {
        long currentUptime;
        Long l4 = (i & 4) != 0 ? null : l2;
        Long l5 = (i & 8) == 0 ? l3 : null;
        if (l == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of " + str + " is null");
                return;
            }
            return;
        }
        if (l4 != null && l5 != null) {
            currentUptime = ((div2ViewHistogramReporter.getCurrentUptime() - l5.longValue()) + l4.longValue()) - l.longValue();
        } else if (l4 == null && l5 == null) {
            currentUptime = div2ViewHistogramReporter.getCurrentUptime() - l.longValue();
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("when " + str + " has paused time it should have resumed time and otherwise");
                return;
            }
            return;
        }
        function1.invoke(Long.valueOf(currentUptime));
        HistogramReporter.reportDuration$default((HistogramReporter) div2ViewHistogramReporter.histogramReporter.mo4828invoke(), str, currentUptime, div2ViewHistogramReporter.getComponent(), null, null, 24, null);
    }

    private final void reportRenderMetrics(RenderMetrics renderMetrics) {
        HistogramReporter histogramReporter = (HistogramReporter) this.histogramReporter.mo4828invoke();
        RenderConfiguration renderConfiguration = (RenderConfiguration) this.renderConfig.mo4828invoke();
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_RENDER_TOTAL, renderMetrics.getTotalMs(), this.component, null, renderConfiguration.getTotalFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_RENDER_MEASURE, renderMetrics.getMeasureMs(), this.component, null, renderConfiguration.getMeasureFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_RENDER_LAYOUT, renderMetrics.getLayoutMs(), this.component, null, renderConfiguration.getLayoutFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_RENDER_DRAW, renderMetrics.getDrawMs(), this.component, null, renderConfiguration.getDrawFilter(), 8, null);
    }

    private final void resetRenderMetrics() {
        this.renderStarted = false;
        this.layoutStartedTime = null;
        this.measureStartedTime = null;
        this.drawStartedTime = null;
        getRenderMetrics().reset();
    }

    private final long toTimePassed(long j) {
        return getCurrentUptime() - j;
    }
}
