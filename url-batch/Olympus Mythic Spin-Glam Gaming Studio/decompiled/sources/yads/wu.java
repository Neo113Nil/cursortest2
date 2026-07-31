package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class wu {
    public static String a(vu vuVar) {
        if (vuVar instanceof qu) {
            String str = ((qu) vuVar).a.h;
            return str == null ? "unknown" : str;
        }
        if (vuVar instanceof pu) {
            return "custom";
        }
        if (vuVar instanceof su) {
            return "error";
        }
        if (vuVar instanceof tu) {
            return "browser";
        }
        if (vuVar instanceof uu) {
            return "internal_browser";
        }
        throw new NoWhenBranchMatchedException();
    }
}
