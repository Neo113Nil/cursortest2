package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionArrayInsertValue;
import com.yandex.div2.DivActionArrayRemoveValue;
import com.yandex.div2.DivActionArraySetValue;
import com.yandex.div2.DivActionTyped;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedArrayMutationHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "handle", "", "action", "Lcom/yandex/div2/DivActionArrayInsertValue;", "view", "Lcom/yandex/div/core/view2/Div2View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div2/DivActionArrayRemoveValue;", "Lcom/yandex/div2/DivActionArraySetValue;", "handleAction", "", "scopeId", "", "Lcom/yandex/div2/DivActionTyped;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DivActionTypedArrayMutationHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (action instanceof DivActionTyped.ArrayInsertValue) {
            handle(((DivActionTyped.ArrayInsertValue) action).getValue(), view, resolver);
            return true;
        }
        if (action instanceof DivActionTyped.ArrayRemoveValue) {
            handle(((DivActionTyped.ArrayRemoveValue) action).getValue(), view, resolver);
            return true;
        }
        if (!(action instanceof DivActionTyped.ArraySetValue)) {
            return false;
        }
        handle(((DivActionTyped.ArraySetValue) action).getValue(), view, resolver);
        return true;
    }

    private final void handle(DivActionArrayInsertValue action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.variableName.evaluate(resolver);
        Expression expression = action.index;
        final Integer valueOf = expression != null ? Integer.valueOf((int) ((Number) expression.evaluate(resolver)).longValue()) : null;
        final Object evaluate = DivActionTypedUtilsKt.evaluate(action.value, resolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(view, str, resolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONArray invoke(@NotNull JSONArray jSONArray) {
                JSONArray mutate;
                JSONArray mutate2;
                int length = jSONArray.length();
                Integer num = valueOf;
                if (num == null || num.intValue() == length) {
                    final Object obj = evaluate;
                    mutate = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((List<Object>) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull List<Object> list) {
                            list.add(obj);
                        }
                    });
                    return mutate;
                }
                if (RangesKt.until(0, length).contains(num.intValue())) {
                    final Integer num2 = valueOf;
                    final Object obj2 = evaluate;
                    mutate2 = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            invoke((List<Object>) obj3);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull List<Object> list) {
                            list.add(num2.intValue(), obj2);
                        }
                    });
                    return mutate2;
                }
                DivActionTypedUtilsKt.logError(view, new IndexOutOfBoundsException("Index out of bound (" + valueOf + ") for mutation " + str + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    private final void handle(DivActionArrayRemoveValue action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.variableName.evaluate(resolver);
        final int longValue = (int) ((Number) action.index.evaluate(resolver)).longValue();
        DivActionTypedArrayMutationHandlerKt.updateVariable(view, str, resolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONArray invoke(@NotNull JSONArray jSONArray) {
                JSONArray mutate;
                int length = jSONArray.length();
                final int i = longValue;
                if (i >= 0 && i < length) {
                    mutate = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((List<Object>) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull List<Object> list) {
                            list.remove(i);
                        }
                    });
                    return mutate;
                }
                DivActionTypedUtilsKt.logError(view, new IndexOutOfBoundsException("Index out of bound (" + longValue + ") for mutation " + str + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    private final void handle(DivActionArraySetValue action, final Div2View view, ExpressionResolver resolver) {
        final String str = (String) action.variableName.evaluate(resolver);
        final int longValue = (int) ((Number) action.index.evaluate(resolver)).longValue();
        final Object evaluate = DivActionTypedUtilsKt.evaluate(action.value, resolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(view, str, resolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final JSONArray invoke(@NotNull JSONArray jSONArray) {
                JSONArray mutate;
                int length = jSONArray.length();
                final int i = longValue;
                if (i >= 0 && i < length) {
                    final Object obj = evaluate;
                    mutate = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((List<Object>) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull List<Object> list) {
                            list.set(i, obj);
                        }
                    });
                    return mutate;
                }
                DivActionTypedUtilsKt.logError(view, new IndexOutOfBoundsException("Index out of bound (" + longValue + ") for mutation " + str + " (" + length + ')'));
                return jSONArray;
            }
        });
    }
}
