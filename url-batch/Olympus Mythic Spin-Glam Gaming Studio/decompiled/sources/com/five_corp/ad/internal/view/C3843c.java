package com.five_corp.ad.internal.view;

import android.R;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.view.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3843c extends LinearLayout {
    public final InterfaceC3841a a;
    public final InterfaceC3842b b;

    public C3843c(Activity activity, ArrayList arrayList, InterfaceC3841a interfaceC3841a, InterfaceC3842b interfaceC3842b) {
        super(activity);
        this.a = interfaceC3841a;
        this.b = interfaceC3842b;
        a(activity, arrayList);
    }

    public final void a(Activity activity, ArrayList arrayList) {
        setOrientation(1);
        int a = this.a.a(8);
        setPadding(a, a, a, a);
        setBackgroundColor(-1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.five_corp.ad.internal.view.c$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) pair.second).run();
                }
            };
            TextView textView = new TextView(activity);
            int a2 = this.a.a(8);
            int a3 = this.a.a(16);
            textView.setPadding(a3, a2, a3, a2);
            textView.setText(str);
            textView.setTextColor(-16777216);
            textView.setGravity(17);
            textView.setOnClickListener(onClickListener);
            textView.setClickable(true);
            textView.setFocusable(true);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(-1);
            textView.setBackground(new RippleDrawable(ColorStateList.valueOf(-3355444), shapeDrawable, null));
            addView(textView);
        }
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.a.a(5)));
        addView(view);
        String string = activity.getString(R.string.cancel);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.five_corp.ad.internal.view.c$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3843c.this.a(view2);
            }
        };
        Button button = new Button(activity);
        button.setText(string);
        button.setTextColor(-16777216);
        button.setOnClickListener(onClickListener2);
        button.setStateListAnimator(null);
        button.setElevation(0.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(this.a.a(8));
        gradientDrawable.setStroke(this.a.a(2), -3355444);
        button.setBackground(new RippleDrawable(ColorStateList.valueOf(-3355444), gradientDrawable, null));
        addView(button);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
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

    public final /* synthetic */ void a(View view) {
        this.b.a();
    }
}
