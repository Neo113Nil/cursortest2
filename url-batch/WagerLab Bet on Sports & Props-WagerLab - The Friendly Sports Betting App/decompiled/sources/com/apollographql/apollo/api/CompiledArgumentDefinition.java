package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "", "name", "", "isKey", "", "isPagination", "<init>", "(Ljava/lang/String;ZZ)V", "getName", "()Ljava/lang/String;", "()Z", "isPagination$annotations", "()V", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/CompiledArgumentDefinition$Builder;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledArgumentDefinition {
    private final boolean isKey;
    private final boolean isPagination;
    private final String name;

    public /* synthetic */ CompiledArgumentDefinition(String str, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2);
    }

    public static /* synthetic */ void isPagination$annotations() {
    }

    private CompiledArgumentDefinition(String str, boolean z, boolean z2) {
        this.name = str;
        this.isKey = z;
        this.isPagination = z2;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: isKey, reason: from getter */
    public final boolean getIsKey() {
        return this.isKey;
    }

    /* renamed from: isPagination, reason: from getter */
    public final boolean getIsPagination() {
        return this.isPagination;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* compiled from: CompiledGraphQL.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgumentDefinition$Builder;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "argumentDefinition", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "(Lcom/apollographql/apollo/api/CompiledArgumentDefinition;)V", "isKey", "", "isPagination", InAppPurchaseConstants.METHOD_BUILD, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private boolean isKey;
        private boolean isPagination;
        private final String name;

        public Builder(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(CompiledArgumentDefinition argumentDefinition) {
            this(argumentDefinition.getName());
            Intrinsics.checkNotNullParameter(argumentDefinition, "argumentDefinition");
            this.isKey = argumentDefinition.getIsKey();
            this.isPagination = argumentDefinition.getIsPagination();
        }

        public final Builder isKey(boolean isKey) {
            this.isKey = isKey;
            return this;
        }

        public final Builder isPagination(boolean isPagination) {
            this.isPagination = isPagination;
            return this;
        }

        public final CompiledArgumentDefinition build() {
            return new CompiledArgumentDefinition(this.name, this.isKey, this.isPagination, null);
        }
    }
}
