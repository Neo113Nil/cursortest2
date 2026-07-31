package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes12.dex */
public final class He extends AbstractC4483y implements Bj, InterfaceC3898bl, InterfaceC3982f {
    public final Ie b;
    public final Wc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public He(Ie provider, Wc stateMachine) {
        super(provider.g.a);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = provider;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeRenderedState", "Initialize Called");
        }
        Bj bj = this.b.g.c.c;
        I i = bj instanceof I ? (I) bj : null;
        if (i != null) {
            i.g();
        }
        Ie ie = this.b;
        Ni ni = ie.b;
        if (!ni.a) {
            ni.a = true;
            AbstractC3984f1 abstractC3984f1 = ie.e;
            if (abstractC3984f1.c == null) {
                InterfaceC4466x9 interfaceC4466x9 = abstractC3984f1.b;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "Failed to startAdSession. adSession is null");
                }
            } else {
                InterfaceC4466x9 interfaceC4466x92 = abstractC3984f1.b;
                if (interfaceC4466x92 != null) {
                    ((C4493y9) interfaceC4466x92).a(AbstractC3984f1.f, "startAdSession");
                }
                X4.a(abstractC3984f1.a, new C3904c1(abstractC3984f1, null));
            }
            Ie ie2 = this.b;
            AbstractC3984f1 abstractC3984f12 = ie2.e;
            ViewGroup adView = ie2.c.a.getParentView();
            abstractC3984f12.getClass();
            Intrinsics.checkNotNullParameter(adView, "adView");
            if (abstractC3984f12.c == null) {
                InterfaceC4466x9 interfaceC4466x93 = abstractC3984f12.b;
                if (interfaceC4466x93 != null) {
                    ((C4493y9) interfaceC4466x93).a(AbstractC3984f1.f, "Failed to registerAdView. adSession is null");
                }
            } else {
                InterfaceC4466x9 interfaceC4466x94 = abstractC3984f12.b;
                if (interfaceC4466x94 != null) {
                    ((C4493y9) interfaceC4466x94).a(AbstractC3984f1.f, "registerAdView");
                }
                X4.a(abstractC3984f12.a, new Z0(abstractC3984f12, adView, null));
            }
            G g = this.a.b;
            Intrinsics.checkNotNullParameter(g, "<this>");
            MetaInfo metaInfo = g.d;
            if (Intrinsics.areEqual(metaInfo != null ? metaInfo.getCreativeType() : null, "video")) {
                this.b.e.a(true);
            } else {
                this.b.e.a();
            }
        }
        InterfaceC4466x9 l2 = l();
        if (l2 != null) {
            ((C4493y9) l2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new C4366te(((C4496yc) this.b.g.g.getValue()).e, null, this), 3, null);
        X4.a(this.b.h, new C4287qe(this, null));
        Ie ie3 = this.b;
        if (ie3.b.b) {
            InterfaceC4466x9 l3 = l();
            if (l3 != null) {
                ((C4493y9) l3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            BuildersKt__Builders_commonKt.launch$default(ie3.h, null, null, new Fe(this, null), 3, null);
        }
        if (this.b.b.c) {
            InterfaceC4466x9 l4 = l();
            if (l4 != null) {
                ((C4493y9) l4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g2 = this.a.b;
            Intrinsics.checkNotNullParameter(g2, "<this>");
            if (g2.m.a == 0) {
                InterfaceC4466x9 l5 = l();
                if (l5 != null) {
                    ((C4493y9) l5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new Be(this, null), 3, null);
            }
        }
        if (!this.b.b.d) {
            if (H4.a(this.a.b, "mrc50").isEmpty()) {
                InterfaceC4466x9 l6 = l();
                if (l6 != null) {
                    ((C4493y9) l6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map a = Hk.a(((Qc) this.b.g.f.getValue()).a);
                C4425vk c4425vk = C4425vk.a;
                C4425vk.b("MRCViewable50Started", a, EnumC4530zk.a);
                BuildersKt__Builders_commonKt.launch$default(this.b.h, null, null, new De(this, null), 3, null);
            }
        }
        C4496yc c4496yc = (C4496yc) this.b.g.g.getValue();
        MutableStateFlow windowFlow = ((Xo) this.b.l.getValue()).b;
        c4496yc.getClass();
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        C4493y9 c4493y9 = c4496yc.a;
        if (c4493y9 != null) {
            c4493y9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC4223o2 abstractC4223o2 = c4496yc.b;
        if (abstractC4223o2 != null) {
            abstractC4223o2.a(windowFlow);
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeRenderedState", "Finalize Called");
        }
        X4.a(this.b.k(), new C4313re(this, null));
        N3.a(this.b.h);
        ((Sd) this.b.k.getValue()).a.a();
        ((C4338sd) this.b.j.getValue()).a();
        P6.a(((Xo) this.b.l.getValue()).a);
    }

    @Override // com.inmobi.media.InterfaceC3898bl
    public final void d() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeRenderedState", "unTrackViews");
        }
        C4496yc c4496yc = (C4496yc) this.b.g.g.getValue();
        C4493y9 c4493y9 = c4496yc.a;
        if (c4493y9 != null) {
            c4493y9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC4223o2 abstractC4223o2 = c4496yc.b;
        if (abstractC4223o2 != null) {
            abstractC4223o2.b();
        }
        Ie ie = this.b;
        C4106jh c4106jh = ie.c;
        this.c.a(new Me(c4106jh.c, c4106jh.b, ie.b, ie.e, ie.d, ie.f, ie.g, this.c), this);
    }

    public final void m() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        Ie ie = this.b;
        ie.b.c = true;
        Map a = Hk.a(((Qc) ie.g.f.getValue()).a);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdImpressionSuccessful", a, EnumC4530zk.a);
        this.b.g.c.g();
        this.b.f.b.f.a(C4052hf.a);
        AbstractC3984f1 abstractC3984f1 = this.b.e;
        if (abstractC3984f1.e == null) {
            InterfaceC4466x9 interfaceC4466x9 = abstractC3984f1.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = abstractC3984f1.b;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a(AbstractC3984f1.f, "registerImpression");
        }
        X4.a(abstractC3984f1.a, new C3852a1(abstractC3984f1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0122, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0124, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        if (r9 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.inmobi.media.InterfaceC3982f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C4419ve c4419ve;
        int i;
        if (continuation instanceof C4419ve) {
            c4419ve = (C4419ve) continuation;
            int i2 = c4419ve.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4419ve.c = i2 - Integer.MIN_VALUE;
                Object obj = c4419ve.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4419ve.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC4466x9 l = l();
                    if (l != null) {
                        ((C4493y9) l).a("NativeRenderedState", "onDestroy");
                    }
                    AbstractC3984f1 abstractC3984f1 = this.b.e;
                    if (abstractC3984f1.c == null) {
                        InterfaceC4466x9 interfaceC4466x9 = abstractC3984f1.b;
                        if (interfaceC4466x9 != null) {
                            ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC4466x9 interfaceC4466x92 = abstractC3984f1.b;
                        if (interfaceC4466x92 != null) {
                            ((C4493y9) interfaceC4466x92).a(AbstractC3984f1.f, "stopAdSession");
                        }
                        X4.a(abstractC3984f1.a, new C3930d1(abstractC3984f1, null));
                    }
                    C4158lh c4158lh = (C4158lh) this.b.o.getValue();
                    C4106jh pubView = this.b.c;
                    c4158lh.getClass();
                    Intrinsics.checkNotNullParameter(pubView, "pubView");
                    pubView.a.getParentView().setOnClickListener(null);
                    View titleView = pubView.a.getTitleView();
                    if (titleView != null) {
                        titleView.setOnClickListener(null);
                    }
                    View descriptionView = pubView.a.getDescriptionView();
                    if (descriptionView != null) {
                        descriptionView.setOnClickListener(null);
                    }
                    ImageView iconView = pubView.a.getIconView();
                    if (iconView != null) {
                        iconView.setOnClickListener(null);
                    }
                    View ctaView = pubView.a.getCtaView();
                    if (ctaView != null) {
                        ctaView.setOnClickListener(null);
                    }
                    View advertiserView = pubView.a.getAdvertiserView();
                    if (advertiserView != null) {
                        advertiserView.setOnClickListener(null);
                    }
                    View ratingView = pubView.a.getRatingView();
                    if (ratingView != null) {
                        ratingView.setOnClickListener(null);
                    }
                    View view = pubView.c;
                    if (view != null) {
                        view.setOnClickListener(null);
                    }
                    C4496yc c4496yc = (C4496yc) this.b.g.g.getValue();
                    c4419ve.c = 1;
                    c4496yc.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C4443wc(c4496yc, null), c4419ve);
                    if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.b.d.b();
                Wc wc = this.c;
                C4076id c4076id = new C4076id();
                c4419ve.c = 2;
            }
        }
        c4419ve = new C4419ve(this, (ContinuationImpl) continuation);
        Object obj2 = c4419ve.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4419ve.c;
        if (i != 0) {
        }
        this.b.d.b();
        Wc wc2 = this.c;
        C4076id c4076id2 = new C4076id();
        c4419ve.c = 2;
    }
}
