package com.yandex.div.internal.widget.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.R;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TabItem);
        this.text = obtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        this.icon = obtainStyledAttributes.getDrawable(R.styleable.TabItem_android_icon);
        this.customLayout = obtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
