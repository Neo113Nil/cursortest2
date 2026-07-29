package o;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;

/* renamed from: o.zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2369zg implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ CallableC2369zg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$getHeartBeatsHeader$1;
        Void lambda$registerHeartBeat$0;
        Void deleteFirebaseInstallationId;
        switch (this.a) {
            case 0:
                lambda$getHeartBeatsHeader$1 = ((DefaultHeartBeatController) this.b).lambda$getHeartBeatsHeader$1();
                return lambda$getHeartBeatsHeader$1;
            case 1:
                lambda$registerHeartBeat$0 = ((DefaultHeartBeatController) this.b).lambda$registerHeartBeat$0();
                return lambda$registerHeartBeat$0;
            default:
                deleteFirebaseInstallationId = ((FirebaseInstallations) this.b).deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
        }
    }
}
