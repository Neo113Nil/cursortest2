package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.database.FirebaseDatabaseComponent;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.cg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0855cg implements ComponentFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ C0855cg(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        FirebaseDatabaseComponent lambda$getComponents$0;
        UserAgentPublisher lambda$component$0;
        ScheduledExecutorService lambda$getComponents$4;
        ScheduledExecutorService lambda$getComponents$5;
        ScheduledExecutorService lambda$getComponents$6;
        Executor lambda$getComponents$7;
        FirebaseInstallationsApi lambda$getComponents$02;
        InterfaceC2161wW lambda$getComponents$03;
        InterfaceC2161wW lambda$getComponents$1;
        InterfaceC2161wW lambda$getComponents$2;
        switch (this.a) {
            case 0:
                lambda$getComponents$0 = DatabaseRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            case 1:
                lambda$component$0 = DefaultUserAgentPublisher.lambda$component$0(componentContainer);
                return lambda$component$0;
            case 2:
                lambda$getComponents$4 = ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
                return lambda$getComponents$4;
            case 3:
                lambda$getComponents$5 = ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
                return lambda$getComponents$5;
            case 4:
                lambda$getComponents$6 = ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
                return lambda$getComponents$6;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                lambda$getComponents$7 = ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
                return lambda$getComponents$7;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$02;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                lambda$getComponents$03 = TransportRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$03;
            case 8:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(componentContainer);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(componentContainer);
                return lambda$getComponents$2;
        }
    }
}
