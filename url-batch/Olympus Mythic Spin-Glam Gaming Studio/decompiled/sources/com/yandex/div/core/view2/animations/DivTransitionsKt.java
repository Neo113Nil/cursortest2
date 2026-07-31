package com.yandex.div.core.view2.animations;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTransitions.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\u0012\u0010\t\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a\u0012\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¨\u0006\u000b"}, d2 = {"allowsTransitionsOnDataChange", "", "Lcom/yandex/div2/DivData;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div2/DivState;", "Lcom/yandex/div2/DivTransitionSelector;", "", "Lcom/yandex/div2/DivTransitionTrigger;", "allowsTransitionsOnStateChange", "allowsTransitionsOnVisibilityChange", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivTransitionsKt {

    /* compiled from: DivTransitions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTransitionSelector.values().length];
            try {
                iArr[DivTransitionSelector.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTransitionSelector.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTransitionSelector.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull DivTransitionSelector divTransitionSelector) {
        int i = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i == 1 || i == 2;
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull DivTransitionSelector divTransitionSelector) {
        int i = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i == 2 || i == 3;
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.DATA_CHANGE);
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.STATE_CHANGE);
    }

    public static final boolean allowsTransitionsOnVisibilityChange(@NotNull List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.VISIBILITY_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull DivData divData, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnDataChange((DivTransitionSelector) divData.transitionAnimationSelector.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnDataChange(@NotNull DivState divState, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnDataChange((DivTransitionSelector) divState.transitionAnimationSelector.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnStateChange(@NotNull DivState divState, @NotNull ExpressionResolver expressionResolver) {
        return allowsTransitionsOnStateChange((DivTransitionSelector) divState.transitionAnimationSelector.evaluate(expressionResolver));
    }
}
