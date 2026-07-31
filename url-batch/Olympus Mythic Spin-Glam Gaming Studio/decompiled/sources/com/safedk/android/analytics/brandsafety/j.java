package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes12.dex */
public class j {
    private static final String a = "FileUtils";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File a(String str, String str2, String str3) {
        HttpURLConnection httpURLConnection;
        Object obj;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        Exception e;
        File file = new File(str2);
        BufferedInputStream bufferedInputStream2 = null;
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file, str3);
        if (file2.exists() && file2.length() > 0) {
            return file2;
        }
        try {
            try {
                str = (HttpURLConnection) new URL(str).openConnection();
            } catch (Throwable th) {
                th = th;
            }
            try {
                str.setInstanceFollowRedirects(true);
                str.setConnectTimeout(20000);
                str.setReadTimeout(30000);
                str.setRequestProperty("User-Agent", "Android");
                int responseCode = str.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    bufferedInputStream = new BufferedInputStream(str.getInputStream());
                    try {
                        fileOutputStream = new FileOutputStream(file2, false);
                        try {
                            byte[] bArr = new byte[65536];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            if (file2.length() != 0) {
                                a(bufferedInputStream);
                                a(fileOutputStream);
                                if (str != 0) {
                                    str.disconnect();
                                }
                                return file2;
                            }
                            Logger.d(a, "download and save video - download file is empty, return.");
                            a(bufferedInputStream);
                            a(fileOutputStream);
                            if (str != 0) {
                                str.disconnect();
                            }
                            return null;
                        } catch (Exception e2) {
                            e = e2;
                            Logger.d(a, "download and save video - exception= ", e);
                            a(bufferedInputStream);
                            a(fileOutputStream);
                            if (str != 0) {
                                str.disconnect();
                            }
                            return file2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                        e = e;
                        Logger.d(a, "download and save video - exception= ", e);
                        a(bufferedInputStream);
                        a(fileOutputStream);
                        if (str != 0) {
                        }
                        return file2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        bufferedInputStream2 = bufferedInputStream;
                        httpURLConnection = str;
                        a(bufferedInputStream2);
                        a(obj);
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                }
                Logger.d(a, "download and save video - response code not good, return. response code= ", Integer.valueOf(responseCode));
                a(null);
                a(null);
                if (str != 0) {
                    str.disconnect();
                }
                return null;
            } catch (Exception e4) {
                e = e4;
                bufferedInputStream = null;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                obj = null;
                httpURLConnection = str;
                a(bufferedInputStream2);
                a(obj);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e5) {
            bufferedInputStream = null;
            fileOutputStream = null;
            e = e5;
            str = 0;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            obj = null;
        }
    }

    private static void a(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof InputStream) {
                ((InputStream) obj).close();
            } else if (obj instanceof OutputStream) {
                ((OutputStream) obj).close();
            }
        } catch (Exception e) {
        }
    }
}
