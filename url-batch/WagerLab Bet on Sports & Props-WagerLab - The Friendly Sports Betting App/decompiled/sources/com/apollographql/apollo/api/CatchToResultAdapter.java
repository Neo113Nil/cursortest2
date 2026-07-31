package com.apollographql.apollo.api;

import com.apollographql.apollo.api.FieldResult;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/apollographql/apollo/api/CatchToResultAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/FieldResult;", "wrappedAdapter", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CatchToResultAdapter<T> implements Adapter<FieldResult<? extends T>> {
    private final Adapter<T> wrappedAdapter;

    public CatchToResultAdapter(Adapter<T> wrappedAdapter) {
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public FieldResult<T> fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        try {
            return new FieldResult.Success(this.wrappedAdapter.fromJson(reader, customScalarAdapters));
        } catch (ApolloException e) {
            return new FieldResult.Failure(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, FieldResult<? extends T> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof FieldResult.Success) {
            this.wrappedAdapter.toJson(writer, customScalarAdapters, FieldResultKt.getOrThrow(value));
        }
    }
}
