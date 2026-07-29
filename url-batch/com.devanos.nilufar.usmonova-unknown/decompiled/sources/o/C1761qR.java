package o;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: o.qR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761qR extends AbstractC1596ny implements InterfaceC2114vp {
    public static final C1761qR h = new C1761qR(1);

    @Override // o.InterfaceC2114vp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        AbstractC0048Bt.n(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
