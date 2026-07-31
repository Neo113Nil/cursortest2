package sg.bigo.ads.c;

import android.system.Os;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes14.dex */
public final class c {
    public static String a(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            try {
                bufferedReader.close();
                return readLine;
            } catch (IOException unused2) {
                return readLine;
            }
        } catch (Exception unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        for (String str3 : str2.split(File.pathSeparator)) {
            String trim = str3.trim();
            if (!trim.isEmpty()) {
                File file = new File(trim, str);
                if (file.exists() && file.canExecute()) {
                    return file.getPath();
                }
            }
        }
        return "";
    }

    public static boolean a(int i, String str) {
        return Os.stat(str).st_uid == i;
    }
}
