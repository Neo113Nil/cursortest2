package com.five_corp.ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.five_corp.ad.internal.view.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC3847g implements View.OnTouchListener {
    public final int a;
    public final InterfaceC3846f b;
    public final com.five_corp.ad.internal.hub.ad_instance.e c;

    public ViewOnTouchListenerC3847g(Context context, InterfaceC3846f interfaceC3846f, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = interfaceC3846f;
        this.c = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            int max = Math.max(view.getWidth(), 1);
            int max2 = Math.max(view.getHeight(), 1);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getActionMasked() == 1) {
                float f = -this.a;
                if (f <= x && x <= max + r9 && f <= y && y <= max2 + r9) {
                    this.b.a(x, y);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            this.c.a(com.five_corp.ad.internal.logger.b.a(th));
            return false;
        }
    }
}
