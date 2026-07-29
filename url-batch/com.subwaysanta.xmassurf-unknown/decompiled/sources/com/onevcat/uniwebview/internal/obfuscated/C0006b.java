package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006b {
    public final E2 a;
    public final Activity b;
    public int c;
    public int d;
    public final FrameLayout.LayoutParams e;
    public float f;

    public C0006b(E2 e2, Activity activity) {
        this.a = e2;
        this.b = activity;
        e2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.b$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0006b.a(C0006b.this);
            }
        });
        ViewGroup.LayoutParams layoutParams = e2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        this.e = (FrameLayout.LayoutParams) layoutParams;
        this.f = e2.getRootView().getHeight();
    }

    public static final void a(C0006b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.b.getResources().getConfiguration().orientation;
        Rect rect = new Rect();
        this$0.a.getWindowVisibleDisplayFrame(rect);
        int coerceAtLeast = RangesKt.coerceAtLeast(0, rect.bottom - rect.top);
        if (i != this$0.d) {
            this$0.d = i;
            this$0.c = coerceAtLeast;
            return;
        }
        if (coerceAtLeast != this$0.c) {
            FrameLayout.LayoutParams layoutParams = this$0.e;
            float f = this$0.f;
            float f2 = this$0.f + AbstractC0030h.a(this$0.a).y;
            int height = this$0.a.getRootView().getHeight();
            this$0.a.getWindowVisibleDisplayFrame(new Rect());
            layoutParams.height = (int) (f - RangesKt.coerceAtLeast(0.0f, (f2 + (height - RangesKt.coerceAtLeast(0, r6.bottom - r6.top))) - this$0.a.getRootView().getHeight()));
            this$0.a.requestLayout();
            this$0.c = coerceAtLeast;
        }
    }
}
