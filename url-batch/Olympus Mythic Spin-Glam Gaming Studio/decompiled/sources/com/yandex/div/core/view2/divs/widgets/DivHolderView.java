package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div2.Div;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivHolderView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00018\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "T", "Lcom/yandex/div2/Div;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div;", "setDiv", "(Lcom/yandex/div2/Div;)V", "release", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DivHolderView<T extends Div> extends DivBorderSupports, TransientView, ExpressionSubscriber {
    @Nullable
    BindingContext getBindingContext();

    @Nullable
    T getDiv();

    void setBindingContext(@Nullable BindingContext bindingContext);

    void setDiv(@Nullable T t);

    default void release() {
        super.release();
        setDiv(null);
        setBindingContext(null);
        releaseBorderDrawer();
    }
}
