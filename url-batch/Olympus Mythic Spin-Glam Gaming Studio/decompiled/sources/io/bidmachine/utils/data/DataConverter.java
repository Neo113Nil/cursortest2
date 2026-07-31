package io.bidmachine.utils.data;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface DataConverter {
    default boolean toBoolean(@Nullable Object obj, boolean z) {
        Boolean booleanOrNull = toBooleanOrNull(obj);
        return booleanOrNull != null ? booleanOrNull.booleanValue() : z;
    }

    @Nullable
    default Boolean toBooleanOrNull(@Nullable Object obj) {
        return toBooleanOrNull(obj, null);
    }

    @Nullable
    Boolean toBooleanOrNull(@Nullable Object obj, @Nullable Boolean bool);

    default double toDouble(@Nullable Object obj, double d) {
        Double doubleOrNull = toDoubleOrNull(obj);
        return doubleOrNull != null ? doubleOrNull.doubleValue() : d;
    }

    @Nullable
    default Double toDoubleOrNull(@Nullable Object obj) {
        return toDoubleOrNull(obj, null);
    }

    @Nullable
    Double toDoubleOrNull(@Nullable Object obj, @Nullable Double d);

    default float toFloat(@Nullable Object obj, float f) {
        Float floatOrNull = toFloatOrNull(obj);
        return floatOrNull != null ? floatOrNull.floatValue() : f;
    }

    @Nullable
    default Float toFloatOrNull(@Nullable Object obj) {
        return toFloatOrNull(obj, null);
    }

    @Nullable
    Float toFloatOrNull(@Nullable Object obj, @Nullable Float f);

    default int toInteger(@Nullable Object obj, int i) {
        Integer integerOrNull = toIntegerOrNull(obj);
        return integerOrNull != null ? integerOrNull.intValue() : i;
    }

    @Nullable
    default Integer toIntegerOrNull(@Nullable Object obj) {
        return toIntegerOrNull(obj, null);
    }

    @Nullable
    Integer toIntegerOrNull(@Nullable Object obj, @Nullable Integer num);

    @Nullable
    List<Object> toListOrNull(@Nullable Object obj);

    @Nullable
    Map<Object, Object> toMapOrNull(@Nullable Object obj);

    @Nullable
    default <T> T toOrNull(@Nullable Object obj) throws Exception {
        return (T) toOrNull(obj, null);
    }

    @Nullable
    <T> T toOrNull(@Nullable Object obj, @Nullable T t) throws Exception;

    @Nullable
    default String toStringOrNull(@Nullable Object obj) {
        return toStringOrNull(obj, null);
    }

    @Nullable
    String toStringOrNull(@Nullable Object obj, @Nullable String str);
}
