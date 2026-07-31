package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Jf extends AbstractC3981eo {
    public static final /* synthetic */ int g = 0;
    public final AbstractC4008fo d;
    public InterfaceC4011g1 e;
    public final InterfaceC4466x9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jf(GestureDetectorOnGestureListenerC4476xi adContainer, AbstractC4008fo mViewableAd, InterfaceC4011g1 interfaceC4011g1, InterfaceC4466x9 interfaceC4466x9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        this.d = mViewableAd;
        this.e = interfaceC4011g1;
        this.f = interfaceC4466x9;
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
            ((C4493y9) interfaceC4466x9).a("Jf", "addFriendlyView with obstruction code: " + obstructionCode);
        }
        InterfaceC4011g1 interfaceC4011g1 = this.e;
        if (interfaceC4011g1 != null) {
            C4473xf c4473xf = (C4473xf) interfaceC4011g1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(obstructionCode, "obstructionCode");
            if (C4473xf.a(c4473xf.e) && (adSession = c4473xf.f) != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
            }
        }
        this.d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View c() {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
            ((C4493y9) interfaceC4466x9).c("Jf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void d() {
        try {
            try {
                InterfaceC4466x9 interfaceC4466x9 = this.f;
                if (interfaceC4466x9 != null) {
                    Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
                    ((C4493y9) interfaceC4466x9).a("Jf", "stopTrackingForImpression");
                }
                InterfaceC4011g1 interfaceC4011g1 = this.e;
                if (interfaceC4011g1 != null) {
                    C4473xf c4473xf = (C4473xf) interfaceC4011g1;
                    AdSession adSession = c4473xf.f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c4473xf.f = null;
                    c4473xf.e = (byte) 3;
                    c4473xf.c = null;
                }
                this.d.d();
            } catch (Exception e) {
                InterfaceC4466x9 interfaceC4466x92 = this.f;
                if (interfaceC4466x92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
                    ((C4493y9) interfaceC4466x92).b("Jf", "Exception in stopTrackingForImpression with message : " + e.getMessage());
                }
                this.d.d();
            }
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView) {
        AdSession adSession;
        Intrinsics.checkNotNullParameter(childView, "childView");
        InterfaceC4011g1 interfaceC4011g1 = this.e;
        if (interfaceC4011g1 != null) {
            C4473xf c4473xf = (C4473xf) interfaceC4011g1;
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (C4473xf.a(c4473xf.e) && (adSession = c4473xf.f) != null) {
                adSession.removeFriendlyObstruction(childView);
            }
        }
        this.d.a(childView);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Map map) {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
            ((C4493y9) interfaceC4466x9).a("Jf", "startTrackingForImpression");
        }
        try {
            try {
                if (this.c.getViewability().getOmidConfig().isOmidEnabled()) {
                    Rf.a.getClass();
                    if (Omid.isActive()) {
                        View b = this.d.b();
                        WebView webView = b instanceof WebView ? (WebView) b : null;
                        if (webView != null) {
                            InterfaceC4466x9 interfaceC4466x92 = this.f;
                            if (interfaceC4466x92 != null) {
                                Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
                                ((C4493y9) interfaceC4466x92).a("Jf", "creating OMSDK session");
                            }
                            InterfaceC4011g1 interfaceC4011g1 = this.e;
                            if (interfaceC4011g1 != null) {
                                ((C4473xf) interfaceC4011g1).a(webView, map);
                            }
                        }
                    }
                }
                this.d.a(map);
            } catch (Exception e) {
                InterfaceC4466x9 interfaceC4466x93 = this.f;
                if (interfaceC4466x93 != null) {
                    Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
                    ((C4493y9) interfaceC4466x93).b("Jf", "Exception in startTrackingForImpression with message : " + e.getMessage());
                }
                this.d.a(map);
            }
        } catch (Throwable th) {
            this.d.a(map);
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
            ((C4493y9) interfaceC4466x9).c("Jf", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.e = null;
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue("Jf", "TAG");
                ((C4493y9) interfaceC4466x92).a("Jf", "Exception in destroy with message", e);
            }
        } finally {
            this.d.a();
        }
    }
}
