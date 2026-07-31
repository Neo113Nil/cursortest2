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
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.factories.NativeViewsFactory;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public class NativeAdView extends ViewGroup {
    private final TextView a;
    private final TextView b;
    private final IconAdView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final StarsRatingView g;
    private final TextView h;
    private final Button i;
    private final TextView j;
    private final LinearLayout k;
    private final LinearLayout l;
    private final LinearLayout m;
    private final NativeAdViewBinder n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private MediaAdView v;
    private PromoCardRecyclerView w;
    private PromoCardRecyclerView.PromoCardAdapter x;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends PromoCardRecyclerView.PromoCardAdapter {
        a() {
        }

        @Override // com.my.target.nativeads.views.PromoCardRecyclerView.PromoCardAdapter
        public PromoCardView getPromoCardView() {
            return NativeViewsFactory.getNativeAdCardView(NativeAdView.this.getContext());
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class b implements NativeAdViewBinder {
        private final NativeAdView a;

        public b(NativeAdView nativeAdView) {
            this.a = nativeAdView;
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getAdChoicesView() {
            return null;
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getAdvertisingView() {
            return this.a.getAdvertisingTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getAgeRestrictionView() {
            return this.a.getAgeRestrictionTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getDescriptionView() {
            return this.a.getDescriptionTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getDisclaimerView() {
            return this.a.getDisclaimerTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getDomainOrCategoryView() {
            return this.a.getDomainOrCategoryTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public IconAdView getIconView() {
            return this.a.getIconView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public MediaAdView getMediaAdView() {
            return this.a.getMediaAdView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public PromoCardRecyclerView getPromoCardRecyclerView() {
            return this.a.getPromoCardRecyclerView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public ViewGroup getRootAdView() {
            return this.a;
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getTitleView() {
            return this.a.getTitleTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public View getVotesView() {
            return this.a.getVotesTextView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public Button getCtaView() {
            return this.a.getCtaButtonView();
        }

        @Override // com.my.target.nativeads.NativeAdViewBinder
        public StarsRatingView getStarsRatingView() {
            return this.a.getStarsRatingView();
        }
    }

    public NativeAdView(@NonNull Context context) {
        this(context, null);
    }

    private PromoCardRecyclerView.PromoCardAdapter a(List list) {
        if (this.x == null) {
            this.x = new a();
        }
        this.x.setCards(list);
        return this.x;
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
        return this.i;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.f;
    }

    @NonNull
    public TextView getDisclaimerTextView() {
        return this.j;
    }

    @NonNull
    public TextView getDomainOrCategoryTextView() {
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

    @Nullable
    public MediaAdView getMediaAdView() {
        return this.v;
    }

    @NonNull
    public NativeAdViewBinder getNativeAdViewBinder() {
        return this.n;
    }

    @Nullable
    public PromoCardRecyclerView getPromoCardRecyclerView() {
        return this.w;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.g;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.d;
    }

    @NonNull
    public TextView getVotesTextView() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        PromoCardRecyclerView promoCardRecyclerView;
        int paddingLeft = getPaddingLeft();
        qi.c(this.l, getPaddingTop(), paddingLeft);
        int a2 = qi.a(this.c.getMeasuredHeight(), this.k.getMeasuredHeight());
        int bottom = this.l.getBottom() + this.t;
        qi.c(this.c, ((a2 - this.c.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        qi.c(this.k, ((a2 - this.k.getMeasuredHeight()) / 2) + bottom, qi.a(this.c.getRight() + this.t, paddingLeft));
        int i5 = bottom + a2;
        int i6 = this.p + i5;
        if (this.u && (promoCardRecyclerView = this.w) != null) {
            qi.c(promoCardRecyclerView, i5 + this.t, paddingLeft);
            return;
        }
        qi.c(this.v, i6, paddingLeft);
        int a3 = qi.a(this.f.getMeasuredHeight(), this.i.getMeasuredHeight());
        MediaAdView mediaAdView = this.v;
        if (mediaAdView != null) {
            i6 = mediaAdView.getBottom();
        }
        int paddingBottom = i6 + getPaddingBottom();
        int measuredHeight = ((a3 - this.f.getMeasuredHeight()) / 2) + paddingBottom;
        int measuredHeight2 = ((a3 - this.i.getMeasuredHeight()) / 2) + paddingBottom;
        qi.c(this.f, measuredHeight, paddingLeft);
        qi.b(this.i, measuredHeight2, getMeasuredWidth() - getPaddingRight());
        qi.c(this.j, paddingBottom + a3 + this.p, paddingLeft);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        PromoCardRecyclerView promoCardRecyclerView;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        qi.a(this.l, paddingLeft - this.r, paddingTop, Integer.MIN_VALUE);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(this.q, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.q, Integer.MIN_VALUE));
        qi.a(this.k, (paddingLeft - this.c.getMeasuredWidth()) - this.t, (paddingTop - this.l.getMeasuredHeight()) - this.p, Integer.MIN_VALUE);
        if (!this.u || (promoCardRecyclerView = this.w) == null) {
            MediaAdView mediaAdView = this.v;
            if (mediaAdView != null) {
                mediaAdView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
                this.i.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.o, 1073741824));
                qi.a(this.f, (paddingLeft - this.i.getMeasuredWidth()) - this.t, paddingTop, Integer.MIN_VALUE);
                qi.a(this.j, paddingLeft, paddingTop, Integer.MIN_VALUE);
                size2 = this.l.getMeasuredHeight() + this.t + qi.a(this.k.getMeasuredHeight(), this.c.getMeasuredHeight()) + this.v.getMeasuredHeight() + this.p + getPaddingBottom() + qi.a(this.f.getMeasuredHeight(), this.i.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom();
                int measuredHeight = this.j.getVisibility() == 0 ? this.j.getMeasuredHeight() : 0;
                if (measuredHeight > 0) {
                    i3 = size2 + measuredHeight;
                    i4 = this.p;
                }
            }
            setMeasuredDimension(size, size2);
        }
        promoCardRecyclerView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE));
        i3 = this.l.getMeasuredHeight() + this.t + qi.a(this.k.getMeasuredHeight(), this.c.getMeasuredHeight()) + this.w.getMeasuredHeight() + getPaddingTop();
        i4 = getPaddingBottom();
        size2 = i3 + i4;
        setMeasuredDimension(size, size2);
    }

    public void setupView(@Nullable NativePromoBanner nativePromoBanner) {
        if (nativePromoBanner == null) {
            return;
        }
        mi.a("NativeAdView: Setup banner");
        if (nativePromoBanner.getIcon() != null) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (!this.u || this.w == null) {
            a(nativePromoBanner.getCtaText(), this.i);
        } else {
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.w.setPromoCardAdapter(a(nativePromoBanner.getCards()));
        }
        String navigationType = nativePromoBanner.getNavigationType();
        navigationType.getClass();
        switch (navigationType) {
            case "web":
            case "webform":
                if (!this.u) {
                    this.g.setVisibility(8);
                    this.h.setVisibility(8);
                    a(nativePromoBanner.getDomain(), this.e);
                    break;
                }
                break;
            case "store":
                String category = nativePromoBanner.getCategory();
                String subCategory = nativePromoBanner.getSubCategory();
                String str = "";
                if (!TextUtils.isEmpty(category)) {
                    str = "" + category;
                    if (!TextUtils.isEmpty(subCategory)) {
                        str = str + ", ";
                    }
                }
                if (!TextUtils.isEmpty(subCategory)) {
                    str = str + subCategory;
                }
                qi.b(this.e, "category_text");
                a(str, this.e);
                if (nativePromoBanner.getRating() > 0.0f && nativePromoBanner.getRating() <= 5.0f) {
                    this.g.setVisibility(0);
                    if (nativePromoBanner.getVotes() > 0) {
                        a(String.valueOf(nativePromoBanner.getVotes()), this.h);
                    } else {
                        this.h.setVisibility(8);
                    }
                    this.g.setRating(nativePromoBanner.getRating());
                    break;
                }
                break;
        }
        a(nativePromoBanner.getDisclaimer(), this.j);
        a(nativePromoBanner.getTitle(), this.d);
        a(nativePromoBanner.getDescription(), this.f);
        a(nativePromoBanner.getAdvertisingLabel(), this.b);
        a(nativePromoBanner.getAgeRestrictions(), this.a);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, -1.0f, -1);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, boolean z, float f, int i2) {
        super(context, attributeSet, i);
        this.u = z;
        k1 k1Var = new k1(context);
        this.a = k1Var;
        TextView textView = new TextView(context);
        this.b = textView;
        IconAdView iconView = NativeViewsFactory.getIconView(context);
        this.c = iconView;
        TextView textView2 = new TextView(context);
        this.d = textView2;
        TextView textView3 = new TextView(context);
        this.e = textView3;
        TextView textView4 = new TextView(context);
        this.f = textView4;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.g = starsRatingView;
        TextView textView5 = new TextView(context);
        this.h = textView5;
        TextView textView6 = new TextView(context);
        this.j = textView6;
        Button button = new Button(context);
        this.i = button;
        qi g = qi.g(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.k = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.l = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.m = linearLayout3;
        setId(R.id.nativeads_ad_view);
        textView.setId(R.id.nativeads_advertising);
        textView2.setId(R.id.nativeads_title);
        textView4.setId(R.id.nativeads_description);
        starsRatingView.setId(R.id.nativeads_rating);
        textView3.setId(R.id.nativeads_domain);
        textView6.setId(R.id.nativeads_disclaimer);
        button.setId(R.id.nativeads_call_to_action);
        iconView.setId(R.id.nativeads_icon);
        k1Var.setId(R.id.nativeads_age_restrictions);
        textView5.setId(R.id.nativeads_votes);
        starsRatingView.setId(R.id.nativeads_rating);
        qi.b(textView5, "votes_text");
        int b2 = g.b(4);
        setPadding(b2, b2, b2, g.b(8));
        this.p = g.b(8);
        this.r = g.b(9);
        this.q = g.b(54);
        this.s = g.b(12);
        int b3 = g.b(10);
        this.o = g.b(40);
        this.t = g.b(4);
        k1Var.setId(R.id.nativeads_age_restrictions);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -13421773);
        int b4 = g.b(2);
        k1Var.setBackgroundDrawable(gradientDrawable);
        k1Var.setGravity(17);
        k1Var.setPadding(b4, 0, 0, 0);
        button.setPadding(b3, 0, b3, 0);
        button.setMaxEms(8);
        button.setLines(1);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setTransformationMethod(null);
        qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable2.setStroke(g.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(g.b(1));
        GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable3.setStroke(g.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable3.setCornerRadius(g.b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable3);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
        button.setBackgroundDrawable(stateListDrawable);
        setClickable(true);
        if (z) {
            PromoCardRecyclerView promoCardRecyclerView = NativeViewsFactory.getPromoCardRecyclerView(f, i2, getContext());
            this.w = promoCardRecyclerView;
            promoCardRecyclerView.setId(R.id.nativeads_media_view);
            addView(this.w);
        } else {
            MediaAdView mediaAdView = NativeViewsFactory.getMediaAdView(getContext());
            this.v = mediaAdView;
            mediaAdView.setId(R.id.nativeads_media_view);
            addView(this.v);
        }
        addView(iconView);
        addView(button);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout2.addView(k1Var);
        linearLayout2.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        linearLayout.addView(linearLayout3);
        linearLayout3.addView(starsRatingView);
        linearLayout3.addView(textView5);
        addView(textView4);
        addView(textView6);
        a();
        this.n = new b(this);
        kg.e();
    }

    private void a() {
        this.a.setTextColor(NativeAdColor.STANDARD_GREY);
        this.a.setBackgroundColor(0);
        this.a.setLines(1);
        TextView textView = this.a;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.a.setTextSize(2, 10.0f);
        this.b.setTextSize(2, 12.0f);
        this.b.setTextColor(NativeAdColor.STANDARD_GREY);
        this.b.setLines(1);
        this.b.setEllipsize(truncateAt);
        this.b.setPadding(this.r, 0, 0, 0);
        this.d.setTextColor(-16777216);
        this.d.setTextSize(2, 16.0f);
        this.d.setTypeface(null, 1);
        this.d.setLines(1);
        this.d.setEllipsize(truncateAt);
        this.e.setTextColor(NativeAdColor.STANDARD_GREY);
        this.e.setTextSize(2, 14.0f);
        this.e.setLines(1);
        this.e.setIncludeFontPadding(false);
        this.e.setEllipsize(truncateAt);
        this.f.setTextColor(-16777216);
        this.f.setTextSize(2, 15.0f);
        this.f.setMaxLines(3);
        this.f.setEllipsize(truncateAt);
        this.h.setTextColor(NativeAdColor.STANDARD_GREY);
        this.h.setTextSize(2, 12.0f);
        this.h.setLines(1);
        this.h.setEllipsize(truncateAt);
        this.h.setPadding(this.t, 0, 0, 0);
        this.j.setTextColor(NativeAdColor.STANDARD_GREY);
        this.j.setTextSize(2, 12.0f);
        this.j.setMaxLines(2);
        this.j.setEllipsize(truncateAt);
        this.i.setTextColor(NativeAdColor.STANDARD_BLUE);
        this.i.setLines(1);
        this.i.setTextSize(2, 16.0f);
        this.i.setEllipsize(truncateAt);
        this.g.setStarSize(this.s);
        this.k.setOrientation(1);
        this.l.setOrientation(0);
        this.l.setGravity(16);
        this.m.setOrientation(0);
        this.m.setGravity(16);
    }

    private void a(String str, TextView textView) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
