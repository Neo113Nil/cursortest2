package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.util.Log;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.SearchRoute;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivDefaultIndicatorItemPlacement;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivIndicatorBinder.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00011B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J&\u0010\u0018\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0014J\n\u0010\u001b\u001a\u00020\u001c*\u00020\u001dJ%\u0010\u001e\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010$J0\u0010%\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0013\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0(H\u0002J4\u0010*\u001a\u00020\u001f*\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010.\u001a\b\u0012\u0004\u0012\u00020#0/2\b\b\u0002\u0010 \u001a\u00020!H\u0002J4\u0010*\u001a\u00020\u001f*\u0002002\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0/2\b\b\u0002\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u00062"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Indicator;", "Lcom/yandex/div2/DivIndicator;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "pagerIndicatorConnector", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;)V", "itemsPlacementCompat", "Lcom/yandex/div2/DivIndicatorItemPlacement;", "getItemsPlacementCompat", "(Lcom/yandex/div2/DivIndicator;)Lcom/yandex/div2/DivIndicatorItemPlacement;", "bindView", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "view", "div", "applyStyle", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "indicator", "bind", "bindingContext", "oldDiv", "convert", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "Lcom/yandex/div2/DivIndicator$Animation;", "multiply", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "multiplier", "", "color", "", "(Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;FLjava/lang/Integer;)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "observeWidthAndHeightSubscription", "Lcom/yandex/div2/DivBase;", "callback", "Lkotlin/Function1;", "", "toIndicatorParamsShape", "Lcom/yandex/div2/DivRoundedRectangleShape;", "metrics", "Landroid/util/DisplayMetrics;", "deprecatedColor", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivShape;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivIndicatorBinder extends DivViewBinder<Div.Indicator, DivIndicator, DivPagerIndicatorView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    public DivIndicatorBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        super(divBaseBinder);
        this.pagerIndicatorConnector = pagerIndicatorConnector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, com.yandex.div.core.util.SearchRoute] */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull BindingContext context, @NotNull DivPagerIndicatorView view, @NotNull Div.Indicator div) {
        DivBase divBase;
        Div rootDiv$div_release = context.getDivView().rootDiv$div_release();
        if (rootDiv$div_release != null) {
            ExpressionResolver expressionResolver = context.getExpressionResolver();
            DivBase value = div.value();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final ArrayList<SearchRoute> arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator withIndex = CollectionsKt.withIndex(DivTreeWalkKt.walk(rootDiv$div_release, expressionResolver).onEnter(new Function1() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Div div2) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onEnter();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onEnter();
                    }
                    return Boolean.TRUE;
                }
            }).onLeave(new Function1() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bindView$lambda$2$$inlined$findNearest$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Div) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(@NotNull Div div2) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((SearchRoute) it.next()).onLeave();
                    }
                    SearchRoute searchRoute = (SearchRoute) ref$ObjectRef.element;
                    if (searchRoute != null) {
                        searchRoute.onLeave();
                    }
                }
            }).iterator());
            while (true) {
                divBase = null;
                if (!withIndex.hasNext()) {
                    break;
                }
                DivBase value2 = ((DivItemBuilderResult) ((IndexedValue) withIndex.next()).getValue()).getDiv().value();
                if (value2 == value) {
                    for (SearchRoute searchRoute : arrayList) {
                        if (((DivBase) searchRoute.getItem()) != null) {
                            linkedHashMap.put(searchRoute.getItem(), Integer.valueOf(searchRoute.getMovedDistance()));
                        }
                    }
                    arrayList.clear();
                    ref$ObjectRef.element = new SearchRoute(null);
                }
                if (value2 instanceof DivPager) {
                    DivPager divPager = (DivPager) value2;
                    if (div.getValue().pagerId == null || Intrinsics.areEqual(divPager.getId(), div.getValue().pagerId)) {
                        T t = ref$ObjectRef.element;
                        if (t != 0) {
                            linkedHashMap.put(value2, Integer.valueOf(((SearchRoute) t).getMovedDistance()));
                        } else {
                            arrayList.add(new SearchRoute(value2));
                        }
                    }
                }
            }
            Integer num = (Integer) CollectionsKt.minOrNull((Iterable) linkedHashMap.values());
            if (num != null) {
                int intValue = num.intValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() == intValue) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap2.keySet();
                if (!keySet.isEmpty()) {
                    if (keySet.size() > 1) {
                        Log.w("SearchUtil", "Distance clash when searching for the nearest " + Reflection.getOrCreateKotlinClass(DivPager.class).getSimpleName() + ". First found is taken");
                    }
                    divBase = (DivBase) CollectionsKt.first(keySet);
                }
            }
            DivPager divPager2 = (DivPager) divBase;
            if (divPager2 != null) {
                this.pagerIndicatorConnector.submitIndicator$div_release(view, divPager2);
            }
        }
        super.bindView(context, (BindingContext) view, (DivPagerIndicatorView) div);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivPagerIndicatorView divPagerIndicatorView, @NotNull BindingContext bindingContext, @NotNull final DivIndicator divIndicator, @Nullable DivIndicator divIndicator2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$bind$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7199invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7199invoke(@NotNull Object obj) {
                DivIndicatorBinder.this.applyStyle(divPagerIndicatorView, expressionResolver, divIndicator);
            }
        };
        divPagerIndicatorView.addSubscription(divIndicator.animation.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(divIndicator.activeItemColor.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(divIndicator.activeItemSize.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(divIndicator.inactiveItemColor.observe(expressionResolver, function1));
        divPagerIndicatorView.addSubscription(divIndicator.minimumItemSize.observe(expressionResolver, function1));
        ExpressionSubscribersKt.observeShape(divPagerIndicatorView, divIndicator.shape, expressionResolver, function1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.activeShape, expressionResolver, function1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.inactiveShape, expressionResolver, function1);
        ExpressionSubscribersKt.observeRoundedRectangleShape(divPagerIndicatorView, divIndicator.inactiveMinimumShape, expressionResolver, function1);
        DivIndicatorItemPlacement itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.Default) {
            DivIndicatorItemPlacement.Default r0 = (DivIndicatorItemPlacement.Default) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(r0.getValue().spaceBetweenCenters.value.observe(expressionResolver, function1));
            divPagerIndicatorView.addSubscription(r0.getValue().spaceBetweenCenters.unit.observe(expressionResolver, function1));
        } else if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.Stretch) {
            DivIndicatorItemPlacement.Stretch stretch = (DivIndicatorItemPlacement.Stretch) itemsPlacementCompat;
            divPagerIndicatorView.addSubscription(stretch.getValue().itemSpacing.value.observe(expressionResolver, function1));
            divPagerIndicatorView.addSubscription(stretch.getValue().itemSpacing.unit.observe(expressionResolver, function1));
            divPagerIndicatorView.addSubscription(stretch.getValue().maxVisibleItems.observe(expressionResolver, function1));
        }
        observeWidthAndHeightSubscription(divPagerIndicatorView, divIndicator, expressionResolver, function1);
    }

    private final void observeWidthAndHeightSubscription(DivPagerIndicatorView divPagerIndicatorView, DivBase divBase, ExpressionResolver expressionResolver, Function1 function1) {
        Object value = divBase.getWidth().value();
        if (value instanceof DivFixedSize) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (DivFixedSize) value, expressionResolver, function1);
        }
        Object value2 = divBase.getHeight().value();
        if (value2 instanceof DivFixedSize) {
            ExpressionSubscribersKt.observeFixedSize(divPagerIndicatorView, (DivFixedSize) value2, expressionResolver, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0092, code lost:
    
        if (r0 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyStyle(DivPagerIndicatorView divPagerIndicatorView, ExpressionResolver expressionResolver, DivIndicator divIndicator) {
        IndicatorParams.Shape indicatorParamsShape;
        IndicatorParams.Shape shape;
        IndicatorParams.Shape multiply;
        IndicatorParams.Shape multiply$default;
        IndicatorParams.ItemPlacement stretch;
        int i;
        DisplayMetrics displayMetrics = divPagerIndicatorView.getResources().getDisplayMetrics();
        DivRoundedRectangleShape divRoundedRectangleShape = divIndicator.activeShape;
        DivRoundedRectangleShape divRoundedRectangleShape2 = divIndicator.inactiveShape;
        DivRoundedRectangleShape divRoundedRectangleShape3 = divIndicator.inactiveMinimumShape;
        float doubleValue = (float) ((Number) divIndicator.activeItemSize.evaluate(expressionResolver)).doubleValue();
        float doubleValue2 = (float) ((Number) divIndicator.minimumItemSize.evaluate(expressionResolver)).doubleValue();
        if (divRoundedRectangleShape2 == null || (indicatorParamsShape = toIndicatorParamsShape$default(this, divRoundedRectangleShape2, displayMetrics, expressionResolver, divIndicator.inactiveItemColor, 0.0f, 8, (Object) null)) == null) {
            if (divRoundedRectangleShape != null) {
                indicatorParamsShape = toIndicatorParamsShape(divRoundedRectangleShape, displayMetrics, expressionResolver, divIndicator.inactiveItemColor, 1 / doubleValue);
            } else {
                indicatorParamsShape = divRoundedRectangleShape3 != null ? toIndicatorParamsShape(divRoundedRectangleShape3, displayMetrics, expressionResolver, divIndicator.inactiveItemColor, doubleValue2) : null;
                if (indicatorParamsShape == null) {
                    indicatorParamsShape = toIndicatorParamsShape$default(this, divIndicator.shape, displayMetrics, expressionResolver, divIndicator.inactiveItemColor, 0.0f, 8, (Object) null);
                }
            }
        }
        IndicatorParams.Shape shape2 = indicatorParamsShape;
        if (divRoundedRectangleShape != null) {
            shape = shape2;
            multiply = toIndicatorParamsShape$default(this, divRoundedRectangleShape, displayMetrics, expressionResolver, divIndicator.activeItemColor, 0.0f, 8, (Object) null);
        } else {
            shape = shape2;
        }
        multiply = multiply(shape, doubleValue, (Integer) divIndicator.activeItemColor.evaluate(expressionResolver));
        IndicatorParams.Shape shape3 = multiply;
        if (divRoundedRectangleShape3 == null || (multiply$default = toIndicatorParamsShape$default(this, divRoundedRectangleShape3, displayMetrics, expressionResolver, divIndicator.inactiveItemColor, 0.0f, 8, (Object) null)) == null) {
            multiply$default = multiply$default(this, shape, doubleValue2, null, 2, null);
        }
        IndicatorParams.Shape shape4 = multiply$default;
        IndicatorParams.Animation convert = convert((DivIndicator.Animation) divIndicator.animation.evaluate(expressionResolver));
        DivIndicatorItemPlacement itemsPlacementCompat = getItemsPlacementCompat(divIndicator);
        if (itemsPlacementCompat instanceof DivIndicatorItemPlacement.Default) {
            stretch = new IndicatorParams.ItemPlacement.Default(BaseDivViewExtensionsKt.toPx(((DivIndicatorItemPlacement.Default) itemsPlacementCompat).getValue().spaceBetweenCenters, displayMetrics, expressionResolver));
        } else {
            if (!(itemsPlacementCompat instanceof DivIndicatorItemPlacement.Stretch)) {
                throw new NoWhenBranchMatchedException();
            }
            DivIndicatorItemPlacement.Stretch stretch2 = (DivIndicatorItemPlacement.Stretch) itemsPlacementCompat;
            float px = BaseDivViewExtensionsKt.toPx(stretch2.getValue().itemSpacing, displayMetrics, expressionResolver);
            long longValue = ((Number) stretch2.getValue().maxVisibleItems.evaluate(expressionResolver)).longValue();
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
            stretch = new IndicatorParams.ItemPlacement.Stretch(px, i);
        }
        divPagerIndicatorView.setStyle(new IndicatorParams.Style(convert, shape3, shape, shape4, stretch));
    }

    private final DivIndicatorItemPlacement getItemsPlacementCompat(DivIndicator divIndicator) {
        DivIndicatorItemPlacement divIndicatorItemPlacement = divIndicator.itemsPlacement;
        return divIndicatorItemPlacement == null ? new DivIndicatorItemPlacement.Default(new DivDefaultIndicatorItemPlacement(divIndicator.spaceBetweenCenters)) : divIndicatorItemPlacement;
    }

    @NotNull
    public final IndicatorParams.Animation convert(@NotNull DivIndicator.Animation animation) {
        return animation == DivIndicator.Animation.WORM ? IndicatorParams.Animation.WORM : animation == DivIndicator.Animation.SLIDER ? IndicatorParams.Animation.SLIDER : IndicatorParams.Animation.SCALE;
    }

    static /* synthetic */ IndicatorParams.Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(divRoundedRectangleShape, displayMetrics, expressionResolver, (Expression<Integer>) expression, f);
    }

    private final IndicatorParams.Shape toIndicatorParamsShape(DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f) {
        DivSizeUnit divSizeUnit;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        DivStroke divStroke = divRoundedRectangleShape.stroke;
        if (divStroke == null || (expression4 = divStroke.unit) == null || (divSizeUnit = (DivSizeUnit) expression4.evaluate(expressionResolver)) == null) {
            divSizeUnit = DivSizeUnit.DP;
        }
        DivStroke divStroke2 = divRoundedRectangleShape.stroke;
        Integer num = null;
        Integer valueOf = (divStroke2 == null || (expression3 = divStroke2.width) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Double.valueOf(((Number) expression3.evaluate(expressionResolver)).doubleValue()), displayMetrics, divSizeUnit));
        Companion companion = INSTANCE;
        Expression<Integer> expression5 = divRoundedRectangleShape.backgroundColor;
        if (expression5 == null) {
            expression5 = expression;
        }
        int intValue = expression5.evaluate(expressionResolver).intValue();
        float pxF = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.itemWidth, displayMetrics, expressionResolver);
        float pxF2 = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.itemHeight, displayMetrics, expressionResolver);
        float pxF3 = BaseDivViewExtensionsKt.toPxF(divRoundedRectangleShape.cornerRadius, displayMetrics, expressionResolver);
        Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
        DivStroke divStroke3 = divRoundedRectangleShape.stroke;
        if (divStroke3 != null && (expression2 = divStroke3.color) != null) {
            num = (Integer) expression2.evaluate(expressionResolver);
        }
        return companion.createRoundedRectangle$div_release(intValue, pxF, pxF2, pxF3, f, valueOf2, num);
    }

    static /* synthetic */ IndicatorParams.Shape toIndicatorParamsShape$default(DivIndicatorBinder divIndicatorBinder, DivShape divShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        return divIndicatorBinder.toIndicatorParamsShape(divShape, displayMetrics, expressionResolver, (Expression<Integer>) expression, f);
    }

    private final IndicatorParams.Shape toIndicatorParamsShape(DivShape divShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f) {
        if (divShape instanceof DivShape.RoundedRectangle) {
            return toIndicatorParamsShape(((DivShape.RoundedRectangle) divShape).getValue(), displayMetrics, expressionResolver, expression, f);
        }
        if (!(divShape instanceof DivShape.Circle)) {
            throw new NoWhenBranchMatchedException();
        }
        return INSTANCE.createCircle$div_release(expression.evaluate(expressionResolver).intValue(), BaseDivViewExtensionsKt.toPxF(((DivShape.Circle) divShape).getValue().radius, displayMetrics, expressionResolver), f);
    }

    static /* synthetic */ IndicatorParams.Shape multiply$default(DivIndicatorBinder divIndicatorBinder, IndicatorParams.Shape shape, float f, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return divIndicatorBinder.multiply(shape, f, num);
    }

    private final IndicatorParams.Shape multiply(IndicatorParams.Shape shape, float f, Integer num) {
        if (shape instanceof IndicatorParams.Shape.RoundedRect) {
            Companion companion = INSTANCE;
            int intValue = num != null ? num.intValue() : shape.getColor();
            IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) shape;
            return companion.createRoundedRectangle$div_release(intValue, roundedRect.getItemSize().getItemWidth(), roundedRect.getItemSize().getItemHeight(), roundedRect.getItemSize().getCornerRadius(), f, Float.valueOf(roundedRect.getStrokeWidth()), Integer.valueOf(roundedRect.getStrokeColor()));
        }
        if (shape instanceof IndicatorParams.Shape.Circle) {
            return INSTANCE.createCircle$div_release(num != null ? num.intValue() : shape.getColor(), ((IndicatorParams.Shape.Circle) shape).getItemSize().getRadius(), f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivIndicatorBinder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0002\b\nJQ\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivIndicatorBinder$Companion;", "", "()V", "createCircle", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "color", "", "radius", "", "multiplier", "createCircle$div_release", "createRoundedRectangle", "width", "height", "cornerRadius", "strokeWidth", "strokeColor", "createRoundedRectangle$div_release", "(IFFFFLjava/lang/Float;Ljava/lang/Integer;)Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final IndicatorParams.Shape createRoundedRectangle$div_release(int color, float width, float height, float cornerRadius, float multiplier, @Nullable Float strokeWidth, @Nullable Integer strokeColor) {
            return new IndicatorParams.Shape.RoundedRect(color, new IndicatorParams.ItemSize.RoundedRect(width * multiplier, height * multiplier, cornerRadius * multiplier), strokeWidth != null ? strokeWidth.floatValue() : 0.0f, strokeColor != null ? strokeColor.intValue() : 0);
        }

        public static /* synthetic */ IndicatorParams.Shape createCircle$div_release$default(Companion companion, int i, float f, float f2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            }
            return companion.createCircle$div_release(i, f, f2);
        }

        @NotNull
        public final IndicatorParams.Shape createCircle$div_release(int color, float radius, float multiplier) {
            return new IndicatorParams.Shape.Circle(color, new IndicatorParams.ItemSize.Circle(radius * multiplier));
        }
    }
}
