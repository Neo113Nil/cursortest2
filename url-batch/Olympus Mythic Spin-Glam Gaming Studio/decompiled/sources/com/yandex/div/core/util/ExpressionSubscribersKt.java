package com.yandex.div.core.util;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivCircleShape;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivNinePatchBackground;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivWrapContentSize;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExpressionSubscribers.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010\u001e\u001a\u00020\u0001*\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010!\u001a\u00020\u0001*\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010$\u001a\u00020\u0001*\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010'\u001a\u00020\u0001*\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010*\u001a\u00020\u0001*\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u0010-\u001a\u00020\u0001*\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u00100\u001a\u00020\u0001*\u00020\u00022\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a2\u00103\u001a\u00020\u0001*\u00020\u00022\b\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000¨\u00066"}, d2 = {"observeAbsoluteEdgeInsets", "", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "insets", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "callback", "Lkotlin/Function1;", "", "observeBackground", M2.g, "Lcom/yandex/div2/DivBackground;", "observeCircleShape", "circle", "Lcom/yandex/div2/DivCircleShape;", "observeColorPoint", "colorPoint", "Lcom/yandex/div2/DivLinearGradient$ColorPoint;", "observeDrawable", "drawable", "Lcom/yandex/div2/DivDrawable;", "observeEdgeInsets", "Lcom/yandex/div2/DivEdgeInsets;", "observeFilter", "filter", "Lcom/yandex/div2/DivFilter;", "observeFixedSize", "fixedSize", "Lcom/yandex/div2/DivFixedSize;", "observePivot", "pivot", "Lcom/yandex/div2/DivPivot;", "observeRadialGradientCenter", "center", "Lcom/yandex/div2/DivRadialGradientCenter;", "observeRadialGradientRadius", "radius", "Lcom/yandex/div2/DivRadialGradientRadius;", "observeRoundedRectangleShape", "roundedRectangle", "Lcom/yandex/div2/DivRoundedRectangleShape;", "observeShape", "shape", "Lcom/yandex/div2/DivShape;", "observeSize", "size", "Lcom/yandex/div2/DivSize;", "observeStroke", VastAttributes.STROKE_COLOR, "Lcom/yandex/div2/DivStroke;", "observeTransform", "transform", "Lcom/yandex/div2/DivTransform;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExpressionSubscribersKt {
    public static final void observeSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivSize divSize, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        if (divSize != null) {
            if (divSize instanceof DivSize.Fixed) {
                DivFixedSize value = ((DivSize.Fixed) divSize).getValue();
                expressionSubscriber.addSubscription(value.value.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(value.unit.observe(expressionResolver, function1));
                return;
            }
            Disposable disposable = null;
            if (divSize instanceof DivSize.MatchParent) {
                DivMatchParentSize value2 = ((DivSize.MatchParent) divSize).getValue();
                Expression expression9 = value2.weight;
                expressionSubscriber.addSubscription(expression9 != null ? expression9.observe(expressionResolver, function1) : null);
                DivSizeUnitValue divSizeUnitValue = value2.minSize;
                expressionSubscriber.addSubscription((divSizeUnitValue == null || (expression8 = divSizeUnitValue.value) == null) ? null : expression8.observe(expressionResolver, function1));
                DivSizeUnitValue divSizeUnitValue2 = value2.minSize;
                expressionSubscriber.addSubscription((divSizeUnitValue2 == null || (expression7 = divSizeUnitValue2.unit) == null) ? null : expression7.observe(expressionResolver, function1));
                DivSizeUnitValue divSizeUnitValue3 = value2.maxSize;
                expressionSubscriber.addSubscription((divSizeUnitValue3 == null || (expression6 = divSizeUnitValue3.value) == null) ? null : expression6.observe(expressionResolver, function1));
                DivSizeUnitValue divSizeUnitValue4 = value2.maxSize;
                if (divSizeUnitValue4 != null && (expression5 = divSizeUnitValue4.unit) != null) {
                    disposable = expression5.observe(expressionResolver, function1);
                }
                expressionSubscriber.addSubscription(disposable);
                return;
            }
            if (divSize instanceof DivSize.WrapContent) {
                DivWrapContentSize value3 = ((DivSize.WrapContent) divSize).getValue();
                Expression expression10 = value3.constrained;
                expressionSubscriber.addSubscription(expression10 != null ? expression10.observe(expressionResolver, function1) : null);
                DivSizeUnitValue divSizeUnitValue5 = value3.minSize;
                expressionSubscriber.addSubscription((divSizeUnitValue5 == null || (expression4 = divSizeUnitValue5.value) == null) ? null : expression4.observe(expressionResolver, function1));
                DivSizeUnitValue divSizeUnitValue6 = value3.minSize;
                expressionSubscriber.addSubscription((divSizeUnitValue6 == null || (expression3 = divSizeUnitValue6.unit) == null) ? null : expression3.observe(expressionResolver, function1));
                DivSizeUnitValue divSizeUnitValue7 = value3.maxSize;
                expressionSubscriber.addSubscription((divSizeUnitValue7 == null || (expression2 = divSizeUnitValue7.value) == null) ? null : expression2.observe(expressionResolver, function1));
                DivSizeUnitValue divSizeUnitValue8 = value3.maxSize;
                if (divSizeUnitValue8 != null && (expression = divSizeUnitValue8.unit) != null) {
                    disposable = expression.observe(expressionResolver, function1);
                }
                expressionSubscriber.addSubscription(disposable);
            }
        }
    }

    public static final void observeFixedSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivFixedSize divFixedSize, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divFixedSize == null) {
            return;
        }
        expressionSubscriber.addSubscription(divFixedSize.value.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divFixedSize.unit.observe(expressionResolver, function1));
    }

    public static final void observeEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divEdgeInsets == null) {
            return;
        }
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
    }

    public static final void observeAbsoluteEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divAbsoluteEdgeInsets == null) {
            return;
        }
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.left.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.top.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.right.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divAbsoluteEdgeInsets.bottom.observe(expressionResolver, function1));
    }

    public static final void observeTransform(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivTransform divTransform, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divTransform == null) {
            return;
        }
        Expression expression = divTransform.rotation;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        observePivot(expressionSubscriber, divTransform.pivotX, expressionResolver, function1);
        observePivot(expressionSubscriber, divTransform.pivotY, expressionResolver, function1);
    }

    public static final void observePivot(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivPivot divPivot, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divPivot != null) {
            if (divPivot instanceof DivPivot.Fixed) {
                DivPivotFixed value = ((DivPivot.Fixed) divPivot).getValue();
                Expression expression = value.value;
                expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
                expressionSubscriber.addSubscription(value.unit.observe(expressionResolver, function1));
                return;
            }
            if (divPivot instanceof DivPivot.Percentage) {
                expressionSubscriber.addSubscription(((DivPivot.Percentage) divPivot).getValue().value.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeFilter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivFilter divFilter, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divFilter == null || (divFilter instanceof DivFilter.RtlMirror) || !(divFilter instanceof DivFilter.Blur)) {
            return;
        }
        expressionSubscriber.addSubscription(((DivFilter.Blur) divFilter).getValue().radius.observe(expressionResolver, function1));
    }

    public static final void observeDrawable(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivDrawable divDrawable, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divDrawable == null || !(divDrawable instanceof DivDrawable.Shape)) {
            return;
        }
        DivShapeDrawable value = ((DivDrawable.Shape) divDrawable).getValue();
        expressionSubscriber.addSubscription(value.color.observe(expressionResolver, function1));
        observeShape(expressionSubscriber, value.shape, expressionResolver, function1);
        observeStroke(expressionSubscriber, value.stroke, expressionResolver, function1);
    }

    public static final void observeShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivShape divShape, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divShape != null) {
            if (divShape instanceof DivShape.RoundedRectangle) {
                observeRoundedRectangleShape(expressionSubscriber, ((DivShape.RoundedRectangle) divShape).getValue(), expressionResolver, function1);
            } else if (divShape instanceof DivShape.Circle) {
                observeCircleShape(expressionSubscriber, ((DivShape.Circle) divShape).getValue(), expressionResolver, function1);
            }
        }
    }

    public static final void observeRoundedRectangleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivRoundedRectangleShape divRoundedRectangleShape, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divRoundedRectangleShape == null) {
            return;
        }
        Expression expression = divRoundedRectangleShape.backgroundColor;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.cornerRadius, expressionResolver, function1);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.itemWidth, expressionResolver, function1);
        observeFixedSize(expressionSubscriber, divRoundedRectangleShape.itemHeight, expressionResolver, function1);
        observeStroke(expressionSubscriber, divRoundedRectangleShape.stroke, expressionResolver, function1);
    }

    public static final void observeCircleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivCircleShape divCircleShape, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divCircleShape == null) {
            return;
        }
        Expression expression = divCircleShape.backgroundColor;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        observeFixedSize(expressionSubscriber, divCircleShape.radius, expressionResolver, function1);
        observeStroke(expressionSubscriber, divCircleShape.stroke, expressionResolver, function1);
    }

    public static final void observeStroke(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivStroke divStroke, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divStroke == null) {
            return;
        }
        expressionSubscriber.addSubscription(divStroke.color.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divStroke.width.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divStroke.unit.observe(expressionResolver, function1));
    }

    public static final void observeBackground(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivBackground divBackground, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divBackground != null) {
            if (divBackground instanceof DivBackground.Solid) {
                expressionSubscriber.addSubscription(((DivBackground.Solid) divBackground).getValue().color.observe(expressionResolver, function1));
                return;
            }
            if (divBackground instanceof DivBackground.Image) {
                DivImageBackground value = ((DivBackground.Image) divBackground).getValue();
                expressionSubscriber.addSubscription(value.alpha.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(value.imageUrl.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(value.contentAlignmentHorizontal.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(value.contentAlignmentVertical.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(value.preloadRequired.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(value.scale.observe(expressionResolver, function1));
                List list = value.filters;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        observeFilter(expressionSubscriber, (DivFilter) it.next(), expressionResolver, function1);
                    }
                    return;
                }
                return;
            }
            if (divBackground instanceof DivBackground.LinearGradient) {
                DivLinearGradient value2 = ((DivBackground.LinearGradient) divBackground).getValue();
                expressionSubscriber.addSubscription(value2.angle.observe(expressionResolver, function1));
                ExpressionList expressionList = value2.colors;
                expressionSubscriber.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, function1) : null);
                List list2 = value2.colorMap;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        observeColorPoint(expressionSubscriber, (DivLinearGradient.ColorPoint) it2.next(), expressionResolver, function1);
                    }
                    return;
                }
                return;
            }
            if (divBackground instanceof DivBackground.RadialGradient) {
                DivRadialGradient value3 = ((DivBackground.RadialGradient) divBackground).getValue();
                ExpressionList expressionList2 = value3.colors;
                expressionSubscriber.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, function1) : null);
                observeRadialGradientCenter(expressionSubscriber, value3.centerX, expressionResolver, function1);
                observeRadialGradientCenter(expressionSubscriber, value3.centerY, expressionResolver, function1);
                observeRadialGradientRadius(expressionSubscriber, value3.radius, expressionResolver, function1);
                return;
            }
            if (divBackground instanceof DivBackground.NinePatch) {
                DivNinePatchBackground value4 = ((DivBackground.NinePatch) divBackground).getValue();
                expressionSubscriber.addSubscription(value4.imageUrl.observe(expressionResolver, function1));
                observeAbsoluteEdgeInsets(expressionSubscriber, value4.insets, expressionResolver, function1);
            }
        }
    }

    public static final void observeColorPoint(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivLinearGradient.ColorPoint colorPoint, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (colorPoint == null) {
            return;
        }
        expressionSubscriber.addSubscription(colorPoint.color.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(colorPoint.position.observe(expressionResolver, function1));
    }

    public static final void observeRadialGradientCenter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivRadialGradientCenter divRadialGradientCenter, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divRadialGradientCenter != null) {
            if (divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed) {
                DivRadialGradientCenter.Fixed fixed = (DivRadialGradientCenter.Fixed) divRadialGradientCenter;
                expressionSubscriber.addSubscription(fixed.getValue().unit.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(fixed.getValue().value.observe(expressionResolver, function1));
            } else if (divRadialGradientCenter instanceof DivRadialGradientCenter.Relative) {
                expressionSubscriber.addSubscription(((DivRadialGradientCenter.Relative) divRadialGradientCenter).getValue().value.observe(expressionResolver, function1));
            }
        }
    }

    public static final void observeRadialGradientRadius(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable DivRadialGradientRadius divRadialGradientRadius, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        if (divRadialGradientRadius != null) {
            if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
                DivRadialGradientRadius.FixedSize fixedSize = (DivRadialGradientRadius.FixedSize) divRadialGradientRadius;
                expressionSubscriber.addSubscription(fixedSize.getValue().unit.observe(expressionResolver, function1));
                expressionSubscriber.addSubscription(fixedSize.getValue().value.observe(expressionResolver, function1));
            } else if (divRadialGradientRadius instanceof DivRadialGradientRadius.Relative) {
                expressionSubscriber.addSubscription(((DivRadialGradientRadius.Relative) divRadialGradientRadius).getValue().value.observe(expressionResolver, function1));
            }
        }
    }
}
