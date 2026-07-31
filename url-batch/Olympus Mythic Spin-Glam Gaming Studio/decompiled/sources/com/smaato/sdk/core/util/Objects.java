package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.fi.Consumer;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Objects {
    public static boolean isNull(@Nullable Object obj) {
        return obj == null;
    }

    @NonNull
    public static <T> T notNull(@Nullable T t, @NonNull T t2) {
        return t != null ? t : t2;
    }

    private Objects() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }
        return Arrays.hashCode(objArr);
    }

    public static boolean notEquals(Object obj, Object obj2) {
        return !equals(obj, obj2);
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t) {
        return (T) requireNonNull(t, null);
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t, @Nullable String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> void onNotNull(@Nullable T t, @NonNull Consumer<T> consumer) {
        requireNonNull(consumer);
        if (t != null) {
            consumer.accept(t);
        }
    }

    public static int getIntValueFromMap(@NonNull Map<String, Integer> map, @NonNull String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
