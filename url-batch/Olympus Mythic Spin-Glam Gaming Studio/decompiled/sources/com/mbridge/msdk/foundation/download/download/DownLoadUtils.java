package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes9.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r3.onFailed("url is error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z2) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:102:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x0117 A[Catch: all -> 0x0113, TryCatch #10 {all -> 0x0113, blocks: (B:69:0x0102, B:72:0x0108, B:74:0x010b, B:37:0x0117, B:39:0x011d, B:41:0x0123, B:43:0x012b, B:45:0x012f, B:65:0x0135, B:67:0x0139), top: B:68:0x0102 }] */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x0139 A[Catch: all -> 0x0113, TRY_LEAVE, TryCatch #10 {all -> 0x0113, blocks: (B:69:0x0102, B:72:0x0108, B:74:0x010b, B:37:0x0117, B:39:0x011d, B:41:0x0123, B:43:0x012b, B:45:0x012f, B:65:0x0135, B:67:0x0139), top: B:68:0x0102 }] */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f1, blocks: (B:89:0x00ed, B:83:0x00f5), top: B:88:0x00ed }] */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x0171 A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #3 {Exception -> 0x016d, blocks: (B:103:0x0169, B:96:0x0171), top: B:102:0x0169 }] */
                    /* JADX WARN: Type inference failed for: r0v18, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r7v0 */
                    /* JADX WARN: Type inference failed for: r7v1 */
                    /* JADX WARN: Type inference failed for: r7v13 */
                    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    /* JADX WARN: Type inference failed for: r7v4 */
                    /* JADX WARN: Type inference failed for: r7v5 */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void runTask() {
                        ByteArrayOutputStream byteArrayOutputStream;
                        InputStream inputStream;
                        byte[] bArr;
                        ?? r7;
                        String message;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        boolean z2;
                        String str2;
                        InputStream inputStream2 = null;
                        boolean z3 = false;
                        try {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source3 != null) {
                                iOnDownLoadH5Source3.onStart();
                            }
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                            httpsURLConnection.setReadTimeout(30000);
                            httpsURLConnection.setConnectTimeout(20000);
                            int httpUrlConnectionGetResponseCode = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection);
                            q0.a(DownLoadUtils.TAG, "response code " + httpUrlConnectionGetResponseCode);
                            if (httpUrlConnectionGetResponseCode == 200) {
                                inputStream = MintegralNetworkBridge.urlConnectionGetInputStream(httpsURLConnection);
                                try {
                                    byte[] bArr2 = new byte[6144];
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        try {
                                            try {
                                                int read = inputStream.read(bArr2);
                                                if (read == -1) {
                                                    break;
                                                } else {
                                                    byteArrayOutputStream.write(bArr2, 0, read);
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                bArr = null;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (inputStream != null) {
                                            }
                                            if (byteArrayOutputStream != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    if (byteArrayOutputStream.toByteArray() != null) {
                                        bArr = byteArrayOutputStream.toByteArray();
                                        try {
                                            str2 = !z ? new String(bArr) : null;
                                        } catch (Exception e2) {
                                            e = e2;
                                            r7 = 0;
                                            message = e.getMessage();
                                            q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                            if (inputStream != null) {
                                            }
                                            if (byteArrayOutputStream != null) {
                                            }
                                            if (z3) {
                                            }
                                            if (z3) {
                                            }
                                            iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                            if (iOnDownLoadH5Source2 != null) {
                                            }
                                        }
                                    } else {
                                        bArr = null;
                                        str2 = null;
                                    }
                                    message = "";
                                    z2 = true;
                                    r7 = str2;
                                } catch (Exception e3) {
                                    e = e3;
                                    bArr = null;
                                    byteArrayOutputStream = bArr;
                                    r7 = byteArrayOutputStream;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStream != null) {
                                    }
                                    if (byteArrayOutputStream != null) {
                                    }
                                    if (z3) {
                                    }
                                    if (z3) {
                                    }
                                    iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                    if (iOnDownLoadH5Source2 != null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteArrayOutputStream = null;
                                    inputStream2 = inputStream;
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                    }
                                    if (byteArrayOutputStream != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                message = "responseCode is " + httpUrlConnectionGetResponseCode;
                                inputStream = null;
                                bArr = null;
                                byteArrayOutputStream = null;
                                r7 = 0;
                                z2 = false;
                            }
                            try {
                                try {
                                    MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e4) {
                                            e4.printStackTrace();
                                            message = e4.getMessage();
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    z3 = z2;
                                } catch (Exception e5) {
                                    e = e5;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                            message = e6.getMessage();
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    if (z3) {
                                    }
                                    if (z3) {
                                    }
                                    iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                    if (iOnDownLoadH5Source2 != null) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream2 = inputStream;
                                inputStream = inputStream2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e7) {
                                        e7.printStackTrace();
                                        e7.getMessage();
                                        throw th;
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            inputStream = null;
                            bArr = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            throw th;
                        }
                        if (z3) {
                            try {
                                if (z && bArr != null && bArr.length > 0) {
                                    H5DownLoadManager.IOnDownLoadH5Source.this.onSuccess(null, bArr, str);
                                }
                            } catch (Throwable th5) {
                                if (MBridgeConstans.DEBUG) {
                                    th5.printStackTrace();
                                }
                                H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                if (iOnDownLoadH5Source4 != null) {
                                    try {
                                        iOnDownLoadH5Source4.onFailed(th5.getMessage());
                                        return;
                                    } catch (Exception e9) {
                                        e9.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        if (z3 || !a1.b(r7) || r7.length() <= 0 || !r7.contains(DownLoadUtils.END_TAG)) {
                            iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            ?? r0 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (r0 != 0) {
                                r0.onSuccess(r7, bArr, str);
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
