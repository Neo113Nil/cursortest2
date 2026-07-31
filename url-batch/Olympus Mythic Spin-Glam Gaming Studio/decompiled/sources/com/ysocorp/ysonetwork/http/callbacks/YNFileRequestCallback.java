package com.ysocorp.ysonetwork.http.callbacks;

import android.os.Build;
import com.ysocorp.ysonetwork.utils.YNFileApi26Helper;
import com.ysocorp.ysonetwork.utils.YNLog;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes12.dex */
public class YNFileRequestCallback extends YNRequestCallback {
    private final ByteBuffer buffer = ByteBuffer.allocateDirect(32768);
    private final CountDownLatch latch;
    private OutputStream outputStream;
    private final String savePath;
    private final String url;

    YNFileRequestCallback(String str, String str2, CountDownLatch countDownLatch) {
        this.savePath = str;
        this.url = str2;
        this.latch = countDownLatch;
    }

    void initialize() throws IOException {
        if (Build.VERSION.SDK_INT >= 26) {
            this.outputStream = YNFileApi26Helper.openStream(this.savePath);
        } else {
            this.outputStream = new BufferedOutputStream(new FileOutputStream(this.savePath));
        }
    }

    private void closeOutputStreamQuietly(String str) {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            YNLog.Error("YNFileRequestCallback::" + str + "::outputStream.close error: " + e.getMessage());
        }
    }

    private String buildRequestError(String str, String str2) {
        return "YNFileRequestCallback::RequestError::" + str + "::" + str2;
    }

    @Override // com.ysocorp.ysonetwork.http.callbacks.YNRequestCallback, org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            this.outputStream.write(bArr);
            byteBuffer.clear();
            urlRequest.read(byteBuffer);
        } catch (IOException e) {
            this.requestError = buildRequestError("onReadCompleted", "write failed: " + e.getMessage());
            YNLog.Error("YNFileRequestCallback::onReadCompleted::write failed: " + e.getMessage());
            closeOutputStreamQuietly("onReadCompleted");
            urlRequest.cancel();
            this.latch.countDown();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        closeOutputStreamQuietly("onSucceeded");
        YNLog.Info("YNFileRequestCallback::onSucceeded::file downloaded and saved successfully: " + this.url + " to: " + this.savePath);
        this.latch.countDown();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        closeOutputStreamQuietly("onFailed");
        String message = cronetException.getMessage();
        if (message == null) {
            message = "unknown error";
        }
        this.requestError = buildRequestError("onFailed", "error: " + message);
        YNLog.Error("YNFileRequestCallback::onFailed::file download failed: " + this.url + " to: " + this.savePath + " error: " + message);
        this.latch.countDown();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode < 400) {
            this.buffer.clear();
            urlRequest.read(this.buffer);
            return;
        }
        this.requestError = buildRequestError("onResponseStarted", "response status: " + httpStatusCode);
        YNLog.Error("YNFileRequestCallback::onResponseStarted::response status: " + httpStatusCode);
        closeOutputStreamQuietly("onResponseStarted");
        urlRequest.cancel();
        this.latch.countDown();
    }
}
