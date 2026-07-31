package expo.modules.imagepicker;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.soloader.Elf64;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MediaHandler.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {Elf64.Ehdr.E_SHENTSIZE, 60, 63}, m = "handleImage", n = {"sourceUri", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "mimeType", "outputFile", "sourceUri", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "mimeType", "outputFile", "exportedImage", "sourceUri", "mimeType", "outputFile", "exportedImage", "base64"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes7.dex */
final class MediaHandler$handleImage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaHandler$handleImage$1(MediaHandler mediaHandler, Continuation<? super MediaHandler$handleImage$1> continuation) {
        super(continuation);
        this.this$0 = mediaHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleImage = this.this$0.handleImage(null, null, this);
        return handleImage;
    }
}
