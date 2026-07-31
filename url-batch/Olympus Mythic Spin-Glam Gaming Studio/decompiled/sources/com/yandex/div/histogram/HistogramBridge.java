package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import com.yandex.div.core.annotations.PublicApi;
import java.util.concurrent.TimeUnit;

@PublicApi
/* loaded from: classes10.dex */
public interface HistogramBridge {
    void recordBooleanHistogram(@NonNull String str, boolean z);

    void recordCountHistogram(@NonNull String str, int i, int i2, int i3, int i4);

    void recordEnumeratedHistogram(@NonNull String str, int i, int i2);

    void recordLinearCountHistogram(@NonNull String str, int i, int i2, int i3, int i4);

    void recordSparseSlowlyHistogram(@NonNull String str, int i);

    void recordTimeHistogram(@NonNull String str, long j, long j2, long j3, @NonNull TimeUnit timeUnit, int i);
}
