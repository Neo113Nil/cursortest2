package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5073b extends FrameLayout {
    public static final int e = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r a;
    public final int b;

    @NotNull
    public final ImageButton c;

    @Nullable
    public Function1 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5073b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull Context context) {
        this(externalLinkHandler, context, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(C5073b c5073b, View view) {
        c5073b.a.a(C5072a.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @VisibleForTesting
    @NotNull
    public final ImageButton getAdButton() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float f = getResources().getDisplayMetrics().density;
            this.c.getLocationOnScreen(new int[2]);
            a.AbstractC1677a.c cVar = new a.AbstractC1677a.c(a.AbstractC1677a.c.EnumC1679a.i, new a.AbstractC1677a.f(r4[0] / f, r4[1] / f), new a.AbstractC1677a.g(this.c.getWidth() / f, this.c.getHeight() / f));
            Function1 function1 = this.d;
            if (function1 != null) {
                function1.invoke(cVar);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnButtonRenderedListener(@NotNull Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }

    public final void setPrivacyUrl(@NotNull final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5073b.a(C5073b.this, url, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5073b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(externalLinkHandler, context, attributeSet, 0, 8, null);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(C5073b c5073b, String str, View view) {
        c5073b.a.a(str);
    }

    public /* synthetic */ C5073b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVar, context, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5073b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = externalLinkHandler;
        this.b = 12;
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(c.a(12, context), c.a(12, context)));
        imageButton.setImageResource(R.drawable.info_badge);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5073b.a(C5073b.this, view);
            }
        });
        this.c = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }
}
