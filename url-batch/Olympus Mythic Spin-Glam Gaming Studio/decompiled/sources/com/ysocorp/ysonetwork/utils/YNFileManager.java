package com.ysocorp.ysonetwork.utils;

import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.ysocorp.ysonetwork.YNManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/* loaded from: classes3.dex */
public class YNFileManager {
    private static final YNFileManager instance = new YNFileManager();

    @Nullable
    private String rootDirTmp;

    public static YNFileManager getInstance() {
        return instance;
    }

    public YNFileManager() {
        tryGetRootDirTmp();
    }

    private void tryGetRootDirTmp() {
        if (this.rootDirTmp == null) {
            String str = null;
            File externalFilesDir = YNManager.mInitApplication.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir + "/ysonetwork-tmp";
            }
            this.rootDirTmp = str;
        }
    }

    @Nullable
    private String getDirTmp(String str) {
        tryGetRootDirTmp();
        if (this.rootDirTmp == null) {
            return null;
        }
        return this.rootDirTmp + "/" + str;
    }

    @Nullable
    private File getFileFromString(String str) {
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    @Nullable
    private File getFileRootDirTmp() {
        tryGetRootDirTmp();
        if (this.rootDirTmp == null) {
            return null;
        }
        return new File(this.rootDirTmp);
    }

    @Nullable
    public String getFileTmp(String str, String str2) {
        return getDirTmp(str) + "/" + str2;
    }

    private void createFileFromStringLegacy(String str, String str2, String str3) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(getFileTmp(str, str2));
            try {
                fileOutputStream.write(str3.getBytes());
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            YNLog.Error("Error creating file from string: " + e.getMessage());
        }
    }

    @RequiresApi
    private void createFileFromStringAndroid26(String str, String str2, String str3) {
        Path path;
        OutputStream newOutputStream;
        try {
            path = Paths.get(getFileTmp(str, str2), new String[0]);
            newOutputStream = Files.newOutputStream(path, new OpenOption[0]);
            try {
                newOutputStream.write(str3.getBytes());
                newOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            YNLog.Error("Error creating file from string: " + e.getMessage());
        }
    }

    public void createFileFromString(String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 26) {
            createFileFromStringAndroid26(str, str2, str3);
        } else {
            createFileFromStringLegacy(str, str2, str3);
        }
    }

    private boolean deleteRecursive(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                deleteRecursive(file2);
            }
        }
        String path = file.getPath();
        boolean delete = file.delete();
        YNLog.Info("[DeleteRecursive] :: path = " + path + ", delete = " + delete);
        return delete;
    }

    private void deleteRootDirectory() {
        File fileRootDirTmp = getFileRootDirTmp();
        boolean z = fileRootDirTmp != null && fileRootDirTmp.exists();
        YNLog.Info("[DeleteRootDirectory] :: dir = " + this.rootDirTmp + ", exist = " + z);
        if (z) {
            YNLog.Info("[DeleteRootDirectory] :: dir = " + this.rootDirTmp + ", delete = " + deleteRecursive(fileRootDirTmp));
        }
    }

    private void createRootDirectory() {
        File fileRootDirTmp = getFileRootDirTmp();
        YNLog.Info("[CreateRootDirectory] :: dir = " + this.rootDirTmp + ", exist = " + (fileRootDirTmp != null && fileRootDirTmp.exists()));
        if (fileRootDirTmp == null || fileRootDirTmp.exists()) {
            return;
        }
        YNLog.Info("[CreateRootDirectory] :: dir = " + this.rootDirTmp + ", mkdir = " + fileRootDirTmp.mkdirs());
    }

    public void deleteDirectory(String str) {
        String dirTmp = getDirTmp(str);
        File fileFromString = getFileFromString(dirTmp);
        boolean z = fileFromString != null && fileFromString.exists();
        YNLog.Info("[DeleteDirectory] :: dir = " + dirTmp + ", exist = " + z);
        if (z) {
            YNLog.Info("[DeleteDirectory] :: dir = " + dirTmp + ", delete = " + deleteRecursive(fileFromString));
        }
    }

    private void createDirectory(String str) {
        String dirTmp = getDirTmp(str);
        File fileFromString = getFileFromString(dirTmp);
        boolean z = fileFromString != null && fileFromString.exists();
        YNLog.Info("[CreateDirectory] :: dir = " + dirTmp + ", exist = " + z);
        if (fileFromString == null || z) {
            return;
        }
        YNLog.Info("[CreateDirectory] :: dir = " + dirTmp + ", mkdir = " + fileFromString.mkdirs());
    }

    public void deleteAndCreateRootDirectory() {
        deleteRootDirectory();
        createRootDirectory();
    }

    public void deleteAndCreateDirectory(String str) {
        deleteDirectory(str);
        createDirectory(str);
    }
}
