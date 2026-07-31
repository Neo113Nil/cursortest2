package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class o0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Object obj, String str, Continuation continuation) {
        super(2, continuation);
        this.b = obj;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o0 o0Var = new o0(this.b, this.c, continuation);
        o0Var.a = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        Object obj2 = this.b;
        if (obj2 instanceof Boolean) {
            mutablePreferences.set(PreferencesKeys.booleanKey(this.c), this.b);
        } else if (obj2 instanceof String) {
            mutablePreferences.set(PreferencesKeys.stringKey(this.c), this.b);
        } else {
            if (!(obj2 instanceof Integer)) {
                throw new IllegalArgumentException("Unsupported data type");
            }
            mutablePreferences.set(PreferencesKeys.intKey(this.c), this.b);
        }
        return Unit.INSTANCE;
    }
}
