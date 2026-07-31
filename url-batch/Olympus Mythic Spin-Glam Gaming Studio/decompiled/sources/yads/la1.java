package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class la1 implements FlowCollector {
    public final /* synthetic */ IntegrationInspectorActivity a;

    public la1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.a = integrationInspectorActivity;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        IntegrationInspectorActivity.b(this.a).a((z90) obj);
        return Unit.INSTANCE;
    }
}
