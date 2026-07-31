package io.bidmachine.rendering.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.ironsource.C4701ic;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;
import io.bidmachine.util.network.NetworkUtils;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkRequest<ResponseType> {
    private static final TaskManager m = new NetworkTaskManager();
    private final String a;
    private final Method b;
    private final Map c;
    private final Map d;
    private final Integer e;
    private final Integer f;
    private final UrlConnectionProcessor g;
    private final DataRetriever h;
    private final ResponseProcessor i;
    private final Listener j;
    private TaskManager k;
    private CancelableTask l;

    public static class Builder<ResponseType> {
        private final String a;
        private final Method b;
        private final Map c = new HashMap();
        private final Map d = new HashMap();
        private Integer e;
        private Integer f;
        private UrlConnectionProcessor g;
        private DataRetriever h;
        private ResponseProcessor i;
        private Listener j;

        public Builder(@NonNull String str, @NonNull Method method) {
            this.a = str;
            this.b = method;
        }

        public Builder<ResponseType> addHeader(@NonNull String str, @NonNull String str2) {
            this.c.put(str, str2);
            return this;
        }

        public Builder<ResponseType> addQueryParameter(@NonNull String str, @NonNull String str2) {
            this.d.put(str, str2);
            return this;
        }

        @NonNull
        public NetworkRequest<ResponseType> build() {
            return new NetworkRequest<>(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        @NonNull
        public NetworkRequest<ResponseType> send() {
            NetworkRequest<ResponseType> build = build();
            build.send();
            return build;
        }

        public Builder<ResponseType> setConnectTimeout(@Nullable Integer num) {
            this.e = num;
            return this;
        }

        public Builder<ResponseType> setHeaders(@Nullable Map<String, String> map) {
            Utils.set(this.c, map);
            return this;
        }

        public Builder<ResponseType> setListener(@Nullable Listener<ResponseType> listener) {
            this.j = listener;
            return this;
        }

        public Builder<ResponseType> setQueryParameters(@Nullable Map<String, String> map) {
            Utils.set(this.d, map);
            return this;
        }

        public Builder<ResponseType> setReadTimeout(@Nullable Integer num) {
            this.f = num;
            return this;
        }

        public Builder<ResponseType> setRequestDataRetriever(@Nullable DataRetriever dataRetriever) {
            this.h = dataRetriever;
            return this;
        }

        public Builder<ResponseType> setResponseTransformer(@Nullable ResponseProcessor<ResponseType> responseProcessor) {
            this.i = responseProcessor;
            return this;
        }

        public Builder<ResponseType> setUrlConnectionProcessor(@Nullable UrlConnectionProcessor urlConnectionProcessor) {
            this.g = urlConnectionProcessor;
            return this;
        }

        public Builder<ResponseType> setUserAgent(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                addHeader("User-Agent", str);
            }
            return this;
        }
    }

    public static abstract class ByteArrayProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<byte[], T> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream urlConnectionGetInputStream;
            InputStream inputStream = null;
            try {
                urlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(uRLConnection);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th) {
                    inputStream = urlConnectionGetInputStream;
                    th = th;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
            try {
                Utils.write(urlConnectionGetInputStream, byteArrayOutputStream);
                T transform = transform(byteArrayOutputStream.toByteArray());
                io.bidmachine.util.Utils.flushSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(urlConnectionGetInputStream);
                return transform;
            } catch (Throwable th3) {
                inputStream = urlConnectionGetInputStream;
                th = th3;
                io.bidmachine.util.Utils.flushSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(byteArrayOutputStream);
                io.bidmachine.util.Utils.closeSafely(inputStream);
                throw th;
            }
        }
    }

    public interface DataRetriever {
        @Nullable
        @WorkerThread
        byte[] retrieve();
    }

    public static abstract class FileOutputStreamProcessor<T> implements ResponseProcessor<T>, ResponseTransformer<File, T> {
        private final Context a;
        private final File b;

        public FileOutputStreamProcessor(@NonNull Context context, @NonNull File file) {
            this.a = context.getApplicationContext();
            this.b = file;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseProcessor
        @Nullable
        public T process(@NonNull URLConnection uRLConnection) {
            FileOutputStream fileOutputStream;
            File externalDir = io.bidmachine.util.file.FileUtils.getExternalDir(this.a);
            if (externalDir == null) {
                throw new IllegalStateException("Can't get external dir");
            }
            File createTempFile = io.bidmachine.util.file.FileUtils.createTempFile(externalDir);
            long contentLength = uRLConnection.getContentLength();
            InputStream inputStream = null;
            try {
                InputStream urlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(uRLConnection);
                try {
                    fileOutputStream = BidMachineFilesBridge.fileOutputStreamCtor(createTempFile);
                    try {
                        long write = Utils.write(urlConnectionGetInputStream, fileOutputStream);
                        io.bidmachine.util.Utils.flushSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(urlConnectionGetInputStream);
                        if (contentLength != write) {
                            io.bidmachine.util.file.FileUtils.deleteFile(createTempFile);
                            throw new IllegalStateException("The downloaded file size does not match the stated size");
                        }
                        if (!io.bidmachine.util.file.FileUtils.renameToSafely(createTempFile, this.b)) {
                            io.bidmachine.util.file.FileUtils.deleteFile(createTempFile);
                            if (!io.bidmachine.util.file.FileUtils.hasContent(this.b)) {
                                throw new IllegalStateException("Can't rename temp file");
                            }
                        }
                        return transform(this.b);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = urlConnectionGetInputStream;
                        io.bidmachine.util.Utils.flushSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(fileOutputStream);
                        io.bidmachine.util.Utils.closeSafely(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }
    }

    public interface Listener<ResponseType> {
        void onError(@NonNull Error error);

        void onSuccess(@Nullable ResponseType responsetype);
    }

    public enum Method {
        Get(C4701ic.a),
        Post("POST");

        private final String a;

        Method(@NonNull String str) {
            this.a = str;
        }

        public String getNetworkName() {
            return this.a;
        }
    }

    public interface ResponseProcessor<ResponseType> {
        @Nullable
        ResponseType process(@NonNull URLConnection uRLConnection);
    }

    public interface ResponseTransformer<From, To> {
        @Nullable
        To transform(@NonNull From from);
    }

    public static class StringProcessor extends ByteArrayProcessor<String> {
        @Override // io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        @Nullable
        public String transform(@NonNull byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public interface UrlConnectionProcessor {
        void process(@NonNull URLConnection uRLConnection);
    }

    private class b extends CancelableTask {
        private b() {
        }

        @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.b();
        }
    }

    public NetworkRequest(@NonNull String str, @NonNull Method method, @NonNull Map<String, String> map, @NonNull Map<String, String> map2, @Nullable Integer num, @Nullable Integer num2, @Nullable UrlConnectionProcessor urlConnectionProcessor, @Nullable DataRetriever dataRetriever, @Nullable ResponseProcessor<ResponseType> responseProcessor, @Nullable Listener<ResponseType> listener) {
        this.a = str;
        this.b = method;
        this.e = num;
        this.f = num2;
        this.i = responseProcessor;
        this.c = map;
        this.d = map2;
        this.g = urlConnectionProcessor;
        this.h = dataRetriever;
        this.j = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            httpURLConnection = a(NetworkUtils.appendQueryParameters(this.a, this.d));
            try {
                int httpUrlConnectionGetResponseCode = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                if (httpUrlConnectionGetResponseCode == 200) {
                    ResponseProcessor responseProcessor = this.i;
                    if (responseProcessor == null) {
                        a((Object) null);
                    } else {
                        try {
                            a(responseProcessor.process(httpURLConnection));
                        } catch (Throwable th2) {
                            a(Error.create(th2));
                        }
                    }
                } else if (httpUrlConnectionGetResponseCode == 204) {
                    a((Object) null);
                } else {
                    a(new Error("Server response code - " + httpUrlConnectionGetResponseCode + " " + httpURLConnection.getResponseMessage()));
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    a(Error.create(th));
                } finally {
                    NetworkUtils.disconnectSafely(httpURLConnection);
                }
            }
        } catch (Throwable th4) {
            httpURLConnection = null;
            th = th4;
        }
    }

    public void cancel() {
        TaskManager taskManager = this.k;
        CancelableTask cancelableTask = this.l;
        if (taskManager != null && cancelableTask != null) {
            taskManager.cancel(cancelableTask);
        }
        a();
    }

    public void send() {
        send(m);
    }

    private HttpURLConnection a(String str) {
        byte[] retrieve;
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod(this.b.getNetworkName());
                for (Map.Entry entry : this.c.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                UrlConnectionProcessor urlConnectionProcessor = this.g;
                if (urlConnectionProcessor != null) {
                    urlConnectionProcessor.process(httpURLConnection2);
                }
                Integer num = this.e;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.e.intValue());
                }
                Integer num2 = this.f;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.f.intValue());
                }
                DataRetriever dataRetriever = this.h;
                if (dataRetriever != null && (retrieve = dataRetriever.retrieve()) != null) {
                    a(httpURLConnection2, retrieve);
                }
                switch (BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2)) {
                    case 301:
                    case 302:
                    case POBVastError.NO_VAST_RESPONSE /* 303 */:
                    case MRAID_BRIDGE_ERROR_VALUE:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField(NetworkUtils.HEADER_LOCATION);
                        if (!TextUtils.isEmpty(headerField) && io.bidmachine.util.Utils.isHttpUrl(headerField)) {
                            NetworkUtils.disconnectSafely(httpURLConnection2);
                            return a(headerField);
                        }
                        return httpURLConnection2;
                    case 304:
                    case 306:
                    default:
                        return httpURLConnection2;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                NetworkUtils.disconnectSafely(httpURLConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void send(@NonNull TaskManager taskManager) {
        cancel();
        this.k = taskManager;
        b bVar = new b();
        this.l = bVar;
        try {
            taskManager.execute(bVar);
        } catch (Throwable th) {
            a(Error.create(th));
        }
    }

    private void a(URLConnection uRLConnection, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(BidMachineNetworkBridge.urlConnectionGetOutputStream(uRLConnection));
            try {
                bufferedOutputStream2.write(bArr);
                io.bidmachine.iab.utils.Utils.flush(bufferedOutputStream2);
                io.bidmachine.iab.utils.Utils.close(bufferedOutputStream2);
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                io.bidmachine.iab.utils.Utils.flush(bufferedOutputStream);
                io.bidmachine.iab.utils.Utils.close(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(Object obj) {
        Listener listener = this.j;
        if (listener != null) {
            listener.onSuccess(obj);
        }
    }

    private void a(Error error) {
        Listener listener = this.j;
        if (listener != null) {
            listener.onError(error);
        }
    }

    private void a() {
        this.k = null;
        this.l = null;
    }
}
