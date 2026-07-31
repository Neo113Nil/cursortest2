package expo.modules.clipboard;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ClipboardImage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.clipboard.ClipboardImageKt", f = "ClipboardImage.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {162, 166, 169}, m = "clipDataFromBase64Image", n = {"context", "bitmap", "format", "context", "bitmap", "format", "file", "context", "file"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class ClipboardImageKt$clipDataFromBase64Image$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    ClipboardImageKt$clipDataFromBase64Image$1(Continuation<? super ClipboardImageKt$clipDataFromBase64Image$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ClipboardImageKt.clipDataFromBase64Image(null, null, null, this);
    }
}
