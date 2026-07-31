package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4140l extends SuspendLambda implements Function2 {
    public final /* synthetic */ InterfaceC4466x9 a;
    public final /* synthetic */ InterfaceC4088j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140l(InterfaceC4466x9 interfaceC4466x9, InterfaceC4088j interfaceC4088j, Continuation continuation) {
        super(2, continuation);
        this.a = interfaceC4466x9;
        this.b = interfaceC4088j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4140l(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4140l(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + C4272q.h.size());
        }
        Iterator it = C4272q.h.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                C4272q.h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C4272q.h;
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.b));
        InterfaceC4088j interfaceC4088j = this.b;
        Float f = (Float) C4272q.e.get();
        ((C4029gi) interfaceC4088j).a(f != null ? Boxing.boxFloat(N3.a(f.floatValue() * 100.0f)) : null);
        if (isEmpty) {
            InterfaceC4466x9 interfaceC4466x92 = this.a;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C4272q.a(this.a);
        } else {
            InterfaceC4466x9 interfaceC4466x93 = this.a;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return Unit.INSTANCE;
    }
}
