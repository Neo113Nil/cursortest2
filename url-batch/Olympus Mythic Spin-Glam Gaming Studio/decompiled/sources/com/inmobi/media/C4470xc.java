package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4470xc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4496yc b;
    public final /* synthetic */ G6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4470xc(C4496yc c4496yc, G6 g6, Continuation continuation) {
        super(2, continuation);
        this.b = c4496yc;
        this.c = g6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4470xc(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4470xc(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r13.a(r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC4223o2 nm;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4496yc c4496yc = this.b;
            F6 f6 = c4496yc.d;
            G6 experienceModel = this.c;
            f6.getClass();
            Intrinsics.checkNotNullParameter(experienceModel, "experienceModel");
            if (experienceModel instanceof Wj) {
                nm = new Vj(f6.a, f6.b, (Wj) experienceModel, f6.c, f6.d);
            } else {
                if (!(experienceModel instanceof Om)) {
                    throw new NoWhenBranchMatchedException();
                }
                nm = new Nm(f6.a, f6.b, (Om) experienceModel, f6.c, f6.d);
            }
            c4496yc.b = nm;
            AbstractC4223o2 abstractC4223o2 = this.b.b;
            if (abstractC4223o2 != null) {
                this.a = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.c;
            }
            ResultKt.throwOnFailure(obj);
        }
        C4496yc c4496yc2 = this.b;
        AbstractC4223o2 abstractC4223o22 = c4496yc2.b;
        if (abstractC4223o22 != null) {
            MediaView mediaView = c4496yc2.c;
            this.a = 2;
        }
        return this.b.c;
    }
}
