package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidCacheWebViewAssets.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096B¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheWebViewAssets;", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "_cached", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/io/File;", "cached", "", "getCached", "()Ljava/util/Map;", "invoke", "", "webviewConfiguration", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "forceDownload", "", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "warmFromDisk", "config", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilename", "url", "type", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {

    @NotNull
    private final ConcurrentHashMap<String, File> _cached;

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidCacheWebViewAssets(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @NotNull
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e2 -> B:11:0x00e5). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull WebViewConfiguration webViewConfiguration, boolean z, @NotNull Continuation continuation) {
        AndroidCacheWebViewAssets$invoke$1 androidCacheWebViewAssets$invoke$1;
        int i;
        WebViewConfiguration webViewConfiguration2;
        boolean z2;
        Iterator it;
        CacheResult cacheResult;
        if (continuation instanceof AndroidCacheWebViewAssets$invoke$1) {
            androidCacheWebViewAssets$invoke$1 = (AndroidCacheWebViewAssets$invoke$1) continuation;
            int i2 = androidCacheWebViewAssets$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheWebViewAssets$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidCacheWebViewAssets$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching()) {
                        return Unit.INSTANCE;
                    }
                    if (webViewConfiguration.getEntryPoint().length() > 0) {
                        CacheRepository cacheRepository = this.cacheRepository;
                        String entryPoint = webViewConfiguration.getEntryPoint();
                        String type = webViewConfiguration.getType();
                        androidCacheWebViewAssets$invoke$1.L$0 = webViewConfiguration;
                        androidCacheWebViewAssets$invoke$1.Z$0 = z;
                        androidCacheWebViewAssets$invoke$1.label = 1;
                        obj = cacheRepository.getWebviewFile(entryPoint, type, z, androidCacheWebViewAssets$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Iterator it2 = webViewConfiguration.getAdditionalFiles().iterator();
                    webViewConfiguration2 = webViewConfiguration;
                    z2 = z;
                    it = it2;
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = androidCacheWebViewAssets$invoke$1.Z$0;
                    String str = (String) androidCacheWebViewAssets$invoke$1.L$2;
                    it = (Iterator) androidCacheWebViewAssets$invoke$1.L$1;
                    webViewConfiguration2 = (WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    CacheResult cacheResult2 = (CacheResult) obj;
                    if (cacheResult2 instanceof CacheResult.Success) {
                        CacheResult.Success success = (CacheResult.Success) cacheResult2;
                        if (success.getCachedFile().getFile() != null) {
                            this._cached.put(getFilename(str, webViewConfiguration2.getType()), success.getCachedFile().getFile());
                        }
                    }
                    while (it.hasNext()) {
                        str = (String) it.next();
                        if (str.length() > 0) {
                            CacheRepository cacheRepository2 = this.cacheRepository;
                            String type2 = webViewConfiguration2.getType();
                            androidCacheWebViewAssets$invoke$1.L$0 = webViewConfiguration2;
                            androidCacheWebViewAssets$invoke$1.L$1 = it;
                            androidCacheWebViewAssets$invoke$1.L$2 = str;
                            androidCacheWebViewAssets$invoke$1.Z$0 = z2;
                            androidCacheWebViewAssets$invoke$1.label = 2;
                            obj = cacheRepository2.getWebviewFile(str, type2, z2, androidCacheWebViewAssets$invoke$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            CacheResult cacheResult22 = (CacheResult) obj;
                            if (cacheResult22 instanceof CacheResult.Success) {
                            }
                            while (it.hasNext()) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                z = androidCacheWebViewAssets$invoke$1.Z$0;
                webViewConfiguration = (WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                cacheResult = (CacheResult) obj;
                if (cacheResult instanceof CacheResult.Success) {
                    CacheResult.Success success2 = (CacheResult.Success) cacheResult;
                    if (success2.getCachedFile().getFile() != null) {
                        this._cached.put(getFilename(webViewConfiguration.getEntryPoint(), webViewConfiguration.getType()), success2.getCachedFile().getFile());
                    }
                }
                Iterator it22 = webViewConfiguration.getAdditionalFiles().iterator();
                webViewConfiguration2 = webViewConfiguration;
                z2 = z;
                it = it22;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        androidCacheWebViewAssets$invoke$1 = new AndroidCacheWebViewAssets$invoke$1(this, continuation);
        Object obj2 = androidCacheWebViewAssets$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidCacheWebViewAssets$invoke$1.label;
        if (i != 0) {
        }
        cacheResult = (CacheResult) obj2;
        if (cacheResult instanceof CacheResult.Success) {
        }
        Iterator it222 = webViewConfiguration.getAdditionalFiles().iterator();
        webViewConfiguration2 = webViewConfiguration;
        z2 = z;
        it = it222;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c9 -> B:10:0x00cd). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object warmFromDisk(@NotNull WebViewConfiguration webViewConfiguration, @NotNull Continuation continuation) {
        AndroidCacheWebViewAssets$warmFromDisk$1 androidCacheWebViewAssets$warmFromDisk$1;
        int i;
        Iterator it;
        CachedFile cachedFile;
        if (continuation instanceof AndroidCacheWebViewAssets$warmFromDisk$1) {
            androidCacheWebViewAssets$warmFromDisk$1 = (AndroidCacheWebViewAssets$warmFromDisk$1) continuation;
            int i2 = androidCacheWebViewAssets$warmFromDisk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$warmFromDisk$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheWebViewAssets$warmFromDisk$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidCacheWebViewAssets$warmFromDisk$1.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching() || webViewConfiguration.getEntryPoint().length() == 0) {
                        return Boxing.boxBoolean(false);
                    }
                    List listOf = CollectionsKt.listOf(webViewConfiguration.getEntryPoint());
                    List<String> additionalFiles = webViewConfiguration.getAdditionalFiles();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : additionalFiles) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    List plus = CollectionsKt.plus((Collection) listOf, (Iterable) arrayList);
                    if (!(plus instanceof Collection) || !plus.isEmpty()) {
                        it = plus.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    z = true;
                    return Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) androidCacheWebViewAssets$warmFromDisk$1.L$2;
                it = (Iterator) androidCacheWebViewAssets$warmFromDisk$1.L$1;
                WebViewConfiguration webViewConfiguration2 = (WebViewConfiguration) androidCacheWebViewAssets$warmFromDisk$1.L$0;
                ResultKt.throwOnFailure(obj);
                File file = null;
                CacheResult.Success success = !(obj instanceof CacheResult.Success) ? (CacheResult.Success) obj : null;
                File file2 = (success != null || (cachedFile = success.getCachedFile()) == null) ? null : cachedFile.getFile();
                if (file2 != null) {
                    this._cached.put(getFilename(str, webViewConfiguration2.getType()), file2);
                    file = file2;
                }
                if (file != null) {
                    webViewConfiguration = webViewConfiguration2;
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        CacheRepository cacheRepository = this.cacheRepository;
                        String type = webViewConfiguration.getType();
                        androidCacheWebViewAssets$warmFromDisk$1.L$0 = webViewConfiguration;
                        androidCacheWebViewAssets$warmFromDisk$1.L$1 = it;
                        androidCacheWebViewAssets$warmFromDisk$1.L$2 = str2;
                        androidCacheWebViewAssets$warmFromDisk$1.label = 1;
                        Object webviewFileFromDisk = cacheRepository.getWebviewFileFromDisk(str2, type, androidCacheWebViewAssets$warmFromDisk$1);
                        if (webviewFileFromDisk == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        webViewConfiguration2 = webViewConfiguration;
                        str = str2;
                        obj = webviewFileFromDisk;
                        File file3 = null;
                        if (!(obj instanceof CacheResult.Success)) {
                        }
                        if (success != null) {
                        }
                        if (file2 != null) {
                        }
                        if (file3 != null) {
                        }
                    }
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
        }
        androidCacheWebViewAssets$warmFromDisk$1 = new AndroidCacheWebViewAssets$warmFromDisk$1(this, continuation);
        Object obj3 = androidCacheWebViewAssets$warmFromDisk$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidCacheWebViewAssets$warmFromDisk$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
    }

    private final String getFilename(String url, String type) {
        return type + '/' + StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(url, '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null);
    }
}
