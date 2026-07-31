package io.bidmachine.core;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> {

    @NonNull
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();

    @Nullable
    private Callback<RequestResultType, ErrorResultType> callback;

    @Nullable
    private CancelCallback cancelCallback;

    @Nullable
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> contentEncoders;

    @Nullable
    private URLConnection currentConnection;
    private State currentState = State.Idle;

    @Nullable
    private RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> dataBinder;

    @Nullable
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> dataEncoders;

    @Nullable
    private ErrorResultType errorResult;

    @NonNull
    private final Method method;

    @Nullable
    private final String path;

    @Nullable
    private final RequestDataType requestData;

    @Nullable
    private RequestResultType requestResult;

    public static class Base64RequestDataEncoder extends RequestDataEncoder {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] decode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.decode(bArr, 0);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] encode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.encode(bArr, 0);
        }
    }

    public interface Callback<RequestResultType, ErrorResultType> {
        void onFail(@Nullable ErrorResultType errorresulttype);

        void onSuccess(@Nullable RequestResultType requestresulttype);
    }

    public interface CancelCallback {
        void onCanceled();
    }

    public static class GZIPRequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> extends RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            GZIPInputStream gZIPInputStream;
            if (!"gzip".equals(uRLConnection.getContentEncoding())) {
                return bArr;
            }
            GZIPInputStream gZIPInputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayInputStream = null;
                }
            } catch (Throwable th4) {
                byteArrayInputStream = null;
                th = th4;
                byteArrayOutputStream = null;
            }
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        Utils.flush(byteArrayOutputStream);
                        Utils.close(byteArrayOutputStream);
                        Utils.close(byteArrayInputStream);
                        Utils.close(gZIPInputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
            } catch (Throwable th5) {
                th = th5;
                gZIPInputStream2 = gZIPInputStream;
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                Utils.close(byteArrayInputStream);
                Utils.close(gZIPInputStream2);
                throw th;
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            GZIPOutputStream gZIPOutputStream;
            GZIPOutputStream gZIPOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    gZIPOutputStream.write(bArr);
                    Utils.close(gZIPOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Utils.flush(byteArrayOutputStream);
                    Utils.close(byteArrayOutputStream);
                    Utils.flush(null);
                    Utils.close(null);
                    return byteArray;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream2 = gZIPOutputStream;
                    Utils.flush(byteArrayOutputStream);
                    Utils.close(byteArrayOutputStream);
                    Utils.flush(gZIPOutputStream2);
                    Utils.close(gZIPOutputStream2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataEncoder
        protected void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
    }

    public enum Method {
        Get(C4701ic.a),
        Post("POST");

        private final String methodString;

        Method(@NonNull String str) {
            this.methodString = str;
        }

        public void apply(URLConnection uRLConnection) throws ProtocolException {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setRequestMethod(this.methodString);
            }
        }
    }

    public static abstract class RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> {
        protected ErrorResultType createFailResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        protected abstract RequestResultType createSuccessResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        @Nullable
        protected abstract byte[] obtainData(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, @Nullable RequestDataType requestdatatype) throws Exception;

        protected abstract void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection);

        protected void prepareRequest(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    public static abstract class RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        protected abstract byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected abstract byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        protected void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    public static class SimpleJsonArrayDataBinder<ErrorResultType> extends b {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public JSONArray createSuccessResult(NetworkRequest<JSONObject, JSONArray, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONArray(new String(bArr));
        }
    }

    public static class SimpleJsonObjectDataBinder<ErrorResultType> extends b {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        public JSONObject createSuccessResult(NetworkRequest<JSONObject, JSONObject, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONObject(new String(bArr));
        }
    }

    public enum State {
        Idle,
        Running,
        Success,
        Fail,
        Canceled
    }

    static abstract class b extends RequestDataBinder {
        b() {
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        protected /* bridge */ /* synthetic */ byte[] obtainData(NetworkRequest networkRequest, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return obtainData((NetworkRequest<JSONObject, Object, Object>) networkRequest, uRLConnection, (JSONObject) obj);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected void prepareHeaders(NetworkRequest<JSONObject, Object, Object> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        }

        @Nullable
        protected byte[] obtainData(NetworkRequest<JSONObject, Object, Object> networkRequest, URLConnection uRLConnection, @Nullable JSONObject jSONObject) throws Exception {
            if (jSONObject != null) {
                return jSONObject.toString().getBytes("UTF-8");
            }
            return null;
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            NetworkRequest.this.process();
            if (NetworkRequest.this.callback == null || NetworkRequest.this.isCanceled()) {
                return;
            }
            if (NetworkRequest.this.currentState == State.Success) {
                NetworkRequest.this.callback.onSuccess(NetworkRequest.this.requestResult);
            } else {
                NetworkRequest.this.callback.onFail(NetworkRequest.this.errorResult);
            }
        }
    }

    public NetworkRequest(@NonNull Method method, @Nullable String str, @Nullable RequestDataType requestdatatype) {
        this.method = method;
        this.path = str;
        this.requestData = requestdatatype;
    }

    private InputStream obtainErrorStream(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    private int obtainResponseCode(URLConnection uRLConnection) throws IOException {
        if (uRLConnection instanceof HttpURLConnection) {
            return BidMachineNetworkBridge.httpUrlConnectionGetResponseCode((HttpURLConnection) uRLConnection);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
    
        if (r8.errorResult == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void process() {
        URLConnection uRLConnection;
        URL url;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder;
        BufferedOutputStream bufferedOutputStream;
        this.currentState = State.Running;
        try {
            if (this.path != null) {
                url = new URL(getBaseUrl() + "/" + this.path);
            } else {
                url = new URL(getBaseUrl());
            }
            URLConnection openConnection = url.openConnection();
            try {
                this.currentConnection = openConnection;
                this.method.apply(openConnection);
                prepareRequestParams(openConnection);
                byte[] obtainRequestData = obtainRequestData(openConnection);
                if (obtainRequestData != null) {
                    byte[] encodeRequestData = encodeRequestData(openConnection, obtainRequestData);
                    openConnection.setDoOutput(true);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(BidMachineNetworkBridge.urlConnectionGetOutputStream(openConnection));
                        try {
                            bufferedOutputStream.write(encodeRequestData);
                            Utils.flush(bufferedOutputStream);
                            Utils.close(bufferedOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            Utils.flush(bufferedOutputStream);
                            Utils.close(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = null;
                    }
                }
                try {
                    int obtainResponseCode = obtainResponseCode(openConnection);
                    if (isCanceled()) {
                        Utils.flush(null);
                        Utils.close(null);
                        Utils.close(null);
                        if (openConnection instanceof HttpURLConnection) {
                            BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) openConnection);
                        }
                        this.currentConnection = null;
                        if (isCanceled()) {
                            return;
                        }
                        this.currentState = this.errorResult == null ? State.Success : State.Fail;
                        return;
                    }
                    if (obtainResponseCode != 200) {
                        this.errorResult = obtainError(openConnection, obtainResponseCode);
                        inputStream2 = null;
                        byteArrayOutputStream = null;
                    } else {
                        inputStream2 = BidMachineNetworkBridge.urlConnectionGetInputStream(openConnection);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } catch (Throwable th4) {
                            inputStream = inputStream2;
                            th = th4;
                            th = th;
                            inputStream2 = inputStream;
                            byteArrayOutputStream = null;
                            Utils.flush(byteArrayOutputStream);
                            Utils.close(byteArrayOutputStream);
                            Utils.close(inputStream2);
                            throw th;
                        }
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray != null) {
                                byteArray = decodeResponseData(openConnection, byteArray);
                            }
                            if (byteArray != null && byteArray.length > 0 && (requestDataBinder = this.dataBinder) != null) {
                                RequestResultType createSuccessResult = requestDataBinder.createSuccessResult(this, openConnection, byteArray);
                                this.requestResult = createSuccessResult;
                                if (createSuccessResult == null) {
                                    this.errorResult = this.dataBinder.createFailResult(this, openConnection, byteArray);
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            Utils.flush(byteArrayOutputStream);
                            Utils.close(byteArrayOutputStream);
                            Utils.close(inputStream2);
                            throw th;
                        }
                    }
                    Utils.flush(byteArrayOutputStream);
                    Utils.close(byteArrayOutputStream);
                    Utils.close(inputStream2);
                    if (openConnection instanceof HttpURLConnection) {
                        BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) openConnection);
                    }
                    this.currentConnection = null;
                    if (isCanceled()) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                }
            } catch (Throwable th7) {
                uRLConnection = openConnection;
                th = th7;
                try {
                    Logger.w(th);
                    this.errorResult = obtainError(uRLConnection, th);
                } finally {
                    if (uRLConnection instanceof HttpURLConnection) {
                        BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) uRLConnection);
                    }
                    this.currentConnection = null;
                    if (!isCanceled()) {
                        this.currentState = this.errorResult == null ? State.Success : State.Fail;
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
            uRLConnection = null;
        }
    }

    public void addContentEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(requestDataEncoder);
    }

    public void addDataEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(requestDataEncoder);
    }

    public void cancel() {
        this.currentState = State.Canceled;
        CancelCallback cancelCallback = this.cancelCallback;
        if (cancelCallback != null) {
            cancelCallback.onCanceled();
        }
    }

    protected byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().decode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().decode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.dataEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> next = it.next();
                next.prepareHeaders(this, uRLConnection);
                bArr = next.encode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> next2 = it2.next();
                next2.prepareHeaders(this, uRLConnection);
                bArr = next2.encode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected String getBaseUrl() throws Exception {
        return "TODO: implement url";
    }

    @NonNull
    public Method getMethod() {
        return this.method;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        return this.currentState == State.Canceled;
    }

    @NonNull
    protected abstract ErrorResultType obtainError(@Nullable URLConnection uRLConnection, int i);

    @NonNull
    protected abstract ErrorResultType obtainError(@Nullable URLConnection uRLConnection, @Nullable Throwable th);

    protected byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder = this.dataBinder;
        if (requestDataBinder == null) {
            return null;
        }
        requestDataBinder.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    protected void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }

    public void request() {
        request(TASK_MANAGER);
    }

    public void setCallback(@Nullable Callback<RequestResultType, ErrorResultType> callback) {
        this.callback = callback;
    }

    public void setCancelCallback(@Nullable CancelCallback cancelCallback) {
        this.cancelCallback = cancelCallback;
    }

    public void setDataBinder(@Nullable RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder) {
        this.dataBinder = requestDataBinder;
    }

    public void request(@NonNull TaskManager taskManager) {
        try {
            taskManager.execute(new c());
        } catch (Throwable th) {
            Logger.w(th);
            Callback<RequestResultType, ErrorResultType> callback = this.callback;
            if (callback != null) {
                callback.onFail(obtainError((URLConnection) null, th));
            }
        }
    }
}
