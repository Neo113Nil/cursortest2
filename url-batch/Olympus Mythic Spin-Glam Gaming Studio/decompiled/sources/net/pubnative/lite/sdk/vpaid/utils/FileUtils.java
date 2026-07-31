package net.pubnative.lite.sdk.vpaid.utils;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executors;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.VpaidConstants;
import net.pubnative.lite.sdk.vpaid.helpers.FileLockManager;

/* loaded from: classes11.dex */
public class FileUtils {
    private static final String LOG_TAG = "FileUtils";
    private static File cachedParentDir;

    public static void clearCache(Context context) {
        Logger.d(LOG_TAG, "Clear cache");
        File parentDir = getParentDir(context);
        if (parentDir == null) {
            return;
        }
        File[] listFiles = parentDir.listFiles();
        int i = 0;
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i2 = 0;
            while (i < length) {
                File file = listFiles[i];
                if (!file.isDirectory()) {
                    file.delete();
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        Logger.d(LOG_TAG, "Deleted " + i + " file(s)");
    }

    public static void deleteExpiredFiles(Context context) {
        File parentDir = getParentDir(context);
        if (parentDir == null) {
            return;
        }
        File[] listFiles = parentDir.listFiles();
        int i = 0;
        if (listFiles != null && listFiles.length > 0) {
            int i2 = 0;
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    boolean z = file.lastModified() + 115200000 < System.currentTimeMillis();
                    boolean z2 = file.length() == 0;
                    if (z || z2) {
                        if (!FileLockManager.getInstance().isLocked(file.getAbsolutePath())) {
                            file.delete();
                            Logger.d(LOG_TAG, "Deleted cached file: " + file.getAbsolutePath());
                        } else if (z) {
                            FileLockManager.getInstance().forceRelease(file.getAbsolutePath());
                            if (file.delete()) {
                                Logger.w(LOG_TAG, "Force deleted EXPIRED file (was locked): " + file.getAbsolutePath());
                            }
                        } else {
                            Logger.d(LOG_TAG, "Skipped deletion (empty file in use): " + file.getAbsolutePath());
                        }
                    }
                    i2++;
                }
            }
            i = i2;
        }
        String str = LOG_TAG;
        Logger.d(str, "In cache " + i + " file(s)");
        Logger.d(str, "Cache time: 32 hours");
    }

    public static File getParentDir(Context context) {
        File file = cachedParentDir;
        if (file != null) {
            return file;
        }
        if (context != null) {
            cachedParentDir = context.getExternalFilesDir(VpaidConstants.FILE_FOLDER);
        }
        return cachedParentDir;
    }

    public static void initParentDirAsync(final Context context) {
        if (context == null || cachedParentDir != null) {
            return;
        }
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.utils.FileUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FileUtils.lambda$initParentDirAsync$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initParentDirAsync$0(Context context) {
        cachedParentDir = context.getExternalFilesDir(VpaidConstants.FILE_FOLDER);
    }

    public static String obtainHashName(String str) {
        return Long.toString(str.hashCode() & 4294967295L);
    }
}
