package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class lh2 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ rh2 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ l03 e;
    public final /* synthetic */ er1 f;
    public final /* synthetic */ MediatedAdapterPrefetcher g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh2(rh2 rh2Var, Context context, l03 l03Var, er1 er1Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, Continuation continuation) {
        super(2, continuation);
        this.c = rh2Var;
        this.d = context;
        this.e = l03Var;
        this.f = er1Var;
        this.g = mediatedAdapterPrefetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lh2(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lh2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r10 == null) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gh2 gh2Var = this.c.d;
            Context context = this.d;
            l03 l03Var = this.e;
            er1 er1Var = this.f;
            MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.g;
            this.b = 1;
            gh2Var.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            try {
                Activity a = h1.a();
                if (a != null) {
                    context = a;
                }
                HashMap hashMap = new HashMap(er1Var.c);
                if (l03Var != null) {
                    hashMap.put("width", String.valueOf(l03Var.getWidth()));
                    hashMap.put("height", String.valueOf(l03Var.getHeight()));
                }
                mediatedAdapterPrefetcher.prefetchAd(context, hashMap, new fh2(gh2Var, er1Var, cancellableContinuationImpl));
            } catch (Exception e) {
                if (cancellableContinuationImpl.isActive()) {
                    mediatedAdapterPrefetcher.onInvalidate();
                    String message = e.getMessage();
                    if (message != null) {
                        if (StringsKt.isBlank(message)) {
                            message = null;
                        }
                    }
                    message = "Prefetch failed with exception";
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(dh2.a(er1Var.b, message, Boxing.boxInt(1004))));
                }
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
