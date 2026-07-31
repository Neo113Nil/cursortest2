package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3894bh extends SuspendLambda implements Function2 {
    public int a;

    public C3894bh(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3894bh(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3894bh((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4000fh c4000fh = C4000fh.a;
                c4000fh.getClass();
                Context context = AbstractC4002fj.a;
                JSONObject jSONObject = null;
                if (context != null) {
                    if (C4000fh.d == null) {
                        C4000fh.d = new Qg(context, "pub_signals_store");
                    }
                    Qg qg = C4000fh.d;
                    if (qg == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        qg = null;
                    }
                    String a = qg.a("saved_signals");
                    if (a != null) {
                        jSONObject = new JSONObject(a);
                    }
                }
                if (jSONObject == null) {
                    return Unit.INSTANCE;
                }
                SignalsConfig.PublisherConfig c = C4000fh.c();
                JSONObject a2 = AbstractC4028gh.a(AbstractC4028gh.a(AbstractC4028gh.a(jSONObject, "obj_", c.getObj().getExpiry()), "auto_", c.getAuto().getExpiry()), "dir_", c.getDirect().getExpiry());
                this.a = 1;
                if (c4000fh.a(a2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        return Unit.INSTANCE;
    }
}
