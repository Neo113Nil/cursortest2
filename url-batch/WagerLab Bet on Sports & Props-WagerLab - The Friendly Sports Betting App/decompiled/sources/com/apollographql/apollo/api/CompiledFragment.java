package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompiledGraphQL.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B;\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/api/CompiledFragment;", "Lcom/apollographql/apollo/api/CompiledSelection;", "typeCondition", "", "possibleTypes", "", "condition", "Lcom/apollographql/apollo/api/CompiledCondition;", "selections", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTypeCondition", "()Ljava/lang/String;", "getPossibleTypes", "()Ljava/util/List;", "getCondition", "getSelections", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompiledFragment extends CompiledSelection {
    private final List<CompiledCondition> condition;
    private final List<String> possibleTypes;
    private final List<CompiledSelection> selections;
    private final String typeCondition;

    public final String getTypeCondition() {
        return this.typeCondition;
    }

    public final List<String> getPossibleTypes() {
        return this.possibleTypes;
    }

    public final List<CompiledCondition> getCondition() {
        return this.condition;
    }

    public final List<CompiledSelection> getSelections() {
        return this.selections;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompiledFragment(String typeCondition, List<String> possibleTypes, List<CompiledCondition> condition, List<? extends CompiledSelection> selections) {
        super(null);
        Intrinsics.checkNotNullParameter(typeCondition, "typeCondition");
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(selections, "selections");
        this.typeCondition = typeCondition;
        this.possibleTypes = possibleTypes;
        this.condition = condition;
        this.selections = selections;
    }

    /* compiled from: CompiledGraphQL.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005J\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo/api/CompiledFragment$Builder;", "", "typeCondition", "", "possibleTypes", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTypeCondition", "()Ljava/lang/String;", "getPossibleTypes", "()Ljava/util/List;", "condition", "Lcom/apollographql/apollo/api/CompiledCondition;", "getCondition", "setCondition", "(Ljava/util/List;)V", "selections", "Lcom/apollographql/apollo/api/CompiledSelection;", "getSelections", "setSelections", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/CompiledFragment;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private List<CompiledCondition> condition;
        private final List<String> possibleTypes;
        private List<? extends CompiledSelection> selections;
        private final String typeCondition;

        public Builder(String typeCondition, List<String> possibleTypes) {
            Intrinsics.checkNotNullParameter(typeCondition, "typeCondition");
            Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
            this.typeCondition = typeCondition;
            this.possibleTypes = possibleTypes;
            this.condition = CollectionsKt.emptyList();
            this.selections = CollectionsKt.emptyList();
        }

        public final List<String> getPossibleTypes() {
            return this.possibleTypes;
        }

        public final String getTypeCondition() {
            return this.typeCondition;
        }

        public final List<CompiledCondition> getCondition() {
            return this.condition;
        }

        public final void setCondition(List<CompiledCondition> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.condition = list;
        }

        public final List<CompiledSelection> getSelections() {
            return this.selections;
        }

        public final void setSelections(List<? extends CompiledSelection> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.selections = list;
        }

        public final Builder condition(List<CompiledCondition> condition) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            this.condition = condition;
            return this;
        }

        public final Builder selections(List<? extends CompiledSelection> selections) {
            Intrinsics.checkNotNullParameter(selections, "selections");
            this.selections = selections;
            return this;
        }

        public final CompiledFragment build() {
            return new CompiledFragment(this.typeCondition, this.possibleTypes, this.condition, this.selections);
        }
    }
}
