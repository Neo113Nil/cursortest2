package com.mobilefuse.sdk.config;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ObservableConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0000J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0007J&\u0010\u001b\u001a\u0002H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H\u001cH\u0082\b¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007J3\u0010\u001f\u001a\u00020\f\"\b\b\u0000\u0010\u001c*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u0001H\u001c2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u0001H\u001c¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0001H\u0002J\u000e\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\nJ\u0016\u0010&\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0001J\u0006\u0010'\u001a\u00020\fJ\u000e\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/mobilefuse/sdk/config/ObservableConfig;", "", "source", "(Lcom/mobilefuse/sdk/config/ObservableConfig;)V", "()V", "configMap", "", "Lcom/mobilefuse/sdk/config/ObservableConfigKey;", "observers", "", "Lcom/mobilefuse/sdk/config/Observer;", "clearValue", "", "key", "copy", "getBooleanValue", "", "defaultValue", "getFloatValue", "", "getFloatValueOrNull", "(Lcom/mobilefuse/sdk/config/ObservableConfigKey;)Ljava/lang/Float;", "getIntValue", "", "getLongValue", "", "getValue", "getValueOrDefault", "T", "(Lcom/mobilefuse/sdk/config/ObservableConfigKey;Ljava/lang/Object;)Ljava/lang/Object;", "hasValue", "mergeValue", "newValue", "(Lcom/mobilefuse/sdk/config/ObservableConfigKey;Ljava/lang/Object;Ljava/lang/Object;)V", "notifyChange", "value", "registerObserver", "observer", "setValue", "unregisterAll", "unregisterObserver", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class ObservableConfig {
    private final Map<ObservableConfigKey, Object> configMap;
    private final Set<Observer> observers;

    public final boolean getBooleanValue(@NotNull ObservableConfigKey observableConfigKey) {
        return getBooleanValue$default(this, observableConfigKey, false, 2, null);
    }

    public ObservableConfig() {
        this.observers = new LinkedHashSet();
        this.configMap = new LinkedHashMap();
    }

    private ObservableConfig(ObservableConfig observableConfig) {
        this();
        this.configMap.putAll(observableConfig.configMap);
    }

    @NotNull
    public final ObservableConfig copy() {
        return new ObservableConfig(this);
    }

    public final void setValue(@NotNull ObservableConfigKey key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.configMap.put(key, value);
        notifyChange(key, value);
    }

    public final boolean hasValue(@NotNull ObservableConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.configMap.containsKey(key);
    }

    public final void clearValue(@NotNull ObservableConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.configMap.remove(key);
    }

    @Nullable
    public final Object getValue(@NotNull ObservableConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.configMap.get(key);
    }

    public static /* synthetic */ boolean getBooleanValue$default(ObservableConfig observableConfig, ObservableConfigKey observableConfigKey, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return observableConfig.getBooleanValue(observableConfigKey, z);
    }

    public final boolean getBooleanValue(@NotNull ObservableConfigKey key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Boolean valueOf = Boolean.valueOf(defaultValue);
        Object obj = this.configMap.get(key);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            valueOf = bool;
        }
        return valueOf.booleanValue();
    }

    public final int getIntValue(@NotNull ObservableConfigKey key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Integer valueOf = Integer.valueOf(defaultValue);
        Object obj = this.configMap.get(key);
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            valueOf = num;
        }
        return valueOf.intValue();
    }

    public final long getLongValue(@NotNull ObservableConfigKey key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long valueOf = Long.valueOf(defaultValue);
        Object obj = this.configMap.get(key);
        if (!(obj instanceof Long)) {
            obj = null;
        }
        Long l = (Long) obj;
        if (l != null) {
            valueOf = l;
        }
        return valueOf.longValue();
    }

    public final float getFloatValue(@NotNull ObservableConfigKey key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Float valueOf = Float.valueOf(defaultValue);
        Object obj = this.configMap.get(key);
        if (!(obj instanceof Float)) {
            obj = null;
        }
        Float f = (Float) obj;
        if (f != null) {
            valueOf = f;
        }
        return valueOf.floatValue();
    }

    @Nullable
    public final Float getFloatValueOrNull(@NotNull ObservableConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.configMap.get(key);
        if (!(obj instanceof Float)) {
            obj = null;
        }
        return (Float) obj;
    }

    private final /* synthetic */ <T> T getValueOrDefault(ObservableConfigKey key, T defaultValue) {
        T t = (T) this.configMap.get(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t == null ? defaultValue : t;
    }

    private final void notifyChange(ObservableConfigKey key, Object value) {
        Iterator it = CollectionsKt.toList(this.observers).iterator();
        while (it.hasNext()) {
            ((Observer) it.next()).onChanged(key, value);
        }
    }

    public final void registerObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    public final void unregisterObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
    }

    public final void unregisterAll() {
        this.observers.clear();
    }

    public static /* synthetic */ void mergeValue$default(ObservableConfig observableConfig, ObservableConfigKey observableConfigKey, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = null;
        }
        observableConfig.mergeValue(observableConfigKey, obj, obj2);
    }

    public final <T> void mergeValue(@NotNull ObservableConfigKey key, @Nullable T newValue, @Nullable T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (newValue == null) {
            newValue = (T) getValue(key);
        }
        if (newValue != null) {
            defaultValue = newValue;
        }
        if (defaultValue == null) {
            return;
        }
        setValue(key, defaultValue);
    }
}
