package o;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: o.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1058fm implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ FirebaseMessaging i;
    public final /* synthetic */ NU j;

    public /* synthetic */ RunnableC1058fm(FirebaseMessaging firebaseMessaging, NU nu, int i) {
        this.h = i;
        this.i = firebaseMessaging;
        this.j = nu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                this.i.lambda$deleteToken$9(this.j);
                break;
            case 1:
                this.i.lambda$getToken$7(this.j);
                break;
            default:
                this.i.lambda$deleteToken$8(this.j);
                break;
        }
    }
}
