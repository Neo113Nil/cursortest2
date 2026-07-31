package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* compiled from: ObjectBuilder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0018\b\u0000\u0010\u0001 \u0001*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0086\u0002J\r\u0010\u001c\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017*\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/apollographql/apollo/api/ObjectBuilder;", "T", "", "", "", "Lcom/apollographql/apollo/api/BuilderScope;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "<init>", "(Lcom/apollographql/apollo/api/CustomScalarAdapters;)V", "getCustomScalarAdapters", "()Lcom/apollographql/apollo/api/CustomScalarAdapters;", "__fields", "", "get__fields", "()Ljava/util/Map;", "<set-?>", "__typename", "get__typename$delegate", "(Lcom/apollographql/apollo/api/ObjectBuilder;)Ljava/lang/Object;", "get__typename", "()Ljava/lang/String;", "set__typename", "(Ljava/lang/String;)V", "set", "", "key", "value", InAppPurchaseConstants.METHOD_BUILD, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ObjectBuilder<T extends Map<String, ? extends Object>> implements BuilderScope {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ObjectBuilder.class, "__typename", "get__typename()Ljava/lang/String;", 0))};
    private final Map<String, Object> __fields;
    private final CustomScalarAdapters customScalarAdapters;

    public abstract T build();

    public ObjectBuilder(CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        this.customScalarAdapters = customScalarAdapters;
        this.__fields = new LinkedHashMap();
    }

    @Override // com.apollographql.apollo.api.BuilderScope
    public CustomScalarAdapters getCustomScalarAdapters() {
        return this.customScalarAdapters;
    }

    public final Map<String, Object> get__fields() {
        return this.__fields;
    }

    public final String get__typename() {
        return (String) MapsKt.getOrImplicitDefaultNullable(this.__fields, $$delegatedProperties[0].getName());
    }

    public final void set__typename(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.__fields.put($$delegatedProperties[0].getName(), str);
    }

    public final void set(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.__fields.put(key, value);
    }
}
