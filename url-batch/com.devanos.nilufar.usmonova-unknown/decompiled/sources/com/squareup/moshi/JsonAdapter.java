package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import o.AbstractC1888sN;
import o.G8;
import o.M8;
import o.N8;

/* loaded from: classes.dex */
public abstract class JsonAdapter<T> {

    public interface Factory {
        @CheckReturnValue
        @Nullable
        JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi);
    }

    @CheckReturnValue
    public final JsonAdapter<T> failOnUnknown() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.3
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public T fromJson(JsonReader jsonReader) {
                boolean failOnUnknown = jsonReader.failOnUnknown();
                jsonReader.setFailOnUnknown(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setFailOnUnknown(failOnUnknown);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable T t) {
                this.toJson(jsonWriter, (JsonWriter) t);
            }

            public String toString() {
                return this + ".failOnUnknown()";
            }
        };
    }

    @CheckReturnValue
    @Nullable
    public abstract T fromJson(JsonReader jsonReader);

    @CheckReturnValue
    @Nullable
    public final T fromJson(N8 n8) {
        return fromJson(JsonReader.of(n8));
    }

    @CheckReturnValue
    @Nullable
    public final T fromJsonValue(@Nullable Object obj) {
        try {
            return fromJson(new JsonValueReader(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CheckReturnValue
    public JsonAdapter<T> indent(final String str) {
        if (str != null) {
            return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.4
                @Override // com.squareup.moshi.JsonAdapter
                @Nullable
                public T fromJson(JsonReader jsonReader) {
                    return (T) this.fromJson(jsonReader);
                }

                @Override // com.squareup.moshi.JsonAdapter
                public boolean isLenient() {
                    return this.isLenient();
                }

                @Override // com.squareup.moshi.JsonAdapter
                public void toJson(JsonWriter jsonWriter, @Nullable T t) {
                    String indent = jsonWriter.getIndent();
                    jsonWriter.setIndent(str);
                    try {
                        this.toJson(jsonWriter, (JsonWriter) t);
                    } finally {
                        jsonWriter.setIndent(indent);
                    }
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(".indent(\"");
                    return AbstractC1888sN.l(sb, str, "\")");
                }
            };
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    @CheckReturnValue
    public final JsonAdapter<T> lenient() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.2
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public T fromJson(JsonReader jsonReader) {
                boolean isLenient = jsonReader.isLenient();
                jsonReader.setLenient(true);
                try {
                    return (T) this.fromJson(jsonReader);
                } finally {
                    jsonReader.setLenient(isLenient);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return true;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable T t) {
                boolean isLenient = jsonWriter.isLenient();
                jsonWriter.setLenient(true);
                try {
                    this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setLenient(isLenient);
                }
            }

            public String toString() {
                return this + ".lenient()";
            }
        };
    }

    @CheckReturnValue
    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    @CheckReturnValue
    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    @CheckReturnValue
    public final JsonAdapter<T> serializeNulls() {
        return new JsonAdapter<T>() { // from class: com.squareup.moshi.JsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public T fromJson(JsonReader jsonReader) {
                return (T) this.fromJson(jsonReader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable T t) {
                boolean serializeNulls = jsonWriter.getSerializeNulls();
                jsonWriter.setSerializeNulls(true);
                try {
                    this.toJson(jsonWriter, (JsonWriter) t);
                } finally {
                    jsonWriter.setSerializeNulls(serializeNulls);
                }
            }

            public String toString() {
                return this + ".serializeNulls()";
            }
        };
    }

    public abstract void toJson(JsonWriter jsonWriter, @Nullable T t);

    public final void toJson(M8 m8, @Nullable T t) {
        toJson(JsonWriter.of(m8), (JsonWriter) t);
    }

    @CheckReturnValue
    @Nullable
    public final Object toJsonValue(@Nullable T t) {
        JsonValueWriter jsonValueWriter = new JsonValueWriter();
        try {
            toJson((JsonWriter) jsonValueWriter, (JsonValueWriter) t);
            return jsonValueWriter.root();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CheckReturnValue
    @Nullable
    public final T fromJson(String str) {
        G8 g8 = new G8();
        g8.S(str);
        JsonReader of = JsonReader.of(g8);
        T fromJson = fromJson(of);
        if (isLenient() || of.peek() == JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    @CheckReturnValue
    public final String toJson(@Nullable T t) {
        G8 g8 = new G8();
        try {
            toJson((M8) g8, (G8) t);
            return g8.F();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
