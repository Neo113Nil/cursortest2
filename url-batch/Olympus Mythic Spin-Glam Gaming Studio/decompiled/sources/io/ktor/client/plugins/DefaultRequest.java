package io.ktor.client.plugins;

import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersKt;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.StringValuesKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: DefaultRequest.kt */
/* loaded from: classes8.dex */
public final class DefaultRequest {
    public static final Plugin Plugin = new Plugin(0 == true ? 1 : 0);
    private static final AttributeKey key;
    private final Function1 block;

    public /* synthetic */ DefaultRequest(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    private DefaultRequest(Function1 function1) {
        this.block = function1;
    }

    /* compiled from: DefaultRequest.kt */
    public static final class Plugin implements HttpClientPlugin {
        public /* synthetic */ Plugin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey getKey() {
            return DefaultRequest.key;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public DefaultRequest prepare(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new DefaultRequest(block, null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(DefaultRequest plugin, HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getBefore(), new DefaultRequest$Plugin$install$1(plugin, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void mergeUrls(Url url, URLBuilder uRLBuilder) {
            if (uRLBuilder.getProtocolOrNull() == null) {
                uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
            }
            if (uRLBuilder.getHost().length() > 0) {
                return;
            }
            URLBuilder URLBuilder = URLUtilsKt.URLBuilder(url);
            URLBuilder.setProtocolOrNull(uRLBuilder.getProtocolOrNull());
            if (uRLBuilder.getPort() != 0) {
                URLBuilder.setPort(uRLBuilder.getPort());
            }
            URLBuilder.setEncodedPathSegments(DefaultRequest.Plugin.concatenatePath(URLBuilder.getEncodedPathSegments(), uRLBuilder.getEncodedPathSegments()));
            if (uRLBuilder.getEncodedFragment().length() > 0) {
                URLBuilder.setEncodedFragment(uRLBuilder.getEncodedFragment());
            }
            ParametersBuilder ParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            StringValuesKt.appendAll(ParametersBuilder$default, URLBuilder.getEncodedParameters());
            URLBuilder.setEncodedParameters(uRLBuilder.getEncodedParameters());
            for (Map.Entry entry : ParametersBuilder$default.entries()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!URLBuilder.getEncodedParameters().contains(str)) {
                    URLBuilder.getEncodedParameters().appendAll(str, list);
                }
            }
            URLUtilsKt.takeFrom(uRLBuilder, URLBuilder);
        }

        private final List concatenatePath(List list, List list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty() || ((CharSequence) CollectionsKt.first(list2)).length() == 0) {
                return list2;
            }
            List createListBuilder = CollectionsKt.createListBuilder((list.size() + list2.size()) - 1);
            int size = list.size() - 1;
            for (int i = 0; i < size; i++) {
                createListBuilder.add(list.get(i));
            }
            createListBuilder.addAll(list2);
            return CollectionsKt.build(createListBuilder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DefaultRequest.class);
        try {
            kType = Reflection.typeOf(DefaultRequest.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey("DefaultRequest", new TypeInfo(orCreateKotlinClass, kType));
    }

    /* compiled from: DefaultRequest.kt */
    public static final class DefaultRequestBuilder implements HttpMessageBuilder {
        private final HeadersBuilder headers = new HeadersBuilder(0, 1, null);
        private final URLBuilder url = new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null);
        private final Attributes attributes = AttributesJvmKt.Attributes(true);

        @Override // io.ktor.http.HttpMessageBuilder
        public HeadersBuilder getHeaders() {
            return this.headers;
        }

        public final URLBuilder getUrl() {
            return this.url;
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }
    }
}
