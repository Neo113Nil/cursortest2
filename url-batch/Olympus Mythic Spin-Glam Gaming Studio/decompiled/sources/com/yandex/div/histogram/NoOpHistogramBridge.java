package com.yandex.div.histogram;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: NoOpHistogramBridge.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J0\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J0\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0016J8\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\nH\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/histogram/NoOpHistogramBridge;", "Lcom/yandex/div/histogram/HistogramBridge;", "()V", "recordBooleanHistogram", "", "name", "", "sample", "", "recordCountHistogram", "", "min", "max", "bucketCount", "recordEnumeratedHistogram", "boundary", "recordLinearCountHistogram", "recordSparseSlowlyHistogram", "recordTimeHistogram", IronSourceConstants.EVENTS_DURATION, "", "unit", "Ljava/util/concurrent/TimeUnit;", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NoOpHistogramBridge implements HistogramBridge {
    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordBooleanHistogram(@NotNull String name, boolean sample) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordCountHistogram(@NotNull String name, int sample, int min, int max, int bucketCount) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordEnumeratedHistogram(@NotNull String name, int sample, int boundary) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordLinearCountHistogram(@NotNull String name, int sample, int min, int max, int bucketCount) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordSparseSlowlyHistogram(@NotNull String name, int sample) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordTimeHistogram(@NotNull String name, long duration, long min, long max, @NotNull TimeUnit unit, int bucketCount) {
    }
}
