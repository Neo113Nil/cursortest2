package com.ogury.core.internal;

import android.content.Context;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class q extends SuspendLambda implements Function2 {
    public String a;
    public int b;
    public final /* synthetic */ w c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, String str, Continuation continuation) {
        super(2, continuation);
        this.c = wVar;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r9 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            w wVar = this.c;
            String str = this.d;
            this.b = 1;
            Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
            Context applicationContext = wVar.a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            KProperty[] kPropertyArr = x.a;
            Intrinsics.checkNotNullParameter(applicationContext, "<this>");
            obj = FlowKt.firstOrNull(new u(((DataStore) x.b.getValue(applicationContext, x.a[0])).getData(), stringKey), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = this.a;
                ResultKt.throwOnFailure(obj);
                return str2;
            }
            ResultKt.throwOnFailure(obj);
        }
        String str3 = (String) obj;
        if (str3 != null && str3.length() != 0) {
            return str3;
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        w wVar2 = this.c;
        String str4 = this.d;
        this.a = uuid;
        this.b = 2;
        Preferences.Key<String> stringKey2 = PreferencesKeys.stringKey(str4);
        Context applicationContext2 = wVar2.a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        KProperty[] kPropertyArr2 = x.a;
        Intrinsics.checkNotNullParameter(applicationContext2, "<this>");
        Object edit = PreferencesKt.edit((DataStore) x.b.getValue(applicationContext2, x.a[0]), new v(stringKey2, uuid, null), this);
        if (edit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            edit = Unit.INSTANCE;
        }
        return edit == coroutine_suspended ? coroutine_suspended : uuid;
    }
}
