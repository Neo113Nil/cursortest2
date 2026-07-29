package o;

import com.google.firebase.installations.FirebaseInstallations;

/* renamed from: o.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0992em implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ FirebaseInstallations i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ RunnableC0992em(FirebaseInstallations firebaseInstallations, boolean z, int i) {
        this.h = i;
        this.i = firebaseInstallations;
        this.j = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                this.i.lambda$doRegistrationOrRefresh$3(this.j);
                break;
            default:
                this.i.lambda$getToken$2(this.j);
                break;
        }
    }
}
