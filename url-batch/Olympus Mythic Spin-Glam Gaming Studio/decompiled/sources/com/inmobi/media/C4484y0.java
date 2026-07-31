package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4484y0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AdQualityResult b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4484y0(AdQualityResult adQualityResult, Continuation continuation) {
        super(2, continuation);
        this.b = adQualityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4484y0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4484y0(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            I0 i0 = (I0) F0.a.getValue();
            String imageLocation = this.b.getImageLocation();
            this.a = 1;
            Object a = i0.a.a("ad_quality_db", "image_location=?", new String[]{imageLocation}, this);
            if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a = Unit.INSTANCE;
            }
            if (a == coroutine_suspended) {
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
