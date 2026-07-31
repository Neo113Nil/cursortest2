package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ci {
    public GestureDetectorOnGestureListenerC4476xi a;
    public final long b;

    public Ci(GestureDetectorOnGestureListenerC4476xi view, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        this.b = j;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.inmobi.media.Ci$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ci.a(Ci.this);
            }
        }, this.b);
    }

    public static final void a(Ci ci) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = ci.a;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.j();
        }
        ci.a = null;
    }
}
