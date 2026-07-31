package com.apollographql.apollo.api;

import com.apollographql.apollo.api.BooleanExpression;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: BooleanExpression.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\u0010\b\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\u0010\b\u001a$\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\f\u001a\u00020\r\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u001a%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0005\"\u00020\r¢\u0006\u0002\u0010\u0013\u001a0\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0017H\u0007\u001aJ\u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00180\u00012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u001a0\u0010 \u001a\u00020\u00152\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u001a\u001c\u0010!\u001a\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a;\u0010\"\u001a\u0004\u0018\u0001H#\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0%H\u0007¢\u0006\u0002\u0010&¨\u0006'"}, d2 = {"or", "Lcom/apollographql/apollo/api/BooleanExpression;", "T", "", "other", "", "(Lcom/apollographql/apollo/api/BooleanExpression;[Lcom/apollographql/apollo/api/BooleanExpression;)Lcom/apollographql/apollo/api/BooleanExpression;", "and", "([Lcom/apollographql/apollo/api/BooleanExpression;)Lcom/apollographql/apollo/api/BooleanExpression;", "not", "variable", "Lcom/apollographql/apollo/api/BVariable;", "name", "", "label", "Lcom/apollographql/apollo/api/BLabel;", "possibleTypes", "Lcom/apollographql/apollo/api/BPossibleTypes;", "typenames", "([Ljava/lang/String;)Lcom/apollographql/apollo/api/BooleanExpression;", "evaluate", "", "block", "Lkotlin/Function1;", "Lcom/apollographql/apollo/api/BTerm;", "variables", "", "typename", "deferredFragmentIdentifiers", "Lcom/apollographql/apollo/api/DeferredFragmentIdentifier;", "path", "", "hasDeferredFragment", "containsPossibleTypes", "firstElementOfType", "U", "type", "Lkotlin/reflect/KClass;", "(Lcom/apollographql/apollo/api/BooleanExpression;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BooleanExpressions {
    @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public static final <T> BooleanExpression<T> or(BooleanExpression<? extends T> booleanExpression, BooleanExpression<? extends T>... other) {
        Intrinsics.checkNotNullParameter(booleanExpression, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new BooleanExpression.Or(CollectionsKt.toSet(CollectionsKt.plus((Collection<? extends BooleanExpression<? extends T>>) ArraysKt.toList(other), booleanExpression)));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public static final <T> BooleanExpression<T> and(BooleanExpression<? extends T> booleanExpression, BooleanExpression<? extends T>... other) {
        Intrinsics.checkNotNullParameter(booleanExpression, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new BooleanExpression.And(CollectionsKt.toSet(CollectionsKt.plus((Collection<? extends BooleanExpression<? extends T>>) ArraysKt.toList(other), booleanExpression)));
    }

    public static final <T> BooleanExpression<T> or(BooleanExpression<? extends T>... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new BooleanExpression.Or(CollectionsKt.toSet(ArraysKt.toList(other)));
    }

    public static final <T> BooleanExpression<T> and(BooleanExpression<? extends T>... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new BooleanExpression.And(CollectionsKt.toSet(ArraysKt.toList(other)));
    }

    public static final <T> BooleanExpression<T> not(BooleanExpression<? extends T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new BooleanExpression.Not(other);
    }

    public static final BooleanExpression<BVariable> variable(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BooleanExpression.Element(new BVariable(name));
    }

    public static final BooleanExpression<BLabel> label(String str) {
        return new BooleanExpression.Element(new BLabel(str));
    }

    public static /* synthetic */ BooleanExpression label$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return label(str);
    }

    public static final BooleanExpression<BPossibleTypes> possibleTypes(String... typenames) {
        Intrinsics.checkNotNullParameter(typenames, "typenames");
        return new BooleanExpression.Element(new BPossibleTypes((Set<String>) ArraysKt.toSet(typenames)));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public static final <T> boolean evaluate(BooleanExpression<? extends T> booleanExpression, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(booleanExpression, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (Intrinsics.areEqual(booleanExpression, BooleanExpression.True.INSTANCE)) {
            return true;
        }
        if (Intrinsics.areEqual(booleanExpression, BooleanExpression.False.INSTANCE)) {
            return false;
        }
        if (booleanExpression instanceof BooleanExpression.Not) {
            return !evaluate(((BooleanExpression.Not) booleanExpression).getOperand(), block);
        }
        if (!(booleanExpression instanceof BooleanExpression.Or)) {
            if (!(booleanExpression instanceof BooleanExpression.And)) {
                if (booleanExpression instanceof BooleanExpression.Element) {
                    return block.invoke((Object) ((BooleanExpression.Element) booleanExpression).getValue()).booleanValue();
                }
                throw new NoWhenBranchMatchedException();
            }
            Set<BooleanExpression<T>> operands = ((BooleanExpression.And) booleanExpression).getOperands();
            if ((operands instanceof Collection) && operands.isEmpty()) {
                return true;
            }
            Iterator<T> it = operands.iterator();
            while (it.hasNext()) {
                if (!evaluate((BooleanExpression) it.next(), block)) {
                    return false;
                }
            }
            return true;
        }
        Set<BooleanExpression<T>> operands2 = ((BooleanExpression.Or) booleanExpression).getOperands();
        if ((operands2 instanceof Collection) && operands2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = operands2.iterator();
        while (it2.hasNext()) {
            if (evaluate((BooleanExpression) it2.next(), block)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean evaluate(BooleanExpression<? extends BTerm> booleanExpression, final Set<String> set, final String str, final Set<DeferredFragmentIdentifier> set2, List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(booleanExpression, "<this>");
        final List drop = list != null ? CollectionsKt.drop(list, 1) : null;
        return evaluate(booleanExpression, new Function1() { // from class: com.apollographql.apollo.api.BooleanExpressions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean evaluate$lambda$2;
                evaluate$lambda$2 = BooleanExpressions.evaluate$lambda$2(set, set2, drop, str, (BTerm) obj);
                return Boolean.valueOf(evaluate$lambda$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean evaluate$lambda$2(Set set, Set set2, List list, String str, BTerm it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof BVariable) {
            return !(set != null ? set.contains(((BVariable) it).getName()) : false);
        }
        if (it instanceof BLabel) {
            Intrinsics.checkNotNull(list);
            return hasDeferredFragment(set2, list, ((BLabel) it).getLabel());
        }
        if (it instanceof BPossibleTypes) {
            return CollectionsKt.contains(((BPossibleTypes) it).getPossibleTypes(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean hasDeferredFragment(Set<DeferredFragmentIdentifier> set, List<? extends Object> list, String str) {
        if (set == null) {
            return true;
        }
        return set.contains(new DeferredFragmentIdentifier(list, str));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public static final <T> boolean containsPossibleTypes(BooleanExpression<? extends T> booleanExpression) {
        Intrinsics.checkNotNullParameter(booleanExpression, "<this>");
        if (Intrinsics.areEqual(booleanExpression, BooleanExpression.True.INSTANCE) || Intrinsics.areEqual(booleanExpression, BooleanExpression.False.INSTANCE)) {
            return false;
        }
        if (booleanExpression instanceof BooleanExpression.Not) {
            return containsPossibleTypes(((BooleanExpression.Not) booleanExpression).getOperand());
        }
        if (!(booleanExpression instanceof BooleanExpression.Or)) {
            if (!(booleanExpression instanceof BooleanExpression.And)) {
                if (booleanExpression instanceof BooleanExpression.Element) {
                    return ((BooleanExpression.Element) booleanExpression).getValue() instanceof BPossibleTypes;
                }
                throw new NoWhenBranchMatchedException();
            }
            Set<BooleanExpression<T>> operands = ((BooleanExpression.And) booleanExpression).getOperands();
            if ((operands instanceof Collection) && operands.isEmpty()) {
                return false;
            }
            Iterator<T> it = operands.iterator();
            while (it.hasNext()) {
                if (containsPossibleTypes((BooleanExpression) it.next())) {
                    return true;
                }
            }
            return false;
        }
        Set<BooleanExpression<T>> operands2 = ((BooleanExpression.Or) booleanExpression).getOperands();
        if ((operands2 instanceof Collection) && operands2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = operands2.iterator();
        while (it2.hasNext()) {
            if (containsPossibleTypes((BooleanExpression) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public static final <T, U> U firstElementOfType(BooleanExpression<? extends T> booleanExpression, KClass<U> type) {
        T t;
        T t2;
        Intrinsics.checkNotNullParameter(booleanExpression, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(booleanExpression, BooleanExpression.True.INSTANCE) || Intrinsics.areEqual(booleanExpression, BooleanExpression.False.INSTANCE)) {
            return null;
        }
        if (booleanExpression instanceof BooleanExpression.Element) {
            BooleanExpression.Element element = (BooleanExpression.Element) booleanExpression;
            if (!type.isInstance(element.getValue())) {
                return null;
            }
            U u = (U) element.getValue();
            Intrinsics.checkNotNull(u, "null cannot be cast to non-null type U of com.apollographql.apollo.api.BooleanExpressions.firstElementOfType");
            return u;
        }
        if (booleanExpression instanceof BooleanExpression.Not) {
            return (U) firstElementOfType(((BooleanExpression.Not) booleanExpression).getOperand(), type);
        }
        if (!(booleanExpression instanceof BooleanExpression.And)) {
            if (!(booleanExpression instanceof BooleanExpression.Or)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = ((BooleanExpression.Or) booleanExpression).getOperands().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = (T) null;
                    break;
                }
                t = it.next();
                if (firstElementOfType((BooleanExpression) t, type) != null) {
                    break;
                }
            }
            BooleanExpression booleanExpression2 = t;
            if (booleanExpression2 != null) {
                return (U) firstElementOfType(booleanExpression2, type);
            }
            return null;
        }
        Iterator<T> it2 = ((BooleanExpression.And) booleanExpression).getOperands().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = (T) null;
                break;
            }
            t2 = it2.next();
            if (firstElementOfType((BooleanExpression) t2, type) != null) {
                break;
            }
        }
        BooleanExpression booleanExpression3 = t2;
        if (booleanExpression3 != null) {
            return (U) firstElementOfType(booleanExpression3, type);
        }
        return null;
    }
}
