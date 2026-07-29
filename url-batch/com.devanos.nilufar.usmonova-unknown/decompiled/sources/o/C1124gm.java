package o;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: o.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1124gm implements FirebaseInstanceIdInternal.NewTokenListener, InterfaceC1224iG {
    public final /* synthetic */ int h;
    public final /* synthetic */ FirebaseMessaging i;

    public /* synthetic */ C1124gm(FirebaseMessaging firebaseMessaging, int i) {
        this.h = i;
        this.i = firebaseMessaging;
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        switch (this.h) {
            case 1:
                this.i.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
            default:
                this.i.lambda$handleProxiedNotificationData$5((C0419Qb) obj);
                break;
        }
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        this.i.lambda$new$1(str);
    }
}
