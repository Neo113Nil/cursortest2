package com.five_corp.ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class i extends FrameLayout implements com.five_corp.ad.internal.layouter.j {
    public final TextView a;
    public final j b;
    public float c;
    public final com.five_corp.ad.internal.hub.ad_instance.e d;

    public i(Context context, com.five_corp.ad.internal.ad.custom_layout.f fVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        super(context);
        this.d = eVar;
        j jVar = new j(context, fVar, eVar);
        this.b = jVar;
        addView(jVar, new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(context);
        this.a = textView;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        textView.setTextSize(0, getHeight() * 0.8f);
        textView.setTextColor(H.a(fVar.d));
        textView.setSingleLine();
        addView(textView, layoutParams);
        this.c = 0.65f;
    }

    @Override // com.five_corp.ad.internal.layouter.j
    public final void a(com.five_corp.ad.internal.layouter.g gVar) {
        int i = gVar.c;
        if (i > 0) {
            this.c = i >= 100000 ? 0.5f : i >= 10000 ? 0.65f : 0.8f;
            try {
                this.a.setTextSize(0, getHeight() * this.c);
            } catch (Throwable th) {
                this.d.a(com.five_corp.ad.internal.logger.b.a(th));
            }
        }
        TextView textView = this.a;
        Locale locale = Locale.ENGLISH;
        int i2 = gVar.b / 1000;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        textView.setText(sb.toString());
        j jVar = this.b;
        jVar.getClass();
        jVar.d = gVar.d;
        jVar.invalidate();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
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

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.a.setTextSize(0, getHeight() * this.c);
        } catch (Throwable th) {
            this.d.a(com.five_corp.ad.internal.logger.b.a(th));
        }
    }
}
