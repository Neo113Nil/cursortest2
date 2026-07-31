package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class uw {
    public static bx a(og1 og1Var, mw mwVar) {
        bx xwVar;
        String str = mwVar.c;
        try {
            int ordinal = mwVar.ordinal();
            if (ordinal != 0) {
                boolean z = true;
                if (ordinal == 1) {
                    int a = ((qg1) og1Var).a(-1, str);
                    Integer valueOf = Integer.valueOf(a);
                    if (a == -1) {
                        valueOf = null;
                    }
                    xwVar = new yw(valueOf != null ? String.valueOf(valueOf.intValue()) : null);
                } else if (ordinal == 2) {
                    if (((qg1) og1Var).a(-1, str) == -1) {
                        z = false;
                    }
                    xwVar = new ww(z);
                } else if (ordinal == 3) {
                    xwVar = new zw(((qg1) og1Var).c(str));
                } else if (ordinal == 4) {
                    xwVar = new ax(((qg1) og1Var).c(str));
                } else {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xwVar = new vw(((qg1) og1Var).c(str));
                }
            } else {
                xwVar = new xw(((qg1) og1Var).c(str));
            }
            return xwVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
