package com.meta.analytics.dsp.uinode;

import android.graphics.PointF;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0373Ec extends ZY {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    public C4Y A00;
    public C4Y A01;

    private int A00(AbstractC01554o abstractC01554o, View view, C4Y c4y) {
        int containerCenter;
        int A0F = c4y.A0F(view) + (c4y.A0D(view) / 2);
        if (abstractC01554o.A1T()) {
            int A0A = c4y.A0A();
            int childCenter = c4y.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = c4y.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private View A01(AbstractC01554o abstractC01554o, C4Y c4y) {
        int childCenter;
        int A0W = abstractC01554o.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC01554o.A1T()) {
            int A0A = c4y.A0A();
            int A0B = c4y.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            int childCount = A0B / 2;
            childCenter = A0A + childCount;
        } else {
            int childCount2 = c4y.A06();
            childCenter = childCount2 / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int absClosest = 0; absClosest < A0W; absClosest++) {
            View A0t = abstractC01554o.A0t(absClosest);
            int A0F = c4y.A0F(A0t);
            int childCount3 = c4y.A0D(A0t);
            int childCount4 = Math.abs((A0F + (childCount3 / 2)) - childCenter);
            if (childCount4 < i) {
                i = childCount4;
                view = A0t;
            }
        }
        return view;
    }

    private View A02(AbstractC01554o abstractC01554o, C4Y c4y) {
        int A0W = abstractC01554o.A0W();
        if (A0W == 0) {
            return null;
        }
        View closestChild = null;
        int childStart = Integer.MAX_VALUE;
        for (int i = 0; i < A0W; i++) {
            View A0t = abstractC01554o.A0t(i);
            int childCount = c4y.A0F(A0t);
            if (childCount < childStart) {
                childStart = childCount;
                if (A02[3].length() != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                closestChild = A0t;
            }
        }
        return closestChild;
    }

    private C4Y A03(AbstractC01554o abstractC01554o) {
        C4Y c4y = this.A00;
        if (c4y == null || c4y.A02 != abstractC01554o) {
            this.A00 = C4Y.A00(abstractC01554o);
        }
        return this.A00;
    }

    private C4Y A04(AbstractC01554o abstractC01554o) {
        C4Y c4y = this.A01;
        if (c4y == null || c4y.A02 != abstractC01554o) {
            this.A01 = C4Y.A01(abstractC01554o);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r4.x < 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r4.y >= 0.0f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meta.analytics.dsp.uinode.ZY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A0C(AbstractC01554o abstractC01554o, int i, int i2) {
        int centerPosition;
        boolean reverseLayout;
        int A0Z = abstractC01554o.A0Z();
        if (A0Z == 0) {
            return -1;
        }
        View view = null;
        if (abstractC01554o.A21()) {
            view = A02(abstractC01554o, A04(abstractC01554o));
        } else if (abstractC01554o.A20()) {
            C4Y A03 = A03(abstractC01554o);
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo";
            view = A02(abstractC01554o, A03);
        }
        if (view == null || (centerPosition = abstractC01554o.A0p(view)) == -1) {
            return -1;
        }
        boolean z = false;
        if (abstractC01554o.A20()) {
            reverseLayout = i > 0;
        } else {
            reverseLayout = i2 > 0;
        }
        boolean z2 = false;
        if (abstractC01554o instanceof AnonymousClass50) {
            int itemCount = A0Z - 1;
            PointF A4O = ((AnonymousClass50) abstractC01554o).A4O(itemCount);
            if (A02[3].length() != 1) {
                String[] strArr = A02;
                strArr[6] = "yuw4mNpzW34AqVSRehlxNeo";
                strArr[2] = "wkUUhZpWZ02e";
            } else {
                A02[0] = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU";
            }
        }
        return z2 ? reverseLayout ? centerPosition - 1 : centerPosition : reverseLayout ? centerPosition + 1 : centerPosition;
    }

    @Override // com.meta.analytics.dsp.uinode.ZY
    public final View A0D(AbstractC01554o abstractC01554o) {
        if (abstractC01554o.A21()) {
            return A01(abstractC01554o, A04(abstractC01554o));
        }
        if (abstractC01554o.A20()) {
            return A01(abstractC01554o, A03(abstractC01554o));
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.ZY
    public final C0914Zn A0E(AbstractC01554o abstractC01554o) {
        if (!(abstractC01554o instanceof AnonymousClass50)) {
            return null;
        }
        return new C0374Ed(this, super.A00.getContext());
    }

    @Override // com.meta.analytics.dsp.uinode.ZY
    public final int[] A0H(AbstractC01554o abstractC01554o, View view) {
        int[] iArr = new int[2];
        if (abstractC01554o.A20()) {
            iArr[0] = A00(abstractC01554o, view, A03(abstractC01554o));
        } else {
            iArr[0] = 0;
        }
        boolean A21 = abstractC01554o.A21();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (A21) {
            iArr[1] = A00(abstractC01554o, view, A04(abstractC01554o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
