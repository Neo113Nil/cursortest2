package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.unity3d.player.UnityPlayerForActivityOrService;

/* renamed from: com.unity3d.player.a.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117p extends FrameLayout {
    public final UnityPlayerForActivityOrService a;
    public final com.unity3d.player.T b;

    public C0117p(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.a = unityPlayerForActivityOrService;
        com.unity3d.player.T t = new com.unity3d.player.T(unityPlayerForActivityOrService);
        this.b = t;
        addView(t);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0108g c0108g = this.b.a;
        if (c0108g == null || c0108g.a <= 0.0f) {
            return this.a.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C0108g c0108g = this.b.a;
        if (c0108g == null || c0108g.a <= 0.0f) {
            return this.a.injectEvent(motionEvent);
        }
        return false;
    }
}
