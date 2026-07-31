package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4246p extends SuspendLambda implements Function2 {
    public final /* synthetic */ InterfaceC4466x9 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4246p(InterfaceC4466x9 interfaceC4466x9, Context context, long j, Continuation continuation) {
        super(2, continuation);
        this.a = interfaceC4466x9;
        this.b = context;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4246p(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4246p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C4272q.b == null) {
            Object systemService = this.b.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C4272q.b = (AudioManager) systemService;
        }
        C4272q c4272q = C4272q.a;
        C4272q.f = N3.a(C4272q.g, 0L, this.c, new C4220o(null));
        C4272q.a(this.c);
        Context context = this.b;
        C4272q.c = new C4114k();
        N3.a(context, C4272q.c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C4272q.a(Float.valueOf(c4272q.a()));
        return Unit.INSTANCE;
    }
}
