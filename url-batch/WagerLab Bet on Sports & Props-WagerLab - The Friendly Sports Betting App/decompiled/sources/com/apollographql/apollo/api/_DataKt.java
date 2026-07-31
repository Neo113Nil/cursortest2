package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;

/* compiled from: -Data.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002H\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\"\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\f"}, d2 = {"adapter", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/Operation$Data;", "toJson", "", "jsonWriter", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJsonString", "", "indent", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _DataKt {
    private static final Adapter<Operation.Data> adapter(Operation.Data data) {
        String name = data.getClass().getName();
        Intrinsics.checkNotNull(name);
        String removeSuffix = StringsKt.removeSuffix(name, (CharSequence) "$Data");
        Object obj = Class.forName(StringsKt.substringBeforeLast$default(removeSuffix, ".", (String) null, 2, (Object) null) + ".adapter." + StringsKt.substringAfterLast$default(removeSuffix, ".", (String) null, 2, (Object) null) + "_ResponseAdapter$Data").getDeclaredField("INSTANCE").get(null);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.Operation.Data>");
        return Adapters.m9319obj$default((Adapter) obj, false, 1, null);
    }

    public static /* synthetic */ void toJson$default(Operation.Data data, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, int i, Object obj) {
        if ((i & 2) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        toJson(data, jsonWriter, customScalarAdapters);
    }

    public static final void toJson(Operation.Data data, JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(jsonWriter, "jsonWriter");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        adapter(data).toJson(jsonWriter, customScalarAdapters, data);
    }

    public static /* synthetic */ String toJsonString$default(Operation.Data data, CustomScalarAdapters customScalarAdapters, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return toJsonString(data, customScalarAdapters, str);
    }

    public static final String toJsonString(Operation.Data data, CustomScalarAdapters customScalarAdapters, String str) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        toJson(data, new BufferedSinkJsonWriter(buffer, str), customScalarAdapters);
        return buffer.readUtf8();
    }
}
