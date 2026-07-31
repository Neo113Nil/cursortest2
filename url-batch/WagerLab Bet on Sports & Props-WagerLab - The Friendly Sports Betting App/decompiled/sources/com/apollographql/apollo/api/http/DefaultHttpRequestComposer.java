package com.apollographql.apollo.api.http;

import androidx.browser.trusted.sharing.ShareTarget;
import com.apollographql.apollo.api.ApolloApiVersionKt;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.internal.UrlEncodeKt;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonWriter;
import com.apollographql.apollo.api.json.internal.FileUploadAwareJsonWriter;
import com.google.android.gms.actions.SearchIntents;
import io.ably.lib.http.HttpConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: DefaultHttpRequestComposer.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer;", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "serverUrl", "", "<init>", "(Ljava/lang/String;)V", "compose", "Lcom/apollographql/apollo/api/http/HttpRequest;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "apolloRequest", "Lcom/apollographql/apollo/api/ApolloRequest;", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultHttpRequestComposer implements HttpRequestComposer {
    private final String serverUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_APOLLO_OPERATION_ID = "X-APOLLO-OPERATION-ID";
    private static final String HEADER_APOLLO_OPERATION_NAME = "X-APOLLO-OPERATION-NAME";
    private static final String HEADER_APOLLO_REQUIRE_PREFLIGHT = "Apollo-Require-Preflight";
    private static final String HEADER_ACCEPT_NAME = "Accept";
    private static final String HEADER_ACCEPT_VALUE_DEFER = "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json";
    private static final String HEADER_ACCEPT_VALUE_MULTIPART = "multipart/mixed;subscriptionSpec=1.0, application/graphql-response+json, application/json";

    /* compiled from: DefaultHttpRequestComposer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.Get.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.Post.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultHttpRequestComposer(String serverUrl) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        this.serverUrl = serverUrl;
    }

    @Override // com.apollographql.apollo.api.http.HttpRequestComposer
    public <D extends Operation.Data> HttpRequest compose(ApolloRequest<D> apolloRequest) {
        HttpRequest.Builder addHeader;
        Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
        Operation<D> operation = apolloRequest.getOperation();
        CustomScalarAdapters customScalarAdapters = (CustomScalarAdapters) apolloRequest.getExecutionContext().get(CustomScalarAdapters.INSTANCE);
        if (customScalarAdapters == null) {
            customScalarAdapters = CustomScalarAdapters.Empty;
        }
        CustomScalarAdapters customScalarAdapters2 = customScalarAdapters;
        ArrayList arrayList = new ArrayList();
        if (apolloRequest.getOperation() instanceof Subscription) {
            arrayList.add(new HttpHeader(HEADER_ACCEPT_NAME, HEADER_ACCEPT_VALUE_MULTIPART));
        } else {
            arrayList.add(new HttpHeader(HEADER_ACCEPT_NAME, HEADER_ACCEPT_VALUE_DEFER));
        }
        if (apolloRequest.getHttpHeaders() != null) {
            arrayList.addAll(apolloRequest.getHttpHeaders());
        }
        Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
        boolean booleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
        Boolean sendDocument = apolloRequest.getSendDocument();
        boolean booleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
        boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
        HttpMethod httpMethod = apolloRequest.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = HttpMethod.Post;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[httpMethod.ordinal()];
        if (i == 1) {
            addHeader = new HttpRequest.Builder(HttpMethod.Get, INSTANCE.buildGetUrl(this.serverUrl, operation, customScalarAdapters2, booleanValue, booleanValue2, sendEnhancedClientAwareness)).addHeader(HEADER_APOLLO_REQUIRE_PREFLIGHT, "true");
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String document = booleanValue2 ? operation.document() : null;
            Companion companion = INSTANCE;
            HttpBody buildPostBody = companion.buildPostBody(operation, customScalarAdapters2, document, companion.extensionsWriter(operation.id(), booleanValue, sendEnhancedClientAwareness));
            addHeader = new HttpRequest.Builder(HttpMethod.Post, this.serverUrl).body(buildPostBody);
            if (StringsKt.startsWith$default(buildPostBody.getContentType(), ShareTarget.ENCODING_TYPE_MULTIPART, false, 2, (Object) null)) {
                addHeader = addHeader.addHeader(HEADER_APOLLO_REQUIRE_PREFLIGHT, "true");
            }
        }
        return addHeader.addHeaders(arrayList).addExecutionContext(apolloRequest.getExecutionContext()).build();
    }

    /* compiled from: DefaultHttpRequestComposer.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0014\u001a\u00020\u0005\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J_\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0!\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010#\u001a\u00020$2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u00052\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0002JV\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0!\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010#\u001a\u00020$2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002J1\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002JL\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001dH\u0002J\u001e\u0010.\u001a\u00020\u0005*\u00020\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!J:\u00100\u001a\u000201\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0007JI\u00100\u001a\u000201\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u00052\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J8\u00102\u001a\u000203\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J>\u00102\u001a\u000203\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dJ,\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010!\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u00105\u001a\b\u0012\u0004\u0012\u0002H\u001506R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b¨\u00067"}, d2 = {"Lcom/apollographql/apollo/api/http/DefaultHttpRequestComposer$Companion;", "", "<init>", "()V", "HEADER_APOLLO_OPERATION_ID", "", "getHEADER_APOLLO_OPERATION_ID$annotations", "getHEADER_APOLLO_OPERATION_ID", "()Ljava/lang/String;", "HEADER_APOLLO_OPERATION_NAME", "getHEADER_APOLLO_OPERATION_NAME$annotations", "getHEADER_APOLLO_OPERATION_NAME", "HEADER_APOLLO_REQUIRE_PREFLIGHT", "getHEADER_APOLLO_REQUIRE_PREFLIGHT$apollo_api", "HEADER_ACCEPT_NAME", "getHEADER_ACCEPT_NAME", "HEADER_ACCEPT_VALUE_DEFER", "getHEADER_ACCEPT_VALUE_DEFER", "HEADER_ACCEPT_VALUE_MULTIPART", "getHEADER_ACCEPT_VALUE_MULTIPART", "buildGetUrl", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "serverUrl", "operation", "Lcom/apollographql/apollo/api/Operation;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "sendApqExtensions", "", "sendDocument", "sendEnhancedClientAwarenessExtensions", "composePostParams", "", "Lcom/apollographql/apollo/api/Upload;", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", SearchIntents.EXTRA_QUERY, "extensionsWriter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "apqId", "composeGetParams", "autoPersistQueries", "sendEnhancedClientAwareness", "appendQueryParameters", "parameters", "buildPostBody", "Lcom/apollographql/apollo/api/http/HttpBody;", "buildParamsMap", "Lokio/ByteString;", "composePayload", "apolloRequest", "Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "If needed, add this header with ApolloCall.addHttpHeader() instead")
        public static /* synthetic */ void getHEADER_APOLLO_OPERATION_ID$annotations() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "If needed, add this header with ApolloCall.addHttpHeader() instead")
        public static /* synthetic */ void getHEADER_APOLLO_OPERATION_NAME$annotations() {
        }

        private Companion() {
        }

        public final String getHEADER_APOLLO_OPERATION_ID() {
            return DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_ID;
        }

        public final String getHEADER_APOLLO_OPERATION_NAME() {
            return DefaultHttpRequestComposer.HEADER_APOLLO_OPERATION_NAME;
        }

        public final String getHEADER_APOLLO_REQUIRE_PREFLIGHT$apollo_api() {
            return DefaultHttpRequestComposer.HEADER_APOLLO_REQUIRE_PREFLIGHT;
        }

        public final String getHEADER_ACCEPT_NAME() {
            return DefaultHttpRequestComposer.HEADER_ACCEPT_NAME;
        }

        public final String getHEADER_ACCEPT_VALUE_DEFER() {
            return DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_DEFER;
        }

        public final String getHEADER_ACCEPT_VALUE_MULTIPART() {
            return DefaultHttpRequestComposer.HEADER_ACCEPT_VALUE_MULTIPART;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends Operation.Data> String buildGetUrl(String serverUrl, Operation<D> operation, CustomScalarAdapters customScalarAdapters, boolean sendApqExtensions, boolean sendDocument, boolean sendEnhancedClientAwarenessExtensions) {
            return appendQueryParameters(serverUrl, composeGetParams(operation, customScalarAdapters, sendApqExtensions, sendDocument, sendEnhancedClientAwarenessExtensions));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends Operation.Data> Map<String, Upload> composePostParams(JsonWriter writer, Operation<D> operation, CustomScalarAdapters customScalarAdapters, boolean sendApqExtensions, boolean sendEnhancedClientAwarenessExtensions, String query) {
            return composePostParams(writer, operation, customScalarAdapters, query, extensionsWriter(operation.id(), sendApqExtensions, sendEnhancedClientAwarenessExtensions));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Function1<JsonWriter, Unit> extensionsWriter(final String apqId, final boolean sendApqExtensions, final boolean sendEnhancedClientAwarenessExtensions) {
            if (!sendApqExtensions && !sendEnhancedClientAwarenessExtensions) {
                return new Function1() { // from class: com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit extensionsWriter$lambda$2;
                        extensionsWriter$lambda$2 = DefaultHttpRequestComposer.Companion.extensionsWriter$lambda$2((JsonWriter) obj);
                        return extensionsWriter$lambda$2;
                    }
                };
            }
            return new Function1() { // from class: com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit extensionsWriter$lambda$6;
                    extensionsWriter$lambda$6 = DefaultHttpRequestComposer.Companion.extensionsWriter$lambda$6(sendApqExtensions, sendEnhancedClientAwarenessExtensions, apqId, (JsonWriter) obj);
                    return extensionsWriter$lambda$6;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit extensionsWriter$lambda$2(JsonWriter jsonWriter) {
            Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit extensionsWriter$lambda$6(boolean z, boolean z2, String str, JsonWriter jsonWriter) {
            Intrinsics.checkNotNullParameter(jsonWriter, "<this>");
            jsonWriter.name("extensions");
            jsonWriter.beginObject();
            if (z) {
                jsonWriter.name("persistedQuery");
                jsonWriter.beginObject();
                jsonWriter.name("version").value(1);
                jsonWriter.name("sha256Hash").value(str);
                jsonWriter.endObject();
            }
            if (z2) {
                jsonWriter.name("clientLibrary");
                jsonWriter.beginObject();
                jsonWriter.name("name").value("apollo-kotlin");
                jsonWriter.name("version").value(ApolloApiVersionKt.apolloApiVersion);
                jsonWriter.endObject();
            }
            jsonWriter.endObject();
            return Unit.INSTANCE;
        }

        private final <D extends Operation.Data> Map<String, String> composeGetParams(Operation<D> operation, CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, boolean sendDocument, boolean sendEnhancedClientAwareness) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", operation.name());
            Buffer buffer = new Buffer();
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter = new FileUploadAwareJsonWriter(new BufferedSinkJsonWriter(buffer, null));
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter2 = fileUploadAwareJsonWriter;
            fileUploadAwareJsonWriter2.beginObject();
            operation.serializeVariables(fileUploadAwareJsonWriter2, customScalarAdapters, false);
            fileUploadAwareJsonWriter2.endObject();
            if (!fileUploadAwareJsonWriter.collectedUploads().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time".toString());
            }
            linkedHashMap.put("variables", buffer.readUtf8());
            if (sendDocument) {
                linkedHashMap.put(SearchIntents.EXTRA_QUERY, operation.document());
            }
            Buffer buffer2 = new Buffer();
            BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(buffer2, null);
            bufferedSinkJsonWriter.beginObject();
            if (autoPersistQueries) {
                bufferedSinkJsonWriter.name("persistedQuery");
                bufferedSinkJsonWriter.beginObject();
                bufferedSinkJsonWriter.name("version").value(1);
                bufferedSinkJsonWriter.name("sha256Hash").value(operation.id());
                bufferedSinkJsonWriter.endObject();
            }
            if (sendEnhancedClientAwareness) {
                bufferedSinkJsonWriter.name("clientLibrary");
                bufferedSinkJsonWriter.beginObject();
                bufferedSinkJsonWriter.name("name").value("apollo-kotlin");
                bufferedSinkJsonWriter.name("version").value(ApolloApiVersionKt.apolloApiVersion);
                bufferedSinkJsonWriter.endObject();
            }
            bufferedSinkJsonWriter.endObject();
            String readUtf8 = buffer2.readUtf8();
            if (readUtf8.length() == 0) {
                return linkedHashMap;
            }
            linkedHashMap.put("extensions", readUtf8);
            return linkedHashMap;
        }

        public final String appendQueryParameters(String str, Map<String, String> parameters) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            boolean contains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "?", false, 2, (Object) null);
            Iterator<T> it = parameters.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (contains$default) {
                    sb.append(Typography.amp);
                } else {
                    sb.append('?');
                    contains$default = true;
                }
                sb.append(UrlEncodeKt.urlEncode((String) entry.getKey()));
                sb.append('=');
                sb.append(UrlEncodeKt.urlEncode((String) entry.getValue()));
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }

        @Deprecated(message = "Use buildPostBody(operation, customScalarAdapters, query, extensionsWriter) instead")
        public final <D extends Operation.Data> HttpBody buildPostBody(Operation<D> operation, CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, String query) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            return buildPostBody(operation, customScalarAdapters, query, extensionsWriter(operation.id(), autoPersistQueries, false));
        }

        public final <D extends Operation.Data> Map<String, Object> composePayload(ApolloRequest<D> apolloRequest) {
            Intrinsics.checkNotNullParameter(apolloRequest, "apolloRequest");
            Operation<D> operation = apolloRequest.getOperation();
            Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
            boolean booleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
            boolean sendEnhancedClientAwareness = apolloRequest.getSendEnhancedClientAwareness();
            Boolean sendDocument = apolloRequest.getSendDocument();
            boolean booleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
            CustomScalarAdapters customScalarAdapters = (CustomScalarAdapters) apolloRequest.getExecutionContext().get(CustomScalarAdapters.INSTANCE);
            if (customScalarAdapters == null) {
                customScalarAdapters = CustomScalarAdapters.Empty;
            }
            CustomScalarAdapters customScalarAdapters2 = customScalarAdapters;
            String document = booleanValue2 ? operation.document() : null;
            MapJsonWriter mapJsonWriter = new MapJsonWriter();
            DefaultHttpRequestComposer.INSTANCE.composePostParams(mapJsonWriter, operation, customScalarAdapters2, booleanValue, sendEnhancedClientAwareness, document);
            Object root = mapJsonWriter.root();
            Intrinsics.checkNotNull(root, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map) root;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends Operation.Data> Map<String, Upload> composePostParams(JsonWriter writer, Operation<D> operation, CustomScalarAdapters customScalarAdapters, String query, Function1<? super JsonWriter, Unit> extensionsWriter) {
            writer.beginObject();
            writer.name("operationName");
            writer.value(operation.name());
            writer.name("variables");
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter = new FileUploadAwareJsonWriter(writer);
            FileUploadAwareJsonWriter fileUploadAwareJsonWriter2 = fileUploadAwareJsonWriter;
            fileUploadAwareJsonWriter2.beginObject();
            operation.serializeVariables(fileUploadAwareJsonWriter2, customScalarAdapters, false);
            fileUploadAwareJsonWriter2.endObject();
            Map<String, Upload> collectedUploads = fileUploadAwareJsonWriter.collectedUploads();
            if (query != null) {
                writer.name(SearchIntents.EXTRA_QUERY);
                writer.value(query);
            }
            extensionsWriter.invoke(writer);
            writer.endObject();
            return collectedUploads;
        }

        public final <D extends Operation.Data> HttpBody buildPostBody(Operation<D> operation, CustomScalarAdapters customScalarAdapters, String query, Function1<? super JsonWriter, Unit> extensionsWriter) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(extensionsWriter, "extensionsWriter");
            Buffer buffer = new Buffer();
            Map composePostParams = DefaultHttpRequestComposer.INSTANCE.composePostParams(new BufferedSinkJsonWriter(buffer, null), operation, customScalarAdapters, query, extensionsWriter);
            final ByteString readByteString = buffer.readByteString();
            if (composePostParams.isEmpty()) {
                return new HttpBody() { // from class: com.apollographql.apollo.api.http.DefaultHttpRequestComposer$Companion$buildPostBody$1
                    private final long contentLength;
                    private final String contentType = HttpConstants.ContentTypes.JSON;

                    {
                        this.contentLength = ByteString.this.size();
                    }

                    @Override // com.apollographql.apollo.api.http.HttpBody
                    public String getContentType() {
                        return this.contentType;
                    }

                    @Override // com.apollographql.apollo.api.http.HttpBody
                    public long getContentLength() {
                        return this.contentLength;
                    }

                    @Override // com.apollographql.apollo.api.http.HttpBody
                    public void writeTo(BufferedSink bufferedSink) {
                        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
                        bufferedSink.write(ByteString.this);
                    }
                };
            }
            return new UploadsHttpBody(composePostParams, readByteString);
        }

        @Deprecated(message = "Use new function with additional parameters instead.", replaceWith = @ReplaceWith(expression = "buildParamsMap(operation = operation, customScalarAdapters = customScalarAdapters, autoPersistQueries = autoPersistQueries, sendDocument = sendDocument, sendEnhancedClientAwarenessExtensions = true)", imports = {}))
        public final <D extends Operation.Data> ByteString buildParamsMap(Operation<D> operation, CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, boolean sendDocument) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Buffer buffer = new Buffer();
            DefaultHttpRequestComposer.INSTANCE.composePostParams(new BufferedSinkJsonWriter(buffer, null), operation, customScalarAdapters, autoPersistQueries, true, sendDocument ? operation.document() : null);
            return buffer.readByteString();
        }

        public final <D extends Operation.Data> ByteString buildParamsMap(Operation<D> operation, CustomScalarAdapters customScalarAdapters, boolean autoPersistQueries, boolean sendDocument, boolean sendEnhancedClientAwarenessExtensions) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Buffer buffer = new Buffer();
            DefaultHttpRequestComposer.INSTANCE.composePostParams(new BufferedSinkJsonWriter(buffer, null), operation, customScalarAdapters, autoPersistQueries, sendEnhancedClientAwarenessExtensions, sendDocument ? operation.document() : null);
            return buffer.readByteString();
        }
    }
}
