package com.ogury.ad.internal;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class r3 implements y4 {
    public final v4 a;

    public r3(ti loadCallback) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        this.a = loadCallback;
    }

    @Override // com.ogury.ad.internal.y4
    public final void a() {
    }

    @Override // com.ogury.ad.internal.y4
    public final void a(LinkedList loadCommands, int i) {
        Intrinsics.checkNotNullParameter(loadCommands, "loadCommands");
        Iterator it = loadCommands.iterator();
        while (it.hasNext()) {
            ((ri) it.next()).a(this.a, i);
        }
    }
}
