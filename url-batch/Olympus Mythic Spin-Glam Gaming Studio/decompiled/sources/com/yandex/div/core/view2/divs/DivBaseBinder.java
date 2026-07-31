package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.R;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSwitch;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivVisibility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJC\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\b\u001aJ'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0002\b JQ\u0010!\u001a\u00020\u000e2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010#2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00172\u0016\b\u0004\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u000e0(H\u0082\bJ(\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,2\b\u0010\u0015\u001a\u0004\u0018\u00010,JR\u0010-\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u001f2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u00108\u001a\u00020\u000e*\u00020\u00122\u0006\u00109\u001a\u00020:H\u0002J\u0014\u0010;\u001a\u00020\u000e*\u00020\u00122\u0006\u0010+\u001a\u00020\u0014H\u0002J \u0010<\u001a\u00020\u000e*\u00020\u00122\b\u0010=\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010>\u001a\u000204H\u0002J,\u0010?\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010@\u001a\u00020AH\u0002J&\u0010B\u001a\u00020\u000e*\u00020\u00122\u0006\u0010C\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J.\u0010D\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010E\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010F\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J:\u0010\r\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u001c\u0010G\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J4\u0010H\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010JH\u0002J&\u0010\u001b\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J.\u0010M\u001a\u00020\u000e*\u00020\u00122\u0006\u0010C\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010N\u001a\u00020\u000e*\u00020\u00122\u0006\u0010C\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J.\u0010O\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010P\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010Q\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010R\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010S\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\f\u0010T\u001a\u00020\u000e*\u00020\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "", "divBackgroundBinder", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;", "tooltipController", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "divFocusBinder", "Lcom/yandex/div/core/view2/divs/DivFocusBinder;", "divAccessibilityBinder", "Lcom/yandex/div/core/view2/DivAccessibilityBinder;", "layoutParamsBinder", "Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;", "(Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;Lcom/yandex/div/core/tooltip/DivTooltipController;Lcom/yandex/div/core/view2/divs/DivFocusBinder;Lcom/yandex/div/core/view2/DivAccessibilityBinder;Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;)V", "bindBackground", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "target", "Landroid/view/View;", "newDiv", "Lcom/yandex/div2/DivBase;", "oldDiv", "subscriber", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "additionalLayer", "Landroid/graphics/drawable/Drawable;", "bindBackground$div_release", "bindId", "divView", "Lcom/yandex/div/core/view2/Div2View;", "id", "", "bindId$div_release", "bindNextFocusId", "newFocusId", "Lcom/yandex/div/json/expressions/Expression;", "oldFocusId", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "applyNextFocusId", "Lkotlin/Function1;", "bindView", "view", "div", "Lcom/yandex/div2/Div;", "updateSizeVariable", "metrics", "Landroid/util/DisplayMetrics;", "variableName", "variablesHolder", "Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "start", "", "end", "oldStart", "oldEnd", "applyAlpha", "alpha", "", "applyFocusableState", "applyId", "divId", "viewId", "applyVisibility", "firstApply", "", "bind", "bindingContext", "bindAccessibility", "bindAlignment", "bindAlpha", "bindBorder", "bindFocusActions", "onFocus", "", "Lcom/yandex/div2/DivAction;", "onBlur", "bindLayoutParams", "bindLayoutProvider", "bindMargins", "bindNextFocus", "bindPaddings", "bindTransform", "bindVisibility", "clearLayoutProviderVariables", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes.dex */
public final class DivBaseBinder {

    @NotNull
    private final DivAccessibilityBinder divAccessibilityBinder;

    @NotNull
    private final DivBackgroundBinder divBackgroundBinder;

    @NotNull
    private final DivFocusBinder divFocusBinder;

    @NotNull
    private final DivLayoutParamsBinder layoutParamsBinder;

    @NotNull
    private final DivTooltipController tooltipController;

