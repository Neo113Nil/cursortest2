package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class wd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ke b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(ke keVar, Continuation continuation) {
        super(2, continuation);
        this.b = keVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wd(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wd(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
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
        long currentTimeMillis = System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1L);
        DataStore dataStore = (DataStore) this.b.c.getValue();
        vd vdVar = new vd(currentTimeMillis, null);
        this.a = 1;
        Object edit = PreferencesKt.edit(dataStore, vdVar, this);
        return edit == coroutine_suspended ? coroutine_suspended : edit;
    }
}
