package coil.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImageDecoderDecoder.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0, 1}, l = {50, 90}, m = "decode", n = {"this", "isSampled", "isSampled"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class ImageDecoderDecoder$decode$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageDecoderDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageDecoderDecoder$decode$1(ImageDecoderDecoder imageDecoderDecoder, Continuation<? super ImageDecoderDecoder$decode$1> continuation) {
        super(continuation);
        this.this$0 = imageDecoderDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decode(this);
    }
}
