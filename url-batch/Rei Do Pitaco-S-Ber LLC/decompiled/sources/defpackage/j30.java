package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j30 {
    public int a;
    public uv b;
    public int[][] c;
    public uv[] d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        i30 i30Var;
        int attributeCount;
        int i;
        int i2;
        int[][] iArr;
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
                int[] iArr2 = jx.I;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i3 = peekValue.type;
                    if (i3 == 5) {
                        i30Var = new i30(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i3 == 6) {
                        i30Var = new i30(1, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i4 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != R.attr.widthChange) {
                            int i5 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i4] = attributeNameResource;
                            i4 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i4);
                    uv uvVar = new uv();
                    uvVar.f = i30Var;
                    i2 = this.a;
                    if (i2 != 0 || trimStateSet.length == 0) {
                        this.b = uvVar;
                    }
                    iArr = this.c;
                    if (i2 >= iArr.length) {
                        int i6 = i2 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr, 0, iArr4, 0, i2);
                        this.c = iArr4;
                        uv[] uvVarArr = new uv[i6];
                        System.arraycopy(this.d, 0, uvVarArr, 0, i2);
                        this.d = uvVarArr;
                    }
                    int[][] iArr5 = this.c;
                    int i7 = this.a;
                    iArr5[i7] = trimStateSet;
                    this.d[i7] = uvVar;
                    this.a = i7 + 1;
                }
                i30Var = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                uv uvVar2 = new uv();
                uvVar2.f = i30Var;
                i2 = this.a;
                if (i2 != 0) {
                }
                this.b = uvVar2;
                iArr = this.c;
                if (i2 >= iArr.length) {
                }
                int[][] iArr52 = this.c;
                int i72 = this.a;
                iArr52[i72] = trimStateSet2;
                this.d[i72] = uvVar2;
                this.a = i72 + 1;
            }
        }
    }
}
