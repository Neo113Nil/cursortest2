package com.mobilefuse.videoplayer;

import android.content.Context;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.crypto.Crypto;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.safedk.android.internal.partials.MobileFuseFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoCache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoCache;", "", "()V", "MF_CACHE_DIR_NAME", "", "initialized", "", "cacheFile", "context", "Landroid/content/Context;", "inputStream", "Ljava/io/InputStream;", "cachedFileExists", "key", "clearMfCache", "", "deleteCachedFile", "deleteContents", "dir", "Ljava/io/File;", "getCacheDirectory", "getCachedFilePath", "initialize", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class VideoCache {

    @NotNull
    public static final VideoCache INSTANCE = new VideoCache();
    private static final String MF_CACHE_DIR_NAME = "mobilefuse_video";
    private static boolean initialized;

    private final void clearMfCache(Context context) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            VideoCache videoCache = INSTANCE;
            File cacheDirectory = videoCache.getCacheDirectory(context);
            if (cacheDirectory == null) {
                throw new IOException("can't get path to video cache dir");
            }
            videoCache.deleteContents(cacheDirectory);
        } catch (Throwable th) {
            int i = VideoCache$clearMfCache$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private VideoCache() {
    }

    public final synchronized void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (initialized) {
            return;
        }
        initialized = true;
        clearMfCache(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String cacheFile(@NotNull Context context, @NotNull InputStream inputStream) {
        Either errorResult;
        File cacheDirectory;
        String sha1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object obj = null;
        try {
            cacheDirectory = INSTANCE.getCacheDirectory(context);
        } catch (Throwable th) {
            if (VideoCache$cacheFile$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (cacheDirectory != null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
            sha1 = Crypto.sha1(uuid);
            if (sha1 != null) {
                try {
                    FileOutputStream fileOutputStreamCtor = MobileFuseFilesBridge.fileOutputStreamCtor(new File(cacheDirectory, sha1));
                    try {
                        ByteStreamsKt.copyTo$default(inputStream, fileOutputStreamCtor, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStreamCtor, null);
                        CloseableKt.closeFinally(inputStream, null);
                        errorResult = new SuccessResult(sha1);
                        if (!(errorResult instanceof ErrorResult)) {
                        } else {
                            if (!(errorResult instanceof SuccessResult)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj = ((SuccessResult) errorResult).getValue();
                        }
                        return (String) obj;
                    } finally {
                    }
                } finally {
                }
            }
        }
        sha1 = null;
        errorResult = new SuccessResult(sha1);
        if (!(errorResult instanceof ErrorResult)) {
        }
        return (String) obj;
    }

    public final boolean cachedFileExists(@NotNull Context context, @NotNull String key) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            errorResult = new SuccessResult(Boolean.valueOf(cacheDirectory == null ? false : new File(cacheDirectory, key).exists()));
        } catch (Throwable th) {
            if (VideoCache$cachedFileExists$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.FALSE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    public final boolean deleteCachedFile(@NotNull Context context, @NotNull String key) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            errorResult = new SuccessResult(Boolean.valueOf(cacheDirectory == null ? false : new File(cacheDirectory, key).delete()));
        } catch (Throwable th) {
            if (VideoCache$deleteCachedFile$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.FALSE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @Nullable
    public final String getCachedFilePath(@NotNull Context context, @NotNull String key) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object obj = null;
        try {
            File cacheDirectory = INSTANCE.getCacheDirectory(context);
            errorResult = new SuccessResult(cacheDirectory == null ? null : new File(cacheDirectory, key).getAbsolutePath());
        } catch (Throwable th) {
            if (VideoCache$getCachedFilePath$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((SuccessResult) errorResult).getValue();
        }
        return (String) obj;
    }

    private final File getCacheDirectory(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, MF_CACHE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final void deleteContents(File dir) {
        File[] listFiles = dir.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + dir);
        }
        for (File file : listFiles) {
            Intrinsics.checkNotNullExpressionValue(file, "file");
            if (file.isDirectory()) {
                deleteContents(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete file: " + file);
            }
        }
    }
}
