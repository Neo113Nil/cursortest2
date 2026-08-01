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
import k.ActionProviderVisibilityListenerC0205p;
import k.MenuC0202m;
import l.AbstractC0266n0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f3097e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3098f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3099a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3100b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3101c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f3097e = clsArr;
        f3098f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f3101c = context;
        Object[] objArr = {context};
        this.f3099a = objArr;
        this.f3100b = objArr;
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
                        gVar.f3075b = 0;
                        gVar.f3076c = 0;
                        gVar.d = 0;
                        gVar.f3077e = 0;
                        gVar.f3078f = r4;
                        gVar.f3079g = r4;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = gVar.f3096z;
                            if (actionProviderVisibilityListenerC0205p == null || !actionProviderVisibilityListenerC0205p.f3238b.hasSubMenu()) {
                                gVar.h = r4;
                                gVar.b(gVar.f3074a.add(gVar.f3075b, gVar.i, gVar.f3080j, gVar.f3081k));
                            } else {
                                gVar.h = r4;
                                gVar.b(gVar.f3074a.addSubMenu(gVar.f3075b, gVar.i, gVar.f3080j, gVar.f3081k).getItem());
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
                    h hVar = gVar.f3073E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f3101c.obtainStyledAttributes(attributeSet, f.a.f2571p);
                        gVar.f3075b = obtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f3076c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f3077e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f3078f = obtainStyledAttributes.getBoolean(2, r4);
                        gVar.f3079g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f3101c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2572q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f3080j = (obtainStyledAttributes2.getInt(5, gVar.f3076c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f3081k = obtainStyledAttributes2.getText(7);
                            gVar.f3082l = obtainStyledAttributes2.getText(8);
                            gVar.f3083m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f3084n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f3085o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f3086p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f3087q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f3088r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f3088r = gVar.f3077e;
                            }
                            gVar.f3089s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f3090t = obtainStyledAttributes2.getBoolean(4, gVar.f3078f);
                            gVar.f3091u = obtainStyledAttributes2.getBoolean(1, gVar.f3079g);
                            gVar.f3092v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f3095y = obtainStyledAttributes2.getString(12);
                            gVar.f3093w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f3094x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f3093w == 0 && gVar.f3094x == null) {
                                gVar.f3096z = (ActionProviderVisibilityListenerC0205p) gVar.a(string3, f3098f, hVar.f3100b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f3096z = null;
                            }
                            gVar.f3069A = obtainStyledAttributes2.getText(17);
                            gVar.f3070B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f3072D = AbstractC0266n0.b(obtainStyledAttributes2.getInt(19, -1), gVar.f3072D);
                            } else {
                                gVar.f3072D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = F1.d.D(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f3071C = colorStateList;
                            } else {
                                gVar.f3071C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.h = true;
                            SubMenu addSubMenu = gVar.f3074a.addSubMenu(gVar.f3075b, gVar.i, gVar.f3080j, gVar.f3081k);
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
        if (!(menu instanceof MenuC0202m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f3101c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0202m) {
                    MenuC0202m menuC0202m = (MenuC0202m) menu;
                    if (!menuC0202m.f3199p) {
                        menuC0202m.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((MenuC0202m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuC0202m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
