package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes15.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
    }

    TypeAdapter getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter create;
        Object construct = constructorConstructor.get(TypeToken.get(jsonAdapter.value())).construct();
        if (construct instanceof TypeAdapter) {
            create = (TypeAdapter) construct;
        } else if (construct instanceof TypeAdapterFactory) {
            create = ((TypeAdapterFactory) construct).create(gson, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + construct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        return (create == null || !jsonAdapter.nullSafe()) ? create : create.nullSafe();
    }
}
