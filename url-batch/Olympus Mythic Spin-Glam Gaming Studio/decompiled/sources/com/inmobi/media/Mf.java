package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class Mf extends AbstractC3981eo {
    public final AbstractC4008fo d;
    public Oe e;
    public final C4518z8 f;
    public final InterfaceC4466x9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(Context context, GestureDetectorOnGestureListenerC4476xi adContainer, AbstractC4008fo mViewableAd, CoroutineScope hybridScope, Oe oe, C4518z8 c4518z8, InterfaceC4466x9 interfaceC4466x9) {
        super(adContainer);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        Intrinsics.checkNotNullParameter(hybridScope, "hybridScope");
        this.d = mViewableAd;
        this.e = oe;
        this.f = c4518z8;
        this.g = interfaceC4466x9;
        CoroutineScope a = X4.a(hybridScope);
        Intrinsics.checkNotNullParameter(context, "context");
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
            ((C4493y9) interfaceC4466x9).b("Mf", "initializeOMSDK called");
        }
        int i = AbstractC4499yf.a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        AbstractC4499yf.a(applicationContext);
        BuildersKt__Builders_commonKt.launch$default(a, null, null, new Lf(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Mf mf, ContinuationImpl continuationImpl) {
        Kf kf;
        int i;
        C4518z8 c4518z8;
        InterfaceC4466x9 interfaceC4466x9;
        mf.getClass();
        if (continuationImpl instanceof Kf) {
            kf = (Kf) continuationImpl;
            int i2 = kf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kf.c = i2 - Integer.MIN_VALUE;
                Object obj = kf.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kf.c;
                Unit unit = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Df df = Df.a;
                    kf.c = 1;
                    Context context = AbstractC4002fj.a;
                    obj = context == null ? "" : BuildersKt.withContext(Dispatchers.getIO(), new Bf(context, null), kf);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                c4518z8 = mf.f;
                if (c4518z8 != null) {
                    Oe oe = mf.e;
                    if (oe != null) {
                        oe.a(str, c4518z8.a, c4518z8.b, c4518z8.d, c4518z8.c, c4518z8.e);
                        unit = Unit.INSTANCE;
                    }
                }
                interfaceC4466x9 = mf.g;
                if (interfaceC4466x9 != null) {
                    Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
                    ((C4493y9) interfaceC4466x9).a("Mf", "OmidInfo is null, cannot track ad");
                    Unit unit2 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        kf = new Kf(mf, continuationImpl);
        Object obj2 = kf.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kf.c;
        Unit unit3 = null;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        c4518z8 = mf.f;
        if (c4518z8 != null) {
        }
        interfaceC4466x9 = mf.g;
        if (interfaceC4466x9 != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final View c() {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
            ((C4493y9) interfaceC4466x9).c("Mf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void d() {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
            ((C4493y9) interfaceC4466x9).a("Mf", "stopTrackingForImpression");
        }
        this.d.d();
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView, FriendlyObstructionPurpose friendlyObstruction) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(friendlyObstruction, "obstructionCode");
        Oe oe = this.e;
        if (oe != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(friendlyObstruction, "friendlyObstruction");
            if (oe.c == null) {
                InterfaceC4466x9 interfaceC4466x9 = oe.b;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            InterfaceC4466x9 interfaceC4466x92 = oe.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a(AbstractC3984f1.f, "addObstruction");
            }
            X4.a(oe.a, new Y0(oe, childView, friendlyObstruction, null));
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(View childView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Oe oe = this.e;
        if (oe != null) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            if (oe.c == null) {
                return;
            }
            X4.a(oe.a, new C3878b1(oe, childView, null));
        }
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Map map) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
            ((C4493y9) interfaceC4466x9).a("Mf", "startTrackingForImpression");
        }
        this.d.a(map);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a(Context context, byte b) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.AbstractC4008fo
    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue("Mf", "TAG");
            ((C4493y9) interfaceC4466x9).c("Mf", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e = null;
        this.d.a();
    }
}
