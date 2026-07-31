package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterruptibleKt;

/* compiled from: ImageExporter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lexpo/modules/imagepicker/exporters/ImageExportResult;", "", "width", "", "height", "imageFile", "Ljava/io/File;", "<init>", "(IILjava/io/File;)V", "getWidth", "()I", "getHeight", "data", "Ljava/io/ByteArrayOutputStream;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exif", "Landroid/os/Bundle;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ImageExportResult {
    private final int height;
    private final File imageFile;
    private final int width;

    public Object data(ContentResolver contentResolver, Continuation<? super ByteArrayOutputStream> continuation) {
        return data$suspendImpl(this, contentResolver, continuation);
    }

    public Object exif(ContentResolver contentResolver, Continuation<? super Bundle> continuation) {
        return exif$suspendImpl(this, contentResolver, continuation);
    }

    public ImageExportResult(int i, int i2, File imageFile) {
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        this.width = i;
        this.height = i2;
        this.imageFile = imageFile;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    static /* synthetic */ Object data$suspendImpl(final ImageExportResult imageExportResult, final ContentResolver contentResolver, Continuation<? super ByteArrayOutputStream> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0() { // from class: expo.modules.imagepicker.exporters.ImageExportResult$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteArrayOutputStream data$lambda$2;
                data$lambda$2 = ImageExportResult.data$lambda$2(contentResolver, imageExportResult);
                return data$lambda$2;
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteArrayOutputStream data$lambda$2(ContentResolver contentResolver, ImageExportResult imageExportResult) {
        InputStream openInputStream = contentResolver.openInputStream(Uri.fromFile(imageExportResult.imageFile));
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = openInputStream;
            try {
                InputStream inputStream = byteArrayOutputStream;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    ByteStreamsKt.copyTo$default(inputStream, byteArrayOutputStream2, 0, 2, null);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArrayOutputStream2;
                } finally {
                }
            } finally {
            }
        } else {
            throw new FailedToReadFileException(imageExportResult.imageFile, null, 2, null);
        }
    }

    static /* synthetic */ Object exif$suspendImpl(final ImageExportResult imageExportResult, final ContentResolver contentResolver, Continuation<? super Bundle> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0() { // from class: expo.modules.imagepicker.exporters.ImageExportResult$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle exif$lambda$8;
                exif$lambda$8 = ImageExportResult.exif$lambda$8(contentResolver, imageExportResult);
                return exif$lambda$8;
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle exif$lambda$8(ContentResolver contentResolver, ImageExportResult imageExportResult) {
        InputStream openInputStream = contentResolver.openInputStream(Uri.fromFile(imageExportResult.imageFile));
        if (openInputStream != null) {
            InputStream inputStream = openInputStream;
            try {
                Bundle bundle = new Bundle();
                ExifInterface exifInterface = new ExifInterface(inputStream);
                Iterable<Pair<String, String>> exif_tags = ImagePickerConstants.INSTANCE.getEXIF_TAGS();
                ArrayList<Pair> arrayList = new ArrayList();
                for (Pair<String, String> pair : exif_tags) {
                    if (exifInterface.getAttribute(pair.component2()) != null) {
                        arrayList.add(pair);
                    }
                }
                for (Pair pair2 : arrayList) {
                    String str = (String) pair2.component1();
                    String str2 = (String) pair2.component2();
                    int hashCode = str.hashCode();
                    if (hashCode != -1325958191) {
                        if (hashCode != -891985903) {
                            if (hashCode == 104431 && str.equals("int")) {
                                bundle.putInt(str2, exifInterface.getAttributeInt(str2, 0));
                            }
                        } else if (str.equals(TypedValues.Custom.S_STRING)) {
                            bundle.putString(str2, exifInterface.getAttribute(str2));
                        }
                    } else if (str.equals("double")) {
                        bundle.putDouble(str2, exifInterface.getAttributeDouble(str2, 0.0d));
                    }
                }
                double[] latLong = exifInterface.getLatLong();
                if (latLong != null) {
                    bundle.putDouble(ExifInterface.TAG_GPS_LATITUDE, latLong[0]);
                    bundle.putDouble(ExifInterface.TAG_GPS_LONGITUDE, latLong[1]);
                    bundle.putDouble(ExifInterface.TAG_GPS_ALTITUDE, exifInterface.getAltitude(0.0d));
                }
                CloseableKt.closeFinally(inputStream, null);
                return bundle;
            } finally {
            }
        } else {
            throw new FailedToReadFileException(imageExportResult.imageFile, null, 2, null);
        }
    }
}
