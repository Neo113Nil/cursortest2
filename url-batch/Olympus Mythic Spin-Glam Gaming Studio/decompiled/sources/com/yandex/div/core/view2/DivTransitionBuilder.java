package com.yandex.div.core.view2;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div.core.view2.animations.TransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivSlideTransition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTransitionBuilder.kt */
@DivViewScope
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J,\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J8\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J$\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010#\u001a\u00020\r*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0014\u0010#\u001a\u00020\r*\u00020$2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\f\u0010%\u001a\u00020\"*\u00020&H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/yandex/div/core/view2/DivTransitionBuilder;", "", "context", "Landroid/content/Context;", "viewIdProvider", "Lcom/yandex/div/core/view2/DivViewIdProvider;", "(Landroid/content/Context;Lcom/yandex/div/core/view2/DivViewIdProvider;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "buildChangeTransitions", "", "Landroidx/transition/Transition;", "itemSequence", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "buildIncomingTransitions", "buildOutgoingTransitions", "buildTransitions", "Landroidx/transition/TransitionSet;", "fromDiv", "Lcom/yandex/div2/Div;", "toDiv", "fromResolver", "toResolver", "from", "to", "createAndroidTransition", "divAppearanceTransition", "Lcom/yandex/div2/DivAppearanceTransition;", "transitionMode", "", "toAndroidTransition", "Lcom/yandex/div2/DivChangeTransition;", "toGravity", "Lcom/yandex/div2/DivSlideTransition$Edge;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DivTransitionBuilder {

    @NotNull
    private final Context context;

    @NotNull
    private final DivViewIdProvider viewIdProvider;

    /* compiled from: DivTransitionBuilder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSlideTransition.Edge.values().length];
            try {
                iArr[DivSlideTransition.Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSlideTransition.Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSlideTransition.Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivSlideTransition.Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTransitionBuilder(@NotNull Context context, @NotNull DivViewIdProvider divViewIdProvider) {
        this.context = context;
        this.viewIdProvider = divViewIdProvider;
    }

    private DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    @NotNull
    public TransitionSet buildTransitions(@Nullable Div fromDiv, @Nullable Div toDiv, @NotNull ExpressionResolver fromResolver, @NotNull ExpressionResolver toResolver) {
        return buildTransitions(fromDiv != null ? DivTreeWalkKt.walk(fromDiv, fromResolver) : null, toDiv != null ? DivTreeWalkKt.walk(toDiv, fromResolver) : null, fromResolver, toResolver);
    }

    @NotNull
    public TransitionSet buildTransitions(@Nullable Sequence from, @Nullable Sequence to, @NotNull ExpressionResolver fromResolver, @NotNull ExpressionResolver toResolver) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        if (from != null) {
            TransitionsKt.plusAssign(transitionSet, buildOutgoingTransitions(from, fromResolver));
        }
        if (from != null && to != null) {
            TransitionsKt.plusAssign(transitionSet, buildChangeTransitions(from, fromResolver));
        }
        if (to != null) {
            TransitionsKt.plusAssign(transitionSet, buildIncomingTransitions(to, toResolver));
        }
        return transitionSet;
    }

    private List<Transition> buildOutgoingTransitions(Sequence itemSequence, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        Iterator it = itemSequence.iterator();
        while (it.hasNext()) {
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) it.next();
            String id = divItemBuilderResult.getDiv().value().getId();
            DivAppearanceTransition transitionOut = divItemBuilderResult.getDiv().value().getTransitionOut();
            if (id != null && transitionOut != null) {
                Transition androidTransition = toAndroidTransition(transitionOut, 2, resolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<Transition> buildChangeTransitions(Sequence itemSequence, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        Iterator it = itemSequence.iterator();
        while (it.hasNext()) {
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) it.next();
            String id = divItemBuilderResult.getDiv().value().getId();
            DivChangeTransition transitionChange = divItemBuilderResult.getDiv().value().getTransitionChange();
            if (id != null && transitionChange != null) {
                Transition androidTransition = toAndroidTransition(transitionChange, resolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<Transition> buildIncomingTransitions(Sequence itemSequence, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        Iterator it = itemSequence.iterator();
        while (it.hasNext()) {
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) it.next();
            String id = divItemBuilderResult.getDiv().value().getId();
            DivAppearanceTransition transitionIn = divItemBuilderResult.getDiv().value().getTransitionIn();
            if (id != null && transitionIn != null) {
                Transition androidTransition = toAndroidTransition(transitionIn, 1, resolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    @Nullable
    public Transition createAndroidTransition(@Nullable DivAppearanceTransition divAppearanceTransition, int transitionMode, @NotNull ExpressionResolver resolver) {
        if (divAppearanceTransition == null) {
            return null;
        }
        return toAndroidTransition(divAppearanceTransition, transitionMode, resolver);
    }

    private Transition toAndroidTransition(DivAppearanceTransition divAppearanceTransition, int i, ExpressionResolver expressionResolver) {
        if (divAppearanceTransition instanceof DivAppearanceTransition.Set) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator it = ((DivAppearanceTransition.Set) divAppearanceTransition).getValue().items.iterator();
            while (it.hasNext()) {
                Transition androidTransition = toAndroidTransition((DivAppearanceTransition) it.next(), i, expressionResolver);
                transitionSet.setDuration(Math.max(transitionSet.getDuration(), androidTransition.getStartDelay() + androidTransition.getDuration()));
                transitionSet.addTransition(androidTransition);
            }
            return transitionSet;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Fade) {
            DivAppearanceTransition.Fade fade = (DivAppearanceTransition.Fade) divAppearanceTransition;
            Fade fade2 = new Fade((float) ((Number) fade.getValue().alpha.evaluate(expressionResolver)).doubleValue());
            fade2.setMode(i);
            fade2.setDuration(((Number) fade.getValue().getDuration().evaluate(expressionResolver)).longValue());
            fade2.setStartDelay(((Number) fade.getValue().getStartDelay().evaluate(expressionResolver)).longValue());
            fade2.setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) fade.getValue().getInterpolator().evaluate(expressionResolver)));
            return fade2;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Scale) {
            DivAppearanceTransition.Scale scale = (DivAppearanceTransition.Scale) divAppearanceTransition;
            Scale scale2 = new Scale((float) ((Number) scale.getValue().scale.evaluate(expressionResolver)).doubleValue(), (float) ((Number) scale.getValue().pivotX.evaluate(expressionResolver)).doubleValue(), (float) ((Number) scale.getValue().pivotY.evaluate(expressionResolver)).doubleValue());
            scale2.setMode(i);
            scale2.setDuration(((Number) scale.getValue().getDuration().evaluate(expressionResolver)).longValue());
            scale2.setStartDelay(((Number) scale.getValue().getStartDelay().evaluate(expressionResolver)).longValue());
            scale2.setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) scale.getValue().getInterpolator().evaluate(expressionResolver)));
            return scale2;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Slide) {
            DivAppearanceTransition.Slide slide = (DivAppearanceTransition.Slide) divAppearanceTransition;
            DivDimension divDimension = slide.getValue().distance;
            Slide slide2 = new Slide(divDimension != null ? BaseDivViewExtensionsKt.toPx(divDimension, getDisplayMetrics(), expressionResolver) : -1, toGravity((DivSlideTransition.Edge) slide.getValue().edge.evaluate(expressionResolver)));
            slide2.setMode(i);
            slide2.setDuration(((Number) slide.getValue().getDuration().evaluate(expressionResolver)).longValue());
            slide2.setStartDelay(((Number) slide.getValue().getStartDelay().evaluate(expressionResolver)).longValue());
            slide2.setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) slide.getValue().getInterpolator().evaluate(expressionResolver)));
            return slide2;
        }
        throw new NoWhenBranchMatchedException();
    }

    private int toGravity(DivSlideTransition.Edge edge) {
        int i = WhenMappings.$EnumSwitchMapping$0[edge.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 80;
        }
        throw new NoWhenBranchMatchedException();
    }

    private Transition toAndroidTransition(DivChangeTransition divChangeTransition, ExpressionResolver expressionResolver) {
        if (divChangeTransition instanceof DivChangeTransition.Set) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator it = ((DivChangeTransition.Set) divChangeTransition).getValue().items.iterator();
            while (it.hasNext()) {
                transitionSet.addTransition(toAndroidTransition((DivChangeTransition) it.next(), expressionResolver));
            }
            return transitionSet;
        }
        if (divChangeTransition instanceof DivChangeTransition.Bounds) {
            ChangeBounds changeBounds = new ChangeBounds();
            DivChangeTransition.Bounds bounds = (DivChangeTransition.Bounds) divChangeTransition;
            changeBounds.setDuration(((Number) bounds.getValue().getDuration().evaluate(expressionResolver)).longValue());
            changeBounds.setStartDelay(((Number) bounds.getValue().getStartDelay().evaluate(expressionResolver)).longValue());
            changeBounds.setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) bounds.getValue().getInterpolator().evaluate(expressionResolver)));
            return changeBounds;
        }
        throw new NoWhenBranchMatchedException();
    }
}
