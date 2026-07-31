package com.apollographql.apollo.api.internal;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.DeferredFragmentIdentifier;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.Executables;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.api.json.MapJsonReader;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResponseParser.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u000e\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u001c\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017¨\u0006\u0019"}, d2 = {"Lcom/apollographql/apollo/api/internal/ResponseParser;", "", "<init>", "()V", "parse", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "jsonReader", "Lcom/apollographql/apollo/api/json/JsonReader;", "operation", "Lcom/apollographql/apollo/api/Operation;", "requestUuid", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "deferredFragmentIds", "", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "parseError", "Lcom/apollographql/apollo/api/Error;", "payload", "", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResponseParser {
    public static final ResponseParser INSTANCE = new ResponseParser();

    private ResponseParser() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends Operation.Data> ApolloResponse<D> parse(JsonReader jsonReader, Operation<D> operation, UUID requestUuid, CustomScalarAdapters customScalarAdapters, Set<DeferredFragmentIdentifier> deferredFragmentIds) {
        JsonReader jsonReader2;
        CustomScalarAdapters customScalarAdapters2;
        Set<DeferredFragmentIdentifier> set;
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        jsonReader.beginObject();
        Operation.Data data = null;
        List<Error> list = null;
        Map<String, ? extends Object> map = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -1809421292) {
                jsonReader2 = jsonReader;
                customScalarAdapters2 = customScalarAdapters;
                set = deferredFragmentIds;
                if (nextName.equals("extensions")) {
                    Object readAny = JsonReaders.readAny(jsonReader2);
                    map = readAny instanceof Map ? (Map) readAny : null;
                    jsonReader = jsonReader2;
                    customScalarAdapters = customScalarAdapters2;
                    deferredFragmentIds = set;
                }
                jsonReader2.skipValue();
                jsonReader = jsonReader2;
                customScalarAdapters = customScalarAdapters2;
                deferredFragmentIds = set;
            } else {
                if (hashCode == -1294635157) {
                    jsonReader2 = jsonReader;
                    customScalarAdapters2 = customScalarAdapters;
                    set = deferredFragmentIds;
                    if (nextName.equals("errors")) {
                        list = ResponseParserKt.readErrors(jsonReader2);
                        jsonReader = jsonReader2;
                        customScalarAdapters = customScalarAdapters2;
                        deferredFragmentIds = set;
                    }
                } else if (hashCode == 3076010 && nextName.equals("data")) {
                    Operation<D> operation2 = operation;
                    JsonReader jsonReader3 = jsonReader;
                    data = (Operation.Data) Executables.parseData(operation2, jsonReader3, customScalarAdapters, Executables.falseVariables(operation2, customScalarAdapters), deferredFragmentIds, list);
                    jsonReader = jsonReader3;
                } else {
                    jsonReader2 = jsonReader;
                    customScalarAdapters2 = customScalarAdapters;
                    set = deferredFragmentIds;
                }
                jsonReader2.skipValue();
                jsonReader = jsonReader2;
                customScalarAdapters = customScalarAdapters2;
                deferredFragmentIds = set;
            }
        }
        jsonReader.endObject();
        if (requestUuid == null) {
            requestUuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(requestUuid, "randomUUID(...)");
        }
        return new ApolloResponse.Builder(operation, requestUuid).errors(list).data(data).extensions(map).build();
    }

    public final Error parseError(Map<String, ? extends Object> payload) {
        Error readError;
        Intrinsics.checkNotNullParameter(payload, "payload");
        readError = ResponseParserKt.readError(new MapJsonReader(payload, null, 2, null));
        return readError;
    }
}
