package io.ably.lib.http;

import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import java.net.URL;

/* loaded from: classes7.dex */
public class HttpHelpers {
    private static final String TAG = "io.ably.lib.http.HttpHelpers";

    public static <T> T ablyHttpExecute(Http http, final String str, final String str2, final Param[] paramArr, final Param[] paramArr2, final HttpCore.RequestBody requestBody, final HttpCore.ResponseHandler<T> responseHandler, final boolean z) throws AblyException {
        return (T) http.request(new Http.Execute<T>() { // from class: io.ably.lib.http.HttpHelpers.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<T> callback) throws AblyException {
                httpScheduler.exec(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
            }
        }).sync();
    }

    public static String getUrlString(HttpCore httpCore, String str) throws AblyException {
        byte[] url = getUrl(httpCore, str);
        if (url == null) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Empty response body", 500, 50000));
        }
        return new String(url);
    }

    public static byte[] getUrl(HttpCore httpCore, String str) throws AblyException {
        try {
            return (byte[]) httpExecute(httpCore, new URL(str), "GET", null, null, new HttpCore.ResponseHandler<byte[]>() { // from class: io.ably.lib.http.HttpHelpers.2
                @Override // io.ably.lib.http.HttpCore.ResponseHandler
                public byte[] handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                    if (errorInfo != null) {
                        throw AblyException.fromErrorInfo(errorInfo);
                    }
                    return response.body;
                }
            });
        } catch (Exception e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static <T> T getUri(HttpCore httpCore, String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler) throws AblyException {
        return (T) httpExecute(httpCore, HttpUtils.buildURL(str, paramArr2), "GET", paramArr, null, responseHandler);
    }

    public static <T> T postUri(HttpCore httpCore, String str, Param[] paramArr, Param[] paramArr2, Param[] paramArr3, HttpCore.ResponseHandler<T> responseHandler) throws AblyException {
        return (T) httpExecute(httpCore, HttpUtils.buildURL(str, paramArr2), "POST", paramArr, new HttpUtils.FormRequestBody(paramArr3), responseHandler);
    }

    public static <T> T httpExecute(HttpCore httpCore, URL url, String str, Param[] paramArr, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler) throws AblyException {
        return (T) httpCore.httpExecuteWithRetry(url, str, paramArr, requestBody, responseHandler, false);
    }

    public static <T> T postSync(Http http, final String str, final Param[] paramArr, final Param[] paramArr2, final HttpCore.RequestBody requestBody, final HttpCore.ResponseHandler<T> responseHandler, final boolean z) throws AblyException {
        return (T) http.request(new Http.Execute<T>() { // from class: io.ably.lib.http.HttpHelpers.3
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<T> callback) throws AblyException {
                httpScheduler.post(str, paramArr, paramArr2, requestBody, responseHandler, z, callback);
            }
        }).sync();
    }
}
