package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes13.dex */
public final class Qd extends AbstractC4483y implements Bj, InterfaceC3982f {
    public final Rc b;
    public final Wc c;
    public final AbstractC3984f1 d;
    public final CoroutineScope e;
    public final C4430w f;
    public final Lazy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(Rc nativeAdUnitComponent, Wc stateMachine) {
        super(nativeAdUnitComponent.a);
        NativeMedia media;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = nativeAdUnitComponent;
        this.c = stateMachine;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "<this>");
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        CoroutineScope coroutineScope = nativeAdUnitComponent.a.a.e;
        this.d = Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video") ? new Oe(coroutineScope, nativeAdUnitComponent.a.a.c) : new Pc(coroutineScope, nativeAdUnitComponent.a.a.c);
        this.e = X4.a(k());
        C4456x adComponent = nativeAdUnitComponent.a;
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f = new C4430w(adComponent.a.b, adChoice, adComponent.b.a.b.getNative().getAdChoiceConfig(), adComponent.a.c);
        this.g = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Qd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Qd.a(Qd.this);
            }
        });
    }

    public static final Aj a(final Qd qd) {
        return new Aj(new Zc(qd.a.a.d, null, null, 30), new Function0() { // from class: com.inmobi.media.Qd$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Qd.b(Qd.this);
            }
        });
    }

    public static final List b(Qd qd) {
        return H4.a("load_called", qd.b.a.b.g);
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
        N3.a(this.e);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new Ed(this, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC3982f
    public final Object a(Continuation continuation) {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadingState", "onDestroy");
        }
        Object a = this.c.a(new C4076id(), this, (ContinuationImpl) continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:10:0x0027, B:11:0x0041, B:13:0x0049, B:20:0x0038), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Deferred deferred, ContinuationImpl continuationImpl) {
        Od od;
        int i;
        InterfaceC4466x9 l;
        try {
            if (continuationImpl instanceof Od) {
                od = (Od) continuationImpl;
                int i2 = od.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    od.c = i2 - Integer.MIN_VALUE;
                    Object obj = od.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = od.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        od.c = 1;
                        obj = deferred.await(od);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    View view = (View) obj;
                    l = l();
                    if (l != null) {
                        ((C4493y9) l).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
                    }
                    return view;
                }
            }
            if (i != 0) {
            }
            View view2 = (View) obj;
            l = l();
            if (l != null) {
            }
            return view2;
        } catch (Exception e) {
            C4493y9 c4493y9 = this.b.a.a.c;
            if (c4493y9 == null) {
                return null;
            }
            c4493y9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e);
            return null;
        }
        od = new Od(this, continuationImpl);
        Object obj2 = od.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = od.c;
    }

    public final void a(MediaView mediaView, View view, C3864ad c3864ad) {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.c.a(new Dd(mediaView, view, this.d, c3864ad, this.b, this.c), this);
    }

    public final void a(short s) {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s));
        }
        this.c.a(new C4128kd(s, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.b, this.c), this);
    }
}
