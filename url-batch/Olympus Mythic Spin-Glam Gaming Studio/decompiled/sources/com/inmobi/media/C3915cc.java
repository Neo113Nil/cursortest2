package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.cc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3915cc extends SuspendLambda implements Function2 {
    public Kb a;
    public Iterator b;
    public int c;
    public final /* synthetic */ Kb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3915cc(Kb kb, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.d = kb;
        this.e = j;
        this.f = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3915cc(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3915cc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0013, B:9:0x003f, B:11:0x0045, B:23:0x0021, B:24:0x0037, B:26:0x0028), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Kb kb;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Kb kb2 = this.d;
                long j = this.e;
                int i2 = this.f;
                this.c = 1;
                obj = kb2.a(j, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.b;
                    kb = this.a;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Db db = (Db) it.next();
                        AbstractC4023gc.a(db.a);
                        String str = db.a;
                        this.a = kb;
                        this.b = it;
                        this.c = 2;
                        if (kb.a(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    AbstractC3995fc.c.set(false);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            kb = this.d;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
            }
            AbstractC3995fc.c.set(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            AbstractC3995fc.c.set(false);
            throw th;
        }
    }
}
