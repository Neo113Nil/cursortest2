package io.intercom.android.sdk.lightcompressor;

import android.content.Context;
import android.net.Uri;
import androidx.compose.material.TextFieldImplKt;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: VideoCompressor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1", f = "VideoCompressor.kt", i = {}, l = {123, TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class VideoCompressor$doVideoCompression$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppSpecificStorageConfiguration $appSpecificStorageConfiguration;
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ int $i;
    final /* synthetic */ boolean $isStreamable;
    final /* synthetic */ CompressionListener $listener;
    final /* synthetic */ SharedStorageConfiguration $sharedStorageConfiguration;
    final /* synthetic */ Ref.ObjectRef<File> $streamableFile;
    final /* synthetic */ List<Uri> $uris;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoCompressor$doVideoCompression$1(Context context, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, boolean z, Configuration configuration, int i, Ref.ObjectRef<File> objectRef, List<? extends Uri> list, CompressionListener compressionListener, Continuation<? super VideoCompressor$doVideoCompression$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$sharedStorageConfiguration = sharedStorageConfiguration;
        this.$appSpecificStorageConfiguration = appSpecificStorageConfiguration;
        this.$isStreamable = z;
        this.$configuration = configuration;
        this.$i = i;
        this.$streamableFile = objectRef;
        this.$uris = list;
        this.$listener = compressionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoCompressor$doVideoCompression$1 videoCompressor$doVideoCompression$1 = new VideoCompressor$doVideoCompression$1(this.$context, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, this.$isStreamable, this.$configuration, this.$i, this.$streamableFile, this.$uris, this.$listener, continuation);
        videoCompressor$doVideoCompression$1.L$0 = obj;
        return videoCompressor$doVideoCompression$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VideoCompressor$doVideoCompression$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r0 == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0129  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.io.File] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object await;
        File saveVideoFile;
        boolean z;
        int i;
        Object startCompression;
        Context context;
        Configuration configuration;
        CompressionListener compressionListener;
        SharedStorageConfiguration sharedStorageConfiguration;
        AppSpecificStorageConfiguration appSpecificStorageConfiguration;
        ?? saveVideoFile2;
        Result result;
        File saveVideoFile3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, null), 3, null);
            this.label = 1;
            await = async$default.await(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = this.Z$0;
                i = this.I$0;
                AppSpecificStorageConfiguration appSpecificStorageConfiguration2 = (AppSpecificStorageConfiguration) this.L$4;
                SharedStorageConfiguration sharedStorageConfiguration2 = (SharedStorageConfiguration) this.L$3;
                configuration = (Configuration) this.L$2;
                Context context2 = (Context) this.L$1;
                CompressionListener compressionListener2 = (CompressionListener) this.L$0;
                ResultKt.throwOnFailure(obj);
                sharedStorageConfiguration = sharedStorageConfiguration2;
                context = context2;
                z = z2;
                compressionListener = compressionListener2;
                startCompression = obj;
                appSpecificStorageConfiguration = appSpecificStorageConfiguration2;
                result = (Result) startCompression;
                if (!result.getSuccess()) {
                    saveVideoFile3 = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, Boxing.boxBoolean(z), configuration.getVideoNames().get(i), Boxing.boxBoolean(true));
                    compressionListener.onSuccess(i, result.getSize(), saveVideoFile3 != null ? saveVideoFile3.getPath() : null);
                } else {
                    String failureMessage = result.getFailureMessage();
                    if (failureMessage == null) {
                        failureMessage = "An error has occurred!";
                    }
                    compressionListener.onFailure(i, failureMessage);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            await = obj;
        }
        String str = (String) await;
        saveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(this.$context, str, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, Boxing.boxBoolean(this.$isStreamable), this.$configuration.getVideoNames().get(this.$i), Boxing.boxBoolean(false));
        if (this.$isStreamable) {
            Ref.ObjectRef<File> objectRef = this.$streamableFile;
            saveVideoFile2 = VideoCompressor.INSTANCE.saveVideoFile(this.$context, str, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, null, this.$configuration.getVideoNames().get(this.$i), Boxing.boxBoolean(false));
            objectRef.element = saveVideoFile2;
        }
        if (saveVideoFile != null) {
            CompressionListener compressionListener3 = this.$listener;
            int i3 = this.$i;
            Context context3 = this.$context;
            List<Uri> list = this.$uris;
            Ref.ObjectRef<File> objectRef2 = this.$streamableFile;
            Configuration configuration2 = this.$configuration;
            SharedStorageConfiguration sharedStorageConfiguration3 = this.$sharedStorageConfiguration;
            AppSpecificStorageConfiguration appSpecificStorageConfiguration3 = this.$appSpecificStorageConfiguration;
            z = this.$isStreamable;
            Compressor.INSTANCE.setRunning(true);
            compressionListener3.onStart(i3);
            VideoCompressor videoCompressor = VideoCompressor.INSTANCE;
            Uri uri = list.get(i3);
            String path = saveVideoFile.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            File file = objectRef2.element;
            String path2 = file != null ? file.getPath() : null;
            this.L$0 = compressionListener3;
            this.L$1 = context3;
            this.L$2 = configuration2;
            this.L$3 = sharedStorageConfiguration3;
            this.L$4 = appSpecificStorageConfiguration3;
            this.I$0 = i3;
            this.Z$0 = z;
            this.label = 2;
            i = i3;
            startCompression = videoCompressor.startCompression(i, context3, uri, path, path2, configuration2, compressionListener3, this);
            if (startCompression != coroutine_suspended) {
                context = context3;
                configuration = configuration2;
                compressionListener = compressionListener3;
                sharedStorageConfiguration = sharedStorageConfiguration3;
                appSpecificStorageConfiguration = appSpecificStorageConfiguration3;
                result = (Result) startCompression;
                if (!result.getSuccess()) {
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
