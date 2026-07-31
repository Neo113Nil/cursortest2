package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/api/CustomScalarType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "name", "", "className", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomScalarType extends CompiledNamedType {
    private final String className;

    public final String getClassName() {
        return this.className;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomScalarType(String name, String className) {
        super(name, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
        this.className = className;
    }
}
