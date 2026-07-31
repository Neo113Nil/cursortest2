package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes12.dex */
public class VideoUtils {
    public static void saveVideo(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStreamCtor;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStreamCtor = BidMachineFilesBridge.fileOutputStreamCtor(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStreamCtor.write(bArr);
            io.bidmachine.iab.utils.Utils.flush(fileOutputStreamCtor);
            io.bidmachine.iab.utils.Utils.close(fileOutputStreamCtor);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStreamCtor;
            io.bidmachine.iab.utils.Utils.flush(fileOutputStream);
            io.bidmachine.iab.utils.Utils.close(fileOutputStream);
            throw th;
        }
    }
}
