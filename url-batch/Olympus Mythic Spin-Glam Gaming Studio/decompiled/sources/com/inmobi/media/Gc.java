package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class Gc extends SuspendLambda implements Function2 {
    public final /* synthetic */ Hc a;
    public final /* synthetic */ Jc b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gc(Hc hc, Jc jc, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = hc;
        this.b = jc;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Gc(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Gc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Context context = this.a.b;
        if (context != null) {
            AudioManager audioManager = null;
            try {
                Object systemService = context.getSystemService("audio");
                if (!(systemService instanceof AudioManager)) {
                    systemService = null;
                }
                audioManager = (AudioManager) systemService;
            } catch (Throwable unused) {
            }
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    Hc hc = this.a;
                    if (streamVolume != hc.c) {
                        hc.c = streamVolume;
                        InterfaceC4466x9 interfaceC4466x9 = this.b.b;
                        if (interfaceC4466x9 != null) {
                            ((C4493y9) interfaceC4466x9).a("MraidMediaProcessor", "volume change detected - " + this.c);
                        }
                        this.b.a(this.a.a, streamVolume);
                    }
                } catch (Exception e) {
                    InterfaceC4466x9 interfaceC4466x92 = this.b.b;
                    if (interfaceC4466x92 != null) {
                        ((C4493y9) interfaceC4466x92).a("MraidMediaProcessor", "Unexpected error in volume listener", e);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
