package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class rd extends ci {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rd(bi biVar, int i) {
        super(biVar);
        this.e = i;
    }

    @Override // defpackage.ci
    public void q() {
        switch (this.e) {
            case 0:
                bi biVar = this.b;
                biVar.t = null;
                CheckableImageButton checkableImageButton = biVar.l;
                checkableImageButton.setOnLongClickListener(null);
                m60.X(checkableImageButton, null);
                break;
        }
    }
}
