package expo.modules.imagemanipulator.transformers;

import android.graphics.Bitmap;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.imagemanipulator.ResizeOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResizeTransformer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lexpo/modules/imagemanipulator/transformers/ResizeTransformer;", "Lexpo/modules/imagemanipulator/transformers/ImageTransformer;", "resizeOptions", "Lexpo/modules/imagemanipulator/ResizeOptions;", "<init>", "(Lexpo/modules/imagemanipulator/ResizeOptions;)V", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", "bitmap", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResizeTransformer implements ImageTransformer {
    private final ResizeOptions resizeOptions;

    public ResizeTransformer(ResizeOptions resizeOptions) {
        Intrinsics.checkNotNullParameter(resizeOptions, "resizeOptions");
        this.resizeOptions = resizeOptions;
    }

    @Override // expo.modules.imagemanipulator.transformers.ImageTransformer
    public Bitmap transform(Bitmap bitmap) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        double width = bitmap.getWidth() / bitmap.getHeight();
        if (this.resizeOptions.getWidth() != null) {
            i = this.resizeOptions.getWidth().intValue();
            i2 = (int) (this.resizeOptions.getWidth().intValue() / width);
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.resizeOptions.getHeight() != null) {
            i2 = this.resizeOptions.getHeight().intValue();
            if (i == 0) {
                i = (int) (this.resizeOptions.getHeight().intValue() * width);
            }
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }
}
