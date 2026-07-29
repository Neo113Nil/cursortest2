package o;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: o.tR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1958tR extends AbstractC1596ny implements InterfaceC2114vp {
    public static final C1958tR h = new C1958tR(1);

    @Override // o.InterfaceC2114vp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        AbstractC0048Bt.n(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
