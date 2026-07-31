package com.apollographql.apollo.api.json;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Buffer;
import okio.ByteString;

/* compiled from: JsonWriters.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a8\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a8\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a@\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a@\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a6\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"writeAny", "", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "", "writeObject", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "writeArray", "buildJsonString", "", "indent", "buildJsonByteString", "Lokio/ByteString;", "buildJsonMap", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.apollographql.apollo.api.json.-JsonWriters, reason: invalid class name */
/* loaded from: classes3.dex */
public final class JsonWriters {
    public static final void writeAny(JsonWriter jsonWriter, Object obj) {
        Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                    return;
                }
                if (obj instanceof Integer) {
                    jsonWriter.value(((Number) obj).intValue());
                    return;
                }
                if (obj instanceof Long) {
                    jsonWriter.value(((Number) obj).longValue());
                    return;
                }
                if (obj instanceof Double) {
                    jsonWriter.value(((Number) obj).doubleValue());
                    return;
                } else if (obj instanceof JsonNumber) {
                    jsonWriter.value((JsonNumber) obj);
                    return;
                } else {
                    if (!(obj instanceof String)) {
                        throw new IllegalStateException(("Cannot write " + obj + " of class '" + Reflection.getOrCreateKotlinClass(obj.getClass()) + "' to Json").toString());
                    }
                    jsonWriter.value((String) obj);
                    return;
                }
            }
            jsonWriter.beginArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                writeAny(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            Unit unit = Unit.INSTANCE;
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            jsonWriter.name(String.valueOf(key));
            writeAny(jsonWriter, value);
        }
        jsonWriter.endObject();
        Unit unit2 = Unit.INSTANCE;
    }

    public static final void writeObject(JsonWriter jsonWriter, Function1<? super JsonWriter, Unit> block) {
        Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonWriter.beginObject();
        block.invoke(jsonWriter);
        jsonWriter.endObject();
    }

    public static final void writeArray(JsonWriter jsonWriter, Function1<? super JsonWriter, Unit> block) {
        Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jsonWriter.beginArray();
        block.invoke(jsonWriter);
        jsonWriter.endArray();
    }

    public static /* synthetic */ String buildJsonString$default(String str, Function1 block, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer buffer = new Buffer();
        block.invoke(new BufferedSinkJsonWriter(buffer, str));
        return buffer.readUtf8();
    }

    public static final String buildJsonString(String str, Function1<? super JsonWriter, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer buffer = new Buffer();
        block.invoke(new BufferedSinkJsonWriter(buffer, str));
        return buffer.readUtf8();
    }

    public static /* synthetic */ ByteString buildJsonByteString$default(String str, Function1 block, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer buffer = new Buffer();
        block.invoke(new BufferedSinkJsonWriter(buffer, str));
        return buffer.readByteString();
    }

    public static final ByteString buildJsonByteString(String str, Function1<? super JsonWriter, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer buffer = new Buffer();
        block.invoke(new BufferedSinkJsonWriter(buffer, str));
        return buffer.readByteString();
    }

    public static final Object buildJsonMap(Function1<? super JsonWriter, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MapJsonWriter mapJsonWriter = new MapJsonWriter();
        block.invoke(mapJsonWriter);
        return mapJsonWriter.root();
    }
}
