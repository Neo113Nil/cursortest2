package I;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f244a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f245b;

    public g(f fVar, boolean z2) {
        this.f245b = fVar;
        this.f244a = z2;
    }

    public boolean a() {
        return this.f244a;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((f) this.f245b) == null) {
            return a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            g gVar = h.f246a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return a();
        }
        return false;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f245b = bottomSheetBehavior;
        this.f244a = z2;
    }
}
