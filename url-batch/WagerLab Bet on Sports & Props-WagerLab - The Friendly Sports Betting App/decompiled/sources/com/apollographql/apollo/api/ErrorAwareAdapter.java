package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/api/ErrorAwareAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "wrappedAdapter", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ErrorAwareAdapter<T> implements Adapter<T> {
    private final Adapter<T> wrappedAdapter;

    public ErrorAwareAdapter(Adapter<T> wrappedAdapter) {
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public T fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Error firstErrorStartingWith;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (reader.getPeekedToken() == JsonReader.Token.NULL && (firstErrorStartingWith = customScalarAdapters.firstErrorStartingWith(reader.getPath())) != null) {
            reader.skipValue();
            throw new ApolloGraphQLException(firstErrorStartingWith);
        }
        return this.wrappedAdapter.fromJson(reader, customScalarAdapters);
    }

    @Override // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        this.wrappedAdapter.toJson(writer, customScalarAdapters, value);
    }
}
