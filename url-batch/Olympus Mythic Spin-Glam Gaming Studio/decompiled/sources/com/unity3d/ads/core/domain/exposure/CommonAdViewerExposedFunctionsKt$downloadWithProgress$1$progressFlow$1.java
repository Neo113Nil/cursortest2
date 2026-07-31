package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.domain.CacheFile;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import org.json.JSONArray;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/unity3d/ads/adplayer/model/OnDownloadProgressEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1", f = "CommonAdViewerExposedFunctions.kt", l = {368, 376, 380}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ String $downloadId;
    final /* synthetic */ JSONArray $headers;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i, int i2, String str2, Continuation continuation) {
        super(2, continuation);
        this.$cacheFile = cacheFile;
        this.$url = str;
        this.$adObject = adObject;
        this.$headers = jSONArray;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$downloadId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(this.$cacheFile, this.$url, this.$adObject, this.$headers, this.$priority, this.$intervalMs, this.$downloadId, continuation);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1.L$0 = obj;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope producerScope, Continuation continuation) {
        return ((CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        Object invoke;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            producerScope = (ProducerScope) this.L$0;
            CacheFile cacheFile = this.$cacheFile;
            String str = this.$url;
            Intrinsics.checkNotNull(str);
            AdObject adObject = this.$adObject;
            JSONArray jSONArray = this.$headers;
            int i2 = this.$priority;
            int i3 = this.$intervalMs;
            CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(producerScope, this.$downloadId, null);
            this.L$0 = producerScope;
            this.label = 1;
            invoke = cacheFile.invoke(str, adObject, jSONArray, i2, i3, commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ProducerScope producerScope2 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            producerScope = producerScope2;
            invoke = obj;
        }
        CacheResult cacheResult = (CacheResult) invoke;
        if (cacheResult instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            String lowerCase = success.getSource().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            OnDownloadProgressEvent onDownloadProgressEvent = new OnDownloadProgressEvent(this.$downloadId, Boxing.boxInt(100), success.getSource() == CacheSource.LOCAL ? 0L : success.getCachedFile().getContentLength(), Boxing.boxLong(success.getCachedFile().getContentLength()), true, null, lowerCase);
            this.L$0 = null;
            this.label = 2;
            if (producerScope.send(onDownloadProgressEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(cacheResult instanceof CacheResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            String lowerCase2 = failure.getSource().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            OnDownloadProgressEvent onDownloadProgressEvent2 = new OnDownloadProgressEvent(this.$downloadId, null, 0L, null, true, failure.getError().name(), lowerCase2);
            this.L$0 = null;
            this.label = 3;
            if (producerScope.send(onDownloadProgressEvent2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
