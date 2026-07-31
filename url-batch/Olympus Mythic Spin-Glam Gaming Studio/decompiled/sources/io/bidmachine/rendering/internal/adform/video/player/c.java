package io.bidmachine.rendering.internal.adform.video.player;

import android.content.Context;
import io.bidmachine.rendering.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class c {
    public static final c a = new c();

    private c() {
    }

    public static final b a(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(str, "exo")) {
            k.b("PlayerFactory", "Create player (ExoPlayerImpl)", new Object[0]);
            return new io.bidmachine.rendering.internal.adform.video.player.exo.a(context);
        }
        k.b("PlayerFactory", "Create player (MediaPlayerImpl)", new Object[0]);
        return new io.bidmachine.rendering.internal.adform.video.player.media.a(context);
    }
}
