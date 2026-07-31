package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookException;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageDownloader.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004-./0B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J(\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\"H\u0007J2\u0010#\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u000e\u0010$\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/facebook/internal/ImageDownloader;", "", "()V", "CACHE_READ_QUEUE_MAX_CONCURRENT", "", "DOWNLOAD_QUEUE_MAX_CONCURRENT", "cacheReadQueue", "Lcom/facebook/internal/WorkQueue;", "downloadQueue", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "pendingRequests", "", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "cancelRequest", "", "request", "Lcom/facebook/internal/ImageRequest;", "clearCache", "", "download", "key", "downloadAsync", "enqueueCacheRead", "allowCachedRedirects", "enqueueDownload", "enqueueRequest", "workQueue", "workItem", "Ljava/lang/Runnable;", "getPendingRequests", "", "issueResponse", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "bitmap", "Landroid/graphics/Bitmap;", "isCachedRedirect", "prioritizeRequest", "readFromCache", "removePendingRequest", "CacheReadWorkItem", "DownloadImageWorkItem", "DownloaderContext", "RequestKey", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ImageDownloader {
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;

    @Nullable
    private static Handler handler;

    @NotNull
    public static final ImageDownloader INSTANCE = new ImageDownloader();

    @NotNull
    private static final WorkQueue downloadQueue = new WorkQueue(8, null, 2, null);

    @NotNull
    private static final WorkQueue cacheReadQueue = new WorkQueue(2, null, 2, null);

    @NotNull
    private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();

    private ImageDownloader() {
    }

    private final synchronized Handler getHandler() {
        try {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return handler;
    }

    public static final void downloadAsync(@Nullable ImageRequest request) {
        if (request == null) {
            return;
        }
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    downloaderContext.setRequest(request);
                    downloaderContext.setCancelled(false);
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    if (workItem != null) {
                        workItem.moveToFront();
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    INSTANCE.enqueueCacheRead(request, requestKey, request.isCachedRedirectAllowed());
                    Unit unit2 = Unit.INSTANCE;
                }
            } finally {
            }
        }
    }

    public static final boolean cancelRequest(@NotNull ImageRequest request) {
        boolean z;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    z = true;
                    if (workItem != null && workItem.cancel()) {
                        map.remove(requestKey);
                    } else {
                        downloaderContext.setCancelled(true);
                    }
                } else {
                    z = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static final void prioritizeRequest(@NotNull ImageRequest request) {
        WorkQueue.WorkItem workItem;
        Intrinsics.checkNotNullParameter(request, "request");
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null && (workItem = downloaderContext.getWorkItem()) != null) {
                    workItem.moveToFront();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void clearCache() {
        ImageResponseCache.clearCache();
        UrlRedirectCache.clearCache();
    }

    @VisibleForTesting
    @NotNull
    public final Map<RequestKey, DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }

    private final void enqueueCacheRead(ImageRequest request, RequestKey key, boolean allowCachedRedirects) {
        enqueueRequest(request, key, cacheReadQueue, new CacheReadWorkItem(key, allowCachedRedirects));
    }

    private final void enqueueDownload(ImageRequest request, RequestKey key) {
        enqueueRequest(request, key, downloadQueue, new DownloadImageWorkItem(key));
    }

    private final void enqueueRequest(ImageRequest request, RequestKey key, WorkQueue workQueue, Runnable workItem) {
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = new DownloaderContext(request);
            map.put(key, downloaderContext);
            downloaderContext.setWorkItem(WorkQueue.addActiveWorkItem$default(workQueue, workItem, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void issueResponse(RequestKey key, final Exception error, final Bitmap bitmap, final boolean isCachedRedirect) {
        Handler handler2;
        DownloaderContext removePendingRequest = removePendingRequest(key);
        if (removePendingRequest == null || removePendingRequest.getIsCancelled()) {
            return;
        }
        final ImageRequest request = removePendingRequest.getRequest();
        final ImageRequest.Callback callback = request == null ? null : request.getCallback();
        if (callback == null || (handler2 = getHandler()) == null) {
            return;
        }
        handler2.post(new Runnable() { // from class: com.facebook.internal.ImageDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownloader.m3436issueResponse$lambda4(ImageRequest.this, error, isCachedRedirect, bitmap, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: issueResponse$lambda-4, reason: not valid java name */
    public static final void m3436issueResponse$lambda4(ImageRequest request, Exception exc, boolean z, Bitmap bitmap, ImageRequest.Callback callback) {
        Intrinsics.checkNotNullParameter(request, "$request");
        callback.onCompleted(new ImageResponse(request, exc, z, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void readFromCache(RequestKey key, boolean allowCachedRedirects) {
        InputStream inputStream;
        boolean z = false;
        if (allowCachedRedirects) {
            UrlRedirectCache urlRedirectCache = UrlRedirectCache.INSTANCE;
            Uri redirectedUri = UrlRedirectCache.getRedirectedUri(key.getUri());
            if (redirectedUri != null) {
                inputStream = ImageResponseCache.getCachedImageStream(redirectedUri);
                if (inputStream != null) {
                    z = true;
                }
                if (!z) {
                    ImageResponseCache imageResponseCache = ImageResponseCache.INSTANCE;
                    inputStream = ImageResponseCache.getCachedImageStream(key.getUri());
                }
                if (inputStream == null) {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    Utility.closeQuietly(inputStream);
                    issueResponse(key, null, decodeStream, z);
                    return;
                }
                DownloaderContext removePendingRequest = removePendingRequest(key);
                ImageRequest request = removePendingRequest != null ? removePendingRequest.getRequest() : null;
                if (removePendingRequest == null || removePendingRequest.getIsCancelled() || request == null) {
                    return;
                }
                enqueueDownload(request, key);
                return;
            }
        }
        inputStream = null;
        if (!z) {
        }
        if (inputStream == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(RequestKey key) {
        HttpURLConnection httpURLConnection;
        Closeable closeable;
        Exception exc;
        URLConnection openConnection;
        ?? responseCode;
        InputStream interceptAndCacheImageStream;
        Bitmap decodeStream;
        Closeable closeable2 = null;
        InputStream inputStream = null;
        closeable2 = null;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            openConnection = new URL(key.getUri().toString()).openConnection();
        } catch (IOException e) {
            e = e;
            httpURLConnection = null;
            closeable = null;
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
        } catch (IOException e3) {
            e = e3;
            closeable = responseCode;
            Utility.closeQuietly(closeable);
            Utility.disconnectQuietly(httpURLConnection);
            exc = e;
            if (z) {
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = responseCode;
            Utility.closeQuietly(closeable2);
            Utility.disconnectQuietly(httpURLConnection);
            throw th;
        }
        if (responseCode == 200) {
            interceptAndCacheImageStream = ImageResponseCache.interceptAndCacheImageStream(httpURLConnection);
            decodeStream = BitmapFactory.decodeStream(interceptAndCacheImageStream);
            exc = null;
        } else {
            if (responseCode == 301 || responseCode == 302) {
                try {
                    String headerField = httpURLConnection.getHeaderField("location");
                    if (!Utility.isNullOrEmpty(headerField)) {
                        Uri redirectUri = Uri.parse(headerField);
                        UrlRedirectCache urlRedirectCache = UrlRedirectCache.INSTANCE;
                        UrlRedirectCache.cacheUriRedirect(key.getUri(), redirectUri);
                        DownloaderContext removePendingRequest = removePendingRequest(key);
                        if (removePendingRequest != null && !removePendingRequest.getIsCancelled()) {
                            ImageRequest request = removePendingRequest.getRequest();
                            Intrinsics.checkNotNullExpressionValue(redirectUri, "redirectUri");
                            enqueueCacheRead(request, new RequestKey(redirectUri, key.getTag()), false);
                        }
                    }
                    z = false;
                    decodeStream = null;
                    exc = null;
                    Utility.closeQuietly(inputStream);
                    Utility.disconnectQuietly(httpURLConnection);
                    bitmap = decodeStream;
                } catch (IOException e4) {
                    e = e4;
                    z = false;
                    closeable = null;
                    Utility.closeQuietly(closeable);
                    Utility.disconnectQuietly(httpURLConnection);
                    exc = e;
                    if (z) {
                    }
                }
                if (z) {
                    return;
                }
                issueResponse(key, exc, bitmap, false);
                return;
            }
            interceptAndCacheImageStream = httpURLConnection.getErrorStream();
            StringBuilder sb = new StringBuilder();
            if (interceptAndCacheImageStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(interceptAndCacheImageStream);
                char[] cArr = new char[128];
                while (true) {
                    int read = inputStreamReader.read(cArr, 0, 128);
                    if (read <= 0) {
                        break;
                    } else {
                        sb.append(cArr, 0, read);
                    }
                }
                Utility.closeQuietly(inputStreamReader);
            } else {
                sb.append("Unexpected error while downloading an image.");
            }
            exc = new FacebookException(sb.toString());
            decodeStream = null;
        }
        inputStream = interceptAndCacheImageStream;
        Utility.closeQuietly(inputStream);
        Utility.disconnectQuietly(httpURLConnection);
        bitmap = decodeStream;
        if (z) {
        }
    }

    private final DownloaderContext removePendingRequest(RequestKey key) {
        DownloaderContext remove;
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            remove = map.remove(key);
        }
        return remove;
    }

    /* compiled from: ImageDownloader.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0004\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/ImageDownloader$RequestKey;", "", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "tag", "(Landroid/net/Uri;Ljava/lang/Object;)V", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "equals", "", "o", "hashCode", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @VisibleForTesting
    public static final class RequestKey {
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;

        @NotNull
        private Object tag;

        @NotNull
        private Uri uri;

        public RequestKey(@NotNull Uri uri, @NotNull Object tag) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.uri = uri;
            this.tag = tag;
        }

        @NotNull
        public final Object getTag() {
            return this.tag;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public final void setTag(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.tag = obj;
        }

        public final void setUri(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.uri = uri;
        }

        public int hashCode() {
            return ((1073 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }

        public boolean equals(@Nullable Object o) {
            if (o == null || !(o instanceof RequestKey)) {
                return false;
            }
            RequestKey requestKey = (RequestKey) o;
            return requestKey.uri == this.uri && requestKey.tag == this.tag;
        }
    }

    /* compiled from: ImageDownloader.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "", "request", "Lcom/facebook/internal/ImageRequest;", "(Lcom/facebook/internal/ImageRequest;)V", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "getRequest", "()Lcom/facebook/internal/ImageRequest;", "setRequest", "workItem", "Lcom/facebook/internal/WorkQueue$WorkItem;", "getWorkItem", "()Lcom/facebook/internal/WorkQueue$WorkItem;", "setWorkItem", "(Lcom/facebook/internal/WorkQueue$WorkItem;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @VisibleForTesting
    public static final class DownloaderContext {
        private boolean isCancelled;

        @NotNull
        private ImageRequest request;

        @Nullable
        private WorkQueue.WorkItem workItem;

        public DownloaderContext(@NotNull ImageRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        @NotNull
        public final ImageRequest getRequest() {
            return this.request;
        }

        public final void setRequest(@NotNull ImageRequest imageRequest) {
            Intrinsics.checkNotNullParameter(imageRequest, "<set-?>");
            this.request = imageRequest;
        }

        @Nullable
        public final WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        public final void setWorkItem(@Nullable WorkQueue.WorkItem workItem) {
            this.workItem = workItem;
        }

        /* renamed from: isCancelled, reason: from getter */
        public final boolean getIsCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z) {
            this.isCancelled = z;
        }
    }

    /* compiled from: ImageDownloader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;", "Ljava/lang/Runnable;", "key", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "allowCachedRedirects", "", "(Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V", "run", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class CacheReadWorkItem implements Runnable {
        private final boolean allowCachedRedirects;

        @NotNull
        private final RequestKey key;

        public CacheReadWorkItem(@NotNull RequestKey key, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.allowCachedRedirects = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ImageDownloader.INSTANCE.readFromCache(this.key, this.allowCachedRedirects);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* compiled from: ImageDownloader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;", "Ljava/lang/Runnable;", "key", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "(Lcom/facebook/internal/ImageDownloader$RequestKey;)V", "run", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class DownloadImageWorkItem implements Runnable {

        @NotNull
        private final RequestKey key;

        public DownloadImageWorkItem(@NotNull RequestKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ImageDownloader.INSTANCE.download(this.key);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
