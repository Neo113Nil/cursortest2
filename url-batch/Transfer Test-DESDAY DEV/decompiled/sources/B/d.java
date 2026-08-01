package B;

import K.C0014m;
import K.T;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import l.AbstractC0221l0;
import l.C0236t;
import l.S0;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0349a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f43a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44b;

    /* renamed from: c, reason: collision with root package name */
    public Object f45c;

    public d(ImageView imageView) {
        this.f43a = 0;
        this.f44b = imageView;
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
                return new d(null, b2, b2.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f7 = b.f(resources, theme, asAttributeSet, AbstractC0349a.d);
        float f8 = !b.c(xml, "startX") ? 0.0f : f7.getFloat(8, RecyclerView.f1570A0);
        float f9 = !b.c(xml, "startY") ? 0.0f : f7.getFloat(9, RecyclerView.f1570A0);
        float f10 = !b.c(xml, "endX") ? 0.0f : f7.getFloat(10, RecyclerView.f1570A0);
        float f11 = !b.c(xml, "endY") ? 0.0f : f7.getFloat(11, RecyclerView.f1570A0);
        float f12 = !b.c(xml, "centerX") ? 0.0f : f7.getFloat(3, RecyclerView.f1570A0);
        float f13 = !b.c(xml, "centerY") ? 0.0f : f7.getFloat(4, RecyclerView.f1570A0);
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
            f4 = f7.getFloat(5, RecyclerView.f1570A0);
        } else {
            f3 = f13;
            f4 = RecyclerView.f1570A0;
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
                TypedArray f16 = b.f(resources, theme, asAttributeSet, AbstractC0349a.f4073e);
                boolean hasValue = f16.hasValue(0);
                boolean hasValue2 = f16.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f16.getColor(0, 0);
                float f17 = f16.getFloat(1, RecyclerView.f1570A0);
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
            if (f14 <= RecyclerView.f1570A0) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f18, f19, f14, (int[]) jVar.f56b, (float[]) jVar.f57c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != 2) {
            i3 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f15, (int[]) jVar.f56b, (float[]) jVar.f57c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) jVar.f56b, (float[]) jVar.f57c);
        }
        return new d(radialGradient, null, i3);
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            char charAt = str.charAt(!z2 ? i : length);
            boolean z3 = charAt < ' ' || charAt == ' ';
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
        S0 s02;
        ImageView imageView = (ImageView) this.f44b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0221l0.a(drawable);
        }
        if (drawable == null || (s02 = (S0) this.f45c) == null) {
            return;
        }
        C0236t.e(drawable, s02, imageView.getDrawableState());
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f44b) == null && (colorStateList = (ColorStateList) this.f45c) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f44b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f2141f;
        C0014m i2 = C0014m.i(context, attributeSet, iArr, i);
        T.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) i2.f425b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) i2.f425b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = T.e.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0221l0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Q.g.c(imageView, i2.b(2));
            }
            if (typedArray.hasValue(3)) {
                Q.g.d(imageView, AbstractC0221l0.b(typedArray.getInt(3, -1), null));
            }
            i2.k();
        } catch (Throwable th) {
            i2.k();
            throw th;
        }
    }

    public void f(j0.a aVar) {
        k0.c cVar = (k0.c) aVar;
        Cursor q2 = cVar.q("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (q2.moveToFirst()) {
                if (q2.getInt(0) == 0) {
                    z2 = true;
                }
            }
            T.e.m(q2, null);
            u uVar = (u) this.f45c;
            uVar.createAllTables(aVar);
            if (!z2) {
                v onValidateSchema = uVar.onValidateSchema(aVar);
                if (!onValidateSchema.f1712a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f1713b);
                }
            }
            i(cVar);
            uVar.onCreate(aVar);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(j0.a aVar) {
        boolean z2;
        k0.c cVar = (k0.c) aVar;
        Cursor q2 = cVar.q("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (q2.moveToFirst()) {
                if (q2.getInt(0) != 0) {
                    z2 = true;
                    T.e.m(q2, null);
                    u uVar = (u) this.f45c;
                    if (z2) {
                        v onValidateSchema = uVar.onValidateSchema(aVar);
                        if (!onValidateSchema.f1712a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f1713b);
                        }
                        uVar.onPostMigrate(aVar);
                        i(cVar);
                    } else {
                        Cursor r2 = cVar.r(new j("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = r2.moveToFirst() ? r2.getString(0) : null;
                            T.e.m(r2, null);
                            if (!"7c25debb60a940f62871502d02bdf8b5".equals(string) && !"3c2ace590cf6e5476d5aaaf72114c5ec".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7c25debb60a940f62871502d02bdf8b5, found: " + string);
                            }
                        } finally {
                        }
                    }
                    uVar.onOpen(aVar);
                    this.f44b = null;
                }
            }
            z2 = false;
            T.e.m(q2, null);
            u uVar2 = (u) this.f45c;
            if (z2) {
            }
            uVar2.onOpen(aVar);
            this.f44b = null;
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
        androidx.room.g gVar = (androidx.room.g) this.f44b;
        u uVar = (u) this.f45c;
        if (gVar != null) {
            A0.h hVar = gVar.f1678b;
            hVar.getClass();
            if (i == i2) {
                iterable = V0.m.f875a;
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
                        treeMap = (TreeMap) ((LinkedHashMap) hVar.f30b).get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z3 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z3) {
                                int i4 = i3 + 1;
                                g1.f.d(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i4 <= intValue && intValue <= i2) {
                                    Object obj = treeMap.get(num);
                                    g1.f.b(obj);
                                    arrayList.add(obj);
                                    i3 = num.intValue();
                                    z2 = true;
                                    break;
                                }
                            } else {
                                g1.f.d(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i2 <= intValue2 && intValue2 < i3) {
                                    Object obj2 = treeMap.get(num);
                                    g1.f.b(obj2);
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
                        treeMap = (TreeMap) ((LinkedHashMap) hVar.f30b).get(Integer.valueOf(i3));
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
                if (!onValidateSchema.f1712a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f1713b);
                }
                uVar.onPostMigrate(cVar);
                i(cVar);
                return;
            }
        }
        androidx.room.g gVar2 = (androidx.room.g) this.f44b;
        if (gVar2 != null && ((i > i2 && gVar2.h) || !gVar2.f1682g || ((linkedHashSet = gVar2.i) != null && linkedHashSet.contains(Integer.valueOf(i))))) {
            uVar.dropAllTables(cVar);
            uVar.createAllTables(cVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void i(k0.c cVar) {
        cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7c25debb60a940f62871502d02bdf8b5')");
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f44b = shader;
        this.f45c = colorStateList;
        this.f43a = i;
    }
}
