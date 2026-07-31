package com.smaato.sdk.ng.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.utils.svgparser.SVG;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes14.dex */
public class NGSDKBitmapDownloader {
    private static final String h = "NGSDKBitmapDownloader";
    private DownloadListener a;
    private String b;
    private Handler c;
    private int d;
    private int e;
    private final Runnable f = new a();
    private final Runnable g = new b();

    public interface DownloadListener {
        void onDownloadFailed(String str, Exception exc);

        void onDownloadFinish(String str, Bitmap bitmap);
    }

    class a implements Runnable {
        HttpURLConnection a = null;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            Bitmap decodeStream;
            try {
                try {
                    try {
                        URL url = new URL(NGSDKBitmapDownloader.this.b);
                        this.a = (HttpURLConnection) url.openConnection();
                        InputStream urlConnectionGetInputStream = SmaatoNetworkBridge.urlConnectionGetInputStream(url.openConnection());
                        BitmapFactory.decodeStream(urlConnectionGetInputStream, new Rect(), NGSDKBitmapDownloader.this.a(true));
                        urlConnectionGetInputStream.close();
                        InputStream urlConnectionGetInputStream2 = SmaatoNetworkBridge.urlConnectionGetInputStream(url.openConnection());
                        if (url.openConnection().getContentType().equals("image/svg+xml")) {
                            Picture renderToPicture = SVG.getFromInputStream(urlConnectionGetInputStream2).renderToPicture();
                            decodeStream = Bitmap.createBitmap(renderToPicture.getWidth(), renderToPicture.getHeight(), Bitmap.Config.ARGB_8888);
                            new Canvas(decodeStream).drawPicture(renderToPicture);
                        } else {
                            decodeStream = BitmapFactory.decodeStream(urlConnectionGetInputStream2, null, NGSDKBitmapDownloader.this.a(false));
                        }
                        urlConnectionGetInputStream2.close();
                        NGSDKBitmapLruCache.addBitmapToMemoryCache(NGSDKBitmapDownloader.this.b, decodeStream);
                        NGSDKBitmapDownloader.this.a(decodeStream);
                        HttpURLConnection httpURLConnection2 = this.a;
                        if (httpURLConnection2 != null) {
                            SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                        }
                    } catch (RuntimeException e) {
                        NGSDKBitmapDownloader.this.a(new NextGenError(NextGenErrorCode.INTERNAL_ERROR, e));
                        httpURLConnection = this.a;
                        if (httpURLConnection == null) {
                            return;
                        }
                        SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    }
                } catch (Exception e2) {
                    NGSDKBitmapDownloader.this.a(new NextGenError(NextGenErrorCode.INTERNAL_ERROR, e2));
                    httpURLConnection = this.a;
                    if (httpURLConnection == null) {
                        return;
                    }
                    SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                } catch (OutOfMemoryError e3) {
                    NGSDKBitmapDownloader.this.a(new NextGenError(NextGenErrorCode.RESOURCE_EXHAUSTION, e3));
                    httpURLConnection = this.a;
                    if (httpURLConnection == null) {
                        return;
                    }
                    SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
            } catch (Throwable th) {
                HttpURLConnection httpURLConnection3 = this.a;
                if (httpURLConnection3 != null) {
                    SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection3);
                }
                throw th;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(Uri.parse(NGSDKBitmapDownloader.this.b).getEncodedPath(), NGSDKBitmapDownloader.this.a(false));
                NGSDKBitmapLruCache.addBitmapToMemoryCache(NGSDKBitmapDownloader.this.b, decodeFile);
                NGSDKBitmapDownloader.this.a(decodeFile);
            } catch (Exception e) {
                NGSDKBitmapDownloader.this.a(new NextGenError(NextGenErrorCode.INTERNAL_ERROR, e));
            } catch (OutOfMemoryError e2) {
                NGSDKBitmapDownloader.this.a(new NextGenError(NextGenErrorCode.RESOURCE_EXHAUSTION, e2));
            } catch (RuntimeException e3) {
                NGSDKBitmapDownloader.this.a(new NextGenError(NextGenErrorCode.INTERNAL_ERROR, e3));
            }
        }
    }

    private synchronized void a() {
        try {
            BitmapDownloaderExecutor.getExecutor().submit(this.f);
        } catch (OutOfMemoryError e) {
            Logger.e(h, "Error submitting download task: " + e.getMessage());
            a(new NextGenError(NextGenErrorCode.RESOURCE_EXHAUSTION, e));
        } catch (RejectedExecutionException e2) {
            Logger.e(h, "Task submission rejected: " + e2.getMessage());
            a(new NextGenError(NextGenErrorCode.RESOURCE_EXHAUSTION, e2));
        }
    }

    private void b() {
        try {
            BitmapDownloaderExecutor.getExecutor().submit(this.g);
        } catch (OutOfMemoryError e) {
            Logger.e(h, "Error submitting file load task: " + e.getMessage());
            a(new NextGenError(NextGenErrorCode.RESOURCE_EXHAUSTION, e));
        } catch (RejectedExecutionException e2) {
            Logger.e(h, "Task submission rejected: " + e2.getMessage());
            a(new NextGenError(NextGenErrorCode.RESOURCE_EXHAUSTION, e2));
        }
    }

    public synchronized void download(String str, DownloadListener downloadListener) {
        download(str, 0, 0, downloadListener);
    }

    public synchronized void download(String str, int i, int i2, DownloadListener downloadListener) {
        this.c = new Handler(Looper.getMainLooper());
        if (downloadListener == null) {
            Log.w(h, "download won't start since there is no assigned listener to It");
            return;
        }
        this.a = downloadListener;
        this.b = str;
        this.e = i;
        this.d = i2;
        if (TextUtils.isEmpty(str)) {
            a(new NextGenError(NextGenErrorCode.INVALID_URL, "Image URL is empty"));
            return;
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (URLUtil.isFileUrl(str)) {
                b();
                return;
            } else {
                a(new NextGenError(NextGenErrorCode.INVALID_URL, "Wrong file URL!"));
                return;
            }
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BitmapFactory.Options a(boolean z) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = this.e;
        if (i2 > 0 && (i = this.d) > 0 && !z) {
            options.inSampleSize = a(options, i2, i);
        }
        options.inJustDecodeBounds = z;
        return options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Bitmap bitmap) {
        DownloadListener downloadListener = this.a;
        this.a = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFinish(this.b, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Exception exc) {
        DownloadListener downloadListener = this.a;
        this.a = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFailed(this.b, exc);
        }
    }

    protected int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 *= 2;
        }
        return i5;
    }

    protected void a(final Bitmap bitmap) {
        this.c.post(new Runnable() { // from class: com.smaato.sdk.ng.utils.NGSDKBitmapDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NGSDKBitmapDownloader.this.b(bitmap);
            }
        });
    }

    protected void a(final Exception exc) {
        this.c.post(new Runnable() { // from class: com.smaato.sdk.ng.utils.NGSDKBitmapDownloader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NGSDKBitmapDownloader.this.b(exc);
            }
        });
    }
}
