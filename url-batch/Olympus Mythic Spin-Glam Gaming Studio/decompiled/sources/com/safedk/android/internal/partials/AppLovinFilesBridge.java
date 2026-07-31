package com.safedk.android.internal.partials;

import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: AppLovinSourceFile */
/* loaded from: classes7.dex */
public class AppLovinFilesBridge {
    public static FileOutputStream fileOutputStreamCtor(File file) throws FileNotFoundException {
        Logger.d("AppLovinFiles|SafeDK: Partial-Files> Lcom/safedk/android/internal/partials/AppLovinFilesBridge;->fileOutputStreamCtor(Ljava/io/File;)Ljava/io/FileOutputStream;");
        if (!SafeDK.ad()) {
            Logger.d("SafeDKFiles", "fileOutputStreamCtor started SafeDK not initialized");
            return new FileOutputStream(file);
        }
        try {
            Object[] objArr = new Object[4];
            objArr[0] = "fileOutputStreamCtor started, file = ";
            objArr[1] = file != null ? file.getPath() : "NA";
            objArr[2] = ", isOnUiThread = ";
            objArr[3] = Boolean.valueOf(n.c());
            Logger.d("SafeDKFiles", objArr);
        } catch (Throwable th) {
            Logger.d("SafeDKFiles", "fileOutputStreamCtor Exception : ", th.getMessage());
        }
        return CreativeInfoManager.a(h.a, file.getPath(), new FileOutputStream(file));
    }
}
