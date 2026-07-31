package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.controller.g;
import io.bidmachine.rendering.internal.controller.h;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.Tag;
import io.bidmachine.util.ViewUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class f extends FrameLayout {
    private final Tag a;
    private final io.bidmachine.rendering.internal.controller.e b;
    private final d c;
    private c d;

    private final class b implements g {
        public b() {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(SystemComponent systemComponent) {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void b() {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void c() {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void d() {
            f.this.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void e() {
            f.this.c.c();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void f() {
            f.this.c.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(PrivacySheetParams privacySheetParams) {
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a() {
            f.this.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            f.this.a(brokenCreativeEvent);
        }
    }

    public interface c {
        void a();

        void a(BrokenCreativeEvent brokenCreativeEvent);

        void onLoaded();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AdPhaseParams adPhaseParams, io.bidmachine.rendering.internal.animation.b adAnimationController) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adAnimationController, "adAnimationController");
        Tag tag = new Tag("PlaceholderView");
        this.a = tag;
        adPhaseParams = adPhaseParams == null ? io.bidmachine.rendering.internal.g.a() : adPhaseParams;
        Tag tag2 = new Tag("PlaceholderViewAdPhaseController");
        this.b = new h(context, adPhaseParams, tag, tag2, new io.bidmachine.rendering.internal.state.c(tag2.toString(), io.bidmachine.rendering.internal.f.i.a()), new a(), adAnimationController);
        d dVar = new d(context);
        this.c = dVar;
        addView(dVar, ViewUtils.createMatchParentParams());
        dVar.a();
    }

    private final void d() {
        k.b(this.a, "notifyPlaceholderClosed", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.view.f$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                f.d(f.this);
            }
        });
    }

    public final void c() {
        k.b(this.a, "load", new Object[0]);
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void e() {
        k.b(this.a, "notifyPlaceholderLoaded", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.view.f$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                f.e(f.this);
            }
        });
    }

    public final void f() {
        this.b.a(true);
        this.b.a(false);
    }

    public final void g() {
        this.b.b(true);
    }

    @Nullable
    public final c getListener() {
        return this.d;
    }

    public final void h() {
        this.b.c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setListener(@Nullable c cVar) {
        this.d = cVar;
    }

    public final void b() {
        this.d = null;
        this.b.destroy();
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.view.f$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                f.c(f.this);
            }
        });
    }

    public final void a() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final BrokenCreativeEvent brokenCreativeEvent) {
        k.b(this.a, "notifyBrokenCreativeEvent", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.view.f$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                f.b(f.this, brokenCreativeEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c cVar = this$0.d;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c cVar = this$0.d;
        if (cVar != null) {
            cVar.onLoaded();
        }
    }

    private final class a implements io.bidmachine.rendering.internal.controller.f {
        public a() {
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(io.bidmachine.rendering.internal.controller.e adPhaseController) {
            Intrinsics.checkNotNullParameter(adPhaseController, "adPhaseController");
            k.b(f.this.a, "onAdPhaseLoaded (%s)", adPhaseController);
            f fVar = f.this;
            if (adPhaseController.a(fVar, fVar)) {
                adPhaseController.a(f.this.new b());
                f.this.e();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(io.bidmachine.rendering.internal.controller.e adPhaseController, Error error) {
            Intrinsics.checkNotNullParameter(adPhaseController, "adPhaseController");
            Intrinsics.checkNotNullParameter(error, "error");
            k.a(f.this.a, "onAdPhaseFailToLoad (%s) - %s", adPhaseController, error);
            adPhaseController.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f this$0, BrokenCreativeEvent brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
        c cVar = this$0.d;
        if (cVar != null) {
            cVar.a(brokenCreativeEvent);
        }
    }
}
