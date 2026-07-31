package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4208ne extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4235oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4208ne(C4235oe c4235oe, Continuation continuation) {
        super(2, continuation);
        this.a = c4235oe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4208ne(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4208ne(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a.f.e()) {
            C4235oe c4235oe = this.a;
            MediaPlayer mediaPlayer = c4235oe.c;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c4235oe.a(c4235oe.k, c4235oe.j);
            X4.a(c4235oe.e, c4235oe.b, new W1(1.0f, false));
            c4235oe.i = false;
        } else {
            this.a.a();
        }
        return Unit.INSTANCE;
    }
}
