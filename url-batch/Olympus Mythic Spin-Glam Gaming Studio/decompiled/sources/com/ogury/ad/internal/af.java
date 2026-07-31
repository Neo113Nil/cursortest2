package com.ogury.ad.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes10.dex */
public final class af {
    public boolean a;
    public List b = CollectionsKt.emptyList();

    public final String toString() {
        return "\n  BlankAdDetection ( \n    enabled = " + this.a + ", \n    algo = " + this.b + " \n    )";
    }
}
