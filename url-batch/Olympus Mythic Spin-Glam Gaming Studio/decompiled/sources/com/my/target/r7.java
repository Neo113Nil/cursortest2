package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetManager;
import com.my.target.internal.api.InternalNativeAdFactory;
import com.my.target.internal.api.internalnativead.InternalNativeAdControllerFactory;
import com.my.target.internal.api.internalnativead.InternalNativeAdParser;
import com.my.target.internal.api.internalnativead.medialoader.InternalNativeMediaLoader;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class r7 implements InternalNativeAdFactory {
    public r7(Context context) {
        if (MyTargetManager.isSdkInitialized()) {
            return;
        }
        MyTargetManager.initSdk(context);
    }

    public InternalNativeAdControllerFactory newControllerFactory() {
        return p7.a(newLoader());
    }

    public InternalNativeMediaLoader newLoader() {
        return w7.b();
    }

    public InternalNativeAdParser newParser() {
        return k7.a();
    }
}
