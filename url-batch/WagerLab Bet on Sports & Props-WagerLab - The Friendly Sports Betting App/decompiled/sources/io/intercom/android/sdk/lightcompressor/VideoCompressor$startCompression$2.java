package io.intercom.android.sdk.lightcompressor;

import android.content.Context;
import android.net.Uri;
import com.facebook.internal.FacebookRequestErrorClassification;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VideoCompressor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/lightcompressor/video/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2", f = "VideoCompressor.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class VideoCompressor$startCompression$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $destPath;
    final /* synthetic */ int $index;
    final /* synthetic */ CompressionListener $listener;
    final /* synthetic */ Uri $srcUri;
    final /* synthetic */ String $streamableFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoCompressor$startCompression$2(int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, Continuation<? super VideoCompressor$startCompression$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$context = context;
        this.$srcUri = uri;
        this.$destPath = str;
        this.$streamableFile = str2;
        this.$configuration = configuration;
        this.$listener = compressionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoCompressor$startCompression$2(this.$index, this.$context, this.$srcUri, this.$destPath, this.$streamableFile, this.$configuration, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
        return ((VideoCompressor$startCompression$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Compressor compressor = Compressor.INSTANCE;
        int i2 = this.$index;
        Context context = this.$context;
        Uri uri = this.$srcUri;
        String str = this.$destPath;
        String str2 = this.$streamableFile;
        Configuration configuration = this.$configuration;
        final CompressionListener compressionListener = this.$listener;
        this.label = 1;
        Object compressVideo = compressor.compressVideo(i2, context, uri, str, str2, configuration, new CompressionProgressListener() { // from class: io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2.1
            @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
            public void onProgressChanged(int index, float percent) {
                CompressionListener.this.onProgress(index, percent);
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
            public void onProgressCancelled(int index) {
                CompressionListener.this.onCancelled(index);
            }
        }, this);
        return compressVideo == coroutine_suspended ? coroutine_suspended : compressVideo;
    }
}
