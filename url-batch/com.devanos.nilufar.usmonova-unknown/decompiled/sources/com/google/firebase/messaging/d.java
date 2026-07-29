package com.google.firebase.messaging;

import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import o.InterfaceC1302jU;
import o.MU;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1302jU, RequestDeduplicator.GetTokenRequest {
    public final /* synthetic */ FirebaseMessaging h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Store.Token j;

    public /* synthetic */ d(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.h = firebaseMessaging;
        this.i = str;
        this.j = token;
    }

    @Override // o.InterfaceC1302jU
    public MU m(Object obj) {
        MU lambda$blockingGetToken$13;
        lambda$blockingGetToken$13 = this.h.lambda$blockingGetToken$13(this.i, this.j, (String) obj);
        return lambda$blockingGetToken$13;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public MU start() {
        MU lambda$blockingGetToken$14;
        lambda$blockingGetToken$14 = this.h.lambda$blockingGetToken$14(this.i, this.j);
        return lambda$blockingGetToken$14;
    }
}
