package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.є, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0560 implements q {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0506 f809;

    public C0560(C0506 c0506) {
        this.f809 = c0506;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.q
    /* renamed from: ﾇ */
    public final void mo3962(View view) {
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.q
    /* renamed from: ﾒ */
    public final void mo3963(View view) {
        boolean z;
        C1213 m4452 = C1213.m4452();
        synchronized (m4452) {
            z = m4452.f3198;
        }
        if (z) {
            this.f809.m4032();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getContext() instanceof Activity) {
                ViewGroup viewGroup2 = (ViewGroup) ((Activity) viewGroup.getContext()).findViewById(R.id.content);
                this.f809.getClass();
                if (viewGroup2 != null) {
                    ViewGroup viewGroup3 = viewGroup2;
                    while (true) {
                        if (viewGroup2 != null) {
                            ViewParent parent = viewGroup2.getParent();
                            if (parent != viewGroup) {
                                if (!(parent instanceof ViewGroup)) {
                                    break;
                                }
                                viewGroup3 = viewGroup2;
                                viewGroup2 = (ViewGroup) parent;
                            } else if (viewGroup3 != viewGroup2) {
                                viewGroup = viewGroup3;
                            }
                        } else {
                            break;
                        }
                    }
                    viewGroup = viewGroup2;
                }
            }
            C0506 c0506 = this.f809;
            c0506.getClass();
            C0506.m4031(c0506, viewGroup, new ViewOnLayoutChangeListenerC0558(c0506, viewGroup));
        }
    }
}
