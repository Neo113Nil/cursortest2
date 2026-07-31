package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* loaded from: classes14.dex */
public final class TreeTypeAdapter extends TypeAdapter {
    private final GsonContextImpl context = new GsonContextImpl();
    private TypeAdapter delegate;
    final Gson gson;
    private final TypeAdapterFactory skipPast;
    private final TypeToken typeToken;

    public TreeTypeAdapter(JsonSerializer jsonSerializer, JsonDeserializer jsonDeserializer, Gson gson, TypeToken typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.gson = gson;
        this.typeToken = typeToken;
        this.skipPast = typeAdapterFactory;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) {
        return delegate().read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) {
        delegate().write(jsonWriter, obj);
    }

    private TypeAdapter delegate() {
        TypeAdapter typeAdapter = this.delegate;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter delegateAdapter = this.gson.getDelegateAdapter(this.skipPast, this.typeToken);
        this.delegate = delegateAdapter;
        return delegateAdapter;
    }

    private static final class SingleTypeFactory implements TypeAdapterFactory {
        private final TypeToken exactType;
        private final Class hierarchyType;
        private final boolean matchRawType;

        @Override // com.google.gson.TypeAdapterFactory
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            boolean isAssignableFrom;
            TypeToken typeToken2 = this.exactType;
            if (typeToken2 != null) {
                isAssignableFrom = typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType());
            } else {
                isAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(null, null, gson, typeToken, this);
            }
            return null;
        }
    }

    private final class GsonContextImpl {
        private GsonContextImpl() {
        }
    }
}
