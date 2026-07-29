package o;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: o.rR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1826rR extends AbstractC1596ny implements InterfaceC2114vp {
    public static final C1826rR h = new C1826rR(1);

    @Override // o.InterfaceC2114vp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        AbstractC0048Bt.n(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
