package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class tw {
    public static bx a(og1 og1Var, mw mwVar) {
        bx xwVar;
        String str = mwVar.b;
        if (str == null) {
            return null;
        }
        try {
            int ordinal = mwVar.ordinal();
            if (ordinal == 0) {
                xwVar = new xw(((qg1) og1Var).c(str));
            } else if (ordinal == 1) {
                xwVar = new yw(((qg1) og1Var).c(str));
            } else if (ordinal == 2) {
                xwVar = new ww(((qg1) og1Var).a(str, false));
            } else if (ordinal == 3) {
                xwVar = new zw(((qg1) og1Var).c(str));
            } else {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xwVar = new ax(((qg1) og1Var).c(str));
            }
            return xwVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
