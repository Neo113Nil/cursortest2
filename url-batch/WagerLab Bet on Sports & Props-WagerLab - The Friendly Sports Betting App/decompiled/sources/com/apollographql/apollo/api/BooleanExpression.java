package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BooleanExpression.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0006\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H'\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression;", "T", "", "<init>", "()V", "simplify", "True", "False", "Not", "Or", "And", "Element", "Lcom/apollographql/apollo/api/BooleanExpression$And;", "Lcom/apollographql/apollo/api/BooleanExpression$Element;", "Lcom/apollographql/apollo/api/BooleanExpression$False;", "Lcom/apollographql/apollo/api/BooleanExpression$Not;", "Lcom/apollographql/apollo/api/BooleanExpression$Or;", "Lcom/apollographql/apollo/api/BooleanExpression$True;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BooleanExpression<T> {
    public /* synthetic */ BooleanExpression(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public abstract BooleanExpression<T> simplify();

    private BooleanExpression() {
    }

    /* compiled from: BooleanExpression.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0000H\u0017¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$True;", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "<init>", "()V", "simplify", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class True extends BooleanExpression {
        public static final True INSTANCE = new True();

        @Override // com.apollographql.apollo.api.BooleanExpression
        @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public True simplify() {
            return this;
        }

        private True() {
            super(null);
        }
    }

    /* compiled from: BooleanExpression.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0000H\u0017¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$False;", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "<init>", "()V", "simplify", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class False extends BooleanExpression {
        public static final False INSTANCE = new False();

        @Override // com.apollographql.apollo.api.BooleanExpression
        @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public False simplify() {
            return this;
        }

        private False() {
            super(null);
        }
    }

    /* compiled from: BooleanExpression.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0017J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Not;", "T", "", "Lcom/apollographql/apollo/api/BooleanExpression;", "operand", "<init>", "(Lcom/apollographql/apollo/api/BooleanExpression;)V", "getOperand", "()Lcom/apollographql/apollo/api/BooleanExpression;", "simplify", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Not<T> extends BooleanExpression<T> {
        private final BooleanExpression<T> operand;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Not copy$default(Not not, BooleanExpression booleanExpression, int i, Object obj) {
            if ((i & 1) != 0) {
                booleanExpression = not.operand;
            }
            return not.copy(booleanExpression);
        }

        public final BooleanExpression<T> component1() {
            return this.operand;
        }

        public final Not<T> copy(BooleanExpression<? extends T> operand) {
            Intrinsics.checkNotNullParameter(operand, "operand");
            return new Not<>(operand);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Not) && Intrinsics.areEqual(this.operand, ((Not) other).operand);
        }

        public int hashCode() {
            return this.operand.hashCode();
        }

        public String toString() {
            return "Not(operand=" + this.operand + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Not(BooleanExpression<? extends T> operand) {
            super(null);
            Intrinsics.checkNotNullParameter(operand, "operand");
            this.operand = operand;
        }

        public final BooleanExpression<T> getOperand() {
            return this.operand;
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public BooleanExpression<T> simplify() {
            BooleanExpression<T> booleanExpression = this.operand;
            return booleanExpression instanceof True ? False.INSTANCE : booleanExpression instanceof False ? True.INSTANCE : this;
        }
    }

    /* compiled from: BooleanExpression.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\b\"\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0017J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0015\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005HÆ\u0003J%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Or;", "T", "", "Lcom/apollographql/apollo/api/BooleanExpression;", "operands", "", "<init>", "(Ljava/util/Set;)V", "", "([Lcom/apollographql/apollo/api/BooleanExpression;)V", "getOperands", "()Ljava/util/Set;", "simplify", InAppPurchaseConstants.METHOD_TO_STRING, "", "component1", "copy", "equals", "", "other", "hashCode", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Or<T> extends BooleanExpression<T> {
        private final Set<BooleanExpression<T>> operands;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Or copy$default(Or or, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = or.operands;
            }
            return or.copy(set);
        }

        public final Set<BooleanExpression<T>> component1() {
            return this.operands;
        }

        public final Or<T> copy(Set<? extends BooleanExpression<? extends T>> operands) {
            Intrinsics.checkNotNullParameter(operands, "operands");
            return new Or<>(operands);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Or) && Intrinsics.areEqual(this.operands, ((Or) other).operands);
        }

        public int hashCode() {
            return this.operands.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Or(Set<? extends BooleanExpression<? extends T>> operands) {
            super(null);
            Intrinsics.checkNotNullParameter(operands, "operands");
            this.operands = operands;
            if (operands.isEmpty()) {
                throw new IllegalStateException("Apollo: cannot create a 'Or' condition from an empty list".toString());
            }
        }

        public final Set<BooleanExpression<T>> getOperands() {
            return this.operands;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Or(BooleanExpression<? extends T>... operands) {
            this(ArraysKt.toSet(operands));
            Intrinsics.checkNotNullParameter(operands, "operands");
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public BooleanExpression<T> simplify() {
            Set<BooleanExpression<T>> set = this.operands;
            ArrayList arrayList = new ArrayList();
            for (T t : set) {
                if (!Intrinsics.areEqual((BooleanExpression) t, False.INSTANCE)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((BooleanExpression) it.next()).simplify());
            }
            ArrayList arrayList4 = arrayList3;
            return arrayList4.contains(True.INSTANCE) ? True.INSTANCE : arrayList4.isEmpty() ? False.INSTANCE : arrayList4.size() == 1 ? (BooleanExpression) CollectionsKt.first((List) arrayList4) : new Or(CollectionsKt.toSet(arrayList4));
        }

        public String toString() {
            return CollectionsKt.joinToString$default(this.operands, " | ", null, null, 0, null, null, 62, null);
        }
    }

    /* compiled from: BooleanExpression.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\b\"\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0017J\u0015\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005HÆ\u0003J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$And;", "T", "", "Lcom/apollographql/apollo/api/BooleanExpression;", "operands", "", "<init>", "(Ljava/util/Set;)V", "", "([Lcom/apollographql/apollo/api/BooleanExpression;)V", "getOperands", "()Ljava/util/Set;", "simplify", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class And<T> extends BooleanExpression<T> {
        private final Set<BooleanExpression<T>> operands;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ And copy$default(And and, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = and.operands;
            }
            return and.copy(set);
        }

        public final Set<BooleanExpression<T>> component1() {
            return this.operands;
        }

        public final And<T> copy(Set<? extends BooleanExpression<? extends T>> operands) {
            Intrinsics.checkNotNullParameter(operands, "operands");
            return new And<>(operands);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof And) && Intrinsics.areEqual(this.operands, ((And) other).operands);
        }

        public int hashCode() {
            return this.operands.hashCode();
        }

        public String toString() {
            return "And(operands=" + this.operands + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public And(Set<? extends BooleanExpression<? extends T>> operands) {
            super(null);
            Intrinsics.checkNotNullParameter(operands, "operands");
            this.operands = operands;
            if (operands.isEmpty()) {
                throw new IllegalStateException("Apollo: cannot create a 'And' condition from an empty list".toString());
            }
        }

        public final Set<BooleanExpression<T>> getOperands() {
            return this.operands;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public And(BooleanExpression<? extends T>... operands) {
            this(ArraysKt.toSet(operands));
            Intrinsics.checkNotNullParameter(operands, "operands");
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public BooleanExpression<T> simplify() {
            Set<BooleanExpression<T>> set = this.operands;
            ArrayList arrayList = new ArrayList();
            for (T t : set) {
                if (!Intrinsics.areEqual((BooleanExpression) t, True.INSTANCE)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((BooleanExpression) it.next()).simplify());
            }
            ArrayList arrayList4 = arrayList3;
            return arrayList4.contains(False.INSTANCE) ? False.INSTANCE : arrayList4.isEmpty() ? True.INSTANCE : arrayList4.size() == 1 ? (BooleanExpression) CollectionsKt.first((List) arrayList4) : new And(CollectionsKt.toSet(arrayList4));
        }
    }

    /* compiled from: BooleanExpression.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0017J\u000e\u0010\u000b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Element;", "T", "", "Lcom/apollographql/apollo/api/BooleanExpression;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "simplify", "component1", "copy", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/BooleanExpression$Element;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Element<T> extends BooleanExpression<T> {
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Element copy$default(Element element, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = element.value;
            }
            return element.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Element<T> copy(T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Element<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Element) && Intrinsics.areEqual(this.value, ((Element) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public Element<T> simplify() {
            return this;
        }

        public String toString() {
            return "Element(value=" + this.value + ')';
        }

        public final T getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Element(T value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }
}
