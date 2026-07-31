package com.inmobi.media;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ff extends SuspendLambda implements Function2 {
    public final /* synthetic */ Gf a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ff(Gf gf, String str, Continuation continuation) {
        super(2, continuation);
        this.a = gf;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ff(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ff(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Qg qg = this.a.a;
        String value = this.b;
        qg.getClass();
        Intrinsics.checkNotNullParameter("omid_js_string", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Qa qa = qg.a;
        ConcurrentHashMap concurrentHashMap = Qa.b;
        qa.a("omid_js_string", value, false);
        qg.a.a("last_ts", System.currentTimeMillis() / 1000, false);
        return Unit.INSTANCE;
    }
}
