package io.ably.lib.network;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.ably.lib.network.HttpResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
class DefaultHttpCall implements HttpCall {
    private HttpURLConnection connection;
    private final Proxy proxy;
    private final HttpRequest request;

    DefaultHttpCall(HttpRequest httpRequest, Proxy proxy) {
        this.request = httpRequest;
        this.proxy = proxy;
    }

    @Override // io.ably.lib.network.HttpCall
    public HttpResponse execute() {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(this.request.getUrl().openConnection(this.proxy)));
                this.connection = httpURLConnection;
                httpURLConnection.setRequestMethod(this.request.getMethod());
                this.connection.setConnectTimeout(this.request.getHttpOpenTimeout());
                this.connection.setReadTimeout(this.request.getHttpReadTimeout());
                this.connection.setDoInput(true);
                for (Map.Entry<String, List<String>> entry : this.request.getHeaders().entrySet()) {
                    String key = entry.getKey();
                    Iterator<String> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        this.connection.setRequestProperty(key, it.next());
                    }
                }
                if (this.request.getBody() != null) {
                    writeRequestBody(prepareRequestBody(this.request.getBody()));
                }
                return readResponse();
            } catch (ConnectException e) {
                e = e;
                throw new FailedConnectionException(e);
            } catch (NoRouteToHostException e2) {
                e = e2;
                throw new FailedConnectionException(e);
            } catch (SocketTimeoutException e3) {
                e = e3;
                throw new FailedConnectionException(e);
            } catch (UnknownHostException e4) {
                e = e4;
                throw new FailedConnectionException(e);
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } finally {
            cancel();
        }
    }

    @Override // io.ably.lib.network.HttpCall
    public void cancel() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private byte[] prepareRequestBody(HttpBody httpBody) throws IOException {
        this.connection.setDoOutput(true);
        byte[] content = httpBody.getContent();
        this.connection.setFixedLengthStreamingMode(content.length);
        return content;
    }

    private void writeRequestBody(byte[] bArr) throws IOException {
        this.connection.getOutputStream().write(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r3 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HttpResponse readResponse() throws IOException {
        InputStream inputStream;
        HttpResponse.HttpResponseBuilder builder = HttpResponse.builder();
        int responseCode = this.connection.getResponseCode();
        builder.code(responseCode).message(this.connection.getResponseMessage());
        Map<String, List<String>> headerFields = this.connection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
            }
        }
        builder.headers(hashMap);
        if (responseCode == 204) {
            return builder.build();
        }
        String contentType = this.connection.getContentType();
        int contentLength = this.connection.getContentLength();
        try {
            inputStream = this.connection.getInputStream();
        } catch (Throwable unused) {
            inputStream = null;
        }
        if (inputStream == null) {
            inputStream = this.connection.getErrorStream();
        }
        try {
            builder.body(new HttpBody(contentType, readInputStream(inputStream, contentLength)));
        } catch (NullPointerException unused2) {
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
        return builder.build();
    }

    private byte[] readInputStream(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("inputStream == null");
        }
        int i2 = 0;
        if (i == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } else {
            byte[] bArr2 = new byte[i];
            while (true) {
                int read2 = inputStream.read(bArr2, i2, i - i2);
                if (read2 <= -1) {
                    return bArr2;
                }
                i2 += read2;
            }
        }
    }
}
