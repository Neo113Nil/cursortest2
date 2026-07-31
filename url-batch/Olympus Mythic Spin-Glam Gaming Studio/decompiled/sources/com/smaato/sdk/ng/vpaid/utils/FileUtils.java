package com.smaato.sdk.ng.vpaid.utils;

import android.content.Context;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.VpaidConstants;
import com.smaato.sdk.ng.vpaid.helpers.FileLockManager;
import java.io.File;
import java.util.concurrent.Executors;

/* loaded from: classes14.dex */
public class FileUtils {
    private static final String a = "FileUtils";
    private static File b;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context) {
        b = context.getExternalFilesDir(VpaidConstants.FILE_FOLDER);
    }

    public static void clearCache(Context context) {
        Logger.d(a, "Clear cache");
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
        Logger.d(a, "Deleted " + i + " file(s)");
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
                            Logger.d(a, "Deleted cached file: " + file.getAbsolutePath());
                        } else if (z) {
                            FileLockManager.getInstance().forceRelease(file.getAbsolutePath());
                            if (file.delete()) {
                                Logger.w(a, "Force deleted EXPIRED file (was locked): " + file.getAbsolutePath());
                            }
                        } else {
                            Logger.d(a, "Skipped deletion (empty file in use): " + file.getAbsolutePath());
                        }
                    }
                    i2++;
                }
            }
            i = i2;
        }
        String str = a;
        Logger.d(str, "In cache " + i + " file(s)");
        Logger.d(str, "Cache time: 32 hours");
    }

    public static File getParentDir(Context context) {
        File file = b;
        if (file != null) {
            return file;
        }
        if (context != null) {
            b = context.getExternalFilesDir(VpaidConstants.FILE_FOLDER);
        }
        return b;
    }

    public static void initParentDirAsync(final Context context) {
        if (context == null || b != null) {
            return;
        }
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.utils.FileUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FileUtils.a(context);
            }
        });
    }

    public static String obtainHashName(String str) {
        return Long.toString(str.hashCode() & 4294967295L);
    }
}
