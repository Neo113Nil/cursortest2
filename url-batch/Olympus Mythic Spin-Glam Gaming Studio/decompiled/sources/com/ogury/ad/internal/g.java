package com.ogury.ad.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class g extends FrameLayout {
    public int a;
    public int b;
    public ra c;
    public n2 d;
    public rg e;
    public Function1 f;
    public Function1 g;
    public Function0 h;
    public Function0 i;
    public Function0 j;
    public Function0 k;
    public Function0 l;
    public boolean m;
    public boolean n;
    public rg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.c = new ra();
        this.d = p2.e;
        setLayoutParams(new FrameLayout.LayoutParams(600, 600));
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ogury.ad.internal.g$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                g.a(g.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public static final void a(g this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f;
        if (function1 != null) {
            function1.invoke(this$0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View child, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(child instanceof WebView) || getChildCount() <= 0) {
            super.addView(child, params);
        } else {
            addView(child, getChildCount() - 1, params);
        }
    }

    public final void b() {
        setX(0.0f);
        setY(0.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        setLayoutParams(layoutParams2);
    }

    public final void c() {
        rg rgVar;
        setX(0.0f);
        setY(0.0f);
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup == null) {
            return;
        }
        if (this.n) {
            ra raVar = this.c;
            rg rgVar2 = this.o;
            raVar.getClass();
            if (rgVar2 != null) {
                int i = rgVar2.d;
                int i2 = rgVar2.e;
                Rect rect = new Rect(i, i2, rgVar2.b + i, rgVar2.c + i2);
                raVar.a.getClass();
                Rect a = wi.a(parentAsViewGroup);
                rect.offset(a.left, a.top);
                rgVar = raVar.a(parentAsViewGroup, rect);
                if (rgVar != null) {
                    rgVar.f = rgVar2.f;
                }
            } else {
                rgVar = null;
            }
            this.e = rgVar;
        } else {
            this.e = this.o;
        }
        setContainerWidth(parentAsViewGroup.getMeasuredWidth());
        setContainerHeight(parentAsViewGroup.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Ogury|SafeDK: Execution> Lcom/ogury/ad/internal/g;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch("io.presage", this, motionEvent);
        return safedk_g_dispatchTouchEvent_2b5b3eaaa68ca8677ec179b43f12c27c(motionEvent);
    }

    @Nullable
    public final Function1 getAdLayoutChangeListener() {
        return this.f;
    }

    public int getContainerHeight() {
        return this.a;
    }

    public int getContainerWidth() {
        return this.b;
    }

    public final boolean getContainsOverlayAd() {
        return this.n;
    }

    @Nullable
    public final Function0 getOnAttachToWindowListener() {
        return this.j;
    }

    @Nullable
    public final Function0 getOnDetachFromWindowListener() {
        return this.k;
    }

    @Nullable
    public final Function1 getOnMouseUpListener() {
        return this.g;
    }

    @Nullable
    public final Function0 getOnOverlayPositionChanged() {
        return this.l;
    }

    @Nullable
    public final Function0 getOnWindowGainFocusListener() {
        return this.h;
    }

    @Nullable
    public final Function0 getOnWindowLoseFocusListener() {
        return this.i;
    }

    @Nullable
    public final ViewGroup getParentAsViewGroup() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Nullable
    public final rg getResizeProps() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (this.n) {
            r8.b = true;
        }
        super.onAttachedToWindow();
        Function0 function0 = this.j;
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.m = false;
        if (this.n) {
            r8.b = false;
        }
        super.onDetachedFromWindow();
        Function0 function0 = this.k;
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup container = getParentAsViewGroup();
        if (container == null) {
            return;
        }
        if (!this.m && this.n) {
            if (getContainerHeight() != container.getMeasuredHeight() || getContainerWidth() != container.getMeasuredWidth()) {
                ra raVar = this.c;
                raVar.getClass();
                Intrinsics.checkNotNullParameter(this, "adLayout");
                Intrinsics.checkNotNullParameter(container, "container");
                raVar.a.getClass();
                Rect a = wi.a((ViewGroup) this);
                setOnMouseUpListener(new qa(raVar));
                a(raVar.a(container, a));
            }
            Function0 function0 = this.l;
            if (function0 != null) {
                function0.mo4828invoke();
            }
        }
        setContainerWidth(container.getMeasuredWidth());
        setContainerHeight(container.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Function0 function0 = this.h;
            if (function0 != null) {
                function0.mo4828invoke();
                return;
            }
            return;
        }
        Function0 function02 = this.i;
        if (function02 != null) {
            function02.mo4828invoke();
        }
    }

    public boolean safedk_g_dispatchTouchEvent_2b5b3eaaa68ca8677ec179b43f12c27c(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.d.a(ev)) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void setAdLayoutChangeListener(@Nullable Function1 function1) {
        this.f = function1;
    }

    public void setContainerHeight(int i) {
        this.a = i;
    }

    public void setContainerWidth(int i) {
        this.b = i;
    }

    public final void setContainsOverlayAd(boolean z) {
        this.n = z;
    }

    public final void setDisplayedInFullScreen(boolean z) {
        this.m = z;
    }

    public final void setDragHandler(@NotNull n2 dragHandler) {
        Intrinsics.checkNotNullParameter(dragHandler, "dragHandler");
        this.d = dragHandler;
    }

    public final void setInitialSize(@NotNull rg initialSize) {
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        this.o = initialSize;
        setX(0.0f);
        setY(0.0f);
        a(initialSize);
    }

    public final void setInitialSizeWithoutResizing(@NotNull rg initialSize) {
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        this.o = initialSize;
    }

    public final void setOnAttachToWindowListener(@Nullable Function0 function0) {
        this.j = function0;
    }

    public final void setOnDetachFromWindowListener(@Nullable Function0 function0) {
        this.k = function0;
    }

    public final void setOnMouseUpListener(@Nullable Function1 function1) {
        this.g = function1;
    }

    public final void setOnOverlayPositionChanged(@Nullable Function0 function0) {
        this.l = function0;
    }

    public final void setOnWindowGainFocusListener(@Nullable Function0 function0) {
        this.h = function0;
    }

    public final void setOnWindowLoseFocusListener(@Nullable Function0 function0) {
        this.i = function0;
    }

    public final void setOverlayAdjustmentManager(@NotNull ra overlayAdjustmentManager) {
        Intrinsics.checkNotNullParameter(overlayAdjustmentManager, "overlayAdjustmentManager");
        this.c = overlayAdjustmentManager;
    }

    public final void setResizeProps(@Nullable rg rgVar) {
        this.e = rgVar;
    }

    public final void setupDrag(boolean z) {
        Intrinsics.checkNotNullParameter(this, "adLayout");
        this.d = z ? new p2(this) : p2.e;
    }

    public final void a(rg rgVar) {
        if (rgVar == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        setX(rgVar.d);
        setY(rgVar.e);
        layoutParams2.width = rgVar.b;
        layoutParams2.height = rgVar.c;
        layoutParams2.gravity = rgVar.f;
        setLayoutParams(layoutParams2);
    }

    public final boolean a() {
        Activity a = ii.a(this);
        if (a == null) {
            return true;
        }
        return a.hasWindowFocus();
    }
}
