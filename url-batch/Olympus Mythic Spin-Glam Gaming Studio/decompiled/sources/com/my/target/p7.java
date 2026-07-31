package com.my.target;

import android.view.ViewGroup;
import com.my.target.internal.api.internalnativead.InternalNativeAdComposeController;
import com.my.target.internal.api.internalnativead.InternalNativeAdController;
import com.my.target.internal.api.internalnativead.InternalNativeAdControllerFactory;
import com.my.target.internal.api.internalnativead.InternalNativeAdMultiPartController;
import com.my.target.internal.api.internalnativead.InternalNativeAdSinglePartController;
import com.my.target.internal.api.internalnativead.binders.InternalNativeAdBinder;
import com.my.target.internal.api.internalnativead.medialoader.InternalNativeMediaLoader;
import com.my.target.internal.api.internalnativead.models.InternalNativeBanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class p7 implements InternalNativeAdControllerFactory {
    private final InternalNativeMediaLoader a;
    private InternalNativeAdController.Listener d;
    private InternalNativeAdComposeController.Listener e;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private int f = 0;

    private p7(InternalNativeMediaLoader internalNativeMediaLoader) {
        this.a = internalNativeMediaLoader;
    }

    public static p7 a(InternalNativeMediaLoader internalNativeMediaLoader) {
        return new p7(internalNativeMediaLoader);
    }

    public InternalNativeAdComposeController getComposeControllerFor(InternalNativeBanner internalNativeBanner) {
        if (!this.c.containsKey(internalNativeBanner)) {
            this.c.put(internalNativeBanner, o7.a(internalNativeBanner, this.e));
        }
        o7 o7Var = (o7) this.c.get(internalNativeBanner);
        Objects.requireNonNull(o7Var);
        return o7Var;
    }

    public InternalNativeAdSinglePartController getControllerFor(InternalNativeBanner internalNativeBanner) {
        return a(internalNativeBanner);
    }

    public InternalNativeAdMultiPartController getMultipartControllerFor(InternalNativeBanner internalNativeBanner) {
        return a(internalNativeBanner);
    }

    public void recycle(InternalNativeAdBinder internalNativeAdBinder) {
        ViewGroup rootView = internalNativeAdBinder.getRootView();
        int i = rootView.getContext().getResources().getDisplayMetrics().widthPixels;
        boolean z = this.f != i;
        this.f = i;
        if (z) {
            mi.b("IntlAdCtrlFactory", "Device configuration was changed");
        }
        for (q7 q7Var : this.b.values()) {
            if (z) {
                q7Var.b();
            } else if (q7Var.b(rootView)) {
                q7Var.unregister(internalNativeAdBinder);
                return;
            }
        }
    }

    public void setComposeListener(InternalNativeAdComposeController.Listener listener) {
        this.e = listener;
    }

    public void setListener(InternalNativeAdController.Listener listener) {
        this.d = listener;
    }

    private InternalNativeAdController a(InternalNativeBanner internalNativeBanner) {
        if (!this.b.containsKey(internalNativeBanner)) {
            this.b.put(internalNativeBanner, q7.a(internalNativeBanner, this.a, this.d));
        }
        q7 q7Var = (q7) this.b.get(internalNativeBanner);
        Objects.requireNonNull(q7Var);
        return q7Var;
    }
}
