package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes5.dex */
public final class ad extends SuspendLambda implements Function2 {
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(cd cdVar, Continuation continuation) {
        super(2, continuation);
        this.e = cdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ad adVar = new ad(this.e, continuation);
        adVar.d = obj;
        return adVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ad adVar = new ad(this.e, (Continuation) obj2);
        adVar.d = (CoroutineScope) obj;
        return adVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r2) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred async$default3;
        Deferred deferred;
        Deferred deferred2;
        mc mcVar;
        Deferred deferred3;
        Object await;
        mc mcVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.d;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new yc(this.e, null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new zc(this.e, null), 3, null);
            async$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new xc(this.e, null), 3, null);
            this.d = async$default2;
            this.b = async$default3;
            this.c = 1;
            Object await2 = async$default.await(this);
            if (await2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = async$default2;
            deferred2 = async$default3;
            obj = await2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mcVar2 = (mc) this.b;
                    mcVar = (mc) this.d;
                    ResultKt.throwOnFailure(obj);
                    String str = (String) obj;
                    kc kcVar = this.e.d;
                    kcVar.getClass();
                    boolean z2 = false;
                    if (mcVar != null && (r5 = mcVar.a) != null) {
                        synchronized (kc.b) {
                            String c = ((qg1) kcVar.a).c("google_advertising_id_key");
                            if (c != null) {
                            }
                            z = false;
                        }
                        z2 = z;
                    }
                    this.e.d.a(mcVar, mcVar2, str);
                    return new oc(mcVar, mcVar2, z2, str);
                }
                mcVar = (mc) this.b;
                deferred3 = (Deferred) this.d;
                ResultKt.throwOnFailure(obj);
                mc mcVar3 = (mc) obj;
                this.d = mcVar;
                this.b = mcVar3;
                this.c = 3;
                await = deferred3.await(this);
                if (await != coroutine_suspended) {
                    return coroutine_suspended;
                }
                mcVar2 = mcVar3;
                obj = await;
                String str2 = (String) obj;
                kc kcVar2 = this.e.d;
                kcVar2.getClass();
                boolean z22 = false;
                if (mcVar != null) {
                    synchronized (kc.b) {
                    }
                }
                this.e.d.a(mcVar, mcVar2, str2);
                return new oc(mcVar, mcVar2, z22, str2);
            }
            deferred2 = (Deferred) this.b;
            deferred = (Deferred) this.d;
            ResultKt.throwOnFailure(obj);
        }
        mc mcVar4 = (mc) obj;
        this.d = deferred2;
        this.b = mcVar4;
        this.c = 2;
        Object await3 = deferred.await(this);
        if (await3 == coroutine_suspended) {
            return coroutine_suspended;
        }
        Deferred deferred4 = deferred2;
        mcVar = mcVar4;
        obj = await3;
        deferred3 = deferred4;
        mc mcVar32 = (mc) obj;
        this.d = mcVar;
        this.b = mcVar32;
        this.c = 3;
        await = deferred3.await(this);
        if (await != coroutine_suspended) {
        }
    }
}
