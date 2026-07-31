package io.bidmachine.rendering.internal;

import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.rendering.model.AdElementParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface b {
    default void a(ViewGroup rootContainer) {
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
    }

    void a(ClickAreaFactory clickAreaFactory);

    void b();

    void c();

    void destroy();

    void e();

    AdElementParams g();

    boolean h();

    View i();

    default void m() {
    }
}
