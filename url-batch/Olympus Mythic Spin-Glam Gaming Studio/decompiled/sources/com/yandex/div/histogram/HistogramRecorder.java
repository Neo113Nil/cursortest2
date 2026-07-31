package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class HistogramRecorder {

    @NonNull
    private final HistogramBridge mBridge;

    public HistogramRecorder(@NonNull HistogramBridge histogramBridge) {
        this.mBridge = histogramBridge;
    }

    public void recordBooleanHistogram(@NonNull String str, boolean z) {
        this.mBridge.recordBooleanHistogram(str, z);
    }

    public void recordEnumeratedHistogram(@NonNull String str, int i, int i2) {
        this.mBridge.recordEnumeratedHistogram(str, i, i2);
    }

    public void recordPercentageHistogram(@NonNull String str, int i) {
        this.mBridge.recordLinearCountHistogram(str, i, 1, 101, 102);
    }

    public void recordLinearCountHistogram(@NonNull String str, int i, int i2, int i3, int i4) {
        this.mBridge.recordLinearCountHistogram(str, i, i2, i3, i4);
    }

    public void recordCount100Histogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 100, 50);
    }

    public void recordCount1KHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 1000, 50);
    }

    public void recordCount10KHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 10000, 50);
    }

    public void recordCount100KHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 100000, 50);
    }

    public void recordCount1MHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 1000000, 50);
    }

    public void recordCustomCountHistogram(@NonNull String str, int i, int i2, int i3, int i4) {
        this.mBridge.recordCountHistogram(str, i, i2, i3, i4);
    }

    public void recordShortTimeHistogram(@NonNull String str, long j, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j), 1L, 10000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordMediumTimeHistogram(@NonNull String str, long j, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j), 1L, 180000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordLongTimeHistogram(@NonNull String str, long j, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j), 1L, 3600000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordCustomTimeHistogram(@NonNull String str, long j, long j2, long j3, @NonNull TimeUnit timeUnit, int i) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j), timeUnit.toMillis(j2), timeUnit.toMillis(j3), TimeUnit.MILLISECONDS, i);
    }

    public void recordMemoryKbHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1000, 500000, 50);
    }

    public void recordMemoryMbHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 1000, 50);
    }

    public void recordLargeMemoryMbHistogram(@NonNull String str, int i) {
        this.mBridge.recordCountHistogram(str, i, 1, 64000, 100);
    }

    public void recordSparseSlowlyHistogram(@NonNull String str, int i) {
        this.mBridge.recordSparseSlowlyHistogram(str, i);
    }
}
