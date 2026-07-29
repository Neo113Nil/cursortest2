package o;

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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.qU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764qU extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public C1764qU(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        C1698pU c1698pU = new C1698pU(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        c1698pU.b = 0;
                        c1698pU.c = 0;
                        c1698pU.d = 0;
                        c1698pU.e = 0;
                        c1698pU.f = true;
                        c1698pU.g = true;
                    } else if (name2.equals("item")) {
                        if (!c1698pU.h) {
                            ActionProviderVisibilityListenerC1350kC actionProviderVisibilityListenerC1350kC = c1698pU.z;
                            if (actionProviderVisibilityListenerC1350kC == null || !actionProviderVisibilityListenerC1350kC.b.hasSubMenu()) {
                                c1698pU.h = true;
                                c1698pU.b(c1698pU.a.add(c1698pU.b, c1698pU.i, c1698pU.j, c1698pU.k));
                            } else {
                                c1698pU.h = true;
                                c1698pU.b(c1698pU.a.addSubMenu(c1698pU.b, c1698pU.i, c1698pU.j, c1698pU.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(attributeSet, AbstractC1886sL.p);
                        c1698pU.b = obtainStyledAttributes.getResourceId(1, 0);
                        c1698pU.c = obtainStyledAttributes.getInt(3, 0);
                        c1698pU.d = obtainStyledAttributes.getInt(4, 0);
                        c1698pU.e = obtainStyledAttributes.getInt(5, 0);
                        c1698pU.f = obtainStyledAttributes.getBoolean(i, true);
                        c1698pU.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            int[] iArr = AbstractC1886sL.q;
                            Context context = this.c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                            c1698pU.i = obtainStyledAttributes2.getResourceId(i, 0);
                            c1698pU.j = (obtainStyledAttributes2.getInt(6, c1698pU.d) & 65535) | (obtainStyledAttributes2.getInt(5, c1698pU.c) & (-65536));
                            c1698pU.k = obtainStyledAttributes2.getText(7);
                            c1698pU.l = obtainStyledAttributes2.getText(8);
                            c1698pU.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c1698pU.n = string == null ? (char) 0 : string.charAt(0);
                            c1698pU.f211o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c1698pU.p = string2 == null ? (char) 0 : string2.charAt(0);
                            c1698pU.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c1698pU.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c1698pU.r = c1698pU.e;
                            }
                            c1698pU.s = obtainStyledAttributes2.getBoolean(3, false);
                            c1698pU.t = obtainStyledAttributes2.getBoolean(4, c1698pU.f);
                            c1698pU.u = obtainStyledAttributes2.getBoolean(1, c1698pU.g);
                            c1698pU.v = obtainStyledAttributes2.getInt(21, -1);
                            c1698pU.y = obtainStyledAttributes2.getString(12);
                            c1698pU.w = obtainStyledAttributes2.getResourceId(13, 0);
                            c1698pU.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && c1698pU.w == 0 && c1698pU.x == null) {
                                c1698pU.z = (ActionProviderVisibilityListenerC1350kC) c1698pU.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c1698pU.z = null;
                            }
                            c1698pU.A = obtainStyledAttributes2.getText(17);
                            c1698pU.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c1698pU.D = AbstractC1317jj.b(obtainStyledAttributes2.getInt(19, -1), c1698pU.D);
                            } else {
                                c1698pU.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = EB.s(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c1698pU.C = colorStateList;
                            } else {
                                c1698pU.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c1698pU.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            c1698pU.h = true;
                            SubMenu addSubMenu = c1698pU.a.addSubMenu(c1698pU.b, c1698pU.i, c1698pU.j, c1698pU.k);
                            c1698pU.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0825cC)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0825cC) {
                    MenuC0825cC menuC0825cC = (MenuC0825cC) menu;
                    if (!menuC0825cC.p) {
                        menuC0825cC.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((MenuC0825cC) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC0825cC) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
