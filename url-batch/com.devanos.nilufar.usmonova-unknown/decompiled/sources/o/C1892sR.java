package o;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: o.sR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892sR extends AbstractC1596ny implements InterfaceC2114vp {
    public static final C1892sR h = new C1892sR(1);

    @Override // o.InterfaceC2114vp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        AbstractC0048Bt.n(sidecarDisplayFeature, "$this$require");
        boolean z = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
