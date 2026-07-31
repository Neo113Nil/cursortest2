package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class Af extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdConfig.OmidConfig c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Af(AdConfig.OmidConfig omidConfig, Context context, Continuation continuation) {
        super(2, continuation);
        this.c = omidConfig;
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Af af = new Af(this.c, this.d, continuation);
        af.b = obj;
        return af;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Af) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r15 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AdConfig.OmidConfig omidConfig = this.c;
            Result.Companion companion2 = Result.INSTANCE;
            this.a = 1;
            String url = omidConfig.getUrl();
            int maxRetries = omidConfig.getMaxRetries();
            int retryInterval = omidConfig.getRetryInterval();
            IntRange intRange = AbstractC4026gf.a;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new Hf(new Xe(url, null, null, null, new Vi(maxRetries, retryInterval * 1000, 0), false, 46), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        m8023constructorimpl = Result.m8023constructorimpl((String) obj);
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            Df.b.set(0);
        }
        Context context = this.d;
        if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
            String str = (String) m8023constructorimpl;
            Df.b.set(1);
            Gf gf = Df.c;
            if (gf == null) {
                gf = new Gf(context);
                Df.c = gf;
            }
            this.b = m8023constructorimpl;
            this.a = 2;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new Ff(gf, str, null), this);
            if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
