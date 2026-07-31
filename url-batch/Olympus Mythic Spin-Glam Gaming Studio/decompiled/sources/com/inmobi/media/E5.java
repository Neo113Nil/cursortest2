package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class E5 extends SuspendLambda implements Function2 {
    public E5(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E5(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E5((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            context = AbstractC4002fj.a;
        } catch (Exception e) {
            F5 f5 = F5.a;
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        if (context == null) {
            return Unit.INSTANCE;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return Unit.INSTANCE;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        F5 f52 = F5.a;
        F5.n = memoryInfo.lowMemory;
        return Unit.INSTANCE;
    }
}
