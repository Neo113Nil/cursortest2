package com.five_corp.ad.internal.system;

import android.os.HandlerThread;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class c {
    public final ArrayList a = new ArrayList();
    public int b;

    public c() {
        for (int i = 0; i < 3; i++) {
            HandlerThread handlerThread = new HandlerThread("com.five-corp.io-" + i);
            handlerThread.start();
            this.a.add(handlerThread);
        }
        this.b = 0;
    }
}
