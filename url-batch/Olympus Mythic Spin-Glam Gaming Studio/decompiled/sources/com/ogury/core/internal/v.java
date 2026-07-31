package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class v extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Preferences.Key b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Preferences.Key key, String str, Continuation continuation) {
        super(2, continuation);
        this.b = key;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.b, this.c, continuation);
        vVar.a = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((MutablePreferences) this.a).set(this.b, this.c);
        return Unit.INSTANCE;
    }
}
