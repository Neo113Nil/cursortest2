package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApolloRequest.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00016B\u0093\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000004J&\u00103\u001a\b\u0012\u0004\u0012\u0002H504\"\b\b\u0001\u00105*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H50\u0005H\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b)\u0010&R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R \u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010&R \u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010'\u0012\u0004\b/\u0010-\u001a\u0004\b0\u0010&R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/apollographql/apollo/api/ApolloRequest;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/ExecutionOptions;", "operation", "Lcom/apollographql/apollo/api/Operation;", "requestUuid", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "httpMethod", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpHeaders", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "sendApqExtensions", "", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "ignoreApolloClientHttpHeaders", "retryOnError", "failFastIfOffline", "sendEnhancedClientAwareness", "<init>", "(Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;Lcom/apollographql/apollo/api/ExecutionContext;Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "getOperation", "()Lcom/apollographql/apollo/api/Operation;", "getRequestUuid", "()Ljava/util/UUID;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "getHttpHeaders", "()Ljava/util/List;", "getSendApqExtensions", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSendDocument", "getEnableAutoPersistedQueries", "getCanBeBatched", "getIgnoreApolloClientHttpHeaders", "getRetryOnError$annotations", "()V", "getRetryOnError", "getFailFastIfOffline$annotations", "getFailFastIfOffline", "getSendEnhancedClientAwareness", "()Z", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/ApolloRequest$Builder;", ExifInterface.LONGITUDE_EAST, "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloRequest<D extends Operation.Data> implements ExecutionOptions {
    private final Boolean canBeBatched;
    private final Boolean enableAutoPersistedQueries;
    private final ExecutionContext executionContext;
    private final Boolean failFastIfOffline;
    private final List<HttpHeader> httpHeaders;
    private final HttpMethod httpMethod;
    private final Boolean ignoreApolloClientHttpHeaders;
    private final Operation<D> operation;
    private final UUID requestUuid;
    private final Boolean retryOnError;
    private final Boolean sendApqExtensions;
    private final Boolean sendDocument;
    private final boolean sendEnhancedClientAwareness;

    public /* synthetic */ ApolloRequest(Operation operation, UUID uuid, ExecutionContext executionContext, HttpMethod httpMethod, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(operation, uuid, executionContext, httpMethod, list, bool, bool2, bool3, bool4, bool5, bool6, bool7, z);
    }

    public static /* synthetic */ void getFailFastIfOffline$annotations() {
    }

    public static /* synthetic */ void getRetryOnError$annotations() {
    }

    private ApolloRequest(Operation<D> operation, UUID uuid, ExecutionContext executionContext, HttpMethod httpMethod, List<HttpHeader> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z) {
        this.operation = operation;
        this.requestUuid = uuid;
        this.executionContext = executionContext;
        this.httpMethod = httpMethod;
        this.httpHeaders = list;
        this.sendApqExtensions = bool;
        this.sendDocument = bool2;
        this.enableAutoPersistedQueries = bool3;
        this.canBeBatched = bool4;
        this.ignoreApolloClientHttpHeaders = bool5;
        this.retryOnError = bool6;
        this.failFastIfOffline = bool7;
        this.sendEnhancedClientAwareness = z;
    }

    public final Operation<D> getOperation() {
        return this.operation;
    }

    public final UUID getRequestUuid() {
        return this.requestUuid;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public ExecutionContext getExecutionContext() {
        return this.executionContext;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public List<HttpHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    public final Boolean getIgnoreApolloClientHttpHeaders() {
        return this.ignoreApolloClientHttpHeaders;
    }

    public final Boolean getRetryOnError() {
        return this.retryOnError;
    }

    public final Boolean getFailFastIfOffline() {
        return this.failFastIfOffline;
    }

    public final boolean getSendEnhancedClientAwareness() {
        return this.sendEnhancedClientAwareness;
    }

    public final Builder<D> newBuilder() {
        return (Builder<D>) newBuilder(this.operation);
    }

    public final <E extends Operation.Data> Builder<E> newBuilder(Operation<E> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new Builder(operation).requestUuid(this.requestUuid).executionContext(getExecutionContext()).httpMethod(getHttpMethod()).httpHeaders(getHttpHeaders()).sendApqExtensions(getSendApqExtensions()).sendDocument(getSendDocument()).enableAutoPersistedQueries(getEnableAutoPersistedQueries()).canBeBatched(getCanBeBatched()).retryOnError(this.retryOnError).failFastIfOffline(this.failFastIfOffline).ignoreApolloClientHttpHeaders(this.ignoreApolloClientHttpHeaders).sendEnhancedClientAwareness(this.sendEnhancedClientAwareness);
    }

    /* compiled from: ApolloRequest.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\r\u001a\u00060\u000bj\u0002`\fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010(\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u00105J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00107\u001a\u0002082\u0006\u0010\n\u001a\u000208H\u0016J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u00105J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u00105J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u00105J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010&\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u00105J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u00105J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010.\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u00105J\u0014\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00101\u001a\u00020\u001dJ\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010:R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR.\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u000e\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0014@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R.\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d@RX\u0096\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d@RX\u0096\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d@RX\u0096\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R$\u0010&\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d@RX\u0096\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b'\u0010 R$\u0010(\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d@BX\u0086\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R,\u0010*\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010 R,\u0010.\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010 R\u001e\u00101\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006;"}, d2 = {"Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "operation", "Lcom/apollographql/apollo/api/Operation;", "<init>", "(Lcom/apollographql/apollo/api/Operation;)V", "getOperation", "()Lcom/apollographql/apollo/api/Operation;", "value", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "getRequestUuid", "()Ljava/util/UUID;", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethod", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "getHttpHeaders", "()Ljava/util/List;", "", "enableAutoPersistedQueries", "getEnableAutoPersistedQueries", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "sendApqExtensions", "getSendApqExtensions", "sendDocument", "getSendDocument", "canBeBatched", "getCanBeBatched", "ignoreApolloClientHttpHeaders", "getIgnoreApolloClientHttpHeaders", "retryOnError", "getRetryOnError$annotations", "()V", "getRetryOnError", "failFastIfOffline", "getFailFastIfOffline$annotations", "getFailFastIfOffline", "sendEnhancedClientAwareness", "getSendEnhancedClientAwareness", "()Z", "addExecutionContext", "(Ljava/lang/Boolean;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "addHttpHeader", "name", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/ApolloRequest;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder<D extends Operation.Data> implements MutableExecutionOptions<Builder<D>> {
        private Boolean canBeBatched;
        private Boolean enableAutoPersistedQueries;
        private ExecutionContext executionContext;
        private Boolean failFastIfOffline;
        private List<HttpHeader> httpHeaders;
        private HttpMethod httpMethod;
        private Boolean ignoreApolloClientHttpHeaders;
        private final Operation<D> operation;
        private UUID requestUuid;
        private Boolean retryOnError;
        private Boolean sendApqExtensions;
        private Boolean sendDocument;
        private boolean sendEnhancedClientAwareness;

        public static /* synthetic */ void getFailFastIfOffline$annotations() {
        }

        public static /* synthetic */ void getRetryOnError$annotations() {
        }

        public Builder(Operation<D> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.executionContext = ExecutionContext.Empty;
            this.sendEnhancedClientAwareness = true;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public /* bridge */ /* synthetic */ Object httpHeaders(List list) {
            return httpHeaders((List<HttpHeader>) list);
        }

        public final Operation<D> getOperation() {
            return this.operation;
        }

        public final UUID getRequestUuid() {
            return this.requestUuid;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public ExecutionContext getExecutionContext() {
            return this.executionContext;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public HttpMethod getHttpMethod() {
            return this.httpMethod;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public List<HttpHeader> getHttpHeaders() {
            return this.httpHeaders;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        public final Boolean getIgnoreApolloClientHttpHeaders() {
            return this.ignoreApolloClientHttpHeaders;
        }

        public final Boolean getRetryOnError() {
            return this.retryOnError;
        }

        public final Boolean getFailFastIfOffline() {
            return this.failFastIfOffline;
        }

        public final boolean getSendEnhancedClientAwareness() {
            return this.sendEnhancedClientAwareness;
        }

        public final Builder<D> requestUuid(UUID requestUuid) {
            Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }

        public final Builder<D> executionContext(ExecutionContext executionContext) {
            Intrinsics.checkNotNullParameter(executionContext, "executionContext");
            this.executionContext = executionContext;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> addExecutionContext(ExecutionContext executionContext) {
            Intrinsics.checkNotNullParameter(executionContext, "executionContext");
            this.executionContext = getExecutionContext().plus(executionContext);
            return this;
        }

        public final Builder<D> ignoreApolloClientHttpHeaders(Boolean ignoreApolloClientHttpHeaders) {
            this.ignoreApolloClientHttpHeaders = ignoreApolloClientHttpHeaders;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> httpMethod(HttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> httpHeaders(List<HttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> addHttpHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<HttpHeader> httpHeaders = getHttpHeaders();
            if (httpHeaders == null) {
                httpHeaders = CollectionsKt.emptyList();
            }
            this.httpHeaders = CollectionsKt.plus((Collection<? extends HttpHeader>) httpHeaders, new HttpHeader(name, value));
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> sendApqExtensions(Boolean sendApqExtensions) {
            this.sendApqExtensions = sendApqExtensions;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> sendDocument(Boolean sendDocument) {
            this.sendDocument = sendDocument;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> enableAutoPersistedQueries(Boolean enableAutoPersistedQueries) {
            this.enableAutoPersistedQueries = enableAutoPersistedQueries;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public Builder<D> canBeBatched(Boolean canBeBatched) {
            this.canBeBatched = canBeBatched;
            return this;
        }

        public final Builder<D> retryOnError(Boolean retryOnError) {
            this.retryOnError = retryOnError;
            return this;
        }

        public final Builder<D> failFastIfOffline(Boolean failFastIfOffline) {
            this.failFastIfOffline = failFastIfOffline;
            return this;
        }

        public final Builder<D> sendEnhancedClientAwareness(boolean sendEnhancedClientAwareness) {
            this.sendEnhancedClientAwareness = sendEnhancedClientAwareness;
            return this;
        }

        public final ApolloRequest<D> build() {
            Operation<D> operation = this.operation;
            UUID uuid = this.requestUuid;
            if (uuid == null) {
                uuid = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
            }
            return new ApolloRequest<>(operation, uuid, getExecutionContext(), getHttpMethod(), getHttpHeaders(), getSendApqExtensions(), getSendDocument(), getEnableAutoPersistedQueries(), getCanBeBatched(), this.ignoreApolloClientHttpHeaders, this.retryOnError, this.failFastIfOffline, this.sendEnhancedClientAwareness, null);
        }
    }
}
