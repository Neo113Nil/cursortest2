package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.animation.DivVariableAnimatorBuilder;
import com.yandex.div.core.dagger.DivViewScope;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivActionAnimatorStart;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivAnimatorController.kt */
@DivViewScope
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivAnimatorController;", "", "divView", "Lcom/yandex/div/core/view2/Div2View;", "(Lcom/yandex/div/core/view2/Div2View;)V", "runningAnimators", "", "Lkotlin/Pair;", "", "Landroid/animation/Animator;", "findAnimator", "Lcom/yandex/div2/DivAnimator;", "view", "Landroid/view/View;", "animatorId", "animators", "", "onDetachedFromWindow", "", "startAnimator", "scopeId", "targetView", "action", "Lcom/yandex/div2/DivActionAnimatorStart;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "stopAnimator", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivAnimatorController {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final Map<Pair<String, String>, Animator> runningAnimators = new LinkedHashMap();

    public DivAnimatorController(@NotNull Div2View div2View) {
        this.divView = div2View;
    }

    public final void startAnimator(@NotNull String scopeId, @NotNull View targetView, @NotNull DivActionAnimatorStart action, @NotNull ExpressionResolver resolver) {
        Animator remove;
        String str = action.animatorId;
        DivAnimator findAnimator = findAnimator(targetView, str);
        if (findAnimator == null) {
            return;
        }
        final Pair<String, String> pair = TuplesKt.to(scopeId, str);
        if (this.runningAnimators.containsKey(pair) && (remove = this.runningAnimators.remove(pair)) != null) {
            remove.cancel();
        }
        Animator build = DivVariableAnimatorBuilder.INSTANCE.build(this.divView, findAnimator, action, resolver);
        if (build == null) {
            return;
        }
        build.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnEnd$1
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
                Map map;
                map = DivAnimatorController.this.runningAnimators;
                map.remove(pair);
            }
        });
        build.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnCancel$1
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
                Map map;
                map = DivAnimatorController.this.runningAnimators;
                map.remove(pair);
            }
        });
        this.runningAnimators.put(pair, build);
        build.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final DivAnimator findAnimator(View view, String animatorId) {
        DivBase value;
        if (view instanceof DivHolderView) {
            Div div = ((DivHolderView) view).getDiv();
            DivAnimator findAnimator = findAnimator((List<? extends DivAnimator>) ((div == null || (value = div.value()) == null) ? null : value.getAnimators()), animatorId);
            if (findAnimator != null) {
                return findAnimator;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return findAnimator(view2, animatorId);
            }
            return null;
        }
        if (view instanceof Div2View) {
            DivActionTypedUtilsKt.logWarning(this.divView, new RuntimeException("Unable to find animator with id '" + animatorId + '\''));
            return null;
        }
        Object parent2 = view.getParent();
        View view3 = parent2 instanceof View ? (View) parent2 : null;
        if (view3 != null) {
            return findAnimator(view3, animatorId);
        }
        return null;
    }

    private final DivAnimator findAnimator(List<? extends DivAnimator> animators, String animatorId) {
        if (animators == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : animators) {
            if (Intrinsics.areEqual(((DivAnimator) obj).value().getId(), animatorId)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() <= 1) {
            return (DivAnimator) CollectionsKt.first((List) arrayList);
        }
        return null;
    }

    public final void stopAnimator(@NotNull String scopeId, @NotNull String animatorId) {
        Animator remove = this.runningAnimators.remove(TuplesKt.to(scopeId, animatorId));
        if (remove == null) {
            return;
        }
        remove.cancel();
    }

    public final void onDetachedFromWindow() {
        Iterator it = new ArrayList(this.runningAnimators.values()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        this.runningAnimators.clear();
    }
}
