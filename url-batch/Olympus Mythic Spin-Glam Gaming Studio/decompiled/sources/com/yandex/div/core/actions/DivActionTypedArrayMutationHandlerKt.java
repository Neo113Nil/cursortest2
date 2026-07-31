package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000e\u001a\u00020\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lorg/json/JSONArray;", "Lkotlin/Function1;", "", "", "", "action", "mutate", "(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Lorg/json/JSONArray;", "Lcom/yandex/div/core/view2/Div2View;", "", "name", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "valueMutation", "updateVariable", "(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DivActionTypedArrayMutationHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONArray mutate(JSONArray jSONArray, Function1 function1) {
        List mutableList = CollectionsKt.toMutableList((Collection) JsonUtilsKt.asList(jSONArray));
        function1.invoke(mutableList);
        return new JSONArray((Collection) mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVariable(final Div2View div2View, String str, ExpressionResolver expressionResolver, final Function1 function1) {
        VariableMutationHandler.INSTANCE.setVariable(div2View, str, expressionResolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt$updateVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                if (!(variable instanceof Variable.ArrayVariable)) {
                    DivActionTypedUtilsKt.logError(Div2View.this.getView(), new IllegalArgumentException("Action requires array variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONArray jSONArray = value instanceof JSONArray ? (JSONArray) value : null;
                if (jSONArray == null) {
                    DivActionTypedUtilsKt.logError(Div2View.this.getView(), new IllegalArgumentException("Invalid variable value"));
                    return variable;
                }
                ((Variable.ArrayVariable) variable).set((JSONArray) function1.invoke(jSONArray));
                return variable;
            }
        });
    }
}
