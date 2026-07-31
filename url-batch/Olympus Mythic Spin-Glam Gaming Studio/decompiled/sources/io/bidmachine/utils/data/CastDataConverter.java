package io.bidmachine.utils.data;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class CastDataConverter implements DataConverter {
    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Boolean toBooleanOrNull(@Nullable Object obj, @Nullable Boolean bool) {
        return obj instanceof Boolean ? (Boolean) obj : bool;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Double toDoubleOrNull(@Nullable Object obj, @Nullable Double d) {
        return obj instanceof Double ? (Double) obj : d;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Float toFloatOrNull(@Nullable Object obj, @Nullable Float f) {
        return obj instanceof Float ? (Float) obj : f;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Integer toIntegerOrNull(@Nullable Object obj, @Nullable Integer num) {
        return obj instanceof Integer ? (Integer) obj : num;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public List<Object> toListOrNull(@Nullable Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public Map<Object, Object> toMapOrNull(@Nullable Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public <T> T toOrNull(@Nullable Object obj, @Nullable T t) throws Exception {
        return obj != 0 ? obj : t;
    }

    @Override // io.bidmachine.utils.data.DataConverter
    @Nullable
    public String toStringOrNull(@Nullable Object obj, @Nullable String str) {
        return obj instanceof String ? (String) obj : str;
    }
}
