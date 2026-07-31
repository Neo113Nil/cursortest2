package com.mobilefuse.videoplayer;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.safedk.android.internal.partials.MobileFuseNetworkBridge;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: VideoDownloader.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoDownloader;", "", "<init>", "()V", "", "url", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onCancel", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/videoplayer/model/VastError;", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "downloadFile", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/mobilefuse/sdk/exception/Either;", "Landroid/content/Context;", "context", "Lcom/mobilefuse/videoplayer/VideoDownloader$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "cache", "(Landroid/content/Context;Ljava/lang/String;Lcom/mobilefuse/videoplayer/VideoDownloader$Listener;Lkotlin/jvm/functions/Function1;)V", "", "VIDEO_MAX_SIZE", "I", "Listener", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class VideoDownloader {

    @NotNull
    public static final VideoDownloader INSTANCE = new VideoDownloader();
    private static final int VIDEO_MAX_SIZE = 52428800;

    /* compiled from: VideoDownloader.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoDownloader$Listener;", "", "onComplete", "", "requestedUrl", "", "videoSource", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "onError", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public interface Listener {
        void onComplete(@NotNull String requestedUrl, @NotNull VideoSource videoSource);

        void onError(@NotNull VastError error);
    }

    private VideoDownloader() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r14 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r14 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r14 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        if (r14 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [T, java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r14v13, types: [T, java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.mobilefuse.videoplayer.VideoDownloader$downloadFile$cancelAction$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Either<VastError, VideoSource> downloadFile(String url, Function1 onCancel) {
        Either<VastError, VideoSource> errorResult;
        HttpURLConnection httpURLConnection;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = null;
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = new Function0() { // from class: com.mobilefuse.videoplayer.VideoDownloader$downloadFile$cancelAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke() {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) Ref$ObjectRef.this.element;
                    if (httpURLConnection2 != null) {
                        MobileFuseNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                    }
                    ref$ObjectRef2.element = null;
                } catch (Throwable th) {
                    DebuggingKt.logError$default(VideoDownloader.INSTANCE, "Error canceling the VideoDownloader process " + th.getMessage(), null, null, 6, null);
                }
            }
        };
        onCancel.invoke(new Function0() { // from class: com.mobilefuse.videoplayer.VideoDownloader$downloadFile$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Function0 function0 = (Function0) Ref$ObjectRef.this.element;
                if (function0 != null) {
                }
            }
        });
        try {
            URLConnection openConnection = new URL(url).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            ?? r14 = (HttpURLConnection) openConnection;
            ref$ObjectRef.element = r14;
            r14.setConnectTimeout(10000);
            ((HttpURLConnection) ref$ObjectRef.element).setReadTimeout(20000);
            ref$ObjectRef2.element = new BufferedInputStream(MobileFuseNetworkBridge.urlConnectionGetInputStream((HttpURLConnection) ref$ObjectRef.element));
            int httpUrlConnectionGetResponseCode = MobileFuseNetworkBridge.httpUrlConnectionGetResponseCode((HttpURLConnection) ref$ObjectRef.element);
            if (httpUrlConnectionGetResponseCode >= 200 && httpUrlConnectionGetResponseCode < 300) {
                if (((HttpURLConnection) ref$ObjectRef.element).getContentLength() > VIDEO_MAX_SIZE) {
                    errorResult = new ErrorResult<>(VastError.UNIDENTIFIED);
                } else {
                    VideoCache videoCache = VideoCache.INSTANCE;
                    Context globalContext = AppLifecycleHelper.getGlobalContext();
                    InputStream inputStream = (InputStream) ref$ObjectRef2.element;
                    if (inputStream == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.io.BufferedInputStream");
                    }
                    String cacheFile = videoCache.cacheFile(globalContext, (BufferedInputStream) inputStream);
                    if (cacheFile == null) {
                        errorResult = new ErrorResult<>(VastError.UNIDENTIFIED);
                        ref$ObjectRef3.element = null;
                        httpURLConnection = (HttpURLConnection) ref$ObjectRef.element;
                    } else {
                        errorResult = new SuccessResult<>(new VideoSource(cacheFile, url, false, 4, null));
                        ref$ObjectRef3.element = null;
                        httpURLConnection = (HttpURLConnection) ref$ObjectRef.element;
                    }
                }
            }
            errorResult = httpUrlConnectionGetResponseCode != 404 ? httpUrlConnectionGetResponseCode != 408 ? new ErrorResult<>(VastError.UNIDENTIFIED) : new ErrorResult<>(VastError.MEDIAFILE_TIMEOUT) : new ErrorResult<>(VastError.MEDIAFILE_NOT_FOUND);
            ref$ObjectRef3.element = null;
            httpURLConnection = (HttpURLConnection) ref$ObjectRef.element;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                errorResult = new ErrorResult<>(VastError.MEDIAFILE_TIMEOUT);
                ref$ObjectRef3.element = null;
                httpURLConnection = (HttpURLConnection) ref$ObjectRef.element;
            } finally {
                ref$ObjectRef3.element = null;
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                if (httpURLConnection2 != null) {
                    MobileFuseNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                }
                ref$ObjectRef.element = null;
                ref$ObjectRef2.element = null;
            }
        }
    }

    public final void cache(@NotNull Context context, @NotNull String url, @NotNull Listener listener, @NotNull Function1 onCancel) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VideoCache.INSTANCE.initialize(context);
            Either<VastError, VideoSource> downloadFile = INSTANCE.downloadFile(url, onCancel);
            if (downloadFile instanceof SuccessResult) {
                listener.onComplete(url, (VideoSource) ((SuccessResult) downloadFile).getValue());
            } else if (downloadFile instanceof ErrorResult) {
                listener.onError((VastError) ((ErrorResult) downloadFile).getValue());
            }
            errorResult = new SuccessResult(Unit.INSTANCE);
        } catch (Throwable th) {
            if (VideoDownloader$cache$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            listener.onError(VastError.UNIDENTIFIED);
            th2.printStackTrace();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }
}
