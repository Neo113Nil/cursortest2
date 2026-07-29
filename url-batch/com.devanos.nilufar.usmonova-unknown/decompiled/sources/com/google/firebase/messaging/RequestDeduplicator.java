package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o.InterfaceC2301ye;
import o.K6;
import o.MU;
import o.p30;

/* loaded from: classes.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, MU> getTokenRequests = new K6(0);

    public interface GetTokenRequest {
        MU start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MU lambda$getOrStartGetTokenRequest$0(String str, MU mu) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return mu;
    }

    public synchronized MU getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        MU mu = this.getTokenRequests.get(str);
        if (mu != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Joining ongoing request for: " + str);
            }
            return mu;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Making new request for: " + str);
        }
        p30 e = getTokenRequest.start().e(this.executor, new InterfaceC2301ye() { // from class: com.google.firebase.messaging.h
            @Override // o.InterfaceC2301ye
            public final Object n(MU mu2) {
                MU lambda$getOrStartGetTokenRequest$0;
                lambda$getOrStartGetTokenRequest$0 = RequestDeduplicator.this.lambda$getOrStartGetTokenRequest$0(str, mu2);
                return lambda$getOrStartGetTokenRequest$0;
            }
        });
        this.getTokenRequests.put(str, e);
        return e;
    }
}
