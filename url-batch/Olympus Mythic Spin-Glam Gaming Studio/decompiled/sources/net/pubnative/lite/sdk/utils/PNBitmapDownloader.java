package net.pubnative.lite.sdk.utils;

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
import com.safedk.android.internal.partials.VerveNetworkBridge;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.utils.svgparser.SVG;

/* loaded from: classes9.dex */
public class PNBitmapDownloader {
    private static final String TAG = "PNBitmapDownloader";
    private final Runnable downloadTask = new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader.1
        HttpURLConnection connection = null;

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            Bitmap decodeStream;
            try {
                try {
                    try {
                        URL url = new URL(PNBitmapDownloader.this.mURL);
                        this.connection = (HttpURLConnection) url.openConnection();
                        InputStream urlConnectionGetInputStream = VerveNetworkBridge.urlConnectionGetInputStream(url.openConnection());
                        BitmapFactory.decodeStream(urlConnectionGetInputStream, new Rect(), PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(true));
                        urlConnectionGetInputStream.close();
                        InputStream urlConnectionGetInputStream2 = VerveNetworkBridge.urlConnectionGetInputStream(url.openConnection());
                        if (url.openConnection().getContentType().equals("image/svg+xml")) {
                            Picture renderToPicture = SVG.getFromInputStream(urlConnectionGetInputStream2).renderToPicture();
                            decodeStream = Bitmap.createBitmap(renderToPicture.getWidth(), renderToPicture.getHeight(), Bitmap.Config.ARGB_8888);
                            new Canvas(decodeStream).drawPicture(renderToPicture);
                        } else {
                            decodeStream = BitmapFactory.decodeStream(urlConnectionGetInputStream2, null, PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(false));
                        }
                        urlConnectionGetInputStream2.close();
                        PNBitmapLruCache.addBitmapToMemoryCache(PNBitmapDownloader.this.mURL, decodeStream);
                        PNBitmapDownloader.this.invokeLoad(decodeStream);
                        HttpURLConnection httpURLConnection2 = this.connection;
                        if (httpURLConnection2 != null) {
                            VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                        }
                    } catch (RuntimeException e) {
                        PNBitmapDownloader.this.invokeFail(new HyBidError(HyBidErrorCode.INTERNAL_ERROR, e));
                        httpURLConnection = this.connection;
                        if (httpURLConnection == null) {
                            return;
                        }
                        VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    }
                } catch (Exception e2) {
                    PNBitmapDownloader.this.invokeFail(new HyBidError(HyBidErrorCode.INTERNAL_ERROR, e2));
                    httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        return;
                    }
                    VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                } catch (OutOfMemoryError e3) {
                    PNBitmapDownloader.this.invokeFail(new HyBidError(HyBidErrorCode.RESOURCE_EXHAUSTION, e3));
                    httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        return;
                    }
                    VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
            } catch (Throwable th) {
                HttpURLConnection httpURLConnection3 = this.connection;
                if (httpURLConnection3 != null) {
                    VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection3);
                }
                throw th;
            }
        }
    };
    private final Runnable loadFromFileSystemTask = new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(Uri.parse(PNBitmapDownloader.this.mURL).getEncodedPath(), PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(false));
                PNBitmapLruCache.addBitmapToMemoryCache(PNBitmapDownloader.this.mURL, decodeFile);
                PNBitmapDownloader.this.invokeLoad(decodeFile);
            } catch (Exception e) {
                PNBitmapDownloader.this.invokeFail(new HyBidError(HyBidErrorCode.INTERNAL_ERROR, e));
            } catch (OutOfMemoryError e2) {
                PNBitmapDownloader.this.invokeFail(new HyBidError(HyBidErrorCode.RESOURCE_EXHAUSTION, e2));
            } catch (RuntimeException e3) {
                PNBitmapDownloader.this.invokeFail(new HyBidError(HyBidErrorCode.INTERNAL_ERROR, e3));
            }
        }
    };
    private DownloadListener mDownloadListener;
    private Handler mHandler;
    private int mHeight;
    private String mURL;
    private int mWidth;

    public interface DownloadListener {
        void onDownloadFailed(String str, Exception exc);

        void onDownloadFinish(String str, Bitmap bitmap);
    }

    private synchronized void downloadImage() {
        try {
            BitmapDownloaderExecutor.getExecutor().submit(this.downloadTask);
        } catch (OutOfMemoryError e) {
            Logger.e(TAG, "Error submitting download task: " + e.getMessage());
            invokeFail(new HyBidError(HyBidErrorCode.RESOURCE_EXHAUSTION, e));
        } catch (RejectedExecutionException e2) {
            Logger.e(TAG, "Task submission rejected: " + e2.getMessage());
            invokeFail(new HyBidError(HyBidErrorCode.RESOURCE_EXHAUSTION, e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BitmapFactory.Options getBitmapOptionsDecodingBounds(boolean z) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = this.mWidth;
        if (i2 > 0 && (i = this.mHeight) > 0 && !z) {
            options.inSampleSize = calculateInSampleSize(options, i2, i);
        }
        options.inJustDecodeBounds = z;
        return options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invokeFail$1(Exception exc) {
        DownloadListener downloadListener = this.mDownloadListener;
        this.mDownloadListener = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFailed(this.mURL, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invokeLoad$0(Bitmap bitmap) {
        DownloadListener downloadListener = this.mDownloadListener;
        this.mDownloadListener = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFinish(this.mURL, bitmap);
        }
    }

    private void loadCachedImage() {
        try {
            BitmapDownloaderExecutor.getExecutor().submit(this.loadFromFileSystemTask);
        } catch (OutOfMemoryError e) {
            Logger.e(TAG, "Error submitting file load task: " + e.getMessage());
            invokeFail(new HyBidError(HyBidErrorCode.RESOURCE_EXHAUSTION, e));
        } catch (RejectedExecutionException e2) {
            Logger.e(TAG, "Task submission rejected: " + e2.getMessage());
            invokeFail(new HyBidError(HyBidErrorCode.RESOURCE_EXHAUSTION, e2));
        }
    }

    protected int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
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

    public synchronized void download(String str, DownloadListener downloadListener) {
        download(str, 0, 0, downloadListener);
    }

    protected void invokeFail(final Exception exc) {
        this.mHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PNBitmapDownloader.this.lambda$invokeFail$1(exc);
            }
        });
    }

    protected void invokeLoad(final Bitmap bitmap) {
        this.mHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PNBitmapDownloader.this.lambda$invokeLoad$0(bitmap);
            }
        });
    }

    public synchronized void download(String str, int i, int i2, DownloadListener downloadListener) {
        this.mHandler = new Handler(Looper.getMainLooper());
        if (downloadListener == null) {
            Log.w(TAG, "download won't start since there is no assigned listener to It");
            return;
        }
        this.mDownloadListener = downloadListener;
        this.mURL = str;
        this.mWidth = i;
        this.mHeight = i2;
        if (TextUtils.isEmpty(str)) {
            invokeFail(new HyBidError(HyBidErrorCode.INVALID_URL, "Image URL is empty"));
            return;
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (URLUtil.isFileUrl(str)) {
                loadCachedImage();
                return;
            } else {
                invokeFail(new HyBidError(HyBidErrorCode.INVALID_URL, "Wrong file URL!"));
                return;
            }
        }
        downloadImage();
    }
}
