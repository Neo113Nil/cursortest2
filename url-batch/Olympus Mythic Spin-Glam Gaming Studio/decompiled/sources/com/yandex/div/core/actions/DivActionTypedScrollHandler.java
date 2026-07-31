package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.DivActionScrollDestination;
import com.yandex.div2.DivActionScrollTo;
import com.yandex.div2.DivActionTyped;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivActionTypedScrollHandler.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\u0003\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/actions/DivActionTypedScrollHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "()V", "handleAction", "", "action", "Lcom/yandex/div2/DivActionScrollBy;", "view", "Lcom/yandex/div/core/view2/Div2View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div2/DivActionScrollTo;", "", "scopeId", "", "Lcom/yandex/div2/DivActionTyped;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivActionTypedScrollHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String scopeId, @NotNull DivActionTyped action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        if (action instanceof DivActionTyped.ScrollBy) {
            handleAction(((DivActionTyped.ScrollBy) action).getValue(), view, resolver);
            return true;
        }
        if (!(action instanceof DivActionTyped.ScrollTo)) {
            return false;
        }
        handleAction(((DivActionTyped.ScrollTo) action).getValue(), view, resolver);
        return true;
    }

    private final void handleAction(DivActionScrollBy action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.id.evaluate(resolver);
        int longValue = (int) ((Number) action.offset.evaluate(resolver)).longValue();
        int longValue2 = (int) ((Number) action.itemCount.evaluate(resolver)).longValue();
        String companion = DivActionScrollBy.Overflow.INSTANCE.toString((DivActionScrollBy.Overflow) action.overflow.evaluate(resolver));
        boolean booleanValue = ((Boolean) action.animated.evaluate(resolver)).booleanValue();
        DivViewWithItemsController create$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.INSTANCE, str, view, resolver, null, 8, null);
        if (create$default == null) {
            return;
        }
        create$default.changeCurrentItemByStep(companion, longValue2, booleanValue);
        create$default.scrollByOffset(companion, longValue, booleanValue);
    }

    private final void handleAction(DivActionScrollTo action, Div2View view, ExpressionResolver resolver) {
        String str = (String) action.id.evaluate(resolver);
        boolean booleanValue = ((Boolean) action.animated.evaluate(resolver)).booleanValue();
        DivViewWithItemsController create$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.INSTANCE, str, view, resolver, null, 8, null);
        if (create$default == null) {
            return;
        }
        DivActionScrollDestination divActionScrollDestination = action.destination;
        if (divActionScrollDestination instanceof DivActionScrollDestination.Offset) {
            create$default.scrollTo((int) ((Number) ((DivActionScrollDestination.Offset) divActionScrollDestination).getValue().value.evaluate(resolver)).longValue(), booleanValue);
            return;
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.Index) {
            create$default.setCurrentItem((int) ((Number) ((DivActionScrollDestination.Index) divActionScrollDestination).getValue().value.evaluate(resolver)).longValue(), booleanValue);
        } else if (divActionScrollDestination instanceof DivActionScrollDestination.End) {
            create$default.scrollToEnd(booleanValue);
        } else if (divActionScrollDestination instanceof DivActionScrollDestination.Start) {
            create$default.scrollToStart(booleanValue);
        }
    }
}
