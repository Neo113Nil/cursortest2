package io.bidmachine.util.download;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import io.bidmachine.util.network.NetworkUtils;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/download/DownloadManager;", "", "download", "Lio/bidmachine/util/download/DownloadManager$DownloadTask;", "url", "", "outputFile", "Ljava/io/File;", "timeout", "Lkotlin/time/Duration;", "download-moChb0s", "getActiveDownloadTask", "getHeadCallData", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$CallData;", "getHeadCallData-2Ivn440", "(Ljava/lang/String;Lkotlin/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CallData", "DownloadData", IDownloadTask.TAG, "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface DownloadManager {
    @NotNull
    /* renamed from: download-moChb0s, reason: not valid java name */
    DownloadTask mo7960downloadmoChb0s(@NotNull String url, @NotNull File outputFile, @Nullable Duration timeout);

    @Nullable
    DownloadTask getActiveDownloadTask(@NotNull String url, @NotNull File outputFile);

    @Nullable
    /* renamed from: getHeadCallData-2Ivn440, reason: not valid java name */
    Object mo7961getHeadCallData2Ivn440(@NotNull String str, @Nullable Duration duration, @NotNull Continuation continuation);

    /* renamed from: getHeadCallData-2Ivn440$default, reason: not valid java name */
    static /* synthetic */ Object m7959getHeadCallData2Ivn440$default(DownloadManager downloadManager, String str, Duration duration, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHeadCallData-2Ivn440");
        }
        if ((i & 2) != 0) {
            duration = null;
        }
        return downloadManager.mo7961getHeadCallData2Ivn440(str, duration, continuation);
    }

    /* renamed from: download-moChb0s$default, reason: not valid java name */
    static /* synthetic */ DownloadTask m7958downloadmoChb0s$default(DownloadManager downloadManager, String str, File file, Duration duration, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download-moChb0s");
        }
        if ((i & 4) != 0) {
            duration = null;
        }
        return downloadManager.mo7960downloadmoChb0s(str, file, duration);
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003ø\u0001\u0000J,\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001ø\u0001\u0000J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lio/bidmachine/util/download/DownloadManager$DownloadTask;", "", "url", "", "deferred", "Lkotlinx/coroutines/Deferred;", "Lkotlin/Result;", "Lio/bidmachine/util/download/DownloadManager$DownloadData;", "(Ljava/lang/String;Lkotlinx/coroutines/Deferred;)V", "getDeferred", "()Lkotlinx/coroutines/Deferred;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DownloadTask {

        @NotNull
        private final Deferred deferred;

        @NotNull
        private final String url;

        public static /* synthetic */ DownloadTask copy$default(DownloadTask downloadTask, String str, Deferred deferred, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadTask.url;
            }
            if ((i & 2) != 0) {
                deferred = downloadTask.deferred;
            }
            return downloadTask.copy(str, deferred);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Deferred getDeferred() {
            return this.deferred;
        }

        @NotNull
        public final DownloadTask copy(@NotNull String url, @NotNull Deferred deferred) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(deferred, "deferred");
            return new DownloadTask(url, deferred);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadTask)) {
                return false;
            }
            DownloadTask downloadTask = (DownloadTask) other;
            return Intrinsics.areEqual(this.url, downloadTask.url) && Intrinsics.areEqual(this.deferred, downloadTask.deferred);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.deferred.hashCode();
        }

        @NotNull
        public String toString() {
            return "DownloadTask(url=" + this.url + ", deferred=" + this.deferred + ')';
        }

        public DownloadTask(@NotNull String url, @NotNull Deferred deferred) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(deferred, "deferred");
            this.url = url;
            this.deferred = deferred;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Deferred getDeferred() {
            return this.deferred;
        }
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/download/DownloadManager$DownloadData;", "", "executionTime", "Lkotlin/time/Duration;", "output", "Ljava/io/File;", "(JLjava/io/File;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getExecutionTime-UwyO8pc", "()J", "J", "getOutput", "()Ljava/io/File;", "component1", "component1-UwyO8pc", "component2", "copy", "copy-VtjQ1oo", "(JLjava/io/File;)Lio/bidmachine/util/download/DownloadManager$DownloadData;", "equals", "", "other", "hashCode", "", "toString", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DownloadData {
        private final long executionTime;

        @NotNull
        private final File output;

        public /* synthetic */ DownloadData(long j, File file, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, file);
        }

        /* renamed from: copy-VtjQ1oo$default, reason: not valid java name */
        public static /* synthetic */ DownloadData m7966copyVtjQ1oo$default(DownloadData downloadData, long j, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                j = downloadData.executionTime;
            }
            if ((i & 2) != 0) {
                file = downloadData.output;
            }
            return downloadData.m7968copyVtjQ1oo(j, file);
        }

        /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getExecutionTime() {
            return this.executionTime;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final File getOutput() {
            return this.output;
        }

        @NotNull
        /* renamed from: copy-VtjQ1oo, reason: not valid java name */
        public final DownloadData m7968copyVtjQ1oo(long executionTime, @NotNull File output) {
            Intrinsics.checkNotNullParameter(output, "output");
            return new DownloadData(executionTime, output, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadData)) {
                return false;
            }
            DownloadData downloadData = (DownloadData) other;
            return Duration.m8142equalsimpl0(this.executionTime, downloadData.executionTime) && Intrinsics.areEqual(this.output, downloadData.output);
        }

        public int hashCode() {
            return (Duration.m8156hashCodeimpl(this.executionTime) * 31) + this.output.hashCode();
        }

        @NotNull
        public String toString() {
            return "DownloadData(executionTime=" + ((Object) Duration.m8170toStringimpl(this.executionTime)) + ", output=" + this.output + ')';
        }

        private DownloadData(long j, File file) {
            this.executionTime = j;
            this.output = file;
        }

        /* renamed from: getExecutionTime-UwyO8pc, reason: not valid java name */
        public final long m7969getExecutionTimeUwyO8pc() {
            return this.executionTime;
        }

        @NotNull
        public final File getOutput() {
            return this.output;
        }
    }

    /* compiled from: DownloadManager.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\nJ\u001b\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005HÆ\u0003J\r\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J!\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lio/bidmachine/util/download/DownloadManager$CallData;", "", "executionTime", "Lkotlin/time/Duration;", "headers", "", "", "", "(JLjava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getExecutionTime-UwyO8pc", "()J", "J", "getHeaders", "()Ljava/util/Map;", "component1", "component1-UwyO8pc", "component2", "contentLength", "", "()Ljava/lang/Long;", "contentType", "copy", "copy-VtjQ1oo", "(JLjava/util/Map;)Lio/bidmachine/util/download/DownloadManager$CallData;", "equals", "", "other", "hashCode", "", "optLongHeader", "key", "default", "(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "optStringHeader", "toString", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CallData {
        private final long executionTime;

        @NotNull
        private final Map<String, List<String>> headers;

        public /* synthetic */ CallData(long j, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-VtjQ1oo$default, reason: not valid java name */
        public static /* synthetic */ CallData m7962copyVtjQ1oo$default(CallData callData, long j, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                j = callData.executionTime;
            }
            if ((i & 2) != 0) {
                map = callData.headers;
            }
            return callData.m7964copyVtjQ1oo(j, map);
        }

        /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getExecutionTime() {
            return this.executionTime;
        }

        @NotNull
        public final Map<String, List<String>> component2() {
            return this.headers;
        }

        @NotNull
        /* renamed from: copy-VtjQ1oo, reason: not valid java name */
        public final CallData m7964copyVtjQ1oo(long executionTime, @NotNull Map<String, ? extends List<String>> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return new CallData(executionTime, headers, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallData)) {
                return false;
            }
            CallData callData = (CallData) other;
            return Duration.m8142equalsimpl0(this.executionTime, callData.executionTime) && Intrinsics.areEqual(this.headers, callData.headers);
        }

        public int hashCode() {
            return (Duration.m8156hashCodeimpl(this.executionTime) * 31) + this.headers.hashCode();
        }

        @NotNull
        public String toString() {
            return "CallData(executionTime=" + ((Object) Duration.m8170toStringimpl(this.executionTime)) + ", headers=" + this.headers + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private CallData(long j, Map<String, ? extends List<String>> map) {
            this.executionTime = j;
            this.headers = map;
        }

        /* renamed from: getExecutionTime-UwyO8pc, reason: not valid java name */
        public final long m7965getExecutionTimeUwyO8pc() {
            return this.executionTime;
        }

        @NotNull
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public static /* synthetic */ Long optLongHeader$default(CallData callData, String str, Long l, int i, Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            return callData.optLongHeader(str, l);
        }

        @Nullable
        public final Long optLongHeader(@NotNull String key, @Nullable Long r3) {
            String str;
            Long longOrNull;
            Intrinsics.checkNotNullParameter(key, "key");
            List<String> list = this.headers.get(key);
            return (list == null || (str = (String) CollectionsKt.firstOrNull((List) list)) == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? r3 : longOrNull;
        }

        public static /* synthetic */ String optStringHeader$default(CallData callData, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return callData.optStringHeader(str, str2);
        }

        @Nullable
        public final String optStringHeader(@NotNull String key, @Nullable String r3) {
            String str;
            Intrinsics.checkNotNullParameter(key, "key");
            List<String> list = this.headers.get(key);
            return (list == null || (str = (String) CollectionsKt.firstOrNull((List) list)) == null) ? r3 : str;
        }

        @Nullable
        public final Long contentLength() {
            return optLongHeader$default(this, NetworkUtils.HEADER_CONTENT_LENGTH, null, 2, null);
        }

        @Nullable
        public final String contentType() {
            return optStringHeader$default(this, "Content-Type", null, 2, null);
        }
    }
}
