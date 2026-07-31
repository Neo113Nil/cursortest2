package com.revenuecat.purchases.storage;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.storage.DefaultFileRepository;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.NonCancellable;

/* compiled from: DefaultFileRepository.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002&'B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u001a\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\"0!H\u0016J\"\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository;", "Lcom/revenuecat/purchases/storage/FileRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$CacheKey;", "Ljava/net/URI;", "fileCacheManager", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "logHandler", "Lcom/revenuecat/purchases/LogHandler;", "urlConnectionFactory", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "(Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;Lcom/revenuecat/purchases/storage/LocalFileCache;Lkotlinx/coroutines/CoroutineScope;Lcom/revenuecat/purchases/LogHandler;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "getStore$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "downloadFile", "Lcom/revenuecat/purchases/utils/UrlConnection;", "url", "Ljava/net/URL;", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateOrGetCachedFileURL", "checksum", "Lcom/revenuecat/purchases/models/Checksum;", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFile", "prefetch", "", "urls", "", "Lkotlin/Pair;", "saveCachedFile", "uri", "connectionWithStream", "CacheKey", "Error", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultFileRepository implements FileRepository {
    private final LocalFileCache fileCacheManager;
    private final CoroutineScope ioScope;
    private final LogHandler logHandler;
    private final KeyedDeferredValueStore<CacheKey, URI> store;
    private final UrlConnectionFactory urlConnectionFactory;

    public DefaultFileRepository(KeyedDeferredValueStore<CacheKey, URI> store, LocalFileCache fileCacheManager, CoroutineScope ioScope, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(fileCacheManager, "fileCacheManager");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(logHandler, "logHandler");
        Intrinsics.checkNotNullParameter(urlConnectionFactory, "urlConnectionFactory");
        this.store = store;
        this.fileCacheManager = fileCacheManager;
        this.ioScope = ioScope;
        this.logHandler = logHandler;
        this.urlConnectionFactory = urlConnectionFactory;
    }

    public /* synthetic */ DefaultFileRepository(KeyedDeferredValueStore keyedDeferredValueStore, LocalFileCache localFileCache, CoroutineScope coroutineScope, LogHandler logHandler, DefaultUrlConnectionFactory defaultUrlConnectionFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new KeyedDeferredValueStore(null, 1, null) : keyedDeferredValueStore, localFileCache, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(NonCancellable.INSTANCE)) : coroutineScope, (i & 8) != 0 ? LogWrapperKt.getCurrentLogHandler() : logHandler, (i & 16) != 0 ? new DefaultUrlConnectionFactory() : defaultUrlConnectionFactory);
    }

    public final KeyedDeferredValueStore<CacheKey, URI> getStore$purchases_defaultsBc8Release() {
        return this.store;
    }

    /* compiled from: DefaultFileRepository.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$CacheKey;", "", "url", "Ljava/net/URL;", "checksum", "Lcom/revenuecat/purchases/models/Checksum;", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)V", "getChecksum", "()Lcom/revenuecat/purchases/models/Checksum;", "getUrl", "()Ljava/net/URL;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CacheKey {
        private final Checksum checksum;
        private final URL url;

        public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, URL url, Checksum checksum, int i, Object obj) {
            if ((i & 1) != 0) {
                url = cacheKey.url;
            }
            if ((i & 2) != 0) {
                checksum = cacheKey.checksum;
            }
            return cacheKey.copy(url, checksum);
        }

        /* renamed from: component1, reason: from getter */
        public final URL getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final Checksum getChecksum() {
            return this.checksum;
        }

        public final CacheKey copy(URL url, Checksum checksum) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new CacheKey(url, checksum);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return Intrinsics.areEqual(this.url, cacheKey.url) && Intrinsics.areEqual(this.checksum, cacheKey.checksum);
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            Checksum checksum = this.checksum;
            return hashCode + (checksum == null ? 0 : checksum.hashCode());
        }

        public String toString() {
            return "CacheKey(url=" + this.url + ", checksum=" + this.checksum + ')';
        }

        public CacheKey(URL url, Checksum checksum) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.checksum = checksum;
        }

        public final URL getUrl() {
            return this.url;
        }

        public final Checksum getChecksum() {
            return this.checksum;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFileRepository(Context context) {
        this(null, new DefaultFileCache(context), null, null, null, 29, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revenuecat.purchases.storage.FileRepository
    public void prefetch(List<Pair<URL, Checksum>> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        BuildersKt__Builders_commonKt.launch$default(this.ioScope, null, null, new DefaultFileRepository$prefetch$1(urls, this, null), 3, null);
    }

    @Override // com.revenuecat.purchases.storage.FileRepository
    public Object generateOrGetCachedFileURL(final URL url, final Checksum checksum, Continuation<? super URI> continuation) {
        return this.store.getOrPut(new CacheKey(url, checksum), new Function0<Deferred<? extends URI>>() { // from class: com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* compiled from: DefaultFileRepository.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Ljava/net/URI;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2$1", f = "DefaultFileRepository.kt", i = {0}, l = {118}, m = "invokeSuspend", n = {"cachedUri"}, s = {"L$0"})
            /* renamed from: com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super URI>, Object> {
                final /* synthetic */ Checksum $checksum;
                final /* synthetic */ URL $url;
                Object L$0;
                int label;
                final /* synthetic */ DefaultFileRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DefaultFileRepository defaultFileRepository, URL url, Checksum checksum, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = defaultFileRepository;
                    this.$url = url;
                    this.$checksum = checksum;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$url, this.$checksum, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super URI> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    LocalFileCache localFileCache;
                    LogHandler logHandler;
                    LocalFileCache localFileCache2;
                    Object downloadFile;
                    URI uri;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        localFileCache = this.this$0.fileCacheManager;
                        URI generateLocalFilesystemURI = localFileCache.generateLocalFilesystemURI(this.$url, this.$checksum);
                        if (generateLocalFilesystemURI != null) {
                            localFileCache2 = this.this$0.fileCacheManager;
                            if (localFileCache2.cachedContentExists(generateLocalFilesystemURI)) {
                                return generateLocalFilesystemURI;
                            }
                            this.L$0 = generateLocalFilesystemURI;
                            this.label = 1;
                            downloadFile = this.this$0.downloadFile(this.$url, this);
                            if (downloadFile == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            uri = generateLocalFilesystemURI;
                            obj = downloadFile;
                        } else {
                            String url = this.$url.toString();
                            Intrinsics.checkNotNullExpressionValue(url, "url.toString()");
                            DefaultFileRepository.Error.FailedToCreateCacheDirectory failedToCreateCacheDirectory = new DefaultFileRepository.Error.FailedToCreateCacheDirectory(url);
                            logHandler = this.this$0.logHandler;
                            logHandler.e("FileRepository", "Failed to create cache directory for " + this.$url, failedToCreateCacheDirectory);
                            throw failedToCreateCacheDirectory;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uri = (URI) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.saveCachedFile(uri, (UrlConnection) obj, this.$checksum);
                    return uri;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final Deferred<? extends URI> invoke() {
                CoroutineScope coroutineScope;
                Deferred<? extends URI> async$default;
                coroutineScope = DefaultFileRepository.this.ioScope;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(DefaultFileRepository.this, url, checksum, null), 3, null);
                return async$default;
            }
        }).await(continuation);
    }

    @Override // com.revenuecat.purchases.storage.FileRepository
    public URI getFile(URL url, Checksum checksum) {
        Intrinsics.checkNotNullParameter(url, "url");
        URI generateLocalFilesystemURI = this.fileCacheManager.generateLocalFilesystemURI(url, checksum);
        if (generateLocalFilesystemURI == null || !this.fileCacheManager.cachedContentExists(generateLocalFilesystemURI)) {
            return null;
        }
        return generateLocalFilesystemURI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadFile(URL url, Continuation<? super UrlConnection> continuation) {
        DefaultFileRepository$downloadFile$1 defaultFileRepository$downloadFile$1;
        int i;
        DefaultFileRepository defaultFileRepository;
        if (continuation instanceof DefaultFileRepository$downloadFile$1) {
            defaultFileRepository$downloadFile$1 = (DefaultFileRepository$downloadFile$1) continuation;
            if ((defaultFileRepository$downloadFile$1.label & Integer.MIN_VALUE) != 0) {
                defaultFileRepository$downloadFile$1.label -= Integer.MIN_VALUE;
                Object obj = defaultFileRepository$downloadFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultFileRepository$downloadFile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        DefaultFileRepository$downloadFile$2 defaultFileRepository$downloadFile$2 = new DefaultFileRepository$downloadFile$2(this, url, null);
                        defaultFileRepository$downloadFile$1.L$0 = this;
                        defaultFileRepository$downloadFile$1.L$1 = url;
                        defaultFileRepository$downloadFile$1.label = 1;
                        obj = BuildersKt.withContext(io2, defaultFileRepository$downloadFile$2, defaultFileRepository$downloadFile$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultFileRepository = this;
                    } catch (IOException e) {
                        e = e;
                        defaultFileRepository = this;
                        String str = "Failed to fetch file from remote source: " + url + ". Error: " + e.getLocalizedMessage();
                        defaultFileRepository.logHandler.e("FileRepository", str, e);
                        throw new Error.FailedToFetchFileFromRemoteSource(str);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (URL) defaultFileRepository$downloadFile$1.L$1;
                    defaultFileRepository = (DefaultFileRepository) defaultFileRepository$downloadFile$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (IOException e2) {
                        e = e2;
                        String str2 = "Failed to fetch file from remote source: " + url + ". Error: " + e.getLocalizedMessage();
                        defaultFileRepository.logHandler.e("FileRepository", str2, e);
                        throw new Error.FailedToFetchFileFromRemoteSource(str2);
                    }
                }
                return (UrlConnection) obj;
            }
        }
        defaultFileRepository$downloadFile$1 = new DefaultFileRepository$downloadFile$1(this, continuation);
        Object obj2 = defaultFileRepository$downloadFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultFileRepository$downloadFile$1.label;
        if (i != 0) {
        }
        return (UrlConnection) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveCachedFile(URI uri, UrlConnection connectionWithStream, Checksum checksum) {
        try {
            try {
                InputStream inputStream = connectionWithStream.getInputStream();
                try {
                    this.fileCacheManager.saveData(inputStream, uri, checksum);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStream, null);
                } finally {
                }
            } finally {
                connectionWithStream.disconnect();
            }
        } catch (Checksum.ChecksumValidationException e) {
            String str = "Checksum validation failed for " + uri + ": " + e.getMessage();
            this.logHandler.e("FileRepository", str, e);
            throw new Error.ChecksumValidationFailed(str);
        } catch (IOException e2) {
            String str2 = "Failed to save cached file: " + uri + ". Error: " + e2.getLocalizedMessage();
            this.logHandler.e("FileRepository", str2, e2);
            throw new Error.FailedToSaveCachedFile(str2);
        }
    }

    /* compiled from: DefaultFileRepository.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "Ljava/io/IOException;", "message", "", "(Ljava/lang/String;)V", "ChecksumValidationFailed", "FailedToCreateCacheDirectory", "FailedToFetchFileFromRemoteSource", "FailedToSaveCachedFile", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$ChecksumValidationFailed;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToCreateCacheDirectory;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToSaveCachedFile;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Error extends IOException {
        public /* synthetic */ Error(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Error(String str) {
            super(str);
        }

        /* compiled from: DefaultFileRepository.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToCreateCacheDirectory;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "url", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToCreateCacheDirectory extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToCreateCacheDirectory(String url) {
                super("Failed to create cache directory for " + url, null);
                Intrinsics.checkNotNullParameter(url, "url");
            }
        }

        /* compiled from: DefaultFileRepository.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToSaveCachedFile;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToSaveCachedFile extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToSaveCachedFile(String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        /* compiled from: DefaultFileRepository.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToFetchFileFromRemoteSource extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailedToFetchFileFromRemoteSource(String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        /* compiled from: DefaultFileRepository.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$ChecksumValidationFailed;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ChecksumValidationFailed extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChecksumValidationFailed(String message) {
                super(message, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }
    }
}
