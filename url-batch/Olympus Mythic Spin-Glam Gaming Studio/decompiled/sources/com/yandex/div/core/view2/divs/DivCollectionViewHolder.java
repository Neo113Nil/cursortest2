package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivCollectionViewHolder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\u0012H$J\u0006\u0010\u001c\u001a\u00020\u0012J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001aH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewWrapper", "Lcom/yandex/div/core/widget/DivViewWrapper;", "parentContext", "Lcom/yandex/div/core/view2/BindingContext;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "(Lcom/yandex/div/core/widget/DivViewWrapper;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;)V", "oldDiv", "Lcom/yandex/div2/Div;", "getOldDiv", "()Lcom/yandex/div2/Div;", "setOldDiv", "(Lcom/yandex/div2/Div;)V", "bind", "", "bindingContext", "div", X3.i.L, "", "path", "Lcom/yandex/div/core/state/DivStatePath;", "createChildView", "Landroid/view/View;", "logReuseError", "updateState", "updateWrapperLayoutParams", "childView", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class DivCollectionViewHolder extends RecyclerView.ViewHolder {

    @NotNull
    private final DivBinder divBinder;

    @Nullable
    private Div oldDiv;

    @NotNull
    private final BindingContext parentContext;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final DivViewWrapper viewWrapper;

    protected abstract void logReuseError();

    protected void updateWrapperLayoutParams(@NotNull View childView) {
    }

    public DivCollectionViewHolder(@NotNull DivViewWrapper divViewWrapper, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator) {
        super(divViewWrapper);
        this.viewWrapper = divViewWrapper;
        this.parentContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Div getOldDiv() {
        return this.oldDiv;
    }

    protected final void setOldDiv(@Nullable Div div) {
        this.oldDiv = div;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull BindingContext bindingContext, @NotNull Div div, int position, @NotNull DivStatePath path) {
        View createChildView;
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (RebindUtilsKt.tryRebindRecycleContainerChildren(this.viewWrapper, divView, div)) {
            this.oldDiv = div;
            return;
        }
        View child = this.viewWrapper.getChild();
        if (child != null) {
            createChildView = null;
            View view = this.oldDiv != null ? child : null;
            if (view != null) {
                DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
                if (divHolderView != null && (bindingContext2 = divHolderView.getBindingContext()) != null && (expressionResolver = bindingContext2.getExpressionResolver()) != null && DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, this.oldDiv, div, expressionResolver, expressionResolver2, null, 16, null)) {
                    createChildView = view;
                }
            }
        }
        createChildView = createChildView(bindingContext, div);
        this.viewWrapper.addView(createChildView);
        this.oldDiv = div;
        divView.getRuntimeStore().resolveRuntimeWith(divView, path, div, expressionResolver2, this.parentContext.getExpressionResolver());
        this.divBinder.bind(bindingContext, createChildView, div, path);
        updateWrapperLayoutParams(createChildView);
        divView.getRuntimeStore().showWarningIfNeeded(div.value());
    }

    private final View createChildView(BindingContext bindingContext, Div div) {
        if (this.oldDiv != null) {
            logReuseError();
        }
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this.viewWrapper, bindingContext.getDivView());
        return this.viewCreator.create(div, bindingContext.getExpressionResolver());
    }

    public final void updateState() {
        BindingContext bindingContext;
        View child = this.viewWrapper.getChild();
        if (child == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(child)) == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindStates(child, bindingContext, this.divBinder);
    }
}
