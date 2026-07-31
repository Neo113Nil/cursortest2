package com.yandex.div.core.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionAnimatorStart;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivAnimatorBase;
import com.yandex.div2.DivColorAnimator;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivNumberAnimator;
import com.yandex.div2.DivTypedValue;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVariableAnimatorBuilder.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ*\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002J0\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J0\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0015H\u0002J*\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002J,\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\n\b\u0000\u0010\u0018\u0018\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\fH\u0082\b¢\u0006\u0002\u0010\u001cJ,\u0010\u001d\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002¨\u0006 "}, d2 = {"Lcom/yandex/div/core/animation/DivVariableAnimatorBuilder;", "", "()V", "build", "Landroid/animation/Animator;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "animator", "Lcom/yandex/div2/DivAnimator;", "startAction", "Lcom/yandex/div2/DivActionAnimatorStart;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "buildColorAnimator", "Lcom/yandex/div2/DivColorAnimator;", "resolver", "buildDoubleAnimator", "Lcom/yandex/div2/DivNumberAnimator;", "variable", "Lcom/yandex/div/data/Variable$DoubleVariable;", "buildIntegerAnimator", "Lcom/yandex/div/data/Variable$IntegerVariable;", "buildNumberAnimator", "findVariable", "T", "Lcom/yandex/div/data/Variable;", "name", "", "(Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/data/Variable;", "configure", "Landroid/animation/ObjectAnimator;", "Lcom/yandex/div2/DivAnimatorBase;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivVariableAnimatorBuilder {

    @NotNull
    public static final DivVariableAnimatorBuilder INSTANCE = new DivVariableAnimatorBuilder();

    private DivVariableAnimatorBuilder() {
    }

    @Nullable
    public final Animator build(@NotNull Div2View divView, @NotNull DivAnimator animator, @NotNull DivActionAnimatorStart startAction, @NotNull ExpressionResolver expressionResolver) {
        if (animator instanceof DivAnimator.Number) {
            return buildNumberAnimator(divView, ((DivAnimator.Number) animator).getValue(), startAction, expressionResolver);
        }
        if (animator instanceof DivAnimator.Color) {
            return buildColorAnimator(divView, ((DivAnimator.Color) animator).getValue(), startAction, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Animator buildNumberAnimator(Div2View divView, DivNumberAnimator animator, DivActionAnimatorStart startAction, ExpressionResolver resolver) {
        String variableName = animator.getVariableName();
        VariableController variableController = UtilsKt.getVariableController(resolver);
        Object mutableVariable = variableController != null ? variableController.getMutableVariable(variableName) : null;
        if (mutableVariable == null) {
            mutableVariable = null;
        }
        if (mutableVariable instanceof Variable.IntegerVariable) {
            return buildIntegerAnimator(divView, animator, startAction, resolver, (Variable.IntegerVariable) mutableVariable);
        }
        if (mutableVariable instanceof Variable.DoubleVariable) {
            return buildDoubleAnimator(divView, animator, startAction, resolver, (Variable.DoubleVariable) mutableVariable);
        }
        DivActionTypedUtilsKt.logError(divView, new MissingVariableException("Unable to find number variable with name '" + animator.getVariableName() + '\'', null, 2, null));
        return null;
    }

    private final Animator buildIntegerAnimator(Div2View divView, DivNumberAnimator animator, DivActionAnimatorStart startAction, ExpressionResolver resolver, Variable.IntegerVariable variable) {
        Object evaluate;
        Object evaluate2;
        DivTypedValue divTypedValue = startAction.startValue;
        if (divTypedValue == null || (evaluate = DivActionTypedUtilsKt.longValue(divTypedValue, resolver)) == null) {
            Expression expression = animator.startValue;
            evaluate = expression != null ? expression.evaluate(resolver) : null;
        }
        DivTypedValue divTypedValue2 = startAction.endValue;
        if (divTypedValue2 == null || (evaluate2 = DivActionTypedUtilsKt.longValue(divTypedValue2, resolver)) == null) {
            evaluate2 = animator.endValue.evaluate(resolver);
        }
        if (evaluate != null) {
            variable.setValueDirectly(evaluate);
        }
        return configure(ObjectAnimator.ofInt(variable, IntegerValueProperty.INSTANCE, ((Number) evaluate2).intValue()), divView, animator, startAction, resolver);
    }

    private final Animator buildDoubleAnimator(Div2View divView, DivNumberAnimator animator, DivActionAnimatorStart startAction, ExpressionResolver resolver, Variable.DoubleVariable variable) {
        Double d;
        Double doubleValue;
        DivTypedValue divTypedValue = startAction.startValue;
        if (divTypedValue == null || (d = DivActionTypedUtilsKt.doubleValue(divTypedValue, resolver)) == null) {
            Expression expression = animator.startValue;
            d = expression != null ? (Double) expression.evaluate(resolver) : null;
        }
        DivTypedValue divTypedValue2 = startAction.endValue;
        double doubleValue2 = (divTypedValue2 == null || (doubleValue = DivActionTypedUtilsKt.doubleValue(divTypedValue2, resolver)) == null) ? ((Number) animator.endValue.evaluate(resolver)).doubleValue() : doubleValue.doubleValue();
        if (d != null) {
            variable.setValueDirectly(d);
        }
        return configure(ObjectAnimator.ofFloat(variable, NumberValueProperty.INSTANCE, (float) doubleValue2), divView, animator, startAction, resolver);
    }

    private final Animator buildColorAnimator(Div2View divView, DivColorAnimator animator, DivActionAnimatorStart startAction, ExpressionResolver resolver) {
        Integer colorIntValue;
        Integer colorIntValue2;
        String variableName = animator.getVariableName();
        VariableController variableController = UtilsKt.getVariableController(resolver);
        Integer num = null;
        Variable mutableVariable = variableController != null ? variableController.getMutableVariable(variableName) : null;
        if (!(mutableVariable instanceof Variable.ColorVariable)) {
            mutableVariable = null;
        }
        Variable.ColorVariable colorVariable = (Variable.ColorVariable) mutableVariable;
        if (colorVariable == null) {
            DivActionTypedUtilsKt.logError(divView, new MissingVariableException("Unable to find color variable with name '" + animator.getVariableName() + '\'', null, 2, null));
            return null;
        }
        DivTypedValue divTypedValue = startAction.startValue;
        if (divTypedValue == null || (colorIntValue2 = DivActionTypedUtilsKt.colorIntValue(divTypedValue, resolver)) == null) {
            Expression expression = animator.startValue;
            if (expression != null) {
                num = (Integer) expression.evaluate(resolver);
            }
        } else {
            num = colorIntValue2;
        }
        DivTypedValue divTypedValue2 = startAction.endValue;
        int intValue = (divTypedValue2 == null || (colorIntValue = DivActionTypedUtilsKt.colorIntValue(divTypedValue2, resolver)) == null) ? ((Number) animator.endValue.evaluate(resolver)).intValue() : colorIntValue.intValue();
        if (num != null) {
            colorVariable.setValueDirectly(Color.m7324boximpl(Color.m7325constructorimpl(num.intValue())));
        }
        return configure(ObjectAnimator.ofArgb(colorVariable, ColorIntValueProperty.INSTANCE, intValue), divView, animator, startAction, resolver);
    }

    private final ObjectAnimator configure(ObjectAnimator objectAnimator, final Div2View div2View, DivAnimatorBase divAnimatorBase, DivActionAnimatorStart divActionAnimatorStart, final ExpressionResolver expressionResolver) {
        DivAnimationDirection divAnimationDirection;
        DivAnimationInterpolator divAnimationInterpolator;
        int i;
        Expression expression = divActionAnimatorStart.direction;
        if (expression == null || (divAnimationDirection = (DivAnimationDirection) expression.evaluate(expressionResolver)) == null) {
            divAnimationDirection = (DivAnimationDirection) divAnimatorBase.getDirection().evaluate(expressionResolver);
        }
        Expression expression2 = divActionAnimatorStart.duration;
        if (expression2 == null) {
            expression2 = divAnimatorBase.getDuration();
        }
        objectAnimator.setDuration(((Number) expression2.evaluate(expressionResolver)).longValue());
        Expression expression3 = divActionAnimatorStart.startDelay;
        if (expression3 == null) {
            expression3 = divAnimatorBase.getStartDelay();
        }
        objectAnimator.setStartDelay(((Number) expression3.evaluate(expressionResolver)).longValue());
        Expression expression4 = divActionAnimatorStart.interpolator;
        if (expression4 == null || (divAnimationInterpolator = (DivAnimationInterpolator) expression4.evaluate(expressionResolver)) == null) {
            divAnimationInterpolator = (DivAnimationInterpolator) divAnimatorBase.getInterpolator().evaluate(expressionResolver);
        }
        objectAnimator.setInterpolator(DivUtilKt.androidInterpolator(divAnimationInterpolator, DivUtilKt.isReversed(divAnimationDirection)));
        DivCount divCount = divActionAnimatorStart.repeatCount;
        if (divCount == null) {
            divCount = divAnimatorBase.getRepeatCount();
        }
        if (divCount instanceof DivCount.Fixed) {
            i = RangesKt.coerceAtLeast(((int) ((Number) ((DivCount.Fixed) divCount).getValue().value.evaluate(expressionResolver)).longValue()) - 1, 0);
        } else {
            if (!(divCount instanceof DivCount.Infinity)) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        objectAnimator.setRepeatCount(i);
        objectAnimator.setRepeatMode(DivUtilKt.isAlternated(divAnimationDirection) ? 2 : 1);
        final List endActions = divAnimatorBase.getEndActions();
        if (endActions != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    Iterator it = endActions.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), DivActionHandler.DivActionReason.ANIMATION_END, expressionResolver);
                    }
                }
            });
        }
        final List cancelActions = divAnimatorBase.getCancelActions();
        if (cancelActions != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    Iterator it = cancelActions.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), DivActionHandler.DivActionReason.ANIMATION_CANCEL, expressionResolver);
                    }
                }
            });
        }
        return objectAnimator;
    }

    private final /* synthetic */ <T extends Variable> T findVariable(String name, ExpressionResolver resolver) {
        VariableController variableController = UtilsKt.getVariableController(resolver);
        T t = variableController != null ? (T) variableController.getMutableVariable(name) : null;
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
