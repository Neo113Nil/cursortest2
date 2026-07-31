package com.apollographql.apollo.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0000H\u0017J\b\u0010\t\u001a\u00020\u0000H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/apollographql/apollo/api/CompiledNamedType;", "Lcom/apollographql/apollo/api/CompiledType;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "leafType", "rawType", "Lcom/apollographql/apollo/api/CustomScalarType;", "Lcom/apollographql/apollo/api/EnumType;", "Lcom/apollographql/apollo/api/InputObjectType;", "Lcom/apollographql/apollo/api/InterfaceType;", "Lcom/apollographql/apollo/api/ObjectType;", "Lcom/apollographql/apollo/api/ScalarType;", "Lcom/apollographql/apollo/api/UnionType;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CompiledNamedType extends CompiledType {
    private final String name;

    public /* synthetic */ CompiledNamedType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.apollographql.apollo.api.CompiledType
    @Deprecated(message = "Use rawType instead", replaceWith = @ReplaceWith(expression = "rawType()", imports = {}))
    public CompiledNamedType leafType() {
        return this;
    }

    @Override // com.apollographql.apollo.api.CompiledType
    public CompiledNamedType rawType() {
        return this;
    }

    private CompiledNamedType(String str) {
        super(null);
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }
}
