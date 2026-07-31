package com.revenuecat.purchases.common;

import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.revenuecat.purchases.ForceServerErrorStrategy;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ConnectionErrorReason;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import io.ably.lib.http.HttpConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HTTPClient.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 _2\u00020\u0001:\u0001_Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\n .*\u0004\u0018\u00010-0-2\u0006\u0010/\u001a\u000200H\u0002JT\u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001a2\b\u00107\u001a\u0004\u0018\u00010-2\u0006\u00108\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u00010-H\u0002J\u0012\u0010:\u001a\u0004\u0018\u00010 2\u0006\u0010/\u001a\u00020'H\u0002J\u0010\u0010;\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002J\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010/\u001a\u000200H\u0002J\u0012\u0010>\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u000200H\u0002J\b\u0010?\u001a\u00020-H\u0002Jr\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020E2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001022\u001a\u0010G\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0I\u0018\u00010H2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-022\u0006\u00106\u001a\u00020\u001aH\u0002J\u0082\u0001\u0010K\u001a\u00020A2\u0006\u0010B\u001a\u0002052\u0006\u0010D\u001a\u00020E2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001022\u001a\u0010G\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0I\u0018\u00010H2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-022\b\b\u0002\u00106\u001a\u00020\u001a2\u000e\b\u0002\u0010L\u001a\b\u0012\u0004\u0012\u0002050H2\b\b\u0002\u0010M\u001a\u00020NJ\u0010\u0010O\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020)H\u0002JD\u0010R\u001a\u00020%2\u0006\u0010B\u001a\u0002052\u0006\u0010D\u001a\u00020E2\u0006\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020\u001a2\b\u0010U\u001a\u0004\u0018\u00010A2\u0006\u0010V\u001a\u00020\u001a2\b\u0010W\u001a\u0004\u0018\u00010XH\u0002J6\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020-2\u0006\u0010/\u001a\u0002002\b\u0010\\\u001a\u0004\u0018\u00010-2\b\u00107\u001a\u0004\u0018\u00010-2\b\u00109\u001a\u0004\u0018\u00010-H\u0002J\u0018\u0010]\u001a\u00020%2\u0006\u0010^\u001a\u00020!2\u0006\u0010F\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient;", "", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "eTagManager", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "signingManager", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "storefrontProvider", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "mapConverter", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "localeProvider", "Lcom/revenuecat/purchases/common/LocaleProvider;", "forceServerErrorStrategy", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "requestResponseListener", "Lcom/revenuecat/purchases/common/RequestResponseListener;", "timeoutManager", "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;Lcom/revenuecat/purchases/ForceServerErrorStrategy;Lcom/revenuecat/purchases/common/RequestResponseListener;Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;)V", "enableExtraRequestLogging", "", "getSigningManager", "()Lcom/revenuecat/purchases/common/verification/SigningManager;", "buffer", "Ljava/io/BufferedReader;", "inputStream", "Ljava/io/InputStream;", "Ljava/io/BufferedWriter;", "outputStream", "Ljava/io/OutputStream;", "clearCaches", "", "getConnection", "Ljava/net/HttpURLConnection;", "request", "Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "timeoutMs", "", "getETagHeader", "", "kotlin.jvm.PlatformType", "connection", "Ljava/net/URLConnection;", "getHeaders", "", "authenticationHeaders", "fullURL", "Ljava/net/URL;", "refreshETag", "nonce", "shouldSignResponse", "postFieldsToSignHeader", "getInputStream", "getLoadShedderHeader", "getRequestDateHeader", "Ljava/util/Date;", "getRequestTimeHeader", "getXPlatformHeader", "performCall", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "baseURL", "isFallbackURL", "endpoint", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "body", "postFieldsToSign", "", "Lkotlin/Pair;", "requestHeaders", "performRequest", "fallbackBaseURLs", "fallbackURLIndex", "", "readFully", "toCurlRequest", "httpRequest", "trackHttpRequestPerformedIfNeeded", "requestStartTime", "callSuccessful", "callResult", "isRetry", "connectionException", "Ljava/io/IOException;", "verifyResponse", "Lcom/revenuecat/purchases/VerificationResult;", "urlPath", "payload", "writeFully", "writer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HTTPClient {
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final boolean enableExtraRequestLogging;
    private final ForceServerErrorStrategy forceServerErrorStrategy;
    private final LocaleProvider localeProvider;
    private final MapConverter mapConverter;
    private final RequestResponseListener requestResponseListener;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;
    private final HTTPTimeoutManager timeoutManager;

    /* compiled from: HTTPClient.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, ForceServerErrorStrategy forceServerErrorStrategy, RequestResponseListener requestResponseListener, HTTPTimeoutManager timeoutManager) {
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(eTagManager, "eTagManager");
        Intrinsics.checkNotNullParameter(signingManager, "signingManager");
        Intrinsics.checkNotNullParameter(storefrontProvider, "storefrontProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(mapConverter, "mapConverter");
        Intrinsics.checkNotNullParameter(localeProvider, "localeProvider");
        Intrinsics.checkNotNullParameter(timeoutManager, "timeoutManager");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
        this.localeProvider = localeProvider;
        this.forceServerErrorStrategy = forceServerErrorStrategy;
        this.requestResponseListener = requestResponseListener;
        this.timeoutManager = timeoutManager;
        this.enableExtraRequestLogging = false;
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, ForceServerErrorStrategy forceServerErrorStrategy, RequestResponseListener requestResponseListener, HTTPTimeoutManager hTTPTimeoutManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, r8, (i & 64) != 0 ? new MapConverter() : mapConverter, localeProvider, (i & 256) != 0 ? null : forceServerErrorStrategy, (i & 512) != 0 ? null : requestResponseListener, (i & 1024) != 0 ? new HTTPTimeoutManager(appConfig, r8) : hTTPTimeoutManager);
        DateProvider defaultDateProvider = (i & 32) != 0 ? new DefaultDateProvider() : dateProvider;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    private final String readFully(InputStream inputStream) throws IOException {
        return TextStreamsKt.readText(buffer(inputStream));
    }

    private final InputStream getInputStream(HttpURLConnection connection) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        try {
            return connection.getInputStream();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException ? true : e instanceof IOException)) {
                throw e;
            }
            final LogIntent logIntent = LogIntent.WARNING;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.HTTPClient$getInputStream$$inlined$log$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e.getMessage()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
            }
            try {
                return connection.getErrorStream();
            } catch (NullPointerException e2) {
                throw new NullPointerReadingErrorStreamException(e2.getMessage(), e2);
            }
        }
    }

    private final void writeFully(BufferedWriter writer, String body) throws IOException {
        writer.write(body);
        writer.flush();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z, List list2, int i, int i2, Object obj) throws JSONException, IOException {
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i2 & 128) != 0) {
            i = 0;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z, list2, i);
    }

    private static final boolean performRequest$canUseFallback(Endpoint endpoint, int i, List<URL> list) {
        return endpoint.getSupportsFallbackBaseURLs() && i >= 0 && i < list.size();
    }

    private static final HTTPResult performRequest$performRequestToFallbackURL(List<URL> list, int i, HTTPClient hTTPClient, final Endpoint endpoint, Map<String, ? extends Object> map, List<Pair<String, String>> list2, Map<String, String> map2, boolean z) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        final URL url = list.get(i);
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(NetworkStrings.RETRYING_CALL_WITH_FALLBACK_URL, Arrays.copyOf(new Object[]{endpoint.getPath(true), url}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        return hTTPClient.performRequest(url, endpoint, map, list2, map2, z, list, i + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HTTPResult performRequest(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> body, List<Pair<String, String>> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag, List<URL> fallbackBaseURLs, int fallbackURLIndex) throws JSONException, IOException {
        IOException iOException;
        boolean z;
        Date date;
        HTTPResult hTTPResult;
        Endpoint endpoint2;
        IOException iOException2;
        boolean z2;
        HTTPResult hTTPResult2;
        IOException iOException3;
        boolean z3;
        HTTPResult hTTPResult3;
        Date date2;
        Endpoint endpoint3;
        URL url;
        HTTPResult hTTPResult4;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        IOException iOException4;
        HTTPResult performRequest$performRequestToFallbackURL;
        HTTPClient hTTPClient = this;
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(fallbackBaseURLs, "fallbackBaseURLs");
        boolean z4 = fallbackURLIndex == 0;
        Date now = hTTPClient.dateProvider.getNow();
        HTTPTimeoutManager.RequestResult requestResult = HTTPTimeoutManager.RequestResult.OTHER_RESULT;
        try {
            HTTPResult performCall = hTTPClient.performCall(baseURL, fallbackURLIndex > 0, endpoint, body, postFieldsToSign, requestHeaders, refreshETag);
            z = true;
            if (z4 && performCall != null) {
                try {
                    if (RCHTTPStatusCodes.INSTANCE.isSuccessful(performCall.getResponseCode())) {
                        requestResult = HTTPTimeoutManager.RequestResult.SUCCESS_ON_MAIN_BACKEND;
                    }
                } catch (IOException e) {
                    iOException2 = e;
                    hTTPResult2 = performCall;
                    z2 = true;
                    endpoint2 = endpoint;
                    try {
                        try {
                            if ((iOException2 instanceof SocketTimeoutException) && z4) {
                                try {
                                    if (performRequest$canUseFallback(endpoint2, fallbackURLIndex, fallbackBaseURLs)) {
                                        requestResult = HTTPTimeoutManager.RequestResult.TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT;
                                        iOException4 = iOException2;
                                        try {
                                            performRequest$performRequestToFallbackURL = performRequest$performRequestToFallbackURL(fallbackBaseURLs, fallbackURLIndex, this, endpoint2, body, postFieldsToSign, requestHeaders, refreshETag);
                                            hTTPClient = this;
                                            hTTPResult3 = performRequest$performRequestToFallbackURL;
                                            hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                            url = baseURL;
                                            endpoint3 = endpoint;
                                            z3 = refreshETag;
                                            iOException3 = iOException4;
                                            date2 = now;
                                            z = z2;
                                            hTTPClient.trackHttpRequestPerformedIfNeeded(url, endpoint3, date2, z, hTTPResult3, z3, iOException3);
                                            hTTPResult4 = hTTPResult3;
                                            if (hTTPResult4 != null) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            hTTPClient = this;
                                            iOException = iOException4;
                                            hTTPResult = hTTPResult2;
                                            date = now;
                                            z = z2;
                                            hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                            hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, date, z, hTTPResult, refreshETag, iOException);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    iOException4 = iOException2;
                                }
                            }
                            if (!performRequest$canUseFallback(endpoint2, fallbackURLIndex, fallbackBaseURLs)) {
                                hTTPClient = this;
                                iOException = iOException4;
                                date = now;
                                z = z2;
                                try {
                                    throw iOException;
                                } catch (Throwable th3) {
                                    th = th3;
                                    hTTPResult = hTTPResult2;
                                    hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                    hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, date, z, hTTPResult, refreshETag, iOException);
                                    throw th;
                                }
                            }
                            try {
                                performRequest$performRequestToFallbackURL = performRequest$performRequestToFallbackURL(fallbackBaseURLs, fallbackURLIndex, this, endpoint2, body, postFieldsToSign, requestHeaders, refreshETag);
                                hTTPClient = this;
                                hTTPResult3 = performRequest$performRequestToFallbackURL;
                                hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                url = baseURL;
                                endpoint3 = endpoint;
                                z3 = refreshETag;
                                iOException3 = iOException4;
                                date2 = now;
                                z = z2;
                                hTTPClient.trackHttpRequestPerformedIfNeeded(url, endpoint3, date2, z, hTTPResult3, z3, iOException3);
                                hTTPResult4 = hTTPResult3;
                                if (hTTPResult4 != null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hTTPClient = this;
                                iOException = iOException4;
                                date = now;
                                z = z2;
                                hTTPResult = hTTPResult2;
                                hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, date, z, hTTPResult, refreshETag, iOException);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            hTTPClient = this;
                        }
                        iOException4 = iOException2;
                    } catch (Throwable th6) {
                        th = th6;
                        iOException = iOException2;
                        date = now;
                        z = z2;
                        hTTPClient = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    hTTPResult = performCall;
                    date = now;
                    iOException = null;
                    hTTPClient.timeoutManager.recordRequestResult(requestResult);
                    hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, date, z, hTTPResult, refreshETag, iOException);
                    throw th;
                }
            }
            hTTPClient.timeoutManager.recordRequestResult(requestResult);
            url = baseURL;
            z3 = refreshETag;
            hTTPResult3 = performCall;
            date2 = now;
            iOException3 = null;
            endpoint3 = endpoint;
        } catch (IOException e2) {
            endpoint2 = endpoint;
            iOException2 = e2;
            z2 = false;
            hTTPResult2 = null;
        } catch (Throwable th8) {
            th = th8;
            iOException = null;
            hTTPClient = this;
            z = false;
            date = now;
            hTTPResult = null;
        }
        hTTPClient.trackHttpRequestPerformedIfNeeded(url, endpoint3, date2, z, hTTPResult3, z3, iOException3);
        hTTPResult4 = hTTPResult3;
        if (hTTPResult4 != null) {
            return (RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult4.getResponseCode()) && performRequest$canUseFallback(endpoint, fallbackURLIndex, fallbackBaseURLs)) ? performRequest$performRequestToFallbackURL(fallbackBaseURLs, fallbackURLIndex, this, endpoint, body, postFieldsToSign, requestHeaders, refreshETag) : hTTPResult4;
        }
        final LogIntent logIntent = LogIntent.WARNING;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.HTTPClient$performRequest$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " We were expecting to be able to return a cached response, but we can't find it. Retrying call with a new ETag";
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        return performRequest(baseURL, endpoint, body, postFieldsToSign, requestHeaders, true, fallbackBaseURLs, fallbackURLIndex);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117 A[Catch: MalformedURLException -> 0x03e9, TryCatch #0 {MalformedURLException -> 0x03e9, blocks: (B:21:0x0086, B:23:0x008e, B:25:0x0092, B:27:0x0098, B:29:0x00b0, B:30:0x00d6, B:32:0x00e9, B:37:0x00fa, B:38:0x0103, B:40:0x0117, B:42:0x0131, B:43:0x0159, B:149:0x00e2), top: B:20:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180 A[Catch: all -> 0x03cb, TRY_ENTER, TryCatch #3 {all -> 0x03cb, blocks: (B:46:0x0169, B:49:0x0180, B:50:0x01af, B:52:0x01b5, B:53:0x01bb), top: B:45:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5 A[Catch: all -> 0x03cb, TryCatch #3 {all -> 0x03cb, blocks: (B:46:0x0169, B:49:0x0180, B:50:0x01af, B:52:0x01b5, B:53:0x01bb), top: B:45:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HTTPResult performCall(URL baseURL, boolean isFallbackURL, Endpoint endpoint, Map<String, ? extends Object> body, List<Pair<String, String>> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag) {
        URL url;
        String str;
        URL url2;
        InputStream inputStream;
        HTTPClient hTTPClient;
        InputStream inputStream2;
        LogLevel logLevel;
        boolean z;
        String readFully;
        LogLevel logLevel2;
        URL url3;
        String str2;
        String str3;
        int i;
        boolean z2;
        HTTPClient hTTPClient2;
        String str4;
        VerificationResult verificationResult;
        VerificationResult verificationResult2;
        String str5;
        LinkedHashMap linkedHashMap;
        String str6;
        ForceServerErrorStrategy forceServerErrorStrategy;
        ForceServerErrorStrategy forceServerErrorStrategy2;
        HTTPResult fakeResponseWithoutPerformingRequest;
        JSONObject convertToJSON$purchases_defaultsBc8Release = body != null ? this.mapConverter.convertToJSON$purchases_defaultsBc8Release(body) : null;
        String path = endpoint.getPath(isFallbackURL);
        boolean shouldVerifyEndpoint = this.signingManager.shouldVerifyEndpoint(endpoint);
        boolean z3 = shouldVerifyEndpoint && endpoint.getNeedsNonceToPerformSigning();
        if (!this.appConfig.getRunningTests() || (forceServerErrorStrategy2 = this.forceServerErrorStrategy) == null || (fakeResponseWithoutPerformingRequest = forceServerErrorStrategy2.fakeResponseWithoutPerformingRequest(baseURL, endpoint)) == null) {
            try {
                if (!this.appConfig.getRunningTests() || (forceServerErrorStrategy = this.forceServerErrorStrategy) == null || !forceServerErrorStrategy.shouldForceServerError(baseURL, endpoint)) {
                    url = new URL(baseURL, path);
                } else {
                    LogLevel logLevel3 = LogLevel.WARN;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler.w("[Purchases] - " + logLevel3.name(), "Forcing server error for request to " + new URL(baseURL, path));
                    }
                    url = new URL(this.forceServerErrorStrategy.getServerErrorURL());
                }
                String createRandomNonce = z3 ? this.signingManager.createRandomNonce() : null;
                try {
                    if (postFieldsToSign != null) {
                        if ((shouldVerifyEndpoint ? postFieldsToSign : null) != null) {
                            str = this.signingManager.getPostParamsForSigningHeaderIfNeeded(endpoint, postFieldsToSign);
                            URL url4 = url;
                            HTTPRequest hTTPRequest = new HTTPRequest(url4, getHeaders(requestHeaders, url4, refreshETag, createRandomNonce, shouldVerifyEndpoint, str), convertToJSON$purchases_defaultsBc8Release);
                            if (this.enableExtraRequestLogging) {
                                url2 = url4;
                            } else {
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                url2 = url4;
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    currentLogHandler2.d("[Purchases] - " + logLevel4.name(), "HTTP request:\\n " + toCurlRequest(hTTPRequest));
                                }
                            }
                            String str7 = createRandomNonce;
                            HttpURLConnection connection = getConnection(hTTPRequest, this.timeoutManager.getTimeoutForRequest(endpoint, isFallbackURL));
                            inputStream = getInputStream(connection);
                            logLevel = LogLevel.DEBUG;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                                String str8 = "[Purchases] - " + logLevel.name();
                                z = shouldVerifyEndpoint;
                                String format = String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path}, 2));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                currentLogHandler3.d(str8, format);
                            } else {
                                z = shouldVerifyEndpoint;
                            }
                            int responseCode = connection.getResponseCode();
                            readFully = inputStream == null ? readFully(inputStream) : null;
                            if (this.enableExtraRequestLogging) {
                                inputStream2 = inputStream;
                            } else {
                                try {
                                    LogLevel logLevel5 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                    inputStream2 = inputStream;
                                    try {
                                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                            currentLogHandler4.d("[Purchases] - " + logLevel5.name(), "HTTP response:\\n  status code: " + responseCode + " \\n  body: " + readFully);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        hTTPClient = this;
                                        try {
                                            if (hTTPClient.enableExtraRequestLogging) {
                                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "HTTP request failed", th);
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            connection.disconnect();
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream2 = inputStream;
                                }
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            connection.disconnect();
                            logLevel2 = LogLevel.DEBUG;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                String str9 = "[Purchases] - " + logLevel2.name();
                                String format2 = String.format(NetworkStrings.API_REQUEST_COMPLETED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path, Integer.valueOf(responseCode)}, 3));
                                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                                currentLogHandler5.d(str9, format2);
                            }
                            if (readFully != null) {
                                throw new IOException(NetworkStrings.HTTP_RESPONSE_PAYLOAD_NULL);
                            }
                            if (this.appConfig.getRunningTests()) {
                                RequestResponseListener requestResponseListener = this.requestResponseListener;
                                if (requestResponseListener != null) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    Map<String, List<String>> headerFields = connection.getHeaderFields();
                                    Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
                                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                                        String key = entry.getKey();
                                        List<String> values = entry.getValue();
                                        if (key != null) {
                                            Intrinsics.checkNotNullExpressionValue(values, "values");
                                            if (!values.isEmpty()) {
                                                linkedHashMap2.put(key, CollectionsKt.joinToString$default(values, ", ", null, null, 0, null, null, 62, null));
                                            }
                                        }
                                    }
                                    try {
                                        URL url5 = new URL(baseURL, path);
                                        String url6 = url5.toString();
                                        Intrinsics.checkNotNullExpressionValue(url6, "fullURL.toString()");
                                        String requestMethod = connection.getRequestMethod();
                                        Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
                                        url3 = url2;
                                        str2 = str7;
                                        str3 = readFully;
                                        z2 = z;
                                        try {
                                            Map<String, String> headers = getHeaders(requestHeaders, url5, refreshETag, str2, z2, str);
                                            if (convertToJSON$purchases_defaultsBc8Release != null) {
                                                str5 = convertToJSON$purchases_defaultsBc8Release.toString();
                                                str6 = url6;
                                                linkedHashMap = linkedHashMap2;
                                            } else {
                                                str5 = null;
                                                linkedHashMap = linkedHashMap2;
                                                str6 = url6;
                                            }
                                            requestResponseListener.onRequestResponse(str6, requestMethod, headers, str5, responseCode, linkedHashMap, str3);
                                            i = responseCode;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            i = responseCode;
                                            LogLevel logLevel6 = LogLevel.WARN;
                                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                                currentLogHandler6.w("[Purchases] - " + logLevel6.name(), "RequestResponseListener error: " + th.getMessage());
                                            }
                                            if (!z2) {
                                            }
                                            hTTPClient2 = this;
                                            str4 = path;
                                            verificationResult = VerificationResult.NOT_REQUESTED;
                                            verificationResult2 = verificationResult;
                                            if (verificationResult2 != VerificationResult.FAILED) {
                                            }
                                            HttpURLConnection httpURLConnection = connection;
                                            boolean loadShedderHeader = hTTPClient2.getLoadShedderHeader(httpURLConnection);
                                            ETagManager eTagManager = hTTPClient2.eTagManager;
                                            String eTagHeader = hTTPClient2.getETagHeader(httpURLConnection);
                                            String url7 = url3.toString();
                                            Intrinsics.checkNotNullExpressionValue(url7, "fullURL.toString()");
                                            return eTagManager.getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release(i, str3, eTagHeader, url7, refreshETag, hTTPClient2.getRequestDateHeader(httpURLConnection), verificationResult2, loadShedderHeader, isFallbackURL);
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        url3 = url2;
                                        str2 = str7;
                                        str3 = readFully;
                                        z2 = z;
                                    }
                                } else {
                                    url3 = url2;
                                    str2 = str7;
                                    str3 = readFully;
                                    z2 = z;
                                    i = responseCode;
                                }
                            } else {
                                url3 = url2;
                                str2 = str7;
                                str3 = readFully;
                                i = responseCode;
                                z2 = z;
                            }
                            if (!z2 && RCHTTPStatusCodes.INSTANCE.isSuccessful(i)) {
                                str4 = path;
                                verificationResult = verifyResponse(str4, connection, str3, str2, str);
                                hTTPClient2 = this;
                            } else {
                                hTTPClient2 = this;
                                str4 = path;
                                verificationResult = VerificationResult.NOT_REQUESTED;
                            }
                            verificationResult2 = verificationResult;
                            if (verificationResult2 != VerificationResult.FAILED && (hTTPClient2.signingManager.getSignatureVerificationMode() instanceof SignatureVerificationMode.Enforced)) {
                                throw new SignatureVerificationException(str4);
                            }
                            HttpURLConnection httpURLConnection2 = connection;
                            boolean loadShedderHeader2 = hTTPClient2.getLoadShedderHeader(httpURLConnection2);
                            ETagManager eTagManager2 = hTTPClient2.eTagManager;
                            String eTagHeader2 = hTTPClient2.getETagHeader(httpURLConnection2);
                            String url72 = url3.toString();
                            Intrinsics.checkNotNullExpressionValue(url72, "fullURL.toString()");
                            return eTagManager2.getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release(i, str3, eTagHeader2, url72, refreshETag, hTTPClient2.getRequestDateHeader(httpURLConnection2), verificationResult2, loadShedderHeader2, isFallbackURL);
                        }
                    }
                    logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                    }
                    int responseCode2 = connection.getResponseCode();
                    if (inputStream == null) {
                    }
                    if (this.enableExtraRequestLogging) {
                    }
                    if (inputStream2 != null) {
                    }
                    connection.disconnect();
                    logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler52 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    }
                    if (readFully != null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    hTTPClient = this;
                    inputStream2 = inputStream;
                }
                str = null;
                URL url42 = url;
                HTTPRequest hTTPRequest2 = new HTTPRequest(url42, getHeaders(requestHeaders, url42, refreshETag, createRandomNonce, shouldVerifyEndpoint, str), convertToJSON$purchases_defaultsBc8Release);
                if (this.enableExtraRequestLogging) {
                }
                String str72 = createRandomNonce;
                HttpURLConnection connection2 = getConnection(hTTPRequest2, this.timeoutManager.getTimeoutForRequest(endpoint, isFallbackURL));
                inputStream = getInputStream(connection2);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else {
            LogLevel logLevel7 = LogLevel.WARN;
            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                currentLogHandler7.w("[Purchases] - " + logLevel7.name(), "Faking response for request to " + Endpoint.getPath$default(endpoint, false, 1, null));
            }
            return fakeResponseWithoutPerformingRequest;
        }
    }

    private final String toCurlRequest(HTTPRequest httpRequest) {
        String str;
        StringBuilder sb = new StringBuilder("curl -v -X ");
        if (httpRequest.getBody() == null) {
            str = "GET";
        } else {
            str = "POST";
        }
        sb.append(str).append(" \\\n  ");
        for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
            sb.append("-H \"").append(entry.getKey()).append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(entry.getValue());
            sb.append("\" \\\n  ");
        }
        if (httpRequest.getBody() != null) {
            sb.append("-d '").append(httpRequest.getBody().toString()).append("' \\\n  ");
        }
        sb.append("\"").append(httpRequest.getFullURL()).append("\"");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    private final void trackHttpRequestPerformedIfNeeded(URL baseURL, Endpoint endpoint, Date requestStartTime, boolean callSuccessful, HTTPResult callResult, boolean isRetry, IOException connectionException) {
        int i;
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long between = DurationExtensionsKt.between(Duration.INSTANCE, requestStartTime, this.dateProvider.getNow());
            if (callSuccessful) {
                i = callResult != null ? callResult.getResponseCode() : 304;
            } else {
                i = -1;
            }
            int i2 = i;
            HTTPResult.Origin origin = callResult != null ? callResult.getOrigin() : null;
            if (callResult == null || (verificationResult = callResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            boolean z = callSuccessful && RCHTTPStatusCodes.INSTANCE.isSuccessful(i2);
            ConnectionErrorReason fromIOException = connectionException != null ? ConnectionErrorReason.INSTANCE.fromIOException(connectionException) : null;
            String host = baseURL.getHost();
            Intrinsics.checkNotNullExpressionValue(host, "baseURL.host");
            diagnosticsTracker.m10595trackHttpRequestPerformedXzGXFE(host, endpoint, between, z, i2, callResult != null ? callResult.getBackendErrorCode() : null, origin, verificationResult2, isRetry, fromIOException);
        }
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsBc8Release();
    }

    private final Map<String, String> getHeaders(Map<String, String> authenticationHeaders, URL fullURL, boolean refreshETag, String nonce, boolean shouldSignResponse, String postFieldsToSignHeader) {
        Pair[] pairArr = new Pair[21];
        pairArr[0] = TuplesKt.to("Content-Type", HttpConstants.ContentTypes.JSON);
        pairArr[1] = TuplesKt.to("X-Platform", getXPlatformHeader());
        pairArr[2] = TuplesKt.to("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        pairArr[3] = TuplesKt.to("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        pairArr[4] = TuplesKt.to("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        pairArr[5] = TuplesKt.to("X-Platform-Device", Build.MODEL);
        pairArr[6] = TuplesKt.to("X-Platform-Brand", Build.BRAND);
        pairArr[7] = TuplesKt.to("X-Version", "9.18.0");
        pairArr[8] = TuplesKt.to("X-Preferred-Locales", StringsKt.replace$default(this.localeProvider.getCurrentLocalesLanguageTags(), '-', '_', false, 4, (Object) null));
        pairArr[9] = TuplesKt.to("X-Client-Locale", this.appConfig.getLanguageTag());
        pairArr[10] = TuplesKt.to("X-Client-Version", this.appConfig.getVersionName());
        pairArr[11] = TuplesKt.to("X-Client-Bundle-ID", this.appConfig.getPackageName());
        pairArr[12] = TuplesKt.to("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? "false" : "true");
        pairArr[13] = TuplesKt.to("X-Nonce", nonce);
        pairArr[14] = TuplesKt.to(HTTPRequest.POST_PARAMS_HASH, postFieldsToSignHeader);
        pairArr[15] = TuplesKt.to("X-Custom-Entitlements-Computation", this.appConfig.getCustomEntitlementComputation() ? "true" : null);
        pairArr[16] = TuplesKt.to("X-Storefront", this.storefrontProvider.getStorefront());
        pairArr[17] = TuplesKt.to("X-Is-Debug-Build", String.valueOf(this.appConfig.getIsDebugBuild()));
        pairArr[18] = TuplesKt.to("X-Kotlin-Version", KotlinVersion.CURRENT.toString());
        pairArr[19] = TuplesKt.to("X-Is-Backgrounded", String.valueOf(this.appConfig.isAppBackgrounded()));
        pairArr[20] = TuplesKt.to("X-Billing-Client-Sdk-Version", "8.0.0");
        Map plus = MapsKt.plus(MapsKt.mapOf(pairArr), authenticationHeaders);
        ETagManager eTagManager = this.eTagManager;
        String url = fullURL.toString();
        Intrinsics.checkNotNullExpressionValue(url, "fullURL.toString()");
        return MapExtensionsKt.filterNotNullValues(MapsKt.plus(plus, eTagManager.getETagHeaders$purchases_defaultsBc8Release(url, shouldSignResponse, refreshETag)));
    }

    private final HttpURLConnection getConnection(HTTPRequest request, long timeoutMs) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(request.getFullURL().openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setConnectTimeout((int) timeoutMs);
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream os = httpURLConnection.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(os, "os");
            BufferedWriter buffer = buffer(os);
            String jSONObject = body.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "body.toString()");
            writeFully(buffer, jSONObject);
        }
        return httpURLConnection;
    }

    private final String getXPlatformHeader() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1) {
            return "amazon";
        }
        return "android";
    }

    private final VerificationResult verifyResponse(String urlPath, URLConnection connection, String payload, String nonce, String postFieldsToSignHeader) {
        return this.signingManager.verifyResponse(urlPath, connection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), nonce, payload, getRequestTimeHeader(connection), getETagHeader(connection), postFieldsToSignHeader);
    }

    private final String getETagHeader(URLConnection connection) {
        return connection.getHeaderField("X-RevenueCat-ETag");
    }

    private final String getRequestTimeHeader(URLConnection connection) {
        String headerField = connection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || StringsKt.isBlank(headerField)) {
            return null;
        }
        return headerField;
    }

    private final Date getRequestDateHeader(URLConnection connection) {
        String requestTimeHeader = getRequestTimeHeader(connection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final boolean getLoadShedderHeader(URLConnection connection) {
        String str;
        String headerField = connection.getHeaderField(HTTPResult.LOAD_SHEDDER_HEADER_NAME);
        if (headerField != null) {
            str = headerField.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str, "true");
    }
}
