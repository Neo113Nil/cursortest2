package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.R;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBorder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivFocusBinder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016J\u001e\u0010\u0014\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0012J\u000e\u0010\u0017\u001a\u00020\u0018*\u0004\u0018\u00010\fH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivFocusBinder;", "", "actionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "(Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "bindDivBorder", "", "view", "Landroid/view/View;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "focusedBorder", "Lcom/yandex/div2/DivBorder;", "defaultBorder", "bindDivFocusActions", "target", "onFocusActions", "", "Lcom/yandex/div2/DivAction;", "onBlurActions", "applyBorder", "bindingContext", "border", "isConstantlyEmpty", "", "FocusChangeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes14.dex */
public class DivFocusBinder {

    @NotNull
    private final DivActionBinder actionBinder;

    public DivFocusBinder(@NotNull DivActionBinder divActionBinder) {
        this.actionBinder = divActionBinder;
    }

    public void bindDivBorder(@NotNull View view, @NotNull BindingContext context, @Nullable DivBorder focusedBorder, @Nullable DivBorder defaultBorder) {
        applyBorder(view, context, (focusedBorder == null || isConstantlyEmpty(focusedBorder) || !view.isFocused()) ? defaultBorder : focusedBorder);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && isConstantlyEmpty(focusedBorder)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusActions() == null && focusChangeListener.getBlurActions() == null && isConstantlyEmpty(focusedBorder)) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(context);
        focusChangeListener2.setBorders(focusedBorder, defaultBorder);
        if (focusChangeListener != null) {
            focusChangeListener2.setActions(focusChangeListener.getFocusActions(), focusChangeListener.getBlurActions());
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void applyBorder(View view, BindingContext bindingContext, DivBorder divBorder) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).setBorder(bindingContext, divBorder, view);
            return;
        }
        float f = 0.0f;
        if (divBorder != null && !isConstantlyEmpty(divBorder) && ((Boolean) divBorder.hasShadow.evaluate(bindingContext.getExpressionResolver())).booleanValue() && divBorder.shadow == null) {
            f = view.getResources().getDimension(R.dimen.div_shadow_elevation);
        }
        view.setElevation(f);
    }

    private boolean isConstantlyEmpty(DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return divBorder.cornerRadius == null && divBorder.cornersRadius == null && Intrinsics.areEqual(divBorder.hasShadow, Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null)) && divBorder.shadow == null && divBorder.stroke == null;
    }

    public void bindDivFocusActions(@NotNull View target, @NotNull BindingContext context, @Nullable List<DivAction> onFocusActions, @Nullable List<DivAction> onBlurActions) {
        View.OnFocusChangeListener onFocusChangeListener = target.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && CollectionsKt.allIsNullOrEmpty(onFocusActions, onBlurActions)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusedBorder() == null && CollectionsKt.allIsNullOrEmpty(onFocusActions, onBlurActions)) {
            target.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(context);
        if (focusChangeListener != null) {
            focusChangeListener2.setBorders(focusChangeListener.getFocusedBorder(), focusChangeListener.getBlurredBorder());
        }
        focusChangeListener2.setActions(onFocusActions, onBlurActions);
        target.setOnFocusChangeListener(focusChangeListener2);
    }

    /* compiled from: DivFocusBinder.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u00020\u00142\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u001a\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000bJ\"\u0010\"\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0002R.\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivFocusBinder$FocusChangeListener;", "Landroid/view/View$OnFocusChangeListener;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "(Lcom/yandex/div/core/view2/divs/DivFocusBinder;Lcom/yandex/div/core/view2/BindingContext;)V", "<set-?>", "", "Lcom/yandex/div2/DivAction;", "blurActions", "getBlurActions", "()Ljava/util/List;", "Lcom/yandex/div2/DivBorder;", "blurredBorder", "getBlurredBorder", "()Lcom/yandex/div2/DivBorder;", "focusActions", "getFocusActions", "focusedBorder", "getFocusedBorder", "applyBorder", "", "view", "Landroid/view/View;", "border", "onFocusChange", "v", "hasFocus", "", "setActions", "onFocus", "onBlur", "setBorders", "focused", "blurred", "handle", "target", "actionLogType", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class FocusChangeListener implements View.OnFocusChangeListener {

        @Nullable
        private List<DivAction> blurActions;

        @Nullable
        private DivBorder blurredBorder;

        @NotNull
        private final BindingContext context;

        @Nullable
        private List<DivAction> focusActions;

        @Nullable
        private DivBorder focusedBorder;

        public FocusChangeListener(@NotNull BindingContext bindingContext) {
            this.context = bindingContext;
        }

        @Nullable
        public final DivBorder getFocusedBorder() {
            return this.focusedBorder;
        }

        @Nullable
        public final DivBorder getBlurredBorder() {
            return this.blurredBorder;
        }

        @Nullable
        public final List<DivAction> getFocusActions() {
            return this.focusActions;
        }

        @Nullable
        public final List<DivAction> getBlurActions() {
            return this.blurActions;
        }

        public final void setBorders(@Nullable DivBorder focused, @Nullable DivBorder blurred) {
            this.focusedBorder = focused;
            this.blurredBorder = blurred;
        }

        public final void setActions(@Nullable List<DivAction> onFocus, @Nullable List<DivAction> onBlur) {
            this.focusActions = onFocus;
            this.blurActions = onBlur;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(@NotNull View v, boolean hasFocus) {
            if (hasFocus) {
                applyBorder(v, this.focusedBorder);
                List<DivAction> list = this.focusActions;
                if (list != null) {
                    handle(list, v, "focus");
                    return;
                }
                return;
            }
            if (this.focusedBorder != null) {
                applyBorder(v, this.blurredBorder);
            }
            List<DivAction> list2 = this.blurActions;
            if (list2 != null) {
                handle(list2, v, "blur");
            }
        }

        private final void applyBorder(View view, DivBorder border) {
            DivFocusBinder.this.applyBorder(view, this.context, border);
        }

        private final void handle(List<DivAction> list, View view, String str) {
            DivFocusBinder.this.actionBinder.handleBulkActions$div_release(this.context, view, list, str);
        }
    }
}
