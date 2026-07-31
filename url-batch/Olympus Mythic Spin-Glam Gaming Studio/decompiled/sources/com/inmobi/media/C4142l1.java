package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4142l1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC4168m1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4142l1(AbstractC4168m1 abstractC4168m1, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.a = abstractC4168m1;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4142l1(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4142l1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        com.inmobi.media.ads.network.common.model.Ad b = this.a.b(0);
        if (b == null || !Intrinsics.areEqual(b.getImpressionId(), this.b)) {
            C4493y9 c4493y9 = this.a.i;
            if (c4493y9 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y9.b("m1", "Impression ID is null for saveBlob");
            }
        } else {
            this.a.a(b, this.c);
            C4493y9 c4493y92 = this.a.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y92.c("m1", "Updated blob " + this.c);
            }
        }
        return Unit.INSTANCE;
    }
}
