package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgument;", "", "definition", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "value", "Lcom/apollographql/apollo/api/Optional;", "Lcom/apollographql/apollo/api/CompiledValue;", "<init>", "(Lcom/apollographql/apollo/api/CompiledArgumentDefinition;Lcom/apollographql/apollo/api/Optional;)V", "getDefinition", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "getValue", "()Lcom/apollographql/apollo/api/Optional;", "name", "", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "isKey", "", "isKey$annotations", "()Z", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledArgument {
    private final CompiledArgumentDefinition definition;
    private final Optional<Object> value;

    public /* synthetic */ CompiledArgument(CompiledArgumentDefinition compiledArgumentDefinition, Optional optional, DefaultConstructorMarker defaultConstructorMarker) {
        this(compiledArgumentDefinition, optional);
    }

    @Deprecated(message = "Use definition.name instead", replaceWith = @ReplaceWith(expression = "definition.name", imports = {}))
    public static /* synthetic */ void getName$annotations() {
    }

    @Deprecated(message = "Use definition.isKey instead", replaceWith = @ReplaceWith(expression = "definition.isKey", imports = {}))
    public static /* synthetic */ void isKey$annotations() {
    }

    private CompiledArgument(CompiledArgumentDefinition compiledArgumentDefinition, Optional<? extends Object> optional) {
        this.definition = compiledArgumentDefinition;
        this.value = optional;
    }

    public final CompiledArgumentDefinition getDefinition() {
        return this.definition;
    }

    public final Optional<Object> getValue() {
        return this.value;
    }

    public final String getName() {
        return this.definition.getName();
    }

    public final boolean isKey() {
        return this.definition.getIsKey();
    }

    /* compiled from: CompiledGraphQL.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0018\u00010\u0001j\u0002`\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u0001j\u0002`\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/api/CompiledArgument$Builder;", "", "definition", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "<init>", "(Lcom/apollographql/apollo/api/CompiledArgumentDefinition;)V", "value", "Lcom/apollographql/apollo/api/Optional;", "Lcom/apollographql/apollo/api/CompiledValue;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/CompiledArgument;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final CompiledArgumentDefinition definition;
        private Optional<? extends Object> value;

        public Builder(CompiledArgumentDefinition definition) {
            Intrinsics.checkNotNullParameter(definition, "definition");
            this.definition = definition;
            this.value = Optional.INSTANCE.absent();
        }

        public final Builder value(Object value) {
            this.value = Optional.INSTANCE.present(value);
            return this;
        }

        public final CompiledArgument build() {
            return new CompiledArgument(this.definition, this.value, null);
        }
    }
}
