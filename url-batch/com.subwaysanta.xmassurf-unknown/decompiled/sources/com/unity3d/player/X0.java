package com.unity3d.player;

import android.widget.FrameLayout;
import com.unity3d.player.a.AbstractC0120t;

/* loaded from: classes.dex */
public final class X0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ b1 h;

    public X0(b1 b1Var, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = b1Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.h;
        if (b1Var.f != null) {
            AbstractC0120t.Log(5, "Video already playing");
            b1 b1Var2 = this.h;
            b1Var2.g = 2;
            b1Var2.d.release();
            return;
        }
        b1 b1Var3 = this.h;
        b1Var.f = new VideoPlayer(b1Var3.b, b1Var3.a, this.a, this.b, this.c, this.d, this.e, this.f, this.g, new W0(this));
        b1 b1Var4 = this.h;
        if (b1Var4.f != null) {
            FrameLayout frameLayout = b1Var4.a.getFrameLayout();
            frameLayout.bringToFront();
            frameLayout.addView(this.h.f);
        }
    }
}
