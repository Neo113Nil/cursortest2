package com.yandex.div.internal.util;

import androidx.collection.ArrayMap;
import com.yandex.div.core.annotations.InternalApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\tH\u0007\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a4\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\rH\u0007\u001aE\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f*\n\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00010\u0012H\u0087\b\u001aA\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u00010\u0012H\u0087\b\u001a?\u0010\u0014\u001a\u0002H\t\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u0010\u0012\u0006\b\u0001\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\r2\u0006\u0010\u0015\u001a\u0002H\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0007\u001a5\u0010\u001a\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000f*\n\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u00042\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u0004\u0012\u0004\u0012\u00020\u001b0\u001dH\u0087\b¨\u0006\u001e"}, d2 = {"allIsNullOrEmpty", "", "items", "", "", "([Ljava/util/List;)Z", "arrayMap", "", "K", "V", "initialCapacity", "", "source", "", "compareNullableWith", "T", "other", "comparator", "Lkotlin/Function2;", "compareWith", "getOrThrow", "key", "message", "", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "immutableCopy", "whenNotEmpty", "", "action", "Lkotlin/Function1;", "utils_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CollectionsKt {
    @InternalApi
    @NotNull
    public static final <K, V> Map<K, V> arrayMap() {
        return new ArrayMap();
    }

    @InternalApi
    @NotNull
    public static final <K, V> Map<K, V> arrayMap(int i) {
        return new ArrayMap(i);
    }

    @InternalApi
    @NotNull
    public static final <K, V> Map<K, V> arrayMap(@NotNull Map<K, ? extends V> map) {
        ArrayMap arrayMap = new ArrayMap(map.size());
        arrayMap.putAll(map);
        return arrayMap;
    }

    @InternalApi
    public static final <T> void whenNotEmpty(@Nullable List<? extends T> list, @NotNull Function1 function1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        function1.invoke(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalApi
    @NotNull
    public static final <T> List<T> immutableCopy(@NotNull List<? extends T> list) {
        return TypeIntrinsics.isMutableList(list) ? Collections.unmodifiableList(new ArrayList(list)) : list;
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    @InternalApi
    public static final <K, V> V getOrThrow(@NotNull Map<? extends K, ? extends V> map, K k, @Nullable String str) {
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        throw new NoSuchElementException(str);
    }

    @InternalApi
    public static final <T> boolean compareNullableWith(@Nullable List<? extends T> list, @Nullable List<? extends T> list2, @NotNull Function2 function2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null) {
            return false;
        }
        if (list.size() == list2.size()) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                if (((Boolean) function2.invoke(t, list2.get(i))).booleanValue()) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    @InternalApi
    public static final <T> boolean compareWith(@NotNull List<? extends T> list, @NotNull List<? extends T> list2, @NotNull Function2 function2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            if (!((Boolean) function2.invoke(t, list2.get(i))).booleanValue()) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    @InternalApi
    public static final boolean allIsNullOrEmpty(@NotNull List<?>... listArr) {
        for (List<?> list : listArr) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
