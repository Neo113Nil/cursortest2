package yads;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes13.dex */
public final class ig3 extends ObservableProperty {
    public final /* synthetic */ jg3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig3(jg3 jg3Var) {
        super(null);
        this.a = jg3Var;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        this.a.d.getClass();
    }
}
