package io.ably.lib.http;

import com.amazon.a.a.o.b.f;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.HttpPaginatedResponse;
import io.ably.lib.types.Param;
import io.ably.lib.util.Serialisation;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes7.dex */
public class HttpPaginatedQuery implements HttpCore.ResponseHandler<HttpPaginatedResponse> {
    static final HttpCore.BodyHandler<JsonElement> jsonArrayResponseHandler = new HttpCore.BodyHandler<JsonElement>() { // from class: io.ably.lib.http.HttpPaginatedQuery.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public JsonElement[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            if (!HttpConstants.ContentTypes.JSON.equals(str)) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Unexpected content type: " + str, 500, 50000));
            }
            JsonElement parse = Serialisation.gsonParser.parse(new String(bArr, Charset.forName("UTF-8")));
            if (!parse.isJsonArray()) {
                return new JsonElement[]{parse};
            }
            JsonArray asJsonArray = parse.getAsJsonArray();
            int size = asJsonArray.size();
            JsonElement[] jsonElementArr = new JsonElement[size];
            for (int i = 0; i < size; i++) {
                jsonElementArr[i] = asJsonArray.get(i);
            }
            return jsonElementArr;
        }
    };
    private final HttpCore.BodyHandler<JsonElement> bodyHandler = jsonArrayResponseHandler;
    private final Http http;
    private final String method;
    private final String path;
    private final HttpCore.RequestBody requestBody;
    private final Param[] requestHeaders;
    private final Param[] requestParams;

    public HttpPaginatedQuery(Http http, String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody) {
        this.http = http;
        this.method = str;
        this.path = str2;
        this.requestHeaders = paramArr;
        this.requestParams = paramArr2;
        this.requestBody = requestBody;
    }

    public HttpPaginatedResponse exec() throws AblyException {
        return exec(this.requestParams);
    }

    public HttpPaginatedResponse exec(final Param[] paramArr) throws AblyException {
        return (HttpPaginatedResponse) this.http.request(new Http.Execute<HttpPaginatedResponse>() { // from class: io.ably.lib.http.HttpPaginatedQuery.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<HttpPaginatedResponse> callback) throws AblyException {
                httpScheduler.exec(HttpPaginatedQuery.this.path, HttpPaginatedQuery.this.method, HttpPaginatedQuery.this.requestHeaders, paramArr, HttpPaginatedQuery.this.requestBody, this, true, callback);
            }
        }).sync();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ably.lib.http.HttpCore.ResponseHandler
    public HttpPaginatedResponse handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
        return new HttpPaginatedResult(response, errorInfo);
    }

    public class HttpPaginatedResult extends HttpPaginatedResponse {
        private JsonElement[] contents;
        private String relCurrent;
        private String relFirst;
        private String relNext;

        private HttpPaginatedResult(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
            this.statusCode = response.statusCode;
            this.headers = HttpUtils.toParamArray(response.headers);
            if (errorInfo != null) {
                this.errorCode = errorInfo.code;
                this.errorMessage = errorInfo.message;
            } else {
                this.success = true;
                if (response.body != null) {
                    this.contents = (JsonElement[]) HttpPaginatedQuery.this.bodyHandler.handleResponseBody(response.contentType, response.body);
                }
            }
            List<String> headerFields = response.getHeaderFields("Link");
            if (headerFields != null) {
                HashMap<String, String> parseLinks = BasePaginatedQuery.parseLinks(headerFields);
                this.relFirst = parseLinks.get("first");
                this.relCurrent = parseLinks.get("current");
                this.relNext = parseLinks.get("next");
            }
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public JsonElement[] items() {
            return this.contents;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public HttpPaginatedResponse first() throws AblyException {
            return execRel(this.relFirst);
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public HttpPaginatedResponse current() throws AblyException {
            return execRel(this.relCurrent);
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public HttpPaginatedResponse next() throws AblyException {
            return execRel(this.relNext);
        }

        private HttpPaginatedResponse execRel(String str) throws AblyException {
            if (str == null) {
                return null;
            }
            Matcher matcher = BasePaginatedQuery.urlPattern.matcher(str);
            if (matcher.matches()) {
                String[] split = matcher.group(2).split("&");
                Param[] paramArr = new Param[split.length];
                for (int i = 0; i < split.length; i++) {
                    try {
                        String[] split2 = split[i].split(f.b);
                        paramArr[i] = new Param(split2[0], URLDecoder.decode(split2.length >= 2 ? split2[1] : "", "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return HttpPaginatedQuery.this.exec(paramArr);
            }
            throw AblyException.fromErrorInfo(new ErrorInfo("Unexpected link URL format", 500, 50000));
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean hasFirst() {
            return this.relFirst != null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean hasCurrent() {
            return this.relCurrent != null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean hasNext() {
            return this.relNext != null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean isLast() {
            return this.relNext == null;
        }
    }
}
