package com.yandex.div.core.actions;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionSetState;
import com.yandex.div2.DivActionTyped;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivActionTypedSetStateHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedSetStateHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "handleAction", "", "scopeId", "", "action", "Lcom/yandex/div2/DivActionTyped;", "view", "Lcom/yandex/div/core/view2/Div2View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "handleSetState", "", "Lcom/yandex/div2/DivActionSetState;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DivActionTypedSetStateHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (!(action instanceof DivActionTyped.SetState)) {
            return false;
        }
        handleSetState(((DivActionTyped.SetState) action).getValue(), view, resolver);
        return true;
    }

    private final void handleSetState(DivActionSetState action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.stateId.evaluate(resolver);
        try {
            view.switchToState(DivStatePath.INSTANCE.parse(str), ((Boolean) action.temporary.evaluate(resolver)).booleanValue());
        } catch (PathFormatException e) {
            DivActionTypedUtilsKt.logError(view, new IllegalArgumentException("Invalid format of " + str, e));
        }
    }
}
