package com.mbridge.msdk.config.component.common.file;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import com.safedk.android.utils.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ComponentFileUtil.java */
/* loaded from: classes12.dex */
public class a {
    private static Map<String, Object> a;

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(String str, String str2, int i, String str3) {
        b bVar;
        b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String e = e(str);
            String c = c(str, str2);
            bVar = new b();
            try {
                bVar.a(a());
                bVar.c(e);
                if (!e.contains(n.d)) {
                    c = c.concat(e);
                }
                bVar.b(c);
                if (e.contains("zip")) {
                    bVar.d(e(str, str2));
                    String b = b(str, str2, i, str3);
                    bVar.a(b(b));
                    bVar.e(b);
                } else {
                    bVar.a(b(bVar.a()));
                }
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
                q0.b("ComponentFileUtil", th.getMessage());
                bVar = bVar2;
                if (bVar != null) {
                }
                return bVar;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (bVar != null) {
            a(bVar.a());
        }
        return bVar;
    }

    public static b b(String str, String str2) {
        return a(str, str2, 0, (String) null);
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a() + "/" + c(str, str2) + "/";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0022, B:14:0x0029), top: B:8:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(String str) {
        String str2;
        String str3 = "";
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            try {
                if (!TextUtils.isEmpty(lastPathSegment)) {
                    String[] split = lastPathSegment.split("\\.");
                    if (split.length > 0) {
                        str2 = split[split.length - 1];
                        return !TextUtils.isEmpty(str2) ? "" : ".".concat(str2);
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                }
            } catch (Throwable th) {
                str3 = str2;
                th = th;
                q0.b("ComponentFileUtil", th.getMessage());
                return str3;
            }
            str2 = "";
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static b f(String str) {
        return a(str, (String) null, 0, (String) null);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String concat = a().concat(c("", str));
            return new File(concat).exists() ? concat : "";
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", "getLocalFilePathByCacheKey error: " + th.getMessage(), th);
            return "";
        }
    }

    private static String h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static boolean j(String str) {
        try {
            Context d = c.n().d();
            if (d != null && !TextUtils.isEmpty(str)) {
                AssetManager assets = d.getAssets();
                try {
                    assets.open(str).close();
                    return true;
                } catch (IOException unused) {
                    String[] list = assets.list(str);
                    if (list != null) {
                        return list.length > 0;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", "isAssetPathExist error: " + th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(String str) {
        com.mbridge.msdk.config.component.database.a.a().c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    private static String b(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String e = e(str, str2);
        String i2 = i(str);
        String h = h(str);
        if (!TextUtils.isEmpty(i2)) {
            if (i == 0) {
                return e + i2 + "/" + h;
            }
            if (i == 1) {
                return e + i2 + ".html";
            }
            if (i == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(e);
                if (!TextUtils.isEmpty(h)) {
                    i2 = h;
                }
                sb.append(i2);
                sb.append("_");
                if (str3.equals("0")) {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(".xml");
                return sb.toString();
            }
        }
        return "";
    }

    public static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return SameMD5.getMD5(str2);
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                URL url = new URL(str);
                return SameMD5.getMD5(url.getProtocol() + "://" + url.getHost() + url.getPath());
            }
        } catch (Exception e) {
            q0.b("ComponentFileUtil", e.getMessage(), e);
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00e1, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e5, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e6, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("ComponentFileUtil", "unzip error", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00f6, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00fa, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00fb, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("ComponentFileUtil", "unzip error", r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(String str, String str2) {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        ?? r9;
        IOException e;
        Throwable th2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        InputStream inputStream3 = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            ?? r7 = 0;
            while (entries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement == null) {
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e2) {
                                    q0.b("ComponentFileUtil", "unzip error", e2);
                                }
                            }
                            if (r7 != 0) {
                                try {
                                    r7.close();
                                } catch (IOException e3) {
                                    q0.b("ComponentFileUtil", "unzip error", e3);
                                }
                            }
                            return false;
                        }
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                            File file2 = new File(str2 + name);
                            try {
                                str3 = file2.getCanonicalPath();
                            } catch (IOException unused) {
                                str3 = "";
                            }
                            if (!TextUtils.isEmpty(str3) && !str3.startsWith("..") && !str3.startsWith("../")) {
                                if (nextElement.isDirectory()) {
                                    file2.mkdirs();
                                } else {
                                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                        file2.getParentFile().mkdirs();
                                    }
                                    r9 = MintegralFilesBridge.fileOutputStreamCtor(file2);
                                    try {
                                        inputStream3 = zipFile.getInputStream(nextElement);
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int read = inputStream3.read(bArr, 0, 1024);
                                            if (read == -1) {
                                                break;
                                            }
                                            r9.write(bArr, 0, read);
                                            r9.flush();
                                        }
                                        r7 = r9;
                                    } catch (IOException e4) {
                                        e = e4;
                                        try {
                                            q0.b("ComponentFileUtil", "unzip error", e);
                                            if (inputStream3 != null) {
                                            }
                                            if (r9 != 0) {
                                            }
                                            return false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = inputStream3;
                                            inputStream3 = r9;
                                            r9 = inputStream3;
                                            inputStream3 = inputStream;
                                            th2 = th;
                                            if (inputStream3 != null) {
                                                try {
                                                    inputStream3.close();
                                                } catch (IOException e5) {
                                                    q0.b("ComponentFileUtil", "unzip error", e5);
                                                }
                                            }
                                            if (r9 == 0) {
                                                throw th2;
                                            }
                                            try {
                                                r9.close();
                                                throw th2;
                                            } catch (IOException e6) {
                                                q0.b("ComponentFileUtil", "unzip error", e6);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        if (inputStream3 != null) {
                                        }
                                        if (r9 == 0) {
                                        }
                                    }
                                }
                            }
                            if (r7 != 0) {
                                try {
                                    r7.close();
                                } catch (IOException e7) {
                                    q0.b("ComponentFileUtil", "unzip error", e7);
                                }
                            }
                            return false;
                        }
                        if (r7 != 0) {
                            try {
                                r7.close();
                            } catch (IOException e8) {
                                q0.b("ComponentFileUtil", "unzip error", e8);
                            }
                        }
                        return false;
                    } catch (IOException e9) {
                        iOException = e9;
                        inputStream2 = inputStream3;
                        inputStream3 = r7;
                        r9 = inputStream3;
                        inputStream3 = inputStream2;
                        e = iOException;
                        q0.b("ComponentFileUtil", "unzip error", e);
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e10) {
                                q0.b("ComponentFileUtil", "unzip error", e10);
                            }
                        }
                        if (r9 != 0) {
                            try {
                                r9.close();
                            } catch (IOException e11) {
                                q0.b("ComponentFileUtil", "unzip error", e11);
                            }
                        }
                        return false;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream3;
                    inputStream3 = r7;
                    r9 = inputStream3;
                    inputStream3 = inputStream;
                    th2 = th;
                    if (inputStream3 != null) {
                    }
                    if (r9 == 0) {
                    }
                }
            }
            zipFile.close();
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (IOException e12) {
                    q0.b("ComponentFileUtil", "unzip error", e12);
                }
            }
            if (r7 == 0) {
                return true;
            }
            try {
                r7.close();
                return true;
            } catch (IOException e13) {
                q0.b("ComponentFileUtil", "unzip error", e13);
                return true;
            }
        } catch (IOException e14) {
            iOException = e14;
            inputStream2 = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
        }
    }

