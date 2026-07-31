package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.氵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC1165 extends AbstractC0403 implements View.OnTouchListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2964 = StringFog.decrypt("3ABhvkM8VzP6HUG0WDpNO/YNWqNXK1AN\n", "k2410TZfP38=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1166 f2965;

    public ViewOnTouchListenerC1165(View.OnTouchListener onTouchListener, InterfaceC1166 interfaceC1166) {
        super(onTouchListener);
        this.f2965 = interfaceC1166;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f2965.mo3989(this, view, motionEvent);
        } catch (Throwable th) {
            AbstractC0577.m4068(f2964, StringFog.decrypt("6R9xArcU312MAFcPiV3FR8kDZh/lW9hnwxhgBQ==\n", "rG0DbcU0tjM=\n"), th, false);
        }
        Object obj = this.f223;
        if (obj != null) {
            return ((View.OnTouchListener) obj).onTouch(view, motionEvent);
        }
        return false;
    }
}
