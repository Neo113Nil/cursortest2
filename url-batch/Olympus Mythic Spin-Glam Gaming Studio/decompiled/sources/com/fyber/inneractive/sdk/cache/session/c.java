package com.fyber.inneractive.sdk.cache.session;

import android.app.Application;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.io.Closeable;
import java.io.FileInputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c implements Runnable {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        FileInputStream fileInputStream;
        String str;
        Application application = o.a;
        JSONObject jSONObject = null;
        try {
            fileInputStream = application.openFileInput("session_details.json");
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            str = fileInputStream.read(bArr) == available ? new String(bArr, "UTF-8") : null;
        } catch (Throwable unused2) {
            try {
                IAlog.a("readFileFromContext failed reading %s", "session_details.json");
                v.a((Closeable) fileInputStream);
                str = null;
                if (!TextUtils.isEmpty(str)) {
                }
            } finally {
                v.a((Closeable) fileInputStream);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.a.getClass();
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable unused3) {
            IAlog.f("Failed parsing SessionCache", new Object[0]);
        }
        if (jSONObject != null) {
            r.b.post(new b(this, jSONObject));
        } else {
            application.deleteFile("session_details.json");
            this.a.getClass();
        }
    }
}
