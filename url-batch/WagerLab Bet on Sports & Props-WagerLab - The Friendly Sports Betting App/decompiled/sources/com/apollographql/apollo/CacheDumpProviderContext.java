package com.apollographql.apollo;

import com.apollographql.apollo.api.ExecutionContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheDumpProviderContext.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011BG\u0012>\u0010\u0002\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u0005\u0012*\u0012(\u0012\u0004\u0012\u00020\u0005\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00040\u00060\u00040\u00040\u0003¢\u0006\u0004\b\t\u0010\nRI\u0010\u0002\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u0005\u0012*\u0012(\u0012\u0004\u0012\u00020\u0005\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00040\u00060\u00040\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/CacheDumpProviderContext;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "cacheDumpProvider", "Lkotlin/Function0;", "", "", "Lkotlin/Pair;", "", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getCacheDumpProvider", "()Lkotlin/jvm/functions/Function0;", "key", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Key", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheDumpProviderContext implements ExecutionContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function0<Map<String, Map<String, Pair<Integer, Map<String, Object>>>>> cacheDumpProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public CacheDumpProviderContext(Function0<? extends Map<String, ? extends Map<String, ? extends Pair<Integer, ? extends Map<String, ? extends Object>>>>> cacheDumpProvider) {
        Intrinsics.checkNotNullParameter(cacheDumpProvider, "cacheDumpProvider");
        this.cacheDumpProvider = cacheDumpProvider;
    }

    public final Function0<Map<String, Map<String, Pair<Integer, Map<String, Object>>>>> getCacheDumpProvider() {
        return this.cacheDumpProvider;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public ExecutionContext.Key<?> getKey() {
        return INSTANCE;
    }

    /* compiled from: CacheDumpProviderContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/CacheDumpProviderContext$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/CacheDumpProviderContext;", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.apollographql.apollo.CacheDumpProviderContext$Key, reason: from kotlin metadata */
    public static final class Companion implements ExecutionContext.Key<CacheDumpProviderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
