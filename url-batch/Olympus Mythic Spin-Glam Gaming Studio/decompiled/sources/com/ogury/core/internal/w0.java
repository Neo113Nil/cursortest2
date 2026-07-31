package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes12.dex */
public final class w0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var, Continuation continuation) {
        super(2, continuation);
        this.b = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w0(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r6 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (com.ogury.core.internal.z0.a(r6, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r6 == r0) goto L27;
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
            z0 z0Var = this.b;
            this.a = 1;
            obj = FlowKt.first(new u0(z0Var.c.getData(), z0Var), this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            z0 z0Var2 = this.b;
            this.a = 3;
            Object edit = PreferencesKt.edit(z0Var2.c, new v0(z0Var2, null), this);
            if (edit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                edit = Unit.INSTANCE;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        z0 z0Var3 = this.b;
        this.a = 2;
    }
}
