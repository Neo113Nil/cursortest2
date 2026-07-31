package com.ogury.core.internal.network;

import com.ogury.core.internal.f;
import com.ogury.core.internal.network.NetworkResponse;
import io.bidmachine.util.network.NetworkUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes15.dex */
public final class a implements Call {
    public final NetworkRequest a;
    public final int b;
    public final int c;

    public a(NetworkRequest request, int i, int i2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = request;
        this.b = i;
        this.c = i2;
    }

    public static String a(HttpURLConnection httpURLConnection, boolean z) {
        byte[] bArr;
        if (httpURLConnection.getContentLength() == 0) {
            return "";
        }
        InputStream inputStream = !z ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        try {
            try {
                Intrinsics.checkNotNull(inputStream);
                bArr = ByteStreamsKt.readBytes(inputStream);
                CloseableKt.closeFinally(inputStream, null);
            } finally {
            }
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
        if (headerField != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = headerField.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, "gzip")) {
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), "UTF-8"));
                try {
                    return TextStreamsKt.readText(bufferedReader);
                } finally {
                    CloseableUtilKt.closeSafely(bufferedReader);
                }
            }
        }
        return new String(bArr, Charsets.UTF_8);
    }

    @Override // com.ogury.core.internal.network.Call
    public final NetworkResponse execute() {
        try {
            HttpURLConnection a = a(new URL(this.a.getUrl()));
            for (Map.Entry<String, String> entry : this.a.getHeaders().loadHeaders().entrySet()) {
                a.setRequestProperty(entry.getKey(), entry.getValue());
            }
            a(a);
            int responseCode = a.getResponseCode();
            if (responseCode >= 200 && responseCode <= 299) {
                return new NetworkResponse.Success(a(a, false), a.getHeaderFields());
            }
            return new NetworkResponse.Failure(a(a, true), a.getHeaderFields(), new NetworkException(responseCode));
        } catch (Exception e) {
            return new NetworkResponse.Failure("", null, e);
        }
    }

    public final void a(HttpURLConnection httpURLConnection) {
        byte[] bytes;
        if (this.a.getBody().length() > 0) {
            OutputStream outputStream = null;
            try {
                HeadersLoader headers = this.a.getHeaders();
                Intrinsics.checkNotNullParameter(headers, "<this>");
                if (Intrinsics.areEqual(headers.loadHeaders().get("Content-Encoding"), "gzip")) {
                    bytes = f.a(this.a.getBody());
                } else {
                    bytes = this.a.getBody().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                }
                httpURLConnection.setRequestProperty(NetworkUtils.HEADER_CONTENT_LENGTH, String.valueOf(bytes.length));
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bytes);
                CloseableUtilKt.closeSafely(outputStream);
            } catch (Throwable th) {
                if (outputStream != null) {
                    CloseableUtilKt.closeSafely(outputStream);
                }
                throw th;
            }
        }
    }

    public final HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setReadTimeout(this.b);
        httpURLConnection.setConnectTimeout(this.c);
        httpURLConnection.setRequestMethod(this.a.getMethod());
        httpURLConnection.setDoOutput(this.a.getBody().length() > 0);
        return httpURLConnection;
    }
}
