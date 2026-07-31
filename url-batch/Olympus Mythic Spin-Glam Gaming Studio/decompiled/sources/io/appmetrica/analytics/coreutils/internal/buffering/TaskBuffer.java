package io.appmetrica.analytics.coreutils.internal.buffering;

import com.safedk.android.analytics.brandsafety.m;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/buffering/TaskBuffer;", "T", "", m.l, "", "task", "(Ljava/lang/Object;)V", "getAndClear", "", "isEmpty", "", "core-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface TaskBuffer<T> {
    void add(T task);

    @NotNull
    List<T> getAndClear();

    boolean isEmpty();
}
