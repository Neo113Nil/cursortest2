package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.ionia.reidopitaco.libya.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b7 {
    public final a7 a;
    public final a7 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    public b7(Context context, a7 a7Var) {
        AttributeSet attributeSet;
        int i;
        int next;
        a7 a7Var2 = new a7();
        a7Var2.n = 255;
        a7Var2.p = -2;
        a7Var2.q = -2;
        a7Var2.r = -2;
        a7Var2.y = Boolean.TRUE;
        this.b = a7Var2;
        int i2 = a7Var.f;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray J = m60.J(context, attributeSet, jx.a, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.c = J.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = J.getDimensionPixelSize(15, -1);
        this.e = J.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = J.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = J.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = J.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = J.getInt(25, 1);
        this.l = J.getInt(2, 0);
        a7 a7Var3 = this.b;
        int i3 = a7Var.n;
        a7Var3.n = i3 != -2 ? i3 : 255;
        int i4 = a7Var.p;
        if (i4 != -2) {
            a7Var3.p = i4;
        } else {
            boolean hasValue = J.hasValue(24);
            a7 a7Var4 = this.b;
            if (hasValue) {
                a7Var4.p = J.getInt(24, 0);
            } else {
                a7Var4.p = -1;
            }
        }
        String str = a7Var.o;
        if (str != null) {
            this.b.o = str;
        } else if (J.hasValue(8)) {
            this.b.o = J.getString(8);
        }
        a7 a7Var5 = this.b;
        a7Var5.t = a7Var.t;
        CharSequence charSequence = a7Var.u;
        a7Var5.u = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a7 a7Var6 = this.b;
        int i5 = a7Var.v;
        a7Var6.v = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = a7Var.w;
        a7Var6.w = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = a7Var.y;
        a7Var6.y = Boolean.valueOf(bool == null || bool.booleanValue());
        a7 a7Var7 = this.b;
        int i7 = a7Var.q;
        a7Var7.q = i7 == -2 ? J.getInt(22, -2) : i7;
        a7 a7Var8 = this.b;
        int i8 = a7Var.r;
        a7Var8.r = i8 == -2 ? J.getInt(23, -2) : i8;
        a7 a7Var9 = this.b;
        Integer num = a7Var.j;
        a7Var9.j = Integer.valueOf(num == null ? J.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        a7 a7Var10 = this.b;
        Integer num2 = a7Var.k;
        a7Var10.k = Integer.valueOf(num2 == null ? J.getResourceId(7, 0) : num2.intValue());
        a7 a7Var11 = this.b;
        Integer num3 = a7Var.l;
        a7Var11.l = Integer.valueOf(num3 == null ? J.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        a7 a7Var12 = this.b;
        Integer num4 = a7Var.m;
        a7Var12.m = Integer.valueOf(num4 == null ? J.getResourceId(17, 0) : num4.intValue());
        a7 a7Var13 = this.b;
        Integer num5 = a7Var.g;
        a7Var13.g = Integer.valueOf(num5 == null ? oo.o(context, J, 1).getDefaultColor() : num5.intValue());
        a7 a7Var14 = this.b;
        Integer num6 = a7Var.i;
        a7Var14.i = Integer.valueOf(num6 == null ? J.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = a7Var.h;
        if (num7 != null) {
            this.b.h = num7;
        } else {
            boolean hasValue2 = J.hasValue(10);
            a7 a7Var15 = this.b;
            if (hasValue2) {
                a7Var15.h = Integer.valueOf(oo.o(context, J, 10).getDefaultColor());
            } else {
                int intValue = a7Var15.i.intValue();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, kx.v);
                obtainStyledAttributes.getDimension(0, 0.0f);
                ColorStateList o = oo.o(context, obtainStyledAttributes, 3);
                oo.o(context, obtainStyledAttributes, 4);
                oo.o(context, obtainStyledAttributes, 5);
                obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.getInt(1, 1);
                int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
                obtainStyledAttributes.getResourceId(i9, 0);
                obtainStyledAttributes.getString(i9);
                obtainStyledAttributes.getBoolean(14, false);
                oo.o(context, obtainStyledAttributes, 6);
                obtainStyledAttributes.getFloat(7, 0.0f);
                obtainStyledAttributes.getFloat(8, 0.0f);
                obtainStyledAttributes.getFloat(9, 0.0f);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, jx.y);
                obtainStyledAttributes2.hasValue(0);
                obtainStyledAttributes2.getFloat(0, 0.0f);
                obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
                obtainStyledAttributes2.recycle();
                this.b.h = Integer.valueOf(o.getDefaultColor());
            }
        }
        a7 a7Var16 = this.b;
        Integer num8 = a7Var.x;
        a7Var16.x = Integer.valueOf(num8 == null ? J.getInt(3, 8388661) : num8.intValue());
        a7 a7Var17 = this.b;
        Integer num9 = a7Var.z;
        a7Var17.z = Integer.valueOf(num9 == null ? J.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        a7 a7Var18 = this.b;
        Integer num10 = a7Var.A;
        a7Var18.A = Integer.valueOf(num10 == null ? J.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        a7 a7Var19 = this.b;
        Integer num11 = a7Var.B;
        a7Var19.B = Integer.valueOf(num11 == null ? J.getDimensionPixelOffset(19, 0) : num11.intValue());
        a7 a7Var20 = this.b;
        Integer num12 = a7Var.C;
        a7Var20.C = Integer.valueOf(num12 == null ? J.getDimensionPixelOffset(26, 0) : num12.intValue());
        a7 a7Var21 = this.b;
        Integer num13 = a7Var.D;
        a7Var21.D = Integer.valueOf(num13 == null ? J.getDimensionPixelOffset(20, a7Var21.B.intValue()) : num13.intValue());
        a7 a7Var22 = this.b;
        Integer num14 = a7Var.E;
        a7Var22.E = Integer.valueOf(num14 == null ? J.getDimensionPixelOffset(27, a7Var22.C.intValue()) : num14.intValue());
        a7 a7Var23 = this.b;
        Integer num15 = a7Var.H;
        a7Var23.H = Integer.valueOf(num15 == null ? J.getDimensionPixelOffset(21, 0) : num15.intValue());
        a7 a7Var24 = this.b;
        Integer num16 = a7Var.F;
        a7Var24.F = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        a7 a7Var25 = this.b;
        Integer num17 = a7Var.G;
        a7Var25.G = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        a7 a7Var26 = this.b;
        Boolean bool2 = a7Var.I;
        a7Var26.I = Boolean.valueOf(bool2 == null ? J.getBoolean(0, false) : bool2.booleanValue());
        J.recycle();
        Locale locale = a7Var.s;
        a7 a7Var27 = this.b;
        if (locale == null) {
            a7Var27.s = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            a7Var27.s = locale;
        }
        this.a = a7Var;
    }
}
