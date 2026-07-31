package com.ogury.ad.internal;

import android.app.Activity;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a4 extends a {
    public final /* synthetic */ g a;
    public final /* synthetic */ b4 b;

    public a4(g gVar, b4 b4Var) {
        this.a = gVar;
        this.b = b4Var;
    }

    @Override // com.ogury.ad.internal.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g gVar = this.a;
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(gVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a();
        g gVar = this.a;
        activity.addContentView(gVar, gVar.getLayoutParams());
    }
}
