package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4193n extends SuspendLambda implements Function2 {
    public final /* synthetic */ InterfaceC4466x9 a;
    public final /* synthetic */ InterfaceC4088j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4193n(InterfaceC4466x9 interfaceC4466x9, InterfaceC4088j interfaceC4088j, Continuation continuation) {
        super(2, continuation);
        this.a = interfaceC4466x9;
        this.b = interfaceC4088j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4193n(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4193n(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C4272q.h;
        InterfaceC4088j interfaceC4088j = this.b;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (Intrinsics.areEqual(weakReference.get(), interfaceC4088j)) {
                C4272q.h.remove(weakReference);
            }
        }
        if (C4272q.h.isEmpty()) {
            InterfaceC4466x9 interfaceC4466x92 = this.a;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC4466x9 interfaceC4466x93 = this.a;
            Context context = AbstractC4002fj.a;
            if (context == null) {
                if (interfaceC4466x93 != null) {
                    ((C4493y9) interfaceC4466x93).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C4272q.a((Float) null);
            } else if (C4272q.d.compareAndSet(true, false)) {
                if (interfaceC4466x93 != null) {
                    ((C4493y9) interfaceC4466x93).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C4272q.a(context, interfaceC4466x93);
            } else if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return Unit.INSTANCE;
    }
}
