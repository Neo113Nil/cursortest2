package io.bidmachine.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\u001c\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0007\u001a\u000e\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\b\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\t\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\n\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u000b\u001a\u000e\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\f\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\f\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\r\u001a\u000e\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u000fH\u0002¨\u0006\u0010"}, d2 = {"createBigEndianBuffer", "Ljava/nio/ByteBuffer;", "size", "", "protoSerialize", "", "", "", "", "", "", "", "", "", "toJsonValue", "", "bidmachine-android-sdk_ba_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ProtoSerializerKt {
    private static final ByteBuffer createBigEndianBuffer(int i) {
        ByteBuffer order = ByteBuffer.allocate(i).order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "allocate(size).order(ByteOrder.BIG_ENDIAN)");
        return order;
    }

    @NotNull
    public static final byte[] protoSerialize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = str.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.json.JSONObject] */
    private static final Object toJsonValue(Object obj) {
        Object jSONArray;
        if (obj == null) {
            Object NULL = JSONObject.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            return NULL;
        }
        if (obj instanceof JSONObject ? true : obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof Map) {
            jSONArray = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    jSONArray.put((String) key, toJsonValue(value));
                }
            }
        } else {
            if (!(obj instanceof Iterable)) {
                if (obj instanceof Object[]) {
                    return toJsonValue(ArraysKt.asIterable((Object[]) obj));
                }
                if (obj instanceof Enum) {
                    return ((Enum) obj).name();
                }
                if (obj instanceof Boolean ? true : obj instanceof Number ? true : obj instanceof String) {
                    return obj;
                }
                Object wrap = JSONObject.wrap(obj);
                if (wrap == null) {
                    wrap = JSONObject.NULL;
                }
                Intrinsics.checkNotNullExpressionValue(wrap, "JSONObject.wrap(this) ?: JSONObject.NULL");
                return wrap;
            }
            jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(toJsonValue(it.next()));
            }
        }
        return jSONArray;
    }

    @NotNull
    public static final byte[] protoSerialize(@NotNull Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        String obj = toJsonValue(iterable).toString();
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = obj.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public static final byte[] protoSerialize(@NotNull Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String obj = toJsonValue(map).toString();
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = obj.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public static final byte[] protoSerialize(@NotNull Enum<?> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        String name = r2.name();
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = name.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public static final byte[] protoSerialize(float f) {
        byte[] array = createBigEndianBuffer(4).putFloat(f).array();
        Intrinsics.checkNotNullExpressionValue(array, "createBigEndianBuffer(Fl…S).putFloat(this).array()");
        return array;
    }

    @NotNull
    public static final byte[] protoSerialize(double d) {
        byte[] array = createBigEndianBuffer(8).putDouble(d).array();
        Intrinsics.checkNotNullExpressionValue(array, "createBigEndianBuffer(Do…).putDouble(this).array()");
        return array;
    }

    @NotNull
    public static final byte[] protoSerialize(int i) {
        byte[] array = createBigEndianBuffer(4).putInt(i).array();
        Intrinsics.checkNotNullExpressionValue(array, "createBigEndianBuffer(In…TES).putInt(this).array()");
        return array;
    }

    @NotNull
    public static final byte[] protoSerialize(long j) {
        byte[] array = createBigEndianBuffer(8).putLong(j).array();
        Intrinsics.checkNotNullExpressionValue(array, "createBigEndianBuffer(Lo…ES).putLong(this).array()");
        return array;
    }

    @NotNull
    public static final byte[] protoSerialize(boolean z) {
        return protoSerialize(z ? 1 : 0);
    }
}
