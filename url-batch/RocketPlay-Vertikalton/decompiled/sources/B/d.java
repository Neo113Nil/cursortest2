package B;

import K.C0019l;
import K.T;
import a1.AbstractC0067d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.u;
import androidx.room.v;
import c1.AbstractC0104b;
import j0.InterfaceC0178a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import l.AbstractC0266n0;
import l.C0279u;
import l.U0;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0381a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* renamed from: b, reason: collision with root package name */
    public int f60b;

    /* renamed from: c, reason: collision with root package name */
    public Object f61c;
    public Object d;

    public d(x1.q qVar, int i, String str) {
        this.f59a = 1;
        this.f61c = qVar;
        this.f60b = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        Shader radialGradient;
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
                ColorStateList b2 = c.b(resources, xml, asAttributeSet, theme);
                return new d((Shader) null, b2, b2.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f7 = b.f(resources, theme, asAttributeSet, AbstractC0381a.d);
        float f8 = !b.c(xml, "startX") ? 0.0f : f7.getFloat(8, RecyclerView.f1949A0);
        float f9 = !b.c(xml, "startY") ? 0.0f : f7.getFloat(9, RecyclerView.f1949A0);
        float f10 = !b.c(xml, "endX") ? 0.0f : f7.getFloat(10, RecyclerView.f1949A0);
        float f11 = !b.c(xml, "endY") ? 0.0f : f7.getFloat(11, RecyclerView.f1949A0);
        float f12 = !b.c(xml, "centerX") ? 0.0f : f7.getFloat(3, RecyclerView.f1949A0);
        float f13 = !b.c(xml, "centerY") ? 0.0f : f7.getFloat(4, RecyclerView.f1949A0);
        int i4 = !b.c(xml, "type") ? 0 : f7.getInt(2, 0);
        int color = !b.c(xml, "startColor") ? 0 : f7.getColor(0, 0);
        boolean c2 = b.c(xml, "centerColor");
        int color2 = !b.c(xml, "centerColor") ? 0 : f7.getColor(7, 0);
        int color3 = !b.c(xml, "endColor") ? 0 : f7.getColor(1, 0);
        if (b.c(xml, "tileMode")) {
            f2 = f12;
            i2 = f7.getInt(6, 0);
        } else {
            f2 = f12;
            i2 = 0;
        }
        if (b.c(xml, "gradientRadius")) {
            f3 = f13;
            f4 = f7.getFloat(5, RecyclerView.f1949A0);
        } else {
            f3 = f13;
            f4 = RecyclerView.f1949A0;
        }
        f7.recycle();
        int depth = xml.getDepth() + 1;
        float f14 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f10;
            if (next2 == 1) {
                f6 = f9;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f9;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f16 = b.f(resources, theme, asAttributeSet, AbstractC0381a.f4622e);
                boolean hasValue = f16.hasValue(0);
                boolean hasValue2 = f16.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f16.getColor(0, 0);
                float f17 = f16.getFloat(1, RecyclerView.f1949A0);
                f16.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f10 = f5;
            f9 = f6;
        }
        j jVar = arrayList2.size() > 0 ? new j(arrayList2, arrayList) : null;
        if (jVar == null) {
            jVar = c2 ? new j(color, color2, color3) : new j(color, color3);
        }
        if (i4 == 1) {
            float f18 = f2;
            float f19 = f3;
            i3 = 0;
            if (f14 <= RecyclerView.f1949A0) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f18, f19, f14, (int[]) jVar.f72b, (float[]) jVar.f73c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != 2) {
            i3 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f15, (int[]) jVar.f72b, (float[]) jVar.f73c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) jVar.f72b, (float[]) jVar.f73c);
        }
        return new d(radialGradient, (ColorStateList) null, i3);
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean z3 = i1.f.f(str.charAt(!z2 ? i : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i++;
            } else {
                z2 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e2) {
            Log.w("SupportSQLite", "delete failed: ", e2);
        }
    }

    public void a() {
        U0 u02;
        ImageView imageView = (ImageView) this.f61c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0266n0.a(drawable);
        }
        if (drawable == null || (u02 = (U0) this.d) == null) {
            return;
        }
        C0279u.e(drawable, u02, imageView.getDrawableState());
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f61c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f61c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f2563f;
        C0019l i2 = C0019l.i(context, attributeSet, iArr, i);
        T.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) i2.f684b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) i2.f684b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0067d.k(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0266n0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Q.f.c(imageView, i2.b(2));
            }
            if (typedArray.hasValue(3)) {
                Q.f.d(imageView, AbstractC0266n0.b(typedArray.getInt(3, -1), null));
            }
            i2.k();
        } catch (Throwable th) {
            i2.k();
            throw th;
        }
    }

    public void f(InterfaceC0178a interfaceC0178a) {
        k0.c cVar = (k0.c) interfaceC0178a;
        Cursor t2 = cVar.t("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (t2.moveToFirst()) {
                if (t2.getInt(0) == 0) {
                    z2 = true;
                }
            }
            AbstractC0104b.g(t2, null);
            u uVar = (u) this.d;
            uVar.createAllTables(interfaceC0178a);
            if (!z2) {
                v onValidateSchema = uVar.onValidateSchema(interfaceC0178a);
                if (!onValidateSchema.f2089a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f2090b);
                }
            }
            i(cVar);
            uVar.onCreate(interfaceC0178a);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(InterfaceC0178a interfaceC0178a) {
        boolean z2;
        k0.c cVar = (k0.c) interfaceC0178a;
        Cursor t2 = cVar.t("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (t2.moveToFirst()) {
                if (t2.getInt(0) != 0) {
                    z2 = true;
                    AbstractC0104b.g(t2, null);
                    u uVar = (u) this.d;
                    if (z2) {
                        v onValidateSchema = uVar.onValidateSchema(interfaceC0178a);
                        if (!onValidateSchema.f2089a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f2090b);
                        }
                        uVar.onPostMigrate(interfaceC0178a);
                        i(cVar);
                    } else {
                        Cursor v2 = cVar.v(new j("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = v2.moveToFirst() ? v2.getString(0) : null;
                            AbstractC0104b.g(v2, null);
                            if (!"7ee45c9fd872b863c58c5d553d86a94d".equals(string) && !"c4288144582cbf4b3c64a1632ec7aa9e".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7ee45c9fd872b863c58c5d553d86a94d, found: " + string);
                            }
                        } finally {
                        }
                    }
                    uVar.onOpen(interfaceC0178a);
                    this.f61c = null;
                }
            }
            z2 = false;
            AbstractC0104b.g(t2, null);
            u uVar2 = (u) this.d;
            if (z2) {
            }
            uVar2.onOpen(interfaceC0178a);
            this.f61c = null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0041 A[EDGE_INSN: B:60:0x0041->B:43:0x0041 BREAK  A[LOOP:0: B:22:0x0029->B:44:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(k0.c cVar, int i, int i2) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z2;
        androidx.room.g gVar = (androidx.room.g) this.f61c;
        u uVar = (u) this.d;
        if (gVar != null) {
            A1.d dVar = gVar.f2057b;
            dVar.getClass();
            if (i == i2) {
                iterable = W0.s.f1284a;
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                do {
                    if (z3) {
                        if (i3 >= i2) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) dVar.f38b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z3 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z3) {
                                int i4 = i3 + 1;
                                i1.f.d(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i4 <= intValue && intValue <= i2) {
                                    Object obj = treeMap.get(num);
                                    i1.f.b(obj);
                                    arrayList.add(obj);
                                    i3 = num.intValue();
                                    z2 = true;
                                    break;
                                }
                            } else {
                                i1.f.d(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i2 <= intValue2 && intValue2 < i3) {
                                    Object obj2 = treeMap.get(num);
                                    i1.f.b(obj2);
                                    arrayList.add(obj2);
                                    i3 = num.intValue();
                                    z2 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                    } else {
                        if (i3 <= i2) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) dVar.f38b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                        }
                    }
                } while (z2);
                iterable = null;
            }
            if (iterable != null) {
                uVar.onPreMigrate(cVar);
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                v onValidateSchema = uVar.onValidateSchema(cVar);
                if (!onValidateSchema.f2089a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f2090b);
                }
                uVar.onPostMigrate(cVar);
                i(cVar);
                return;
            }
        }
        androidx.room.g gVar2 = (androidx.room.g) this.f61c;
        if (gVar2 != null && (!gVar2.f2061g || ((linkedHashSet = gVar2.h) != null && linkedHashSet.contains(Integer.valueOf(i))))) {
            uVar.dropAllTables(cVar);
            uVar.createAllTables(cVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void i(k0.c cVar) {
        cVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7ee45c9fd872b863c58c5d553d86a94d')");
    }

    public String toString() {
        switch (this.f59a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((x1.q) this.f61c) == x1.q.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f60b);
                sb.append(' ');
                sb.append((String) this.d);
                String sb2 = sb.toString();
                i1.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public d(androidx.room.g gVar, u uVar) {
        this.f59a = 2;
        i1.f.e(gVar, "configuration");
        int i = uVar.version;
        this.f59a = 2;
        this.f60b = i;
        this.f61c = gVar;
        this.d = uVar;
    }

    public d(ImageView imageView) {
        this.f59a = 3;
        this.f60b = 0;
        this.f61c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f59a = 0;
        this.f61c = shader;
        this.d = colorStateList;
        this.f60b = i;
    }
}
