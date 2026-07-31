package io.bidmachine.util.file;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.util.Utils;
import io.bidmachine.util.UtilsKt;
import java.io.File;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u001c\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0014\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lio/bidmachine/util/file/FileUtils;", "", "()V", "TEMP_PREFIX", "", "canUseExternalFilesDir", "", "createFile", "Ljava/io/File;", "dir", "childPathname", "createFileByUrl", "url", "createSubDir", "createTempFile", "tempFilePrefix", "deleteFile", "file", "generateFileName", "getExternalDir", "context", "Landroid/content/Context;", "getExternalDirDirty", "hasContent", "readSafely", "renameToSafely", "from", "to", "startWith", "prefix", "toUri", "Landroid/net/Uri;", "toUriSafely", "writeSafely", "text", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    public static final String TEMP_PREFIX = "temp";

    private FileUtils() {
    }

    public static final boolean hasContent(@Nullable File file) {
        return FileUtilsKt.hasContent(file);
    }

    public static final boolean startWith(@NotNull File file, @NotNull String prefix) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return FileUtilsKt.startWith(file, prefix);
    }

    @Nullable
    public static final String readSafely(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return FileUtilsKt.readSafely(file);
    }

    public static final boolean writeSafely(@NotNull File file, @NotNull String text) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(text, "text");
        return FileUtilsKt.writeSafely(file, text);
    }

    @NotNull
    public static final Uri toUri(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return FileUtilsKt.toUri(file);
    }

    @Nullable
    public static final Uri toUriSafely(@Nullable File file) {
        return FileUtilsKt.toUriSafely(file);
    }

    @NotNull
    public static final File createFile(@Nullable File dir, @NotNull String childPathname) {
        Intrinsics.checkNotNullParameter(childPathname, "childPathname");
        return FileUtilsKt.createFile(dir, childPathname);
    }

    @Nullable
    public static final File createSubDir(@Nullable File dir, @NotNull String childPathname) {
        Intrinsics.checkNotNullParameter(childPathname, "childPathname");
        return FileUtilsKt.createSubDir(dir, childPathname);
    }

    @NotNull
    public static final File createTempFile(@Nullable File dir) {
        return createTempFile(dir, "temp");
    }

    @NotNull
    public static final File createTempFile(@Nullable File dir, @NotNull String tempFilePrefix) {
        Intrinsics.checkNotNullParameter(tempFilePrefix, "tempFilePrefix");
        return FileUtilsKt.createTempFile(dir, tempFilePrefix);
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "temp";
        }
        return createTempFile(file, str);
    }

    @Nullable
    public static final File createFileByUrl(@Nullable File dir, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return FileUtilsKt.createFileByUrl(dir, url);
    }

    @Nullable
    public static final String generateFileName(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] applyMD5 = UtilsKt.applyMD5(bytes);
        if (applyMD5 == null) {
            return null;
        }
        return new BigInteger(applyMD5).abs().toString(36);
    }

    public static final boolean renameToSafely(@NotNull File from, @NotNull File to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return FileUtilsKt.renameToSafely(from, to);
    }

    public static final boolean deleteFile(@Nullable File file) {
        return FileUtilsKt.deleteFile(file);
    }

    public static final boolean canUseExternalFilesDir() {
        return Utils.isExternalMemoryAvailable();
    }

    @Nullable
    public static final File getExternalDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FileUtilsKt.getExternalDir(context);
    }

    @Nullable
    public static final File getExternalDirDirty(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FileUtilsKt.getExternalDirDirty(context);
    }
}
