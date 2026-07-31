package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import internal.org.jni_zero.CalledByNative;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class PathUtils {
    private static FutureTask sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    private static String[] getOrComputeDirectoryPaths() {
        if (!sDirPathFetchTask.isDone()) {
            StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                sDirPathFetchTask.run();
                if (allowDiskWrites != null) {
                    allowDiskWrites.close();
                }
            } catch (Throwable th) {
                if (allowDiskWrites != null) {
                    try {
                        allowDiskWrites.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        try {
            return (String[]) sDirPathFetchTask.get();
        } catch (Exception e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    private static String getDirectoryPath(int i) {
        return getOrComputeDirectoryPaths()[i];
    }

    @CalledByNative
    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    @CalledByNative
    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    @CalledByNative
    public static String getDownloadsDirectory() {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return str;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            File[] externalFilesDirs = ContextUtils.getApplicationContext().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return toAbsolutePathStrings(arrayList);
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    @RequiresApi
    public static String[] getExternalDownloadVolumesNames() {
        Set<String> externalVolumeNames;
        StorageVolume storageVolume;
        File directory;
        ArrayList arrayList = new ArrayList();
        externalVolumeNames = MediaStore.getExternalVolumeNames(ContextUtils.getApplicationContext());
        for (String str : externalVolumeNames) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                StorageManager storageManager = (StorageManager) ContextUtils.getApplicationContext().getSystemService(StorageManager.class);
                Uri contentUri = MediaStore.Files.getContentUri(str);
                try {
                    storageVolume = storageManager.getStorageVolume(contentUri);
                    directory = storageVolume.getDirectory();
                    File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                    if (!file.isDirectory()) {
                        Log.w("PathUtils", "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                    }
                    arrayList.add(file);
                } catch (Exception e) {
                    Log.e("PathUtils", "Failed to get storage volume for uri: " + String.valueOf(contentUri), (Throwable) e);
                }
            }
        }
        return toAbsolutePathStrings(arrayList);
    }

    @CalledByNative
    public static long getCacheQuotaBytes() {
        UUID uuidForPath;
        long cacheQuotaBytes;
        try {
            StorageManager storageManager = (StorageManager) ContextUtils.getApplicationContext().getSystemService(StorageManager.class);
            uuidForPath = storageManager.getUuidForPath(new File(getCacheDirectory()));
            cacheQuotaBytes = storageManager.getCacheQuotaBytes(uuidForPath);
            return cacheQuotaBytes;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static String[] toAbsolutePathStrings(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        int i = applicationInfo.flags;
        if ((i & 128) != 0 || (i & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