    /* compiled from: DivBaseBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivVisibility.values().length];
            try {
                iArr[DivVisibility.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivVisibility.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivVisibility.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivBaseBinder(@NotNull DivBackgroundBinder divBackgroundBinder, @NotNull DivTooltipController divTooltipController, @NotNull DivFocusBinder divFocusBinder, @NotNull DivAccessibilityBinder divAccessibilityBinder, @NotNull DivLayoutParamsBinder divLayoutParamsBinder) {
        this.divBackgroundBinder = divBackgroundBinder;
        this.tooltipController = divTooltipController;
        this.divFocusBinder = divFocusBinder;
        this.divAccessibilityBinder = divAccessibilityBinder;
        this.layoutParamsBinder = divLayoutParamsBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindView(@NotNull BindingContext context, @NotNull View view, @NotNull Div div, @Nullable Div oldDiv) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div>");
        DivHolderView divHolderView = (DivHolderView) view;
        divHolderView.closeAllSubscription();
        divHolderView.setDiv(div);
        divHolderView.setBindingContext(context);
        bind(view, context, div.value(), oldDiv != null ? oldDiv.value() : null);
    }

    private final void bind(View view, BindingContext bindingContext, DivBase divBase, DivBase divBase2) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Div2View divView = bindingContext.getDivView();
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(view);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
        bindId(view, divView, divBase, divBase2);
        bindLayoutParams(view, bindingContext, divBase, divBase2, expressionSubscriber);
        bindMargins(view, divBase, divBase2, expressionResolver, expressionSubscriber);
        bindAlignment(view, divBase, divBase2, expressionResolver, expressionSubscriber);
        bindLayoutProvider(view, bindingContext, divBase, divBase2);
        bindAccessibility(view, divBase, divBase2, expressionResolver, expressionSubscriber);
        bindAlpha(view, divBase, divBase2, expressionResolver, expressionSubscriber);
        bindBackground$default(this, view, bindingContext, divBase, divBase2, expressionSubscriber, null, 16, null);
        bindBorder(view, bindingContext, divBase);
        bindPaddings(view, divBase, divBase2, expressionResolver, expressionSubscriber);
        bindNextFocus(view, divView, divBase, divBase2, expressionResolver, expressionSubscriber);
        DivFocus focus = divBase.getFocus();
        List<DivAction> list = focus != null ? focus.onFocus : null;
        DivFocus focus2 = divBase.getFocus();
        bindFocusActions(view, bindingContext, list, focus2 != null ? focus2.onBlur : null);
        bindVisibility(view, divView, divBase, divBase2, expressionResolver, expressionSubscriber);
        bindTransform(view, divBase, divBase2, expressionResolver, expressionSubscriber);
        List<DivTooltip> tooltips = divBase.getTooltips();
        if (tooltips != null) {
            this.tooltipController.mapTooltip(view, tooltips);
        }
        applyFocusableState(view, divBase);
    }

    public final void bindId$div_release(@NotNull Div2View divView, @NotNull View target, @Nullable String id) {
        applyId(target, id, id == null ? -1 : divView.getViewComponent().getViewIdProvider().getViewId(id));
    }

    private final void bindId(View view, Div2View div2View, DivBase divBase, DivBase divBase2) {
        if (Intrinsics.areEqual(divBase.getId(), divBase2 != null ? divBase2.getId() : null)) {
            return;
        }
        applyId(view, divBase.getId(), div2View.getViewComponent().getViewIdProvider().getViewId(divBase.getId()));
    }

    static /* synthetic */ void applyId$default(DivBaseBinder divBaseBinder, View view, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        divBaseBinder.applyId(view, str, i);
    }

    private final void applyId(View view, String str, int i) {
        view.setTag(str);
        view.setId(i);
    }

    private final void bindLayoutParams(View view, BindingContext bindingContext, DivBase divBase, DivBase divBase2, ExpressionSubscriber expressionSubscriber) {
        this.layoutParamsBinder.bindLayoutParams(bindingContext, view, divBase, divBase2, expressionSubscriber);
    }

