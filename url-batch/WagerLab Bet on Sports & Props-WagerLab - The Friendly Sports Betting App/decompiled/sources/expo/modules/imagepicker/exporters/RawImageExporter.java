package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.net.Uri;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: RawImageExporter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/imagepicker/exporters/RawImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "<init>", "()V", "exportAsync", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "source", "Landroid/net/Uri;", "output", "Ljava/io/File;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawImageExporter implements ImageExporter {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // expo.modules.imagepicker.exporters.ImageExporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object exportAsync(Uri uri, File file, ContentResolver contentResolver, Continuation<? super ImageExportResult> continuation) {
        RawImageExporter$exportAsync$1 rawImageExporter$exportAsync$1;
        int i;
        if (continuation instanceof RawImageExporter$exportAsync$1) {
            rawImageExporter$exportAsync$1 = (RawImageExporter$exportAsync$1) continuation;
            if ((rawImageExporter$exportAsync$1.label & Integer.MIN_VALUE) != 0) {
                rawImageExporter$exportAsync$1.label -= Integer.MIN_VALUE;
                Object obj = rawImageExporter$exportAsync$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rawImageExporter$exportAsync$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    rawImageExporter$exportAsync$1.L$0 = file;
                    rawImageExporter$exportAsync$1.label = 1;
                    if (ImagePickerUtilsKt.copyFile(uri, file, contentResolver, rawImageExporter$exportAsync$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (File) rawImageExporter$exportAsync$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                DimensionsExporter dimensionsExporter = new DimensionsExporter(file);
                return new ImageExportResult(dimensionsExporter.getWidth(), dimensionsExporter.getHeight(), file);
            }
        }
        rawImageExporter$exportAsync$1 = new RawImageExporter$exportAsync$1(this, continuation);
        Object obj2 = rawImageExporter$exportAsync$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rawImageExporter$exportAsync$1.label;
        if (i != 0) {
        }
        DimensionsExporter dimensionsExporter2 = new DimensionsExporter(file);
        return new ImageExportResult(dimensionsExporter2.getWidth(), dimensionsExporter2.getHeight(), file);
    }
}
