package io.bidmachine.util.file;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a\"\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f\u001a\f\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u0001\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0001\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0011\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0011\u001a\f\u0010\u0013\u001a\u00020\r*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\u001a\u0012\u0010\u0015\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001\u001a\u0012\u0010\u0017\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0003\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u0001\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0003¨\u0006\u001e"}, d2 = {"createFile", "Ljava/io/File;", "childPathname", "", "createFileByUrl", "url", "createSubDir", "createTempFile", "tempFilePrefix", "deleteChildFiles", "", "canDelete", "Lkotlin/Function1;", "", "deleteFile", "existsSafely", "getExternalDir", "Landroid/content/Context;", "getExternalDirDirty", "hasContent", "readSafely", "renameToSafely", "to", "startWith", "prefix", "toUri", "Landroid/net/Uri;", "toUriSafely", "writeSafely", "text", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class FileUtilsKt {
    public static final boolean existsSafely(@NotNull File file) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            bool = Boolean.valueOf(file.exists());
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static final boolean hasContent(@Nullable File file) {
        return file != null && existsSafely(file) && file.length() > 0;
    }

    public static final boolean startWith(@NotNull File file, @NotNull String prefix) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return StringsKt.startsWith$default(name, prefix, false, 2, (Object) null);
    }

    @Nullable
    public static final String readSafely(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            return FilesKt.readText$default(file, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean writeSafely(@NotNull File file, @NotNull String text) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Boolean bool = null;
        try {
            FilesKt.writeText$default(file, text, null, 2, null);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    @NotNull
    public static final Uri toUri(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
        return fromFile;
    }

    @Nullable
    public static final Uri toUriSafely(@Nullable File file) {
        if (file == null) {
            return null;
        }
        try {
            return toUri(file);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final File createFile(@Nullable File file, @NotNull String childPathname) {
        Intrinsics.checkNotNullParameter(childPathname, "childPathname");
        return new File(file, childPathname);
    }

    @Nullable
    public static final File createSubDir(@Nullable File file, @NotNull String childPathname) {
        Intrinsics.checkNotNullParameter(childPathname, "childPathname");
        File createFile = createFile(file, childPathname);
        if (existsSafely(createFile) || createFile.mkdirs()) {
            return createFile;
        }
        return null;
    }

    @NotNull
    public static final File createTempFile(@Nullable File file, @NotNull String tempFilePrefix) {
        Intrinsics.checkNotNullParameter(tempFilePrefix, "tempFilePrefix");
        return createFile(file, tempFilePrefix + System.nanoTime());
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "temp";
        }
        return createTempFile(file, str);
    }

    @Nullable
    public static final File createFileByUrl(@Nullable File file, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String generateFileName = FileUtils.generateFileName(url);
        if (generateFileName != null) {
            return createFile(file, generateFileName);
        }
        return null;
    }

    public static final boolean renameToSafely(@NotNull File file, @NotNull File to) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(to, "to");
        try {
            bool = Boolean.valueOf(file.renameTo(to));
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static final boolean deleteFile(@Nullable File file) {
        Boolean bool;
        File[] listFiles;
        if (file == null || !existsSafely(file)) {
            return true;
        }
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "listFiles()");
                for (File file2 : listFiles) {
                    FileUtils.deleteFile(file2);
                }
            }
            bool = Boolean.valueOf(file.delete());
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static /* synthetic */ void deleteChildFiles$default(File file, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: io.bidmachine.util.file.FileUtilsKt$deleteChildFiles$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull File it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        deleteChildFiles(file, function1);
    }

    public static final void deleteChildFiles(@Nullable File file, @NotNull Function1 canDelete) {
        Intrinsics.checkNotNullParameter(canDelete, "canDelete");
        if (file == null || !existsSafely(file)) {
            return;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "listFiles()");
                for (File file2 : listFiles) {
                    if (file2 != null && ((Boolean) canDelete.invoke(file2)).booleanValue()) {
                        deleteFile(file2);
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public static final File getExternalDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (FileUtils.canUseExternalFilesDir()) {
            return context.getExternalFilesDir(null);
        }
        return null;
    }

    @Nullable
    public static final File getExternalDirDirty(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(externalStorageDirectory, "Environment.getExternalS…irectory() ?: return null");
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }
}
