package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0 0\u0001\"\u0006\b\u0000\u0010!\u0018\u0001*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0087\b¢\u0006\u0002\b\"\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b%\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u0002H!0$\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b'\u001a=\u0010(\u001a\u00020\u0002\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u00012\u0006\u0010)\u001a\u0002H!2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b-\u0010.\u001a'\u0010/\u001a\b\u0012\u0004\u0012\u0002H!0\u0014\"\b\b\u0000\u0010!*\u00020\u000e*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b0\u001a#\u00101\u001a\b\u0012\u0004\u0012\u0002H!02\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b3\u001a-\u00104\u001a\b\u0012\u0004\u0012\u0002H!05\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u00012\b\b\u0002\u00106\u001a\u00020\fH\u0007¢\u0006\u0002\b7\u001a)\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!090\u0001\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b:\u001a#\u0010;\u001a\b\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b<\u001a%\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H!0\u0001\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0001H\u0007¢\u0006\u0002\b>\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"StringAdapter", "Lcom/apollographql/apollo/api/Adapter;", "", "IntAdapter", "", "DoubleAdapter", "", "FloatAdapter", "", "LongAdapter", "", "BooleanAdapter", "", "AnyAdapter", "", "getAnyAdapter$annotations", "()V", "UploadAdapter", "Lcom/apollographql/apollo/api/Upload;", "NullableStringAdapter", "Lcom/apollographql/apollo/api/NullableAdapter;", "NullableDoubleAdapter", "NullableIntAdapter", "NullableBooleanAdapter", "NullableAnyAdapter", "ApolloOptionalStringAdapter", "Lcom/apollographql/apollo/api/ApolloOptionalAdapter;", "ApolloOptionalDoubleAdapter", "ApolloOptionalIntAdapter", "ApolloOptionalBooleanAdapter", "ApolloOptionalAnyAdapter", "array", "", "T", "-array", "optional", "Lcom/apollographql/apollo/api/PresentAdapter;", "-optional", "present", "-present", "toJsonString", "value", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "indent", "-toJson", "(Lcom/apollographql/apollo/api/Adapter;Ljava/lang/Object;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/String;)Ljava/lang/String;", "nullable", "-nullable", AttributeType.LIST, "Lcom/apollographql/apollo/api/ListAdapter;", "-list", "obj", "Lcom/apollographql/apollo/api/ObjectAdapter;", "buffered", "-obj", "catchToResult", "Lcom/apollographql/apollo/api/FieldResult;", "-catchToResult", "errorAware", "-errorAware", "catchToNull", "-catchToNull", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Adapters {
    public static final Adapter<Object> AnyAdapter;
    public static final ApolloOptionalAdapter<Object> ApolloOptionalAnyAdapter;
    public static final ApolloOptionalAdapter<Boolean> ApolloOptionalBooleanAdapter;
    public static final ApolloOptionalAdapter<Double> ApolloOptionalDoubleAdapter;
    public static final ApolloOptionalAdapter<Integer> ApolloOptionalIntAdapter;
    public static final ApolloOptionalAdapter<String> ApolloOptionalStringAdapter;
    public static final Adapter<Boolean> BooleanAdapter;
    public static final Adapter<Double> DoubleAdapter;
    public static final Adapter<Float> FloatAdapter;
    public static final Adapter<Integer> IntAdapter;
    public static final Adapter<Long> LongAdapter;
    public static final NullableAdapter<Object> NullableAnyAdapter;
    public static final NullableAdapter<Boolean> NullableBooleanAdapter;
    public static final NullableAdapter<Double> NullableDoubleAdapter;
    public static final NullableAdapter<Integer> NullableIntAdapter;
    public static final NullableAdapter<String> NullableStringAdapter;
    public static final Adapter<String> StringAdapter;
    public static final Adapter<Upload> UploadAdapter;

    /* renamed from: -toJson, reason: not valid java name */
    public static final <T> String m9322toJson(Adapter<T> adapter, T t) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return m9325toJson$default(adapter, t, null, null, 6, null);
    }

    /* renamed from: -toJson, reason: not valid java name */
    public static final <T> String m9323toJson(Adapter<T> adapter, T t, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return m9325toJson$default(adapter, t, customScalarAdapters, null, 4, null);
    }

    public static /* synthetic */ void getAnyAdapter$annotations() {
    }

    static {
        Adapter<String> adapter = new Adapter<String>() { // from class: com.apollographql.apollo.api.Adapters$StringAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public String fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                String nextString = reader.nextString();
                Intrinsics.checkNotNull(nextString);
                return nextString;
            }

            @Override // com.apollographql.apollo.api.Adapter
            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, String value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.value(value);
            }
        };
        StringAdapter = adapter;
        Adapter<Integer> adapter2 = new Adapter<Integer>() { // from class: com.apollographql.apollo.api.Adapters$IntAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Integer num) {
                toJson(jsonWriter, customScalarAdapters, num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public Integer fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return Integer.valueOf(reader.nextInt());
            }

            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, int value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.value(value);
            }
        };
        IntAdapter = adapter2;
        Adapter<Double> adapter3 = new Adapter<Double>() { // from class: com.apollographql.apollo.api.Adapters$DoubleAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Double d) {
                toJson(jsonWriter, customScalarAdapters, d.doubleValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public Double fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return Double.valueOf(reader.nextDouble());
            }

            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, double value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.value(value);
            }
        };
        DoubleAdapter = adapter3;
        FloatAdapter = new Adapter<Float>() { // from class: com.apollographql.apollo.api.Adapters$FloatAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Float f) {
                toJson(jsonWriter, customScalarAdapters, f.floatValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public Float fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return Float.valueOf((float) reader.nextDouble());
            }

            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, float value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.value(value);
            }
        };
        LongAdapter = new Adapter<Long>() { // from class: com.apollographql.apollo.api.Adapters$LongAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Long l) {
                toJson(jsonWriter, customScalarAdapters, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public Long fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return Long.valueOf(reader.nextLong());
            }

            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, long value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.value(value);
            }
        };
        Adapter<Boolean> adapter4 = new Adapter<Boolean>() { // from class: com.apollographql.apollo.api.Adapters$BooleanAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Boolean bool) {
                toJson(jsonWriter, customScalarAdapters, bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public Boolean fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return Boolean.valueOf(reader.nextBoolean());
            }

            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, boolean value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.value(value);
            }
        };
        BooleanAdapter = adapter4;
        Adapter<Object> adapter5 = new Adapter<Object>() { // from class: com.apollographql.apollo.api.Adapters$AnyAdapter$1
            public final Object fromJson(JsonReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object readAny = JsonReaders.readAny(reader);
                Intrinsics.checkNotNull(readAny);
                return readAny;
            }

            public final void toJson(JsonWriter writer, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                JsonWriters.writeAny(writer, value);
            }

            @Override // com.apollographql.apollo.api.Adapter
            public Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                return fromJson(reader);
            }

            @Override // com.apollographql.apollo.api.Adapter
            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                toJson(writer, value);
            }
        };
        AnyAdapter = adapter5;
        UploadAdapter = new Adapter<Upload>() { // from class: com.apollographql.apollo.api.Adapters$UploadAdapter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public Upload fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                throw new IllegalStateException("File Upload used in output position".toString());
            }

            @Override // com.apollographql.apollo.api.Adapter
            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Upload value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.value(value);
            }
        };
        NullableStringAdapter = m9317nullable(adapter);
        NullableDoubleAdapter = m9317nullable(adapter3);
        NullableIntAdapter = m9317nullable(adapter2);
        NullableBooleanAdapter = m9317nullable(adapter4);
        NullableAnyAdapter = m9317nullable(adapter5);
        ApolloOptionalStringAdapter = new ApolloOptionalAdapter<>(adapter);
        ApolloOptionalDoubleAdapter = new ApolloOptionalAdapter<>(adapter3);
        ApolloOptionalIntAdapter = new ApolloOptionalAdapter<>(adapter2);
        ApolloOptionalBooleanAdapter = new ApolloOptionalAdapter<>(adapter4);
        ApolloOptionalAnyAdapter = new ApolloOptionalAdapter<>(adapter5);
    }

    /* renamed from: -array, reason: not valid java name */
    public static final /* synthetic */ <T> Adapter<T[]> m9312array(final Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        Intrinsics.needClassReification();
        return new Adapter<T[]>() { // from class: com.apollographql.apollo.api.Adapters$array$1
            /* JADX WARN: Multi-variable type inference failed */
            private final /* synthetic */ <T> T[] arrayFromJson(Adapter<T> wrappedAdapter, JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                reader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (reader.hasNext()) {
                    arrayList.add(wrappedAdapter.fromJson(reader, customScalarAdapters));
                }
                reader.endArray();
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) arrayList.toArray(new Object[0]);
            }

            private final /* synthetic */ <T> void arrayToJson(Adapter<T> wrappedAdapter, JsonWriter writer, CustomScalarAdapters customScalarAdapters, T[] value) {
                writer.beginArray();
                for (T t : value) {
                    wrappedAdapter.toJson(writer, customScalarAdapters, t);
                }
                writer.endArray();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.Adapter
            public T[] fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Adapter<T> adapter2 = adapter;
                reader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (reader.hasNext()) {
                    arrayList.add(adapter2.fromJson(reader, customScalarAdapters));
                }
                reader.endArray();
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) arrayList.toArray(new Object[0]);
            }

            @Override // com.apollographql.apollo.api.Adapter
            public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, T[] value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                Adapter<T> adapter2 = adapter;
                writer.beginArray();
                for (T t : value) {
                    adapter2.toJson(writer, customScalarAdapters, t);
                }
                writer.endArray();
            }
        };
    }

    @Deprecated(message = "Use present instead", replaceWith = @ReplaceWith(expression = "present()", imports = {}))
    /* renamed from: -optional, reason: not valid java name */
    public static final <T> PresentAdapter<T> m9320optional(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new PresentAdapter<>(adapter);
    }

    /* renamed from: -present, reason: not valid java name */
    public static final <T> PresentAdapter<T> m9321present(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new PresentAdapter<>(adapter);
    }

    /* renamed from: -toJson$default, reason: not valid java name */
    public static /* synthetic */ String m9325toJson$default(Adapter adapter, Object obj, CustomScalarAdapters customScalarAdapters, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return m9324toJson(adapter, obj, customScalarAdapters, str);
    }

    /* renamed from: -nullable, reason: not valid java name */
    public static final <T> NullableAdapter<T> m9317nullable(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new NullableAdapter<>(adapter);
    }

    /* renamed from: -list, reason: not valid java name */
    public static final <T> ListAdapter<T> m9316list(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new ListAdapter<>(adapter);
    }

    /* renamed from: -obj$default, reason: not valid java name */
    public static /* synthetic */ ObjectAdapter m9319obj$default(Adapter adapter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m9318obj(adapter, z);
    }

    /* renamed from: -obj, reason: not valid java name */
    public static final <T> ObjectAdapter<T> m9318obj(Adapter<T> adapter, boolean z) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new ObjectAdapter<>(adapter, z);
    }

    /* renamed from: -catchToResult, reason: not valid java name */
    public static final <T> Adapter<FieldResult<T>> m9314catchToResult(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new CatchToResultAdapter(adapter);
    }

    /* renamed from: -errorAware, reason: not valid java name */
    public static final <T> Adapter<T> m9315errorAware(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new ErrorAwareAdapter(adapter);
    }

    /* renamed from: -catchToNull, reason: not valid java name */
    public static final <T> Adapter<T> m9313catchToNull(Adapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        return new CatchToNullAdapter(adapter);
    }

    /* renamed from: -toJson, reason: not valid java name */
    public static final <T> String m9324toJson(Adapter<T> adapter, T t, CustomScalarAdapters customScalarAdapters, String str) {
        Intrinsics.checkNotNullParameter(adapter, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        adapter.toJson(new BufferedSinkJsonWriter(buffer, str), customScalarAdapters, t);
        return buffer.readUtf8();
    }
}
