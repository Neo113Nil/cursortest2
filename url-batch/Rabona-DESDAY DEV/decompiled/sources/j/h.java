package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import k.ActionProviderVisibilityListenerC0161p;
import k.MenuC0158m;
import l.AbstractC0250n0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2591e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2592f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2593a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2594b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2595c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2591e = clsArr;
        f2592f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2595c = context;
        Object[] objArr = {context};
        this.f2593a = objArr;
        this.f2594b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        gVar.f2569b = 0;
                        gVar.f2570c = 0;
                        gVar.d = 0;
                        gVar.f2571e = 0;
                        gVar.f2572f = r4;
                        gVar.f2573g = r4;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = gVar.f2590z;
                            if (actionProviderVisibilityListenerC0161p == null || !actionProviderVisibilityListenerC0161p.f2739b.hasSubMenu()) {
                                gVar.h = r4;
                                gVar.b(gVar.f2568a.add(gVar.f2569b, gVar.i, gVar.f2574j, gVar.f2575k));
                            } else {
                                gVar.h = r4;
                                gVar.b(gVar.f2568a.addSubMenu(gVar.f2569b, gVar.i, gVar.f2574j, gVar.f2575k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = r4;
                        z3 = z2;
                    }
                }
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    h hVar = gVar.f2567E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f2595c.obtainStyledAttributes(attributeSet, f.a.f1938p);
                        gVar.f2569b = obtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f2570c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f2571e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f2572f = obtainStyledAttributes.getBoolean(2, r4);
                        gVar.f2573g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f2595c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1939q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f2574j = (obtainStyledAttributes2.getInt(5, gVar.f2570c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f2575k = obtainStyledAttributes2.getText(7);
                            gVar.f2576l = obtainStyledAttributes2.getText(8);
                            gVar.f2577m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f2578n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f2579o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f2580p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f2581q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f2582r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f2582r = gVar.f2571e;
                            }
                            gVar.f2583s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f2584t = obtainStyledAttributes2.getBoolean(4, gVar.f2572f);
                            gVar.f2585u = obtainStyledAttributes2.getBoolean(1, gVar.f2573g);
                            gVar.f2586v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f2589y = obtainStyledAttributes2.getString(12);
                            gVar.f2587w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f2588x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f2587w == 0 && gVar.f2588x == null) {
                                gVar.f2590z = (ActionProviderVisibilityListenerC0161p) gVar.a(string3, f2592f, hVar.f2594b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f2590z = null;
                            }
                            gVar.f2563A = obtainStyledAttributes2.getText(17);
                            gVar.f2564B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f2566D = AbstractC0250n0.b(obtainStyledAttributes2.getInt(19, -1), gVar.f2566D);
                            } else {
                                gVar.f2566D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = q1.d.z(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f2565C = colorStateList;
                            } else {
                                gVar.f2565C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.h = true;
                            SubMenu addSubMenu = gVar.f2568a.addSubMenu(gVar.f2569b, gVar.i, gVar.f2574j, gVar.f2575k);
                            gVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            i = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0158m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f2595c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0158m) {
                    MenuC0158m menuC0158m = (MenuC0158m) menu;
                    if (!menuC0158m.f2700p) {
                        menuC0158m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0158m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0158m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
