package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class SegmentsProgressBar extends ComponentLinearLayout {
    private final String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final List<ProgressBar> i;
    private TextView j;
    private String k;
    private boolean l;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public SegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MBridgeSegmentsProgressBar";
        this.c = 1;
        this.d = 20;
        this.e = 10;
        this.f = 1;
        this.g = -1711276033;
        this.h = -1;
        this.i = new ArrayList();
        this.l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        int i = this.c;
        if (i == 1) {
            setOrientation(1);
            if (TextUtils.isEmpty(this.k)) {
                this.k = this.l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
            }
        } else if (i == 2) {
            setOrientation(0);
            if (TextUtils.isEmpty(this.k)) {
                this.k = this.l ? "广告 %s/%s" : "ADS %s/%s";
            }
        }
        this.i.clear();
        removeAllViews();
        setBackground(getBackgroundDrawable());
        TextView textView = new TextView(getContext());
        this.j = textView;
        textView.setTextColor(-1);
        this.j.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.j.setLayoutParams(layoutParams);
        int i2 = this.c;
        if (i2 == 1) {
            layoutParams.gravity = 5;
            TextView textView2 = this.j;
            int i3 = this.d / 2;
            textView2.setPadding(i3, 15, i3, 5);
        } else if (i2 == 2) {
            this.j.setGravity(16);
            TextView textView3 = this.j;
            int i4 = this.d / 2;
            textView3.setPadding(i4, 0, i4, 0);
        }
        try {
            int a2 = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (i0.a(a2) && (drawable = getContext().getResources().getDrawable(a2)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.j.setCompoundDrawables(drawable, null, null, null);
                this.j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i5 = 0; i5 < this.b; i5++) {
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(getSegmentLayerDrawable());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            int i6 = this.d / 2;
            layoutParams3.leftMargin = i6;
            layoutParams3.rightMargin = i6;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.i.add(progressBar);
        }
        int i7 = this.c;
        if (i7 == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.j);
            addView(linearLayout);
        } else {
            if (i7 != 2) {
                addView(linearLayout);
                return;
            }
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.j);
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.e);
        gradientDrawable.setColor(this.g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.e);
        gradientDrawable2.setColor(this.h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new a());
        startAnimation(alphaAnimation);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void init(int i, int i2) {
        this.b = i;
        this.c = i2;
        a();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setIndicatorText(String str) {
        this.k = str;
    }

    public void setProgress(int i, int i2) {
        try {
            if (this.i.isEmpty()) {
                return;
            }
            if (i2 < this.i.size()) {
                this.i.get(i2).setProgress(i);
            }
            int i3 = i2 + 1;
            if (i3 > this.f) {
                this.f = i3;
                TextView textView = this.j;
                if (textView != null) {
                    textView.setText(a(i3));
                }
            }
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            this.b = Integer.parseInt(String.valueOf(map.get("count")));
        } catch (Throwable th) {
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
            this.b = 1;
        }
        try {
            this.c = Integer.parseInt(String.valueOf(map.get("style")));
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            this.c = 0;
        }
        init(this.b, this.c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:7|8|9|(6:14|15|16|(1:18)|20|21)|25|(1:27)(1:28)|15|16|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("MBridgeSegmentsProgressBar", r6.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:16:0x0048, B:18:0x0050), top: B:15:0x0048 }] */
    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateBindData(String str, Object obj) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String lowerCase = str.toLowerCase();
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || valueOf.equalsIgnoreCase(POBCommonConstants.NULL_VALUE)) {
            return;
        }
        int i2 = 0;
        try {
        } catch (Throwable th) {
            th = th;
            i = 0;
        }
        if (!lowerCase.contains("percent") && !lowerCase.contains("progress")) {
            i = 0;
            if (lowerCase.contains("index")) {
                i2 = Integer.parseInt(valueOf);
            }
            setProgress(i, i2);
        }
        i = valueOf.contains(".") ? (int) (Double.parseDouble(valueOf) * 100.0d) : Integer.parseInt(valueOf);
        if (lowerCase.contains("index")) {
        }
        setProgress(i, i2);
    }

    public void init(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.h = i3;
        this.g = i4;
        a();
    }

    public void init(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b = i;
        this.c = i2;
        this.h = i3;
        this.g = i4;
        this.d = i5;
        this.e = i6;
        a();
    }

    private StringBuilder a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.k, Integer.valueOf(i), Integer.valueOf(this.b)));
        } catch (Throwable th) {
            sb.append(this.b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            q0.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb;
    }
}
