package com.devanos.nilufar.usmonova.p7.push;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0115Ei;
import o.AbstractC0868ct;
import o.AbstractC1052fg;
import o.C0191Hg;
import o.C0830cH;
import o.C1434lU;
import o.ExecutorC0035Bg;
import o.InterfaceC0422Qe;
import o.PO;
import o.PX;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/devanos/nilufar/usmonova/p7/push/P7FirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", "token", "Lo/bY;", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Lo/Qe;", "scope", "Lo/Qe;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P7FirebaseMessagingService extends FirebaseMessagingService {
    public static final int $stable = 8;
    private final InterfaceC0422Qe scope;

    public P7FirebaseMessagingService() {
        C1434lU a = PO.a();
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        this.scope = AbstractC1052fg.c(PX.E0(a, ExecutorC0035Bg.j));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        AbstractC0048Bt.n(message, "message");
        super.onMessageReceived(message);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        AbstractC0048Bt.n(token, "token");
        super.onNewToken(token);
        AbstractC0868ct.H(this.scope, null, null, new C0830cH(token, null), 3);
    }
}
