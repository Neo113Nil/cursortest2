package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

/* renamed from: o.Ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0009Ag implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Qualified b;

    public /* synthetic */ C0009Ag(Qualified qualified, int i) {
        this.a = i;
        this.b = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        DefaultHeartBeatController lambda$component$3;
        FirebaseMessaging lambda$getComponents$0;
        switch (this.a) {
            case 0:
                lambda$component$3 = DefaultHeartBeatController.lambda$component$3(this.b, componentContainer);
                return lambda$component$3;
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.b, componentContainer);
                return lambda$getComponents$0;
        }
    }
}
