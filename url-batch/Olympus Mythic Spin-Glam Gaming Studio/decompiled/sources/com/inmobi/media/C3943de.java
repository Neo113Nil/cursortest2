package com.inmobi.media;

import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3943de extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4025ge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3943de(C4025ge c4025ge, Continuation continuation) {
        super(2, continuation);
        this.a = c4025ge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3943de(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3943de(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4025ge c4025ge = this.a;
        if (c4025ge.b.b) {
            En en = c4025ge.l;
            en.c();
            en.g = -1;
            en.b();
            MediaPlayer mediaPlayer = this.a.j;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.a.j;
            Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
            try {
                InMobiVideoBridge.MediaPlayerStart(mediaPlayer2);
            } catch (IllegalStateException unused2) {
            }
        } else {
            c4025ge.l.c();
            Ng ng = (Ng) this.a.m.i.d.getValue();
            ng.f.set(true);
            P6.a(ng.e);
            ng.e = null;
            this.a.g = Jg.f;
        }
        return Unit.INSTANCE;
    }
}
