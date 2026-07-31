package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.component.style.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class XMLView extends ComponentRelativeLayout {
    private Map<String, View> a;
    private a b;
    private String c;
    protected com.mbridge.msdk.config.dynamic.baseview.touch.a d;

    public XMLView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new HashMap();
        this.c = "";
        this.d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/config/dynamic/baseview/cusview/XMLView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.o, this, motionEvent);
        return safedk_XMLView_dispatchTouchEvent_73dcae2311a452433743f3d1112f61c6(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.a;
    }

    public String getSelfTag() {
        return this.c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.d;
    }

    public a getXmlViewActionListener() {
        return this.b;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean safedk_XMLView_dispatchTouchEvent_73dcae2311a452433743f3d1112f61c6(MotionEvent p0) {
        try {
            int action = p0.getAction();
            if (action == 0) {
                this.d.c();
                this.d.d(p0);
            } else if (action == 1) {
                this.d.f(p0);
            } else if (action == 2) {
                this.d.e(p0);
            } else if (action == 3) {
                this.d.c(p0);
            }
        } catch (Exception e) {
            q0.b("RenderView", "处理触摸事件异常: " + e.getMessage());
        }
        return super.dispatchTouchEvent(p0);
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(a aVar) {
        this.b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.d;
        if (aVar != null) {
            aVar.c(view);
        }
    }
}
