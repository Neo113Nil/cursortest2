package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import q.AbstractC0286e;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3818a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3819b;

    /* renamed from: c, reason: collision with root package name */
    public int f3820c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public String f3821e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3822f;

    /* renamed from: g, reason: collision with root package name */
    public int f3823g;

    public C0318b(C0318b c0318b, Object obj) {
        c0318b.getClass();
        this.f3819b = c0318b.f3819b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (str != null && obj != null) {
            C0318b c0318b = new C0318b();
            c0318b.f3819b = i;
            c0318b.f3818a = z2;
            c0318b.b(obj);
            hashMap.put(str, c0318b);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0286e.a(this.f3819b)) {
            case 0:
            case 7:
                this.f3820c = ((Integer) obj).intValue();
                break;
            case 1:
                this.d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f3823g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3821e = (String) obj;
                break;
            case 5:
                this.f3822f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.d = ((Float) obj).floatValue();
                break;
        }
    }
}
