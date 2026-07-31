package com.apollographql.apollo.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0005H&\u0082\u0001\u0003\u0007\u0005\b¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/api/CompiledType;", "", "<init>", "()V", "leafType", "Lcom/apollographql/apollo/api/CompiledNamedType;", "rawType", "Lcom/apollographql/apollo/api/CompiledListType;", "Lcom/apollographql/apollo/api/CompiledNotNullType;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CompiledType {
    public /* synthetic */ CompiledType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Deprecated(message = "Use rawType instead", replaceWith = @ReplaceWith(expression = "rawType()", imports = {}))
    public abstract CompiledNamedType leafType();

    public abstract CompiledNamedType rawType();

    private CompiledType() {
    }
}
