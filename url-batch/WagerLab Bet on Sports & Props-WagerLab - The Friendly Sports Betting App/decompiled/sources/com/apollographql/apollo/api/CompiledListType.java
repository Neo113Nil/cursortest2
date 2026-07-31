package com.apollographql.apollo.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo/api/CompiledListType;", "Lcom/apollographql/apollo/api/CompiledType;", "ofType", "<init>", "(Lcom/apollographql/apollo/api/CompiledType;)V", "getOfType", "()Lcom/apollographql/apollo/api/CompiledType;", "leafType", "Lcom/apollographql/apollo/api/CompiledNamedType;", "rawType", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledListType extends CompiledType {
    private final CompiledType ofType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompiledListType(CompiledType ofType) {
        super(null);
        Intrinsics.checkNotNullParameter(ofType, "ofType");
        this.ofType = ofType;
    }

    public final CompiledType getOfType() {
        return this.ofType;
    }

    @Override // com.apollographql.apollo.api.CompiledType
    @Deprecated(message = "Use rawType instead", replaceWith = @ReplaceWith(expression = "rawType()", imports = {}))
    public CompiledNamedType leafType() {
        return this.ofType.rawType();
    }

    @Override // com.apollographql.apollo.api.CompiledType
    public CompiledNamedType rawType() {
        return this.ofType.rawType();
    }
}
