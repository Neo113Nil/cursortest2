package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class N9 extends AbstractC4008fo {
    public final C4035go d;
    public final C4491y7 e;
    public final InterfaceC4466x9 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(GestureDetectorOnGestureListenerC4476xi container, C4035go mViewableAd, C4491y7 htmlAdTracker, InterfaceC4466x9 interfaceC4466x9) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.d = mViewableAd;
        this.e = htmlAdTracker;
        this.f = interfaceC4466x9;
        this.g = N9.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Map map) {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View view = this.d.b();
        if (view != null) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                String TAG2 = this.g;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x92).a(TAG2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.c.getViewability();
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
            Intrinsics.checkNotNull(gestureDetectorOnGestureListenerC4476xi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC4476xi.setFriendlyViews(map);
            C4491y7 c4491y7 = this.e;
            c4491y7.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(view, "token");
            Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
            InterfaceC4466x9 interfaceC4466x93 = c4491y7.f;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c4491y7.a == 0) {
                InterfaceC4466x9 interfaceC4466x94 = c4491y7.f;
                if (interfaceC4466x94 != null) {
                    ((C4493y9) interfaceC4466x94).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (Intrinsics.areEqual(c4491y7.b, "video") || Intrinsics.areEqual(c4491y7.b, "audio")) {
                InterfaceC4466x9 interfaceC4466x95 = c4491y7.f;
                if (interfaceC4466x95 != null) {
                    ((C4493y9) interfaceC4466x95).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                R8 a = c4491y7.a(c4491y7.a, viewabilityConfig);
                InterfaceC4466x9 interfaceC4466x96 = c4491y7.f;
                if (interfaceC4466x96 != null) {
                    ((C4493y9) interfaceC4466x96).c("HtmlAdTracker", "impression tracker add view");
                }
                int i = c4491y7.d;
                int i2 = c4491y7.c;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(view, "token");
                P8 p8 = (P8) a.a.get(view);
                if (!Intrinsics.areEqual(p8 != null ? p8.a : null, view)) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    a.a.remove(view);
                    a.b.remove(view);
                    a.c.a(view);
                    a.a.put(view, new P8(view, i, i2));
                    C3885b8 c3885b8 = a.c;
                    c3885b8.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    c3885b8.a(view, view, view, i);
                }
            }
            this.e.a(view, view, gestureDetectorOnGestureListenerC4476xi.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View c() {
        return this.d.c();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void d() {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "stopTrackingForImpression");
        }
        View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        if (childView instanceof Fi) {
            InterfaceC4466x9 interfaceC4466x9 = this.f;
            if (interfaceC4466x9 != null) {
                String TAG = this.g;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C4493y9) interfaceC4466x9).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.f;
        if (interfaceC4466x92 != null) {
            String TAG2 = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C4493y9) interfaceC4466x92).a(TAG2, "Adding friendly view: " + childView.getClass().getSimpleName() + " with obstruction code: " + obstructionCode);
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        if (childView instanceof Fi) {
            return;
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
            } else if (b == 1) {
                C4491y7 c4491y7 = this.e;
                InterfaceC4466x9 interfaceC4466x92 = c4491y7.f;
                if (interfaceC4466x92 != null) {
                    ((C4493y9) interfaceC4466x92).c("HtmlAdTracker", "onActivityStopped");
                }
                R8 r8 = c4491y7.g;
                if (r8 != null) {
                    Intrinsics.checkNotNullExpressionValue(r8.d, "TAG");
                    r8.c.a();
                    r8.e.removeCallbacksAndMessages(null);
                    r8.b.clear();
                }
                C3885b8 c3885b8 = c4491y7.h;
                if (c3885b8 != null) {
                    c3885b8.e();
                }
            } else if (b == 2) {
                C4491y7 c4491y72 = this.e;
                InterfaceC4466x9 interfaceC4466x93 = c4491y72.f;
                if (interfaceC4466x93 != null) {
                    ((C4493y9) interfaceC4466x93).c("HtmlAdTracker", "onActivityDestroyed");
                }
                R8 r82 = c4491y72.g;
                if (r82 != null) {
                    r82.a.clear();
                    r82.b.clear();
                    r82.c.a();
                    r82.e.removeMessages(0);
                    r82.c.b();
                }
                c4491y72.g = null;
                C3885b8 c3885b82 = c4491y72.h;
                if (c3885b82 != null) {
                    c3885b82.b();
                }
                c4491y72.h = null;
            } else {
                Intrinsics.checkNotNullExpressionValue(this.g, "TAG");
            }
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x94 = this.f;
            if (interfaceC4466x94 != null) {
                String TAG2 = this.g;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C4493y9) interfaceC4466x94).b(TAG2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
        } finally {
            this.d.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            String TAG = this.g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C4493y9) interfaceC4466x9).a(TAG, "destroy");
        }
        View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.e.b(b);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.d.b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
