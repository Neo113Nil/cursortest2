package io.bidmachine.util.cache;

import android.os.SystemClock;
import com.pubmatic.sdk.video.POBVastError;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.download.DownloadManager;
import io.bidmachine.util.log.LoggerInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/bidmachine/util/cache/MediaFileCacheManager$RemoteMediaFileInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$pickRemoteMediaFile$2", f = "MediaFileCacheManager.kt", l = {POBVastError.NO_VAST_RESPONSE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$pickRemoteMediaFile$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ MediaFileCacheManager.Configuration $configuration;
    final /* synthetic */ List<String> $mediaUrlList;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaFileCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$pickRemoteMediaFile$2(MediaFileCacheManager mediaFileCacheManager, MediaFileCacheManager.Configuration configuration, List<String> list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mediaFileCacheManager;
        this.$configuration = configuration;
        this.$mediaUrlList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        MediaFileCacheManager$pickRemoteMediaFile$2 mediaFileCacheManager$pickRemoteMediaFile$2 = new MediaFileCacheManager$pickRemoteMediaFile$2(this.this$0, this.$configuration, this.$mediaUrlList, continuation);
        mediaFileCacheManager$pickRemoteMediaFile$2.L$0 = obj;
        return mediaFileCacheManager$pickRemoteMediaFile$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$pickRemoteMediaFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LoggerInstance loggerInstance;
        long j;
        Object awaitAll;
        MediaFileCacheManager.DownloadPolicy downloadPolicy;
        Deferred async$default;
        LoggerInstance loggerInstance2;
        MediaFileCacheManager.RemoteMediaFileInfo m7950copyWPwdCS8;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            loggerInstance = this.this$0.logger;
            final List<String> list = this.$mediaUrlList;
            loggerInstance.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$pickRemoteMediaFile$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Start picking best file from:\n" + CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, null, 62, null);
                }
            });
            MediaFileCacheManager.DownloadPolicy downloadPolicy2 = this.$configuration.getPolicyConfiguration().getDownloadPolicy();
            long headRequestTimeout = this.$configuration.getConnectionConfiguration().getHeadRequestTimeout();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            List<String> list2 = this.$mediaUrlList;
            MediaFileCacheManager mediaFileCacheManager = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1(mediaFileCacheManager, (String) it.next(), headRequestTimeout, null), 3, null);
                arrayList2.add(async$default);
                elapsedRealtime = elapsedRealtime;
                arrayList = arrayList2;
                mediaFileCacheManager = mediaFileCacheManager;
                coroutine_suspended = coroutine_suspended;
            }
            Object obj2 = coroutine_suspended;
            j = elapsedRealtime;
            this.L$0 = downloadPolicy2;
            this.J$0 = j;
            this.label = 1;
            awaitAll = AwaitKt.awaitAll(arrayList, this);
            if (awaitAll == obj2) {
                return obj2;
            }
            downloadPolicy = downloadPolicy2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            downloadPolicy = (MediaFileCacheManager.DownloadPolicy) this.L$0;
            ResultKt.throwOnFailure(obj);
            j = j2;
            awaitAll = obj;
        }
        List<String> list3 = this.$mediaUrlList;
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj3 : (Iterable) awaitAll) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object value = ((Result) obj3).getValue();
            MediaFileCacheManager.RemoteMediaFileInfo remoteMediaFileInfo = null;
            if (Result.m8028isFailureimpl(value)) {
                value = null;
            }
            DownloadManager.CallData callData = (DownloadManager.CallData) value;
            if (callData != null) {
                String str = list3.get(i2);
                long m7965getExecutionTimeUwyO8pc = callData.m7965getExecutionTimeUwyO8pc();
                String contentType = callData.contentType();
                if (contentType == null) {
                    contentType = "";
                }
                String str2 = contentType;
                Long contentLength = callData.contentLength();
                remoteMediaFileInfo = new MediaFileCacheManager.RemoteMediaFileInfo(str, m7965getExecutionTimeUwyO8pc, str2, contentLength != null ? contentLength.longValue() : Long.MAX_VALUE, 0.0d, 16, null);
            }
            if (remoteMediaFileInfo != null) {
                arrayList3.add(remoteMediaFileInfo);
            }
            i2 = i3;
        }
        final ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            m7950copyWPwdCS8 = r8.m7950copyWPwdCS8((r18 & 1) != 0 ? r8.url : null, (r18 & 2) != 0 ? r8.pingTime : 0L, (r18 & 4) != 0 ? r8.contentType : null, (r18 & 8) != 0 ? r8.size : 0L, (r18 & 16) != 0 ? ((MediaFileCacheManager.RemoteMediaFileInfo) it2.next()).score : downloadPolicy.getMaxPingTimeMs().scoreInverted(Duration.m8147getInWholeMillisecondsimpl(r8.m7951getPingTimeUwyO8pc())) + downloadPolicy.getMaxFileSizeBytes().scoreInverted(r8.getSize()));
            arrayList4.add(m7950copyWPwdCS8);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
        if (arrayList4.isEmpty()) {
            String str3 = (String) CollectionsKt.first((List) this.$mediaUrlList);
            Duration.Companion companion = Duration.Companion;
            return new MediaFileCacheManager.RemoteMediaFileInfo(str3, DurationKt.toDuration(elapsedRealtime2, DurationUnit.MILLISECONDS), null, 0L, 0.0d, 28, null);
        }
        Iterator it3 = arrayList4.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it3.next();
        if (it3.hasNext()) {
            double score = ((MediaFileCacheManager.RemoteMediaFileInfo) next).getScore();
            do {
                Object next2 = it3.next();
                double score2 = ((MediaFileCacheManager.RemoteMediaFileInfo) next2).getScore();
                if (Double.compare(score, score2) < 0) {
                    next = next2;
                    score = score2;
                }
            } while (it3.hasNext());
        }
        MediaFileCacheManager.RemoteMediaFileInfo remoteMediaFileInfo2 = (MediaFileCacheManager.RemoteMediaFileInfo) next;
        loggerInstance2 = this.this$0.logger;
        loggerInstance2.d("MediaFileCacheManager", new Function0() { // from class: io.bidmachine.util.cache.MediaFileCacheManager$pickRemoteMediaFile$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Download and score stat:\n" + CollectionsKt.joinToString$default(arrayList4, "\n", null, null, 0, null, null, 62, null);
            }
        });
        if (remoteMediaFileInfo2.getScore() > 1.0E-4d) {
            return remoteMediaFileInfo2;
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it4.next();
        if (it4.hasNext()) {
            long size = ((MediaFileCacheManager.RemoteMediaFileInfo) next3).getSize();
            do {
                Object next4 = it4.next();
                long size2 = ((MediaFileCacheManager.RemoteMediaFileInfo) next4).getSize();
                if (size > size2) {
                    next3 = next4;
                    size = size2;
                }
            } while (it4.hasNext());
        }
        return (MediaFileCacheManager.RemoteMediaFileInfo) next3;
    }
}
