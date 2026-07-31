package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Τ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0506 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static C0506 f467;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f468 = StringFog.decrypt("pbAIFHDvl5KXvw86ePC3mIy5FSV08bWUgbk=\n", "4txndhGDw/0=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C0560 f471;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final WeakHashMap f470 = new WeakHashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public C0784 f469 = new C0784(-1, -1, -1, -1);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4031(C0506 c0506, ViewGroup viewGroup, ViewOnLayoutChangeListenerC0558 viewOnLayoutChangeListenerC0558) {
        boolean z;
        c0506.getClass();
        if (viewGroup != null) {
            try {
                if (viewGroup.getChildCount() != 0) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof TextView) {
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                String str = f468;
                AbstractC0580.m4080(str, str, StringFog.decrypt("JEQHdRy/FPUEVR5zAPhX9AcWI3ML6DDvDkMFOg3wGekAXxtpTvAZ8RgWIX8W6yH0BEEG\n", "YTZ1Gm6fd50=\n"), th, null, false);
            }
            Activity m4490 = AbstractC1240.m4490(viewGroup);
            C0813 m4209 = C0813.m4209();
            synchronized (m4209) {
                z = EnumC0814.f2007 == m4209.m4212(m4490);
            }
            if (z) {
                if (viewGroup.findViewById(160766228) == null) {
                    c0506.m4035(viewGroup, viewOnLayoutChangeListenerC0558);
                }
            } else if (C0813.m4209().m4211(m4490)) {
                new Handler(Looper.getMainLooper()).post(new C0520(c0506, viewGroup, new C0542(c0506), viewOnLayoutChangeListenerC0558));
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4032() {
        try {
            if (this.f471 != null) {
                for (ViewGroup viewGroup : this.f470.keySet()) {
                    ViewParent parent = viewGroup.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(viewGroup);
                    }
                }
                this.f470.clear();
                C0379.m3991().m3992(this.f471);
                this.f471 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m4033() {
        if (this.f471 == null) {
            this.f471 = new C0560(this);
            C0379.m3991().m3993(this.f471);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized C0784 m4034() {
        return this.f469;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4030(C0506 c0506, MotionEvent motionEvent) {
        c0506.getClass();
        try {
            AbstractC1026.m4313(new C0517(c0506, MotionEvent.obtain(motionEvent)));
        } catch (Throwable th) {
            AbstractC0577.m4068(f468, StringFog.decrypt("4ksFzXdlxgXTTR7MYmXVD9JaH4J3JNY4h1YFgnck1jk=\n", "pzl3ogVFoWA=\n"), th, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0506 m4029() {
        C0506 c0506;
        synchronized (C0506.class) {
            try {
                if (f467 == null) {
                    f467 = new C0506();
                }
                c0506 = f467;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0506;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4035(ViewGroup viewGroup, ViewOnLayoutChangeListenerC0558 viewOnLayoutChangeListenerC0558) {
        C0554 c0554 = new C0554(this, viewGroup.getContext());
        c0554.setAlpha(0.0f);
        synchronized (this) {
            this.f470.put(c0554, new Object());
        }
        c0554.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new C0550(viewGroup, c0554, viewOnLayoutChangeListenerC0558));
    }
}
