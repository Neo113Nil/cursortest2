package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.gc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4023gc {
    public static final boolean a(String tag, String data, String filePath) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(file);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStreamCtor.write(bytes);
            fileOutputStreamCtor.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            try {
                return FilesKt.readText$default(file, null, 1, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void a(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
