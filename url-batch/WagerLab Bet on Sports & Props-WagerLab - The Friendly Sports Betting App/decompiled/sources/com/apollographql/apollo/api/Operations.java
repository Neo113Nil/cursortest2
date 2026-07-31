package com.apollographql.apollo.api;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.internal.ResponseParser;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.JsonDataException;
import com.google.android.gms.actions.SearchIntents;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* compiled from: Operations.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001aF\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007\u001aX\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002\u001a;\u0010\u0017\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00022\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0019\u001a3\u0010\u0017\u001a\u00020\u001a\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0018\u001a\u0002H\u00022\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u001b\u001aX\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007\u001aX\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¨\u0006\u001e"}, d2 = {"composeJsonRequest", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/Operation;", "jsonWriter", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "parseJsonResponse", "Lcom/apollographql/apollo/api/ApolloResponse;", "jsonReader", "Lcom/apollographql/apollo/api/json/JsonReader;", "deferredFragmentIdentifiers", "", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "parseResponse", "requestUuid", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "wrapIfNeeded", "Lcom/apollographql/apollo/exception/ApolloException;", "", "composeJsonResponse", "data", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;)V", "", "(Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Ljava/lang/String;", "toApolloResponse", "operation", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Operations {
    public static final <D extends Operation.Data> void composeJsonRequest(Operation<D> operation, JsonWriter jsonWriter) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        composeJsonRequest$default(operation, jsonWriter, null, 2, null);
    }

    public static final <D extends Operation.Data> void composeJsonResponse(Operation<D> operation, JsonWriter jsonWriter, D data) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        Intrinsics.checkNotNullParameter(data, "data");
        composeJsonResponse$default(operation, jsonWriter, data, null, 4, null);
    }

    @Deprecated(message = "Use parseResponse or jsonReader.toApolloResponse() instead", replaceWith = @ReplaceWith(expression = "parseResponse()", imports = {}))
    public static final <D extends Operation.Data> ApolloResponse<D> parseJsonResponse(Operation<D> operation, JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        return parseJsonResponse$default(operation, jsonReader, null, null, 6, null);
    }

    @Deprecated(message = "Use parseResponse or jsonReader.toApolloResponse() instead", replaceWith = @ReplaceWith(expression = "parseResponse()", imports = {}))
    public static final <D extends Operation.Data> ApolloResponse<D> parseJsonResponse(Operation<D> operation, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return parseJsonResponse$default(operation, jsonReader, customScalarAdapters, null, 4, null);
    }

    public static final <D extends Operation.Data> ApolloResponse<D> parseResponse(Operation<D> operation, JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        return parseResponse$default(operation, jsonReader, (UUID) null, (CustomScalarAdapters) null, (Set) null, 14, (Object) null);
    }

    public static final <D extends Operation.Data> ApolloResponse<D> parseResponse(Operation<D> operation, JsonReader jsonReader, UUID uuid) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        return parseResponse$default(operation, jsonReader, uuid, (CustomScalarAdapters) null, (Set) null, 12, (Object) null);
    }

    public static final <D extends Operation.Data> ApolloResponse<D> parseResponse(Operation<D> operation, JsonReader jsonReader, UUID uuid, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return parseResponse$default(operation, jsonReader, uuid, customScalarAdapters, (Set) null, 8, (Object) null);
    }

    public static /* synthetic */ void composeJsonRequest$default(Operation operation, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, int i, Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        composeJsonRequest(operation, jsonWriter, customScalarAdapters);
    }

    public static /* synthetic */ ApolloResponse parseJsonResponse$default(Operation operation, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return parseJsonResponse(operation, jsonReader, customScalarAdapters, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Deprecated(message = "Use parseResponse or jsonReader.toApolloResponse() instead", replaceWith = @ReplaceWith(expression = "parseResponse()", imports = {}))
    public static final <D extends Operation.Data> ApolloResponse<D> parseJsonResponse(Operation<D> operation, JsonReader jsonReader, CustomScalarAdapters customScalarAdapters, Set<DeferredFragmentIdentifier> set) {
        ?? r9;
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        JsonReader jsonReader2 = jsonReader;
        ApolloResponse<D> apolloResponse = null;
        try {
            ApolloResponse<D> parse = ResponseParser.INSTANCE.parse(jsonReader2, operation, null, customScalarAdapters, set);
            try {
                jsonReader2.close();
            } catch (Throwable th) {
                apolloResponse = th;
            }
            ApolloResponse<D> apolloResponse2 = apolloResponse;
            apolloResponse = parse;
            r9 = apolloResponse2;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            try {
                jsonReader2.close();
                r9 = th3;
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th3, th4);
                r9 = th3;
            }
        }
        if (r9 == 0) {
            return apolloResponse;
        }
        throw r9;
    }

    public static /* synthetic */ ApolloResponse parseResponse$default(Operation operation, JsonReader jsonReader, UUID uuid, CustomScalarAdapters customScalarAdapters, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return parseResponse(operation, jsonReader, uuid, customScalarAdapters, (Set<DeferredFragmentIdentifier>) set);
    }

    public static final <D extends Operation.Data> ApolloResponse<D> parseResponse(Operation<D> operation, JsonReader jsonReader, UUID uuid, CustomScalarAdapters customScalarAdapters, Set<DeferredFragmentIdentifier> set) {
        Operation<D> operation2;
        UUID uuid2;
        UUID uuid3;
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        try {
            operation2 = operation;
            uuid2 = uuid;
            try {
                return ResponseParser.INSTANCE.parse(jsonReader, operation2, uuid2, customScalarAdapters, set);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (uuid2 == null) {
                    uuid3 = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(uuid3, "randomUUID(...)");
                } else {
                    uuid3 = uuid2;
                }
                return new ApolloResponse.Builder(operation2, uuid3).exception(wrapIfNeeded(th2)).isLast(true).build();
            }
        } catch (Throwable th3) {
            th = th3;
            operation2 = operation;
            uuid2 = uuid;
        }
    }

    private static final ApolloException wrapIfNeeded(Throwable th) {
        if (th instanceof ApolloException) {
            return (ApolloException) th;
        }
        return new ApolloNetworkException("Error while reading JSON response", th);
    }

    public static /* synthetic */ void composeJsonResponse$default(Operation operation, JsonWriter jsonWriter, Operation.Data data, CustomScalarAdapters customScalarAdapters, int i, Object obj) {
        if ((i & 4) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        composeJsonResponse(operation, jsonWriter, data, customScalarAdapters);
    }

    public static final <D extends Operation.Data> void composeJsonResponse(Operation<D> operation, JsonWriter jsonWriter, D data, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        JsonWriter jsonWriter2 = jsonWriter;
        try {
            JsonWriter jsonWriter3 = jsonWriter2;
            jsonWriter3.beginObject();
            jsonWriter3.name("data");
            operation.adapter().toJson(jsonWriter3, customScalarAdapters, data);
            jsonWriter3.endObject();
            Unit unit = Unit.INSTANCE;
            try {
                jsonWriter2.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                jsonWriter2.close();
            } catch (Throwable th3) {
                ExceptionsKt.addSuppressed(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public static /* synthetic */ String composeJsonResponse$default(Operation operation, Operation.Data data, CustomScalarAdapters customScalarAdapters, int i, Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        return composeJsonResponse((Operation<Operation.Data>) operation, data, customScalarAdapters);
    }

    public static /* synthetic */ ApolloResponse toApolloResponse$default(JsonReader jsonReader, Operation operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return toApolloResponse(jsonReader, operation, uuid, customScalarAdapters, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <D extends Operation.Data> ApolloResponse<D> toApolloResponse(JsonReader jsonReader, Operation<D> operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set<DeferredFragmentIdentifier> set) {
        ?? r11;
        Operation<D> operation2;
        UUID uuid2;
        UUID uuid3;
        ApolloResponse<D> build;
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        JsonReader jsonReader2 = jsonReader;
        ApolloResponse<D> apolloResponse = null;
        try {
            JsonReader jsonReader3 = jsonReader2;
            try {
                operation2 = operation;
                uuid2 = uuid;
                try {
                    build = ResponseParser.INSTANCE.parse(jsonReader, operation2, uuid2, customScalarAdapters, set);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    if (uuid2 == null) {
                        uuid3 = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(uuid3, "randomUUID(...)");
                    } else {
                        uuid3 = uuid2;
                    }
                    build = new ApolloResponse.Builder(operation2, uuid3).exception(wrapIfNeeded(th2)).isLast(true).build();
                    try {
                        jsonReader2.close();
                    } catch (Throwable th3) {
                        apolloResponse = th3;
                    }
                    ApolloResponse<D> apolloResponse2 = apolloResponse;
                    apolloResponse = build;
                    r11 = apolloResponse2;
                    if (r11 != 0) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                operation2 = operation;
                uuid2 = uuid;
            }
        } catch (Throwable th5) {
            Throwable th6 = th5;
            try {
                jsonReader2.close();
                r11 = th6;
            } catch (Throwable th7) {
                ExceptionsKt.addSuppressed(th6, th7);
                r11 = th6;
            }
        }
        if (jsonReader.getPeekedToken() != JsonReader.Token.END_DOCUMENT) {
            throw new JsonDataException("Expected END_DOCUMENT but was " + jsonReader.getPeekedToken());
        }
        jsonReader2.close();
        ApolloResponse<D> apolloResponse22 = apolloResponse;
        apolloResponse = build;
        r11 = apolloResponse22;
        if (r11 != 0) {
            return apolloResponse;
        }
        throw r11;
    }

    public static /* synthetic */ ApolloResponse parseResponse$default(JsonReader jsonReader, Operation operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return parseResponse(jsonReader, operation, uuid, customScalarAdapters, (Set<DeferredFragmentIdentifier>) set);
    }

    public static final <D extends Operation.Data> ApolloResponse<D> parseResponse(JsonReader jsonReader, Operation<D> operation, UUID uuid, CustomScalarAdapters customScalarAdapters, Set<DeferredFragmentIdentifier> set) {
        Operation<D> operation2;
        UUID uuid2;
        UUID uuid3;
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        try {
            operation2 = operation;
            uuid2 = uuid;
            try {
                return ResponseParser.INSTANCE.parse(jsonReader, operation2, uuid2, customScalarAdapters, set);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (uuid2 == null) {
                    uuid3 = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(uuid3, "randomUUID(...)");
                } else {
                    uuid3 = uuid2;
                }
                return new ApolloResponse.Builder(operation2, uuid3).exception(wrapIfNeeded(th2)).isLast(true).build();
            }
        } catch (Throwable th3) {
            th = th3;
            operation2 = operation;
            uuid2 = uuid;
        }
    }

    public static final <D extends Operation.Data> void composeJsonRequest(Operation<D> operation, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        jsonWriter.beginObject();
        jsonWriter.name("operationName");
        jsonWriter.value(operation.name());
        jsonWriter.name("variables");
        jsonWriter.beginObject();
        operation.serializeVariables(jsonWriter, customScalarAdapters, false);
        jsonWriter.endObject();
        jsonWriter.name(SearchIntents.EXTRA_QUERY);
        jsonWriter.value(operation.document());
        jsonWriter.endObject();
    }

    public static final <D extends Operation.Data> String composeJsonResponse(Operation<D> operation, D data, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer, null);
        bufferedSinkJsonWriter.beginObject();
        bufferedSinkJsonWriter.name("data");
        operation.adapter().toJson(bufferedSinkJsonWriter, customScalarAdapters, data);
        bufferedSinkJsonWriter.endObject();
        return buffer.readUtf8();
    }
}
