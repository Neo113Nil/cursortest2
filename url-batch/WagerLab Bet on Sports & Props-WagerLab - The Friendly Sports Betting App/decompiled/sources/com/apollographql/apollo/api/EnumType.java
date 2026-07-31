package com.apollographql.apollo.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/apollographql/apollo/api/EnumType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "name", "", "values", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumType extends CompiledNamedType {
    private final List<String> values;

    public final List<String> getValues() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumType(String name, List<String> values) {
        super(name, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
    }
}
