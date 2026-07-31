package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class O9 extends AbstractC4008fo {
    public final Fi d;
    public final C4491y7 e;
    public final C4493y9 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9(Fi container, Fi renderView, C4491y7 htmlAdTracker, C4493y9 c4493y9) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.d = renderView;
        this.e = htmlAdTracker;
        this.f = c4493y9;
        this.g = O9.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Map map) {
        View b;
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c4493y9.a(tag, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.d.setFriendlyViews(map);
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            c4493y92.a(tag2, "startTrackingVisibility");
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        Fi fi = gestureDetectorOnGestureListenerC4476xi instanceof Fi ? (Fi) gestureDetectorOnGestureListenerC4476xi : null;
        if (fi == null) {
            return;
        }
        C4491y7 c4491y7 = this.e;
        View b2 = b();
        if (b2 == null || (b = b()) == null) {
            return;
        }
        c4491y7.a(b2, b, fi.getVISIBILITY_CHANGE_LISTENER(), this.c.getViewability(), true);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View c() {
        this.b = new WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void d() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c4493y9.a(tag, "stopTrackingForImpression");
        }
        C4493y9 c4493y92 = this.f;
        if (c4493y92 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            c4493y92.a(tag2, "stopTrackingForVisibility");
        }
        C4491y7 c4491y7 = this.e;
        View b = b();
        if (b == null) {
            return;
        }
        c4491y7.b(b);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c4493y9.a(tag, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c4493y9.a(tag, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
                return;
            }
            if (b == 1) {
                C4491y7 c4491y7 = this.e;
                InterfaceC4466x9 interfaceC4466x9 = c4491y7.f;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).c("HtmlAdTracker", "onActivityStopped");
                }
                R8 r8 = c4491y7.g;
                if (r8 != null) {
                    String TAG = r8.d;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    r8.c.a();
                    r8.e.removeCallbacksAndMessages(null);
                    r8.b.clear();
                }
                C3885b8 c3885b8 = c4491y7.h;
                if (c3885b8 != null) {
                    c3885b8.e();
                    return;
                }
                return;
            }
            if (b == 2) {
                C4491y7 c4491y72 = this.e;
                InterfaceC4466x9 interfaceC4466x92 = c4491y72.f;
                if (interfaceC4466x92 != null) {
                    ((C4493y9) interfaceC4466x92).c("HtmlAdTracker", "onActivityDestroyed");
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
                return;
            }
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
        } catch (Exception e) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String tag2 = this.g;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                c4493y92.b(tag2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a() {
        C4493y9 c4493y9 = this.f;
        if (c4493y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            c4493y9.a(tag, "destroy");
        }
        if (b() != null) {
            C4493y9 c4493y92 = this.f;
            if (c4493y92 != null) {
                String tag2 = this.g;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                c4493y92.a(tag2, "stopTrackingForVisibility");
            }
            C4491y7 c4491y7 = this.e;
            View b = b();
            if (b != null) {
                c4491y7.b(b);
            }
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
