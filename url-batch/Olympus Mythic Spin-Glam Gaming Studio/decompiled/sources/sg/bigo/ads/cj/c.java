package sg.bigo.ads.cj;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* loaded from: classes11.dex */
public final class c {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Nullable
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        ?? r2;
        GZIPInputStream gZIPInputStream;
        Throwable th;
        StringBuilder sb;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
        } catch (Exception unused) {
            gZIPInputStream = null;
            byteArrayInputStream = null;
            r2 = 0;
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
            r2 = 0;
        }
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                r2 = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                try {
                    try {
                        sb = new StringBuilder();
                        while (true) {
                            try {
                                String readLine = r2.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (Exception unused3) {
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                            }
                        }
                        r2.close();
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused6) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        if (byteArrayInputStream != null) {
                            throw th;
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException unused9) {
                            throw th;
                        }
                    }
                } catch (Exception unused10) {
                    sb = null;
                }
            } catch (Exception unused11) {
                r2 = 0;
                sb = r2;
                if (r2 != 0) {
                }
                if (gZIPInputStream != null) {
                }
            } catch (Throwable th4) {
                r2 = 0;
                th = th4;
            }
        } catch (Exception unused12) {
            gZIPInputStream = null;
            r2 = 0;
        } catch (Throwable th5) {
            th = th5;
            r2 = 0;
            th = th;
            gZIPInputStream = r2;
            if (r2 != 0) {
            }
            if (gZIPInputStream != null) {
            }
            if (byteArrayInputStream != null) {
            }
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused13) {
        }
        if (sb == null) {
            return null;
        }
        return sb.toString();
    }
}
