package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g30 {
    public int a;
    public nd b;
    public int[][] c = new int[10][];
    public nd[] d = new nd[10];

    public static g30 b(nd ndVar) {
        g30 g30Var = new g30();
        g30Var.a(StateSet.WILD_CARD, ndVar);
        return g30Var;
    }

    public final void a(int[] iArr, nd ndVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = ndVar;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            nd[] ndVarArr = new nd[i2];
            System.arraycopy(this.d, 0, ndVarArr, 0, i);
            this.d = ndVarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = ndVar;
        this.a = i3 + 1;
    }

    public final nd c(int[] iArr) {
        int i;
        int[][] iArr2 = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.a) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i2 >= this.a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? this.b : this.d[i3];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = jx.F;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                nd i = o10.i(obtainAttributes, 5, new g(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i2), i);
            }
        }
    }
}
