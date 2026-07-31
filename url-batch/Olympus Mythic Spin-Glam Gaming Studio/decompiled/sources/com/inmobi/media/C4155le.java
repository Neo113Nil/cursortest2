package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.le, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4155le extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4235oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155le(C4235oe c4235oe, Continuation continuation) {
        super(2, continuation);
        this.a = c4235oe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4155le(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4155le(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.g.setActivated(false);
        this.a.g.setFocusable(false);
        MediaPlayer mediaPlayer = this.a.c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        this.a.f.a();
        return Unit.INSTANCE;
    }
}
