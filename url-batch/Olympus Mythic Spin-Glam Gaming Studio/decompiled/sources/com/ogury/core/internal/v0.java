package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes12.dex */
public final class v0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ z0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var, Continuation continuation) {
        super(2, continuation);
        this.b = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v0 v0Var = new v0(this.b, continuation);
        v0Var.a = obj;
        return v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v0 v0Var = new v0(this.b, (Continuation) obj2);
        v0Var.a = (MutablePreferences) obj;
        return v0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((MutablePreferences) this.a).set(this.b.d, Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
