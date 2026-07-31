package com.apollographql.apollo.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: fakeResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/api/FakeResolverContext;", "", "path", "", "id", "", "mergedField", "Lcom/apollographql/apollo/api/CompiledField;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/CompiledField;)V", "getPath", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getMergedField", "()Lcom/apollographql/apollo/api/CompiledField;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FakeResolverContext {
    private final String id;
    private final CompiledField mergedField;
    private final List<Object> path;

    public FakeResolverContext(List<? extends Object> path, String id, CompiledField mergedField) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mergedField, "mergedField");
        this.path = path;
        this.id = id;
        this.mergedField = mergedField;
    }

    public final List<Object> getPath() {
        return this.path;
    }

    public final String getId() {
        return this.id;
    }

    public final CompiledField getMergedField() {
        return this.mergedField;
    }
}
