package io.bidmachine.util.network;

import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.util.Utils;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/bidmachine/util/network/NetworkUtils;", "", "()V", "HEADER_CONTENT_LENGTH", "", "HEADER_CONTENT_TYPE", "HEADER_LOCATION", "HTTP_PERMANENT_REDIRECT", "", "HTTP_TEMPORARY_REDIRECT", "PROTOCOL_HTTP", "PROTOCOL_HTTPS", "PROTOCOL_MARKET", "appendQueryParameters", "url", "queryParameters", "", "disconnectSafely", "", "httpURLConnection", "Ljava/net/HttpURLConnection;", "findEndpoint", "urlString", "timeOut", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkUtils {

    @NotNull
    public static final String HEADER_CONTENT_LENGTH = "Content-Length";

    @NotNull
    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    @NotNull
    public static final String HEADER_LOCATION = "Location";
    public static final int HTTP_PERMANENT_REDIRECT = 308;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;

    @NotNull
    public static final NetworkUtils INSTANCE = new NetworkUtils();

    @NotNull
    public static final String PROTOCOL_HTTP = "http";

    @NotNull
    public static final String PROTOCOL_HTTPS = "https";

    @NotNull
    public static final String PROTOCOL_MARKET = "market";

    @WorkerThread
    @NotNull
    public static final String findEndpoint(@NotNull String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return findEndpoint$default(urlString, 0, 2, null);
    }

    private NetworkUtils() {
    }

    public static final void disconnectSafely(@Nullable HttpURLConnection httpURLConnection) {
        NetworkUtilsKt.disconnectSafely(httpURLConnection);
    }

    public static /* synthetic */ String findEndpoint$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 500;
        }
        return findEndpoint(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6 A[Catch: all -> 0x0036, Exception -> 0x00c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c8, blocks: (B:29:0x006c, B:33:0x0089, B:56:0x009e, B:39:0x00a4, B:44:0x00a7, B:46:0x00b6), top: B:28:0x006c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:6:0x0022, B:9:0x002b, B:13:0x0039, B:15:0x0041, B:18:0x0049, B:20:0x0053, B:23:0x0061, B:29:0x006c, B:33:0x0089, B:56:0x009e, B:39:0x00a4, B:44:0x00a7, B:46:0x00b6, B:50:0x00bd, B:25:0x00cf, B:64:0x00c8, B:67:0x00d6), top: B:5:0x0022, inners: #2 }] */
    @WorkerThread
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String findEndpoint(@NotNull String urlString, int timeOut) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(urlString);
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            httpURLConnection2.setInstanceFollowRedirects(false);
            httpURLConnection2.setConnectTimeout(timeOut);
            httpURLConnection2.setReadTimeout(timeOut);
            try {
                switch (BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2)) {
                    case 301:
                    case 302:
                    case POBVastError.NO_VAST_RESPONSE /* 303 */:
                    case MRAID_BRIDGE_ERROR_VALUE:
                    case 307:
                    case 308:
                        String nextUrl = httpURLConnection2.getHeaderField(HEADER_LOCATION);
                        if (nextUrl != null && nextUrl.length() != 0) {
                            Intrinsics.checkNotNullExpressionValue(nextUrl, "nextUrl");
                            if (Utils.isHttpUrl(nextUrl)) {
                                NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                Intrinsics.checkNotNullExpressionValue(nextUrl, "nextUrl");
                                String findEndpoint$default = findEndpoint$default(nextUrl, 0, 2, null);
                                NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                return findEndpoint$default;
                            }
                            if (new URI(nextUrl).getScheme() != null) {
                                Intrinsics.checkNotNullExpressionValue(nextUrl, "nextUrl");
                                NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                return nextUrl;
                            }
                            try {
                                String url2 = new URL(url, nextUrl).toString();
                                Intrinsics.checkNotNullExpressionValue(url2, "URL(url, nextUrl).toString()");
                                int length = url2.length() - 1;
                                int i = 0;
                                boolean z = false;
                                while (i <= length) {
                                    boolean z2 = Intrinsics.compare((int) url2.charAt(!z ? i : length), 32) <= 0;
                                    if (z) {
                                        if (!z2) {
                                            if (url2.subSequence(i, length + 1).toString().length() != 0) {
                                                Intrinsics.checkNotNullExpressionValue(nextUrl, "nextUrl");
                                                NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                                return nextUrl;
                                            }
                                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                            String findEndpoint$default2 = findEndpoint$default(url2, 0, 2, null);
                                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                            return findEndpoint$default2;
                                        }
                                        length--;
                                    } else if (z2) {
                                        i++;
                                    } else {
                                        z = true;
                                    }
                                }
                                if (url2.subSequence(i, length + 1).toString().length() != 0) {
                                }
                            } catch (Exception unused) {
                                Intrinsics.checkNotNullExpressionValue(nextUrl, "nextUrl");
                                NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                return nextUrl;
                            }
                        }
                        String url3 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(url3, "url.toString()");
                        NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                        return url3;
                    case 304:
                    case 306:
                    default:
                        String url4 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(url4, "url.toString()");
                        NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                        return url4;
                }
            } catch (Throwable unused2) {
                httpURLConnection = httpURLConnection2;
            }
            httpURLConnection = httpURLConnection2;
        } catch (Throwable unused3) {
        }
        NetworkUtilsKt.disconnectSafely(httpURLConnection);
        return urlString;
    }

    @NotNull
    public static final String appendQueryParameters(@NotNull String url, @NotNull Map<String, String> queryParameters) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        if (queryParameters.isEmpty()) {
            return url;
        }
        Uri.Builder buildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "parse(url).buildUpon().a…     }.build().toString()");
        return uri;
    }
}
