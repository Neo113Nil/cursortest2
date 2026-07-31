package com.yandex.div.core.util;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0016\u001a\u00020\u000b*\u00020\u00002\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0019\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0003\"\u0018\u0010\u001a\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0003¨\u0006\u001b"}, d2 = {"Landroid/view/View;", "", "isLayoutRtl", "(Landroid/view/View;)Z", "", "start", "count", "Lkotlin/ranges/IntProgression;", "getIndices", "(Landroid/view/View;II)Lkotlin/ranges/IntProgression;", "Lkotlin/Function1;", "", "action", "Lcom/yandex/div/core/Disposable;", "doOnEveryDetach", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "doOnActualLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onEnqueuedAction", "doOnHierarchyLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "doOnNextHierarchyLayout", "farthestLayoutCaller", "(Landroid/view/View;)Landroid/view/View;", "isActuallyLaidOut", "isHierarchyLaidOut", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewsKt {
    public static final boolean isActuallyLaidOut(@NotNull View view) {
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean isHierarchyLaidOut(@NotNull View view) {
        return farthestLayoutCaller(view) == null;
    }

    public static final boolean isLayoutRtl(@NotNull View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    @NotNull
    public static final IntProgression getIndices(@NotNull View view, int i, int i2) {
        int i3 = i2 + i;
        return isLayoutRtl(view) ? RangesKt.downTo(i3 - 1, i) : RangesKt.until(i, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.util.ViewsKt$doOnEveryDetach$listener$1] */
    @NotNull
    public static final Disposable doOnEveryDetach(@NotNull final View view, @NotNull final Function1 function1) {
        final ?? r0 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.util.ViewsKt$doOnEveryDetach$listener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Function1.this.invoke(view2);
            }
        };
        view.addOnAttachStateChangeListener(r0);
        return new Disposable() { // from class: com.yandex.div.core.util.ViewsKt$doOnEveryDetach$1
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                view.removeOnAttachStateChangeListener(r0);
            }
        };
    }

    public static final void doOnActualLayout(@NotNull View view, @NotNull final Function1 function1) {
        if (isActuallyLaidOut(view) && !view.isLayoutRequested()) {
            function1.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.util.ViewsKt$doOnActualLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    Function1.this.invoke(view2);
                }
            });
        }
    }

    public static final void doOnHierarchyLayout(@NotNull View view, @NotNull Function1 function1, @NotNull Function0 function0) {
        if (!isHierarchyLaidOut(view) || view.isLayoutRequested()) {
            View farthestLayoutCaller = farthestLayoutCaller(view);
            if (farthestLayoutCaller != null) {
                farthestLayoutCaller.addOnLayoutChangeListener(new ViewsKt$doOnNextHierarchyLayout$1(function1));
                Unit unit = Unit.INSTANCE;
            }
            function0.mo4828invoke();
            return;
        }
        function1.invoke(view);
    }

    public static final void doOnNextHierarchyLayout(@NotNull View view, @NotNull Function1 function1, @NotNull Function0 function0) {
        View farthestLayoutCaller = farthestLayoutCaller(view);
        if (farthestLayoutCaller != null) {
            farthestLayoutCaller.addOnLayoutChangeListener(new ViewsKt$doOnNextHierarchyLayout$1(function1));
            Unit unit = Unit.INSTANCE;
        }
        function0.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View farthestLayoutCaller(View view) {
        View view2 = null;
        while (view != null) {
            if (!isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }
}
