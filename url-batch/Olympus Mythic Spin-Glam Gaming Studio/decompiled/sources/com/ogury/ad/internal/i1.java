package com.ogury.ad.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class i1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ j1 a;

    public i1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        boolean z;
        Intrinsics.checkNotNullParameter(v, "v");
        j1 j1Var = this.a;
        ViewGroup viewGroup = j1Var.a;
        Class cls = (Class) j1.m.getValue();
        if (cls != null) {
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (cls.isInstance(parent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        j1Var.g = z;
        Logger.INSTANCE.w(LogTag.INTERNAL, SourceTag.ADS, "isComposeEnvironment: " + this.a.g);
        j1.a(this.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.b();
    }
}
