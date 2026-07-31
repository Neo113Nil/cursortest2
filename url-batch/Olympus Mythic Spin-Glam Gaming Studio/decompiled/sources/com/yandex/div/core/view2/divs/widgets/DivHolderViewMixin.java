package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivHolderView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0001J\t\u0010!\u001a\u00020\"H\u0096\u0001J\u0019\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0096\u0001J\t\u0010'\u001a\u00020\"H\u0096\u0001J#\u0010(\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0096\u0001J\u0011\u0010-\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0096\u0001J\u0011\u0010.\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0096\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0014X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivHolderViewMixin;", "T", "Lcom/yandex/div2/Div;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "()V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "div", "getDiv", "()Lcom/yandex/div2/Div;", "setDiv", "(Lcom/yandex/div2/Div;)V", "Lcom/yandex/div2/Div;", "isTransient", "", "()Z", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "", "onBoundsChanged", "width", "", "height", "releaseBorderDrawer", "setBorder", "border", "Lcom/yandex/div2/DivBorder;", "view", "Landroid/view/View;", "transitionFinished", "transitionStarted", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivHolderViewMixin<T extends Div> implements DivHolderView<T>, DivBorderSupports, TransientView {

    @Nullable
    private BindingContext bindingContext;

    @Nullable
    private T div;
    private final /* synthetic */ DivBorderSupportsMixin $$delegate_0 = new DivBorderSupportsMixin();
    private final /* synthetic */ TransientViewMixin $$delegate_1 = new TransientViewMixin();

    @NotNull
    private final List<Disposable> subscriptions = new ArrayList();

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_1.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_1.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_1.transitionStarted(view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public T getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable T t) {
        this.div = t;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }
}
