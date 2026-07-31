package com.yandex.div.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\u001a.\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\b\"\u0004\b\u0000\u0010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0001H\u0000¢\u0006\u0002\u0010\u000b\u001a?\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\r0\u000f2\u0006\u0010\u0010\u001a\u0002H\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0017H\u0080\b\u001a?\u0010\u0018\u001a\u0002H\r\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\r0\u00192\u0006\u0010\u0010\u001a\u0002H\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\u0010\u0013¨\u0006\u001a"}, d2 = {"makeIf", "T", "shouldMake", "", "constructor", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "weak", "Lkotlin/properties/ReadWriteProperty;", "", "obj", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "getOrThrow", "V", "K", "", "key", "message", "", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "removeFirstIf", "", "predicate", "Lkotlin/Function1;", "removeOrThrow", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UtilsKt {
    public static final <T> boolean removeFirstIf(@NotNull Collection<T> collection, @NotNull Function1 function1) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object removeOrThrow$default(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return removeOrThrow(map, obj, str);
    }

    public static final <K, V> V removeOrThrow(@NotNull Map<? extends K, V> map, K k, @Nullable String str) {
        V v = (V) TypeIntrinsics.asMutableMap(map).remove(k);
        if (v != null) {
            return v;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    public static final <K, V> V getOrThrow(@NotNull Map<? extends K, ? extends V> map, K k, @Nullable String str) {
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        throw new NoSuchElementException(str);
    }

    @NotNull
    public static final <T> ReadWriteProperty weak(@Nullable T t) {
        return new WeakRef(t);
    }

    public static /* synthetic */ ReadWriteProperty weak$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return weak(obj);
    }

    @Nullable
    public static final <T> T makeIf(boolean z, @NotNull Function0 function0) {
        if (z) {
            return (T) function0.mo4828invoke();
        }
        return null;
    }
}
