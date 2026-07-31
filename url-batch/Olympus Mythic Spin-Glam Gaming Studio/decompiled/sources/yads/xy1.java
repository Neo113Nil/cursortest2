package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class xy1 {
    public final j21 a;
    public final mj1 b;
    public final wh c;
    public final di d;

    public xy1(Context context) {
        j21 j21Var = new j21(context, new m31());
        mj1 mj1Var = new mj1(j21Var);
        wh whVar = new wh();
        di diVar = new di();
        this.a = j21Var;
        this.b = mj1Var;
        this.c = whVar;
        this.d = diVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r8.equals("icon") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r0 = new yads.r31();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r8.equals("review_count") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        r0 = new yads.u92();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r8.equals("rating") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r8.equals("favicon") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0037, code lost:
    
        if (r8.equals("icon") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004d, code lost:
    
        r0 = new yads.k21();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003e, code lost:
    
        if (r8.equals("feedback") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0045, code lost:
    
        if (r8.equals("favicon") == false) goto L23;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ph a(Object obj, String str) {
        ci k21Var;
        vh o43Var;
        this.d.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1074675180) {
            if (hashCode != -191501435) {
                if (hashCode != 3226745) {
                    if (hashCode == 103772132 && str.equals("media")) {
                        k21Var = new pj1();
                    }
                }
                k21Var = new p43();
            }
        }
        if (obj == null || !k21Var.a(obj)) {
            return null;
        }
        this.c.getClass();
        switch (str.hashCode()) {
            case -1678958759:
                if (str.equals("close_button")) {
                    o43Var = new yv();
                    break;
                }
                o43Var = new o43();
                break;
            case -1074675180:
                break;
            case -938102371:
                break;
            case -807286424:
                break;
            case -191501435:
                if (str.equals("feedback")) {
                    o43Var = new pt0();
                    break;
                }
                o43Var = new o43();
                break;
            case 3226745:
                break;
            case 103772132:
                if (str.equals("media")) {
                    o43Var = new nj1();
                    break;
                }
                o43Var = new o43();
                break;
            default:
                o43Var = new o43();
                break;
        }
        return o43Var.a(obj, str);
    }
}
