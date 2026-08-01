package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class h80 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h80(Bundle bundle, int i) {
        super(1);
        this.e = i;
        this.f = bundle;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        Bundle bundle = this.f;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                return Boolean.valueOf(!bundle.containsKey(r2));
            default:
                ((String) obj).getClass();
                return Boolean.valueOf(!bundle.containsKey(r2));
        }
    }
}
