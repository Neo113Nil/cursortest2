package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.R;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCustom;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivCustomBinder.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJV\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u001bH\u0002J(\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Custom;", "Lcom/yandex/div2/DivCustom;", "Lcom/yandex/div/core/view2/divs/widgets/DivCustomWrapper;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "divCustomContainerViewAdapter", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "extensionController", "Lcom/yandex/div/core/extension/DivExtensionController;", "divBinder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivBinder;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Ljavax/inject/Provider;)V", "bind", "", "previousWrapper", "oldCustomView", "Landroid/view/View;", "oldDiv", "div", "context", "Lcom/yandex/div/core/view2/BindingContext;", "createView", "Lkotlin/Function0;", "bindView", "Lkotlin/Function1;", "view", "path", "Lcom/yandex/div/core/state/DivStatePath;", "replaceInParent", "parent", "Landroid/view/ViewGroup;", "newCustomView", "divView", "Lcom/yandex/div/core/view2/Div2View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivCustomBinder extends DivViewBinder<Div.Custom, DivCustom, DivCustomWrapper> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Provider divBinder;

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    public DivCustomBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull Provider provider) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.divBinder = provider;
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull BindingContext context, @NotNull DivCustomWrapper view, @NotNull Div.Custom div, @NotNull final DivStatePath path) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        View customView = view.getCustomView();
        Div.Custom div2 = view.getDiv();
        final Div2View divView = context.getDivView();
        final ExpressionResolver expressionResolver2 = context.getExpressionResolver();
        if (div2 == div) {
            BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) this.divBinder.get());
            return;
        }
        if (customView != null && div2 != null && (bindingContext = view.getBindingContext()) != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
            this.extensionController.unbindView(divView, expressionResolver, customView, div2.value());
        }
        this.baseBinder.bindView(context, view, div, div2);
        this.baseBinder.bindId$div_release(divView, view, null);
        final DivCustom value = div.getValue();
        if (this.divCustomContainerViewAdapter.isCustomTypeSupported(value.customType)) {
            bind(view, customView, div2 != null ? div2.getValue() : null, value, context, new Function0() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder$bindView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final View mo4828invoke() {
                    DivCustomContainerViewAdapter divCustomContainerViewAdapter;
                    divCustomContainerViewAdapter = DivCustomBinder.this.divCustomContainerViewAdapter;
                    return divCustomContainerViewAdapter.createView(value, divView, expressionResolver2, path);
                }
            }, new Function1() { // from class: com.yandex.div.core.view2.divs.DivCustomBinder$bindView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view2) {
                    DivCustomContainerViewAdapter divCustomContainerViewAdapter;
                    divCustomContainerViewAdapter = DivCustomBinder.this.divCustomContainerViewAdapter;
                    divCustomContainerViewAdapter.bindView(view2, value, divView, expressionResolver2, path);
                }
            });
        }
    }

    private final void replaceInParent(ViewGroup parent, View newCustomView, Div2View divView) {
        if (parent.getChildCount() != 0) {
            DivViewVisitorKt.visitViewTree(divView.getReleaseViewVisitor$div_release(), ViewGroupKt.get(parent, 0));
            parent.removeViewAt(0);
        }
        parent.addView(newCustomView);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bind(DivCustomWrapper previousWrapper, View oldCustomView, DivCustom oldDiv, DivCustom div, BindingContext context, Function0 createView, Function1 bindView) {
        View view;
        List<Div> nonNullItems;
        DivCustom value;
        if (oldCustomView != null) {
            Div.Custom div2 = previousWrapper.getDiv();
            if (Intrinsics.areEqual((div2 == null || (value = div2.getValue()) == null) ? null : value.customType, div.customType) && oldDiv != null && (nonNullItems = DivCollectionExtensionsKt.getNonNullItems(oldDiv)) != null && nonNullItems.size() == DivCollectionExtensionsKt.getNonNullItems(div).size()) {
                view = oldCustomView;
                Div2View divView = context.getDivView();
                if (!Intrinsics.areEqual(oldCustomView, view)) {
                    replaceInParent(previousWrapper, view, divView);
                }
                bindView.invoke(view);
                this.baseBinder.bindId$div_release(divView, view, div.getId());
                this.extensionController.bindView(divView, context.getExpressionResolver(), view, div);
            }
        }
        view = (View) createView.mo4828invoke();
        SpecialsBridge.yandexViewSetTag(view, R.id.div_custom_tag, div);
        Div2View divView2 = context.getDivView();
        if (!Intrinsics.areEqual(oldCustomView, view)) {
        }
        bindView.invoke(view);
        this.baseBinder.bindId$div_release(divView2, view, div.getId());
        this.extensionController.bindView(divView2, context.getExpressionResolver(), view, div);
    }
}
