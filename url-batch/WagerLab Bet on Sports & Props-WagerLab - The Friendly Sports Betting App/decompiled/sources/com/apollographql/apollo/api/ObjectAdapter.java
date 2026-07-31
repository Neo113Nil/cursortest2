package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\r\u0012\t\u0012\u0007H\u0001¢\u0006\u0002\b\u00030\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/api/ObjectAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "buffered", "", "<init>", "(Lcom/apollographql/apollo/api/Adapter;Z)V", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObjectAdapter<T> implements Adapter<T> {
    private final boolean buffered;
    private final Adapter<T> wrappedAdapter;

    public ObjectAdapter(Adapter<T> wrappedAdapter, boolean z) {
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
        this.buffered = z;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public T fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (this.buffered) {
            reader = MapJsonReader.INSTANCE.buffer(reader);
        }
        reader.beginObject();
        T fromJson = this.wrappedAdapter.fromJson(reader, customScalarAdapters);
        reader.endObject();
        return fromJson;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (this.buffered && !(writer instanceof MapJsonWriter)) {
            MapJsonWriter mapJsonWriter = new MapJsonWriter();
            mapJsonWriter.beginObject();
            this.wrappedAdapter.toJson(mapJsonWriter, customScalarAdapters, value);
            mapJsonWriter.endObject();
            Object root = mapJsonWriter.root();
            Intrinsics.checkNotNull(root);
            JsonWriters.writeAny(writer, root);
            return;
        }
        writer.beginObject();
        this.wrappedAdapter.toJson(writer, customScalarAdapters, value);
        writer.endObject();
    }
}
