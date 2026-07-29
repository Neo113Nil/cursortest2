package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import o.AbstractC1473m3;
import o.MU;
import o.NU;
import o.RunnableC1866s2;

/* loaded from: classes.dex */
public class ImageDownload implements Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 1048576;
    private volatile Future<?> future;
    private MU task;
    private final URL url;

    private ImageDownload(URL url) {
        this.url = url;
    }

    private byte[] blockingDownloadBytes() {
        URLConnection openConnection = this.url.openConnection();
        if (openConnection.getContentLength() > MAX_IMAGE_SIZE_BYTES) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(Constants.TAG, 2)) {
                Log.v(Constants.TAG, "Downloaded " + byteArray.length + " bytes from " + this.url);
            }
            if (byteArray.length <= MAX_IMAGE_SIZE_BYTES) {
                return byteArray;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w(Constants.TAG, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(NU nu) {
        try {
            nu.b(blockingDownload());
        } catch (Exception e) {
            nu.a(e);
        }
    }

    public Bitmap blockingDownload() {
        if (Log.isLoggable(Constants.TAG, 4)) {
            Log.i(Constants.TAG, "Starting download of: " + this.url);
        }
        byte[] blockingDownloadBytes = blockingDownloadBytes();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blockingDownloadBytes, 0, blockingDownloadBytes.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.url);
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Successfully downloaded image: " + this.url);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.future.cancel(true);
    }

    public MU getTask() {
        MU mu = this.task;
        AbstractC1473m3.n(mu);
        return mu;
    }

    public void start(ExecutorService executorService) {
        NU nu = new NU();
        this.future = executorService.submit(new RunnableC1866s2(this, 6, nu));
        this.task = nu.a;
    }
}
