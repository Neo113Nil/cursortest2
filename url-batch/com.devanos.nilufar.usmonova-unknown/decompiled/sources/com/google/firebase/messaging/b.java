package com.google.firebase.messaging;

import o.InterfaceC1302jU;
import o.MU;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1302jU {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    public /* synthetic */ b(String str, int i) {
        this.h = i;
        this.i = str;
    }

    @Override // o.InterfaceC1302jU
    public final MU m(Object obj) {
        MU lambda$subscribeToTopic$10;
        MU lambda$unsubscribeFromTopic$11;
        switch (this.h) {
            case 0:
                lambda$subscribeToTopic$10 = FirebaseMessaging.lambda$subscribeToTopic$10(this.i, (TopicsSubscriber) obj);
                return lambda$subscribeToTopic$10;
            default:
                lambda$unsubscribeFromTopic$11 = FirebaseMessaging.lambda$unsubscribeFromTopic$11(this.i, (TopicsSubscriber) obj);
                return lambda$unsubscribeFromTopic$11;
        }
    }
}
