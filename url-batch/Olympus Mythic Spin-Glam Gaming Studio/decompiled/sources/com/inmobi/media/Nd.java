package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class Nd extends SuspendLambda implements Function2 {
    public C3864ad a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Qd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nd(Qd qd, Continuation continuation) {
        super(2, continuation);
        this.d = qd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Nd nd = new Nd(this.d, continuation);
        nd.c = obj;
        return nd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Nd nd = new Nd(this.d, (Continuation) obj2);
        nd.c = (CoroutineScope) obj;
        return nd.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if (r15 == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        NativeMedia media;
        View view;
        K6 k6;
        C3864ad c3864ad;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            InterfaceC4466x9 l = this.d.l();
            if (l != null) {
                ((C4493y9) l).a("NativeLoadingState", "loadMediaViews - building experience loader");
            }
            Qd qd = this.d;
            Rc nativeAdUnitComponent = qd.b;
            AbstractC3984f1 adSessionManager = qd.d;
            Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
            Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
            JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
            String type = (assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType();
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new Md(Intrinsics.areEqual(type, "static") ? new Oj(nativeAdUnitComponent, adSessionManager) : Intrinsics.areEqual(type, "video") ? new C4427vm(nativeAdUnitComponent, adSessionManager) : new C3872al(nativeAdUnitComponent, adSessionManager), null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new Ld(this.d, null), 3, null);
            Qd qd2 = this.d;
            this.c = async$default;
            this.b = 1;
            obj = qd2.a(async$default2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3864ad = this.a;
                    view = (View) this.c;
                    ResultKt.throwOnFailure(obj);
                    this.d.a(null, view, c3864ad);
                    return Unit.INSTANCE;
                }
                view = (View) this.c;
                ResultKt.throwOnFailure(obj);
                k6 = (K6) obj;
                if (!(k6 instanceof H6)) {
                    InterfaceC4466x9 l2 = this.d.l();
                    if (l2 != null) {
                        ((C4493y9) l2).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((H6) k6).a));
                    }
                    this.d.a(((H6) k6).a);
                } else {
                    if (!(k6 instanceof I6)) {
                        if (!(k6 instanceof J6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC4466x9 l3 = this.d.l();
                        if (l3 != null) {
                            ((C4493y9) l3).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                        }
                        Qd qd3 = this.d;
                        Jl jl = ((J6) k6).a;
                        C3903c0 c3903c0 = qd3.a.a.d;
                        Rc rc = qd3.b;
                        Intrinsics.checkNotNullParameter(rc, "<this>");
                        C3864ad c3864ad2 = new C3864ad(jl, c3903c0, new Ri(rc.a.b.g));
                        C4496yc c4496yc = (C4496yc) this.d.b.g.getValue();
                        this.c = view;
                        this.a = c3864ad2;
                        this.b = 3;
                        c4496yc.getClass();
                        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C4443wc(c4496yc, null), this);
                        if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext != coroutine_suspended) {
                            c3864ad = c3864ad2;
                            this.d.a(null, view, c3864ad);
                        }
                        return coroutine_suspended;
                    }
                    InterfaceC4466x9 l4 = this.d.l();
                    if (l4 != null) {
                        ((C4493y9) l4).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                    }
                    Qd qd4 = this.d;
                    I6 i6 = (I6) k6;
                    Jl jl2 = i6.b;
                    C3903c0 c3903c02 = qd4.a.a.d;
                    Rc rc2 = qd4.b;
                    Intrinsics.checkNotNullParameter(rc2, "<this>");
                    this.d.a(i6.a, view, new C3864ad(jl2, c3903c02, new Ri(rc2.a.b.g)));
                }
                return Unit.INSTANCE;
            }
            async$default = (Deferred) this.c;
            ResultKt.throwOnFailure(obj);
        }
        View view2 = (View) obj;
        this.c = view2;
        this.b = 2;
        Object await = async$default.await(this);
        if (await != coroutine_suspended) {
            view = view2;
            obj = await;
            k6 = (K6) obj;
            if (!(k6 instanceof H6)) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
