package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mg extends View {
    public final /* synthetic */ lg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(lg lgVar, Context context) {
        super(context);
        this.f = lgVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f.run();
    }
}
