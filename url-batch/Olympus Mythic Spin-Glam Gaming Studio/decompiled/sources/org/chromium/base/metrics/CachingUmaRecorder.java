package org.chromium.base.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes14.dex */
final class CachingUmaRecorder implements UmaRecorder {
    private UmaRecorder mDelegate;
    private final ReentrantReadWriteLock mRwLock = new ReentrantReadWriteLock(false);
    private Map mHistogramByName = new HashMap();
    private final AtomicInteger mDroppedHistogramSampleCount = new AtomicInteger();
    private List mUserActions = new ArrayList();

    CachingUmaRecorder() {
    }

    static class Histogram {
        private final int mMax;
        private final int mMin;
        private final String mName;
        private final int mNumBuckets;
        private final List mSamples = new ArrayList(1);
        private final int mType;

        Histogram(int i, String str, int i2, int i3, int i4) {
            this.mType = i;
            this.mName = str;
            this.mMin = i2;
            this.mMax = i3;
            this.mNumBuckets = i4;
        }

        synchronized boolean addSample(int i, String str, int i2, int i3, int i4, int i5) {
            if (this.mSamples.size() >= 256) {
                return false;
            }
            this.mSamples.add(Integer.valueOf(i2));
            return true;
        }
    }

    private void cacheOrRecordHistogramSample(int i, String str, int i2, int i3, int i4, int i5) {
        if (tryAppendOrRecordSample(i, str, i2, i3, i4, i5)) {
            return;
        }
        this.mRwLock.writeLock().lock();
        try {
            if (this.mDelegate == null) {
                cacheHistogramSampleAlreadyWriteLocked(i, str, i2, i3, i4, i5);
                return;
            }
            this.mRwLock.readLock().lock();
            try {
                recordHistogramSampleAlreadyLocked(i, str, i2, i3, i4, i5);
            } finally {
                this.mRwLock.readLock().unlock();
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    private boolean tryAppendOrRecordSample(int i, String str, int i2, int i3, int i4, int i5) {
        this.mRwLock.readLock().lock();
        try {
            if (this.mDelegate != null) {
                recordHistogramSampleAlreadyLocked(i, str, i2, i3, i4, i5);
            } else {
                Histogram histogram = (Histogram) this.mHistogramByName.get(str);
                if (histogram != null) {
                    if (!histogram.addSample(i, str, i2, i3, i4, i5)) {
                        this.mDroppedHistogramSampleCount.incrementAndGet();
                    }
                } else {
                    this.mRwLock.readLock().unlock();
                    return false;
                }
            }
            return true;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    private void cacheHistogramSampleAlreadyWriteLocked(int i, String str, int i2, int i3, int i4, int i5) {
        Histogram histogram = (Histogram) this.mHistogramByName.get(str);
        if (histogram == null) {
            if (this.mHistogramByName.size() >= 256) {
                this.mDroppedHistogramSampleCount.incrementAndGet();
                return;
            } else {
                Histogram histogram2 = new Histogram(i, str, i3, i4, i5);
                this.mHistogramByName.put(str, histogram2);
                histogram = histogram2;
            }
        }
        if (histogram.addSample(i, str, i2, i3, i4, i5)) {
            return;
        }
        this.mDroppedHistogramSampleCount.incrementAndGet();
    }

    private void recordHistogramSampleAlreadyLocked(int i, String str, int i2, int i3, int i4, int i5) {
        if (i == 1) {
            this.mDelegate.recordBooleanHistogram(str, i2 != 0);
            return;
        }
        if (i == 2) {
            this.mDelegate.recordExponentialHistogram(str, i2, i3, i4, i5);
            return;
        }
        if (i == 3) {
            this.mDelegate.recordLinearHistogram(str, i2, i3, i4, i5);
        } else {
            if (i == 4) {
                this.mDelegate.recordSparseHistogram(str, i2);
                return;
            }
            throw new UnsupportedOperationException("Unknown histogram type " + i);
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(String str, boolean z) {
        cacheOrRecordHistogramSample(1, str, z ? 1 : 0, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(String str, int i, int i2, int i3, int i4) {
        cacheOrRecordHistogramSample(2, str, i, i2, i3, i4);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(String str, int i, int i2, int i3, int i4) {
        cacheOrRecordHistogramSample(3, str, i, i2, i3, i4);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(String str, int i) {
        cacheOrRecordHistogramSample(4, str, i, 0, 0, 0);
    }
}
