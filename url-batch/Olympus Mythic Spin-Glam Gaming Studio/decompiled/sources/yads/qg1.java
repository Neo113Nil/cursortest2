package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class qg1 implements og1, SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final dz2 b;
    public final Context c;
    public final Lazy d;
    public final LinkedHashSet e;

    public qg1(Context context, String str) {
        dz2 dz2Var = new dz2();
        this.a = str;
        this.b = dz2Var;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.d = LazyKt.lazy(new pg1(this));
        this.e = new LinkedHashSet();
    }

    public final void a() {
        ((SharedPreferences) this.d.getValue()).edit().clear().apply();
    }

    public final long b(String str) {
        return ((SharedPreferences) this.d.getValue()).getLong(str, 0L);
    }

    public final String c(String str) {
        return ((SharedPreferences) this.d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        mw mwVar;
        mw mwVar2;
        if (str != null) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                sw swVar = (sw) ((WeakReference) it.next()).get();
                if (swVar != null) {
                    synchronized (sw.i) {
                        try {
                            swVar.b.getClass();
                            bx bxVar = null;
                            String str2 = a(str) ? str : null;
                            if (str2 != null) {
                                mw.d.getClass();
                                mw[] values = mw.values();
                                int length = values.length;
                                for (int i = 0; i < length; i++) {
                                    mwVar = values[i];
                                    if (Intrinsics.areEqual(mwVar.c, str2)) {
                                        break;
                                    }
                                }
                            }
                            mwVar = null;
                            bx a = mwVar != null ? uw.a(this, mwVar) : null;
                            if (a == null) {
                                swVar.a.getClass();
                                String str3 = a(str) ? str : null;
                                if (str3 != null) {
                                    mw.d.getClass();
                                    mw[] values2 = mw.values();
                                    int length2 = values2.length;
                                    for (int i2 = 0; i2 < length2; i2++) {
                                        mwVar2 = values2[i2];
                                        if (Intrinsics.areEqual(mwVar2.b, str3)) {
                                            break;
                                        }
                                    }
                                }
                                mwVar2 = null;
                                if (mwVar2 != null) {
                                    bxVar = tw.a(this, mwVar2);
                                }
                            } else {
                                bxVar = a;
                            }
                            if (bxVar != null) {
                                swVar.a(bxVar);
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.d.getValue()).contains(str);
    }

    public final void b(String str, boolean z) {
        ((SharedPreferences) this.d.getValue()).edit().putBoolean(str, z).apply();
    }

    public final boolean a(String str, boolean z) {
        return ((SharedPreferences) this.d.getValue()).getBoolean(str, z);
    }

    public final void b(int i, String str) {
        ((SharedPreferences) this.d.getValue()).edit().putInt(str, i).apply();
    }

    public final int a(int i, String str) {
        ((SharedPreferences) this.d.getValue()).contains(str);
        return ((SharedPreferences) this.d.getValue()).getInt(str, i);
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j) {
        ((SharedPreferences) this.d.getValue()).edit().putLong(str, j).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.d.getValue()).edit().putStringSet(str, hashSet).apply();
    }
}
