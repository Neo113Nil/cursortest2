package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* compiled from: toJson.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"toJson", "", "Lcom/apollographql/apollo/api/Operation$Data;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toResponseJson", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToJsonKt {
    public static /* synthetic */ String toJson$default(Operation.Data data, CustomScalarAdapters customScalarAdapters, int i, Object obj) {
        if ((i & 1) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        return toJson(data, customScalarAdapters);
    }

    public static /* synthetic */ String toResponseJson$default(Operation.Data data, CustomScalarAdapters customScalarAdapters, int i, Object obj) {
        if ((i & 1) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        return toResponseJson(data, customScalarAdapters);
    }

    public static final String toJson(Operation.Data data, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        _DataKt.toJson(data, new BufferedSinkJsonWriter(buffer, null), customScalarAdapters);
        return buffer.readUtf8();
    }

    public static final String toResponseJson(Operation.Data data, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer, null);
        bufferedSinkJsonWriter.beginObject();
        bufferedSinkJsonWriter.name("data");
        _DataKt.toJson(data, bufferedSinkJsonWriter, customScalarAdapters);
        bufferedSinkJsonWriter.endObject();
        return buffer.readUtf8();
    }
}
