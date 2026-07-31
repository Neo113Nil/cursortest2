package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC4604d5 extends Handler {
    private static final String b = "DownloadHandler";
    Pc a;

    public HandlerC4604d5(Looper looper) {
        super(looper);
    }

    public void a(Pc pc) {
        if (pc == null) {
            throw new IllegalArgumentException();
        }
        this.a = pc;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Pc pc = this.a;
        if (pc == null) {
            Logger.i(b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                pc.a((C5005z8) message.obj);
            } else {
                this.a.a((C5005z8) message.obj, new C4840q8(i, C4995yg.a(i)));
            }
        } catch (Throwable th) {
            C4782n4.d().a(th);
            Logger.i(b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a() {
        this.a = null;
    }
}