    private final void bindMargins(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(divBase.getMargins(), divBase2 != null ? divBase2.getMargins() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyMargins(view, divBase.getMargins(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(divBase.getMargins())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, divBase.getMargins(), expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindMargins$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7172invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7172invoke(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyMargins(view, divBase.getMargins(), expressionResolver);
            }
        });
    }

    private final void bindAlignment(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(divBase.getAlignmentHorizontal(), divBase2 != null ? divBase2.getAlignmentHorizontal() : null)) {
            if (ExpressionsKt.equalsToConstant(divBase.getAlignmentVertical(), divBase2 != null ? divBase2.getAlignmentVertical() : null)) {
                return;
            }
        }
        Expression alignmentHorizontal = divBase.getAlignmentHorizontal();
        DivAlignmentHorizontal divAlignmentHorizontal = alignmentHorizontal != null ? (DivAlignmentHorizontal) alignmentHorizontal.evaluate(expressionResolver) : null;
        Expression alignmentVertical = divBase.getAlignmentVertical();
        BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontal, alignmentVertical != null ? (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divBase.getAlignmentHorizontal()) && ExpressionsKt.isConstantOrNull(divBase.getAlignmentVertical())) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7171invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7171invoke(@NotNull Object obj) {
                View view2 = view;
                Expression alignmentHorizontal2 = divBase.getAlignmentHorizontal();
                DivAlignmentHorizontal divAlignmentHorizontal2 = alignmentHorizontal2 != null ? (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver) : null;
                Expression alignmentVertical2 = divBase.getAlignmentVertical();
                BaseDivViewExtensionsKt.applyAlignment(view2, divAlignmentHorizontal2, alignmentVertical2 != null ? (DivAlignmentVertical) alignmentVertical2.evaluate(expressionResolver) : null);
            }
        };
        Expression alignmentHorizontal2 = divBase.getAlignmentHorizontal();
        expressionSubscriber.addSubscription(alignmentHorizontal2 != null ? alignmentHorizontal2.observe(expressionResolver, function1) : null);
        Expression alignmentVertical2 = divBase.getAlignmentVertical();
        expressionSubscriber.addSubscription(alignmentVertical2 != null ? alignmentVertical2.observe(expressionResolver, function1) : null);
    }

    private final void bindLayoutProvider(final View view, final BindingContext bindingContext, DivBase divBase, DivBase divBase2) {
        DivLayoutProvider layoutProvider;
        DivLayoutProvider layoutProvider2;
        DivLayoutProvider layoutProvider3;
        final Div2View divView = bindingContext.getDivView();
        DivData divData = divView.getDivData();
        if (divData == null || (layoutProvider = divBase.getLayoutProvider()) == null) {
            return;
        }
        if (StringsKt.equals$default(layoutProvider.widthVariableName, (divBase2 == null || (layoutProvider3 = divBase2.getLayoutProvider()) == null) ? null : layoutProvider3.widthVariableName, false, 2, null)) {
            if (StringsKt.equals$default(layoutProvider.heightVariableName, (divBase2 == null || (layoutProvider2 = divBase2.getLayoutProvider()) == null) ? null : layoutProvider2.heightVariableName, false, 2, null)) {
                return;
            }
        }
        if ((divBase2 != null ? divBase2.getLayoutProvider() : null) != null) {
            clearLayoutProviderVariables(view);
        }
        final String str = layoutProvider.widthVariableName;
        final String str2 = layoutProvider.heightVariableName;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            DivActionTypedUtilsKt.logError(divView, new Throwable("Neither width_variable_name nor height_variable_name found."));
            return;
        }
        DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder = divView.getVariablesHolders$div_release().get(divData);
        if (divLayoutProviderVariablesHolder == null) {
            divLayoutProviderVariablesHolder = new DivLayoutProviderVariablesHolder();
            divLayoutProviderVariablesHolder.observeDivData(divData, bindingContext);
            divView.getVariablesHolders$div_release().put(divData, divLayoutProviderVariablesHolder);
        }
        final DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder2 = divLayoutProviderVariablesHolder;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                DivBaseBinder.bindLayoutProvider$lambda$4(view, this, divView, str, divLayoutProviderVariablesHolder2, bindingContext, str2, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        SpecialsBridge.yandexViewSetTag(view, R.id.div_layout_provider_listener_id, onLayoutChangeListener);
        if (divView.getClearVariablesListener() != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener$default = OnPreDrawListeners.onPreDrawListener$default((DrawingPassOverrideStrategy) null, new Function0() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindLayoutProvider$clearVariablesListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                DivLayoutProviderVariablesHolder.this.clear();
                Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
                Div2View div2View = divView;
                for (Map.Entry<ExpressionResolver, Map<String, Integer>> entry : layoutSizes$div_release.entrySet()) {
                    ExpressionResolver key = entry.getKey();
                    for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                        VariableMutationHandler.INSTANCE.setVariable(div2View, entry2.getKey(), String.valueOf(entry2.getValue().intValue()), key);
                    }
                }
                divView.getLayoutSizes$div_release().clear();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        divView.setClearVariablesListener$div_release(onPreDrawListener$default);
        divView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLayoutProvider$lambda$4(View view, DivBaseBinder divBaseBinder, Div2View div2View, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, BindingContext bindingContext, String str2, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str, divLayoutProviderVariablesHolder, i, i3, i5, i7, bindingContext.getExpressionResolver());
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str2, divLayoutProviderVariablesHolder, i2, i4, i6, i8, bindingContext.getExpressionResolver());
    }

    private final void updateSizeVariable(Div2View divView, DisplayMetrics metrics, String variableName, DivLayoutProviderVariablesHolder variablesHolder, int start, int end, int oldStart, int oldEnd, ExpressionResolver resolver) {
        int i;
        if (variableName == null || variableName.length() == 0 || (i = end - start) == oldEnd - oldStart) {
            return;
        }
        if (variablesHolder.contains(variableName)) {
            DivActionTypedUtilsKt.logError(divView, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
        Map<String, Integer> map = layoutSizes$div_release.get(resolver);
        if (map == null) {
            map = new LinkedHashMap<>();
            layoutSizes$div_release.put(resolver, map);
        }
        map.put(variableName, Integer.valueOf(BaseDivViewExtensionsKt.pxToDp(Integer.valueOf(i), metrics)));
    }

    private final void clearLayoutProviderVariables(View view) {
        Object tag = view.getTag(R.id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    private final void bindPaddings(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (DivDataExtensionsKt.equalsToConstant(divBase.getPaddings(), divBase2 != null ? divBase2.getPaddings() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyPaddings(view, divBase.getPaddings(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(divBase.getPaddings())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, divBase.getPaddings(), expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7173invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7173invoke(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(view, divBase.getPaddings(), expressionResolver);
            }
        });
    }

    private final void bindAccessibility(View view, DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        this.divAccessibilityBinder.bind(view, divBase, divBase2, expressionResolver, expressionSubscriber);
    }

    private final void bindAlpha(final View view, DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(divBase.getAlpha(), divBase2 != null ? divBase2.getAlpha() : null)) {
            return;
        }
        applyAlpha(view, ((Number) divBase.getAlpha().evaluate(expressionResolver)).doubleValue());
        if (ExpressionsKt.isConstant(divBase.getAlpha())) {
            return;
        }
        expressionSubscriber.addSubscription(divBase.getAlpha().observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).doubleValue());
                return Unit.INSTANCE;
            }

            public final void invoke(double d) {
                DivBaseBinder.this.applyAlpha(view, d);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyAlpha(View view, double d) {
        view.setAlpha((float) d);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports != null) {
            divBorderSupports.invalidateBorder();
        }
    }

    private final void bindBorder(View view, BindingContext bindingContext, DivBase divBase) {
        DivFocusBinder divFocusBinder = this.divFocusBinder;
        DivFocus focus = divBase.getFocus();
        divFocusBinder.bindDivBorder(view, bindingContext, focus != null ? focus.border : null, divBase.getBorder());
    }

    public static /* synthetic */ void bindBackground$div_release$default(DivBaseBinder divBaseBinder, BindingContext bindingContext, View view, DivBase divBase, DivBase divBase2, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i, Object obj) {
        if ((i & 32) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground$div_release(bindingContext, view, divBase, divBase2, expressionSubscriber, drawable);
    }

    public final void bindBackground$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull DivBase newDiv, @Nullable DivBase oldDiv, @NotNull ExpressionSubscriber subscriber, @Nullable Drawable additionalLayer) {
        bindBackground(target, context, newDiv, oldDiv, subscriber, additionalLayer);
        bindPaddings(target, newDiv, oldDiv, context.getExpressionResolver(), subscriber);
    }

    static /* synthetic */ void bindBackground$default(DivBaseBinder divBaseBinder, View view, BindingContext bindingContext, DivBase divBase, DivBase divBase2, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i, Object obj) {
        if ((i & 16) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground(view, bindingContext, divBase, divBase2, expressionSubscriber, drawable);
    }

    private final void bindBackground(View view, BindingContext bindingContext, DivBase divBase, DivBase divBase2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        DivFocus focus;
        DivBackgroundBinder divBackgroundBinder = this.divBackgroundBinder;
        List<? extends DivBackground> background = divBase.getBackground();
        List<? extends DivBackground> background2 = divBase2 != null ? divBase2.getBackground() : null;
        DivFocus focus2 = divBase.getFocus();
        divBackgroundBinder.bindBackground(bindingContext, view, background, background2, focus2 != null ? focus2.background : null, (divBase2 == null || (focus = divBase2.getFocus()) == null) ? null : focus.background, expressionSubscriber, drawable);
    }

    private final void bindNextFocus(final View view, Div2View div2View, DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivFocus focus;
        DivFocus.NextFocusIds nextFocusIds;
        DivFocus.NextFocusIds nextFocusIds2;
        DivFocus focus2;
        DivFocus.NextFocusIds nextFocusIds3;
        DivFocus.NextFocusIds nextFocusIds4;
        DivFocus focus3;
        DivFocus.NextFocusIds nextFocusIds5;
        DivFocus.NextFocusIds nextFocusIds6;
        DivFocus focus4;
        DivFocus.NextFocusIds nextFocusIds7;
        DivFocus.NextFocusIds nextFocusIds8;
        DivFocus focus5;
        DivFocus.NextFocusIds nextFocusIds9;
        DivFocus.NextFocusIds nextFocusIds10;
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent().getViewIdProvider();
        DivFocus focus6 = divBase.getFocus();
        Expression expression = (focus6 == null || (nextFocusIds10 = focus6.nextFocusIds) == null) ? null : nextFocusIds10.forward;
        if (!ExpressionsKt.equalsToConstant(expression, (divBase2 == null || (focus5 = divBase2.getFocus()) == null || (nextFocusIds9 = focus5.nextFocusIds) == null) ? null : nextFocusIds9.forward)) {
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            view.setNextFocusForwardId(viewIdProvider.getViewId(str));
            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str));
            if (!ExpressionsKt.isConstantOrNull(expression)) {
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull String str2) {
                        view.setNextFocusForwardId(viewIdProvider.getViewId(str2));
                        view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str2));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return Unit.INSTANCE;
                    }
                }) : null);
            }
        }
        DivFocus focus7 = divBase.getFocus();
        Expression expression2 = (focus7 == null || (nextFocusIds8 = focus7.nextFocusIds) == null) ? null : nextFocusIds8.left;
        if (!ExpressionsKt.equalsToConstant(expression2, (divBase2 == null || (focus4 = divBase2.getFocus()) == null || (nextFocusIds7 = focus4.nextFocusIds) == null) ? null : nextFocusIds7.left)) {
            view.setNextFocusLeftId(viewIdProvider.getViewId(expression2 != null ? (String) expression2.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression2)) {
                expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull String str2) {
                        view.setNextFocusLeftId(viewIdProvider.getViewId(str2));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return Unit.INSTANCE;
                    }
                }) : null);
            }
        }
        DivFocus focus8 = divBase.getFocus();
        Expression expression3 = (focus8 == null || (nextFocusIds6 = focus8.nextFocusIds) == null) ? null : nextFocusIds6.right;
        if (!ExpressionsKt.equalsToConstant(expression3, (divBase2 == null || (focus3 = divBase2.getFocus()) == null || (nextFocusIds5 = focus3.nextFocusIds) == null) ? null : nextFocusIds5.right)) {
            view.setNextFocusRightId(viewIdProvider.getViewId(expression3 != null ? (String) expression3.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression3)) {
                expressionSubscriber.addSubscription(expression3 != null ? expression3.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull String str2) {
                        view.setNextFocusRightId(viewIdProvider.getViewId(str2));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return Unit.INSTANCE;
                    }
                }) : null);
            }
        }
        DivFocus focus9 = divBase.getFocus();
        Expression expression4 = (focus9 == null || (nextFocusIds4 = focus9.nextFocusIds) == null) ? null : nextFocusIds4.up;
        if (!ExpressionsKt.equalsToConstant(expression4, (divBase2 == null || (focus2 = divBase2.getFocus()) == null || (nextFocusIds3 = focus2.nextFocusIds) == null) ? null : nextFocusIds3.up)) {
            view.setNextFocusUpId(viewIdProvider.getViewId(expression4 != null ? (String) expression4.evaluate(expressionResolver) : null));
            if (!ExpressionsKt.isConstantOrNull(expression4)) {
                expressionSubscriber.addSubscription(expression4 != null ? expression4.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull String str2) {
                        view.setNextFocusUpId(viewIdProvider.getViewId(str2));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return Unit.INSTANCE;
                    }
                }) : null);
            }
        }
        DivFocus focus10 = divBase.getFocus();
        Expression expression5 = (focus10 == null || (nextFocusIds2 = focus10.nextFocusIds) == null) ? null : nextFocusIds2.down;
        if (ExpressionsKt.equalsToConstant(expression5, (divBase2 == null || (focus = divBase2.getFocus()) == null || (nextFocusIds = focus.nextFocusIds) == null) ? null : nextFocusIds.down)) {
            return;
        }
        view.setNextFocusDownId(viewIdProvider.getViewId(expression5 != null ? (String) expression5.evaluate(expressionResolver) : null));
        if (ExpressionsKt.isConstantOrNull(expression5)) {
            return;
        }
        expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull String str2) {
                view.setNextFocusDownId(viewIdProvider.getViewId(str2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        }) : null);
    }

    private final void bindNextFocusId(Expression<String> newFocusId, Expression<String> oldFocusId, ExpressionResolver resolver, ExpressionSubscriber subscriber, final Function1 applyNextFocusId) {
        if (ExpressionsKt.equalsToConstant(newFocusId, oldFocusId)) {
            return;
        }
        applyNextFocusId.invoke(newFocusId != null ? newFocusId.evaluate(resolver) : null);
        if (ExpressionsKt.isConstantOrNull(newFocusId)) {
            return;
        }
        subscriber.addSubscription(newFocusId != null ? newFocusId.observe(resolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocusId$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                Function1.this.invoke(str);
            }
        }) : null);
    }

    private final void bindFocusActions(View view, BindingContext bindingContext, List<DivAction> list, List<DivAction> list2) {
        this.divFocusBinder.bindDivFocusActions(view, bindingContext, list, list2);
    }

    private final void bindVisibility(final View view, final Div2View div2View, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (ExpressionsKt.equalsToConstant(divBase.getVisibility(), divBase2 != null ? divBase2.getVisibility() : null)) {
            return;
        }
        applyVisibility(view, div2View, divBase, expressionResolver, divBase2 == null);
        if (ExpressionsKt.isConstant(divBase.getVisibility())) {
            return;
        }
        expressionSubscriber.addSubscription(divBase.getVisibility().observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivVisibility) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivVisibility divVisibility) {
                DivBaseBinder.this.applyVisibility(view, div2View, divBase, expressionResolver, false);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyVisibility(View view, Div2View div2View, DivBase divBase, ExpressionResolver expressionResolver, boolean z) {
        int i;
        DivTransitionHandler divTransitionHandler = div2View.getDivTransitionHandler();
        int i2 = WhenMappings.$EnumSwitchMapping$0[((DivVisibility) divBase.getVisibility().evaluate(expressionResolver)).ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 4;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        if (i != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List transitionTriggers = divBase.getTransitionTriggers();
        Transition transition = null;
        if (transitionTriggers == null || DivTransitionsKt.allowsTransitionsOnVisibilityChange(transitionTriggers)) {
            DivTransitionHandler.ChangeType.Visibility lastChange = divTransitionHandler.getLastChange(view);
            if (lastChange != null) {
                visibility = lastChange.getNew();
            }
            DivTransitionBuilder transitionBuilder = div2View.getViewComponent().getTransitionBuilder();
            if ((visibility == 4 || visibility == 8) && i == 0) {
                transition = transitionBuilder.createAndroidTransition(divBase.getTransitionIn(), 1, expressionResolver);
            } else if ((i == 4 || i == 8) && visibility == 0 && !z) {
                transition = transitionBuilder.createAndroidTransition(divBase.getTransitionOut(), 2, expressionResolver);
            } else if (lastChange != null) {
                TransitionManager.endTransitions(div2View);
            }
            if (transition != null) {
                transition.addTarget(view);
            }
        }
        if (transition != null) {
            divTransitionHandler.putTransition(transition, view, new DivTransitionHandler.ChangeType.Visibility(i));
        } else {
            view.setVisibility(i);
        }
        div2View.trackChildrenVisibility();
    }

    private final void bindTransform(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (DivDataExtensionsKt.equalsToConstant(divBase.getTransform(), divBase2 != null ? divBase2.getTransform() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyTransform(view, divBase, expressionResolver);
        if (DivDataExtensionsKt.isConstant(divBase.getTransform())) {
            return;
        }
        ExpressionSubscribersKt.observeTransform(expressionSubscriber, divBase.getTransform(), expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindTransform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7174invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7174invoke(@NotNull Object obj) {
                BaseDivViewExtensionsKt.applyTransform(view, divBase, expressionResolver);
            }
        });
    }

    private final void applyFocusableState(View view, DivBase divBase) {
        if ((divBase instanceof DivInput) || (divBase instanceof DivSwitch)) {
            return;
        }
        view.setFocusable(divBase.getFocus() != null);
    }
}
