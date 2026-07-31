package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class ie extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ke b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(ke keVar, Continuation continuation) {
        super(2, continuation);
        this.b = keVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ie(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ie(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
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
        DataStore dataStore = (DataStore) this.b.c.getValue();
        he heVar = new he(null);
        this.a = 1;
        Object edit = PreferencesKt.edit(dataStore, heVar, this);
        return edit == coroutine_suspended ? coroutine_suspended : edit;
    }
}
