package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class Ga extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ VideoViewPosition b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga(Ha ha, VideoViewPosition videoViewPosition, String str, Continuation continuation) {
        super(2, continuation);
        this.a = ha;
        this.b = videoViewPosition;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ga(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ga) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a.a;
        VideoViewPosition newVideoViewPosition = this.b;
        String str = this.c;
        gestureDetectorOnGestureListenerC4476xi.getClass();
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "videoViewPosition");
        D8 d8 = gestureDetectorOnGestureListenerC4476xi.Z0;
        if (d8 != null) {
            Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
            if (!d8.g.get()) {
                A8[] a8Arr = {A8.c, A8.e, A8.f, A8.g};
                EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
                if (D8.a(d8, a8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    d8.k.a(newVideoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC4476xi.a(EnumC4465x8.j, str);
        } else {
            EnumC4465x8 enumC4465x8 = EnumC4465x8.e;
            EnumC4071i8[] enumC4071i8Arr2 = EnumC4071i8.a;
            C3991f8 obj2 = new C3991f8((Object) str);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC4476xi.a(enumC4465x8, AbstractC4494ya.a(obj2, C3991f8.class));
        }
        return Unit.INSTANCE;
    }
}
