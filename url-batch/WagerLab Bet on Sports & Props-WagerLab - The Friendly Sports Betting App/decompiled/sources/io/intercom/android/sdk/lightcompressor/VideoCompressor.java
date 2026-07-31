package io.intercom.android.sdk.lightcompressor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SaveLocation;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.apache.commons.io.IOUtils;

/* compiled from: VideoCompressor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0007H\u0007JJ\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JJ\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\"JQ\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\b\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010 2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010(J(\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020$H\u0003J\u0018\u0010-\u001a\u00020 2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\fH\u0002J\u001f\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u00101R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\t\u00102\u001a\u000203X\u0096\u0005¨\u00064"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/VideoCompressor;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "job", "Lkotlinx/coroutines/Job;", "start", "", "context", "Landroid/content/Context;", "uris", "", "Landroid/net/Uri;", "isStreamable", "", "sharedStorageConfiguration", "Lio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;", "appSpecificStorageConfiguration", "Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;", "configureWith", "Lio/intercom/android/sdk/lightcompressor/config/Configuration;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/intercom/android/sdk/lightcompressor/CompressionListener;", "cancel", "doVideoCompression", "configuration", "startCompression", "Lio/intercom/android/sdk/lightcompressor/video/Result;", FirebaseAnalytics.Param.INDEX, "", "srcUri", "destPath", "", "streamableFile", "(ILandroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/lightcompressor/config/Configuration;Lio/intercom/android/sdk/lightcompressor/CompressionListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveVideoFile", "Ljava/io/File;", "filePath", "videoName", "shouldSave", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/File;", "saveVideoInExternal", "videoFileName", "saveLocation", "videoFile", "getMediaPath", "uri", "validatedFileName", "name", "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VideoCompressor implements CoroutineScope {
    public static final VideoCompressor INSTANCE = new VideoCompressor();
    private static Job job;
    private final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();

    /* compiled from: VideoCompressor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SaveLocation.values().length];
            try {
                iArr[SaveLocation.downloads.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SaveLocation.pictures.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final void start(Context context, List<? extends Uri> uris, Configuration configureWith, CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        start$default(context, uris, false, null, null, configureWith, listener, 28, null);
    }

    @JvmStatic
    public static final void start(Context context, List<? extends Uri> uris, boolean z, Configuration configureWith, CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        start$default(context, uris, z, null, null, configureWith, listener, 24, null);
    }

    @JvmStatic
    public static final void start(Context context, List<? extends Uri> uris, boolean z, SharedStorageConfiguration sharedStorageConfiguration, Configuration configureWith, CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        start$default(context, uris, z, sharedStorageConfiguration, null, configureWith, listener, 16, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    private VideoCompressor() {
    }

    public static /* synthetic */ void start$default(Context context, List list, boolean z, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        start(context, list, z, (i & 8) != 0 ? null : sharedStorageConfiguration, (i & 16) != 0 ? null : appSpecificStorageConfiguration, configuration, compressionListener);
    }

    @JvmStatic
    public static final void start(Context context, List<? extends Uri> uris, boolean isStreamable, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configureWith, CompressionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(configureWith, "configureWith");
        Intrinsics.checkNotNullParameter(listener, "listener");
        configureWith.getVideoNames().size();
        uris.size();
        INSTANCE.doVideoCompression(context, uris, isStreamable, sharedStorageConfiguration, appSpecificStorageConfiguration, configureWith, listener);
    }

    @JvmStatic
    public static final void cancel() {
        Job job2 = job;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Compressor.INSTANCE.setRunning(false);
    }

    private final void doVideoCompression(Context context, List<? extends Uri> uris, boolean isStreamable, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener listener) {
        Job launch$default;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int size = uris.size();
        for (int i = 0; i < size; i++) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new VideoCompressor$doVideoCompression$1(context, sharedStorageConfiguration, appSpecificStorageConfiguration, isStreamable, configuration, i, objectRef, uris, listener, null), 2, null);
            job = launch$default;
        }
    }

    static /* synthetic */ Object startCompression$default(VideoCompressor videoCompressor, int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, Continuation continuation, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        return videoCompressor.startCompression(i, context, uri, str, str2, configuration, compressionListener, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startCompression(int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new VideoCompressor$startCompression$2(i, context, uri, str, str2, configuration, compressionListener, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File saveVideoFile(Context context, String filePath, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Boolean isStreamable, String videoName, Boolean shouldSave) {
        File parentFile;
        String str;
        String path;
        if (filePath == null) {
            return null;
        }
        File file = new File(filePath);
        if (sharedStorageConfiguration != null) {
            VideoCompressor videoCompressor = INSTANCE;
            String validatedFileName = videoCompressor.validatedFileName(videoName, isStreamable);
            SaveLocation saveAt = sharedStorageConfiguration.getSaveAt();
            int i = saveAt == null ? -1 : WhenMappings.$EnumSwitchMapping$0[saveAt.ordinal()];
            if (i == 1) {
                str = Environment.DIRECTORY_DOWNLOADS;
            } else if (i == 2) {
                str = Environment.DIRECTORY_PICTURES;
            } else {
                str = Environment.DIRECTORY_MOVIES;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                if (sharedStorageConfiguration.getSubFolderName() != null) {
                    str = str + IOUtils.DIR_SEPARATOR_UNIX + sharedStorageConfiguration.getSubFolderName();
                }
                if (Intrinsics.areEqual((Object) shouldSave, (Object) true)) {
                    Intrinsics.checkNotNull(str);
                    videoCompressor.saveVideoInExternal(context, validatedFileName, str, file);
                    new File(context.getFilesDir(), validatedFileName).delete();
                    return new File("/storage/emulated/0/" + str, validatedFileName);
                }
                return new File(context.getFilesDir(), validatedFileName);
            }
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str);
            if (sharedStorageConfiguration.getSubFolderName() != null) {
                path = externalStoragePublicDirectory + IOUtils.DIR_SEPARATOR_UNIX + sharedStorageConfiguration.getSubFolderName();
            } else {
                path = externalStoragePublicDirectory.getPath();
            }
            File file2 = new File(path, validatedFileName);
            if (!file2.exists()) {
                try {
                    File parentFile2 = file2.getParentFile();
                    if (parentFile2 != null) {
                        parentFile2.mkdirs();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Intrinsics.areEqual((Object) shouldSave, (Object) true)) {
                FileInputStream openFileOutput = context.openFileOutput(validatedFileName, 0);
                try {
                    FileOutputStream fileOutputStream = openFileOutput;
                    openFileOutput = new FileInputStream(file);
                    try {
                        FileInputStream fileInputStream = openFileOutput;
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(openFileOutput, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(openFileOutput, null);
                    } finally {
                    }
                } finally {
                }
            }
            return file2;
        }
        String validatedFileName2 = INSTANCE.validatedFileName(videoName, isStreamable);
        Intrinsics.checkNotNull(appSpecificStorageConfiguration);
        if (appSpecificStorageConfiguration.getSubFolderName() != null) {
            validatedFileName2 = appSpecificStorageConfiguration.getSubFolderName() + IOUtils.DIR_SEPARATOR_UNIX + validatedFileName2;
        }
        if (!new File(context.getFilesDir() + IOUtils.DIR_SEPARATOR_UNIX + validatedFileName2).exists() && (parentFile = new File(context.getFilesDir() + IOUtils.DIR_SEPARATOR_UNIX + validatedFileName2).getParentFile()) != null) {
            parentFile.mkdirs();
        }
        return new File(context.getFilesDir(), validatedFileName2);
    }

    private final void saveVideoInExternal(Context context, String videoFileName, String saveLocation, File videoFile) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", videoFileName);
        contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
        contentValues.put("relative_path", saveLocation);
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        if (Intrinsics.areEqual(saveLocation, Environment.DIRECTORY_DOWNLOADS)) {
            contentUri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        }
        Uri insert = context.getContentResolver().insert(contentUri, contentValues);
        if (insert == null) {
            return;
        }
        FileInputStream openFileDescriptor = context.getContentResolver().openFileDescriptor(insert, "rw");
        try {
            ParcelFileDescriptor parcelFileDescriptor = openFileDescriptor;
            if (parcelFileDescriptor != null) {
                openFileDescriptor = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    FileOutputStream fileOutputStream = openFileDescriptor;
                    openFileDescriptor = new FileInputStream(videoFile);
                    try {
                        FileInputStream fileInputStream = openFileDescriptor;
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(openFileDescriptor, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(openFileDescriptor, null);
                        Unit unit3 = Unit.INSTANCE;
                    } finally {
                    }
                } finally {
                }
            }
            CloseableKt.closeFinally(openFileDescriptor, null);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(insert, contentValues, null, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getMediaPath(Context context, Uri uri) {
        Throwable th;
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                uri = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                try {
                    if (uri != 0) {
                        int columnIndexOrThrow = uri.getColumnIndexOrThrow("_data");
                        uri.moveToFirst();
                        String string = uri.getString(columnIndexOrThrow);
                        Intrinsics.checkNotNull(string);
                        uri.close();
                        return string;
                    }
                    throw new Exception();
                } catch (Exception unused) {
                    File file = new File(context.getApplicationInfo().dataDir + File.separator + System.currentTimeMillis());
                    InputStream openInputStream = contentResolver.openInputStream(uri);
                    if (openInputStream != null) {
                        FileOutputStream fileOutputStream = openInputStream;
                        try {
                            InputStream inputStream = fileOutputStream;
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream2 = fileOutputStream;
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(fileOutputStream, null);
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(fileOutputStream, null);
                            } finally {
                            }
                        } finally {
                        }
                    }
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    if (uri != 0) {
                        uri.close();
                    }
                    return absolutePath;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = uri;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Exception unused2) {
            uri = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
        }
    }

    private final String validatedFileName(String name, Boolean isStreamable) {
        if (isStreamable != null && isStreamable.booleanValue()) {
            name = name + "_temp";
        }
        return !StringsKt.contains$default((CharSequence) name, (CharSequence) "mp4", false, 2, (Object) null) ? name + ".mp4" : name;
    }
}
