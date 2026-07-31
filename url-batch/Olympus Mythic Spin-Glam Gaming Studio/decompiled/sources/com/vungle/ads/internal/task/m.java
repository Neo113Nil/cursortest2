package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class m implements d {
    public final Context a;

    public m(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.a = context;
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h jobRunner) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        ((com.vungle.ads.internal.network.r) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new l(this.a)).getValue()).b();
        return 0;
    }
}
