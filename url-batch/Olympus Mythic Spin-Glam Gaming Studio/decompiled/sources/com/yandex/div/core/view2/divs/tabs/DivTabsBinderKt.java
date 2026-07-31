package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0012\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0017\u001a\u00020\r*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "Lcom/yandex/div2/DivTabs;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "tryReuse", "(Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;Lcom/yandex/div2/DivTabs;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "", "Lcom/yandex/div2/DivTabs$Item;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "Lkotlin/Function1;", "", "", "observer", "observeFixedHeightChange", "(Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div2/DivEdgeInsets;", "observe", "(Lcom/yandex/div2/DivEdgeInsets;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/internal/widget/tabs/TabView;", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "style", "observeStyle", "(Lcom/yandex/div/internal/widget/tabs/TabView;Lcom/yandex/div2/DivTabs$TabTitleStyle;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "Lcom/yandex/div2/DivFontWeight;", "Lcom/yandex/div/core/font/DivTypefaceType;", "toTypefaceType", "(Lcom/yandex/div2/DivFontWeight;)Lcom/yandex/div/core/font/DivTypefaceType;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivTabsBinderKt {

    /* compiled from: DivTabsBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivFontWeight.values().length];
            try {
                iArr[DivFontWeight.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivFontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivFontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivFontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTabsAdapter tryReuse(DivTabsAdapter divTabsAdapter, DivTabs divTabs, ExpressionResolver expressionResolver) {
        if (divTabsAdapter != null && divTabsAdapter.getIsDynamicHeight() == ((Boolean) divTabs.dynamicHeight.evaluate(expressionResolver)).booleanValue()) {
            return divTabsAdapter;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFixedHeightChange(List<DivTabs.Item> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1 function1) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DivSize height = ((DivTabs.Item) it.next()).div.value().getHeight();
            if (height instanceof DivSize.Fixed) {
                DivSize.Fixed fixed = (DivSize.Fixed) height;
                expressionSubscriber.addSubscription(fixed.getValue().unit.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(fixed.getValue().value.observe(expressionResolver, function1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe(DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1 function1) {
        expressionSubscriber.addSubscription(divEdgeInsets.left.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divEdgeInsets.right.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divEdgeInsets.top.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divEdgeInsets.bottom.observe(expressionResolver, function1));
        function1.invoke(null);
    }

    public static final void observeStyle(@NotNull final TabView tabView, @NotNull DivTabs.TabTitleStyle tabTitleStyle, @NotNull final ExpressionResolver expressionResolver, @NotNull ExpressionSubscriber expressionSubscriber) {
        TextViewExtensionsKt.observeFontSize(tabView, tabTitleStyle.fontSize, tabTitleStyle.fontSizeUnit, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLetterSpacing(tabView, tabTitleStyle.letterSpacing, tabTitleStyle.fontSize, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLineHeight(tabView, tabTitleStyle.lineHeight, tabTitleStyle.fontSizeUnit, null, null, expressionResolver, expressionSubscriber);
        final DivEdgeInsets divEdgeInsets = tabTitleStyle.paddings;
        final DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyTabPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7251invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7251invoke(@Nullable Object obj) {
                DivEdgeInsets divEdgeInsets2 = DivEdgeInsets.this;
                Expression expression = divEdgeInsets2.start;
                if (expression != null || divEdgeInsets2.end != null) {
                    TabView tabView2 = tabView;
                    int dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
                    int dpToPx2 = BaseDivViewExtensionsKt.dpToPx((Long) DivEdgeInsets.this.top.evaluate(expressionResolver), displayMetrics);
                    Expression expression2 = DivEdgeInsets.this.end;
                    tabView2.setTabPadding(dpToPx, dpToPx2, BaseDivViewExtensionsKt.dpToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) DivEdgeInsets.this.bottom.evaluate(expressionResolver), displayMetrics));
                    return;
                }
                tabView.setTabPadding(BaseDivViewExtensionsKt.dpToPx((Long) divEdgeInsets2.left.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) DivEdgeInsets.this.top.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) DivEdgeInsets.this.right.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx((Long) DivEdgeInsets.this.bottom.evaluate(expressionResolver), displayMetrics));
            }
        };
        expressionSubscriber.addSubscription(divEdgeInsets.top.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divEdgeInsets.bottom.observe(expressionResolver, function1));
        Expression expression = divEdgeInsets.start;
        if (expression != null || divEdgeInsets.end != null) {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
            Expression expression2 = divEdgeInsets.end;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
        } else {
            expressionSubscriber.addSubscription(divEdgeInsets.left.observe(expressionResolver, function1));
            expressionSubscriber.addSubscription(divEdgeInsets.right.observe(expressionResolver, function1));
        }
        function1.invoke(null);
        Expression expression3 = tabTitleStyle.inactiveFontWeight;
        if (expression3 == null) {
            expression3 = tabTitleStyle.fontWeight;
        }
        observeStyle$addToSubscriber(expression3, expressionSubscriber, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivFontWeight) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivFontWeight divFontWeight) {
                DivTypefaceType typefaceType;
                TabView tabView2 = TabView.this;
                typefaceType = DivTabsBinderKt.toTypefaceType(divFontWeight);
                tabView2.setInactiveTypefaceType(typefaceType);
            }
        });
        Expression expression4 = tabTitleStyle.activeFontWeight;
        if (expression4 == null) {
            expression4 = tabTitleStyle.fontWeight;
        }
        observeStyle$addToSubscriber(expression4, expressionSubscriber, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivFontWeight) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivFontWeight divFontWeight) {
                DivTypefaceType typefaceType;
                TabView tabView2 = TabView.this;
                typefaceType = DivTabsBinderKt.toTypefaceType(divFontWeight);
                tabView2.setActiveTypefaceType(typefaceType);
            }
        });
    }

    private static final void observeStyle$addToSubscriber(Expression<DivFontWeight> expression, ExpressionSubscriber expressionSubscriber, ExpressionResolver expressionResolver, Function1 function1) {
        expressionSubscriber.addSubscription(expression.observeAndGet(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTypefaceType toTypefaceType(DivFontWeight divFontWeight) {
        int i = WhenMappings.$EnumSwitchMapping$0[divFontWeight.ordinal()];
        if (i == 1) {
            return DivTypefaceType.MEDIUM;
        }
        if (i == 2) {
            return DivTypefaceType.REGULAR;
        }
        if (i == 3) {
            return DivTypefaceType.LIGHT;
        }
        if (i == 4) {
            return DivTypefaceType.BOLD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
