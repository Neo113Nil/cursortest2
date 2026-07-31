package com.inmobi.media;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Vh extends SuspendLambda implements Function1 {
    public final /* synthetic */ Xh a;
    public final /* synthetic */ Nb b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vh(Xh xh, Nb nb, JSONObject jSONObject, Continuation continuation) {
        super(1, continuation);
        this.a = xh;
        this.b = nb;
        this.c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Vh(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Vh) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r0 != com.inmobi.media.Nb.d) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Nb eventLogLevel;
        int ordinal;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Pb pb = this.a.e;
            eventLogLevel = this.b;
            pb.getClass();
            Intrinsics.checkNotNullParameter(eventLogLevel, "eventLogLevel");
            ordinal = pb.a.ordinal();
        } catch (Exception e) {
            this.a.getClass();
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eventLogLevel == Nb.d) {
                    }
                    return Unit.INSTANCE;
                }
                if (eventLogLevel != Nb.c) {
                    if (eventLogLevel == Nb.d) {
                    }
                    return Unit.INSTANCE;
                }
            } else if (eventLogLevel != Nb.b) {
                if (eventLogLevel != Nb.c) {
                }
            }
        }
        this.a.g.add(this.c);
        return Unit.INSTANCE;
    }
}
