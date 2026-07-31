package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class pa1 extends Lambda implements Function0 {
    public final /* synthetic */ IntegrationInspectorActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.b = integrationInspectorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ba0(this.b);
    }
}
