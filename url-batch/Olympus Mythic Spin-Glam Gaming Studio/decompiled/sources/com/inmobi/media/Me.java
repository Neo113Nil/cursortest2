package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class Me implements Bj, Ih, InterfaceC3982f {
    public final View a;
    public final MediaView b;
    public final Ni c;
    public final AbstractC3984f1 d;
    public final L4 e;
    public final C3864ad f;
    public final Rc g;
    public final Wc h;

    public Me(View view, MediaView mediaView, Ni renderedStateCache, AbstractC3984f1 adSessionManager, L4 contextualDataHandler, C3864ad nativeBeaconProcessor, Rc nativeAdUnitComponent, Wc stateMachine) {
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = view;
        this.b = mediaView;
        this.c = renderedStateCache;
        this.d = adSessionManager;
        this.e = contextualDataHandler;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        Xh xh;
        C4493y9 c4493y9 = this.g.a.a.c;
        if (c4493y9 == null || (xh = c4493y9.a) == null) {
            return;
        }
        xh.a();
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData nativeViewData) {
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.h.a(new He(new Ie(this.c, new C4106jh(nativeViewData, this.b, this.a), this.e, this.d, this.f, this.g), this.h), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.inmobi.media.InterfaceC3982f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        Ke ke;
        int i;
        if (continuation instanceof Ke) {
            ke = (Ke) continuation;
            int i2 = ke.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ke.c = i2 - Integer.MIN_VALUE;
                Object obj = ke.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ke.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC3984f1 abstractC3984f1 = this.d;
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
                    C4496yc c4496yc = (C4496yc) this.g.g.getValue();
                    ke.c = 1;
                    c4496yc.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C4443wc(c4496yc, null), ke);
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
                this.e.b();
                Wc wc = this.h;
                C4076id c4076id = new C4076id();
                ke.c = 2;
            }
        }
        ke = new Ke(this, (ContinuationImpl) continuation);
        Object obj2 = ke.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ke.c;
        if (i != 0) {
        }
        this.e.b();
        Wc wc2 = this.h;
        C4076id c4076id2 = new C4076id();
        ke.c = 2;
    }
}
