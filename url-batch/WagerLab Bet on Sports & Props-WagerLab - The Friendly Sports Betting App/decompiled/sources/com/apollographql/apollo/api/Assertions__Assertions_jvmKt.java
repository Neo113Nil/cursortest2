package com.apollographql.apollo.api;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Assertions.jvm.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00040\u0003\"\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"assertOneOf", "", "args", "", "Ljava/util/Optional;", "([Ljava/util/Optional;)V", "apollo-api"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/Assertions")
/* loaded from: classes3.dex */
final /* synthetic */ class Assertions__Assertions_jvmKt {
    @SafeVarargs
    public static final void assertOneOf(java.util.Optional<? extends java.util.Optional<?>>... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList();
        for (java.util.Optional<? extends java.util.Optional<?>> optional : args) {
            if (optional.isPresent()) {
                arrayList.add(optional);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1) {
            throw new IllegalArgumentException("@oneOf input must have one field set (got " + arrayList2.size() + ')');
        }
        if (!((java.util.Optional) ((java.util.Optional) CollectionsKt.first((List) arrayList2)).get()).isPresent()) {
            throw new IllegalArgumentException("The value set on @oneOf input field must be non-null");
        }
    }
}
