package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4404v extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4430w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C3897bk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4404v(C4430w c4430w, String str, C3897bk c3897bk, Continuation continuation) {
        super(2, continuation);
        this.b = c4430w;
        this.c = str;
        this.d = c3897bk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4404v(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4404v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C4430w c4430w = this.b;
        String str = this.c;
        C3897bk c3897bk = this.d;
        this.a = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C4351t(c4430w));
        Picasso picasso = C4027gg.a;
        C4027gg.b(c4430w.a).load(str).tag(c4430w.e).transform(new C3893bg(Bitmap.Config.RGB_565)).into(c3897bk, new C4377u(c4430w, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
