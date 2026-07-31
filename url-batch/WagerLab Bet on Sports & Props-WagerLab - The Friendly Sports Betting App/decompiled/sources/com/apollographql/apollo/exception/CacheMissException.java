package com.apollographql.apollo.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/exception/CacheMissException;", "Lcom/apollographql/apollo/exception/ApolloException;", "key", "", "fieldName", "stale", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getFieldName", "getStale$annotations", "()V", "getStale", "()Z", "Companion", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheMissException extends ApolloException {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fieldName;
    private final String key;
    private final boolean stale;

    public static /* synthetic */ void getStale$annotations() {
    }

    public /* synthetic */ CacheMissException(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheMissException(String key, String str, boolean z) {
        super(INSTANCE.message$apollo_api(key, str, z), null, 2, null);
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.fieldName = str;
        this.stale = z;
    }

    public final boolean getStale() {
        return this.stale;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CacheMissException(String key, String str) {
        this(key, str, false);
        Intrinsics.checkNotNullParameter(key, "key");
    }

    /* compiled from: Exceptions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/exception/CacheMissException$Companion;", "", "<init>", "()V", "message", "", "cacheKey", "fieldKey", "stale", "", "message$apollo_api", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String message$apollo_api(String cacheKey, String fieldKey, boolean stale) {
            if (fieldKey == null) {
                return "Object '" + cacheKey + "' not found";
            }
            if (stale) {
                return "Field '" + fieldKey + "' on object '" + cacheKey + "' is stale";
            }
            return "Object '" + cacheKey + "' has no field named '" + fieldKey + '\'';
        }
    }
}
