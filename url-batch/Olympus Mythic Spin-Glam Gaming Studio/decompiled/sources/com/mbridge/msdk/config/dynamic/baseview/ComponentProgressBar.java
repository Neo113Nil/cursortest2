package com.mbridge.msdk.config.dynamic.baseview;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Map;

/* loaded from: classes6.dex */
public class ComponentProgressBar extends ProgressBar implements a {
    private final String a;

    public ComponentProgressBar(Context context) {
        super(context);
        this.a = "ComponentProgressBar";
    }

    private static int a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return R.style.Widget.ProgressBar;
        }
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            if (!TextUtils.isEmpty(attributeName) && attributeName.equals("style")) {
                String attributeValue = attributeSet.getAttributeValue(i);
                if (attributeValue.contains("Horizontal")) {
                    return R.style.Widget.ProgressBar.Horizontal;
                }
                if (attributeValue.contains("Large")) {
                    return R.style.Widget.ProgressBar.Large;
                }
                if (attributeValue.contains("Small")) {
                    return R.style.Widget.ProgressBar.Small;
                }
                if (attributeValue.contains("Large.Inverse")) {
                    return R.style.Widget.ProgressBar.Large.Inverse;
                }
                if (attributeValue.contains("Small.Inverse")) {
                    return R.style.Widget.ProgressBar.Small.Inverse;
                }
                if (attributeValue.contains("Inverse")) {
                    return R.style.Widget.ProgressBar.Inverse;
                }
            }
        }
        return R.style.Widget.ProgressBar;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("data"));
            if (TextUtils.isEmpty(valueOf)) {
                return;
            }
            setProgress(Integer.parseInt(valueOf));
        } catch (Exception e) {
            q0.b("ComponentProgressBar", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            setProgress(Integer.parseInt(String.valueOf(obj)));
        } catch (Throwable th) {
            q0.b("ComponentProgressBar", th.getMessage());
        }
    }

    public ComponentProgressBar(Context context, AttributeSet attributeSet) {
        super(context, null, a(attributeSet));
        this.a = "ComponentProgressBar";
    }
}
