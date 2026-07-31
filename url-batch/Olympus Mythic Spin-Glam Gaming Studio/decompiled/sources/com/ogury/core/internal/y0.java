package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.MutablePreferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes13.dex */
public final class y0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ z0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Map map, z0 z0Var, Continuation continuation) {
        super(2, continuation);
        this.b = map;
        this.c = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y0 y0Var = new y0(this.b, this.c, continuation);
        y0Var.a = obj;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        Map allData = this.b;
        Intrinsics.checkNotNullExpressionValue(allData, "$allData");
        for (Map.Entry entry : allData.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                if (value instanceof Boolean) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt.endsWith$default(str, "_bool", false, 2, (Object) null)) {
                        str = StringsKt.removeSuffix(str, "_bool");
                    }
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof String) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt.endsWith$default(str, "_string", false, 2, (Object) null)) {
                        str = StringsKt.removeSuffix(str, "_string");
                    }
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Integer) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt.endsWith$default(str, "_int", false, 2, (Object) null)) {
                        str = StringsKt.removeSuffix(str, "_int");
                    }
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                }
            } catch (Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }
}
