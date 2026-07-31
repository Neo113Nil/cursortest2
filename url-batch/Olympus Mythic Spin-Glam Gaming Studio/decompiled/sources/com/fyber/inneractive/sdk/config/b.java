package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v1;

/* loaded from: classes5.dex */
public final class b implements Handler.Callback {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        e eVar = this.a;
        if (eVar.b.compareAndSet(false, true)) {
            if (eVar.b.get() && eVar.d != null) {
                IAlog.a("startCounting", new Object[0]);
                v1 v1Var = eVar.d;
                v1Var.d = false;
                v1Var.c.sendEmptyMessage(1932593528);
            }
            IAlog.a("Pause signal", new Object[0]);
        }
        return true;
    }
}
