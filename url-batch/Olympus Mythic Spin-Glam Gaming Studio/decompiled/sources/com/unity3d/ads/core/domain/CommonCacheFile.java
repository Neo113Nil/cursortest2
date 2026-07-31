package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource$Monotonic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: CommonCacheFile.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jf\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2*\u0010\u0016\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0011H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCacheFile;", "Lcom/unity3d/ads/core/domain/CacheFile;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "cacheRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "", "url", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommonCacheFile implements CacheFile {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(@NotNull CacheRepository cacheRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull AdObject adObject, @Nullable JSONArray jSONArray, int i, int i2, @Nullable Function3 function3, @NotNull Continuation continuation) {
        CommonCacheFile$invoke$1 commonCacheFile$invoke$1;
        int i3;
        AdObject adObject2;
        long j;
        CacheResult cacheResult;
        String str2;
        if (continuation instanceof CommonCacheFile$invoke$1) {
            commonCacheFile$invoke$1 = (CommonCacheFile$invoke$1) continuation;
            int i4 = commonCacheFile$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                commonCacheFile$invoke$1.label = i4 - Integer.MIN_VALUE;
                CommonCacheFile$invoke$1 commonCacheFile$invoke$12 = commonCacheFile$invoke$1;
                Object obj = commonCacheFile$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = commonCacheFile$invoke$12.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                    CacheRepository cacheRepository = this.cacheRepository;
                    commonCacheFile$invoke$12.L$0 = adObject;
                    commonCacheFile$invoke$12.J$0 = m8186markNowz9LOYto;
                    commonCacheFile$invoke$12.label = 1;
                    Object file = cacheRepository.getFile(str, jSONArray, i, i2, function3, commonCacheFile$invoke$12);
                    if (file == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adObject2 = adObject;
                    obj = file;
                    j = m8186markNowz9LOYto;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonCacheFile$invoke$12.J$0;
                    AdObject adObject3 = (AdObject) commonCacheFile$invoke$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    adObject2 = adObject3;
                }
                cacheResult = (CacheResult) obj;
                if (!(cacheResult instanceof CacheResult.Success)) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME;
                    Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                    CacheResult.Success success = (CacheResult.Success) cacheResult;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, MapsKt.mapOf(TuplesKt.to("cache_source", success.getSource().toString()), TuplesKt.to("protocol", success.getCachedFile().getProtocol())), MapsKt.mapOf(TuplesKt.to("size_kb", Boxing.boxInt((int) (success.getCachedFile().getContentLength() / 1024)))), adObject2, (Integer) null, (ByteString) null, 96, (Object) null);
                } else {
                    if (!(cacheResult instanceof CacheResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME;
                    Double boxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                    CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
                    Pair pair = TuplesKt.to("cache_source", failure.getSource().toString());
                    Pair pair2 = TuplesKt.to("reason", failure.getError().toString());
                    Throwable reason = failure.getReason();
                    if (reason == null || (str2 = reason.getMessage()) == null) {
                        str2 = "";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, boxDouble2, MapsKt.mapOf(pair, pair2, TuplesKt.to("reason_debug", str2)), (Map) null, adObject2, (Integer) null, (ByteString) null, 104, (Object) null);
                }
                return cacheResult;
            }
        }
        commonCacheFile$invoke$1 = new CommonCacheFile$invoke$1(this, continuation);
        CommonCacheFile$invoke$1 commonCacheFile$invoke$122 = commonCacheFile$invoke$1;
        Object obj2 = commonCacheFile$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = commonCacheFile$invoke$122.label;
        if (i3 != 0) {
        }
        cacheResult = (CacheResult) obj2;
        if (!(cacheResult instanceof CacheResult.Success)) {
        }
        return cacheResult;
    }
}
