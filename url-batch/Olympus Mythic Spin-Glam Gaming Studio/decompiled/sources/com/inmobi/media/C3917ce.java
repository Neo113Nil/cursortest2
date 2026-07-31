package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3917ce extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4025ge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3917ce(C4025ge c4025ge, Continuation continuation) {
        super(2, continuation);
        this.a = c4025ge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3917ce(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3917ce(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            InMobiVideoBridge.MediaPlayerRelease(this.a.j);
        } catch (Exception e) {
            C4493y9 c4493y9 = this.a.c;
            if (c4493y9 != null) {
                c4493y9.a("NativeMediaPlayer", "Failed to release MediaPlayer", e);
            }
        }
        return Unit.INSTANCE;
    }
}
