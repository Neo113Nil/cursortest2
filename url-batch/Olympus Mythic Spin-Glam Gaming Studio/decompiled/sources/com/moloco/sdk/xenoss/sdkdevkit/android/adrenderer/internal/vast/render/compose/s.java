package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class s extends FrameLayout {
    public static final int l = 8;

    @NotNull
    public final Function0 a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;

    @NotNull
    public final LinearLayout h;

    @NotNull
    public final ImageView i;

    @NotNull
    public final Space j;

    @NotNull
    public final TextView k;

    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), s.this.e);
        }
    }

    public /* synthetic */ s(Context context, String str, String str2, int i, int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(context) : i, (i3 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(context) : i2, function0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.g), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setImageUri(@Nullable String str) {
        if (str == null || str.length() == 0) {
            this.i.setVisibility(8);
            this.j.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(this.i, str);
        }
    }

    public static final void a(s sVar, View view) {
        sVar.a.mo4828invoke();
    }

    public final void a() {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            setForeground(obtainStyledAttributes.getDrawable(0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull Context context, @NotNull String text, @Nullable String str, @ColorInt int i, @ColorInt int i2, @NotNull Function0 onCTAClick) {
        super(context);
        Drawable mutate;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onCTAClick, "onCTAClick");
        this.a = onCTAClick;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.moloco.sdk.R.dimen.moloco_vast_cta_inner_padding);
        this.b = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.moloco.sdk.R.dimen.moloco_vast_cta_image_size);
        this.c = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(com.moloco.sdk.R.dimen.moloco_vast_cta_stroke_width);
        this.d = dimensionPixelSize3;
        this.e = getResources().getDimension(com.moloco.sdk.R.dimen.moloco_vast_cta_corner_radius);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(com.moloco.sdk.R.dimen.moloco_vast_cta_min_width);
        this.f = dimensionPixelSize4;
        this.g = getResources().getDimensionPixelSize(com.moloco.sdk.R.dimen.moloco_vast_cta_max_width);
        setLayoutParams(new FrameLayout.LayoutParams(-2, getResources().getDimensionPixelSize(com.moloco.sdk.R.dimen.moloco_vast_cta_height)));
        setMinimumWidth(dimensionPixelSize4);
        Drawable drawable = ContextCompat.getDrawable(context, com.moloco.sdk.R.drawable.moloco_vast_cta_background);
        Drawable drawable2 = null;
        drawable2 = null;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(dimensionPixelSize3, i);
            }
            drawable2 = mutate;
        }
        setBackground(drawable2);
        a();
        setClickable(true);
        setFocusable(true);
        super.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.a(s.this, view);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        linearLayout.setLayoutTransition(layoutTransition);
        this.h = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
        imageView.setVisibility(8);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new a());
        this.i = imageView;
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, -1));
        space.setVisibility(8);
        this.j = space;
        TextView textView = new TextView(context);
        textView.setMaxLines(1);
        textView.setText(text);
        textView.setTextColor(i2);
        this.k = textView;
        linearLayout.addView(imageView);
        linearLayout.addView(space);
        linearLayout.addView(textView);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -1, 17));
        setImageUri(str);
    }
}
