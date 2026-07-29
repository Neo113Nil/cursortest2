package o;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.Xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0602Xc implements Provider {
    public final /* synthetic */ int a;

    public /* synthetic */ C0602Xc(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ScheduledExecutorService lambda$static$0;
        ScheduledExecutorService lambda$static$1;
        ScheduledExecutorService lambda$static$2;
        ScheduledExecutorService lambda$static$3;
        InterfaceC2161wW lambda$clearTransportFactoryForTest$12;
        InterfaceC2161wW lambda$static$02;
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                lambda$static$0 = ExecutorsRegistrar.lambda$static$0();
                return lambda$static$0;
            case 2:
                lambda$static$1 = ExecutorsRegistrar.lambda$static$1();
                return lambda$static$1;
            case 3:
                lambda$static$2 = ExecutorsRegistrar.lambda$static$2();
                return lambda$static$2;
            case 4:
                lambda$static$3 = ExecutorsRegistrar.lambda$static$3();
                return lambda$static$3;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                lambda$clearTransportFactoryForTest$12 = FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
                return lambda$clearTransportFactoryForTest$12;
            default:
                lambda$static$02 = FirebaseMessaging.lambda$static$0();
                return lambda$static$02;
        }
    }
}
