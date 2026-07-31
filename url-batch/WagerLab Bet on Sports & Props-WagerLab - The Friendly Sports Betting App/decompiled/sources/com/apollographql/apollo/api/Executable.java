package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable.Data;
import com.apollographql.apollo.api.json.JsonWriter;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Executable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0010\u0011J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Executable;", "D", "Lcom/apollographql/apollo/api/Executable$Data;", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "Data", "Variables", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Executable<D extends Data> {

    /* compiled from: Executable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Data;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Data {
    }

    Adapter<D> adapter();

    CompiledField rootField();

    void serializeVariables(JsonWriter writer, CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) throws IOException;

    /* compiled from: Executable.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/api/Executable$Variables;", "", "valueMap", "", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "Lcom/apollographql/apollo/api/VariablesJson;", "<init>", "(Ljava/util/Map;)V", "getValueMap", "()Ljava/util/Map;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Variables {
        private final Map<String, Object> valueMap;

        public Variables(Map<String, ? extends Object> valueMap) {
            Intrinsics.checkNotNullParameter(valueMap, "valueMap");
            this.valueMap = valueMap;
        }

        public final Map<String, Object> getValueMap() {
            return this.valueMap;
        }
    }
}
