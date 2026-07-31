package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.fo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4008fo {
    public final GestureDetectorOnGestureListenerC4476xi a;
    public WeakReference b;
    public final AdConfig c;

    public AbstractC4008fo(GestureDetectorOnGestureListenerC4476xi container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
        this.c = container.getAdConfig();
    }

    public void a() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(Context context, byte b);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public abstract View c();

    public abstract void d();
}
