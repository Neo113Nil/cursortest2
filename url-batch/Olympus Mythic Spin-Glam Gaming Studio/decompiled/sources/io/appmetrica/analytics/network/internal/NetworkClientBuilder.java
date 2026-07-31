package io.appmetrica.analytics.network.internal;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/appmetrica/analytics/network/internal/NetworkClientBuilder;", "Lio/appmetrica/analytics/networkapi/NetworkClient$Builder;", "()V", "build", "Lio/appmetrica/analytics/networkapi/NetworkClient;", "network_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkClientBuilder extends NetworkClient.Builder {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.appmetrica.analytics.networkapi.NetworkClient$Builder] */
    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    @NotNull
    public NetworkClient build() {
        NetworkClientSettings settings = getSettings();
        Bundle applicationMetaData = NetworkClientServiceLocator.getInstance().getApplicationMetaData();
        c cVar = null;
        Iterator it = CollectionsKt.listOfNotNull((Object[]) new String[]{applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.network.custom") : null, "io.appmetrica.analytics.networkokhttp.internal.OkHttpNetworkClientBuilder", "io.appmetrica.analytics.networklegacy.internal.LegacyNetworkClientBuilder"}).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ?? r3 = (NetworkClient.Builder) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), NetworkClient.Builder.class);
            if (r3 != 0) {
                cVar = r3;
                break;
            }
        }
        if (cVar == null) {
            cVar = new c();
        }
        PublicLogger.INSTANCE.getAnonymousInstance().info("Created " + cVar, new Object[0]);
        return cVar.withSettings(settings).build();
    }
}
