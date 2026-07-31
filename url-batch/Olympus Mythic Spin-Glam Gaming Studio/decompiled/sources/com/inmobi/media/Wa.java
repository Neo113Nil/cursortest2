package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Wa extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Xa b;
    public final /* synthetic */ C3887ba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wa(Xa xa, C3887ba c3887ba, Continuation continuation) {
        super(1, continuation);
        this.b = xa;
        this.c = c3887ba;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Wa(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Wa(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (com.inmobi.media.Xa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (com.inmobi.media.Xa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (com.inmobi.media.Xa.a(r6, r1, r5) == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CrashConfig.ANRConfig anr = this.b.a.getAnr();
            if (!Hl.a(this.c)) {
                return Unit.INSTANCE;
            }
            if (this.c instanceof D1) {
                F5.a.getClass();
                if (F5.t() && anr.getAppExitReason().getUseForReporting() && this.b.c.d.a()) {
                    C3887ba c3887ba = this.c;
                    c3887ba.getClass();
                    Intrinsics.checkNotNullParameter("ANREvent", "<set-?>");
                    c3887ba.a = "ANREvent";
                    Xa xa = this.b;
                    C3887ba c3887ba2 = this.c;
                    this.a = 1;
                }
            }
            if ((this.c instanceof C4455wo) && anr.getWatchdog().getUseForReporting() && this.b.c.c.a()) {
                Xa xa2 = this.b;
                C3887ba c3887ba3 = this.c;
                this.a = 2;
            } else {
                if (!(this.c instanceof C3882b5)) {
                    return Unit.INSTANCE;
                }
                if (this.b.a.getCrashConfig().getEnabled() && this.b.c.a.a()) {
                    Xa xa3 = this.b;
                    C3887ba c3887ba4 = this.c;
                    this.a = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.a();
        return Unit.INSTANCE;
    }
}
