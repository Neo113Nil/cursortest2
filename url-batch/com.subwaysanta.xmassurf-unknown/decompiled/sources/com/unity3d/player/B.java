package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class B extends AbstractC0164w {
    public boolean h;
    public Handler i;
    public RunnableC0170z j;

    @Override // com.unity3d.player.AbstractC0164w, com.unity3d.player.a.r
    public final boolean isConsumeOutsideTouchesEnabled() {
        return false;
    }

    public B(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.h = false;
    }

    @Override // com.unity3d.player.a.r
    public final void a() {
        if (this.h) {
            return;
        }
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.addView(this.c);
        frameLayout.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new RunnableC0170z(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }

    @Override // com.unity3d.player.a.r
    public final void hide() {
        RunnableC0170z runnableC0170z;
        Handler handler = this.i;
        if (handler != null && (runnableC0170z = this.j) != null) {
            handler.removeCallbacks(runnableC0170z);
        }
        this.b.getFrameLayout().removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC0164w
    public EditText createEditText(AbstractC0164w abstractC0164w) {
        return new A(this.a, abstractC0164w);
    }

    @Override // com.unity3d.player.AbstractC0164w, com.unity3d.player.a.r
    public final void setHideInputField(boolean z) {
        this.d = z;
        if (z) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
        }
        this.c.invalidate();
        this.c.requestLayout();
    }
}
