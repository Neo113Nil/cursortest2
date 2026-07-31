package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes13.dex */
public final class y0 implements View.OnTouchListener {
    public final x0 a;
    public float b;
    public float c;
    public final float d;

    public y0(x0 x0Var, Context context) {
        this.a = x0Var;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/y0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.p, view, motionEvent);
        return safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(view, motionEvent);
    }

    public boolean safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(View p0, MotionEvent p1) {
        if (this.a != null) {
            if (p1.getActionMasked() == 0) {
                ((i) this.a).i();
                this.b = p1.getX();
                this.c = p1.getY();
            } else if (p1.getActionMasked() == 3) {
                ((i) this.a).i();
                this.c = -1.0f;
                this.b = -1.0f;
            } else if (p1.getActionMasked() == 1) {
                float f = this.b;
                if (f >= 0.0f && this.c >= 0.0f) {
                    float round = Math.round(Math.abs(f - p1.getX()));
                    float round2 = Math.round(Math.abs(this.c - p1.getY()));
                    float f2 = this.d;
                    if (round < f2 && round2 < f2) {
                        i iVar = (i) this.a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.l.d();
                            d dVar = iVar.m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
                            }
                            iVar.l = null;
                            iVar.i();
                        } else {
                            if (iVar.n != null) {
                                com.fyber.inneractive.sdk.util.r.b.postDelayed(iVar.n, IAConfigManager.N.t.b.a("click_timeout", 1000, 1000));
                            }
                            iVar.j = true;
                        }
                    }
                    this.b = -1.0f;
                    this.c = -1.0f;
                }
            }
        }
        return false;
    }
}
