package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class d {
    public final RelativeLayout b;
    public final g i;
    public float c = 0.0f;
    public int d = 1;
    public float e = 0.0f;
    public long f = 0;
    public boolean g = false;
    public boolean h = false;
    public final b j = new b(this);
    public final com.fyber.inneractive.sdk.util.j a = new com.fyber.inneractive.sdk.util.j(4, new c());

    public d(com.fyber.inneractive.sdk.response.f fVar, RelativeLayout relativeLayout, g gVar) {
        this.b = relativeLayout;
        this.i = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        String str;
        IAlog.a("IAVisibilityTracker: onCheckVisibility", new Object[0]);
        float f = this.d / 100.0f;
        com.fyber.inneractive.sdk.util.j jVar = this.a;
        Object poll = jVar.a.poll();
        if (poll == null) {
            poll = jVar.b.a();
        }
        Rect rect = (Rect) poll;
        RelativeLayout relativeLayout = this.b;
        float width = (relativeLayout.getParent() != null && relativeLayout.isShown() && relativeLayout.hasWindowFocus() && relativeLayout.getGlobalVisibleRect(rect)) ? (rect.width() * rect.height()) / (relativeLayout.getWidth() * relativeLayout.getHeight()) : 0.0f;
        this.a.a.offer(rect);
        this.c = width;
        if (width >= f) {
            float f2 = this.e * 1000.0f;
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f;
            if (f2 < currentTimeMillis - j && j != 0) {
                z = true;
                IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", Boolean.valueOf(z), Float.valueOf(f));
                if (z || !this.g) {
                    if (this.g) {
                        return;
                    }
                    float f3 = this.c;
                    if (f3 < f) {
                        this.f = 0L;
                    } else if (f3 >= f && this.f == 0) {
                        this.f = System.currentTimeMillis();
                    }
                    Handler handler = com.fyber.inneractive.sdk.util.r.b;
                    handler.removeCallbacks(this.j);
                    handler.postDelayed(this.j, 50L);
                    return;
                }
                if (this.i == null || this.h) {
                    return;
                }
                this.h = true;
                IAlog.a("BannerVisibilityTracker | firing viewable", new Object[0]);
                n nVar = this.i.a;
                nVar.getClass();
                try {
                    com.fyber.inneractive.sdk.flow.x xVar = nVar.b;
                    if (xVar == null || ((q0) xVar).b == null || (str = ((com.fyber.inneractive.sdk.response.f) ((q0) xVar).b).u) == null || str.trim().length() <= 0) {
                        return;
                    }
                    IAlog.e("%sfiring banner mrc visibility impression!", IAlog.a(nVar));
                    IAlog.d("MRC_VISIBILITY_IMPRESSION", new Object[0]);
                    z0.b(str);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        z = false;
        IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", Boolean.valueOf(z), Float.valueOf(f));
        if (z) {
        }
        if (this.g) {
        }
    }
}
