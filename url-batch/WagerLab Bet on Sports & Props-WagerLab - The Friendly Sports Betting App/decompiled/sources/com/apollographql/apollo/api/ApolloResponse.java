package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.exception.NoDataException;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ApolloResponse.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001 Bm\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001c\u001a\u00020\u0015J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "", "requestUuid", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "operation", "Lcom/apollographql/apollo/api/Operation;", "data", "errors", "", "Lcom/apollographql/apollo/api/Error;", NotificationsService.EXCEPTION_KEY, "Lcom/apollographql/apollo/exception/ApolloException;", "extensions", "", "", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "isLast", "", "<init>", "(Ljava/util/UUID;Lcom/apollographql/apollo/api/Operation;Lcom/apollographql/apollo/api/Operation$Data;Ljava/util/List;Lcom/apollographql/apollo/exception/ApolloException;Ljava/util/Map;Lcom/apollographql/apollo/api/ExecutionContext;Z)V", "Lcom/apollographql/apollo/api/Operation$Data;", "dataAssertNoErrors", "()Lcom/apollographql/apollo/api/Operation$Data;", "dataOrThrow", "hasErrors", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/api/ApolloResponse$Builder;", InAppPurchaseConstants.METHOD_TO_STRING, "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApolloResponse<D extends Operation.Data> {
    public final D data;
    public final List<Error> errors;
    public final ApolloException exception;
    public final ExecutionContext executionContext;
    public final Map<String, Object> extensions;
    public final boolean isLast;
    public final Operation<D> operation;
    public final UUID requestUuid;

    public /* synthetic */ ApolloResponse(UUID uuid, Operation operation, Operation.Data data, List list, ApolloException apolloException, Map map, ExecutionContext executionContext, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, operation, data, list, apolloException, map, executionContext, z);
    }

    private ApolloResponse(UUID uuid, Operation<D> operation, D d, List<Error> list, ApolloException apolloException, Map<String, ? extends Object> map, ExecutionContext executionContext, boolean z) {
        this.requestUuid = uuid;
        this.operation = operation;
        this.data = d;
        this.errors = list;
        this.exception = apolloException;
        this.extensions = map;
        this.executionContext = executionContext;
        this.isLast = z;
    }

    public final D dataAssertNoErrors() {
        if (hasErrors()) {
            List<Error> list = this.errors;
            Intrinsics.checkNotNull(list);
            throw new ApolloGraphQLException((Error) CollectionsKt.first((List) list));
        }
        if (this.exception != null) {
            throw new DefaultApolloException("An exception happened", this.exception);
        }
        return dataOrThrow();
    }

    public final D dataOrThrow() {
        D d = this.data;
        if (d != null) {
            return d;
        }
        throw new NoDataException(this.exception);
    }

    public final boolean hasErrors() {
        List<Error> list = this.errors;
        return !(list == null || list.isEmpty());
    }

    public final Builder<D> newBuilder() {
        return new Builder(this.operation, this.requestUuid, this.data, this.errors, this.extensions, this.exception).addExecutionContext(this.executionContext).isLast(this.isLast);
    }

    public String toString() {
        String str = "null";
        StringBuilder append = new StringBuilder("ApolloResponse(operationName=").append(this.operation.name()).append(", data=").append(this.data == null ? "null" : this.operation.name() + ".Data").append(", errors=");
        List<Error> list = this.errors;
        StringBuilder append2 = append.append(list != null ? Integer.valueOf(list.size()) : "null").append(", exception=");
        ApolloException apolloException = this.exception;
        if (apolloException != null && (str = Reflection.getOrCreateKotlinClass(apolloException.getClass()).getSimpleName()) == null) {
            str = "true";
        }
        return append2.append(str).append(')').toString();
    }

    /* compiled from: ApolloResponse.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B_\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0012\u0010\u0014B-\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u001cJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/apollographql/apollo/api/ApolloResponse$Builder;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "", "operation", "Lcom/apollographql/apollo/api/Operation;", "requestUuid", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "data", "errors", "", "Lcom/apollographql/apollo/api/Error;", "extensions", "", "", NotificationsService.EXCEPTION_KEY, "Lcom/apollographql/apollo/exception/ApolloException;", "<init>", "(Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;Lcom/apollographql/apollo/api/Operation$Data;Ljava/util/List;Ljava/util/Map;Lcom/apollographql/apollo/exception/ApolloException;)V", "(Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;)V", "(Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;Lcom/apollographql/apollo/api/Operation$Data;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "isLast", "", "addExecutionContext", "(Lcom/apollographql/apollo/api/Operation$Data;)Lcom/apollographql/apollo/api/ApolloResponse$Builder;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/ApolloResponse;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder<D extends Operation.Data> {
        private D data;
        private List<Error> errors;
        private ApolloException exception;
        private ExecutionContext executionContext;
        private Map<String, ? extends Object> extensions;
        private boolean isLast;
        private final Operation<D> operation;
        private UUID requestUuid;

        public Builder(Operation<D> operation, UUID requestUuid, D d, List<Error> list, Map<String, ? extends Object> map, ApolloException apolloException) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
            this.operation = operation;
            this.requestUuid = requestUuid;
            this.data = d;
            this.errors = list;
            this.extensions = map;
            this.exception = apolloException;
            this.executionContext = ExecutionContext.Empty;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Operation<D> operation, UUID requestUuid) {
            this(operation, requestUuid, null, null, null, null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated(message = "Use 2 params constructor instead", replaceWith = @ReplaceWith(expression = "Builder(operation = operation, requestUuid = requestUuid).data(data = data)", imports = {}))
        public Builder(Operation<D> operation, UUID requestUuid, D d) {
            this(operation, requestUuid, d, null, null, null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
        }

        public final Builder<D> addExecutionContext(ExecutionContext executionContext) {
            Intrinsics.checkNotNullParameter(executionContext, "executionContext");
            this.executionContext = this.executionContext.plus(executionContext);
            return this;
        }

        public final Builder<D> data(D data) {
            this.data = data;
            return this;
        }

        public final Builder<D> errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        public final Builder<D> exception(ApolloException exception) {
            this.exception = exception;
            return this;
        }

        public final Builder<D> extensions(Map<String, ? extends Object> extensions) {
            this.extensions = extensions;
            return this;
        }

        public final Builder<D> requestUuid(UUID requestUuid) {
            Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }

        public final Builder<D> isLast(boolean isLast) {
            this.isLast = isLast;
            return this;
        }

        public final ApolloResponse<D> build() {
            Operation<D> operation = this.operation;
            UUID uuid = this.requestUuid;
            D d = this.data;
            ExecutionContext executionContext = this.executionContext;
            Map<String, ? extends Object> map = this.extensions;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            return new ApolloResponse<>(uuid, operation, d, this.errors, this.exception, map, executionContext, this.isLast, null);
        }
    }
}
