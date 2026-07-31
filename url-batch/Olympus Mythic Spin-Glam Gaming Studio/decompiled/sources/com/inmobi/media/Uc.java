package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Uc extends PublisherCallbacks {
    public final C4080ih a;
    public final C4260pd b;
    public final WeakReference c;

    public Uc(InMobiNative inMobiNative, C4080ih publisherListenersModel, C4260pd nativeFlowManagerNotifier) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(publisherListenersModel, "publisherListenersModel");
        Intrinsics.checkNotNullParameter(nativeFlowManagerNotifier, "nativeFlowManagerNotifier");
        this.a = publisherListenersModel;
        this.b = nativeFlowManagerNotifier;
        this.c = new WeakReference(inMobiNative);
    }

    public static final Unit b(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit c(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit d(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit e(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit f(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit g(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit h(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public final void a(Function1 function1) {
        InMobiNative inMobiNative = (InMobiNative) this.c.get();
        if (inMobiNative == null) {
            Xb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            function1.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.a(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.b(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.c(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        onAdLoadFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.a(Uc.this, info, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final Fk fk) {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.a(Uc.this, fk, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.a(Uc.this, status, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z) {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.a(z, this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.d(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.e(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.f(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.g(Uc.this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.h(Uc.this, (InMobiNative) obj);
            }
        });
    }

    public static final Unit a(Uc uc, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Nc nc = uc.b.a.d.b;
        nc.getClass();
        Bj bj = nc.c;
        W6 w6 = bj instanceof W6 ? (W6) bj : null;
        if (w6 != null) {
            InterfaceC4466x9 l = w6.l();
            if (l != null) {
                ((C4493y9) l).a("AUM-FetchedState", "Inflate Called");
            }
            C4154ld c4154ld = (C4154ld) w6;
            InterfaceC4466x9 l2 = c4154ld.l();
            if (l2 != null) {
                ((C4493y9) l2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            c4154ld.j.a(new Pd(c4154ld.f, c4154ld.g, c4154ld.h, c4154ld.i, c4154ld.j), c4154ld);
        }
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return Unit.INSTANCE;
    }

    public final void a(final C4261pe pubData, final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        Intrinsics.checkNotNullParameter(info, "info");
        a(new Function1() { // from class: com.inmobi.media.Uc$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Uc.a(Uc.this, pubData, info, (InMobiNative) obj);
            }
        });
    }

    public static final Unit a(Uc uc, C4261pe pubData, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        C4260pd c4260pd = uc.b;
        c4260pd.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        c4260pd.a.e = pubData;
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Uc uc, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = uc.a.c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(boolean z, Uc uc, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = uc.a.b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Uc uc, Fk fk, InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = uc.a.a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (fk != null) {
            fk.c();
        }
        return Unit.INSTANCE;
    }
}
