package io.bidmachine.rendering.internal;

import android.content.Context;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.model.Background;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class w {
    public static final v a(Background background, Context context, Repository repository) {
        Intrinsics.checkNotNullParameter(background, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new v(context, repository, background);
    }
}
