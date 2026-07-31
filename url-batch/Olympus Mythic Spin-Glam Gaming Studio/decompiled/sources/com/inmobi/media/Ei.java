package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ei extends AbstractC4528zi {
    public final /* synthetic */ Fi a;
    public final /* synthetic */ Jo b;
    public final /* synthetic */ Yi c;

    public Ei(Fi fi, Jo jo, Yi yi) {
        this.a = fi;
        this.b = jo;
        this.c = yi;
    }

    public static final void a(Jo jo, Yi yi, Fi fi, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        String id = yi.a;
        jo.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) jo.b.get(id);
        if (gestureDetectorOnGestureListenerC4476xi2 == null) {
            InterfaceC4466x9 logger = fi.getLogger();
            if (logger != null) {
                ((C4493y9) logger).b(fi.m1, "Source RenderView not found for id: " + yi.a);
                return;
            }
            return;
        }
        Integer a = gestureDetectorOnGestureListenerC4476xi.getWvStateMachine().a(3);
        if (a != null) {
            int intValue = a.intValue();
            InterfaceC4466x9 logger2 = fi.getLogger();
            if (logger2 != null) {
                ((C4493y9) logger2).b(fi.m1, "Failed to transition to FIRE_AD_FAILED state: " + intValue);
            }
            gestureDetectorOnGestureListenerC4476xi2.a("loadWebView", Oi.a(gestureDetectorOnGestureListenerC4476xi.getRoute().b, intValue));
        }
    }

    public static final void b(Jo jo, Yi yi, Fi fi, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        String id = yi.a;
        jo.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) jo.b.get(id);
        if (gestureDetectorOnGestureListenerC4476xi2 == null) {
            InterfaceC4466x9 logger = fi.getLogger();
            if (logger != null) {
                ((C4493y9) logger).b(fi.m1, "Source RenderView not found for id: " + yi.a);
                return;
            }
            return;
        }
        Integer a = gestureDetectorOnGestureListenerC4476xi.getWvStateMachine().a(2);
        if (a == null) {
            fi.b(gestureDetectorOnGestureListenerC4476xi2, yi.b);
            return;
        }
        int intValue = a.intValue();
        InterfaceC4466x9 logger2 = fi.getLogger();
        if (logger2 != null) {
            ((C4493y9) logger2).b(fi.m1, "Failed to transition to FIRE_AD_READY state: " + intValue);
        }
        gestureDetectorOnGestureListenerC4476xi2.a("loadWebView", Oi.a(gestureDetectorOnGestureListenerC4476xi.getRoute().b, intValue));
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void e(GestureDetectorOnGestureListenerC4476xi renderView) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void f(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void g(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void i(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void j(GestureDetectorOnGestureListenerC4476xi renderView) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().j(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void h(final GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        final Jo jo = this.b;
        final Yi yi = this.c;
        final Fi fi = this.a;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ei$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ei.b(Jo.this, yi, fi, renderView);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(GestureDetectorOnGestureListenerC4476xi renderView, final boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        final Fi fi = this.a;
        final Yi yi = this.c;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ei$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ei.a(Fi.this, yi, z);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void b(GestureDetectorOnGestureListenerC4476xi renderView) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(Fk telemetryOnAdImpression) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        AbstractC4528zi listener;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(final GestureDetectorOnGestureListenerC4476xi renderView, String errorCode) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        final Jo jo = this.b;
        final Yi yi = this.c;
        final Fi fi = this.a;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ei$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Ei.a(Jo.this, yi, fi, renderView);
            }
        };
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(HashMap params) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        Intrinsics.checkNotNullParameter(params, "params");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(String eventType, HashMap kv) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        AbstractC4528zi listener;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC4528zi, com.inmobi.media.InterfaceC4531zl
    public final void a() {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        AbstractC4528zi listener;
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(GestureDetectorOnGestureListenerC4476xi renderView, String trackerName, Map macros) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(Z1 audioStatusInternal) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        AbstractC4528zi listener;
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(boolean z) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        AbstractC4528zi listener;
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(String data) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        AbstractC4528zi listener;
        Intrinsics.checkNotNullParameter(data, "data");
        adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    public static final void a(Fi fi, Yi yi, boolean z) {
        GestureDetectorOnGestureListenerC4476xi adRenderView;
        if (fi.getWvStateMachine().a(4) != null) {
            fi.a("loadWebView", Oi.a(yi.b, 307));
        }
        adRenderView = fi.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z);
        }
    }
}
