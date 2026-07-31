package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;
import com.ironsource.X3;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivTooltip;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\f\u0010\n\u001a\u00020\b*\u00020\tH\u0003\u001a\u001c\u0010\u000b\u001a\u00020\b*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0013"}, d2 = {"defaultTransition", "Landroid/transition/TransitionSet;", "kotlin.jvm.PlatformType", "divTooltip", "Lcom/yandex/div2/DivTooltip;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "clearAnimation", "", "Landroid/widget/PopupWindow;", "removeTransition", "setupAnimation", "toTransition", "Landroid/transition/Transition;", "Lcom/yandex/div2/DivAnimation;", X3.i.L, "Lcom/yandex/div2/DivTooltip$Position;", "incoming", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivTooltipAnimationKt {

    /* compiled from: DivTooltipAnimation.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setupAnimation(@NotNull PopupWindow popupWindow, @NotNull DivTooltip divTooltip, @NotNull ExpressionResolver expressionResolver) {
        Transition defaultTransition;
        Transition defaultTransition2;
        DivAnimation divAnimation = divTooltip.animationIn;
        if (divAnimation != null) {
            defaultTransition = toTransition(divAnimation, (DivTooltip.Position) divTooltip.position.evaluate(expressionResolver), true, expressionResolver);
        } else {
            defaultTransition = defaultTransition(divTooltip, expressionResolver);
        }
        popupWindow.setEnterTransition(defaultTransition);
        DivAnimation divAnimation2 = divTooltip.animationOut;
        if (divAnimation2 != null) {
            defaultTransition2 = toTransition(divAnimation2, (DivTooltip.Position) divTooltip.position.evaluate(expressionResolver), false, expressionResolver);
        } else {
            defaultTransition2 = defaultTransition(divTooltip, expressionResolver);
        }
        popupWindow.setExitTransition(defaultTransition2);
    }

    public static final void clearAnimation(@NotNull PopupWindow popupWindow) {
        removeTransition(popupWindow);
    }

    @RequiresApi
    private static final void removeTransition(PopupWindow popupWindow) {
        popupWindow.setEnterTransition(null);
        popupWindow.setExitTransition(null);
    }

    private static final TransitionSet defaultTransition(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation((DivTooltip.Position) divTooltip.position.evaluate(expressionResolver), null, 2, null)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    private static final Transition toTransition(DivAnimation divAnimation, DivTooltip.Position position, boolean z, ExpressionResolver expressionResolver) {
        ?? fade;
        Expression expression;
        Transition duration;
        switch (WhenMappings.$EnumSwitchMapping$0[((DivAnimation.Name) divAnimation.name.evaluate(expressionResolver)).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                Expression expression2 = z ? divAnimation.startValue : divAnimation.endValue;
                fade = new TranslateAnimation(position, expression2 != null ? Float.valueOf((float) ((Number) expression2.evaluate(expressionResolver)).doubleValue()) : null);
                break;
            case 3:
                if (z) {
                    expression = divAnimation.startValue;
                } else {
                    expression = divAnimation.endValue;
                }
                fade = new Scale(expression != null ? (float) ((Number) expression.evaluate(expressionResolver)).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List list = divAnimation.items;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(toTransition((DivAnimation) it.next(), position, z, expressionResolver));
                    }
                    break;
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (fade == 0 || (duration = fade.setDuration(((Number) divAnimation.duration.evaluate(expressionResolver)).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) divAnimation.interpolator.evaluate(expressionResolver)));
    }
}
