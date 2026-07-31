package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.PromoCardView;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes8.dex */
public class NativeAdCardView extends LinearLayout implements PromoCardView {
    private static final int j = qi.c();
    private final MediaAdView a;
    private final TextView b;
    private final TextView c;
    private final Button d;
    private final qi e;
    private final RelativeLayout f;
    private final LinearLayout g;
    View.OnClickListener h;
    private final View.OnClickListener i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeAdCardView nativeAdCardView = NativeAdCardView.this;
            View.OnClickListener onClickListener = nativeAdCardView.h;
            if (onClickListener != null) {
                onClickListener.onClick(nativeAdCardView);
            }
        }
    }

    public NativeAdCardView(@NonNull Context context) {
        this(context, null);
    }

    private void a() {
        setOrientation(1);
        setPadding(0, this.e.b(8), 0, this.e.b(8));
        setClickable(true);
        qi.a(this, 0, NativeAdColor.BACKGROUND_TOUCH);
        qi.a(this.f, 0, NativeAdColor.BACKGROUND_TOUCH, -3355444, this.e.b(1), 0);
        Button button = this.d;
        int i = j;
        button.setId(i);
        this.d.setMaxEms(10);
        this.d.setLines(1);
        Button button2 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button2.setEllipsize(truncateAt);
        this.d.setPadding(this.e.b(10), 0, this.e.b(10), 0);
        this.d.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.e.b(30));
        layoutParams.addRule(11, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(this.e.b(12), this.e.b(12), this.e.b(12), this.e.b(12));
        this.d.setLayoutParams(layoutParams);
        this.d.setTransformationMethod(null);
        this.d.setStateListAnimator(null);
        this.d.setTextColor(NativeAdColor.STANDARD_BLUE);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setStroke(this.e.b(1), NativeAdColor.STANDARD_BLUE);
        gradientDrawable.setCornerRadius(this.e.b(1));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable2.setStroke(this.e.b(1), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(this.e.b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        this.d.setBackgroundDrawable(stateListDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(0, i);
        this.g.setLayoutParams(layoutParams2);
        this.g.setGravity(16);
        this.g.setOrientation(1);
        this.b.setTextColor(-16777216);
        this.b.setTextSize(2, 14.0f);
        this.b.setTypeface(null, 1);
        this.b.setLines(2);
        this.b.setEllipsize(truncateAt);
        this.b.setPadding(this.e.b(12), this.e.b(6), this.e.b(1), this.e.b(1));
        this.c.setTextColor(-16777216);
        this.c.setTextSize(2, 12.0f);
        this.c.setLines(1);
        this.c.setEllipsize(truncateAt);
        this.c.setPadding(this.e.b(12), this.e.b(1), this.e.b(1), this.e.b(12));
        addView(this.a);
        addView(this.f);
        this.f.addView(this.d);
        this.f.addView(this.g);
        this.g.addView(this.b);
        this.g.addView(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    @NonNull
    public MediaAdView getMediaAdView() {
        return this.a;
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    @NonNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x > ((float) this.a.getLeft()) && x < ((float) this.a.getRight()) && y > ((float) this.a.getTop()) && y < ((float) this.a.getBottom());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    public void setCard(@NonNull PromoCardView.Card card) {
        this.b.setText(card.getTitle());
        this.c.setText(card.getDescription());
        this.d.setText(card.getCtaButtonText());
        this.d.setContentDescription(card.getCtaButtonText());
    }

    @Override // com.my.target.nativeads.views.PromoCardView
    public void setCtaOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.h = onClickListener;
        super.setOnClickListener(onClickListener);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(this.i);
        }
    }

    public NativeAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new a();
        MediaAdView mediaAdView = new MediaAdView(context);
        this.a = mediaAdView;
        TextView textView = new TextView(context);
        this.b = textView;
        TextView textView2 = new TextView(context);
        this.c = textView2;
        this.f = new RelativeLayout(context);
        Button button = new Button(context);
        this.d = button;
        this.e = qi.g(context);
        this.g = new LinearLayout(context);
        qi.b(this, "card_view");
        qi.b(mediaAdView, "card_media_view");
        qi.b(textView, "card_title_text");
        qi.b(textView2, "card_description_text");
        qi.b(button, "card_cta_text");
        a();
    }
}
