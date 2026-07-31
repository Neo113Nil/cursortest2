package io.appmetrica.analytics.coreutils.internal.buffering;

import com.safedk.android.analytics.brandsafety.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/buffering/MapMergingBuffer;", "K", "V", "Lio/appmetrica/analytics/coreutils/internal/buffering/TaskBuffer;", "", "task", "", m.l, "", "getAndClear", "", "isEmpty", "<init>", "()V", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MapMergingBuffer<K, V> implements TaskBuffer<Map<K, ? extends V>> {
    private final LinkedHashMap a = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.buffering.TaskBuffer
    @NotNull
    public List<Map<K, V>> getAndClear() {
        if (this.a.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Map map = MapsKt.toMap(this.a);
        this.a.clear();
        return CollectionsKt.listOf(map);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.buffering.TaskBuffer
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.buffering.TaskBuffer
    public void add(@NotNull Map<K, ? extends V> task) {
        this.a.putAll(task);
    }
}
