package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes13.dex */
public final class X8 extends OrientationEventListener {
    public static final /* synthetic */ KProperty[] d = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(X8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};
    public final InMobiAdActivity a;
    public final HashSet b;
    public final W8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8(InMobiAdActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
        this.b = new HashSet();
        Delegates delegates = Delegates.INSTANCE;
        this.c = new W8(Uf.a(R5.g()), this);
    }

    public final void a(Vf orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.a) {
                this.a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.b;
            if (Intrinsics.areEqual(str, "landscape")) {
                this.a.setRequestedOrientation(6);
            } else if (Intrinsics.areEqual(str, "portrait")) {
                this.a.setRequestedOrientation(7);
            } else {
                this.a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i = this.a.getResources().getConfiguration().orientation;
        byte g = R5.g();
        int i2 = 1;
        if (g != 1 && g != 2 && (g == 3 || g == 4)) {
            i2 = 2;
        }
        if (i == i2) {
            this.c.setValue(this, d[0], Uf.a(R5.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        b();
    }

    public final void a() {
        if (this.b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
