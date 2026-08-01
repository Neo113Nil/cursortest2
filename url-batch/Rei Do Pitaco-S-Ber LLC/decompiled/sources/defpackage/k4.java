package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k4 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;

    public k4(bx bxVar, int i, String str) {
        this.a = 2;
        this.c = bxVar;
        this.b = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new defpackage.o4(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.g;
        r17 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new defpackage.k4(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.g, (float[]) r0.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.g;
        r21 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new defpackage.o4(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new defpackage.o4(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k4 b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        XmlResourceParser xml = resources.getXml(i);
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
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b = db.b(resources, xml, asAttributeSet, theme);
                return new k4((Shader) null, b, b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray z = vv.z(resources, theme, asAttributeSet, gx.e);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? z.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? z.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? z.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? z.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? z.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? z.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? z.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? z.getColor(0, 0) : 0;
        boolean z2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? z.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f = f4;
            i2 = z.getColor(1, 0);
        } else {
            f = f4;
            i2 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f2 = f5;
            i3 = z.getInt(6, 0);
        } else {
            f2 = f5;
            i3 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? z.getFloat(5, 0.0f) : 0.0f;
        z.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f12 = f6;
            if (next2 == 1) {
                f3 = f7;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f7;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray z3 = vv.z(resources, theme, asAttributeSet, gx.f);
                boolean hasValue = z3.hasValue(0);
                boolean hasValue2 = z3.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = z3.getColor(0, 0);
                float f13 = z3.getFloat(1, 0.0f);
                z3.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f12;
            f7 = f3;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void a() {
        vb vbVar;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            vf.a(drawable);
        }
        if (drawable == null || (vbVar = (vb) this.d) == null) {
            return;
        }
        f4.e(drawable, vbVar, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = kx.f;
        y5 l = y5.l(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) l.a;
        f80.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) l.a, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = vv.t(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                vf.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(l.e(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(vf.b(typedArray.getInt(3, -1), null));
            }
            l.n();
        } catch (Throwable th) {
            l.n();
            throw th;
        }
    }

    public void e(int i) {
        ImageView imageView = (ImageView) this.c;
        if (i != 0) {
            Drawable t = vv.t(imageView.getContext(), i);
            if (t != null) {
                vf.a(t);
            }
            imageView.setImageDrawable(t);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((bx) this.c) == bx.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public k4(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }

    public k4(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 1;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }
}
