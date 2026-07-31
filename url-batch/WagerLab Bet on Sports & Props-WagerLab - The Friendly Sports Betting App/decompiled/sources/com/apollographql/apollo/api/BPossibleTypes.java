package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BooleanExpression.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/api/BPossibleTypes;", "Lcom/apollographql/apollo/api/BTerm;", "possibleTypes", "", "", "<init>", "(Ljava/util/Set;)V", "types", "", "([Ljava/lang/String;)V", "getPossibleTypes", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BPossibleTypes extends BTerm {
    private final Set<String> possibleTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BPossibleTypes copy$default(BPossibleTypes bPossibleTypes, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = bPossibleTypes.possibleTypes;
        }
        return bPossibleTypes.copy(set);
    }

    public final Set<String> component1() {
        return this.possibleTypes;
    }

    public final BPossibleTypes copy(Set<String> possibleTypes) {
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        return new BPossibleTypes(possibleTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BPossibleTypes) && Intrinsics.areEqual(this.possibleTypes, ((BPossibleTypes) other).possibleTypes);
    }

    public int hashCode() {
        return this.possibleTypes.hashCode();
    }

    public String toString() {
        return "BPossibleTypes(possibleTypes=" + this.possibleTypes + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BPossibleTypes(Set<String> possibleTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(possibleTypes, "possibleTypes");
        this.possibleTypes = possibleTypes;
    }

    public final Set<String> getPossibleTypes() {
        return this.possibleTypes;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BPossibleTypes(String... types) {
        this((Set<String>) ArraysKt.toSet(types));
        Intrinsics.checkNotNullParameter(types, "types");
    }
}
