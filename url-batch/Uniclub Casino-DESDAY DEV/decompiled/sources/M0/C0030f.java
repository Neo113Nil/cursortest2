package M0;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030f extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030f(q qVar, int i) {
        super(qVar);
        this.f516e = i;
    }

    @Override // M0.r
    public void r() {
        switch (this.f516e) {
            case 0:
                q qVar = this.f562b;
                qVar.f553o = null;
                CheckableImageButton checkableImageButton = qVar.f547g;
                checkableImageButton.setOnLongClickListener(null);
                q1.d.T(checkableImageButton, null);
                break;
        }
    }
}
