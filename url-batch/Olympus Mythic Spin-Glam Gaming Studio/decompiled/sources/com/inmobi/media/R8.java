package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class R8 {
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final C3885b8 c;
    public final String d;
    public final Handler e;
    public final Q8 f;
    public final long g;
    public final C4438w7 h;

    public R8(AdConfig.ViewabilityConfig viewabilityConfig, C3885b8 visibilityTracker, C4438w7 listener) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = weakHashMap;
        this.b = weakHashMap2;
        this.c = visibilityTracker;
        this.d = R8.class.getSimpleName();
        this.g = viewabilityConfig.getImpressionPollIntervalMillis();
        O8 o8 = new O8(this);
        InterfaceC4466x9 interfaceC4466x9 = visibilityTracker.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.h = o8;
        this.e = handler;
        this.f = new Q8(this);
        this.h = listener;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.remove(view);
        this.b.remove(view);
        this.c.a(view);
    }
}
