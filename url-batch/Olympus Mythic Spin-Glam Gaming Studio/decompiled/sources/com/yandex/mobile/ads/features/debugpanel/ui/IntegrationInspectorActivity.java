package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import yads.ba0;
import yads.da0;
import yads.dt;
import yads.e80;
import yads.ka1;
import yads.l90;
import yads.ma1;
import yads.o90;
import yads.oa1;
import yads.pa1;
import yads.r70;
import yads.r90;
import yads.ra1;
import yads.uk3;
import yads.za1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/ads/features/debugpanel/ui/IntegrationInspectorActivity;", "Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lyads/za1;", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntegrationInspectorActivity extends BaseActivity<za1> {
    private final Lazy d = LazyKt.lazy(new ka1(this));
    private final Lazy e = LazyKt.lazy(new ra1(this));
    private final Lazy f = LazyKt.lazy(new pa1(this));

    public static final r70 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (r70) integrationInspectorActivity.d.getValue();
    }

    public static final ba0 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (ba0) integrationInspectorActivity.f.getValue();
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final uk3 c() {
        return ((r70) this.d.getValue()).a();
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.y, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(o90.a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(l90.a);
        CoroutineScope a = getA();
        BuildersKt__Builders_commonKt.launch$default(a, null, null, new ma1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(a, null, null, new oa1(this, null), 3, null);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    protected final void onDestroy() {
        e80 e80Var = (e80) ((r70) this.d.getValue()).r.getValue();
        Iterator it = e80Var.b.iterator();
        while (it.hasNext()) {
            ((dt) it.next()).cancel();
        }
        e80Var.b.clear();
        super.onDestroy();
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationInspectorActivity.a(IntegrationInspectorActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(r90.a);
    }

    public static final da0 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (da0) integrationInspectorActivity.e.getValue();
    }
}
