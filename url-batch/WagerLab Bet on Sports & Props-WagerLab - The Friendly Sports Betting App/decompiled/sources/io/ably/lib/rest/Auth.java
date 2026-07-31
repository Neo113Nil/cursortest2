package io.ably.lib.rest;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.revenuecat.purchases.common.Constants;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpHelpers;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.Presence;
import io.ably.lib.rest.Auth;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.BaseMessage;
import io.ably.lib.types.Capability;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.NonRetriableTokenException;
import io.ably.lib.types.Param;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class Auth {
    private static final String TAG = "io.ably.lib.rest.Auth";
    public static final String WILDCARD_CLIENTID = "*";
    private final AblyBase ably;
    private String authHeader;
    private AuthOptions authOptions;
    private String basicCredentials;
    public String clientId;
    private String encodedToken;
    private final AuthMethod method;
    private TokenDetails tokenDetails;
    private TokenParams tokenParams;
    private long timeDelta = Long.MAX_VALUE;
    private long nanoTimeDelta = System.currentTimeMillis() - (System.nanoTime() / 1000000);

    public enum AuthMethod {
        basic,
        token
    }

    public interface AuthUpdateResult {
        void onUpdate(boolean z, ErrorInfo errorInfo);
    }

    public interface RenewAuthResult {
        void onCompletion(boolean z, TokenDetails tokenDetails, ErrorInfo errorInfo);
    }

    public interface TokenCallback {
        Object getTokenRequest(TokenParams tokenParams) throws AblyException;
    }

    public static class AuthOptions {
        public TokenCallback authCallback;
        public Param[] authHeaders;
        public String authMethod;
        public Param[] authParams;
        public String authUrl;
        public String key;
        public boolean queryTime;
        public String token;
        public TokenDetails tokenDetails;
        public boolean useTokenAuth;

        public AuthOptions() {
        }

        public AuthOptions(String str) throws AblyException {
            if (str == null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("key string cannot be null", 40000, 400));
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Key string cannot be empty");
            }
            if (str.indexOf(58) > -1) {
                this.key = str;
            } else {
                this.token = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthOptions storedValues() {
            AuthOptions authOptions = new AuthOptions();
            authOptions.key = this.key;
            authOptions.authUrl = this.authUrl;
            authOptions.authMethod = this.authMethod;
            authOptions.authParams = this.authParams;
            authOptions.authHeaders = this.authHeaders;
            authOptions.token = this.token;
            authOptions.tokenDetails = this.tokenDetails;
            authOptions.authCallback = this.authCallback;
            return authOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthOptions copy() {
            AuthOptions authOptions = new AuthOptions();
            authOptions.key = this.key;
            authOptions.authUrl = this.authUrl;
            authOptions.authMethod = this.authMethod;
            authOptions.authParams = this.authParams;
            authOptions.authHeaders = this.authHeaders;
            authOptions.token = this.token;
            authOptions.tokenDetails = this.tokenDetails;
            authOptions.authCallback = this.authCallback;
            authOptions.queryTime = this.queryTime;
            return authOptions;
        }
    }

    public static class TokenDetails {
        public String capability;
        public String clientId;
        public long expires;
        public long issued;
        public String token;

        public TokenDetails() {
        }

        public TokenDetails(String str) {
            this.token = str;
        }

        @Deprecated
        public static TokenDetails fromJSON(JsonObject jsonObject) {
            return (TokenDetails) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenDetails.class);
        }

        public static TokenDetails fromJson(String str) {
            return (TokenDetails) Serialisation.gson.fromJson(str, TokenDetails.class);
        }

        public static TokenDetails fromJsonElement(JsonObject jsonObject) {
            return (TokenDetails) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenDetails.class);
        }

        public JsonObject asJsonElement() {
            return (JsonObject) Serialisation.gson.toJsonTree(this);
        }

        public String asJson() {
            return asJsonElement().toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TokenDetails)) {
                return false;
            }
            TokenDetails tokenDetails = (TokenDetails) obj;
            return Auth.equalNullableStrings(this.token, tokenDetails.token) & Auth.equalNullableStrings(this.capability, tokenDetails.capability) & Auth.equalNullableStrings(this.clientId, tokenDetails.clientId) & (this.issued == tokenDetails.issued) & (this.expires == tokenDetails.expires);
        }

        public int hashCode() {
            return Objects.hash(this.token, this.capability, this.clientId, Long.valueOf(this.issued), Long.valueOf(this.expires));
        }
    }

    public static class TokenParams {
        public String capability;
        public String clientId;
        public long timestamp;
        public long ttl;

        public Map<String, Param> asMap() {
            HashMap hashMap = new HashMap();
            if (this.ttl > 0) {
                hashMap.put("ttl", new Param("ttl", String.valueOf(this.ttl)));
            }
            if (this.capability != null) {
                hashMap.put("capability", new Param("capability", this.capability));
            }
            if (this.clientId != null) {
                hashMap.put(Presence.GET_CLIENTID, new Param(Presence.GET_CLIENTID, this.clientId));
            }
            if (this.timestamp > 0) {
                hashMap.put("timestamp", new Param("timestamp", String.valueOf(this.timestamp)));
            }
            return hashMap;
        }

        public boolean equals(Object obj) {
            TokenParams tokenParams = (TokenParams) obj;
            return (this.ttl == tokenParams.ttl) & Auth.equalNullableStrings(this.capability, tokenParams.capability) & Auth.equalNullableStrings(this.clientId, tokenParams.clientId) & (this.timestamp == tokenParams.timestamp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TokenParams storedValues() {
            TokenParams tokenParams = new TokenParams();
            tokenParams.ttl = this.ttl;
            tokenParams.capability = this.capability;
            tokenParams.clientId = this.clientId;
            return tokenParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TokenParams copy() {
            TokenParams tokenParams = new TokenParams();
            tokenParams.ttl = this.ttl;
            tokenParams.capability = this.capability;
            tokenParams.clientId = this.clientId;
            tokenParams.timestamp = this.timestamp;
            return tokenParams;
        }
    }

    public static class TokenRequest extends TokenParams {
        public String keyName;
        public String mac;
        public String nonce;

        public TokenRequest() {
        }

        public TokenRequest(TokenParams tokenParams) {
            this.ttl = tokenParams.ttl;
            this.capability = tokenParams.capability;
            this.clientId = tokenParams.clientId;
            this.timestamp = tokenParams.timestamp;
        }

        @Deprecated
        public static TokenRequest fromJSON(JsonObject jsonObject) {
            return (TokenRequest) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenRequest.class);
        }

        public static TokenRequest fromJsonElement(JsonObject jsonObject) {
            return (TokenRequest) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenRequest.class);
        }

        public static TokenRequest fromJson(String str) {
            return (TokenRequest) Serialisation.gson.fromJson(str, TokenRequest.class);
        }

        public JsonObject asJsonElement() {
            JsonObject jsonObject = (JsonObject) Serialisation.gson.toJsonTree(this);
            if (this.ttl == 0) {
                jsonObject.remove("ttl");
            }
            if (this.capability != null && this.capability.isEmpty()) {
                jsonObject.remove("capability");
            }
            return jsonObject;
        }

        public String asJson() {
            return asJsonElement().toString();
        }

        @Override // io.ably.lib.rest.Auth.TokenParams
        public boolean equals(Object obj) {
            TokenRequest tokenRequest = (TokenRequest) obj;
            return super.equals(obj) & Auth.equalNullableStrings(this.keyName, tokenRequest.keyName) & Auth.equalNullableStrings(this.nonce, tokenRequest.nonce) & Auth.equalNullableStrings(this.mac, tokenRequest.mac);
        }
    }

    public TokenDetails authorize(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        AuthOptions copy;
        TokenParams copy2;
        TokenDetails assertValidToken;
        if (authOptions != null) {
            this.authOptions = authOptions.storedValues();
        }
        if (tokenParams != null) {
            this.tokenParams = tokenParams.storedValues();
        }
        if (authOptions != null) {
            copy = authOptions.copy();
        } else {
            copy = this.authOptions;
        }
        if (tokenParams != null) {
            copy2 = tokenParams.copy();
        } else {
            copy2 = this.tokenParams;
        }
        if (this.authOptions.token != null) {
            this.authOptions.tokenDetails = new TokenDetails(this.authOptions.token);
        }
        if (this.authOptions.tokenDetails != null) {
            assertValidToken = this.authOptions.tokenDetails;
            setTokenDetails(assertValidToken);
        } else {
            try {
                assertValidToken = assertValidToken(copy2, copy, true);
            } catch (AblyException e) {
                this.ably.onAuthError(e.errorInfo);
                throw e;
            }
        }
        this.ably.onAuthUpdated(assertValidToken.token, true);
        return assertValidToken;
    }

    @Deprecated
    public TokenDetails authorise(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        Log.w(TAG, "authorise() is deprecated and will be removed in 1.0. Please use authorize() instead");
        return authorize(tokenParams, authOptions);
    }

    public TokenDetails requestToken(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        AuthOptions copy;
        TokenParams copy2;
        TokenRequest createTokenRequest;
        Object uri;
        if (authOptions != null) {
            copy = authOptions.copy();
        } else {
            copy = this.authOptions;
        }
        if (tokenParams != null) {
            copy2 = tokenParams.copy();
        } else {
            copy2 = this.tokenParams;
        }
        if (copy2.clientId == null) {
            copy2.clientId = this.ably.options.clientId;
        }
        copy2.capability = Capability.c14n(copy2.capability);
        int i = 0;
        if (copy.authCallback != null) {
            Log.i("Auth.requestToken()", "using token auth with auth_callback");
            try {
                Object tokenRequest = copy.authCallback.getTokenRequest(copy2);
                if (tokenRequest instanceof String) {
                    return new TokenDetails((String) tokenRequest);
                }
                if (tokenRequest instanceof TokenDetails) {
                    return (TokenDetails) tokenRequest;
                }
                if (tokenRequest instanceof TokenRequest) {
                    createTokenRequest = (TokenRequest) tokenRequest;
                } else {
                    throw AblyException.fromErrorInfo(new ErrorInfo("Invalid authCallback response", 400, 40000));
                }
            } catch (Exception e) {
                boolean z = e instanceof NonRetriableTokenException;
                if ((e instanceof AblyException) && ((AblyException) e).errorInfo.statusCode == 403) {
                    i = 1;
                }
                throw AblyException.fromErrorInfo(e, new ErrorInfo("authCallback failed with an exception", (z || i != 0) ? 403 : 401, 80019));
            }
        } else if (copy.authUrl != null) {
            Log.i("Auth.requestToken()", "using token auth with auth_url");
            try {
                HttpCore.ResponseHandler<Object> responseHandler = new HttpCore.ResponseHandler<Object>() { // from class: io.ably.lib.rest.Auth.1
                    @Override // io.ably.lib.http.HttpCore.ResponseHandler
                    public Object handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                        if (errorInfo != null) {
                            throw AblyException.fromErrorInfo(errorInfo);
                        }
                        try {
                            String str = response.contentType;
                            byte[] bArr = response.body;
                            if (bArr != null && bArr.length != 0) {
                                if (str != null) {
                                    if (!str.startsWith("text/plain") && !str.startsWith("application/jwt")) {
                                        if (!str.startsWith(HttpConstants.ContentTypes.JSON)) {
                                            throw AblyException.fromErrorInfo(new ErrorInfo("Unacceptable content type from auth callback", 406, 40170));
                                        }
                                    }
                                    return new TokenDetails(new String(bArr));
                                }
                                JsonElement parse = Serialisation.gsonParser.parse(new String(bArr));
                                if (!(parse instanceof JsonObject)) {
                                    throw AblyException.fromErrorInfo(new ErrorInfo("Unexpected response type from auth callback", 406, 40170));
                                }
                                JsonObject jsonObject = (JsonObject) parse;
                                if (jsonObject.has("issued")) {
                                    return TokenDetails.fromJsonElement(jsonObject);
                                }
                                return TokenRequest.fromJsonElement(jsonObject);
                            }
                            return null;
                        } catch (JsonParseException unused) {
                            throw AblyException.fromErrorInfo(new ErrorInfo("Unable to parse response from auth callback", 406, 40170));
                        }
                    }
                };
                URL parseUrl = HttpUtils.parseUrl(this.authOptions.authUrl);
                String urlWithQueryStringRemoved = HttpUtils.urlWithQueryStringRemoved(this.authOptions.authUrl);
                String query = parseUrl.getQuery();
                Map<String, Param> decodeParams = (query == null || query.isEmpty()) ? null : HttpUtils.decodeParams(query);
                Map<String, Param> asMap = copy2.asMap();
                if (copy.authParams != null) {
                    Param[] paramArr = copy.authParams;
                    int length = paramArr.length;
                    while (i < length) {
                        Param param = paramArr[i];
                        if (!asMap.containsKey(param.key)) {
                            asMap.put(param.key, param);
                        }
                        i++;
                    }
                }
                if ("POST".equals(copy.authMethod)) {
                    uri = HttpHelpers.postUri(this.ably.httpCore, urlWithQueryStringRemoved, copy.authHeaders, HttpUtils.flattenParams(decodeParams), HttpUtils.flattenParams(asMap), responseHandler);
                } else {
                    if (decodeParams != null) {
                        asMap = HttpUtils.mergeParams(decodeParams, asMap);
                    }
                    uri = HttpHelpers.getUri(this.ably.httpCore, urlWithQueryStringRemoved, copy.authHeaders, HttpUtils.flattenParams(asMap), responseHandler);
                }
                if (uri == null) {
                    throw AblyException.fromErrorInfo(null, new ErrorInfo("Empty response received from authUrl", 401, 80019));
                }
                if (uri instanceof TokenDetails) {
                    return (TokenDetails) uri;
                }
                createTokenRequest = (TokenRequest) uri;
            } catch (AblyException e2) {
                throw AblyException.fromErrorInfo(e2, new ErrorInfo("authUrl failed with an exception", e2.errorInfo.statusCode, 80019));
            }
        } else if (copy.key != null) {
            Log.i("Auth.requestToken()", "using token auth with client-side signing");
            createTokenRequest = createTokenRequest(copy2, copy);
        } else {
            throw AblyException.fromErrorInfo(new ErrorInfo("Auth.requestToken(): options must include valid authentication parameters", 400, 40106));
        }
        return (TokenDetails) HttpHelpers.postSync(this.ably.http, "/keys/" + createTokenRequest.keyName + "/requestToken", null, null, new HttpUtils.JsonRequestBody(createTokenRequest.asJsonElement().toString()), new HttpCore.ResponseHandler<TokenDetails>() { // from class: io.ably.lib.rest.Auth.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ably.lib.http.HttpCore.ResponseHandler
            public TokenDetails handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                if (errorInfo != null) {
                    throw AblyException.fromErrorInfo(errorInfo);
                }
                try {
                    return TokenDetails.fromJsonElement((JsonObject) Serialisation.gsonParser.parse(new String(response.body)));
                } catch (JsonParseException e3) {
                    throw AblyException.fromThrowable(e3);
                }
            }
        }, false);
    }

    public TokenRequest createTokenRequest(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        AuthOptions copy;
        TokenParams copy2;
        if (authOptions != null) {
            copy = authOptions.copy();
        } else {
            copy = this.authOptions;
        }
        if (tokenParams != null) {
            copy2 = tokenParams.copy();
        } else {
            copy2 = this.tokenParams;
        }
        copy2.capability = Capability.c14n(copy2.capability);
        TokenRequest tokenRequest = new TokenRequest(copy2);
        String str = copy.key;
        if (str == null) {
            throw AblyException.fromErrorInfo(new ErrorInfo("No key specified", 401, 40101));
        }
        String[] split = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        if (split.length != 2) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Invalid key specified", 401, 40101));
        }
        String str2 = split[0];
        String str3 = split[1];
        if (tokenRequest.keyName == null) {
            tokenRequest.keyName = str2;
        } else if (!tokenRequest.keyName.equals(str2)) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Incompatible keys specified", 401, 40102));
        }
        String valueOf = tokenRequest.ttl == 0 ? "" : String.valueOf(tokenRequest.ttl);
        String str4 = tokenRequest.capability == null ? "" : tokenRequest.capability;
        if (tokenRequest.clientId == null) {
            tokenRequest.clientId = this.ably.options.clientId;
        }
        String str5 = tokenRequest.clientId != null ? tokenRequest.clientId : "";
        if (tokenRequest.timestamp == 0) {
            if (copy.queryTime) {
                long j = this.nanoTimeDelta;
                long currentTimeMillis = System.currentTimeMillis() - (System.nanoTime() / 1000000);
                if (this.timeDelta != Long.MAX_VALUE && Math.abs(j - currentTimeMillis) > 500) {
                    this.timeDelta = Long.MAX_VALUE;
                }
                if (this.timeDelta != Long.MAX_VALUE) {
                    tokenRequest.timestamp = timestamp() + this.timeDelta;
                    this.nanoTimeDelta = currentTimeMillis;
                } else {
                    tokenRequest.timestamp = this.ably.time();
                    this.timeDelta = tokenRequest.timestamp - timestamp();
                }
            } else {
                tokenRequest.timestamp = timestamp();
            }
        }
        tokenRequest.nonce = random();
        tokenRequest.mac = hmac(tokenRequest.keyName + '\n' + valueOf + '\n' + str4 + '\n' + str5 + '\n' + tokenRequest.timestamp + '\n' + tokenRequest.nonce + '\n', str3);
        Log.i("Auth.getTokenRequest()", "generated signed request");
        return tokenRequest;
    }

    public AuthMethod getAuthMethod() {
        return this.method;
    }

    public String getBasicCredentials() {
        if (this.method == AuthMethod.basic) {
            return this.basicCredentials;
        }
        return null;
    }

    /* renamed from: io.ably.lib.rest.Auth$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$rest$Auth$AuthMethod;

        static {
            int[] iArr = new int[AuthMethod.values().length];
            $SwitchMap$io$ably$lib$rest$Auth$AuthMethod = iArr;
            try {
                iArr[AuthMethod.basic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$rest$Auth$AuthMethod[AuthMethod.token.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Param[] getAuthParams() throws AblyException {
        int i = AnonymousClass3.$SwitchMap$io$ably$lib$rest$Auth$AuthMethod[this.method.ordinal()];
        if (i == 1) {
            return new Param[]{new Param("key", this.authOptions.key)};
        }
        if (i != 2) {
            return null;
        }
        assertValidToken();
        return new Param[]{new Param(SDKConstants.PARAM_ACCESS_TOKEN, getTokenDetails().token)};
    }

    public AuthOptions getAuthOptions() {
        return this.authOptions.copy();
    }

    @Deprecated
    public TokenDetails renew() throws AblyException {
        TokenDetails assertValidToken = assertValidToken(this.tokenParams, this.authOptions, true);
        this.ably.onAuthUpdated(assertValidToken.token, false);
        return assertValidToken;
    }

    public void renewAuth(final RenewAuthResult renewAuthResult) throws AblyException {
        final TokenDetails assertValidToken = assertValidToken(this.tokenParams, this.authOptions, true);
        this.ably.onAuthUpdatedAsync(assertValidToken.token, new AuthUpdateResult() { // from class: io.ably.lib.rest.Auth$$ExternalSyntheticLambda0
            @Override // io.ably.lib.rest.Auth.AuthUpdateResult
            public final void onUpdate(boolean z, ErrorInfo errorInfo) {
                Auth.RenewAuthResult.this.onCompletion(z, assertValidToken, errorInfo);
            }
        });
    }

    public void onAuthError(ErrorInfo errorInfo) {
        if (errorInfo.code < 40140 || errorInfo.code >= 40150) {
            return;
        }
        clearTokenDetails();
    }

    public static long timestamp() {
        return System.currentTimeMillis();
    }

    Auth(AblyBase ablyBase, ClientOptions clientOptions) throws AblyException {
        this.ably = ablyBase;
        this.authOptions = clientOptions;
        this.tokenParams = clientOptions.defaultTokenParams != null ? clientOptions.defaultTokenParams : new TokenParams();
        if (clientOptions.clientId != null) {
            if (clientOptions.clientId.equals("*")) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Disallowed wildcard clientId in ClientOptions", 400, 40000));
            }
            setClientId(clientOptions.clientId);
            this.tokenParams.clientId = clientOptions.clientId;
        }
        if (this.authOptions.key != null && !clientOptions.useTokenAuth && clientOptions.token == null && clientOptions.tokenDetails == null && clientOptions.authCallback == null && clientOptions.authUrl == null) {
            Log.i("Auth()", "anonymous, using basic auth");
            this.method = AuthMethod.basic;
            this.basicCredentials = this.authOptions.key;
            setClientId("*");
            return;
        }
        this.method = AuthMethod.token;
        if (this.authOptions.token != null) {
            setTokenDetails(this.authOptions.token);
        } else if (this.authOptions.tokenDetails != null) {
            setTokenDetails(this.authOptions.tokenDetails);
        }
        if (this.authOptions.authCallback != null) {
            Log.i("Auth()", "using token auth with authCallback");
            return;
        }
        if (this.authOptions.authUrl != null) {
            HttpUtils.parseUrl(this.authOptions.authUrl);
            Log.i("Auth()", "using token auth with authUrl");
        } else if (this.authOptions.key != null) {
            Log.i("Auth()", "using token auth with client-side signing");
        } else if (this.tokenDetails != null) {
            Log.i("Auth()", "using token auth with supplied token only");
        } else {
            Log.e("Auth()", "no authentication parameters supplied");
            throw AblyException.fromErrorInfo(new ErrorInfo("No authentication parameters supplied", 400, 40000));
        }
    }

    public TokenDetails getTokenDetails() {
        Log.i("TokenAuth.getTokenDetails()", "");
        return this.tokenDetails;
    }

    public String getEncodedToken() {
        Log.i("TokenAuth.getEncodedToken()", "");
        return this.encodedToken;
    }

    private void setTokenDetails(String str) throws AblyException {
        Log.i("TokenAuth.setTokenDetails()", "");
        this.tokenDetails = new TokenDetails(str);
        this.encodedToken = Base64Coder.encodeString(str);
    }

    private void setTokenDetails(TokenDetails tokenDetails) throws AblyException {
        Log.i("TokenAuth.setTokenDetails()", "");
        setClientId(tokenDetails.clientId);
        this.tokenDetails = tokenDetails;
        this.encodedToken = Base64Coder.encodeString(tokenDetails.token);
    }

    private void clearTokenDetails() {
        Log.i("TokenAuth.clearTokenDetails()", "");
        this.tokenDetails = null;
        this.encodedToken = null;
        this.authHeader = null;
    }

    public TokenDetails assertValidToken() throws AblyException {
        return assertValidToken(this.tokenParams, this.authOptions, false);
    }

    private TokenDetails assertValidToken(TokenParams tokenParams, AuthOptions authOptions, boolean z) throws AblyException {
        Log.i("Auth.assertValidToken()", "");
        TokenDetails tokenDetails = this.tokenDetails;
        if (tokenDetails != null) {
            if (!z && (tokenDetails.expires == 0 || tokenValid(this.tokenDetails))) {
                Log.i("Auth.assertValidToken()", "using cached token; expires = " + this.tokenDetails.expires);
                return this.tokenDetails;
            }
            Log.i("Auth.assertValidToken()", "deleting expired token");
            clearTokenDetails();
        }
        Log.i("Auth.assertValidToken()", "requesting new token");
        try {
            setTokenDetails(requestToken(tokenParams, authOptions));
            return this.tokenDetails;
        } catch (AblyException e) {
            if (shouldFailConnectionDueToAuthError(e.errorInfo)) {
                this.ably.onAuthError(e.errorInfo);
            }
            throw e;
        }
    }

    private boolean shouldFailConnectionDueToAuthError(ErrorInfo errorInfo) {
        return errorInfo.statusCode == 403 && errorInfo.code == 80019;
    }

    private boolean tokenValid(TokenDetails tokenDetails) {
        return this.timeDelta == Long.MAX_VALUE || tokenDetails.expires > serverTimestamp();
    }

    public void assertAuthorizationHeader(boolean z) throws AblyException {
        if (this.authHeader == null || z) {
            if (getAuthMethod() == AuthMethod.basic) {
                this.authHeader = "Basic " + Base64Coder.encodeString(getBasicCredentials());
                return;
            }
            if (z) {
                renew();
            } else {
                assertValidToken();
            }
            this.authHeader = "Bearer " + getEncodedToken();
        }
    }

    public String getAuthorizationHeader() {
        return this.authHeader;
    }

    private static String random() {
        return String.format(Locale.ROOT, "%016d", Long.valueOf((long) (Math.random() * 1.0E16d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalNullableStrings(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private static String hmac(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA256"));
            return new String(Base64Coder.encode(mac.doFinal(str.getBytes(Charset.forName("UTF-8")))));
        } catch (GeneralSecurityException e) {
            Log.e("Auth.hmac", "Unexpected exception", e);
            return null;
        }
    }

    public void setClientId(String str) throws AblyException {
        if (str == null) {
            return;
        }
        String str2 = this.clientId;
        if (str2 == null) {
            this.clientId = str;
            this.ably.onClientIdSet(str);
        } else if (!str2.equals(str) && !"*".equals(str)) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Unable to set different clientId from that given in options", 401, 40101));
        }
    }

    public String checkClientId(BaseMessage baseMessage, boolean z, boolean z2) throws AblyException {
        String str = baseMessage.clientId;
        if ("*".equals(str)) {
            throw AblyException.fromErrorInfo(new ErrorInfo("Invalid wildcard clientId specified in message", 400, 40000));
        }
        String str2 = this.clientId;
        boolean z3 = str2 == null && !z2;
        if (str != null) {
            if (str.equals(str2) || "*".equals(this.clientId) || z3) {
                return str;
            }
            throw AblyException.fromErrorInfo(new ErrorInfo("Incompatible clientId specified in message", 400, 40012));
        }
        if (str2 != null && !str2.equals("*")) {
            return this.clientId;
        }
        if (z || z3) {
            return null;
        }
        throw AblyException.fromErrorInfo(new ErrorInfo("Invalid attempt to enter with no clientId", 400, 91000));
    }

    public long serverTimestamp() {
        long timestamp = timestamp();
        long j = this.timeDelta;
        return j != Long.MAX_VALUE ? timestamp + j : timestamp;
    }

    public void clearCachedServerTime() {
        this.timeDelta = Long.MAX_VALUE;
    }
}
