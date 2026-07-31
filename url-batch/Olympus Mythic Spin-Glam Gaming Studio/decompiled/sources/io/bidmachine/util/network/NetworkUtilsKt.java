package io.bidmachine.util.network;

import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\b¨\u0006\n"}, d2 = {"disconnectSafely", "", "Ljava/net/HttpURLConnection;", "isHttp", "", "Ljava/net/URL;", "readBytes", "", "Ljava/net/URLConnection;", "readBytesSafely", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkUtilsKt {
    public static final void disconnectSafely(@Nullable HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    @NotNull
    public static final byte[] readBytes(@NotNull URLConnection uRLConnection) {
        Intrinsics.checkNotNullParameter(uRLConnection, "<this>");
        InputStream it = BidMachineNetworkBridge.urlConnectionGetInputStream(uRLConnection);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            byte[] readBytes = ByteStreamsKt.readBytes(it);
            CloseableKt.closeFinally(it, null);
            return readBytes;
        } finally {
        }
    }

    @Nullable
    public static final byte[] readBytesSafely(@NotNull URLConnection uRLConnection) {
        Intrinsics.checkNotNullParameter(uRLConnection, "<this>");
        try {
            return readBytes(uRLConnection);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isHttp(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return Intrinsics.areEqual("http", url.getProtocol()) || Intrinsics.areEqual("https", url.getProtocol());
    }
}
