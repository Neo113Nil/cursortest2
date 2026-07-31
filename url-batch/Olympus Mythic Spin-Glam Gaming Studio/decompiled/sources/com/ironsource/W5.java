package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public class W5 extends Handler {
    private final ConcurrentHashMap<String, Pc> a;

    public W5(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    private boolean a(int i) {
        return i == 1016 || i == 1015;
    }

    void a(String str, Pc pc) {
        if (str == null || pc == null) {
            return;
        }
        this.a.put(str, pc);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C5005z8 c5005z8 = (C5005z8) message.obj;
            String path = c5005z8.getPath();
            Pc pc = this.a.get(path);
            if (pc == null) {
                return;
            }
            if (a(message.what)) {
                pc.a(c5005z8);
            } else {
                int i = message.what;
                pc.a(c5005z8, new C4840q8(i, C4995yg.a(i)));
            }
            this.a.remove(path);
        } catch (Throwable th) {
            C4782n4.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
