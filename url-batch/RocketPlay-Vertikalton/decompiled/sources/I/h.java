package I;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f582a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f583b;

    public h(g gVar, boolean z2) {
        this.f583b = gVar;
        this.f582a = z2;
    }

    public boolean a() {
        return this.f582a;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((g) this.f583b) == null) {
            return a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            h hVar = i.f584a;
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

    public h(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f583b = bottomSheetBehavior;
        this.f582a = z2;
    }
}
