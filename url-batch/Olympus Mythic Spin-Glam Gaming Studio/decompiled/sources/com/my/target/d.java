package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.menu.MenuAction;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class d extends LinearLayout {
    private final ImageView a;
    private final TextView b;
    private final hg c;
    private final w2 d;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(MenuAction menuAction);
    }

    public d(Context context) {
        super(context);
        hg a2 = hg.a(context);
        this.c = a2;
        w2 a3 = w2.a(context);
        this.d = a3;
        setBackground(a3.a());
        int a4 = a2.a(hg.r);
        setPadding(a4, 0, a4, 0);
        ImageView a5 = a(context);
        this.a = a5;
        addView(a5);
        TextView b = b(context);
        this.b = b;
        addView(b);
    }

    private ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        int a2 = this.c.a(hg.w);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        int a3 = this.c.a(hg.m);
        layoutParams.setMargins(0, a3, this.c.a(hg.r), a3);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private TextView b(Context context) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a2 = this.c.a(hg.p);
        layoutParams.setMargins(0, a2, 0, a2);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(this.c.a(hg.S));
        textView.setTextColor(this.d.a(w2.s));
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setData(@NonNull MenuAction menuAction) {
        String str = menuAction.alias;
        if (TextUtils.isEmpty(str)) {
            this.a.setVisibility(8);
        } else {
            this.a.setImageBitmap(a(str, this.c.a(hg.v), getContext()));
            if (menuAction.alias.equalsIgnoreCase("complain")) {
                this.a.setColorFilter(Color.parseColor("#E64646"));
            }
        }
        this.b.setText(menuAction.title);
    }

    public Bitmap a(String str, int i, Context context) {
        str.getClass();
        switch (str) {
            case "recommendation_rules":
                return a4.a(i, this.d.a(w2.n), context);
            case "complain":
                return ag.a(i, this.d.a(w2.n), context);
            case "copy":
                return k3.a(i, this.d.a(w2.n), context);
            case "hide":
                return xf.a(i, this.d.a(w2.n), context);
            case "ad_marker_template":
                return d6.a(i, this.d.a(w2.n), context);
            case "show_advertiser_info":
                return ab.a(i, this.d.a(w2.n), context);
            default:
                return null;
        }
    }
}
