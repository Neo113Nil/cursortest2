package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getDirectorySize", "", "Ljava/io/File;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(@NotNull File file) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(file, "<this>");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                Iterator it = ArrayIteratorKt.iterator(listFiles);
                while (it.hasNext()) {
                    File file3 = (File) it.next();
                    if (file3.isDirectory()) {
                        Intrinsics.checkNotNull(file3);
                        linkedList.add(file3);
                    } else {
                        j += file3.length();
                    }
                }
            }
        }
        return j;
    }
}
