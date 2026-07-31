package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import yads.a20;
import yads.fm;
import yads.uk3;
import yads.za1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/features/debugpanel/common/BaseActivity;", "Lyads/za1;", "T", "Landroid/app/Activity;", "<init>", "()V", "yads/fm", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseActivity<T extends za1> extends Activity {
    private final CoroutineScope a = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new a20()));
    private za1 c;

    public BaseActivity() {
        boolean z = getLastNonConfigurationInstance() instanceof fm;
    }

    /* renamed from: a, reason: from getter */
    protected final CoroutineScope getA() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final za1 b() {
        za1 za1Var = this.c;
        if (za1Var != null) {
            return za1Var;
        }
        za1 a = c().a();
        this.c = a;
        return a;
    }

    public abstract uk3 c();

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.y, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        fm fmVar = lastNonConfigurationInstance instanceof fm ? (fm) lastNonConfigurationInstance : null;
        if (fmVar != null) {
            za1 za1Var = fmVar.a;
            this.c = za1Var != null ? za1Var : null;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        za1 za1Var;
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this.a, null, 1, null);
        if (isChangingConfigurations() || (za1Var = this.c) == null) {
            return;
        }
        CoroutineScopeKt.cancel$default(za1Var.a, null, 1, null);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        return new fm(b());
    }
}
