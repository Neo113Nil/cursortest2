package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺬ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class HandlerC1270 extends Handler {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1223 f3434;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1270(C1223 c1223, Looper looper) {
        super(looper);
        this.f3434 = c1223;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        AbstractC1252[] abstractC1252Arr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C1223 c1223 = this.f3434;
        do {
            synchronized (c1223.f3220) {
                try {
                    size = c1223.f3218.size();
                    if (size <= 0) {
                        return;
                    }
                    abstractC1252Arr = new AbstractC1252[size];
                    c1223.f3218.toArray(abstractC1252Arr);
                    c1223.f3218.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (size <= 0);
        AbstractC1252 abstractC1252 = abstractC1252Arr[0];
        throw null;
    }
}
