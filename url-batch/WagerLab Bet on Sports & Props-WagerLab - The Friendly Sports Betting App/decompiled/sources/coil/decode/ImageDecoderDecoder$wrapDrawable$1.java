package coil.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImageDecoderDecoder.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0}, l = {158}, m = "wrapDrawable", n = {"this", "baseDrawable"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ImageDecoderDecoder$wrapDrawable$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageDecoderDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageDecoderDecoder$wrapDrawable$1(ImageDecoderDecoder imageDecoderDecoder, Continuation<? super ImageDecoderDecoder$wrapDrawable$1> continuation) {
        super(continuation);
        this.this$0 = imageDecoderDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object wrapDrawable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        wrapDrawable = this.this$0.wrapDrawable(null, this);
        return wrapDrawable;
    }
}
