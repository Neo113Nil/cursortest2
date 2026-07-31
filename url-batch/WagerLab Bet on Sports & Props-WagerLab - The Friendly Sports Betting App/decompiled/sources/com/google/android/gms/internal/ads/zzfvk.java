package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfvk implements zzfve {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzfvk(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final /* synthetic */ void zzd(String str, CallbackToFutureAdapter.Completer completer, boolean z, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        } catch (SocketTimeoutException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Objects.requireNonNull(httpURLConnection);
            completer.addCancellationListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    httpURLConnection.disconnect();
                }
            }, this.zza);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzb);
            int i = (int) this.zzc;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        if (inputStream == null) {
                            byteArray = new byte[0];
                            byteArrayOutputStream.close();
                        } else {
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int read = inputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                        }
                        completer.set(new zzfvj(responseCode, byteArray));
                    } finally {
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (SocketTimeoutException e3) {
            e = e3;
            httpURLConnection2 = httpURLConnection;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
            sb.append("Timeout: ");
            sb.append(message);
            completer.setException(new TimeoutException(sb.toString()));
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
            }
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection2 = httpURLConnection;
            completer.setException(th);
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final ListenableFuture zza(final String str, final byte[] bArr, String str2) {
        final boolean z = true;
        final String str3 = "application/x-protobuf";
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver(str, z, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvh
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzc = "application/x-protobuf";
            private final /* synthetic */ byte[] zzd;

            {
                this.zzd = bArr;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return zzfvk.this.zzb(this.zzb, true, this.zzc, this.zzd, completer);
            }
        });
    }

    final /* synthetic */ Object zzb(final String str, boolean z, String str2, final byte[] bArr, final CallbackToFutureAdapter.Completer completer) {
        final boolean z2 = true;
        final String str3 = "application/x-protobuf";
        this.zza.execute(new Runnable(str, completer, z2, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvg
            private final /* synthetic */ String zzb;
            private final /* synthetic */ CallbackToFutureAdapter.Completer zzc;
            private final /* synthetic */ String zzd = "application/x-protobuf";
            private final /* synthetic */ byte[] zze;

            {
                this.zze = bArr;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfvk.this.zzc(this.zzb, this.zzc, true, this.zzd, this.zze);
            }
        });
        return "";
    }

    final /* synthetic */ void zzc(String str, CallbackToFutureAdapter.Completer completer, boolean z, String str2, byte[] bArr) {
        zzd(str, completer, true, "application/x-protobuf", bArr);
    }
}
