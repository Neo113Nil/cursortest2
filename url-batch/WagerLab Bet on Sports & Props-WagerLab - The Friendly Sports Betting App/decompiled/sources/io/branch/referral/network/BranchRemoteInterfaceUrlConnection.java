package io.branch.referral.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import android.util.Base64;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.ably.lib.http.HttpConstants;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;
import io.branch.referral.BranchLogger;
import io.branch.referral.Defines;
import io.branch.referral.PrefHelper;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BranchRemoteInterfaceUrlConnection extends BranchRemoteInterface {
    private static final int THREAD_TAG_POST = 102;
    private final Branch branch;
    private PrefHelper prefHelper;
    private int retryLimit;
    private int lastResponseCode = -1;
    private String lastResponseMessage = "";
    private String lastRequestId = "";

    public BranchRemoteInterfaceUrlConnection(Branch branch) {
        this.branch = branch;
        PrefHelper prefHelper = PrefHelper.getInstance(branch.getApplicationContext());
        this.prefHelper = prefHelper;
        this.retryLimit = prefHelper.getRetryCount();
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.BranchResponse doRestfulGet(String str) throws BranchRemoteInterface.BranchRemoteException {
        return doRestfulGet(str, 0);
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.BranchResponse doRestfulPost(String str, JSONObject jSONObject) throws BranchRemoteInterface.BranchRemoteException {
        return doRestfulPost(str, jSONObject, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BranchRemoteInterface.BranchResponse doRestfulGet(String str, int i) throws BranchRemoteInterface.BranchRemoteException {
        int timeout;
        int connectTimeout;
        HttpsURLConnection httpsURLConnection;
        BranchRemoteInterface.BranchResponse branchResponse;
        PrefHelper prefHelper = PrefHelper.getInstance(this.branch.getApplicationContext());
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                timeout = prefHelper.getTimeout();
                connectTimeout = prefHelper.getConnectTimeout();
                httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str + (str.contains("?") ? "&" : "?") + "retryNumber=" + i).openConnection()));
            } catch (Throwable th) {
                th = th;
                if (httpsURLConnection2 != null) {
                    httpsURLConnection2.disconnect();
                    resetStats();
                }
                throw th;
            }
        } catch (SocketTimeoutException e) {
            e = e;
        } catch (InterruptedIOException e2) {
            e = e2;
        } catch (SocketException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        }
        try {
            httpsURLConnection.setConnectTimeout(connectTimeout);
            httpsURLConnection.setReadTimeout(timeout);
            String headerField = httpsURLConnection.getHeaderField(Defines.HeaderKey.RequestId.getKey());
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode >= 500 && i < this.retryLimit) {
                try {
                    Thread.sleep(prefHelper.getRetryInterval());
                } catch (InterruptedException e5) {
                    BranchLogger.e(getNetworkErrorMessage(e5, str, i));
                }
                BranchRemoteInterface.BranchResponse doRestfulGet = doRestfulGet(str, i + 1);
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                    resetStats();
                }
                return doRestfulGet;
            }
            if (responseCode != 200) {
                try {
                } catch (FileNotFoundException e6) {
                    BranchLogger.e(getNetworkErrorMessage(e6, str, i));
                    branchResponse = new BranchRemoteInterface.BranchResponse(null, responseCode);
                }
                if (httpsURLConnection.getErrorStream() != null) {
                    branchResponse = new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getErrorStream()), responseCode);
                    branchResponse.requestId = Strings.emptyToNull(headerField);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                        resetStats();
                    }
                    return branchResponse;
                }
            }
            branchResponse = new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getInputStream()), responseCode);
            branchResponse.requestId = Strings.emptyToNull(headerField);
            if (httpsURLConnection != null) {
            }
            return branchResponse;
        } catch (SocketTimeoutException e7) {
            httpsURLConnection2 = httpsURLConnection;
            e = e7;
            if (i >= this.retryLimit) {
                throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_REQ_TIMED_OUT, e.getMessage());
            }
            try {
                Thread.sleep(prefHelper.getRetryInterval());
            } catch (InterruptedException e8) {
                BranchLogger.e(getNetworkErrorMessage(e8, str, i));
            }
            BranchRemoteInterface.BranchResponse doRestfulGet2 = doRestfulGet(str, i + 1);
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
                resetStats();
            }
            return doRestfulGet2;
        } catch (InterruptedIOException e9) {
            httpsURLConnection2 = httpsURLConnection;
            e = e9;
            BranchLogger.e(getNetworkErrorMessage(e, str, i));
            if (i >= this.retryLimit) {
                throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_TASK_TIMEOUT, e.getMessage());
            }
            try {
                Thread.sleep(prefHelper.getRetryInterval());
            } catch (InterruptedException e10) {
                BranchLogger.e(getNetworkErrorMessage(e10, str, i));
            }
            BranchRemoteInterface.BranchResponse doRestfulGet3 = doRestfulGet(str, i + 1);
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
                resetStats();
            }
            return doRestfulGet3;
        } catch (SocketException e11) {
            e = e11;
            BranchLogger.e(getNetworkErrorMessage(e, str, i));
            throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_NO_CONNECTIVITY, e.getMessage());
        } catch (IOException e12) {
            e = e12;
            BranchLogger.e(getNetworkErrorMessage(e, str, i));
            throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_NO_CONNECTIVITY, e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection2 = httpsURLConnection;
            if (httpsURLConnection2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:93|(3:111|112|(4:114|102|(1:104)|105))|95|96|(3:98|99|100)(1:108)|101|102|(0)|105) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0217, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0342 A[Catch: all -> 0x034e, TRY_ENTER, TryCatch #24 {all -> 0x034e, blocks: (B:61:0x026c, B:63:0x0277, B:64:0x0287, B:65:0x0288, B:66:0x0293, B:46:0x029b, B:51:0x02a6, B:52:0x02b7, B:48:0x02c6, B:49:0x02d1, B:58:0x02b0, B:31:0x02d9, B:36:0x02e4, B:37:0x02f5, B:33:0x0304, B:34:0x030f, B:43:0x02ee, B:15:0x0317, B:21:0x0322, B:22:0x0333, B:17:0x0342, B:18:0x034d, B:28:0x032c), top: B:5:0x0058, inners: #21, #22, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0304 A[Catch: all -> 0x034e, TRY_ENTER, TryCatch #24 {all -> 0x034e, blocks: (B:61:0x026c, B:63:0x0277, B:64:0x0287, B:65:0x0288, B:66:0x0293, B:46:0x029b, B:51:0x02a6, B:52:0x02b7, B:48:0x02c6, B:49:0x02d1, B:58:0x02b0, B:31:0x02d9, B:36:0x02e4, B:37:0x02f5, B:33:0x0304, B:34:0x030f, B:43:0x02ee, B:15:0x0317, B:21:0x0322, B:22:0x0333, B:17:0x0342, B:18:0x034d, B:28:0x032c), top: B:5:0x0058, inners: #21, #22, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c6 A[Catch: all -> 0x034e, TRY_ENTER, TryCatch #24 {all -> 0x034e, blocks: (B:61:0x026c, B:63:0x0277, B:64:0x0287, B:65:0x0288, B:66:0x0293, B:46:0x029b, B:51:0x02a6, B:52:0x02b7, B:48:0x02c6, B:49:0x02d1, B:58:0x02b0, B:31:0x02d9, B:36:0x02e4, B:37:0x02f5, B:33:0x0304, B:34:0x030f, B:43:0x02ee, B:15:0x0317, B:21:0x0322, B:22:0x0333, B:17:0x0342, B:18:0x034d, B:28:0x032c), top: B:5:0x0058, inners: #21, #22, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0277 A[Catch: all -> 0x034e, TryCatch #24 {all -> 0x034e, blocks: (B:61:0x026c, B:63:0x0277, B:64:0x0287, B:65:0x0288, B:66:0x0293, B:46:0x029b, B:51:0x02a6, B:52:0x02b7, B:48:0x02c6, B:49:0x02d1, B:58:0x02b0, B:31:0x02d9, B:36:0x02e4, B:37:0x02f5, B:33:0x0304, B:34:0x030f, B:43:0x02ee, B:15:0x0317, B:21:0x0322, B:22:0x0333, B:17:0x0342, B:18:0x034d, B:28:0x032c), top: B:5:0x0058, inners: #21, #22, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0288 A[Catch: all -> 0x034e, TryCatch #24 {all -> 0x034e, blocks: (B:61:0x026c, B:63:0x0277, B:64:0x0287, B:65:0x0288, B:66:0x0293, B:46:0x029b, B:51:0x02a6, B:52:0x02b7, B:48:0x02c6, B:49:0x02d1, B:58:0x02b0, B:31:0x02d9, B:36:0x02e4, B:37:0x02f5, B:33:0x0304, B:34:0x030f, B:43:0x02ee, B:15:0x0317, B:21:0x0322, B:22:0x0333, B:17:0x0342, B:18:0x034d, B:28:0x032c), top: B:5:0x0058, inners: #21, #22, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0351  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v12, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v13, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v14, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [io.branch.referral.network.BranchRemoteInterfaceUrlConnection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BranchRemoteInterface.BranchResponse doRestfulPost(String str, JSONObject jSONObject, int i) throws BranchRemoteInterface.BranchRemoteException {
        ?? r13;
        PrefHelper prefHelper;
        BranchRemoteInterface.BranchResponse branchResponse;
        int i2 = i;
        PrefHelper prefHelper2 = PrefHelper.getInstance(this.branch.getApplicationContext());
        int timeout = prefHelper2.getTimeout();
        int connectTimeout = prefHelper2.getConnectTimeout();
        try {
            jSONObject.put(BranchRemoteInterface.RETRY_NUMBER, i2);
        } catch (JSONException e) {
            r13 = " stacktrace: ";
            BranchLogger.e("Caught JSONException, retry number: " + i2 + " " + e.getMessage() + " stacktrace: " + BranchLogger.stackTraceToString(e));
        }
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        TrafficStats.setThreadStatsTag(102);
                    } catch (SocketTimeoutException e2) {
                        e = e2;
                        prefHelper = prefHelper2;
                        r13 = 0;
                        BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                        if (i2 < this.retryLimit) {
                        }
                    } catch (InterruptedIOException e3) {
                        e = e3;
                        prefHelper = prefHelper2;
                        r13 = 0;
                        BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                        if (i2 < this.retryLimit) {
                        }
                    } catch (IOException e4) {
                        e = e4;
                        prefHelper = prefHelper2;
                        r13 = 0;
                        BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                        if (i2 < this.retryLimit) {
                        }
                    } catch (Exception e5) {
                        e = e5;
                        BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                        if (e instanceof NetworkOnMainThreadException) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        r13 = 0;
                        if (r13 != 0) {
                        }
                        throw th;
                    }
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                try {
                    try {
                        httpsURLConnection.setConnectTimeout(connectTimeout);
                        httpsURLConnection.setReadTimeout(timeout);
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setDoOutput(true);
                        if (str.contains(Defines.Jsonkey.QRCodeTag.getKey())) {
                            httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                            httpsURLConnection.setRequestProperty("Accept", "image/*");
                        } else {
                            httpsURLConnection.setRequestProperty("Content-Type", HttpConstants.ContentTypes.JSON);
                            httpsURLConnection.setRequestProperty("Accept", HttpConstants.ContentTypes.JSON);
                        }
                        httpsURLConnection.setRequestMethod("POST");
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream());
                        outputStreamWriter.write(jSONObject.toString());
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                        String headerField = httpsURLConnection.getHeaderField(Defines.HeaderKey.RequestId.getKey());
                        this.lastRequestId = headerField;
                        int responseCode = httpsURLConnection.getResponseCode();
                        this.lastResponseCode = responseCode;
                        this.lastResponseMessage = httpsURLConnection.getResponseMessage();
                        BranchLogger.d("lastResponseMessage " + this.lastResponseMessage);
                        if (responseCode >= 500 && i2 < this.retryLimit) {
                            try {
                                Thread.sleep(prefHelper2.getRetryInterval());
                            } catch (InterruptedException e6) {
                                BranchLogger.e(getNetworkErrorMessage(e6, str, i2));
                            }
                            i2++;
                            BranchRemoteInterface.BranchResponse doRestfulPost = doRestfulPost(str, jSONObject, i2);
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                                resetStats();
                            }
                            return doRestfulPost;
                        }
                        try {
                            if (responseCode != 200) {
                                try {
                                } catch (FileNotFoundException e7) {
                                    e = e7;
                                    prefHelper = prefHelper2;
                                    BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                                    branchResponse = new BranchRemoteInterface.BranchResponse(null, responseCode);
                                    branchResponse.requestId = headerField;
                                    if (httpsURLConnection != null) {
                                    }
                                    return branchResponse;
                                } catch (SocketTimeoutException e8) {
                                    e = e8;
                                    prefHelper = prefHelper2;
                                    r13 = httpsURLConnection;
                                    BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                                    if (i2 < this.retryLimit) {
                                        throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_REQ_TIMED_OUT, e.getMessage());
                                    }
                                    try {
                                        Thread.sleep(prefHelper.getRetryInterval());
                                    } catch (InterruptedException e9) {
                                        BranchLogger.e(getNetworkErrorMessage(e9, str, i2));
                                    }
                                    BranchRemoteInterface.BranchResponse doRestfulPost2 = doRestfulPost(str, jSONObject, i2 + 1);
                                    if (r13 != 0) {
                                        r13.disconnect();
                                        resetStats();
                                    }
                                    return doRestfulPost2;
                                } catch (InterruptedIOException e10) {
                                    e = e10;
                                    prefHelper = prefHelper2;
                                    r13 = httpsURLConnection;
                                    BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                                    if (i2 < this.retryLimit) {
                                        throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_TASK_TIMEOUT, e.getMessage());
                                    }
                                    try {
                                        Thread.sleep(prefHelper.getRetryInterval());
                                    } catch (InterruptedException e11) {
                                        BranchLogger.e(getNetworkErrorMessage(e11, str, i2));
                                    }
                                    BranchRemoteInterface.BranchResponse doRestfulPost3 = doRestfulPost(str, jSONObject, i2 + 1);
                                    if (r13 != 0) {
                                        r13.disconnect();
                                        resetStats();
                                    }
                                    return doRestfulPost3;
                                } catch (IOException e12) {
                                    e = e12;
                                    prefHelper = prefHelper2;
                                    r13 = httpsURLConnection;
                                    BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                                    if (i2 < this.retryLimit) {
                                        throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_BRANCH_NO_CONNECTIVITY, e.getMessage());
                                    }
                                    try {
                                        Thread.sleep(prefHelper.getRetryInterval());
                                    } catch (InterruptedException e13) {
                                        BranchLogger.e(getNetworkErrorMessage(e13, str, i2));
                                    }
                                    BranchRemoteInterface.BranchResponse doRestfulPost4 = doRestfulPost(str, jSONObject, i2 + 1);
                                    if (r13 != 0) {
                                        r13.disconnect();
                                        resetStats();
                                    }
                                    return doRestfulPost4;
                                }
                                if (httpsURLConnection.getErrorStream() != null) {
                                    BranchLogger.e("Branch Networking Error: \nURL: " + str + "\nResponse Code: " + this.lastResponseCode + "\nResponse Message: " + this.lastResponseMessage + "\nRetry number: " + i2 + "\nFinal attempt: true\nrequestId: " + this.lastRequestId + "\nObject: " + ((Object) this));
                                    branchResponse = new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getErrorStream()), responseCode);
                                    prefHelper = prefHelper2;
                                    branchResponse.requestId = headerField;
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                        resetStats();
                                    }
                                    return branchResponse;
                                }
                            }
                            if (str.contains(Defines.Jsonkey.QRCodeTag.getKey())) {
                                Bitmap decodeStream = BitmapFactory.decodeStream(httpsURLConnection.getInputStream());
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                prefHelper = prefHelper2;
                                decodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                branchResponse = new BranchRemoteInterface.BranchResponse(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0), responseCode);
                            } else {
                                prefHelper = prefHelper2;
                                branchResponse = new BranchRemoteInterface.BranchResponse(getResponseString(httpsURLConnection.getInputStream()), responseCode);
                            }
                            BranchLogger.v("Branch Networking Success\nURL: " + str + "\nResponse Code: " + this.lastResponseCode + "\nResponse Message: " + this.lastResponseMessage + "\nRetry number: " + i2 + "\nrequestId: " + this.lastRequestId + "\nObject: " + ((Object) this));
                            branchResponse.requestId = headerField;
                            if (httpsURLConnection != null) {
                            }
                            return branchResponse;
                        } catch (SocketTimeoutException e14) {
                            e = e14;
                        } catch (InterruptedIOException e15) {
                            e = e15;
                        } catch (IOException e16) {
                            e = e16;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        BranchLogger.e(getNetworkErrorMessage(e, str, i2));
                        if (e instanceof NetworkOnMainThreadException) {
                            throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_OTHER, e.getMessage());
                        }
                        BranchLogger.e("Cannot make network request on main thread.");
                        throw new BranchRemoteInterface.BranchRemoteException(BranchError.ERR_NETWORK_ON_MAIN, e.getMessage());
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = httpsURLConnection;
                        if (r13 != 0) {
                        }
                        throw th;
                    }
                } catch (SocketTimeoutException e18) {
                    e = e18;
                    prefHelper = prefHelper2;
                } catch (InterruptedIOException e19) {
                    e = e19;
                    prefHelper = prefHelper2;
                } catch (IOException e20) {
                    e = e20;
                    prefHelper = prefHelper2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (r13 != 0) {
                    r13.disconnect();
                    resetStats();
                }
                throw th;
            }
        } catch (SocketTimeoutException e21) {
            e = e21;
            prefHelper = prefHelper2;
            r13 = 0;
        } catch (InterruptedIOException e22) {
            e = e22;
            prefHelper = prefHelper2;
            r13 = 0;
        } catch (IOException e23) {
            e = e23;
            prefHelper = prefHelper2;
            r13 = 0;
        } catch (Exception e24) {
            e = e24;
        } catch (Throwable th4) {
            th = th4;
            r13 = 0;
        }
    }

    private void resetStats() {
        this.lastRequestId = "";
        this.lastResponseCode = -1;
        this.lastResponseMessage = "";
    }

    private String getResponseString(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (IOException e) {
            BranchLogger.d(e.getMessage());
            return null;
        }
    }

    String getNetworkErrorMessage(Exception exc, String str, int i) {
        return "Branch Networking Error: \nURL: " + str + "\nResponse Code: " + this.lastResponseCode + "\nResponse Message: " + this.lastResponseMessage + "\nCaught exception type: " + exc.getClass().getCanonicalName() + "\nRetry number: " + i + "\nrequestId: " + this.lastRequestId + "\nFinal attempt: " + (i >= this.retryLimit) + "\nObject: " + this + "\nException Message: " + exc.getMessage() + "\nStacktrace: " + BranchLogger.stackTraceToString(exc);
    }
}
