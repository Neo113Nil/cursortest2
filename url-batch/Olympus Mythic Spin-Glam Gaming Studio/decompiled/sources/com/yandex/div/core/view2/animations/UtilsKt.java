package com.yandex.div.core.view2.animations;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import androidx.core.content.ContextCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.yandex.div.R;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationInterpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001a\u001a0\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001c*\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001dH\u0000\u001a,\u0010\"\u001a\u00020\u001d*\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H\u0000\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001a\u001a,\u0010*\u001a\u0004\u0018\u00010+*\u00020\u00042\u0006\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"DEFAULT_ALPHA_END_VALUE", "", "DEFAULT_ALPHA_START_VALUE", "DEFAULT_CLICK_ANIMATION", "Lcom/yandex/div2/DivAnimation;", "getDEFAULT_CLICK_ANIMATION", "()Lcom/yandex/div2/DivAnimation;", "DEFAULT_SCALE_END_VALUE", "DEFAULT_SCALE_START_VALUE", "MAX_ALPHA_VALUE", "MIN_ALPHA_VALUE", "MIN_SCALE_VALUE", "SCALE_PIVOT_VALUE", "capturePosition", "", "transitionValues", "Landroidx/transition/TransitionValues;", "savePosition", "Lkotlin/Function1;", "", "createScaleAnimation", "Landroid/view/animation/ScaleAnimation;", "startValue", "endValue", "alphaValue", "", "(Ljava/lang/Double;)Ljava/lang/Float;", "asTouchListener", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/view/MotionEvent;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "view", "getViewForAnimate", "Landroidx/transition/Transition;", "sceneRoot", "Landroid/view/ViewGroup;", "values", "positionKey", "", "scaleValue", "toAnimation", "Landroid/view/animation/Animation;", "resolver", "reverse", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UtilsKt {
    private static final float DEFAULT_ALPHA_END_VALUE = 0.6f;
    private static final float DEFAULT_ALPHA_START_VALUE = 1.0f;

    @NotNull
    private static final DivAnimation DEFAULT_CLICK_ANIMATION;
    private static final float DEFAULT_SCALE_END_VALUE = 0.95f;
    private static final float DEFAULT_SCALE_START_VALUE = 1.0f;
    private static final float MAX_ALPHA_VALUE = 1.0f;
    private static final float MIN_ALPHA_VALUE = 0.0f;
    private static final float MIN_SCALE_VALUE = 0.0f;
    private static final float SCALE_PIVOT_VALUE = 0.5f;

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DEFAULT_CLICK_ANIMATION = new DivAnimation(Expression.Companion.constant$default(companion, 100L, null, 2, null), Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null), null, null, Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null), null, null, Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null), 108, null);
    }

    @NotNull
    public static final DivAnimation getDEFAULT_CLICK_ANIMATION() {
        return DEFAULT_CLICK_ANIMATION;
    }

    @NotNull
    public static final View getViewForAnimate(@NotNull Transition transition, @NotNull View view, @NotNull ViewGroup viewGroup, @NotNull TransitionValues transitionValues, @NotNull String str) {
        if (Intrinsics.areEqual(transitionValues.view, view) || !ViewsKt.isActuallyLaidOut(view)) {
            return view;
        }
        Object obj = transitionValues.values.get(str);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, transition, (int[]) obj);
    }

    public static final void capturePosition(@NotNull TransitionValues transitionValues, @NotNull Function1 function1) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        function1.invoke(iArr);
    }

    @Nullable
    public static final Function2 asTouchListener(@NotNull DivAnimation divAnimation, @NotNull ExpressionResolver expressionResolver, @NotNull View view) {
        final Animation animation$default = toAnimation$default(divAnimation, expressionResolver, false, view, 2, null);
        final Animation animation$default2 = toAnimation$default(divAnimation, expressionResolver, true, null, 4, null);
        if (animation$default == null && animation$default2 == null) {
            return null;
        }
        return new Function2() { // from class: com.yandex.div.core.view2.animations.UtilsKt$asTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((View) obj, (MotionEvent) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view2, @NotNull MotionEvent motionEvent) {
                Animation animation;
                if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = animation$default;
                        if (animation2 != null) {
                            view2.startAnimation(animation2);
                            return;
                        }
                        return;
                    }
                    if ((action == 1 || action == 3) && (animation = animation$default2) != null) {
                        view2.startAnimation(animation);
                    }
                }
            }
        };
    }

    static /* synthetic */ Animation toAnimation$default(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z, View view, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            view = null;
        }
        return toAnimation(divAnimation, expressionResolver, z, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static final Animation toAnimation(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z, View view) {
        ?? animationSet;
        Interpolator androidInterpolator;
        float floatValue;
        DivAnimation.Name name = (DivAnimation.Name) divAnimation.name.evaluate(expressionResolver);
        int i = WhenMappings.$EnumSwitchMapping$0[name.ordinal()];
        if (i != 1) {
            animationSet = 0;
            animationSet = 0;
            animationSet = 0;
            animationSet = 0;
            if (i == 2) {
                Expression expression = divAnimation.startValue;
                Float scaleValue = scaleValue(expression != null ? (Double) expression.evaluate(expressionResolver) : null);
                floatValue = scaleValue != null ? scaleValue.floatValue() : 1.0f;
                Expression expression2 = divAnimation.endValue;
                Float scaleValue2 = scaleValue(expression2 != null ? (Double) expression2.evaluate(expressionResolver) : null);
                animationSet = createScaleAnimation(floatValue, scaleValue2 != null ? scaleValue2.floatValue() : DEFAULT_SCALE_END_VALUE);
            } else if (i != 3) {
                if (i != 4) {
                    Expression expression3 = divAnimation.startValue;
                    Float alphaValue = alphaValue(expression3 != null ? (Double) expression3.evaluate(expressionResolver) : null);
                    floatValue = alphaValue != null ? alphaValue.floatValue() : 1.0f;
                    Expression expression4 = divAnimation.endValue;
                    Float alphaValue2 = alphaValue(expression4 != null ? (Double) expression4.evaluate(expressionResolver) : null);
                    animationSet = new AlphaAnimation(floatValue, alphaValue2 != null ? alphaValue2.floatValue() : 0.6f);
                }
            } else if (view != 0) {
                Drawable background = view.getBackground();
                LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
                if (layerDrawable != null) {
                    ?? until = RangesKt.until(0, layerDrawable.getNumberOfLayers());
                    if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
                        Iterator it = until.iterator();
                        while (it.hasNext()) {
                            if (layerDrawable.getId(((IntIterator) it).nextInt()) == R.drawable.native_animation_background) {
                                break;
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (layerDrawable != null) {
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i2 = 0; i2 < numberOfLayers; i2++) {
                        arrayList.add(layerDrawable.getDrawable(i2));
                    }
                } else {
                    arrayList.add(view.getBackground());
                }
                Drawable drawable = ContextCompat.getDrawable(view.getContext(), R.drawable.native_animation_background);
                if (drawable != null) {
                    arrayList.add(drawable);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
                layerDrawable2.setId(arrayList.size() - 1, R.drawable.native_animation_background);
                view.setBackground(layerDrawable2);
            }
        } else {
            animationSet = new AnimationSet(false);
            List list = divAnimation.items;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Animation animation = toAnimation((DivAnimation) it2.next(), expressionResolver, z, view);
                    if (animation != null) {
                        animationSet.addAnimation(animation);
                    }
                }
            }
        }
        if (name != DivAnimation.Name.SET) {
            if (animationSet != 0) {
                if (z) {
                    androidInterpolator = ReverseInterpolatorKt.reversed(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) divAnimation.interpolator.evaluate(expressionResolver)));
                } else {
                    androidInterpolator = DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) divAnimation.interpolator.evaluate(expressionResolver));
                }
                animationSet.setInterpolator(androidInterpolator);
            }
            if (animationSet != 0) {
                animationSet.setDuration(((Number) divAnimation.duration.evaluate(expressionResolver)).longValue());
            }
        }
        if (animationSet != 0) {
            animationSet.setStartOffset(((Number) divAnimation.startDelay.evaluate(expressionResolver)).longValue());
        }
        if (animationSet != 0) {
            animationSet.setFillAfter(true);
        }
        return animationSet;
    }

    private static final ScaleAnimation createScaleAnimation(float f, float f2) {
        return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
    }

    private static final Float alphaValue(Double d) {
        if (d != null) {
            return Float.valueOf(RangesKt.coerceIn((float) d.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d) {
        if (d != null) {
            return Float.valueOf(RangesKt.coerceAtLeast((float) d.doubleValue(), 0.0f));
        }
        return null;
    }
}
