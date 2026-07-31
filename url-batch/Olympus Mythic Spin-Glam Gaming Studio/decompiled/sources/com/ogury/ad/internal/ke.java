package com.ogury.ad.internal;

import android.content.Context;
import com.ironsource.X3;
import com.ogury.core.internal.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes.dex */
public final class ke {
    public static volatile ke f;
    public final Context a;
    public final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("ogury_profig", null, null, null, 14, null);
    public final Lazy c = LazyKt.lazy(new je(this));
    public static final /* synthetic */ KProperty[] e = {Reflection.property2(new PropertyReference2Impl(ke.class, "dataStore", "getDataStore(Landroid/content/Context;)Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", 0))};
    public static final tb d = new tb();
    public static final Preferences.Key g = PreferencesKeys.stringKey("md5Profig");
    public static final Preferences.Key h = PreferencesKeys.stringKey("fullProfigResponseJson");
    public static final Preferences.Key i = PreferencesKeys.intKey("numberOfProfigApiCalls");
    public static final Preferences.Key j = PreferencesKeys.longKey("numberOfDays");
    public static final Preferences.Key k = PreferencesKeys.stringKey(X3.j.W);
    public static final Preferences.Key l = PreferencesKeys.stringKey("api_key");
    public static final Preferences.Key m = PreferencesKeys.stringKey("product_name");
    public static final Preferences.Key n = PreferencesKeys.stringKey("product_version");
    public static final Preferences.Key o = PreferencesKeys.longKey("CACHE_MAX_AGE");
    public static final Preferences.Key p = PreferencesKeys.longKey("CACHE_LAST_UPDATE_DATE");

    public ke(Context context) {
        this.a = context;
    }

    public final String a() {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new zb(this, null), 1, null);
        return (String) runBlocking$default;
    }
}
