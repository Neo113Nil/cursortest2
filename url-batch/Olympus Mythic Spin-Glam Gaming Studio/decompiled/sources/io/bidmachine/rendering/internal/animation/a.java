package io.bidmachine.rendering.internal.animation;

import android.view.View;
import android.view.ViewPropertyAnimator;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.util.Tag;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class a {
    private final Tag a;
    private final h b;
    private final f c;
    private ViewPropertyAnimator d;
    private final AtomicBoolean e;

    public a(Tag tag, h animatorFactory, f valuesCalculator) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(animatorFactory, "animatorFactory");
        Intrinsics.checkNotNullParameter(valuesCalculator, "valuesCalculator");
        this.a = tag;
        this.b = animatorFactory;
        this.c = valuesCalculator;
        this.e = new AtomicBoolean(false);
    }

    public final void a(View view, AnimationEventType eventType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        e b = this.c.b(view, eventType);
        a(view, b);
        io.bidmachine.rendering.internal.k.b(this.a, "Prepare animation for event: " + eventType + "; initial values: " + b, new Object[0]);
    }

    public final boolean b() {
        return this.e.get();
    }

    public final void a(View view, AnimationEventType eventType, Runnable runnable, final Runnable runnable2, boolean z) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (runnable != null) {
            runnable.run();
        }
        if (view == null) {
            io.bidmachine.rendering.internal.k.b(this.a, "Animation not started for event: " + eventType + "; view is null", new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        if (!b() && !z) {
            e a = this.c.a(view, eventType);
            ViewPropertyAnimator a2 = this.b.a(view, eventType, a);
            if (a2 == null) {
                a(view, a);
                io.bidmachine.rendering.internal.k.b(this.a, "Apply values without animation for event: " + eventType + "; target values: " + a, new Object[0]);
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            }
            io.bidmachine.rendering.internal.k.b(this.a, "Start animation for event: " + eventType + "; target values: " + a, new Object[0]);
            this.e.set(true);
            ViewPropertyAnimator withEndAction = a2.withEndAction(new Runnable() { // from class: io.bidmachine.rendering.internal.animation.a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, runnable2);
                }
            });
            withEndAction.start();
            this.d = withEndAction;
            return;
        }
        io.bidmachine.rendering.internal.k.b(this.a, "Animation is already running for event: " + eventType, new Object[0]);
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.set(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a() {
        io.bidmachine.rendering.internal.k.b(this.a, "Cancel animation", new Object[0]);
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
        }
        this.d = null;
        this.e.set(false);
    }

    private final void a(View view, e eVar) {
        view.setAlpha(eVar.a());
        view.setTranslationX(eVar.b());
        view.setTranslationY(eVar.c());
    }
}
