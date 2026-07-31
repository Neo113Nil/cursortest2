package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* loaded from: classes13.dex */
class Af implements Runnable {
    private final Handler a;
    private final C4568b5 b;

    Af(C4568b5 c4568b5, Handler handler) {
        this.b = c4568b5;
        this.a = handler;
    }

    Z5 a(C4568b5 c4568b5, String str, long j) {
        return new Z5(c4568b5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C5005z8 c5005z8 = new C5005z8(this.b.b().getParent(), this.b.b().getName());
        Message a = a();
        a.obj = c5005z8;
        String a2 = a(c5005z8.getParent());
        if (a2 == null) {
            a.what = 1020;
            this.a.sendMessage(a);
        } else {
            C4586c5 call = a(new C4568b5(c5005z8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), a2, 3L).call();
            a.what = call.b() == 200 ? 1016 : call.b();
            this.a.sendMessage(a);
        }
    }

    Message a() {
        return new Message();
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
