package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.cq1;
import yads.er1;
import yads.hh2;
import yads.ob1;
import yads.oo1;
import yads.po1;
import yads.yo;
import yads.yu2;
import yads.zp1;

/* loaded from: classes5.dex */
public final class a {
    public static final AtomicBoolean g = new AtomicBoolean(true);
    public static final AtomicBoolean h = new AtomicBoolean(true);
    public final yu2 a;
    public final yo b;
    public final hh2 c;
    public final zp1 d;
    public final po1 e;
    public final oo1 f;

    public a(yu2 yu2Var) {
        yo yoVar = new yo();
        hh2 hh2Var = new hh2();
        zp1 zp1Var = new zp1();
        po1 po1Var = new po1(zp1Var);
        oo1 oo1Var = new oo1(zp1Var);
        this.a = yu2Var;
        this.b = yoVar;
        this.c = hh2Var;
        this.d = zp1Var;
        this.e = po1Var;
        this.f = oo1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, er1 er1Var, ContinuationImpl continuationImpl) {
        cq1 cq1Var;
        int i;
        MediatedAdapterInitializationResult mediatedAdapterInitializationResult;
        if (continuationImpl instanceof cq1) {
            cq1Var = (cq1) continuationImpl;
            int i2 = cq1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cq1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = cq1Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cq1Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String b = this.d.b(er1Var);
                    MediatedAdapterInitializer a = this.f.a(context, er1Var, this.a);
                    if (a == null) {
                        mediatedAdapterInitializationResult = null;
                        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Success) {
                            boolean z = ob1.a;
                        } else if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
                            MediatedAdapterInitializationResult.Failure failure = (MediatedAdapterInitializationResult.Failure) mediatedAdapterInitializationResult;
                            failure.getErrorCode();
                            failure.getErrorMessage();
                            boolean z2 = ob1.a;
                        } else if (mediatedAdapterInitializationResult == null) {
                            boolean z3 = ob1.a;
                        }
                        return Unit.INSTANCE;
                    }
                    Map<String, String> d = er1Var.d();
                    cq1Var.b = b;
                    cq1Var.e = 1;
                    obj = a.initialize(context, d, cq1Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) obj;
                if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Success) {
                }
                return Unit.INSTANCE;
            }
        }
        cq1Var = new cq1(this, continuationImpl);
        Object obj2 = cq1Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cq1Var.e;
        if (i != 0) {
        }
        mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) obj2;
        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Success) {
        }
        return Unit.INSTANCE;
    }
}
