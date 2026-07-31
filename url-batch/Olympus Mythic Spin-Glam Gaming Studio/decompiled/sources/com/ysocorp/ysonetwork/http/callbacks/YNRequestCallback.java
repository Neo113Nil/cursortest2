package com.ysocorp.ysonetwork.http.callbacks;

import androidx.annotation.Nullable;
import com.ysocorp.ysonetwork.utils.YNLog;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
public abstract class YNRequestCallback extends UrlRequest.Callback {
    protected String requestError = null;

    @Nullable
    public static YNFileRequestCallback buildFileRequestCallback(String str, String str2, CountDownLatch countDownLatch) {
        try {
            YNFileRequestCallback yNFileRequestCallback = new YNFileRequestCallback(str, str2, countDownLatch);
            yNFileRequestCallback.initialize();
            return yNFileRequestCallback;
        } catch (IOException e) {
            YNLog.Error("YNFileRequestCallback::IOException::" + e.getMessage());
            return null;
        }
    }

    public String getRequestError() {
        return this.requestError;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }
}
