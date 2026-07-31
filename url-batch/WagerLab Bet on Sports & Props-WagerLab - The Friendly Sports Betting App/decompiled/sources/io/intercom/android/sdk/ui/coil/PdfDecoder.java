package io.intercom.android.sdk.ui.coil;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import coil.ImageLoader;
import coil.decode.DecodeResult;
import coil.decode.DecodeUtils;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.size.Size;
import coil.size.Sizes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.InterruptibleKt;

/* compiled from: PdfDecoder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/ui/coil/PdfDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil/request/Options;", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PdfDecoder implements Decoder {
    public static final int $stable = 8;
    private final Options options;
    private final ImageSource source;

    public PdfDecoder(ImageSource source, Options options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        this.source = source;
        this.options = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decode(Continuation<? super DecodeResult> continuation) {
        PdfDecoder$decode$1 pdfDecoder$decode$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof PdfDecoder$decode$1) {
            pdfDecoder$decode$1 = (PdfDecoder$decode$1) continuation;
            if ((pdfDecoder$decode$1.label & Integer.MIN_VALUE) != 0) {
                pdfDecoder$decode$1.label -= Integer.MIN_VALUE;
                Object obj = pdfDecoder$decode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pdfDecoder$decode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.ui.coil.PdfDecoder$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            BitmapDrawable decode$lambda$2;
                            decode$lambda$2 = PdfDecoder.decode$lambda$2(PdfDecoder.this, booleanRef2);
                            return decode$lambda$2;
                        }
                    };
                    pdfDecoder$decode$1.L$0 = booleanRef2;
                    pdfDecoder$decode$1.label = 1;
                    Object runInterruptible$default = InterruptibleKt.runInterruptible$default(null, function0, pdfDecoder$decode$1, 1, null);
                    if (runInterruptible$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                    obj = runInterruptible$default;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) pdfDecoder$decode$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new DecodeResult((BitmapDrawable) obj, booleanRef.element);
            }
        }
        pdfDecoder$decode$1 = new PdfDecoder$decode$1(this, continuation);
        Object obj2 = pdfDecoder$decode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pdfDecoder$decode$1.label;
        if (i != 0) {
        }
        return new DecodeResult((BitmapDrawable) obj2, booleanRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDrawable decode$lambda$2(PdfDecoder this$0, Ref.BooleanRef isSampled) {
        ParcelFileDescriptor open;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(isSampled, "$isSampled");
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            open = ParcelFileDescriptor.open(this$0.source.file().toFile(), 268435456);
        } catch (Throwable th) {
            th = th;
        }
        try {
            PdfRenderer.Page openPage = new PdfRenderer(open).openPage(0);
            Intrinsics.checkNotNullExpressionValue(openPage, "openPage(...)");
            int width = openPage.getWidth();
            int height = openPage.getHeight();
            Size size = this$0.options.getSize();
            int px = Sizes.isOriginal(size) ? width : PdfDecoderKt.toPx(size.getWidth(), this$0.options.getScale());
            Size size2 = this$0.options.getSize();
            int px2 = Sizes.isOriginal(size2) ? height : PdfDecoderKt.toPx(size2.getHeight(), this$0.options.getScale());
            if (width > 0 && height > 0 && (width != px || height != px2)) {
                double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, px, px2, this$0.options.getScale());
                isSampled.element = computeSizeMultiplier < 1.0d;
                if (isSampled.element || !this$0.options.getAllowInexactSize()) {
                    width = MathKt.roundToInt(width * computeSizeMultiplier);
                    height = MathKt.roundToInt(computeSizeMultiplier * height);
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            new Canvas(createBitmap).drawColor(-1);
            openPage.render(createBitmap, null, null, 1);
            Resources resources = this$0.options.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, createBitmap);
            if (open != null) {
                open.close();
            }
            return bitmapDrawable;
        } catch (Throwable th2) {
            th = th2;
            parcelFileDescriptor = open;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            throw th;
        }
    }

    /* compiled from: PdfDecoder.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0013\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/ui/coil/PdfDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "<init>", "()V", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "", "mimeType", "", "equals", "other", "", "hashCode", "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        public static final int $stable = 0;

        @Override // coil.decode.Decoder.Factory
        public Decoder create(SourceResult result, Options options, ImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            if (isApplicable(result.getMimeType())) {
                return new PdfDecoder(result.getSource(), options);
            }
            return null;
        }

        private final boolean isApplicable(String mimeType) {
            if (mimeType != null) {
                return ContentTypeExtensionKt.isPdf(mimeType);
            }
            return false;
        }

        public boolean equals(Object other) {
            return other instanceof Factory;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }
}
