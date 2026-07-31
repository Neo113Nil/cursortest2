package io.bidmachine.util.network;

import androidx.annotation.CallSuper;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProtoRequestProcessor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/network/ProtoRequestProcessor;", "Lio/bidmachine/util/network/RequestProcessor;", "getMessageType", "", "setupConnection", "", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface ProtoRequestProcessor extends RequestProcessor {
    @NotNull
    String getMessageType();

    @Override // io.bidmachine.util.network.RequestProcessor
    @CallSuper
    default void setupConnection(@NotNull URLConnection urlConnection) {
        Intrinsics.checkNotNullParameter(urlConnection, "urlConnection");
        urlConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
    }
}
