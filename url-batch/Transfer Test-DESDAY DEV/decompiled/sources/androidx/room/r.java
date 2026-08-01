package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import com.football.transfertrivia.db.AppDatabase;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.C0251a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1703a;

    /* renamed from: e, reason: collision with root package name */
    public e0.d f1706e;

    /* renamed from: f, reason: collision with root package name */
    public e0.d f1707f;
    public boolean i;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1704b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1705c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final int f1708g = 1;
    public boolean h = true;

    /* renamed from: j, reason: collision with root package name */
    public final long f1709j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final A0.h f1710k = new A0.h(19);

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f1711l = new LinkedHashSet();

    public r(Context context) {
        this.f1703a = context;
    }

    public final t a() {
        String str;
        e0.d dVar = this.f1706e;
        if (dVar == null && this.f1707f == null) {
            e0.d dVar2 = C0251a.i;
            this.f1707f = dVar2;
            this.f1706e = dVar2;
        } else if (dVar != null && this.f1707f == null) {
            this.f1707f = dVar;
        } else if (dVar == null) {
            this.f1706e = this.f1707f;
        }
        O0.e eVar = new O0.e(26);
        if (this.f1709j > 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList arrayList = this.f1704b;
        int i = this.f1708g;
        if (i == 0) {
            throw null;
        }
        Context context = this.f1703a;
        if (i == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        int i2 = i;
        e0.d dVar3 = this.f1706e;
        if (dVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        e0.d dVar4 = this.f1707f;
        if (dVar4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        g gVar = new g(context, eVar, this.f1710k, arrayList, i2, dVar3, dVar4, this.h, this.i, this.f1711l, this.f1705c, this.d);
        Package r3 = AppDatabase.class.getPackage();
        g1.f.b(r3);
        String name = r3.getName();
        String canonicalName = AppDatabase.class.getCanonicalName();
        g1.f.b(canonicalName);
        g1.f.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            g1.f.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String replace = canonicalName.replace('.', '_');
        g1.f.d(replace, "replace(...)");
        String concat = replace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = concat;
            } else {
                str = name + '.' + concat;
            }
            Class<?> cls = Class.forName(str, true, AppDatabase.class.getClassLoader());
            g1.f.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            t tVar = (t) cls.getDeclaredConstructor(null).newInstance(null);
            tVar.init(gVar);
            return tVar;
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + AppDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + AppDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + AppDatabase.class.getCanonicalName());
        }
    }
}
