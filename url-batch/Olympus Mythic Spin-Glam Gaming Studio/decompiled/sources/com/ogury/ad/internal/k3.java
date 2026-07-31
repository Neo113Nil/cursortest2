package com.ogury.ad.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class k3 {
    public final ArrayList a;
    public final ArrayList b;

    public k3(ArrayList whitelist, ArrayList blacklist) {
        Intrinsics.checkNotNullParameter(whitelist, "whitelist");
        Intrinsics.checkNotNullParameter(blacklist, "blacklist");
        this.a = whitelist;
        this.b = blacklist;
    }
}
