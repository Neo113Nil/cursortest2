package com.apollographql.apollo.network;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import kotlin.Metadata;

/* compiled from: NetworkObserver.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/NetworkObserver;", "Ljava/io/Closeable;", "Lokio/Closeable;", InAppPurchaseConstants.METHOD_SET_LISTENER, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/NetworkObserver$Listener;", "Listener", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NetworkObserver extends Closeable {

    /* compiled from: NetworkObserver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/NetworkObserver$Listener;", "", "networkChanged", "", "isOnline", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void networkChanged(boolean isOnline);
    }

    void setListener(Listener listener);
}
