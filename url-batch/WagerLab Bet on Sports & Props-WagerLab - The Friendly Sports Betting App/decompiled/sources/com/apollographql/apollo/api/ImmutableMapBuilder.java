package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ImmutableMapBuilder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/api/ImmutableMapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<init>", "()V", "map", "", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/ImmutableMapBuilder;", InAppPurchaseConstants.METHOD_BUILD, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImmutableMapBuilder<K, V> {
    private final Map<K, V> map = new LinkedHashMap();

    public final ImmutableMapBuilder<K, V> put(K key, V value) {
        this.map.put(key, value);
        return this;
    }

    public final Map<K, V> build() {
        return this.map;
    }
}
