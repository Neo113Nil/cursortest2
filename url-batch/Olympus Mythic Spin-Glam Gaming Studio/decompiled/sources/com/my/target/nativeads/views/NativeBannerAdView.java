package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.R;
import com.my.target.common.views.StarsRatingView;
import com.my.target.k1;
import com.my.target.kg;
import com.my.target.mi;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public class NativeBannerAdView extends ViewGroup {
    private final TextView a;
    private final TextView b;
    private final IconAdView c;
    private final TextView d;
    private final TextView e;
    private final StarsRatingView f;
    private final TextView g;
    private final Button h;
    private final TextView i;
    private final LinearLayout j;
    private final LinearLayout k;
    private final NativeBannerAdViewBinder l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a implements NativeBannerAdViewBinder {
        private final NativeBannerAdView a;

        public a(NativeBannerAdView nativeBannerAdView) {
            this.a = nativeBannerAdView;
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getAdChoicesView() {
            return null;
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getAdvertisingView() {
            return this.a.getAdvertisingTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getAgeRestrictionView() {
            return this.a.getAgeRestrictionTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getDisclaimerView() {
            return this.a.getDisclaimerTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getDomainView() {
            return this.a.getDomainTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public IconAdView getIconView() {
            return this.a.getIconView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public ViewGroup getRootAdBannerView() {
            return this.a;
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getTitleView() {
            return this.a.getTitleTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public View getVotesView() {
            return this.a.getVotesTextView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public Button getCtaView() {
            return this.a.getCtaButtonView();
        }

        @Override // com.my.target.nativeads.NativeBannerAdViewBinder
        public StarsRatingView getStarsRatingView() {
            return this.a.getStarsRatingView();
        }
    }

    public NativeBannerAdView(@NonNull Context context) {
        this(context, null);
    }

    private void a(String str, TextView textView) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public TextView getAdvertisingTextView() {
        return this.b;
    }

    @NonNull
    public TextView getAgeRestrictionTextView() {
        return this.a;
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.h;
    }

    @NonNull
    public TextView getDisclaimerTextView() {
        return this.i;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.e;
    }

    @NonNull
    @Deprecated
    public IconAdView getIconImageView() {
        return this.c;
    }

    @NonNull
    public IconAdView getIconView() {
        return this.c;
    }

    @NonNull
    public NativeBannerAdViewBinder getNativeBannerAdViewBinder() {
        return this.l;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.f;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.d;
    }

    @NonNull
    public TextView getVotesTextView() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        qi.c(this.k, paddingTop, paddingLeft);
        int a2 = qi.a(this.c.getMeasuredHeight(), this.j.getMeasuredHeight(), this.h.getMeasuredHeight());
        int bottom = this.k.getBottom() + this.o;
        int a3 = ((qi.a(this.c.getMeasuredHeight(), this.j.getMeasuredHeight()) - this.h.getMeasuredHeight()) / 2) + this.k.getMeasuredHeight();
        int i5 = this.r;
        if (a3 < i5) {
            bottom = paddingTop + i5;
        }
        qi.c(this.c, ((a2 - this.c.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        qi.b(this.h, ((a2 - this.h.getMeasuredHeight()) / 2) + bottom, getMeasuredWidth() - getPaddingRight());
        qi.c(this.j, bottom + ((a2 - this.j.getMeasuredHeight()) / 2), qi.a(this.c.getRight() + this.o, paddingLeft));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        qi.a(this.k, paddingLeft - this.q, paddingTop, Integer.MIN_VALUE);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(this.p, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.p, Integer.MIN_VALUE));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.m, 1073741824));
        qi.a(this.j, ((paddingLeft - this.c.getMeasuredWidth()) - this.h.getMeasuredWidth()) - (this.o * 2), (paddingTop - this.k.getMeasuredHeight()) - this.n, Integer.MIN_VALUE);
        int measuredHeight = this.k.getMeasuredHeight() + this.o;
        int a2 = ((qi.a(this.c.getMeasuredHeight(), this.j.getMeasuredHeight()) - this.h.getMeasuredHeight()) / 2) + this.k.getMeasuredHeight();
        int i3 = this.r;
        if (a2 < i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(size, measuredHeight + qi.a(this.j.getMeasuredHeight(), this.c.getMeasuredHeight(), this.h.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom());
    }

    public void setupView(@Nullable NativeBanner nativeBanner) {
        if (nativeBanner == null) {
            return;
        }
        mi.a("NativeBannerAdView: Setup banner");
        if (nativeBanner.getIcon() != null) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        String navigationType = nativeBanner.getNavigationType();
        navigationType.getClass();
        switch (navigationType) {
            case "web":
            case "webform":
                a(nativeBanner.getDomain(), this.e);
                this.f.setVisibility(8);
                this.g.setVisibility(8);
                break;
            case "store":
                if (nativeBanner.getRating() > 0.0f && nativeBanner.getRating() <= 5.0f) {
                    this.f.setRating(nativeBanner.getRating());
                    this.f.setVisibility(0);
                    a(String.valueOf(nativeBanner.getVotes()), this.g);
                    this.e.setVisibility(8);
                    if (nativeBanner.getVotes() > 0) {
                        this.g.setVisibility(0);
                    } else {
                        this.g.setVisibility(8);
                    }
                    qi.b(this.g, "votes_text");
                    break;
                } else {
                    this.f.setVisibility(8);
                    break;
                }
                break;
        }
        a(nativeBanner.getTitle(), this.d);
        a(nativeBanner.getAdvertisingLabel(), this.b);
        a(nativeBanner.getCtaText(), this.h);
        a(nativeBanner.getAgeRestrictions(), this.a);
        a(nativeBanner.getDisclaimer(), this.i);
    }

    public NativeBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k1 k1Var = new k1(context);
        this.a = k1Var;
        TextView textView = new TextView(context);
        this.b = textView;
        IconAdView iconAdView = new IconAdView(context);
        this.c = iconAdView;
        TextView textView2 = new TextView(context);
        this.d = textView2;
        TextView textView3 = new TextView(context);
        this.e = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f = starsRatingView;
        TextView textView4 = new TextView(context);
        this.g = textView4;
        TextView textView5 = new TextView(context);
        this.i = textView5;
        Button button = new Button(context);
        this.h = button;
        LinearLayout linearLayout = new LinearLayout(context);
        this.j = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.k = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        qi g = qi.g(context);
        setId(R.id.nativeads_ad_view);
        k1Var.setId(R.id.nativeads_age_restrictions);
        textView.setId(R.id.nativeads_advertising);
        iconAdView.setId(R.id.nativeads_icon);
        textView2.setId(R.id.nativeads_title);
        textView3.setId(R.id.nativeads_domain);
        starsRatingView.setId(R.id.nativeads_rating);
        textView4.setId(R.id.nativeads_votes);
        textView5.setId(R.id.nativeads_disclaimer);
        button.setId(R.id.nativeads_call_to_action);
        qi.b(textView4, "votes_text");
        int b = g.b(4);
        setPadding(b, b, b, b);
        this.n = g.b(2);
        int b2 = g.b(4);
        this.q = b2;
        this.p = g.b(54);
        this.r = g.b(20);
        int b3 = g.b(12);
        int b4 = g.b(10);
        this.m = g.b(40);
        this.o = g.b(4);
        button.setPadding(b4, 0, b4, 0);
        button.setTransformationMethod(null);
        button.setMaxEms(8);
        button.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setTextColor(NativeAdColor.STANDARD_BLUE);
        button.setTextSize(2, 16.0f);
        qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setStroke(g.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable.setCornerRadius(g.b(2));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable2.setStroke(g.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(g.b(2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        button.setBackground(stateListDrawable);
        setClickable(true);
        k1Var.setTextColor(NativeAdColor.STANDARD_GREY);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        gradientDrawable3.setStroke(1, -13421773);
        int b5 = g.b(2);
        k1Var.setBackgroundDrawable(gradientDrawable3);
        k1Var.setGravity(17);
        k1Var.setPadding(b5, 0, 0, 0);
        k1Var.setBackgroundColor(0);
        k1Var.setMaxEms(10);
        k1Var.setLines(1);
        k1Var.setTextSize(2, 10.0f);
        textView.setTextSize(2, 10.0f);
        textView.setTextColor(NativeAdColor.STANDARD_GREY);
        textView.setLines(1);
        textView.setEllipsize(truncateAt);
        textView.setPadding(b2, 0, 0, 0);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(2, 16.0f);
        textView2.setTypeface(null, 1);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView3.setTextColor(NativeAdColor.STANDARD_GREY);
        textView3.setTextSize(2, 14.0f);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setIncludeFontPadding(false);
        textView4.setTextColor(NativeAdColor.STANDARD_GREY);
        textView4.setTextSize(2, 12.0f);
        textView4.setLines(1);
        textView4.setEllipsize(truncateAt);
        textView4.setPadding(g.b(4), 0, 0, 0);
        textView5.setTextColor(NativeAdColor.STANDARD_GREY);
        textView5.setTextSize(2, 12.0f);
        textView5.setMaxLines(2);
        textView5.setEllipsize(truncateAt);
        starsRatingView.setStarSize(b3);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        addView(iconAdView);
        addView(button);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout2.addView(k1Var);
        linearLayout2.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(linearLayout3);
        linearLayout.addView(textView5);
        linearLayout3.addView(textView3);
        linearLayout3.addView(starsRatingView);
        linearLayout3.addView(textView4);
        this.l = new a(this);
        kg.f();
    }
}
