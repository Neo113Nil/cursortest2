package yads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class ra1 extends Lambda implements Function0 {
    public final /* synthetic */ IntegrationInspectorActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.b = integrationInspectorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        za1 b;
        IntegrationInspectorActivity integrationInspectorActivity = this.b;
        b = this.b.b();
        qa1 qa1Var = new qa1(b);
        return new da0(integrationInspectorActivity, qa1Var, new LinearLayoutManager(integrationInspectorActivity, 1, false), new b50(qa1Var, (e80) IntegrationInspectorActivity.a(this.b).r.getValue()));
    }
}
