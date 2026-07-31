package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class u extends FrameLayout {
    public static final int e = 0;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a;

    @NotNull
    public final Function0 b;

    @NotNull
    public final Function0 c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j resource, @NotNull Function0 onDisplayed, @NotNull Function0 onClick) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.a = resource;
        this.b = onDisplayed;
        this.c = onClick;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_vast_icon_max_size);
        this.d = dimensionPixelSize;
        if (resource instanceof j.a) {
            View a = z.a(context, (j.a) resource);
            if (a != null) {
                addView(a, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        if (!(resource instanceof j.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ImageView a2 = A.a(context, (j.b) resource);
        a2.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a2.getLayoutParams().width, dimensionPixelSize), Math.min(a2.getLayoutParams().height, dimensionPixelSize)));
        a2.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.a(u.this, view);
            }
        });
        addView(a2);
    }

    public static final void a(u uVar, View view) {
        uVar.c.mo4828invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.mo4828invoke();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(a(i, this.d), a(i2, this.d));
    }

    public final int a(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i2), View.MeasureSpec.getMode(i) == 1073741824 ? Integer.MIN_VALUE : View.MeasureSpec.getMode(i));
    }
}
