package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "bytesDownloaded", "", "totalBytes"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1", f = "CommonAdViewerExposedFunctions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 extends SuspendLambda implements Function3 {
    final /* synthetic */ ProducerScope $$this$channelFlow;
    final /* synthetic */ String $downloadId;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(ProducerScope producerScope, String str, Continuation continuation) {
        super(3, continuation);
        this.$$this$channelFlow = producerScope;
        this.$downloadId = str;
    }

    public final Object invoke(long j, long j2, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(this.$$this$channelFlow, this.$downloadId, continuation);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$0 = j;
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$1 = j2;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (Continuation) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long j = this.J$0;
        long j2 = this.J$1;
        Integer boxInt = j2 > 0 ? Boxing.boxInt(RangesKt.coerceIn((int) ((100 * j) / j2), 0, 100)) : null;
        ProducerScope producerScope = this.$$this$channelFlow;
        String str = this.$downloadId;
        Long boxLong = Boxing.boxLong(j2);
        String lowerCase = "REMOTE".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        producerScope.mo8216trySendJP2dKIU(new OnDownloadProgressEvent(str, boxInt, j, boxLong, false, null, lowerCase));
        return Unit.INSTANCE;
    }
}
