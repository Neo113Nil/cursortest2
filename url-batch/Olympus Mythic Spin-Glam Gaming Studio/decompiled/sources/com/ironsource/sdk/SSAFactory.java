package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.InterfaceC4738ke;
import com.ironsource.P9;

@Deprecated
/* loaded from: classes12.dex */
public class SSAFactory {
    public static InterfaceC4738ke getPublisherInstance(Activity activity) throws Exception {
        return P9.b((Context) activity);
    }

    public static InterfaceC4738ke getPublisherTestInstance(Activity activity, int i) throws Exception {
        return P9.a(activity, i);
    }
}
