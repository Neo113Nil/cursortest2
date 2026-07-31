package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivGridBinder.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B3\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002J$\u0010 \u001a\u00020\u0010*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0002J\u001c\u0010$\u001a\u00020\u0010*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J*\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&*\u00020(2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020'2\u0006\u0010)\u001a\u00020*H\u0002J$\u0010+\u001a\u00020\u0010*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0002J&\u0010,\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0003H\u0014J.\u0010.\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J0\u0010/\u001a\b\u0012\u0004\u0012\u00020'0&*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J0\u00101\u001a\u00020\u0010*\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\"2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\"2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGridBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/DivGrid;", "Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "divPatchManager", "Lcom/yandex/div/core/downloader/DivPatchManager;", "divBinder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivBinder;", "divViewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/downloader/DivPatchManager;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "bindLayoutParams", "", "childView", "Landroid/view/View;", "childDiv", "Lcom/yandex/div2/DivBase;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "bindView", "context", "Lcom/yandex/div/core/view2/BindingContext;", "view", "div", "path", "Lcom/yandex/div/core/state/DivStatePath;", "setDataWithoutBinding", "bindingContext", "applyColumnSpan", "spanExpr", "Lcom/yandex/div/json/expressions/Expression;", "", "applyGridLayoutParams", "applyPatchToChild", "", "Lcom/yandex/div2/Div;", "Landroid/view/ViewGroup;", "childIndex", "", "applyRowSpan", "bind", "oldDiv", "bindItems", "dispatchBinding", "items", "observeContentAlignment", "horizontalAlignment", "Lcom/yandex/div2/DivAlignmentHorizontal;", "verticalAlignment", "Lcom/yandex/div2/DivAlignmentVertical;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes8.dex */
public final class DivGridBinder extends DivViewBinder<Div.Grid, DivGrid, DivGridLayout> {

    @NotNull
    private final Provider divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final Provider divViewCreator;

    public DivGridBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivPatchManager divPatchManager, @NotNull Provider provider, @NotNull Provider provider2) {
        super(divBaseBinder);
        this.divPatchManager = divPatchManager;
        this.divBinder = provider;
        this.divViewCreator = provider2;
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull BindingContext context, @NotNull DivGridLayout view, @NotNull Div.Grid div, @NotNull DivStatePath path) {
        super.bindView(context, (BindingContext) view, (DivGridLayout) div, path);
        DivGrid value = div.getValue();
        Div.Grid div2 = view.getDiv();
        bindItems(view, context, value, div2 != null ? div2.getValue() : null, path);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivGridLayout divGridLayout, @NotNull BindingContext bindingContext, @NotNull DivGrid divGrid, @Nullable DivGrid divGrid2) {
        divGridLayout.setReleaseViewVisitor$div_release(bindingContext.getDivView().getReleaseViewVisitor$div_release());
        BaseDivViewExtensionsKt.applyDivActions(divGridLayout, bindingContext, divGrid.action, divGrid.actions, divGrid.longtapActions, divGrid.doubletapActions, divGrid.hoverStartActions, divGrid.hoverEndActions, divGrid.pressStartActions, divGrid.pressEndActions, divGrid.actionAnimation, divGrid.captureFocusOnAction);
        divGridLayout.addSubscription(divGrid.columnCount.observeAndGet(bindingContext.getExpressionResolver(), new Function1() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                int i;
                DivGridLayout divGridLayout2 = DivGridLayout.this;
                long j2 = j >> 31;
                if (j2 == 0 || j2 == -1) {
                    i = (int) j;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j + "' to Int");
                    }
                    i = j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divGridLayout2.setColumnCount(i);
            }
        }));
        observeContentAlignment(divGridLayout, divGrid.contentAlignmentHorizontal, divGrid.contentAlignmentVertical, bindingContext.getExpressionResolver());
    }

    private final void bindItems(DivGridLayout divGridLayout, BindingContext bindingContext, DivGrid divGrid, DivGrid divGrid2, DivStatePath divStatePath) {
        List list;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<Div> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(divGrid);
        RebindUtilsKt.tryRebindPlainContainerChildren(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(nonNullItems, expressionResolver), this.divViewCreator);
        BaseDivViewExtensionsKt.trackVisibilityActions(divGridLayout, bindingContext.getDivView(), DivCollectionExtensionsKt.toDivItemBuilderResult(dispatchBinding(divGridLayout, bindingContext, nonNullItems, divStatePath), expressionResolver), (divGrid2 == null || (list = divGrid2.items) == null) ? null : DivCollectionExtensionsKt.toDivItemBuilderResult(list, expressionResolver));
    }

    private final void observeContentAlignment(final DivGridLayout divGridLayout, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        divGridLayout.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7194invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7194invoke(@NotNull Object obj) {
                DivGridLayout.this.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
            }
        };
        divGridLayout.addSubscription(expression.observe(expressionResolver, function1));
        divGridLayout.addSubscription(expression2.observe(expressionResolver, function1));
    }

    private final List<Div> dispatchBinding(DivGridLayout divGridLayout, BindingContext bindingContext, List<? extends Div> list, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<Div> applyPatchToChild = applyPatchToChild(divGridLayout, bindingContext, (Div) obj, i2 + i3);
            i3 += applyPatchToChild.size() - 1;
            CollectionsKt.addAll(arrayList, applyPatchToChild);
            i2 = i4;
        }
        List<String> ids = DivPathUtils.INSTANCE.getIds(arrayList);
        for (Object obj2 : arrayList) {
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Div div = (Div) obj2;
            View childAt = divGridLayout.getChildAt(i);
            DivBase value = div.value();
            ((DivBinder) this.divBinder.get()).bind(bindingContext, childAt, div, divStatePath.appendDiv(ids.get(i)));
            bindLayoutParams(childAt, value, expressionResolver);
            if (DivUtilKt.getHasSightActions(value)) {
                divView.bindViewToDiv$div_release(childAt, div);
            } else {
                divView.unbindViewFromDiv$div_release(childAt);
            }
            i = i5;
        }
        return arrayList;
    }

    private final List<Div> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Div div, int i) {
        Div2View divView = bindingContext.getDivView();
        String id = div.value().getId();
        if (id != null && !divView.getComplexRebindInProgress$div_release()) {
            Map<Div, View> createViewsForId = this.divPatchManager.createViewsForId(bindingContext, id);
            if (createViewsForId == null) {
                return CollectionsKt.listOf(div);
            }
            viewGroup.removeViewAt(i);
            Iterator<Map.Entry<Div, View>> it = createViewsForId.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                viewGroup.addView(it.next().getValue(), i2 + i, new DivLayoutParams(-2, -2));
                i2++;
            }
            return CollectionsKt.toList(createViewsForId.keySet());
        }
        return CollectionsKt.listOf(div);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindLayoutParams(final View childView, final DivBase childDiv, final ExpressionResolver resolver) {
        applyGridLayoutParams(childView, resolver, childDiv);
        if (childView instanceof ExpressionSubscriber) {
            Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7193invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7193invoke(@NotNull Object obj) {
                    DivGridBinder.this.applyGridLayoutParams(childView, resolver, childDiv);
                }
            };
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) childView;
            Expression columnSpan = childDiv.getColumnSpan();
            expressionSubscriber.addSubscription(columnSpan != null ? columnSpan.observe(resolver, function1) : null);
            Expression rowSpan = childDiv.getRowSpan();
            expressionSubscriber.addSubscription(rowSpan != null ? rowSpan.observe(resolver, function1) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGridLayoutParams(View view, ExpressionResolver expressionResolver, DivBase divBase) {
        applyColumnSpan(view, expressionResolver, divBase.getColumnSpan());
        applyRowSpan(view, expressionResolver, divBase.getRowSpan());
    }

    private final void applyColumnSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i = 1;
        }
        if (divLayoutParams.getColumnSpan() != i) {
            divLayoutParams.setColumnSpan(i);
            view.requestLayout();
        }
    }

    private final void applyRowSpan(View view, ExpressionResolver expressionResolver, Expression<Long> expression) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return;
        }
        if (expression != null) {
            long longValue = expression.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i = 1;
        }
        if (divLayoutParams.getRowSpan() != i) {
            divLayoutParams.setRowSpan(i);
            view.requestLayout();
        }
    }

    public final void setDataWithoutBinding(@NotNull BindingContext bindingContext, @NotNull DivGridLayout view, @NotNull Div.Grid div) {
        view.setDiv(div);
        List<Div> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(div.getValue());
        int size = nonNullItems.size();
        for (int i = 0; i < size; i++) {
            View childAt = view.getChildAt(i);
            BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(childAt);
            if (bindingContext2 == null) {
                bindingContext2 = bindingContext;
            }
            ((DivBinder) this.divBinder.get()).setDataWithoutBinding(bindingContext2, childAt, nonNullItems.get(i));
        }
    }
}
