package io.bidmachine.util.download;

import io.bidmachine.util.file.FileUtilsKt;
import io.bidmachine.util.log.LoggerInstance;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadManagerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.download.DownloadManagerImpl$cleanupNotCompletedDownloads$1", f = "DownloadManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DownloadManagerImpl$cleanupNotCompletedDownloads$1 extends SuspendLambda implements Function2 {
    int label;
    final /* synthetic */ DownloadManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$cleanupNotCompletedDownloads$1(DownloadManagerImpl downloadManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DownloadManagerImpl$cleanupNotCompletedDownloads$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DownloadManagerImpl$cleanupNotCompletedDownloads$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        File file;
        LoggerInstance loggerInstance;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        file = this.this$0.tempDir;
        FileUtilsKt.deleteChildFiles(file, new Function1() { // from class: io.bidmachine.util.download.DownloadManagerImpl$cleanupNotCompletedDownloads$1.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull File it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean isFile = it.isFile();
                if (isFile) {
                    Ref$IntRef.this.element++;
                }
                return Boolean.valueOf(isFile);
            }
        });
        loggerInstance = this.this$0.logger;
        loggerInstance.d("DownloadManager", new Function0() { // from class: io.bidmachine.util.download.DownloadManagerImpl$cleanupNotCompletedDownloads$1.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Cleanup unused files completed, removed count: " + Ref$IntRef.this.element;
            }
        });
        return Unit.INSTANCE;
    }
}
