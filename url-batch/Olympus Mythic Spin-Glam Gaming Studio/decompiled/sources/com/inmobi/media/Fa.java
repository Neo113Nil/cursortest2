package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class Fa extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa(Ha ha, Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, Continuation continuation) {
        super(2, continuation);
        this.a = ha;
        this.b = ref$ObjectRef;
        this.c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Fa(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fa) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, org.json.JSONObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            HtmlVideoPlaybackState obj2 = this.a.a.getPlaybackState();
            if (obj2 == null) {
                obj2 = new HtmlVideoPlaybackState();
            }
            Ref$ObjectRef ref$ObjectRef = this.b;
            Intrinsics.checkNotNullParameter(obj2, "obj");
            ref$ObjectRef.element = AbstractC4494ya.a(obj2, HtmlVideoPlaybackState.class);
            this.c.countDown();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.c.countDown();
            throw th;
        }
    }
}
