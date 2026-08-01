package P0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.f935e = i;
    }

    @Override // P0.q
    public void r() {
        switch (this.f935e) {
            case 0:
                p pVar = this.f980b;
                pVar.f971o = null;
                CheckableImageButton checkableImageButton = pVar.f965g;
                checkableImageButton.setOnLongClickListener(null);
                F1.d.j0(checkableImageButton, null);
                break;
        }
    }
}
