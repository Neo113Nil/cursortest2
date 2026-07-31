package com.safedk.android.utils;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public class c {
    private static final String a = "GzipUtil";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:41:0x00b3, B:30:0x00bb, B:32:0x00c0, B:34:0x00c5), top: B:40:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:41:0x00b3, B:30:0x00bb, B:32:0x00c0, B:34:0x00c5), top: B:40:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[Catch: IOException -> 0x00b7, TRY_LEAVE, TryCatch #1 {IOException -> 0x00b7, blocks: (B:41:0x00b3, B:30:0x00bb, B:32:0x00c0, B:34:0x00c5), top: B:40:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        Logger.d(a, "unzip started, input size is ", Integer.valueOf(bArr.length));
        if (!c(bArr)) {
            Logger.d(a, "unzip started, input is not compressed");
            return new String(bArr);
        }
        String str = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e = e;
                gZIPInputStream = null;
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = null;
                inputStreamReader = null;
            }
            try {
                inputStreamReader = new InputStreamReader(gZIPInputStream, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = 0;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = 0;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    Logger.d(a, "unzip started, output size is ", Integer.valueOf(sb.length()));
                    str = sb.toString();
                    bufferedReader2 = bufferedReader;
                } catch (IOException e3) {
                    e = e3;
                    Logger.d(a, "Exception in unzip: ", e.getMessage());
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                    }
                    if (inputStreamReader != null) {
                    }
                    if (gZIPInputStream != null) {
                    }
                    if (byteArrayInputStream != null) {
                    }
                    return str;
                } catch (Throwable th3) {
                    th = th3;
                    Logger.d(a, "Exception in unzip: ", th.getMessage());
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                    }
                    if (inputStreamReader != null) {
                    }
                    if (gZIPInputStream != null) {
                    }
                    if (byteArrayInputStream != null) {
                    }
                    return str;
                }
            } catch (IOException e4) {
                e = e4;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                Logger.d(a, "Exception in unzip: ", e.getMessage());
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                }
                if (inputStreamReader != null) {
                }
                if (gZIPInputStream != null) {
                }
                if (byteArrayInputStream != null) {
                }
                return str;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                Logger.d(a, "Exception in unzip: ", th.getMessage());
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                }
                if (inputStreamReader != null) {
                }
                if (gZIPInputStream != null) {
                }
                if (byteArrayInputStream != null) {
                }
                return str;
            }
        } catch (IOException e5) {
            e = e5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
            inputStreamReader = null;
        }
        if (bufferedReader2 != null) {
            try {
                bufferedReader2.close();
            } catch (IOException e6) {
                Logger.d(a, "Exception in unzip finally block: ", e6.getMessage());
            }
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (gZIPInputStream != null) {
            gZIPInputStream.close();
        }
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
        return str;
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int[] d = d(bArr2);
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            while (i > 0 && bArr2[i] != bArr[i2]) {
                i = d[i - 1];
            }
            if (bArr2[i] == bArr[i2]) {
                i++;
            }
            if (i == bArr2.length) {
                return (i2 - bArr2.length) + 1;
            }
        }
        return -1;
    }

    private static int[] d(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            while (i > 0 && bArr[i] != bArr[i2]) {
                i = iArr[i - 1];
            }
            if (bArr[i] == bArr[i2]) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot unzip null or empty bytes");
        }
        if (!c(bArr)) {
            return bArr;
        }
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            e = e;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
            if (gZIPInputStream2 != null) {
            }
            if (byteArrayOutputStream == null) {
            }
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, bArr.length * 2));
            try {
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                    }
                    return byteArray;
                } catch (IOException e4) {
                    e = e4;
                    Logger.d(a, "Exception in unzipToBytes: ", e.getMessage());
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e5) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException e7) {
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e8) {
                    throw th;
                }
            }
        } catch (IOException e9) {
            e = e9;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            gZIPInputStream2 = gZIPInputStream;
            if (gZIPInputStream2 != null) {
            }
            if (byteArrayOutputStream == null) {
            }
        }
    }

    public static boolean c(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream;
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] decode = Base64.decode(str, 0);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decode));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, decode.length * 2));
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = gZIPInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        String str2 = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                        }
                        return str2;
                    } catch (IOException e3) {
                        e = e3;
                        Logger.d(a, "First attempt failed, trying double decode: ", e.getMessage());
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        byte[] decode2 = Base64.decode(new String(decode, Charset.forName("UTF-8")), 0);
                        try {
                            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decode2));
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(1024, decode2.length * 2));
                                try {
                                    byte[] bArr2 = new byte[8192];
                                    while (true) {
                                        int read2 = gZIPInputStream.read(bArr2);
                                        if (read2 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, read2);
                                    }
                                    String str3 = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e6) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e7) {
                                    }
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e8) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e9) {
                                    }
                                    return str3;
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPInputStream2 = gZIPInputStream;
                                    if (gZIPInputStream2 != null) {
                                        try {
                                            try {
                                                gZIPInputStream2.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (gZIPInputStream2 != null) {
                                                    try {
                                                        gZIPInputStream2.close();
                                                    } catch (IOException e10) {
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    throw th;
                                                }
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th;
                                                } catch (IOException e11) {
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException e12) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e13) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gZIPInputStream2 = gZIPInputStream;
                    if (gZIPInputStream2 != null) {
                    }
                    if (byteArrayOutputStream != null) {
                    }
                }
            } catch (IOException e14) {
                e = e14;
                byteArrayOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                }
                if (byteArrayOutputStream != null) {
                }
            }
        } catch (IOException e15) {
            e = e15;
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
            if (gZIPInputStream2 != null) {
            }
            if (byteArrayOutputStream != null) {
            }
        }
    }
}
