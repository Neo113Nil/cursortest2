package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public abstract class m7 {
    public static final /* synthetic */ KProperty[] a = {Reflection.property1(new PropertyReference1Impl(m7.class, "dataStore", "getDataStore(Landroid/content/Context;)Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", 1))};
    public static final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("ogury_mraid", null, null, null, 14, null);
}
