package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewBinder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J-\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J/\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J+\u0010\u0016\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u0019J3\u0010\u0016\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/DivViewBinder;", "TData", "Lcom/yandex/div2/Div;", "TDataValue", "Lcom/yandex/div2/DivBase;", "TView", "Landroid/view/View;", "", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;)V", "bindView", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "view", "div", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lcom/yandex/div2/Div;)V", "path", "Lcom/yandex/div/core/state/DivStatePath;", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lcom/yandex/div2/Div;Lcom/yandex/div/core/state/DivStatePath;)V", "bindViewInternal", "bind", "bindingContext", "oldDiv", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivBase;Lcom/yandex/div2/DivBase;)V", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivBase;Lcom/yandex/div2/DivBase;Lcom/yandex/div/core/state/DivStatePath;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DivViewBinder<TData extends Div, TDataValue extends DivBase, TView extends View> {

    @NotNull
    private final DivBaseBinder baseBinder;

    protected void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue tdatavalue, @Nullable TDataValue tdatavalue2) {
    }

    public DivViewBinder(@NotNull DivBaseBinder divBaseBinder) {
        this.baseBinder = divBaseBinder;
    }

    public void bindView(@NotNull BindingContext context, @NotNull TView view, @NotNull TData div) {
        bindViewInternal(context, view, div, null);
    }

    public void bindView(@NotNull BindingContext context, @NotNull TView view, @NotNull TData div, @NotNull DivStatePath path) {
        bindViewInternal(context, view, div, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindViewInternal(BindingContext context, TView view, TData div, DivStatePath path) {
        Unit unit;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<TData of com.yandex.div.core.view2.DivViewBinder>");
        Div div2 = ((DivHolderView) view).getDiv();
        if (div == div2) {
            return;
        }
        this.baseBinder.bindView(context, view, div, div2);
        if (path != null) {
            DivBase value = div.value();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder.bindViewInternal$lambda$0");
            bind(view, context, value, div2 != null ? div2.value() : null, path);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            DivBase value2 = div.value();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder");
            bind(view, context, value2, div2 != null ? div2.value() : null);
        }
    }

    protected void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue tdatavalue, @Nullable TDataValue tdatavalue2, @NotNull DivStatePath divStatePath) {
        bind(tview, bindingContext, tdatavalue, tdatavalue2);
    }
}
