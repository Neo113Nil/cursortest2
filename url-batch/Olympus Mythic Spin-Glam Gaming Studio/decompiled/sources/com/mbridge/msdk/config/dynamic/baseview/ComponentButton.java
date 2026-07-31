package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.inter.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ComponentButton extends Button implements a, b {
    private String a;
    private boolean b;
    public XMLView xmlView;

    public ComponentButton(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        this.b = true;
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        f.a(this.xmlView, view.getTag(), dataMap);
    }

    private Map<String, Object> getDataMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("selected", this.b ? "1" : "0");
        hashMap.put("text", getText().toString());
        return hashMap;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.a) || (tag = getTag()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(tag), getDataMap());
        this.b = false;
        return hashMap;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
        } catch (Exception e) {
            q0.b("MBButton", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setOutDataScope(String str) {
        this.a = str;
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComponentButton.this.a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String valueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(valueOf) && valueOf.equals("true")) {
                setViewClickListener();
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e) {
            q0.b("MBButton", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e) {
            q0.b("MBButton", "updateBindData异常: " + e.getMessage());
        }
    }
}
