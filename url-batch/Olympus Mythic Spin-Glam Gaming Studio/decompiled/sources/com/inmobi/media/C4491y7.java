package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4491y7 {
    public static final C4412v7 k = new C4412v7();
    public final byte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final InterfaceC4466x9 f;
    public R8 g;
    public C3885b8 h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final C4438w7 j = new C4438w7(this);

    public C4491y7(byte b, String str, int i, int i2, int i3, InterfaceC4466x9 interfaceC4466x9) {
        this.a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = interfaceC4466x9;
    }

    public final void a(View view) {
        R8 r8;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.areEqual(this.b, "video") || Intrinsics.areEqual(this.b, "audio") || (r8 = this.g) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        r8.a.remove(view);
        r8.b.remove(view);
        r8.c.a(view);
        if (r8.a.isEmpty()) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            R8 r82 = this.g;
            if (r82 != null) {
                r82.a.clear();
                r82.b.clear();
                r82.c.a();
                r82.e.removeMessages(0);
                r82.c.b();
            }
            this.g = null;
        }
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C3885b8 c3885b8 = this.h;
        if (c3885b8 != null) {
            c3885b8.a(view);
            if (c3885b8.a.isEmpty()) {
                InterfaceC4466x9 interfaceC4466x92 = this.f;
                if (interfaceC4466x92 != null) {
                    ((C4493y9) interfaceC4466x92).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C3885b8 c3885b82 = this.h;
                if (c3885b82 != null) {
                    c3885b82.b();
                }
                this.h = null;
            }
        }
        this.i.remove(view);
    }

    public final void a(View view, View token, InterfaceC4165lo listener, AdConfig.ViewabilityConfig config, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(config, "config");
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        C3885b8 c3885b8 = this.h;
        if (c3885b8 == null) {
            if (z) {
                c3885b8 = new C3855a4(config, this.f);
            } else {
                c3885b8 = new C3885b8(config, (byte) 1, this.f);
            }
            this.h = c3885b8;
        }
        C4464x7 c4464x7 = new C4464x7(this);
        InterfaceC4466x9 interfaceC4466x92 = c3885b8.d;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        c3885b8.h = c4464x7;
        this.i.put(view, listener);
        if (z) {
            i = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            i = this.e;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        c3885b8.a(view, view, token, i);
    }

    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("HtmlAdTracker", "onActivityStarted");
        }
        R8 r8 = this.g;
        if (r8 != null) {
            String TAG = r8.d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            for (Map.Entry entry : r8.a.entrySet()) {
                View view = (View) entry.getKey();
                P8 p8 = (P8) entry.getValue();
                C3885b8 c3885b8 = r8.c;
                View view2 = p8.a;
                int i = p8.b;
                c3885b8.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                c3885b8.a(view, view, view2, i);
            }
            if (!r8.e.hasMessages(0)) {
                r8.e.postDelayed(r8.f, r8.g);
            }
            r8.c.f();
        }
        C3885b8 c3885b82 = this.h;
        if (c3885b82 != null) {
            c3885b82.f();
        }
    }

    public final R8 a(byte b, AdConfig.ViewabilityConfig viewabilityConfig) {
        R8 r8 = this.g;
        if (r8 != null) {
            return r8;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b));
        }
        C3885b8 c3885b8 = new C3885b8(viewabilityConfig, b, this.f);
        InterfaceC4466x9 interfaceC4466x92 = this.f;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b));
        }
        R8 r82 = new R8(viewabilityConfig, c3885b8, this.j);
        this.g = r82;
        return r82;
    }
}
