package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.go, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4035go extends AbstractC4008fo {
    public final GestureDetectorOnGestureListenerC4476xi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4035go(GestureDetectorOnGestureListenerC4476xi mRenderView) {
        super(mRenderView);
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.d = mRenderView;
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Map map) {
    }

    public final void b(final View view) {
        this.d.getWebViewFactory().b(new Function1() { // from class: com.inmobi.media.go$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4035go.a(view, (Fi) obj);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View c() {
        this.b = new WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void d() {
    }

    public static final Unit b(View view, Fi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(View view, Fi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = it.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return Unit.INSTANCE;
    }

    public final void c(final View view) {
        this.d.getWebViewFactory().b(new Function1() { // from class: com.inmobi.media.go$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4035go.b(view, (Fi) obj);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
        b(childView);
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
        c(childView);
    }
}
