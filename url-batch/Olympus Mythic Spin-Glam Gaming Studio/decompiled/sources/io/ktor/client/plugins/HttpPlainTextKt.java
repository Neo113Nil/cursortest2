package io.ktor.client.plugins;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Charsets;
import kotlinx.io.Source;
import org.slf4j.Logger;

/* compiled from: HttpPlainText.kt */
/* loaded from: classes11.dex */
public abstract class HttpPlainTextKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpPlainText");
    private static final ClientPlugin HttpPlainText = CreatePluginUtilsKt.createClientPlugin("HttpPlainText", HttpPlainTextKt$HttpPlainText$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpPlainTextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpPlainText$lambda$6;
            HttpPlainText$lambda$6 = HttpPlainTextKt.HttpPlainText$lambda$6((ClientPluginBuilder) obj);
            return HttpPlainText$lambda$6;
        }
    });

    public static final ClientPlugin getHttpPlainText() {
        return HttpPlainText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpPlainText$lambda$6(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List<Pair> sortedWith = CollectionsKt.sortedWith(MapsKt.toList(((HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getCharsetQuality$ktor_client_core()), new Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues((Float) ((Pair) obj2).getSecond(), (Float) ((Pair) obj).getSecond());
            }
        });
        Charset responseCharsetFallback = ((HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getResponseCharsetFallback();
        Set charsets$ktor_client_core = ((HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getCharsets$ktor_client_core();
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets$ktor_client_core) {
            if (!((HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getCharsetQuality$ktor_client_core().containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> sortedWith2 = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ComparisonsKt.compareValues(CharsetJVMKt.getName((Charset) obj2), CharsetJVMKt.getName((Charset) obj3));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Charset charset : sortedWith2) {
            if (sb.length() > 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(CharsetJVMKt.getName(charset));
        }
        for (Pair pair : sortedWith) {
            Charset charset2 = (Charset) pair.component1();
            float floatValue = ((Number) pair.component2()).floatValue();
            if (sb.length() > 0) {
                sb.append(StringUtils.COMMA);
            }
            double d = floatValue;
            if (0.0d > d || d > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(CharsetJVMKt.getName(charset2) + ";q=" + (MathKt.roundToInt(100 * floatValue) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(CharsetJVMKt.getName(responseCharsetFallback));
        }
        String sb2 = sb.toString();
        Charset sendCharset = ((HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getSendCharset();
        if (sendCharset == null && (sendCharset = (Charset) CollectionsKt.firstOrNull(sortedWith2)) == null) {
            Pair pair2 = (Pair) CollectionsKt.firstOrNull(sortedWith);
            sendCharset = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (sendCharset == null) {
                sendCharset = Charsets.UTF_8;
            }
        }
        createClientPlugin.on(RenderRequestHook.INSTANCE, new HttpPlainTextKt$HttpPlainText$2$1(sb2, sendCharset, null));
        createClientPlugin.transformResponseBody(new HttpPlainTextKt$HttpPlainText$2$2(responseCharsetFallback, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OutgoingContent HttpPlainText$lambda$6$wrapContent(Charset charset, HttpRequestBuilder httpRequestBuilder, String str, ContentType contentType) {
        Charset charset2;
        ContentType plain = contentType == null ? ContentType.Text.INSTANCE.getPlain() : contentType;
        if (contentType != null && (charset2 = ContentTypesKt.charset(contentType)) != null) {
            charset = charset2;
        }
        LOGGER.trace("Sending request body to " + httpRequestBuilder.getUrl() + " as text/plain with charset " + charset);
        return new TextContent(str, ContentTypesKt.withCharset(plain, charset), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HttpPlainText$lambda$6$read(Charset charset, HttpClientCall httpClientCall, Source source) {
        Charset charset2 = HttpMessagePropertiesKt.charset(httpClientCall.getResponse());
        if (charset2 != null) {
            charset = charset2;
        }
        LOGGER.trace("Reading response body for " + httpClientCall.getRequest().getUrl() + " as String with charset " + charset);
        return StringsKt.readText$default(source, charset, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HttpPlainText$lambda$6$addCharsetHeaders(String str, HttpRequestBuilder httpRequestBuilder) {
        HeadersBuilder headers = httpRequestBuilder.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (headers.get(httpHeaders.getAcceptCharset()) != null) {
            return;
        }
        LOGGER.trace("Adding Accept-Charset=" + str + " to " + httpRequestBuilder.getUrl());
        httpRequestBuilder.getHeaders().set(httpHeaders.getAcceptCharset(), str);
    }
}
