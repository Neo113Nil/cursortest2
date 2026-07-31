package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Jc {
    public final GestureDetectorOnGestureListenerC4476xi a;
    public final InterfaceC4466x9 b;
    public C4390uc c;
    public C4206nc d;
    public C4206nc e;
    public C4206nc f;

    public Jc(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, InterfaceC4466x9 interfaceC4466x9) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
        this.b = interfaceC4466x9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return false;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(Activity activity, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C4390uc c4390uc = new C4390uc(activity, this.b);
        this.c = c4390uc;
        c4390uc.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C4390uc c4390uc2 = this.c;
        if (c4390uc2 != null) {
            c4390uc2.setLayoutParams(layoutParams);
        }
        C4417vc c4417vc = new C4417vc(activity);
        c4417vc.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.Jc$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Jc$$ExternalSyntheticLambda0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.i, view, motionEvent);
                return safedk_Jc$$ExternalSyntheticLambda0_onTouch_df3df0e2662d488015590076595d5f92(view, motionEvent);
            }

            public boolean safedk_Jc$$ExternalSyntheticLambda0_onTouch_df3df0e2662d488015590076595d5f92(View p0, MotionEvent p1) {
                return Jc.a(p0, p1);
            }
        });
        c4417vc.setBackgroundColor(-16777216);
        c4417vc.addView(this.c);
        InterfaceC4466x9 interfaceC4466x92 = this.b;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c4417vc, new ViewGroup.LayoutParams(-1, -1));
        C4390uc c4390uc3 = this.c;
        if (c4390uc3 != null) {
            c4390uc3.setViewContainer(c4417vc);
        }
        C4390uc c4390uc4 = this.c;
        if (c4390uc4 != null) {
            c4390uc4.requestFocus();
        }
        C4390uc c4390uc5 = this.c;
        if (c4390uc5 != null) {
            c4390uc5.setOnKeyListener(new View.OnKeyListener() { // from class: com.inmobi.media.Jc$$ExternalSyntheticLambda1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return Jc.a(Jc.this, view, i, keyEvent);
                }
            });
        }
        C4390uc c4390uc6 = this.c;
        if (c4390uc6 != null) {
            c4390uc6.setListener(new Ic(this));
        }
        C4390uc c4390uc7 = this.c;
        if (c4390uc7 != null) {
            c4390uc7.a();
        }
    }

    public static final boolean a(Jc jc, View view, int i, KeyEvent keyEvent) {
        if (4 != i || keyEvent.getAction() != 0) {
            return false;
        }
        C4390uc c4390uc = jc.c;
        if (c4390uc == null) {
            return true;
        }
        c4390uc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("MraidMediaProcessor", X3.j.P);
        }
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (((gestureDetectorOnGestureListenerC4476xi == null || (renderingConfig = gestureDetectorOnGestureListenerC4476xi.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && AbstractC4002fj.f) {
            return 0;
        }
        AudioManager audioManager = null;
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            audioManager = (AudioManager) systemService;
        } catch (Throwable unused) {
        }
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void b(String str, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    public final void a(String str, boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    public final void a(String str, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
