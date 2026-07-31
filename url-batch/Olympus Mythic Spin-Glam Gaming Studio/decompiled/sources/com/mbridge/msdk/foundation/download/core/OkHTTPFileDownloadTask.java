package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.ironsource.C4701ic;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.core.DownloaderReporter;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.toolbox.OKHTTPEventListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private b0 _responseBody;
    private p monitor;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DownloadResponse handleInputStream(String str, String str2, String str3, String str4) throws IOException, IllegalAccessException {
        String str5;
        MessageDigest messageDigest;
        String str6;
        Object[] objArr;
        p pVar;
        byte[] bArr;
        int read;
        boolean z;
        String str7;
        DownloadResponse downloadResponse;
        p pVar2;
        String str8;
        DownloadResponse downloadResponse2;
        String str9 = IDownloadTask.TAG;
        DownloadResponse downloadResponse3 = new DownloadResponse();
        boolean z2 = true;
        if (Objects.isNull(this._downloadModel)) {
            DownloadModel create = DownloadModel.create(this._downloadRequest.getDownloadId(), this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), 0L, this._downloadMessage.getDownloadRate(), 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = create;
            this._databaseHelper.insert(create);
        } else {
            DownloadModel create2 = DownloadModel.create(this._downloadModel.getDownloadId(), this._downloadModel.getDownloadUrl(), this._downloadMessage.getResourceUrl(), this._downloadModel.getEtag(), this._downloadModel.getSaveDirectorPath(), this._downloadModel.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadModel.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter() + 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = create2;
            this._databaseHelper.update(create2, str2);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str2, str));
        this._outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this._downloadRequest.getDownloadedBytes());
        MessageDigest messageDigest2 = null;
        try {
        } catch (Throwable th) {
            th = th;
            str5 = "";
        }
        if (this._downloadMessage == null || !this._downloadMessage.isCheckMD5() || TextUtils.isEmpty(this._downloadMessage.getMd5())) {
            messageDigest = null;
            objArr = false;
            str6 = "";
        } else {
            str5 = this._downloadMessage.getMd5();
            try {
                messageDigest2 = MessageDigest.getInstance(SameMD5.TAG);
                if (this._downloadMessage.getDownloadRate() == 100) {
                    if (!TextUtils.isEmpty(str5)) {
                        messageDigest = messageDigest2;
                        str6 = str5;
                        objArr = true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, th.getMessage());
                messageDigest = messageDigest2;
                str6 = str5;
                objArr = false;
                pVar = this.monitor;
                if (pVar != null) {
                }
                bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
                while (true) {
                    read = this._inputStream.read(bArr);
                    if (read != -1) {
                    }
                    z2 = true;
                    str9 = str7;
                    downloadResponse3 = downloadResponse2;
                }
                pVar2 = this.monitor;
                if (pVar2 != null) {
                }
                boolean z3 = z;
                String str10 = str6;
                GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str3, str2, DownloadModel.create(str3, this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
                if (objArr != false) {
                }
                if (!downloadResponse.isCancelled()) {
                }
                return downloadResponse;
            }
            messageDigest = messageDigest2;
            str6 = str5;
            objArr = false;
        }
        pVar = this.monitor;
        if (pVar != null) {
            pVar.d("process_data_start");
        }
        bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        while (true) {
            read = this._inputStream.read(bArr);
            if (read != -1) {
                z = z2;
                str7 = str9;
                downloadResponse = downloadResponse3;
                break;
            }
            this._outputStream.write(bArr, 0, read);
            DownloadRequest downloadRequest = this._downloadRequest;
            downloadRequest.setDownloadedBytes(downloadRequest.getDownloadedBytes() + read);
            if (objArr != false && messageDigest != null) {
                try {
                    messageDigest.update(bArr, 0, read);
                } catch (Exception unused) {
                }
            }
            this._outputStream.flushAndSync();
            int downloadRate = Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes());
            z = true;
            str7 = str9;
            downloadResponse2 = downloadResponse3;
            sendProgress(this._downloadRequest, this._downloadMessage, this._downloadRequest.getDownloadedBytes(), this._downloadRequest.getTotalBytes(), downloadRate);
            p pVar3 = this.monitor;
            if (pVar3 != null) {
                pVar3.c(this._downloadRequest.getDownloadedBytes());
            }
            if (this._downloadMessage.getDownloadRate() != 100 && downloadRate >= this._downloadMessage.getDownloadRate()) {
                downloadResponse = downloadResponse2;
                break;
            }
            if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                downloadResponse = downloadResponse2;
                downloadResponse.setCancelled(true);
                break;
            }
            z2 = true;
            str9 = str7;
            downloadResponse3 = downloadResponse2;
        }
        pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.d("process_data_end");
        }
        boolean z32 = z;
        String str102 = str6;
        GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str3, str2, DownloadModel.create(str3, this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
        if (objArr != false) {
            try {
                if (this._downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
                    p pVar4 = this.monitor;
                    if (pVar4 != null) {
                        pVar4.d("validate_data_start");
                    }
                    String hexEncode = SameMD5.hexEncode(messageDigest.digest());
                    String lowerCase = TextUtils.isEmpty(str102) ? "" : str102.toLowerCase(Locale.US);
                    str8 = str7;
                    try {
                        GlobalComponent.getInstance().getLogger().log(str8, hexEncode + " " + lowerCase);
                        p pVar5 = this.monitor;
                        if (pVar5 != null) {
                            pVar5.d("validate_data_end");
                        }
                        if (!TextUtils.isEmpty(hexEncode) && !hexEncode.equals(lowerCase)) {
                            this._downloadMessage.setMd5VerifyResult(z32 ? 1 : 0);
                            downloadResponse.setFailed(z32);
                            downloadResponse.setError(new DownloadError(new Exception("File MD5 check fail.")));
                            return downloadResponse;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        GlobalComponent.getInstance().getLogger().log(str8, th.getMessage());
                        if (!downloadResponse.isCancelled()) {
                        }
                        return downloadResponse;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                str8 = str7;
            }
        }
        if (!downloadResponse.isCancelled()) {
            downloadResponse.setSuccessful(z32);
        }
        return downloadResponse;
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, a0 a0Var, int i) throws IOException, IllegalAccessException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean isSupportResume = isSupportResume(i, this._downloadModel);
        boolean z = (a0Var == null || this._downloadRequest == null || i != 206 || a0Var.d() == null || this._downloadRequest.getTotalBytes() <= 0 || a0Var.d().k() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (!isSupportResume && z) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        b0 d = a0Var.d();
        this._responseBody = d;
        if (Objects.isNull(d)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long k = this._responseBody.k();
        if (k <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(k);
        }
        InputStream d2 = this._responseBody.d();
        this._inputStream = d2;
        if (Objects.isNull(d2)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        this._downloadMessage.setContentLength(this._downloadRequest.getTotalBytes());
        this._downloadRequest.handlerResponseStartEvent(this._downloadMessage);
        return handleInputStream(str, str2, str3, this._etag);
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        return i == 206 && !TextUtils.isEmpty(this._etag) && (downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag()));
    }

    private void reportDownloadMessage() {
        boolean isSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(isSuccessful));
        boolean isCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(isCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!isSuccessful && !isCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        p pVar = this.monitor;
        if (pVar != null) {
            if (isSuccessful) {
                pVar.a(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                Exception exception = error == null ? null : error.getException();
                p pVar2 = this.monitor;
                if (isCancelled) {
                    exception = new IOException("download request canceled");
                }
                pVar2.a(exception);
                if (TextUtils.equals(errorMessage, "timeout")) {
                    this.monitor.a(3);
                } else {
                    this.monitor.a(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            if (downloadMessage != null) {
                downloadMessage.setCurrentDownloadRate(i);
                downloadMessage.setContentLength(j2);
            }
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0251, code lost:
    
        if (r8.h() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02a4, code lost:
    
        reportDownloadMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02a9, code lost:
    
        return r20._downloadResponse;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a1, code lost:
    
        r8.cancel();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029f, code lost:
    
        if (r8.h() != false) goto L67;
     */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DownloadResponse run() {
        a0 a0Var;
        a0 d;
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        p monitor = this._downloadRequest.getMonitor();
        this.monitor = monitor;
        if (monitor == null && this._downloadRequest.canTrack() && !TextUtils.isEmpty(downloadUrl)) {
            p pVar = new p(d.a((DownloadRequest<?>) this._downloadRequest), C4701ic.a);
            this.monitor = pVar;
            pVar.f(downloadUrl);
            this._downloadRequest.setMonitor(this.monitor);
        }
        long timeout = this._downloadRequest.getTimeout();
        long connectTimeout = this._downloadRequest.getConnectTimeout();
        long readTimeout = this._downloadRequest.getReadTimeout();
        long writeTimeout = this._downloadRequest.getWriteTimeout();
        long requestQueueTime = this._downloadRequest.getRequestQueueTime();
        p pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.i(timeout);
            this.monitor.e(connectTimeout);
            this.monitor.f(readTimeout);
            this.monitor.j(writeTimeout);
            this.monitor.d("queue");
            this.monitor.a(requestQueueTime);
        }
        String format = String.format(Locale.ENGLISH, FORMAT_RANGE, Long.valueOf(downloadedBytes));
        try {
            v.b s = GlobalComponent.getInstance().getOkHttpClient().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v a = s.b(connectTimeout, timeUnit).a(new MBridgeHostnameVerifier(downloadUrl)).d(readTimeout, timeUnit).e(writeTimeout, timeUnit).a(Math.max(0L, timeout), timeUnit).a(new OKHTTPEventListener(this.monitor)).b(true).a();
            y a2 = new y.a().b(downloadUrl).a(new c.a().b().a()).a(CONNECTION, "close").a(Command.HTTP_HEADER_RANGE, format).a("User-Agent").a("User-Agent", Command.DEFAULT_USER_AGENT).a();
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, a2.g().g());
            this._downloaderReporter.add("url", downloadUrl);
            com.mbridge.msdk.thrid.okhttp.d a3 = a.a(a2);
            a0 a0Var2 = null;
            a0 a0Var3 = null;
            try {
                try {
                    d = a3.d();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!Objects.isNull(d) && !Objects.isNull(d.d())) {
                    int k = d.k();
                    p pVar3 = this.monitor;
                    if (pVar3 != null) {
                        pVar3.b(k);
                    }
                    this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(k));
                    if (!d.n()) {
                        this._downloadResponse.setError(new IOException(RESPONSE_CODE + k));
                        DownloadResponse downloadResponse = this._downloadResponse;
                        Objects.closeInputStream(this._inputStream);
                        Objects.closeOutputStream(this._outputStream);
                        Objects.closeResponse(d);
                        Objects.closeResponseBody(this._responseBody);
                        if (!a3.h()) {
                            a3.cancel();
                        }
                        reportDownloadMessage();
                        return downloadResponse;
                    }
                    this._etag = d.a(Command.HTTP_HEADER_ETAG, "");
                    OkHTTPFileDownloadTask okHTTPFileDownloadTask = this;
                    this._downloadResponse = okHTTPFileDownloadTask.handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, d, k);
                    Objects.closeInputStream(this._inputStream);
                    Objects.closeOutputStream(this._outputStream);
                    Objects.closeResponse(d);
                    Objects.closeResponseBody(this._responseBody);
                    a0Var2 = okHTTPFileDownloadTask;
                    a0Var = okHTTPFileDownloadTask;
                }
                this._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
                DownloadResponse downloadResponse2 = this._downloadResponse;
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                Objects.closeResponse(d);
                Objects.closeResponseBody(this._responseBody);
                if (!a3.h()) {
                    a3.cancel();
                }
                reportDownloadMessage();
                return downloadResponse2;
            } catch (Exception e2) {
                e = e2;
                a0Var3 = d;
                handlerException(saveFileName, cacheDirectoryPath, downloadId, e);
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                Objects.closeResponse(a0Var3);
                Objects.closeResponseBody(this._responseBody);
                a0Var2 = a0Var3;
                a0Var = a0Var3;
            } catch (Throwable th2) {
                th = th2;
                a0Var2 = d;
                Objects.closeInputStream(this._inputStream);
                Objects.closeOutputStream(this._outputStream);
                Objects.closeResponse(a0Var2);
                Objects.closeResponseBody(this._responseBody);
                if (!a3.h()) {
                    a3.cancel();
                }
                reportDownloadMessage();
                throw th;
            }
        } catch (Exception e3) {
            handlerException(saveFileName, cacheDirectoryPath, downloadId, e3);
            this._downloadResponse.setSuccessful(false);
            return this._downloadResponse;
        }
    }
}
