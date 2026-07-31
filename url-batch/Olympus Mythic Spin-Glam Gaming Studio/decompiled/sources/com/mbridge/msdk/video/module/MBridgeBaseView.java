package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.a;
import com.mbridge.msdk.video.module.listener.impl.f;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";
    protected Context a;
    protected CampaignEx b;
    protected LayoutInflater c;
    protected int d;
    protected boolean e;
    protected float f;
    protected float g;
    protected boolean h;
    protected int i;
    protected boolean j;
    protected int k;
    protected int l;
    public a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    protected JSONObject a(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e) {
            e = e;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.h, v0.b(c.n().d(), this.f));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.i, v0.b(c.n().d(), this.g));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.m, i);
            try {
                this.d = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.a.k, this.d);
            jSONObject.put(com.mbridge.msdk.foundation.same.a.l, v0.d(getContext()));
            return jSONObject;
        } catch (JSONException e3) {
            e = e3;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            return jSONObject2;
        }
    }

    protected String c() {
        return a(0).toString();
    }

    protected void d() {
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public int filterFindViewId(boolean z, String str) {
        return z ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return i0.a(this.a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return i0.a(this.a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return i0.a(this.a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.b;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f = motionEvent.getRawX();
        this.g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public void setLayoutCenter(int i, int i2) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotifyListener(a aVar) {
        this.notifyListener = aVar;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet);
        this.d = 1;
        this.notifyListener = new f();
        this.e = false;
        this.k = 1;
        this.l = 0;
        this.a = context;
        this.c = LayoutInflater.from(context);
        this.h = z;
        this.i = i;
        this.j = z2;
        this.k = i2;
        this.l = i3;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 1;
        this.notifyListener = new f();
        this.e = false;
        this.k = 1;
        this.l = 0;
        this.a = context;
        this.c = LayoutInflater.from(context);
        init(context);
    }
}
