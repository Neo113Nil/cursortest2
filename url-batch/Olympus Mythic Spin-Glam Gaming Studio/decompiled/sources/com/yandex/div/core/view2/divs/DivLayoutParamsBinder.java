package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivLayoutParamsBinder.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001d\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010!\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\"\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010#\u001a\u00020\u0018*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010$\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J6\u0010%\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J6\u0010\f\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J6\u0010&\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J6\u0010'\u001a\u00020\r*\u00020\u00072\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0014\u0010-\u001a\u00020.*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010/\u001a\u00020)*\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u00060"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivLayoutParamsBinder;", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "Lcom/yandex/div2/DivSizeUnitValue;", "Lcom/yandex/div2/DivSize;", "getMaxSize", "(Lcom/yandex/div2/DivSize;)Lcom/yandex/div2/DivSizeUnitValue;", SDKConstants.PARAM_CONTEXT_MIN_SIZE, "getMinSize", "bindLayoutParams", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "target", "Landroid/view/View;", "newDiv", "Lcom/yandex/div2/DivBase;", "oldDiv", "subscriber", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "applyHeight", "", "div", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "applyHeightConstraints", "applyHeightProperties", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "applyHorizontalWeightValue", "applyVerticalWeightValue", "applyWidth", "applyWidthConstraints", "applyWidthProperties", "bindHeight", "bindWidth", "checkConstraints", "type", "", "id", "metrics", "Landroid/util/DisplayMetrics;", "getWeight", "", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes12.dex */
public final class DivLayoutParamsBinder {

    @NotNull
    private final ErrorCollectors errorCollectors;

    public DivLayoutParamsBinder(@NotNull ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    public final void bindLayoutParams(@NotNull BindingContext context, @NotNull View target, @NotNull DivBase newDiv, @Nullable DivBase oldDiv, @NotNull ExpressionSubscriber subscriber) {
        bindLayoutParams(target, newDiv, oldDiv, context.getExpressionResolver(), subscriber, this.errorCollectors.getOrCreate(context.getDivView().getDataTag(), context.getDivView().getDivData()));
    }

    private final void bindLayoutParams(View view, DivBase divBase, DivBase divBase2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, ErrorCollector errorCollector) {
        if (view.getLayoutParams() == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("LayoutParams should be initialized before view binding");
            }
            view.setLayoutParams(new DivLayoutParams(-1, -2));
        }
        bindWidth(view, divBase, divBase2, expressionResolver, expressionSubscriber, errorCollector);
        bindHeight(view, divBase, divBase2, expressionResolver, expressionSubscriber, errorCollector);
    }

    private final void bindWidth(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(divBase.getWidth(), divBase2 != null ? divBase2.getWidth() : null)) {
            checkConstraints(divBase.getWidth(), "width", divBase.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyWidthProperties(view, divBase, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(divBase.getWidth())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, divBase.getWidth(), expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder$bindWidth$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7213invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7213invoke(@NotNull Object obj) {
                DivLayoutParamsBinder.this.applyWidthProperties(view, divBase, expressionResolver, errorCollector);
            }
        });
    }

