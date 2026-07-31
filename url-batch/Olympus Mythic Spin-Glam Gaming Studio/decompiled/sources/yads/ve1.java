package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes5.dex */
public final class ve1 {
    public final Context a;
    public final vw2 b;
    public final ef1 c;
    public final pe1 d;
    public final CoroutineScope e;
    public final me1 f;

    public ve1(Context context, mt1 mt1Var, int i) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        ef1 ef1Var = new ef1(context);
        pe1 pe1Var = new pe1(context);
        mt1Var = (i & 16) != 0 ? null : mt1Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(mt1Var != null ? new b20(mt1Var) : new a20()));
        me1 a = le1.a();
        this.a = context;
        this.b = vw2Var2;
        this.c = ef1Var;
        this.d = pe1Var;
        this.e = CoroutineScope;
        this.f = a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:28:0x00bf, B:30:0x00eb), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        se1 se1Var;
        Object obj;
        int i;
        String str;
        bu2 bu2Var;
        bu2 bu2Var2;
        try {
            if (continuationImpl instanceof se1) {
                se1Var = (se1) continuationImpl;
                int i2 = se1Var.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    se1Var.f = i2 - Integer.MIN_VALUE;
                    obj = se1Var.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = se1Var.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        bu2 a = this.b.a(this.a);
                        if (a == null) {
                            return Unit.INSTANCE;
                        }
                        str = a.y;
                        if (str == null || str.length() == 0) {
                            boolean z = ob1.a;
                            return Unit.INSTANCE;
                        }
                        ef1 ef1Var = this.c;
                        se1Var.b = a;
                        se1Var.c = str;
                        se1Var.f = 1;
                        ef1Var.getClass();
                        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new af1(ef1Var, null), se1Var);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bu2Var = a;
                        obj = withContext;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            str = se1Var.c;
                            bu2Var2 = se1Var.b;
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                                boolean z2 = ob1.a;
                                return Unit.INSTANCE;
                            }
                            bu2Var = bu2Var2;
                            me1 me1Var = this.f;
                            me1Var.getClass();
                            me1Var.a = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                            if (!bu2Var.z) {
                                a(str, new te1(this));
                                return Unit.INSTANCE;
                            }
                            se1Var.b = null;
                            se1Var.c = null;
                            se1Var.f = 3;
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(se1Var), 1);
                            cancellableContinuationImpl.initCancellability();
                            a(str, new qe1(cancellableContinuationImpl));
                            cancellableContinuationImpl.invokeOnCancellation(new re1(this));
                            Object result = cancellableContinuationImpl.getResult();
                            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(se1Var);
                            }
                            if (result == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        str = se1Var.c;
                        bu2Var = se1Var.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (Intrinsics.areEqual(obj, str)) {
                        ef1 ef1Var2 = this.c;
                        se1Var.b = bu2Var;
                        se1Var.c = str;
                        se1Var.f = 2;
                        ef1Var2.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new ze1(ef1Var2, null), se1Var);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bu2Var2 = bu2Var;
                        if (obj == null) {
                        }
                    }
                    me1 me1Var2 = this.f;
                    me1Var2.getClass();
                    me1Var2.a = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    if (!bu2Var.z) {
                    }
                }
            }
            if (i != 0) {
            }
            if (Intrinsics.areEqual(obj, str)) {
            }
            me1 me1Var22 = this.f;
            me1Var22.getClass();
            me1Var22.a = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            if (!bu2Var.z) {
            }
        } finally {
            CompletableDeferred completableDeferred = this.f.a;
            if (completableDeferred != null) {
                completableDeferred.complete(Unit.INSTANCE);
            }
        }
        se1Var = new se1(this, continuationImpl);
        obj = se1Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = se1Var.f;
    }

    public final void a(final String str, final Function1 function1) {
        s43 s43Var = new s43(str, new wp2() { // from class: yads.ve1$$ExternalSyntheticLambda0
            @Override // yads.wp2
            public final void a(Object obj) {
                ve1.a(ve1.this, str, function1, (String) obj);
            }
        }, new vp2() { // from class: yads.ve1$$ExternalSyntheticLambda1
            @Override // yads.vp2
            public final void a(hm3 hm3Var) {
                ve1.a(str, function1, hm3Var);
            }
        });
        s43Var.j = false;
        s43Var.q = "light_bundle_js_request_tag";
        g92.a(this.d.b).a(s43Var);
    }

    public static final void a(String str, Function1 function1, hm3 hm3Var) {
        boolean z = ob1.a;
        function1.invoke(null);
    }

    public static final void a(ve1 ve1Var, String str, Function1 function1, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ve1Var.e, null, null, new ue1(ve1Var, str2, str, function1, null), 3, null);
    }
}
