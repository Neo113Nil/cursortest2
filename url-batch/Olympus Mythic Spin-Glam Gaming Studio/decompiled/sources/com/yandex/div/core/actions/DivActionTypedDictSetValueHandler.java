package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionDictSetValue;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivTypedValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedDictSetValueHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "handleAction", "", "scopeId", "", "action", "Lcom/yandex/div2/DivActionTyped;", "view", "Lcom/yandex/div/core/view2/Div2View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleSetValue", "", "Lcom/yandex/div2/DivActionDictSetValue;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivActionTypedDictSetValueHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof DivActionTyped.DictSetValue)) {
            return false;
        }
        handleSetValue(((DivActionTyped.DictSetValue) action).getValue(), view, resolver);
        return true;
    }

    private final void handleSetValue(DivActionDictSetValue action, final Div2View view, ExpressionResolver resolver) {
        String str = (String) action.variableName.evaluate(resolver);
        final String str2 = (String) action.key.evaluate(resolver);
        DivTypedValue divTypedValue = action.value;
        final Object evaluate = divTypedValue != null ? DivActionTypedUtilsKt.evaluate(divTypedValue, resolver) : null;
        VariableMutationHandler.INSTANCE.setVariable(view, str, resolver, new Function1() { // from class: com.yandex.div.core.actions.DivActionTypedDictSetValueHandler$handleSetValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Variable invoke(@NotNull Variable variable) {
                JSONObject clone;
                if (!(variable instanceof Variable.DictVariable)) {
                    DivActionTypedUtilsKt.logError(Div2View.this, new IllegalArgumentException("dict_set_value action requires dict variable"));
                    return variable;
                }
                Object value = variable.getValue();
                JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
                if (jSONObject != null) {
                    clone = DivActionTypedDictSetValueHandlerKt.clone(jSONObject);
                    Object obj = evaluate;
                    if (obj == null) {
                        clone.remove(str2);
                        ((Variable.DictVariable) variable).set(clone);
                    } else {
                        ((Variable.DictVariable) variable).set(clone.put(str2, obj));
                    }
                    return variable;
                }
                DivActionTypedUtilsKt.logError(Div2View.this, new IllegalArgumentException("Invalid variable value"));
                return variable;
            }
        });
    }
}
