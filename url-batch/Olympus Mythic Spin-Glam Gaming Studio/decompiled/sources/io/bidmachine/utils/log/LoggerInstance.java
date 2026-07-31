package io.bidmachine.utils.log;

import androidx.annotation.NonNull;
import io.bidmachine.utils.lazy.LazyValue;

/* loaded from: classes4.dex */
public interface LoggerInstance {
    void d(@NonNull LazyValue<String> lazyValue);

    void d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue);

    void d(@NonNull Object obj, @NonNull String str);

    void d(@NonNull String str);

    void e(@NonNull LazyValue<String> lazyValue);

    void e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue);

    void e(@NonNull Object obj, @NonNull String str);

    void e(@NonNull Object obj, @NonNull Throwable th);

    void e(@NonNull String str);

    void e(@NonNull Throwable th);

    void w(@NonNull LazyValue<String> lazyValue);

    void w(@NonNull Object obj, @NonNull LazyValue<String> lazyValue);

    void w(@NonNull Object obj, @NonNull String str);

    void w(@NonNull Object obj, @NonNull Throwable th);

    void w(@NonNull String str);

    void w(@NonNull Throwable th);
}
