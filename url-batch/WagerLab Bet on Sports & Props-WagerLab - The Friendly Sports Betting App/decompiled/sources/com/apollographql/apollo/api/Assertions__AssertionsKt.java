package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.NullOrMissingField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Assertions.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a'\u0010\u0006\u001a\u00020\u00012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"checkFieldNotMissing", "", "value", "", "name", "", "assertOneOf", "args", "", "Lcom/apollographql/apollo/api/Optional;", "([Lcom/apollographql/apollo/api/Optional;)V", "missingField", "", "jsonReader", "Lcom/apollographql/apollo/api/json/JsonReader;", "apollo-api"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/Assertions")
/* loaded from: classes3.dex */
final /* synthetic */ class Assertions__AssertionsKt {
    public static final void checkFieldNotMissing(Object obj, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj == null) {
            throw new NullOrMissingField("Field '" + name + "' is missing or null");
        }
    }

    public static final Void missingField(JsonReader jsonReader, String name) {
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(name, "name");
        throw new NullOrMissingField("Field '" + name + "' is missing or null at path " + jsonReader.getPath());
    }

    public static final void assertOneOf(Optional<?>... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList();
        for (Optional<?> optional : args) {
            if (optional instanceof Optional.Present) {
                arrayList.add(optional);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1) {
            throw new IllegalArgumentException("@oneOf input must have one field set (got " + arrayList2.size() + ')');
        }
        Optional.Present present = (Optional.Present) CollectionsKt.first((List) arrayList2);
        if (present.getValue() == null || Intrinsics.areEqual(present.getValue(), Optional.Absent.INSTANCE)) {
            throw new IllegalArgumentException("The value set on @oneOf input field must be non-null");
        }
    }
}
