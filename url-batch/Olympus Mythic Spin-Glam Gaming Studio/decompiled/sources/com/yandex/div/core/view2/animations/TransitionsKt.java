package com.yandex.div.core.view2.animations;

import androidx.annotation.NonNull;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Transitions.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u001a\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002H\u0000\u001a#\u0010\b\u001a\u00020\u0001*\u00020\t2\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000bH\u0080\b\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0080\u0002\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0080\u0002\u001a\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0080\u0002\u001a\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0080\u0002¨\u0006\u0011"}, d2 = {"doOnEnd", "", "Landroidx/transition/Transition;", "action", "Lkotlin/Function0;", "enumerateTargetIds", "", "", "forEach", "Landroidx/transition/TransitionSet;", "block", "Lkotlin/Function1;", "minusAssign", "transition", "transitions", "", "plusAssign", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransitionsKt {
    public static final void plusAssign(@NotNull TransitionSet transitionSet, @NotNull Transition transition) {
        transitionSet.addTransition(transition);
    }

    public static final void minusAssign(@NotNull TransitionSet transitionSet, @NotNull Transition transition) {
        transitionSet.removeTransition(transition);
    }

    public static final void forEach(@NotNull TransitionSet transitionSet, @NotNull Function1 function1) {
        int transitionCount = transitionSet.getTransitionCount();
        for (int i = 0; i < transitionCount; i++) {
            Transition transitionAt = transitionSet.getTransitionAt(i);
            if (transitionAt != null) {
                function1.invoke(transitionAt);
            }
        }
    }

    public static final void doOnEnd(@NotNull final Transition transition, @NotNull final Function0 function0) {
        transition.addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.TransitionsKt$doOnEnd$1
            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionEnd(@NonNull Transition transition2, boolean z) {
                super.onTransitionEnd(transition2, z);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionStart(@NonNull Transition transition2, boolean z) {
                super.onTransitionStart(transition2, z);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
                Function0.this.mo4828invoke();
                transition.removeListener(this);
            }
        });
    }

    @NotNull
    public static final List<Integer> enumerateTargetIds(@NotNull Transition transition) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(transition);
        while (!arrayDeque.isEmpty()) {
            Transition transition2 = (Transition) arrayDeque.removeFirst();
            if (transition2 instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition2;
                int transitionCount = transitionSet.getTransitionCount();
                for (int i = 0; i < transitionCount; i++) {
                    Transition transitionAt = transitionSet.getTransitionAt(i);
                    if (transitionAt != null) {
                        arrayDeque.addLast(transitionAt);
                    }
                }
            }
            linkedHashSet.addAll(transition2.getTargetIds());
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    public static final void minusAssign(@NotNull TransitionSet transitionSet, @NotNull Iterable<? extends Transition> iterable) {
        Iterator<? extends Transition> it = iterable.iterator();
        while (it.hasNext()) {
            transitionSet.removeTransition(it.next());
        }
    }

    public static final void plusAssign(@NotNull TransitionSet transitionSet, @NotNull Iterable<? extends Transition> iterable) {
        Iterator<? extends Transition> it = iterable.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(it.next());
        }
    }
}
