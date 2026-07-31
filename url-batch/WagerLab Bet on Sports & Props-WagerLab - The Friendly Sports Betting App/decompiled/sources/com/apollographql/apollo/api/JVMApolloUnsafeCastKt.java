package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JVMApolloUnsafeCast.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"apolloUnsafeCast", "T", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JVMApolloUnsafeCastKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T apolloUnsafeCast(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.reifiedOperationMarker(1, "T");
        return obj;
    }
}
