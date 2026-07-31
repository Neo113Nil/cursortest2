package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo/api/UnionType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "name", "", "members", "", "Lcom/apollographql/apollo/api/ObjectType;", "<init>", "(Ljava/lang/String;[Lcom/apollographql/apollo/api/ObjectType;)V", "getMembers", "()[Lcom/apollographql/apollo/api/ObjectType;", "[Lcom/apollographql/apollo/api/ObjectType;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnionType extends CompiledNamedType {
    private final ObjectType[] members;

    public final ObjectType[] getMembers() {
        return this.members;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionType(String name, ObjectType... members) {
        super(name, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(members, "members");
        this.members = members;
    }
}
