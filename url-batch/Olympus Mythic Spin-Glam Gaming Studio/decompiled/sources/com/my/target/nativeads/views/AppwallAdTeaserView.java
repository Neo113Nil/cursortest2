package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.fh;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Locale;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class AppwallAdTeaserView extends RelativeLayout {
    private final qi a;
    private final int b;
    private final fh c;
    private final fh d;
    private final fh e;
    private final TextView f;
    private final LinearLayout g;
    private final ShapeDrawable h;
    private final TextView i;
    private final StarsRatingView j;
    private final TextView k;
    private final fh l;
    private final TextView m;
    private final fh n;
    private NativeAppwallBanner o;
    private boolean p;

    public AppwallAdTeaserView(@NonNull Context context) {
        super(context);
        this.b = Color.rgb(36, 36, 36);
        this.p = false;
        this.e = new fh(context);
        this.g = new LinearLayout(context);
        this.f = new TextView(context);
        this.n = new fh(context);
        this.d = new fh(context);
        this.l = new fh(context);
        this.m = new TextView(context);
        this.i = new TextView(context);
        this.j = new StarsRatingView(context);
        this.k = new TextView(context);
        this.c = new fh(context);
        qi g = qi.g(context);
        this.a = g;
        float b = g.b(6);
        this.h = new ShapeDrawable(new RoundRectShape(new float[]{b, b, b, b, b, b, b, b}, null, null));
        a();
    }

    private void a() {
        int b = this.a.b(18);
        int b2 = this.a.b(14);
        int b3 = this.a.b(53);
        int c = qi.c();
        int c2 = qi.c();
        int c3 = qi.c();
        setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b3 + b2 + b2, b3 + b + b);
        this.e.setPadding(b2, b, b2, b);
        addView(this.e, layoutParams);
        int b4 = this.a.b(20);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b4, b4);
        layoutParams2.leftMargin = this.a.b(57);
        layoutParams2.topMargin = this.a.b(10);
        this.c.setLayoutParams(layoutParams2);
        addView(this.c);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(b3, b3);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = b2;
        layoutParams3.topMargin = b;
        this.g.setBackgroundDrawable(this.h);
        this.g.setOrientation(1);
        addView(this.g, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = this.f;
        Typeface typeface = Typeface.SANS_SERIF;
        textView.setTypeface(typeface);
        this.f.setPadding(0, this.a.b(10), 0, this.a.b(2));
        this.f.setTextSize(2, 13.0f);
        this.f.setGravity(49);
        this.g.addView(this.f, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.a.b(20), this.a.b(20));
        layoutParams5.gravity = 1;
        this.g.addView(this.n, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(this.a.b(19), -2);
        layoutParams6.addRule(15);
        layoutParams6.addRule(11);
        layoutParams6.rightMargin = this.a.b(30);
        addView(this.d, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(b3, b3);
        layoutParams7.addRule(10);
        layoutParams7.addRule(11);
        addView(this.l, layoutParams7);
        this.m.setTypeface(typeface);
        this.m.setTextSize(2, 18.0f);
        this.m.setTextColor(this.b);
        this.m.setPadding(0, 0, this.a.b(67), 0);
        this.m.setId(c3);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = this.a.b(91);
        layoutParams8.rightMargin = this.a.b(15);
        layoutParams8.topMargin = this.a.b(13);
        this.m.setLayoutParams(layoutParams8);
        addView(this.m);
        this.i.setTypeface(typeface);
        this.i.setTextSize(2, 13.0f);
        this.i.setTextColor(this.b);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.leftMargin = this.a.b(91);
        layoutParams9.addRule(3, c3);
        this.i.setId(c);
        this.i.setLayoutParams(layoutParams9);
        addView(this.i);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(3, c);
        layoutParams10.leftMargin = this.a.b(91);
        layoutParams10.topMargin = this.a.b(5);
        this.j.setPadding(0, 0, 0, this.a.b(20));
        this.j.setStarsPadding(this.a.b(2));
        this.j.setStarSize(this.a.b(12));
        this.j.setId(c2);
        addView(this.j, layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(1, c2);
        layoutParams11.addRule(3, c);
        layoutParams11.leftMargin = this.a.b(9);
        this.k.setTypeface(typeface);
        this.k.setPadding(0, this.a.b(2), 0, 0);
        this.k.setTextSize(2, 13.0f);
        this.k.setTextColor(this.b);
        this.k.setGravity(16);
        addView(this.k, layoutParams11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public NativeAppwallBanner getBanner() {
        return this.o;
    }

    @NonNull
    public ImageView getBannerIconImageView() {
        return this.e;
    }

    @NonNull
    public TextView getCoinsCountTextView() {
        return this.f;
    }

    @NonNull
    public ImageView getCoinsIconImageView() {
        return this.n;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.i;
    }

    @NonNull
    public ImageView getNotificationImageView() {
        return this.c;
    }

    @NonNull
    public ImageView getOpenImageView() {
        return this.d;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.j;
    }

    @NonNull
    public ImageView getStatusIconImageView() {
        return this.l;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.m;
    }

    @NonNull
    public TextView getVotesCountTextView() {
        return this.k;
    }

    public boolean isViewed() {
        return this.p;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected void removeNotification() {
        removeView(this.c);
    }

    public void setNativeAppwallBanner(@NonNull NativeAppwallBanner nativeAppwallBanner) {
        this.o = nativeAppwallBanner;
        this.e.setImageData(nativeAppwallBanner.getIcon());
        ImageData bubbleIcon = nativeAppwallBanner.getBubbleIcon();
        this.c.setImageData(bubbleIcon);
        String description = nativeAppwallBanner.getDescription();
        this.m.setText(nativeAppwallBanner.getTitle());
        this.i.setText(description);
        if (nativeAppwallBanner.isHasNotification()) {
            this.c.setVisibility(0);
            this.c.setImageData(bubbleIcon);
        } else {
            this.c.setVisibility(8);
        }
        if (nativeAppwallBanner.getCoins() > 0) {
            this.g.setVisibility(0);
            this.n.setImageData(nativeAppwallBanner.getCoinsIcon());
            this.f.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(nativeAppwallBanner.getCoins())));
            this.f.setTextColor(nativeAppwallBanner.getCoinsIconTextColor());
            this.h.getPaint().setColor(nativeAppwallBanner.getCoinsIconBgColor());
            this.d.setVisibility(8);
        } else if (nativeAppwallBanner.isAppInstalled()) {
            this.g.setVisibility(8);
            this.d.setVisibility(0);
            this.d.setImageData(nativeAppwallBanner.getGotoAppIcon());
        } else {
            this.g.setVisibility(8);
            this.d.setVisibility(8);
        }
        ImageData statusIcon = nativeAppwallBanner.getStatusIcon();
        if (statusIcon != null) {
            this.l.setVisibility(0);
            this.l.setImageData(statusIcon);
        } else {
            this.l.setVisibility(8);
        }
        if (nativeAppwallBanner.getCoins() != 0 || nativeAppwallBanner.isAppInstalled()) {
            this.i.setPadding(0, 0, this.a.b(70), 0);
        } else if (statusIcon != null) {
            this.i.setPadding(0, 0, this.a.b(20), 0);
        }
        if (nativeAppwallBanner.getRating() <= 0.0f) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            TextView textView = this.i;
            textView.setPadding(textView.getPaddingLeft(), this.i.getPaddingTop(), this.i.getPaddingRight(), this.a.b(20));
            return;
        }
        this.j.setRating(nativeAppwallBanner.getRating());
        this.j.setVisibility(0);
        if (nativeAppwallBanner.getVotes() <= 0) {
            this.k.setVisibility(8);
        } else {
            this.k.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(nativeAppwallBanner.getVotes())));
            this.k.setVisibility(0);
        }
    }

    public void setViewed(boolean z) {
        this.p = z;
    }
}
