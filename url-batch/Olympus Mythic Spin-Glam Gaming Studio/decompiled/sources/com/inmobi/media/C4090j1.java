package com.inmobi.media;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4090j1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC4168m1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ K2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4090j1(AbstractC4168m1 abstractC4168m1, String str, K2 k2, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.a = abstractC4168m1;
        this.b = str;
        this.c = k2;
        this.d = str2;
        this.e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4090j1(this.a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4090j1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad b = this.a.b(0);
            if (b == null || !Intrinsics.areEqual(b.getImpressionId(), this.b)) {
                C4493y9 c4493y9 = this.a.i;
                if (c4493y9 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y9.c("m1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC4476xi) this.c).c(this.d, this.e, "");
            } else {
                String webVast = b.getWebVast();
                ((GestureDetectorOnGestureListenerC4476xi) this.c).c(this.d, this.e, webVast);
                C4493y9 c4493y92 = this.a.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y92.c("m1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e) {
            C4493y9 c4493y93 = this.a.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y93.a("m1", "Exception while getBlob", e);
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        return Unit.INSTANCE;
    }
}
