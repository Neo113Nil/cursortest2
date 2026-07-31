package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes13.dex */
public final class z0 {
    public final Context a;
    public final String b;
    public final DataStore c;
    public final Preferences.Key d;

    public z0(Context context, String sharedPreferencesFileName, DataStore dataStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesFileName, "sharedPreferencesFileName");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter("migration_completed", "migrationCompletedKey");
        this.a = context;
        this.b = sharedPreferencesFileName;
        this.c = dataStore;
        this.d = PreferencesKeys.booleanKey("migration_completed");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z0 z0Var, ContinuationImpl continuationImpl) {
        x0 x0Var;
        int i;
        SharedPreferences sharedPreferences;
        if (continuationImpl instanceof x0) {
            x0Var = (x0) continuationImpl;
            int i2 = x0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = x0Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x0Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sharedPreferences = z0Var.a.getSharedPreferences(z0Var.b, 0);
                    Map<String, ?> all = sharedPreferences.getAll();
                    if (all.isEmpty()) {
                        SharedPrefsUtilsKt.deleteLegacySharedPreferences(z0Var.a, z0Var.b);
                        return Unit.INSTANCE;
                    }
                    DataStore dataStore = z0Var.c;
                    y0 y0Var = new y0(all, z0Var, null);
                    x0Var.a = z0Var;
                    x0Var.b = sharedPreferences;
                    x0Var.e = 1;
                    if (PreferencesKt.edit(dataStore, y0Var, x0Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SharedPreferences sharedPreferences2 = x0Var.b;
                    z0 z0Var2 = x0Var.a;
                    ResultKt.throwOnFailure(obj);
                    sharedPreferences = sharedPreferences2;
                    z0Var = z0Var2;
                }
                sharedPreferences.edit().clear().apply();
                SharedPrefsUtilsKt.deleteLegacySharedPreferences(z0Var.a, z0Var.b);
                return Unit.INSTANCE;
            }
        }
        x0Var = new x0(z0Var, continuationImpl);
        Object obj2 = x0Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x0Var.e;
        if (i != 0) {
        }
        sharedPreferences.edit().clear().apply();
        SharedPrefsUtilsKt.deleteLegacySharedPreferences(z0Var.a, z0Var.b);
        return Unit.INSTANCE;
    }
}