    private static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            List<String> queryParameters = parse.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters != null && !queryParameters.isEmpty()) {
                return queryParameters.get(0);
            }
            String path = parse.getPath();
            if (TextUtils.isEmpty(path)) {
                return "";
            }
            String substring = path.substring(path.lastIndexOf(47) + 1);
            return !TextUtils.isEmpty(substring) ? substring.replace(".zip", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                    str2 = SameMD5.hexEncode(messageDigest.digest());
                    messageDigest.reset();
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                q0.b("ComponentFileUtil", th.getMessage());
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x0034, B:13:0x0038, B:15:0x003e, B:18:0x0047, B:21:0x0052, B:24:0x005d, B:26:0x0067, B:29:0x0070, B:31:0x0087, B:36:0x0017, B:38:0x0021, B:39:0x0029), top: B:5:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(String str) {
        Map<String, Object> map;
        Map<String, Object> map2;
        Object obj;
        Object obj2;
        String valueOf;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            map = a;
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", "getAssetsResPathWithCacheKey error: " + th.getMessage(), th);
        }
        if (map != null) {
            if (map.isEmpty()) {
            }
            map2 = a;
            if (map2 != null && !map2.isEmpty() && a.containsKey(str)) {
                obj = a.get(str);
                if ((obj instanceof Map) || (obj2 = ((Map) obj).get("path")) == null) {
                    return "";
                }
                valueOf = String.valueOf(obj2);
                if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase(POBCommonConstants.NULL_VALUE)) {
                    str2 = "template/" + valueOf;
                    if (j(str2)) {
                        return "assets://" + str2 + "/";
                    }
                    return "";
                }
            }
            return "";
        }
        String b = b();
        if (TextUtils.isEmpty(b)) {
            a = new HashMap();
        } else {
            a = new e().a(b);
        }
        map2 = a;
        if (map2 != null) {
            obj = a.get(str);
            if (obj instanceof Map) {
                return "";
            }
            valueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(valueOf)) {
                str2 = "template/" + valueOf;
                if (j(str2)) {
                }
                return "";
            }
        }
        return "";
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a2 = a();
        String c = c(str, str2);
        String i = i(str);
        if (!TextUtils.isEmpty(i)) {
            String str3 = a2 + c + "/" + i + "/";
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", th.getMessage(), th);
        }
        return new File(str).exists();
    }

    public static String a() {
        File file = new File(c.n().d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    private static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.file.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.k(str);
            }
        });
    }

    private static String b() {
        InputStream inputStream = null;
        try {
            Context d = c.n().d();
            if (d == null) {
                return "";
            }
            inputStream = d.getAssets().open("template/metadata.json");
            byte[] bArr = new byte[8192];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                sb.append(new String(bArr, 0, read, "UTF-8"));
            }
            String sb2 = sb.toString();
            try {
                inputStream.close();
            } catch (IOException e) {
                q0.b("ComponentFileUtil", e.getMessage());
            }
            return sb2;
        } catch (Throwable th) {
            try {
                q0.b("ComponentFileUtil", "readAssetString error: " + th.getMessage(), th);
                return "";
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        q0.b("ComponentFileUtil", e2.getMessage());
                    }
                }
            }
        }
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String substring = str.substring(str.indexOf("?") + 1);
        if (!TextUtils.isEmpty(substring)) {
            str3 = "?" + substring;
        }
        return "file://" + str2 + str3;
    }

    public static b a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, Object> d = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM FileDB WHERE originalURL=".concat("'").concat(str).concat("'"));
            if (d != null) {
                Object obj = d.get("data");
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        Object obj2 = list.get(0);
                        if (obj2 instanceof Map) {
                            return a((Map<String, Object>) obj2, str, i, str2);
                        }
                    }
                }
            }
            return a(d, str, i, str2);
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", th.getMessage());
            return null;
        }
    }

    private static b a(Map<String, Object> map, String str, int i, String str2) {
        b a2;
        if (map == null) {
            return null;
        }
        try {
            if (map.isEmpty()) {
                return null;
            }
            String valueOf = String.valueOf(map.get("cacheKey"));
            if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase(POBCommonConstants.NULL_VALUE)) {
                a2 = a(str, valueOf, i, str2);
            } else {
                a2 = a(str, (String) null, i, str2);
            }
            return a2;
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", th.getMessage());
            return null;
        }
    }
}
