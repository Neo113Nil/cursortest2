package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes10.dex */
public final class En {
    public final Gn a;
    public final Gn b;

    public En(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.a = new Y2(new Hl(context));
            this.b = new Y2(new C5359gd(context));
        } else {
            this.a = new C5639r8();
            this.b = new C5639r8();
        }
    }
}
