package com.composables.core.androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014R\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00028\u00018VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/composables/core/androidx/collection/MutableMapEntry;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", UserMetadata.KEYDATA_FILENAME, "", "", "values", FirebaseAnalytics.Param.INDEX, "", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "getKeys", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getValues", "getIndex", "()I", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "key", "getKey$annotations", "()V", "getKey", "()Ljava/lang/Object;", "value", "getValue$annotations", "getValue", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public MutableMapEntry(Object[] keys, Object[] values, int i) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public V setValue(V newValue) {
        Object[] objArr = this.values;
        int i = this.index;
        V v = (V) objArr[i];
        objArr[i] = newValue;
        return v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }
}
