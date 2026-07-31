package com.canhub.cropper.utils;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GetFilePathFromUri.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"getFilePathFromUri", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "uniqueName", "", "getFileFromContentUri", "Ljava/io/File;", "contentUri", "getFileExtension", "copy", "", "source", "Ljava/io/InputStream;", TypedValues.AttributesType.S_TARGET, "Ljava/io/OutputStream;", "cropper_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetFilePathFromUriKt {
    public static final String getFilePathFromUri(Context context, Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        if (path != null && StringsKt.contains$default((CharSequence) path, (CharSequence) "file://", false, 2, (Object) null)) {
            String path2 = uri.getPath();
            Intrinsics.checkNotNull(path2);
            return path2;
        }
        String path3 = getFileFromContentUri(context, uri, z).getPath();
        Intrinsics.checkNotNull(path3);
        return path3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final File getFileFromContentUri(Context context, Uri uri, boolean z) {
        FileOutputStream fileOutputStream;
        String fileExtension = getFileExtension(context, uri);
        if (fileExtension == null) {
            fileExtension = "";
        }
        String str = "temp_file_" + (z ? new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) : "") + "." + fileExtension;
        ?? cacheDir = context.getCacheDir();
        File file = new File((File) cacheDir, str);
        file.createNewFile();
        InputStream inputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStream != null) {
                        copy(inputStream, fileOutputStream);
                    }
                    fileOutputStream.flush();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    fileOutputStream.close();
                    return file;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return file;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    inputStream.close();
                }
                if (cacheDir != 0) {
                    cacheDir.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            cacheDir = 0;
            if (0 != 0) {
            }
            if (cacheDir != 0) {
            }
            throw th;
        }
    }

    private static final String getFileExtension(Context context, Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        }
        String path = uri.getPath();
        if (path != null) {
            return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString());
        }
        return null;
    }

    private static final void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
