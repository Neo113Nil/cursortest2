package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.ironsource.X3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class H7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ V7 a;
    public final /* synthetic */ C4202n8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(Continuation continuation, V7 v7, C4202n8 c4202n8) {
        super(2, continuation);
        this.a = v7;
        this.b = c4202n8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new H7(continuation, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H7((Continuation) obj2, this.a, this.b).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.l.set(Jg.c);
        this.a.p.seekTo(0L);
        C4439w8 c4439w8 = this.a.z;
        if (!c4439w8.g && (surface = c4439w8.e) != null) {
            c4439w8.g = true;
            c4439w8.b.setVideoSurface(surface);
        }
        V7 v7 = this.a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.b.b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.b.a);
        htmlVideoPlaybackState.setLatency(Boxing.boxLong(System.currentTimeMillis() - this.a.u));
        htmlVideoPlaybackState.setMuted(this.a.y.e);
        EnumC4307r8[] enumC4307r8Arr = EnumC4307r8.a;
        htmlVideoPlaybackState.setState(X3.i.s);
        htmlVideoPlaybackState.setTime(this.a.p.getCurrentPosition() / 1000.0f);
        v7.a(new C4229o8(htmlVideoPlaybackState, this.b.c));
        return Unit.INSTANCE;
    }
}
