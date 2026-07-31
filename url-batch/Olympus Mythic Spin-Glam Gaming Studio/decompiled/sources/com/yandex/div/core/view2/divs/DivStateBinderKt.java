package com.yandex.div.core.view2.divs;

import androidx.transition.Transition;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.OutlineAwareVisibility;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.VerticalTranslation;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: DivStateBinder.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0002\u0010\u0003\u001a\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0002\u0010\u0003¨\u0006\r"}, d2 = {"alphaValue", "", "", "(Ljava/lang/Double;)Ljava/lang/Float;", "scaleValue", "toTransition", "Landroidx/transition/Transition;", "Lcom/yandex/div2/DivAnimation;", "incoming", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "translateValue", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivStateBinderKt {

    /* compiled from: DivStateBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Transition toTransition(DivAnimation divAnimation, boolean z, ExpressionResolver expressionResolver) {
        Float translateValue;
        Float translateValue2;
        Float scaleValue;
        Float alphaValue;
        int i = WhenMappings.$EnumSwitchMapping$0[((DivAnimation.Name) divAnimation.name.evaluate(expressionResolver)).ordinal()];
        OutlineAwareVisibility outlineAwareVisibility = null;
        if (i != 1) {
            if (i == 2) {
                if (z) {
                    Expression expression = divAnimation.startValue;
                    scaleValue = scaleValue(expression != null ? (Double) expression.evaluate(expressionResolver) : null);
                } else {
                    Expression expression2 = divAnimation.endValue;
                    scaleValue = scaleValue(expression2 != null ? (Double) expression2.evaluate(expressionResolver) : null);
                }
                outlineAwareVisibility = new Scale(scaleValue != null ? scaleValue.floatValue() : 1.0f, 0.0f, 0.0f, 6, null);
            } else if (i != 3) {
                if (z) {
                    Expression expression3 = divAnimation.startValue;
                    alphaValue = alphaValue(expression3 != null ? (Double) expression3.evaluate(expressionResolver) : null);
                } else {
                    Expression expression4 = divAnimation.endValue;
                    alphaValue = alphaValue(expression4 != null ? (Double) expression4.evaluate(expressionResolver) : null);
                }
                OutlineAwareVisibility fade = new Fade(alphaValue != null ? alphaValue.floatValue() : 1.0f);
                fade.setMode(z ? 1 : 2);
                outlineAwareVisibility = fade;
            }
        } else if (z) {
            Expression expression5 = divAnimation.startValue;
            if (expression5 != null) {
                translateValue = translateValue(Double.valueOf(((Number) expression5.evaluate(expressionResolver)).doubleValue()));
                if (!z) {
                    Expression expression6 = divAnimation.endValue;
                    translateValue2 = translateValue(expression6 != null ? (Double) expression6.evaluate(expressionResolver) : null);
                } else {
                    Expression expression7 = divAnimation.startValue;
                    translateValue2 = translateValue(expression7 != null ? (Double) expression7.evaluate(expressionResolver) : null);
                }
                outlineAwareVisibility = new VerticalTranslation(translateValue == null ? translateValue.floatValue() : -1.0f, translateValue2 == null ? translateValue2.floatValue() : 0.0f);
            }
            translateValue = null;
            if (!z) {
            }
            outlineAwareVisibility = new VerticalTranslation(translateValue == null ? translateValue.floatValue() : -1.0f, translateValue2 == null ? translateValue2.floatValue() : 0.0f);
        } else {
            Expression expression8 = divAnimation.endValue;
            if (expression8 != null) {
                translateValue = translateValue(Double.valueOf(((Number) expression8.evaluate(expressionResolver)).doubleValue()));
                if (!z) {
                }
                outlineAwareVisibility = new VerticalTranslation(translateValue == null ? translateValue.floatValue() : -1.0f, translateValue2 == null ? translateValue2.floatValue() : 0.0f);
            }
            translateValue = null;
            if (!z) {
            }
            outlineAwareVisibility = new VerticalTranslation(translateValue == null ? translateValue.floatValue() : -1.0f, translateValue2 == null ? translateValue2.floatValue() : 0.0f);
        }
        return outlineAwareVisibility;
    }

    private static final Float translateValue(Double d) {
        if (d != null) {
            return Float.valueOf(RangesKt.coerceIn((float) d.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d) {
        if (d != null) {
            return Float.valueOf(RangesKt.coerceAtLeast((float) d.doubleValue(), 0.0f));
        }
        return null;
    }

    private static final Float alphaValue(Double d) {
        if (d != null) {
            return Float.valueOf(RangesKt.coerceIn((float) d.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }
}
