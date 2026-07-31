package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public abstract class x {
    public static final /* synthetic */ KProperty[] a = {Reflection.property1(new PropertyReference1Impl(x.class, "tokenManagerDataStore", "getTokenManagerDataStore(Landroid/content/Context;)Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", 1))};
    public static final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("ogury_token_manager", null, null, null, 14, null);
}
