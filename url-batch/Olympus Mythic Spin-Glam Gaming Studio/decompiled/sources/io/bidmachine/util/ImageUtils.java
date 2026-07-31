package io.bidmachine.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007¨\u0006\u0018"}, d2 = {"Lio/bidmachine/util/ImageUtils;", "", "()V", "compressSafely", "", "bitmap", "Landroid/graphics/Bitmap;", "outputStream", "Ljava/io/OutputStream;", "createDefaultBitmapFactoryOptions", "Landroid/graphics/BitmapFactory$Options;", "decodeBytesToBitmap", "byteImage", "", "bitmapFactoryOptions", "decodeBytesToBitmapSafely", "decodeFileToBitmapSafely", "file", "Ljava/io/File;", "recycleSafely", "", "saveImageWithCompress", "toBitmapWithCompress", "writeBitmapWithCompress", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageUtils {

    @NotNull
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    @NotNull
    public static final BitmapFactory.Options createDefaultBitmapFactoryOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    @Nullable
    public static final Bitmap decodeFileToBitmapSafely(@NotNull File file, @NotNull BitmapFactory.Options bitmapFactoryOptions) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return ImageUtilsKt.decodeToBitmapSafely(file, bitmapFactoryOptions);
    }

    @Nullable
    public static final Bitmap decodeBytesToBitmap(@NotNull byte[] byteImage, @NotNull BitmapFactory.Options bitmapFactoryOptions) throws Throwable {
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return ImageUtilsKt.decodeBytesToBitmap(byteImage, bitmapFactoryOptions);
    }

    @Nullable
    public static final Bitmap decodeBytesToBitmapSafely(@NotNull byte[] byteImage, @NotNull BitmapFactory.Options bitmapFactoryOptions) {
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return ImageUtilsKt.decodeBytesToBitmapSafely(byteImage, bitmapFactoryOptions);
    }

    @Nullable
    public static final Bitmap toBitmapWithCompress(@NotNull byte[] byteImage) {
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        return toBitmapWithCompress(byteImage, createDefaultBitmapFactoryOptions());
    }

    @Nullable
    public static final Bitmap toBitmapWithCompress(@NotNull byte[] byteImage, @NotNull BitmapFactory.Options bitmapFactoryOptions) {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        bitmapFactoryOptions.inJustDecodeBounds = false;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(byteImage.length);
            try {
                if (writeBitmapWithCompress(byteImage, byteArrayOutputStream, bitmapFactoryOptions)) {
                    byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
                        UtilsKt.finalize(byteArrayOutputStream);
                        UtilsKt.closeSafely(byteArrayInputStream);
                        return decodeStream;
                    } catch (Throwable unused) {
                        UtilsKt.finalize(byteArrayOutputStream);
                        UtilsKt.closeSafely(byteArrayInputStream);
                        return null;
                    }
                }
                UtilsKt.finalize(byteArrayOutputStream);
                UtilsKt.closeSafely(null);
                return null;
            } catch (Throwable unused2) {
                byteArrayInputStream = null;
            }
        } catch (Throwable unused3) {
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static final boolean writeBitmapWithCompress(@NotNull byte[] byteImage, @NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return writeBitmapWithCompress(byteImage, outputStream, createDefaultBitmapFactoryOptions());
    }

    public static /* synthetic */ boolean writeBitmapWithCompress$default(byte[] bArr, OutputStream outputStream, BitmapFactory.Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = createDefaultBitmapFactoryOptions();
        }
        return writeBitmapWithCompress(bArr, outputStream, options);
    }

    public static final boolean writeBitmapWithCompress(@NotNull byte[] byteImage, @NotNull OutputStream outputStream, @NotNull BitmapFactory.Options bitmapFactoryOptions) {
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        Bitmap decodeBytesToBitmapSafely = decodeBytesToBitmapSafely(byteImage, bitmapFactoryOptions);
        if (decodeBytesToBitmapSafely != null) {
            return ImageUtilsKt.compressSafely$default(decodeBytesToBitmapSafely, outputStream, null, 0, 6, null);
        }
        return false;
    }

    public static final boolean compressSafely(@NotNull Bitmap bitmap, @NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return ImageUtilsKt.compressSafely$default(bitmap, outputStream, null, 0, 6, null);
    }

    public static final void recycleSafely(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageUtilsKt.recycleSafely(bitmap);
    }

    public static final boolean saveImageWithCompress(@NotNull File file, @NotNull byte[] byteImage) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        return saveImageWithCompress(file, byteImage, createDefaultBitmapFactoryOptions());
    }

    public static final boolean saveImageWithCompress(@NotNull File file, @NotNull byte[] byteImage, @NotNull BitmapFactory.Options bitmapFactoryOptions) {
        FileOutputStream fileOutputStreamCtor;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        bitmapFactoryOptions.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStreamCtor = BidMachineFilesBridge.fileOutputStreamCtor(file);
        } catch (Throwable unused) {
        }
        try {
            writeBitmapWithCompress(byteImage, fileOutputStreamCtor, bitmapFactoryOptions);
            UtilsKt.finalize(fileOutputStreamCtor);
            return true;
        } catch (Throwable unused2) {
            fileOutputStream = fileOutputStreamCtor;
            UtilsKt.finalize(fileOutputStream);
            return false;
        }
    }
}
