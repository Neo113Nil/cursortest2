package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Ll {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public Ll(ArrayList resources, ArrayList inlineTrackers, ArrayList wrapperTrackers) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(inlineTrackers, "inlineTrackers");
        Intrinsics.checkNotNullParameter(wrapperTrackers, "wrapperTrackers");
        this.a = resources;
        this.b = inlineTrackers;
        this.c = wrapperTrackers;
    }
}
