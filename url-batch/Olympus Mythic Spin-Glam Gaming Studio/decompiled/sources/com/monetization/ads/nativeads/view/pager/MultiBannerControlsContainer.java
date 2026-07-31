package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.nm0;
import yads.ox1;
import yads.sj0;
import yads.yg0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/monetization/ads/nativeads/view/pager/MultiBannerControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnClickLeftButtonListener", "(Landroid/view/View$OnClickListener;)V", "setOnClickRightButtonListener", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultiBannerControlsContainer extends FrameLayout {
    private final sj0 a;
    private final nm0 b;
    private boolean c;

    public MultiBannerControlsContainer(@NotNull Context context) {
        super(context);
        this.a = new sj0();
        this.b = new nm0();
        this.c = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnClickLeftButtonListener(@NotNull View.OnClickListener listener) {
        View findViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(@NotNull View.OnClickListener listener) {
        View findViewById = findViewById(R$id.right_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void a(ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new ox1(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MultiBannerControlsContainer.a(MultiBannerControlsContainer.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new sj0();
        this.b = new nm0();
        this.c = true;
    }

    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new sj0();
        this.b = new nm0();
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view instanceof ViewPager2) {
            boolean z = multiBannerControlsContainer.c;
            int i9 = i3 - i;
            int i10 = i4 - i2;
            yg0 yg0Var = multiBannerControlsContainer.b.a;
            boolean z2 = i9 >= yg0.a(view.getContext(), 144.0f) && i10 >= yg0.a(view.getContext(), 96.0f);
            multiBannerControlsContainer.c = z2;
            if (z2 != z) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new sj0();
        this.b = new nm0();
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2) {
        View findViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        View findViewById2 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView2 = findViewById2 instanceof ImageView ? (ImageView) findViewById2 : null;
        View findViewById3 = findViewById(R$id.dot_indicator);
        ImageView imageView3 = findViewById3 instanceof ImageView ? (ImageView) findViewById3 : null;
        if (!this.c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View findViewById4 = findViewById(R$id.dot_indicator);
        ImageView imageView4 = findViewById4 instanceof ImageView ? (ImageView) findViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            sj0 sj0Var = this.a;
            Context context = getContext();
            yg0 yg0Var = sj0Var.a;
            int a = yg0.a(context, 6.0f);
            int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
            int roundToInt2 = MathKt.roundToInt(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
            int roundToInt3 = MathKt.roundToInt(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
            int i3 = ((i2 + 1) * roundToInt) + (a * i2);
            float f = roundToInt3;
            RectF rectF = new RectF(0.0f, 0.0f, i3, f);
            float[] fArr = new float[8];
            for (int i4 = 0; i4 < 8; i4++) {
                fArr[i4] = f;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
            shapeDrawable.setIntrinsicWidth(i3);
            shapeDrawable.setIntrinsicHeight(roundToInt3);
            shapeDrawable.getPaint().setColor(-16777216);
            shapeDrawable.setAlpha(102);
            ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i2];
            for (int i5 = 0; i5 < i2; i5++) {
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.setIntrinsicHeight(a);
                shapeDrawable2.setIntrinsicWidth(a);
                shapeDrawable2.getPaint().setColor(-1);
                if (i5 != i) {
                    shapeDrawable2.setAlpha(102);
                }
                Unit unit = Unit.INSTANCE;
                shapeDrawableArr[i5] = shapeDrawable2;
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(shapeDrawable);
            spreadBuilder.addSpread(shapeDrawableArr);
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) spreadBuilder.toArray(new Drawable[spreadBuilder.size()]));
            int i6 = 0;
            while (i6 < i2) {
                int i7 = roundToInt + a;
                int i8 = (i7 * i6) + roundToInt;
                i6++;
                layerDrawable.setLayerInset(i6, i8, roundToInt2, i3 - (i7 * i6), roundToInt2);
                i3 = i3;
            }
            imageView4.setImageDrawable(layerDrawable);
        }
        View findViewById5 = findViewById(R$id.left_scroll_control_button);
        ImageView imageView5 = findViewById5 instanceof ImageView ? (ImageView) findViewById5 : null;
        View findViewById6 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView6 = findViewById6 instanceof ImageView ? (ImageView) findViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i == i2 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }
}
