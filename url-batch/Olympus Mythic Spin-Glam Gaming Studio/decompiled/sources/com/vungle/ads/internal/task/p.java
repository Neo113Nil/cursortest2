package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class p implements e {
    public final Context a;
    public final PathProvider b;

    public p(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.a = context;
        this.b = pathProvider;
    }

    public final d a(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.length() == 0) {
            throw new o("Job tag is null");
        }
        if (Intrinsics.areEqual(tag, "CleanupJob")) {
            return new c(this.a, this.b);
        }
        if (Intrinsics.areEqual(tag, "ResendTpatJob")) {
            return new m(this.a, this.b);
        }
        throw new o(com.iab.omid.library.vungle.d.a("Unknown Job Type ", tag));
    }
}
