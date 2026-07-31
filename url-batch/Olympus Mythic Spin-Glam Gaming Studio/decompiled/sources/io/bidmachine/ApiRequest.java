package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes13.dex */
public class ApiRequest<RequestDataType, ResponseType> extends NetworkRequest<RequestDataType, ResponseType, BMError> {

    @VisibleForTesting
    static int REQUEST_TIMEOUT = 10000;

    @VisibleForTesting
    String requiredUrl;

    @VisibleForTesting
    int timeOut;

    public static class ApiAuctionDataBinder extends ApiResponseAuctionDataBinder {
        @Override // io.bidmachine.ApiRequest.ApiResponseAuctionDataBinder, io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        protected /* bridge */ /* synthetic */ byte[] obtainData(NetworkRequest networkRequest, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return obtainData((NetworkRequest<Request, Response, BMError>) networkRequest, uRLConnection, (Request) obj);
        }

        @Override // io.bidmachine.ApiRequest.ApiResponseAuctionDataBinder
        @Nullable
        protected byte[] obtainData(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection, @Nullable Request request) throws Exception {
            Openrtb.Builder newBuilder = Openrtb.newBuilder();
            newBuilder.setRequest(request);
            newBuilder.setVer("3.0");
            newBuilder.setDomainspec("adcom");
            newBuilder.setDomainver(NastAdapter.ADAPTER_SDK_VERSION_NAME);
            A.b("Auction Request", newBuilder);
            return newBuilder.build().toByteArray();
        }
    }

    public static abstract class ApiDataBinder<RequestDataType, ResponseDataType> extends NetworkRequest.RequestDataBinder<RequestDataType, ResponseDataType, BMError> {
    }

    public static class ApiEventDataBinder extends ApiDataBinder<SDKEvent, Void> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected Void createSuccessResult(NetworkRequest<SDKEvent, Void, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        protected /* bridge */ /* synthetic */ byte[] obtainData(NetworkRequest networkRequest, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return obtainData((NetworkRequest<SDKEvent, Void, BMError>) networkRequest, uRLConnection, (SDKEvent) obj);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected void prepareHeaders(NetworkRequest<SDKEvent, Void, BMError> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected /* bridge */ /* synthetic */ Object createSuccessResult(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((NetworkRequest<SDKEvent, Void, BMError>) networkRequest, uRLConnection, bArr);
        }

        @Nullable
        protected byte[] obtainData(NetworkRequest<SDKEvent, Void, BMError> networkRequest, URLConnection uRLConnection, @Nullable SDKEvent sDKEvent) throws Exception {
            if (sDKEvent != null) {
                return sDKEvent.toByteArray();
            }
            return null;
        }
    }

    public static class ApiInitDataBinder extends ApiDataBinder<InitRequest, InitResponse> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected /* bridge */ /* synthetic */ Object createSuccessResult(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((NetworkRequest<InitRequest, InitResponse, BMError>) networkRequest, uRLConnection, bArr);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        protected /* bridge */ /* synthetic */ byte[] obtainData(NetworkRequest networkRequest, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return obtainData((NetworkRequest<InitRequest, InitResponse, BMError>) networkRequest, uRLConnection, (InitRequest) obj);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected void prepareHeaders(NetworkRequest<InitRequest, InitResponse, BMError> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected InitResponse createSuccessResult(NetworkRequest<InitRequest, InitResponse, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            InitResponse parseFrom = InitResponse.parseFrom(bArr);
            A.b("Init Response", parseFrom);
            return parseFrom;
        }

        @Nullable
        protected byte[] obtainData(NetworkRequest<InitRequest, InitResponse, BMError> networkRequest, URLConnection uRLConnection, @Nullable InitRequest initRequest) throws Exception {
            A.b("Init Request", initRequest);
            if (initRequest != null) {
                return initRequest.toByteArray();
            }
            return null;
        }
    }

    public static class ApiResponseAuctionDataBinder extends ApiDataBinder<Request, Response> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected /* bridge */ /* synthetic */ Object createSuccessResult(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((NetworkRequest<Request, Response, BMError>) networkRequest, uRLConnection, bArr);
        }

        @Nullable
        protected byte[] obtainData(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection, @Nullable Request request) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected void prepareHeaders(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected Response createSuccessResult(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            Openrtb parseFrom = Openrtb.parseFrom(bArr);
            if (parseFrom == null) {
                return null;
            }
            A.b("Auction Response", parseFrom);
            return parseFrom.getResponse();
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        protected /* bridge */ /* synthetic */ byte[] obtainData(NetworkRequest networkRequest, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return obtainData((NetworkRequest<Request, Response, BMError>) networkRequest, uRLConnection, (Request) obj);
        }
    }

    public static class ApiTrackerDataBinder extends ApiDataBinder<Object, String> {
        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected String createSuccessResult(NetworkRequest<Object, String, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        @Nullable
        protected byte[] obtainData(NetworkRequest<Object, String, BMError> networkRequest, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected void prepareHeaders(NetworkRequest<Object, String, BMError> networkRequest, URLConnection uRLConnection) {
            String userAgent = UserAgentManager.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                return;
            }
            uRLConnection.setRequestProperty("User-Agent", userAgent);
        }

        @Override // io.bidmachine.core.NetworkRequest.RequestDataBinder
        protected /* bridge */ /* synthetic */ Object createSuccessResult(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((NetworkRequest<Object, String, BMError>) networkRequest, uRLConnection, bArr);
        }
    }

    public static class Builder<RequestDataType, ResponseDataType> {
        private NetworkRequest.Callback<ResponseDataType, BMError> callback;
        private NetworkRequest.CancelCallback cancelCallback;
        private ApiDataBinder<RequestDataType, ResponseDataType> dataBinder;
        private RequestDataType requestData;
        private String url;
        private int timeOut = ApiRequest.REQUEST_TIMEOUT;
        private NetworkRequest.Method method = NetworkRequest.Method.Post;

        /* JADX WARN: Multi-variable type inference failed */
        public ApiRequest<RequestDataType, ResponseDataType> build() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequest = new ApiRequest<>(this.method, null, this.requestData);
            apiRequest.setCallback(this.callback);
            apiRequest.setCancelCallback(this.cancelCallback);
            apiRequest.setDataBinder(this.dataBinder);
            apiRequest.requiredUrl = this.url;
            apiRequest.timeOut = this.timeOut;
            return apiRequest;
        }

        public String getUrl() {
            return this.url;
        }

        public ApiRequest<RequestDataType, ResponseDataType> request() {
            ApiRequest<RequestDataType, ResponseDataType> build = build();
            build.request();
            return build;
        }

        public Builder<RequestDataType, ResponseDataType> setCallback(NetworkRequest.Callback<ResponseDataType, BMError> callback) {
            this.callback = callback;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setCancelCallback(NetworkRequest.CancelCallback cancelCallback) {
            this.cancelCallback = cancelCallback;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setDataBinder(ApiDataBinder<RequestDataType, ResponseDataType> apiDataBinder) {
            this.dataBinder = apiDataBinder;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setLoadingTimeOut(int i) {
            if (i <= 0) {
                i = ApiRequest.REQUEST_TIMEOUT;
            }
            this.timeOut = i;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setMethod(@NonNull NetworkRequest.Method method) {
            this.method = method;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setRequestData(RequestDataType requestdatatype) {
            this.requestData = requestdatatype;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> url(String str) {
            this.url = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$obtainError$0(Throwable th, URLConnection uRLConnection) {
        return "obtainError: " + th + "(" + uRLConnection + ")";
    }

    @Override // io.bidmachine.core.NetworkRequest
    protected String getBaseUrl() {
        return this.requiredUrl;
    }

    @Override // io.bidmachine.core.NetworkRequest
    protected void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    private ApiRequest(@NonNull NetworkRequest.Method method, @Nullable String str, @Nullable RequestDataType requestdatatype) {
        super(method, str, requestdatatype);
        addContentEncoder(new NetworkRequest.GZIPRequestDataEncoder());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.core.NetworkRequest
    @NonNull
    public BMError obtainError(@Nullable URLConnection uRLConnection, int i) {
        BMError internal2;
        if (i >= 200 && i < 300) {
            return BMError.BMServerNoFill;
        }
        if (i >= 400 && i < 500) {
            internal2 = BMError.Request;
        } else if (i >= 500 && i < 600) {
            internal2 = BMError.Server;
        } else {
            internal2 = BMError.internal("Unknown server error");
        }
        return new BMError(internal2, i, "Server returned " + i + " code");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.core.NetworkRequest
    @NonNull
    public BMError obtainError(@Nullable final URLConnection uRLConnection, @Nullable final Throwable th) {
        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ApiRequest$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$obtainError$0;
                lambda$obtainError$0 = ApiRequest.lambda$obtainError$0(th, uRLConnection);
                return lambda$obtainError$0;
            }
        });
        if (th instanceof UnknownHostException) {
            return BMError.NoConnection;
        }
        if (!(th instanceof SocketTimeoutException) && !(th instanceof ConnectTimeoutException)) {
            return BMError.throwable("Unknown api request error", th);
        }
        return BMError.TimeoutError;
    }
}
