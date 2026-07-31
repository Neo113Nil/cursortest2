package com.inmobi.media;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes12.dex */
public final class Jm extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Nm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jm(Nm nm, Continuation continuation) {
        super(2, continuation);
        this.c = nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Jm jm = new Jm(this.c, continuation);
        jm.b = obj;
        return jm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Jm jm = new Jm(this.c, (Continuation) obj2);
        jm.b = (AbstractC4295qm) obj;
        return jm.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4295qm abstractC4295qm = (AbstractC4295qm) this.b;
            Nm nm = this.c;
            this.a = 1;
            if (nm.c.b.isEmpty()) {
                C4493y9 c4493y9 = nm.e;
                if (c4493y9 != null) {
                    c4493y9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                obj2 = Unit.INSTANCE;
            } else {
                if (nm.i == null) {
                    nm.i = new S3(nm.a, nm.b, nm.c.h, nm.e);
                    nm.c();
                }
                S3 s3 = nm.i;
                if ((s3 == null || !Intrinsics.areEqual(s3.i, U3.a)) ? false : abstractC4295qm instanceof Hn) {
                    S3 s32 = nm.i;
                    if (s32 != null) {
                        s32.a(nm.c.b);
                    }
                } else if (abstractC4295qm instanceof C4243om) {
                    S3 s33 = nm.i;
                    if (s33 != null) {
                        if (Intrinsics.areEqual(s33.i, T3.a)) {
                            obj2 = BuildersKt.withContext(Dispatchers.getMain(), new Lm(nm, s33, null), this);
                            if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            }
                        } else {
                            C4493y9 c4493y92 = nm.e;
                            if (c4493y92 != null) {
                                c4493y92.a("VideoExperienceManager", "Companion Ad is not Available");
                            }
                            Map a = Hk.a(nm.c.h.a);
                            C4425vk c4425vk = C4425vk.a;
                            C4425vk.b("CompanionAdDropped", a, EnumC4530zk.a);
                            obj2 = BuildersKt.withContext(Dispatchers.getMain(), new Km(s33, null), this);
                            if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj2 = Unit.INSTANCE;
                            }
                        }
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    }
                    obj2 = Unit.INSTANCE;
                    if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                }
                obj2 = Unit.INSTANCE;
            }
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
