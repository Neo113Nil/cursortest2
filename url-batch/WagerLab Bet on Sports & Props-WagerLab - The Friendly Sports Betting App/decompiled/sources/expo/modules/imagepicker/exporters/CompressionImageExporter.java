package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.net.UriKt;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.FailedToWriteFileException;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import expo.modules.imagepicker.MissingModuleException;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterruptibleKt;

/* compiled from: CompressionImageExporter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/imagepicker/exporters/CompressionImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "quality", "", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;D)V", "compressQuality", "", "exportAsync", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "source", "Landroid/net/Uri;", "output", "Ljava/io/File;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBitmap", "Landroid/graphics/Bitmap;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeImage", "", "bitmap", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompressionImageExporter implements ImageExporter {
    private final AppContextProvider appContextProvider;
    private final int compressQuality;

    public CompressionImageExporter(AppContextProvider appContextProvider, double d) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
        this.compressQuality = (int) (d * 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (expo.modules.imagepicker.ImagePickerUtilsKt.copyExifData(r2, r11, r12, r0) != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r13 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // expo.modules.imagepicker.exporters.ImageExporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object exportAsync(Uri uri, File file, ContentResolver contentResolver, Continuation<? super ImageExportResult> continuation) {
        CompressionImageExporter$exportAsync$1 compressionImageExporter$exportAsync$1;
        Object coroutine_suspended;
        int i;
        Bitmap bitmap;
        Bitmap.CompressFormat bitmapCompressFormat;
        Uri uri2;
        Bitmap bitmap2;
        if (continuation instanceof CompressionImageExporter$exportAsync$1) {
            compressionImageExporter$exportAsync$1 = (CompressionImageExporter$exportAsync$1) continuation;
            if ((compressionImageExporter$exportAsync$1.label & Integer.MIN_VALUE) != 0) {
                compressionImageExporter$exportAsync$1.label -= Integer.MIN_VALUE;
                Object obj = compressionImageExporter$exportAsync$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = compressionImageExporter$exportAsync$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    compressionImageExporter$exportAsync$1.L$0 = uri;
                    compressionImageExporter$exportAsync$1.L$1 = file;
                    compressionImageExporter$exportAsync$1.L$2 = contentResolver;
                    compressionImageExporter$exportAsync$1.label = 1;
                    obj = readBitmap(uri, compressionImageExporter$exportAsync$1);
                } else if (i == 1) {
                    contentResolver = (ContentResolver) compressionImageExporter$exportAsync$1.L$2;
                    file = (File) compressionImageExporter$exportAsync$1.L$1;
                    uri = (Uri) compressionImageExporter$exportAsync$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bitmap2 = (Bitmap) compressionImageExporter$exportAsync$1.L$1;
                        file = (File) compressionImageExporter$exportAsync$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        final Bitmap bitmap3 = bitmap2;
                        final File file2 = file;
                        final int width = bitmap3.getWidth();
                        final int height = bitmap3.getHeight();
                        return new ImageExportResult(file2, width, height) { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter$exportAsync$2
                            @Override // expo.modules.imagepicker.exporters.ImageExportResult
                            public Object data(ContentResolver contentResolver2, Continuation<? super ByteArrayOutputStream> continuation2) {
                                int i2;
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                Bitmap bitmap4 = bitmap3;
                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                i2 = this.compressQuality;
                                bitmap4.compress(compressFormat, i2, byteArrayOutputStream);
                                return byteArrayOutputStream;
                            }
                        };
                    }
                    bitmap2 = (Bitmap) compressionImageExporter$exportAsync$1.L$3;
                    ContentResolver contentResolver2 = (ContentResolver) compressionImageExporter$exportAsync$1.L$2;
                    File file3 = (File) compressionImageExporter$exportAsync$1.L$1;
                    uri2 = (Uri) compressionImageExporter$exportAsync$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    contentResolver = contentResolver2;
                    file = file3;
                    compressionImageExporter$exportAsync$1.L$0 = file;
                    compressionImageExporter$exportAsync$1.L$1 = bitmap2;
                    compressionImageExporter$exportAsync$1.L$2 = null;
                    compressionImageExporter$exportAsync$1.L$3 = null;
                    compressionImageExporter$exportAsync$1.label = 3;
                }
                bitmap = (Bitmap) obj;
                bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(file);
                compressionImageExporter$exportAsync$1.L$0 = uri;
                compressionImageExporter$exportAsync$1.L$1 = file;
                compressionImageExporter$exportAsync$1.L$2 = contentResolver;
                compressionImageExporter$exportAsync$1.L$3 = bitmap;
                compressionImageExporter$exportAsync$1.label = 2;
                if (writeImage(bitmap, file, bitmapCompressFormat, compressionImageExporter$exportAsync$1) != coroutine_suspended) {
                    uri2 = uri;
                    bitmap2 = bitmap;
                    compressionImageExporter$exportAsync$1.L$0 = file;
                    compressionImageExporter$exportAsync$1.L$1 = bitmap2;
                    compressionImageExporter$exportAsync$1.L$2 = null;
                    compressionImageExporter$exportAsync$1.L$3 = null;
                    compressionImageExporter$exportAsync$1.label = 3;
                }
                return coroutine_suspended;
            }
        }
        compressionImageExporter$exportAsync$1 = new CompressionImageExporter$exportAsync$1(this, continuation);
        Object obj2 = compressionImageExporter$exportAsync$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = compressionImageExporter$exportAsync$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(file);
        compressionImageExporter$exportAsync$1.L$0 = uri;
        compressionImageExporter$exportAsync$1.L$1 = file;
        compressionImageExporter$exportAsync$1.L$2 = contentResolver;
        compressionImageExporter$exportAsync$1.L$3 = bitmap;
        compressionImageExporter$exportAsync$1.label = 2;
        if (writeImage(bitmap, file, bitmapCompressFormat, compressionImageExporter$exportAsync$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readBitmap(final Uri uri, Continuation<? super Bitmap> continuation) {
        CompressionImageExporter$readBitmap$1 compressionImageExporter$readBitmap$1;
        int i;
        if (continuation instanceof CompressionImageExporter$readBitmap$1) {
            compressionImageExporter$readBitmap$1 = (CompressionImageExporter$readBitmap$1) continuation;
            if ((compressionImageExporter$readBitmap$1.label & Integer.MIN_VALUE) != 0) {
                compressionImageExporter$readBitmap$1.label -= Integer.MIN_VALUE;
                Object obj = compressionImageExporter$readBitmap$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = compressionImageExporter$readBitmap$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function0 function0 = new Function0() { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Bitmap readBitmap$lambda$0;
                            readBitmap$lambda$0 = CompressionImageExporter.readBitmap$lambda$0(CompressionImageExporter.this, uri);
                            return readBitmap$lambda$0;
                        }
                    };
                    compressionImageExporter$readBitmap$1.label = 1;
                    obj = InterruptibleKt.runInterruptible$default(null, function0, compressionImageExporter$readBitmap$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj);
                return obj;
            }
        }
        compressionImageExporter$readBitmap$1 = new CompressionImageExporter$readBitmap$1(this, continuation);
        Object obj2 = compressionImageExporter$readBitmap$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = compressionImageExporter$readBitmap$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap readBitmap$lambda$0(CompressionImageExporter compressionImageExporter, Uri uri) {
        Future<Bitmap> loadImageForManipulationFromURL;
        ImageLoaderInterface imageLoader = compressionImageExporter.appContextProvider.getAppContext().getImageLoader();
        if (imageLoader == null || (loadImageForManipulationFromURL = imageLoader.loadImageForManipulationFromURL(uri.toString())) == null) {
            throw new MissingModuleException("ImageLoader");
        }
        try {
            return loadImageForManipulationFromURL.get();
        } catch (ExecutionException e) {
            throw new FailedToReadFileException(UriKt.toFile(uri), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeImage(final Bitmap bitmap, final File file, final Bitmap.CompressFormat compressFormat, Continuation<? super Boolean> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0() { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean writeImage$lambda$2;
                writeImage$lambda$2 = CompressionImageExporter.writeImage$lambda$2(file, bitmap, compressFormat, this);
                return Boolean.valueOf(writeImage$lambda$2);
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean writeImage$lambda$2(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, CompressionImageExporter compressionImageExporter) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean compress = bitmap.compress(compressFormat, compressionImageExporter.compressQuality, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                return compress;
            } finally {
            }
        } catch (FileNotFoundException e) {
            throw new FailedToWriteFileException(file, e);
        }
    }
}
