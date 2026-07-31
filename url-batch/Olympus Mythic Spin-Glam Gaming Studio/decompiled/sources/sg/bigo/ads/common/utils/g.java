package sg.bigo.ads.common.utils;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class g {
    public static long a(long j, int i) {
        char c;
        if (i == 2) {
            c = '\n';
        } else if (i == 3) {
            c = 20;
        } else {
            if (i != 4) {
                return j;
            }
            c = 30;
        }
        return j >> c;
    }

    public static long a(String str, int i) {
        File file = new File(str);
        if (file.exists()) {
            return a(file.length(), i);
        }
        return 0L;
    }

    public static String a(String str) {
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            if (TextUtils.isEmpty(fileExtensionFromUrl)) {
                return null;
            }
            return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.delete();
    }

    public static boolean a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str, str2);
        boolean z = false;
        try {
            boolean mkdirs = !file.exists() ? file.mkdirs() : true;
            if (file2.exists()) {
                return mkdirs;
            }
            if (mkdirs) {
                if (file2.createNewFile()) {
                    z = true;
                }
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void b(@NonNull File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        a(file2);
                    }
                }
            }
        }
        a(file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str) {
        FileInputStream fileInputStream;
        Exception e;
        File file = new File(str);
        boolean z = false;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    byte[] bArr = new byte[1024];
                    fileInputStream.read(bArr);
                    String str2 = new String(bArr);
                    if (str2.contains("ftyp")) {
                        if (str2.contains("moov")) {
                            z = true;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    sg.bigo.ads.bn.a.a(0, "FileUtils", "read file " + file.getPath() + " failed" + e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException unused2) {
        }
        return z;
    }

    public static boolean b(String str, String str2) {
        if (r.a((CharSequence) str) || r.a((CharSequence) str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    public static void c(String str, String str2) {
        if (r.a((CharSequence) str) || r.a((CharSequence) str2)) {
            return;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public static boolean c(File file) {
        boolean z = false;
        try {
            File parentFile = file.getParentFile();
            boolean mkdirs = !parentFile.exists() ? parentFile.mkdirs() : true;
            if (file.exists()) {
                return mkdirs;
            }
            if (mkdirs) {
                if (file.createNewFile()) {
                    z = true;
                }
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        if (r.a((CharSequence) str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String d(String str) {
        return str + ".tmp";
    }

    public static String e(String str) {
        return str + ".tmp";
    }
}
