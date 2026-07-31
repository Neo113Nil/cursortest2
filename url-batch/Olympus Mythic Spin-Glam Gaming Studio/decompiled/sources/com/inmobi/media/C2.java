package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes11.dex */
public abstract class C2 extends AbstractC3984f1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2(CoroutineScope coroutineScope, InterfaceC4466x9 interfaceC4466x9) {
        super(coroutineScope, interfaceC4466x9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = C2.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC3984f1
    public final void a(boolean z) {
        if (this.e == null) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            return;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C4493y9) interfaceC4466x9).a(tag, "nonSkippableVideoAdLoaded - isAutoPlay: " + z);
        }
        try {
            X4.a(this.a, new C4512z2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.STANDALONE), null));
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            e.getStackTrace();
        }
    }

    public final void b(AbstractC4295qm abstractC4295qm) {
        MediaEvents mediaEvents;
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C4493y9) interfaceC4466x9).a(tag, "fireAdVideoEvent - received video event: " + abstractC4295qm);
        }
        if (abstractC4295qm instanceof C4269pm) {
            AdSession adSession = this.c;
            if (adSession != null) {
                ErrorType errorType = ErrorType.VIDEO;
                ((C4269pm) abstractC4295qm).getClass();
                adSession.error(errorType, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof C4218nn) {
            MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof Gn) {
            MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof Wm) {
            MediaEvents mediaEvents4 = this.d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof Hn) {
            MediaEvents mediaEvents5 = this.d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof Qn) {
            MediaEvents mediaEvents6 = this.d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof C4243om) {
            MediaEvents mediaEvents7 = this.d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof Jn) {
            MediaEvents mediaEvents8 = this.d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((Jn) abstractC4295qm).a, 0.0f);
                return;
            }
            return;
        }
        if (abstractC4295qm instanceof W1) {
            MediaEvents mediaEvents9 = this.d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((W1) abstractC4295qm).b);
                return;
            }
            return;
        }
        if (!(abstractC4295qm instanceof In) || (mediaEvents = this.d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f, boolean z) {
        if (this.e == null) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                String tag = this.g;
                Intrinsics.checkNotNullExpressionValue(tag, "tag");
                ((C4493y9) interfaceC4466x9).a(tag, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.b;
        if (interfaceC4466x92 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            ((C4493y9) interfaceC4466x92).a(tag2, "skippableVideoAdLoaded - skipOffset: " + f + ", isAutoPlay: " + z);
        }
        try {
            X4.a(this.a, new A2(this, VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.STANDALONE), null));
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            e.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC3984f1, com.inmobi.media.InterfaceC4111jm
    public final void a(AbstractC4295qm videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (videoEvent instanceof C4454wn) {
            return;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((C4493y9) interfaceC4466x9).a(tag, "trackAdVideoEvent - videoEvent: " + videoEvent);
        }
        if (this.d == null) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
        } else {
            X4.a(this.a, new B2(this, videoEvent, null));
        }
    }
}
