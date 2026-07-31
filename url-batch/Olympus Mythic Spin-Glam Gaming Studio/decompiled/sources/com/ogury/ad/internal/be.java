package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class be extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Product b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(Product product, Continuation continuation) {
        super(2, continuation);
        this.b = product;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        be beVar = new be(this.b, continuation);
        beVar.a = obj;
        return beVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        be beVar = new be(this.b, (Continuation) obj2);
        beVar.a = (MutablePreferences) obj;
        return beVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        Preferences.Key key = ke.m;
        String name = this.b.getName();
        if (name == null) {
            name = "";
        }
        mutablePreferences.set(key, name);
        Preferences.Key key2 = ke.n;
        String version = this.b.getVersion();
        mutablePreferences.set(key2, version != null ? version : "");
        return Unit.INSTANCE;
    }
}
