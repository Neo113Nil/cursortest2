package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* compiled from: Executables.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a,\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001ak\u0010\r\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0015\u001a7\u0010\u0016\u001a\u00020\u0017\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u0002H\u0002¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"variables", "Lcom/apollographql/apollo/api/Executable$Variables;", "D", "Lcom/apollographql/apollo/api/Executable$Data;", "Lcom/apollographql/apollo/api/Executable;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "variablesJson", "", "falseVariables", "", "withDefaultValues", "", "parseData", "jsonReader", "Lcom/apollographql/apollo/api/json/JsonReader;", "deferredFragmentIds", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "errors", "", "Lcom/apollographql/apollo/api/Error;", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)Lcom/apollographql/apollo/api/Executable$Data;", "composeData", "", "jsonWriter", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "(Lcom/apollographql/apollo/api/Executable;Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/apollographql/apollo/api/Executable$Data;)V", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Executables {
    public static final <D extends Executable.Data> D parseData(Executable<D> executable, JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        return (D) parseData$default(executable, jsonReader, null, null, null, null, 30, null);
    }

    public static final <D extends Executable.Data> D parseData(Executable<D> executable, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return (D) parseData$default(executable, jsonReader, customScalarAdapters, null, null, null, 28, null);
    }

    public static final <D extends Executable.Data> D parseData(Executable<D> executable, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters, Set<String> set) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return (D) parseData$default(executable, jsonReader, customScalarAdapters, set, null, null, 24, null);
    }

    public static final <D extends Executable.Data> D parseData(Executable<D> executable, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters, Set<String> set, Set<DeferredFragmentIdentifier> set2) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return (D) parseData$default(executable, jsonReader, customScalarAdapters, set, set2, null, 16, null);
    }

    public static final <D extends Executable.Data> Executable.Variables variables(Executable<D> executable, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return variables(executable, customScalarAdapters, false);
    }

    public static final <D extends Executable.Data> String variablesJson(Executable<D> executable, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer, null, 2, null);
        bufferedSinkJsonWriter.beginObject();
        executable.serializeVariables(bufferedSinkJsonWriter, customScalarAdapters, false);
        bufferedSinkJsonWriter.endObject();
        return buffer.readUtf8();
    }

    public static final <D extends Executable.Data> Set<String> falseVariables(Executable<D> executable, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Map<String, Object> valueMap = variables(executable, customScalarAdapters, true).getValueMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : valueMap.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), (Object) false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static final <D extends Executable.Data> Executable.Variables variables(Executable<D> executable, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        MapJsonWriter mapJsonWriter = new MapJsonWriter();
        mapJsonWriter.beginObject();
        executable.serializeVariables(mapJsonWriter, customScalarAdapters, z);
        mapJsonWriter.endObject();
        Object root = mapJsonWriter.root();
        Intrinsics.checkNotNull(root, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new Executable.Variables((Map) root);
    }

    public static /* synthetic */ Executable.Data parseData$default(Executable executable, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters, Set set, Set set2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        return parseData(executable, jsonReader, customScalarAdapters, (i & 4) != 0 ? null : set, (i & 8) != 0 ? null : set2, (i & 16) != 0 ? null : list);
    }

    public static final <D extends Executable.Data> D parseData(Executable<D> executable, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters, Set<String> set, Set<DeferredFragmentIdentifier> set2, List<Error> list) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return (D) Adapters.m9317nullable(executable.adapter()).fromJson(jsonReader, customScalarAdapters.newBuilder().falseVariables(set).deferredFragmentIdentifiers(set2).errors(list).build());
    }

    public static final <D extends Executable.Data> void composeData(Executable<D> executable, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, D value) {
        Intrinsics.checkNotNullParameter(executable, "<this>");
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        executable.adapter().toJson(jsonWriter, customScalarAdapters, value);
    }
}
