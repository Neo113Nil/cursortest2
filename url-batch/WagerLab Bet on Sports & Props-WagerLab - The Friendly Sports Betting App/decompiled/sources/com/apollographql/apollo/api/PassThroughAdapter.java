package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/apollographql/apollo/api/PassThroughAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "<init>", "()V", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassThroughAdapter<T> implements Adapter<T> {
    @Override // com.apollographql.apollo.api.Adapter
    public T fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (!(reader instanceof MapJsonReader)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonReader".toString());
        }
        return (T) ((MapJsonReader) reader).nextValue();
    }

    @Override // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (!(writer instanceof MapJsonWriter)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonWriter".toString());
        }
        ((MapJsonWriter) writer).value(value);
    }
}
