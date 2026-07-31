package io.intercom.android.sdk.ui.coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.decode.VideoFrameDecoder;
import io.intercom.android.sdk.ui.coil.PdfDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomImageLoader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"imageLoader", "Lcoil/ImageLoader;", "getImageLoader", "context", "Landroid/content/Context;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomImageLoaderKt {
    private static ImageLoader imageLoader;

    public static final ImageLoader getImageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (imageLoader == null) {
            ImageLoader.Builder bitmapConfig = new ImageLoader.Builder(context).bitmapConfig(Bitmap.Config.ARGB_8888);
            ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 28) {
                builder.add(new ImageDecoderDecoder.Factory(false, 1, null));
            } else {
                builder.add(new GifDecoder.Factory(z, i, defaultConstructorMarker));
            }
            builder.add(new VideoFrameDecoder.Factory());
            builder.add(new PdfDecoder.Factory());
            imageLoader = bitmapConfig.components(builder.build()).build();
        }
        ImageLoader imageLoader2 = imageLoader;
        Intrinsics.checkNotNull(imageLoader2);
        return imageLoader2;
    }
}
