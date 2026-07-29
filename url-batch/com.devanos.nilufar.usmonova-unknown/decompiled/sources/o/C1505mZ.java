package o;

import android.text.TextUtils;
import android.view.View;

/* renamed from: o.mZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505mZ extends AbstractC2074vB {
    public final /* synthetic */ int l;

    public C1505mZ(int i, Class cls, int i2, int i3, int i4) {
        this.l = i4;
        this.h = i;
        this.k = cls;
        this.j = i2;
        this.i = i3;
    }

    @Override // o.AbstractC2074vB
    public final Object d(View view) {
        switch (this.l) {
            case 0:
                return Boolean.valueOf(AbstractC1966tZ.d(view));
            case 1:
                return AbstractC1966tZ.b(view);
            default:
                return Boolean.valueOf(AbstractC1966tZ.c(view));
        }
    }

    @Override // o.AbstractC2074vB
    public final void e(View view, Object obj) {
        switch (this.l) {
            case 0:
                AbstractC1966tZ.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC1966tZ.h(view, (CharSequence) obj);
                break;
            default:
                AbstractC1966tZ.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // o.AbstractC2074vB
    public final boolean h(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
