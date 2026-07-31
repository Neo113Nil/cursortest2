package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final class i7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(l7 l7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = l7Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i7(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DataStore dataStore = (DataStore) m7.b.getValue(this.b.a, m7.a[0]);
        h7 h7Var = new h7(this.c, null);
        this.a = 1;
        Object edit = PreferencesKt.edit(dataStore, h7Var, this);
        return edit == coroutine_suspended ? coroutine_suspended : edit;
    }
}
