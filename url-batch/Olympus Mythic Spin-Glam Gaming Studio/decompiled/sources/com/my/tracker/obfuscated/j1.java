package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes15.dex */
public final class j1 extends s0 {
    final MyTrackerConfig.OkHttpClientProvider a;

    j1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.a = okHttpClientProvider;
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        Throwable th;
        Response response;
        s0.b d = s0.b.d();
        try {
            x2.a("OkHttpGetRequest: send request to " + str);
            response = this.a.getOkHttpClient().newCall(new Request.Builder().url(str).get().build()).execute();
        } catch (Throwable th2) {
            th = th2;
            response = null;
        }
        try {
            int code = response.code();
            if (code == 200) {
                x2.a("OkHttpGetRequest: response successfully received");
                d.a = true;
            } else {
                x2.a("OkHttpGetRequest error: response code " + code);
                d.a = false;
            }
            if (code == 200) {
                x2.a("OkHttpGetRequest: processing server response");
                ResponseBody body = response.body();
                String string = body != null ? body.string() : null;
                if (TextUtils.isEmpty(string)) {
                    x2.a("OkHttpGetRequest: response data is empty");
                } else {
                    d.b = string;
                }
            }
            response.close();
            return d;
        } catch (Throwable th3) {
            th = th3;
            try {
                x2.a("OkHttpGetRequest error: error while sending data", th);
                d.a = false;
                d.c = "OkHttpGetRequest error: error while sending data";
                return d;
            } finally {
                if (response != null) {
                    response.close();
                }
            }
        }
    }
}
