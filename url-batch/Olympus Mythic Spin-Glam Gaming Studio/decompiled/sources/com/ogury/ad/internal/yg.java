package com.ogury.ad.internal;

import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class yg implements y4 {
    public final v4 a;
    public final LinkedList b;

    public yg(ti loadCallback) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        this.a = loadCallback;
        this.b = new LinkedList();
    }

    @Override // com.ogury.ad.internal.y4
    public final void a(LinkedList loadCommands, int i) {
        Intrinsics.checkNotNullParameter(loadCommands, "loadCommands");
        this.b.addAll(loadCommands);
        ri riVar = (ri) this.b.pollFirst();
        if (riVar != null) {
            riVar.a(this.a, i);
        }
    }

    @Override // com.ogury.ad.internal.y4
    public final void a() {
        ri riVar = (ri) this.b.pollFirst();
        if (riVar != null) {
            riVar.a(this.a, 0);
        }
    }
}
