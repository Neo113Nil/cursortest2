package expo.modules.updates.loader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileDownloader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.FileDownloader", f = "FileDownloader.kt", i = {0, 0, 0}, l = {87}, m = "downloadAssetAndVerifyHashAndWriteToPath", n = {"request", "expectedBase64URLEncodedSHA256Hash", "destination"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1(FileDownloader fileDownloader, Continuation<? super FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1> continuation) {
        super(continuation);
        this.this$0 = fileDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object downloadAssetAndVerifyHashAndWriteToPath;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        downloadAssetAndVerifyHashAndWriteToPath = this.this$0.downloadAssetAndVerifyHashAndWriteToPath(null, null, null, null, this);
        return downloadAssetAndVerifyHashAndWriteToPath;
    }
}
