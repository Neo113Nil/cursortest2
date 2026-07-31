package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import kotlin.Metadata;

@Metadata(d1 = {"com/apollographql/apollo/api/Assertions__AssertionsKt", "com/apollographql/apollo/api/Assertions__Assertions_jvmKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Assertions {
    public static final void assertOneOf(Optional<?>... optionalArr) {
        Assertions__AssertionsKt.assertOneOf(optionalArr);
    }

    @SafeVarargs
    public static final void assertOneOf(java.util.Optional<? extends java.util.Optional<?>>... optionalArr) {
        Assertions__Assertions_jvmKt.assertOneOf(optionalArr);
    }

    public static final void checkFieldNotMissing(Object obj, String str) {
        Assertions__AssertionsKt.checkFieldNotMissing(obj, str);
    }

    public static final Void missingField(JsonReader jsonReader, String str) {
        return Assertions__AssertionsKt.missingField(jsonReader, str);
    }
}
