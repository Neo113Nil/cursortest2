package com.yandex.div.core.tooltip;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipController.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/tooltip/PopupWindowTouchListener;", "Landroid/view/View$OnTouchListener;", "popupWindow", "Landroid/widget/PopupWindow;", "tooltipView", "Landroid/view/View;", "isModal", "", "shouldDismissByOutsideTouch", "tapOutsideActions", "", "Lcom/yandex/div2/DivAction;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "(Landroid/widget/PopupWindow;Landroid/view/View;ZZLjava/util/List;Lcom/yandex/div/core/view2/BindingContext;)V", "hitRect", "Landroid/graphics/Rect;", "onTouch", "view", "event", "Landroid/view/MotionEvent;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PopupWindowTouchListener implements View.OnTouchListener {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final Rect hitRect = new Rect();
    private final boolean isModal;

    @NotNull
    private final PopupWindow popupWindow;
    private final boolean shouldDismissByOutsideTouch;

    @Nullable
    private final List<DivAction> tapOutsideActions;

    @NotNull
    private final View tooltipView;

    public PopupWindowTouchListener(@NotNull PopupWindow popupWindow, @NotNull View view, boolean z, boolean z2, @Nullable List<DivAction> list, @NotNull BindingContext bindingContext) {
        this.popupWindow = popupWindow;
        this.tooltipView = view;
        this.isModal = z;
        this.shouldDismissByOutsideTouch = z2;
        this.tapOutsideActions = list;
        this.bindingContext = bindingContext;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        this.tooltipView.getHitRect(this.hitRect);
        if (this.hitRect.contains((int) event.getX(), (int) event.getY())) {
            return false;
        }
        if (event.getAction() == 1) {
            List<DivAction> list = this.tapOutsideActions;
            if (list != null) {
                ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
                Div2View divView = this.bindingContext.getDivView();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) ((DivAction) obj).isEnabled.evaluate(expressionResolver)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    divView.getDiv2Component().getActionHandler().handleActionWithReason((DivAction) it.next(), divView, expressionResolver, "click");
                }
            }
            if (this.shouldDismissByOutsideTouch) {
                this.popupWindow.dismiss();
            }
        }
        return this.isModal;
    }
}