    private final void checkConstraints(DivSize divSize, String str, String str2, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        DivSizeUnitValue maxSize;
        String str3;
        DivSizeUnitValue minSize = getMinSize(divSize);
        if (minSize == null || (maxSize = getMaxSize(divSize)) == null || BaseDivViewExtensionsKt.toPx(minSize, displayMetrics, expressionResolver) <= BaseDivViewExtensionsKt.toPx(maxSize, displayMetrics, expressionResolver)) {
            return;
        }
        if (str2 != null) {
            str3 = String.format("Id: '%s', ", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        } else {
            str3 = "";
        }
        String format = String.format("Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s.", Arrays.copyOf(new Object[]{str, str3, toString(minSize, expressionResolver), toString(maxSize, expressionResolver)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        errorCollector.logError(new Throwable(format));
    }

    private final String toString(DivSizeUnitValue divSizeUnitValue, ExpressionResolver expressionResolver) {
        return ((Number) divSizeUnitValue.value.evaluate(expressionResolver)).longValue() + DivSizeUnit.INSTANCE.toString((DivSizeUnit) divSizeUnitValue.unit.evaluate(expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyWidthProperties(View view, DivBase divBase, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(divBase.getWidth(), "width", divBase.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean z = applyHorizontalWeightValue(view, divBase, expressionResolver) || applyWidth(view, divBase, expressionResolver);
        if (applyWidthConstraints(view, divBase, expressionResolver) || z) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, divBase, expressionResolver);
        }
    }

    private final boolean applyWidth(View view, DivBase divBase, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(divBase.getWidth(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().width == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().width = layoutParamsSize;
        return true;
    }

    private final boolean applyHorizontalWeightValue(View view, DivBase divBase, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(divBase.getWidth(), expressionResolver);
        if (divLayoutParams.getHorizontalWeight() == weight) {
            return false;
        }
        divLayoutParams.setHorizontalWeight(weight);
        return true;
    }

    private final boolean applyWidthConstraints(View view, DivBase divBase, ExpressionResolver expressionResolver) {
        DivSizeUnitValue minSize = getMinSize(divBase.getWidth());
        boolean z = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        DivSizeUnitValue maxSize = getMaxSize(divBase.getWidth());
        int i = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i = px2;
        }
        if (view.getMinimumWidth() != px) {
            view.setMinimumWidth(px);
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && divLayoutParams.getMaxWidth() != i) {
            divLayoutParams.setMaxWidth(i);
            return true;
        }
        return z;
    }

    private final float getWeight(DivSize divSize, ExpressionResolver expressionResolver) {
        DivMatchParentSize value;
        Expression expression;
        DivSize.MatchParent matchParent = divSize instanceof DivSize.MatchParent ? (DivSize.MatchParent) divSize : null;
        if (matchParent == null || (value = matchParent.getValue()) == null || (expression = value.weight) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.evaluate(expressionResolver)).doubleValue();
    }

    private final void bindHeight(final View view, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, final ErrorCollector errorCollector) {
        if (DivDataExtensionsKt.equalsToConstant(divBase.getHeight(), divBase2 != null ? divBase2.getHeight() : null)) {
            checkConstraints(divBase.getHeight(), "height", divBase.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
            return;
        }
        applyHeightProperties(view, divBase, expressionResolver, errorCollector);
        if (DivDataExtensionsKt.isConstant(divBase.getHeight())) {
            return;
        }
        ExpressionSubscribersKt.observeSize(expressionSubscriber, divBase.getHeight(), expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivLayoutParamsBinder$bindHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7212invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7212invoke(@NotNull Object obj) {
                DivLayoutParamsBinder.this.applyHeightProperties(view, divBase, expressionResolver, errorCollector);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHeightProperties(View view, DivBase divBase, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        checkConstraints(divBase.getHeight(), "height", divBase.getId(), view.getResources().getDisplayMetrics(), expressionResolver, errorCollector);
        boolean z = applyVerticalWeightValue(view, divBase, expressionResolver) || applyHeight(view, divBase, expressionResolver);
        if (applyHeightConstraints(view, divBase, expressionResolver) || z) {
            view.requestLayout();
            BaseDivViewExtensionsKt.applyTransform(view, divBase, expressionResolver);
        }
    }

    private final boolean applyHeight(View view, DivBase divBase, ExpressionResolver expressionResolver) {
        int layoutParamsSize = DivUtilKt.toLayoutParamsSize(divBase.getHeight(), view.getResources().getDisplayMetrics(), expressionResolver, view.getLayoutParams());
        if (view.getLayoutParams().height == layoutParamsSize) {
            return false;
        }
        view.getLayoutParams().height = layoutParamsSize;
        return true;
    }

    private final boolean applyVerticalWeightValue(View view, DivBase divBase, ExpressionResolver expressionResolver) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null) {
            return false;
        }
        float weight = getWeight(divBase.getHeight(), expressionResolver);
        if (divLayoutParams.getVerticalWeight() == weight) {
            return false;
        }
        divLayoutParams.setVerticalWeight(weight);
        return true;
    }

    private final boolean applyHeightConstraints(View view, DivBase divBase, ExpressionResolver expressionResolver) {
        DivSizeUnitValue minSize = getMinSize(divBase.getHeight());
        boolean z = false;
        int px = minSize != null ? BaseDivViewExtensionsKt.toPx(minSize, view.getResources().getDisplayMetrics(), expressionResolver) : 0;
        DivSizeUnitValue maxSize = getMaxSize(divBase.getHeight());
        int i = Integer.MAX_VALUE;
        int px2 = maxSize != null ? BaseDivViewExtensionsKt.toPx(maxSize, view.getResources().getDisplayMetrics(), expressionResolver) : Integer.MAX_VALUE;
        if (px > px2) {
            px = 0;
        } else {
            i = px2;
        }
        if (view.getMinimumHeight() != px) {
            view.setMinimumHeight(px);
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && divLayoutParams.getMaxHeight() != i) {
            divLayoutParams.setMaxHeight(i);
            return true;
        }
        return z;
    }

    private final DivSizeUnitValue getMinSize(DivSize divSize) {
        if (divSize instanceof DivSize.WrapContent) {
            return ((DivSize.WrapContent) divSize).getValue().minSize;
        }
        if (divSize instanceof DivSize.MatchParent) {
            return ((DivSize.MatchParent) divSize).getValue().minSize;
        }
        return null;
    }

    private final DivSizeUnitValue getMaxSize(DivSize divSize) {
        if (divSize instanceof DivSize.WrapContent) {
            return ((DivSize.WrapContent) divSize).getValue().maxSize;
        }
        if (divSize instanceof DivSize.MatchParent) {
            return ((DivSize.MatchParent) divSize).getValue().maxSize;
        }
        return null;
    }
}
