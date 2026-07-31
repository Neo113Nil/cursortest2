package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B;\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/api/ObjectType;", "Lcom/apollographql/apollo/api/CompiledNamedType;", "name", "", "keyFields", "", "implements", "Lcom/apollographql/apollo/api/InterfaceType;", "embeddedFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getKeyFields", "()Ljava/util/List;", "getImplements", "getEmbeddedFields", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/ObjectType$Builder;", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObjectType extends CompiledNamedType {
    private final List<String> embeddedFields;
    private final List<InterfaceType> implements;
    private final List<String> keyFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectType(String name, List<String> keyFields, List<InterfaceType> list, List<String> embeddedFields) {
        super(name, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(keyFields, "keyFields");
        Intrinsics.checkNotNullParameter(list, "implements");
        Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
        this.keyFields = keyFields;
        this.implements = list;
        this.embeddedFields = embeddedFields;
    }

    public final List<String> getKeyFields() {
        return this.keyFields;
    }

    public final List<InterfaceType> getImplements() {
        return this.implements;
    }

    public final List<String> getEmbeddedFields() {
        return this.embeddedFields;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* compiled from: CompiledGraphQL.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/api/ObjectType$Builder;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "objectType", "Lcom/apollographql/apollo/api/ObjectType;", "(Lcom/apollographql/apollo/api/ObjectType;)V", "getName$apollo_api", "()Ljava/lang/String;", "keyFields", "", "implements", "Lcom/apollographql/apollo/api/InterfaceType;", "embeddedFields", "interfaces", InAppPurchaseConstants.METHOD_BUILD, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private List<String> embeddedFields;
        private List<InterfaceType> implements;
        private List<String> keyFields;
        private final String name;

        public Builder(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.keyFields = CollectionsKt.emptyList();
            this.implements = CollectionsKt.emptyList();
            this.embeddedFields = CollectionsKt.emptyList();
        }

        /* renamed from: getName$apollo_api, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(ObjectType objectType) {
            this(objectType.getName());
            Intrinsics.checkNotNullParameter(objectType, "objectType");
            this.keyFields = objectType.getKeyFields();
            this.implements = objectType.getImplements();
            this.embeddedFields = objectType.getEmbeddedFields();
        }

        public final Builder keyFields(List<String> keyFields) {
            Intrinsics.checkNotNullParameter(keyFields, "keyFields");
            this.keyFields = keyFields;
            return this;
        }

        public final Builder interfaces(List<InterfaceType> r2) {
            Intrinsics.checkNotNullParameter(r2, "implements");
            this.implements = r2;
            return this;
        }

        public final Builder embeddedFields(List<String> embeddedFields) {
            Intrinsics.checkNotNullParameter(embeddedFields, "embeddedFields");
            this.embeddedFields = embeddedFields;
            return this;
        }

        public final ObjectType build() {
            return new ObjectType(this.name, this.keyFields, this.implements, this.embeddedFields);
        }
    }
}
