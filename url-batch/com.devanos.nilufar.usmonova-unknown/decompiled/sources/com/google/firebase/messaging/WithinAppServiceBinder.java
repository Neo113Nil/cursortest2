package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.WithinAppServiceConnection;
import o.ExecutorC2280yJ;
import o.MU;

/* loaded from: classes.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    public interface IntentHandler {
        MU handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "service received new intent via bind strategy");
        }
        this.intentHandler.handle(bindRequest.intent).a(new ExecutorC2280yJ(), new c(3, bindRequest));
    }
}
