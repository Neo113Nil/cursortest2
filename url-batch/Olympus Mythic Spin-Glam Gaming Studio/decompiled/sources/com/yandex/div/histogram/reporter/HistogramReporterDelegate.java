package com.yandex.div.histogram.reporter;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.histogram.HistogramCallType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HistogramReporterDelegate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "", "reportDuration", "", "histogramName", "", IronSourceConstants.EVENTS_DURATION, "", "forceCallType", "reportSize", "size", "", "NoOp", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface HistogramReporterDelegate {
    void reportDuration(@NotNull String histogramName, long duration, @HistogramCallType @Nullable String forceCallType);

    void reportSize(@NotNull String histogramName, int size);

    static /* synthetic */ void reportDuration$default(HistogramReporterDelegate histogramReporterDelegate, String str, long j, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        histogramReporterDelegate.reportDuration(str, j, str2);
    }

    /* compiled from: HistogramReporterDelegate.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate$NoOp;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "()V", "reportDuration", "", "histogramName", "", IronSourceConstants.EVENTS_DURATION, "", "forceCallType", "reportSize", "size", "", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoOp implements HistogramReporterDelegate {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(@NotNull String histogramName, long duration, @HistogramCallType @Nullable String forceCallType) {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportSize(@NotNull String histogramName, int size) {
        }

        private NoOp() {
        }
    }
}
