package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Adapters.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u0007H\u0001¢\u0006\u0002\b\u00040\u00030\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/api/ApolloOptionalAdapter;", "T", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/Optional;", "Lkotlin/jvm/JvmSuppressWildcards;", "wrappedAdapter", "<init>", "(Lcom/apollographql/apollo/api/Adapter;)V", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloOptionalAdapter<T> implements Adapter<Optional<T>> {
    private final Adapter<T> wrappedAdapter;

    public ApolloOptionalAdapter(Adapter<T> wrappedAdapter) {
        Intrinsics.checkNotNullParameter(wrappedAdapter, "wrappedAdapter");
        this.wrappedAdapter = wrappedAdapter;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public Optional<T> fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        if (reader.peek() == JsonReader.Token.NULL) {
            reader.skipValue();
            return Optional.Absent.INSTANCE;
        }
        return new Optional.Present(this.wrappedAdapter.fromJson(reader, customScalarAdapters));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Optional<? extends T> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Optional.Present) {
            this.wrappedAdapter.toJson(writer, customScalarAdapters, ((Optional.Present) value).getValue());
        } else {
            writer.nullValue();
        }
    }
}
