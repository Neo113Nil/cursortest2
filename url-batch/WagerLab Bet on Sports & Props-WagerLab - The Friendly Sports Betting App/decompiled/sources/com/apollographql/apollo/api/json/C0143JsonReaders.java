package com.apollographql.apollo.api.json;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonReaders2.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"readTypename", "", "Lcom/apollographql/apollo/api/json/JsonReader;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.apollographql.apollo.api.json.JsonReaders, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0143JsonReaders {
    public static final String readTypename(JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        if (jsonReader.selectName(CollectionsKt.listOf("__typename")) != 0) {
            throw new IllegalStateException("__typename not found".toString());
        }
        String nextString = jsonReader.nextString();
        if (nextString != null) {
            return nextString;
        }
        throw new IllegalStateException("__typename is null".toString());
    }
}
