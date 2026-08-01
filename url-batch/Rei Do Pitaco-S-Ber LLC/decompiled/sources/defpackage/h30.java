package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.ionia.reidopitaco.libya.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h30 implements m10 {
    public final int a;
    public final o10 b;
    public final int[][] c;
    public final o10[] d;
    public final g30 e;
    public final g30 f;
    public final g30 g;
    public final g30 h;

    public h30(wn wnVar) {
        this.a = wnVar.b;
        this.b = (o10) wnVar.c;
        this.c = (int[][]) wnVar.d;
        this.d = (o10[]) wnVar.e;
        this.e = (g30) wnVar.f;
        this.f = (g30) wnVar.g;
        this.g = (g30) wnVar.h;
        this.h = (g30) wnVar.i;
    }

    public static void f(wn wnVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = jx.w;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o10 a = o10.f(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                wnVar.a(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    public static h30 g(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        wn wnVar = new wn(1);
        wnVar.e();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            wnVar.e();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                f(wnVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return wnVar.c();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.m10
    public final o10 a(float f) {
        return h().a(f);
    }

    @Override // defpackage.m10
    public final o10 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        o10[] o10VarArr = this.d;
        g30 g30Var = this.h;
        g30 g30Var2 = this.g;
        g30 g30Var3 = this.f;
        g30 g30Var4 = this.e;
        if (g30Var4 == null && g30Var3 == null && g30Var2 == null && g30Var == null) {
            return o10VarArr[i4];
        }
        n10 k = o10VarArr[i4].k();
        if (g30Var4 != null) {
            k.e = g30Var4.c(iArr);
        }
        if (g30Var3 != null) {
            k.f = g30Var3.c(iArr);
        }
        if (g30Var2 != null) {
            k.h = g30Var2.c(iArr);
        }
        if (g30Var != null) {
            k.g = g30Var.c(iArr);
        }
        return k.a();
    }

    @Override // defpackage.m10
    public final o10 c() {
        return h();
    }

    @Override // defpackage.m10
    public final o10 d(jz jzVar) {
        return h().d(jzVar);
    }

    @Override // defpackage.m10
    public final boolean e() {
        g30 g30Var;
        g30 g30Var2;
        g30 g30Var3;
        g30 g30Var4;
        return this.a > 1 || ((g30Var = this.e) != null && g30Var.a > 1) || (((g30Var2 = this.f) != null && g30Var2.a > 1) || (((g30Var3 = this.g) != null && g30Var3.a > 1) || ((g30Var4 = this.h) != null && g30Var4.a > 1)));
    }

    public final o10 h() {
        o10 o10Var = this.b;
        g30 g30Var = this.h;
        g30 g30Var2 = this.g;
        g30 g30Var3 = this.f;
        g30 g30Var4 = this.e;
        if (g30Var4 == null && g30Var3 == null && g30Var2 == null && g30Var == null) {
            return o10Var;
        }
        n10 k = o10Var.k();
        if (g30Var4 != null) {
            k.e = g30Var4.b;
        }
        if (g30Var3 != null) {
            k.f = g30Var3.b;
        }
        if (g30Var2 != null) {
            k.h = g30Var2.b;
        }
        if (g30Var != null) {
            k.g = g30Var.b;
        }
        return k.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, o10[]] */
    public final wn i() {
        wn wnVar = new wn(1);
        int i = this.a;
        wnVar.b = i;
        wnVar.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        wnVar.d = r3;
        o10[] o10VarArr = this.d;
        wnVar.e = new o10[o10VarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(o10VarArr, 0, (o10[]) wnVar.e, 0, wnVar.b);
        wnVar.f = this.e;
        wnVar.g = this.f;
        wnVar.h = this.g;
        wnVar.i = this.h;
        return wnVar;
    }
}
