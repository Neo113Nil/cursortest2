package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class na1 implements FlowCollector {
    public final /* synthetic */ IntegrationInspectorActivity a;

    public na1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.a = integrationInspectorActivity;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ca0 ca0Var = (ca0) obj;
        da0 c = IntegrationInspectorActivity.c(this.a);
        c.getClass();
        if (ca0Var.c) {
            c.a.submitList(CollectionsKt.emptyList());
            c.c.setVisibility(0);
        } else {
            c.a.submitList(ca0Var.d);
            c.c.setVisibility(8);
        }
        c.b.setText(ca0Var.b.a);
        return Unit.INSTANCE;
    }
}
