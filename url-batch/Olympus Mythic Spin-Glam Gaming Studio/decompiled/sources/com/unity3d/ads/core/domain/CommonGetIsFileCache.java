package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.TimeSource$Monotonic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetIsFileCache.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096B¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetIsFileCache;", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getAssetFileName", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "invoke", "", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final GetAssetFileName getAssetFileName;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetIsFileCache(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetAssetFileName getAssetFileName) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getAssetFileName, "getAssetFileName");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull Continuation continuation) {
        CommonGetIsFileCache$invoke$1 commonGetIsFileCache$invoke$1;
        int i;
        long j;
        if (continuation instanceof CommonGetIsFileCache$invoke$1) {
            commonGetIsFileCache$invoke$1 = (CommonGetIsFileCache$invoke$1) continuation;
            int i2 = commonGetIsFileCache$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGetIsFileCache$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonGetIsFileCache$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGetIsFileCache$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    String invoke = this.sessionRepository.getFeatureFlags().getDisableCustomScheme() ? this.getAssetFileName.invoke(str) : StringsKt.substringAfterLast$default(str, "/", (String) null, 2, (Object) null);
                    CacheRepository cacheRepository = this.cacheRepository;
                    commonGetIsFileCache$invoke$1.J$0 = m8186markNowz9LOYto;
                    commonGetIsFileCache$invoke$1.label = 1;
                    obj = cacheRepository.doesFileExist(invoke, commonGetIsFileCache$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = m8186markNowz9LOYto;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonGetIsFileCache$invoke$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !booleanValue ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                return Boxing.boxBoolean(booleanValue);
            }
        }
        commonGetIsFileCache$invoke$1 = new CommonGetIsFileCache$invoke$1(this, continuation);
        Object obj2 = commonGetIsFileCache$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGetIsFileCache$invoke$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !booleanValue2 ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
        return Boxing.boxBoolean(booleanValue2);
    }
}
