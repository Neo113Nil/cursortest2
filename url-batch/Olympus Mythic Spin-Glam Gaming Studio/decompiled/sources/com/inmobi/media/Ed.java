package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes10.dex */
public final class Ed extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Qd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ed(Qd qd, Continuation continuation) {
        super(2, continuation);
        this.b = qd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ed(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ed(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r14 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r14.a(r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Fd(r14, null), r13) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Qd qd = this.b;
            InterfaceC4466x9 l = qd.l();
            if (l != null) {
                ((C4493y9) l).a("NativeLoadingState", "fireAdLoadCalledBeacons - firing ad load called beacons");
            }
            ((Aj) qd.g.getValue()).a(C4052hf.a);
            Qd qd2 = this.b;
            this.a = 1;
            qd2.getClass();
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Qd qd3 = this.b;
            JsonAssetObject assetsObject = qd3.b.b.getAssetsObject();
            if ((assetsObject != null ? assetsObject.getMedia() : null) == null) {
                InterfaceC4466x9 l2 = qd3.l();
                if (l2 != null) {
                    ((C4493y9) l2).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - no media assets, skipping");
                }
            } else {
                InterfaceC4466x9 l3 = qd3.l();
                if (l3 != null) {
                    ((C4493y9) l3).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - media assets found, setting up listener");
                }
                BuildersKt__Builders_commonKt.launch$default(qd3.e, null, null, new Hd(new Kd(((C4496yc) qd3.b.g.getValue()).e), null, qd3), 3, null);
            }
            Qd qd4 = this.b;
            this.a = 3;
            qd4.getClass();
            Object supervisorScope = SupervisorKt.supervisorScope(new Nd(qd4, null), this);
            if (supervisorScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                supervisorScope = Unit.INSTANCE;
            }
        }
        Df df = Df.a;
        this.a = 2;
    }
}
