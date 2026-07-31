package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import io.bidmachine.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class k1 extends s0 {
    static final MediaType d = MediaType.parse(MimeTypes.APPLICATION_OCTET_STREAM);
    final s0.a a;
    final MyTrackerConfig.OkHttpClientProvider b;
    final boolean c;

    k1(s0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.a = aVar;
        this.b = okHttpClientProvider;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: all -> 0x00ae, TryCatch #4 {all -> 0x00ae, blocks: (B:17:0x008a, B:22:0x0097, B:24:0x00bd, B:26:0x00c8, B:27:0x00cc, B:29:0x00d2, B:30:0x00d5, B:34:0x00b3), top: B:16:0x008a }] */
    @Override // com.my.tracker.obfuscated.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0.b a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        s0.b d2 = s0.b.d();
        Response response = null;
        try {
            x2.a("OkHttpPostRequest: send request to " + str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.c) {
                        x2.a("OkHttpPostRequest: populating post request body using gzip");
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            this.a.a(gZIPOutputStream);
                            gZIPOutputStream.finish();
                        } catch (Throwable th) {
                            th = th;
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        x2.a("OkHttpPostRequest: populating post request body without using gzip");
                        this.a.a(byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        gZIPOutputStream = null;
                    }
                    Request build = new Request.Builder().url(str).header("Content-Encoding", "gzip").post(RequestBody.create(byteArrayOutputStream.toByteArray(), d)).build();
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    byteArrayOutputStream.close();
                    Response execute = this.b.getOkHttpClient().newCall(build).execute();
                    try {
                        int code = execute.code();
                        if (code != 200 && code != 204) {
                            x2.a("OkHttpPostRequest error: response code " + code);
                            d2.a = false;
                            if (code == 200) {
                                x2.a("OkHttpPostRequest: processing server response");
                                ResponseBody body = execute.body();
                                String string = body != null ? body.string() : null;
                                if (TextUtils.isEmpty(string)) {
                                    x2.a("OkHttpPostRequest: response data is empty");
                                } else {
                                    d2.b = string;
                                }
                            }
                            execute.close();
                            return d2;
                        }
                        x2.a("OkHttpPostRequest: response successfully received");
                        d2.a = true;
                        if (code == 200) {
                        }
                        execute.close();
                        return d2;
                    } catch (Throwable th2) {
                        response = execute;
                        th = th2;
                        try {
                            x2.a("OkHttpPostRequest error: error while sending data", th);
                            d2.a = false;
                            d2.c = "OkHttpPostRequest error: error while sending data";
                            return d2;
                        } finally {
                            if (response != null) {
                                response.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
