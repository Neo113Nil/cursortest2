package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class wz {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, oo ooVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            sq sqVar = o60.b;
            Typeface typeface2 = (Typeface) sqVar.f(o60.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (ooVar != null) {
                    new Handler(Looper.getMainLooper()).post(new l3(ooVar, typeface2, 3));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        qj F = oo.F(resources.getXml(i), resources);
                        if (F == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (ooVar != null) {
                                ooVar.f(-3);
                            }
                        } else {
                            typeface = o60.a(context, F, resources, i, charSequence2, typedValue.assetCookie, i2, ooVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface u = o60.a.u(context, resources, i, charSequence2);
                        if (u != null) {
                            sqVar.j(o60.b(resources, i, charSequence2, i4, i2), u);
                        }
                        if (ooVar != null) {
                            if (u != null) {
                                new Handler(Looper.getMainLooper()).post(new l3(ooVar, u, 3));
                            } else {
                                ooVar.f(-3);
                            }
                        }
                        typeface = u;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (ooVar != null) {
                        ooVar.f(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (ooVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (ooVar != null) {
            ooVar.f(-3);
        }
        if (typeface == null || ooVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
