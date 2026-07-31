package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5835ym implements Bm {
    public volatile C5783wm a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Bm
    public final void a(@NotNull C5783wm c5783wm) {
        this.a = c5783wm;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Bm) it.next()).a(c5783wm);
        }
    }

    public final void b(@NotNull Bm bm) {
        this.b.remove(bm);
    }

    @NotNull
    public final C5783wm a() {
        C5783wm c5783wm = this.a;
        if (c5783wm != null) {
            return c5783wm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupState");
        return null;
    }

    public final void a(@NotNull Bm bm) {
        this.b.add(bm);
        if (this.a != null) {
            C5783wm c5783wm = this.a;
            if (c5783wm == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startupState");
                c5783wm = null;
            }
            bm.a(c5783wm);
        }
    }

    public final void a(@NotNull Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((AbstractC5420in) C5369gn.a(Am.class)).create(context);
        Oo a = Ka.k().D().a();
        synchronized (a) {
            optStringOrNull = JsonUtils.optStringOrNull(a.a.a(), "device_id");
        }
        a(new C5783wm(optStringOrNull, a.a(), (Am) create.read()));
    }
}
