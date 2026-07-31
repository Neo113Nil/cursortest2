package sg.bigo.ads.bw;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import sg.bigo.ads.bw.c;

/* loaded from: classes12.dex */
public final class b {
    public static Context a;

    public static SharedPreferences a(String str) {
        Context context = a;
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        sg.bigo.ads.bn.a.a(0, "SharedPreferenceManager", "sContext is null");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(SharedPreferences.Editor editor, String str, T t, int i) {
        if (editor != null) {
            if (i == 0) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putInt(str, ((Number) t).intValue());
                return;
            }
            if (i == 1) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putLong(str, ((Number) t).longValue());
                return;
            }
            if (i == 2) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putFloat(str, ((Number) t).floatValue());
                return;
            }
            if (i == 3) {
                if (t != 0 && !(t instanceof String)) {
                    throw new ClassCastException();
                }
                editor.putString(str, (String) t);
                return;
            }
            if (i == 4) {
                if (!(t instanceof Boolean)) {
                    throw new ClassCastException();
                }
                editor.putBoolean(str, ((Boolean) t).booleanValue());
            } else {
                if (i != 5) {
                    return;
                }
                if (t != 0 && !(t instanceof Set)) {
                    throw new ClassCastException();
                }
                editor.putStringSet(str, (Set) t);
            }
        }
    }

    public static <T> void a(String str, T t, int i) {
        a("sp_ads", str, t, i);
    }

    static <T> void a(String str, String str2, T t, int i) {
        try {
            SharedPreferences.Editor b = b(str);
            a(b, str2, t, i);
            c.a.a();
            c.a.C1859a.a(b);
        } catch (Exception e) {
            sg.bigo.ads.bn.a.a(0, "SharedPreferenceManager", Log.getStackTraceString(e));
        }
    }

    public static boolean a() {
        return a != null;
    }

    private static SharedPreferences.Editor b(String str) {
        try {
            return a(str).edit();
        } catch (Exception e) {
            sg.bigo.ads.bn.a.a(0, "SharedPreferenceManager", Log.getStackTraceString(e));
            return null;
        }
    }

    public static <T> Object b(String str, T t, int i) {
        return b("sp_ads", str, t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> Object b(String str, String str2, T t, int i) {
        SharedPreferences a2 = a(str);
        if (a2 != null) {
            if (i == 0) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                int intValue = ((Number) t).intValue();
                Object obj = a2.getAll().get(str2);
                if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        intValue = Integer.parseInt((String) obj);
                    } catch (Exception unused) {
                    }
                }
                return Integer.valueOf(intValue);
            }
            if (i == 1) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                long longValue = ((Number) t).longValue();
                Object obj2 = a2.getAll().get(str2);
                if (obj2 instanceof Long) {
                    longValue = ((Long) obj2).longValue();
                } else if (obj2 instanceof String) {
                    try {
                        longValue = Long.parseLong((String) obj2);
                    } catch (Exception unused2) {
                    }
                }
                return Long.valueOf(longValue);
            }
            if (i == 2) {
                if (!(t instanceof Number)) {
                    throw new NumberFormatException();
                }
                float floatValue = ((Number) t).floatValue();
                Object obj3 = a2.getAll().get(str2);
                if (obj3 instanceof Float) {
                    floatValue = ((Float) obj3).floatValue();
                } else if (obj3 instanceof String) {
                    try {
                        floatValue = Float.parseFloat((String) obj3);
                    } catch (Exception unused3) {
                    }
                }
                return Float.valueOf(floatValue);
            }
            if (i == 3) {
                if (t != 0 && !(t instanceof String)) {
                    throw new ClassCastException();
                }
                try {
                    return a2.getString(str2, (String) t);
                } catch (ClassCastException unused4) {
                    return null;
                }
            }
            if (i == 4) {
                if (!(t instanceof Boolean)) {
                    throw new ClassCastException();
                }
                boolean booleanValue = ((Boolean) t).booleanValue();
                Object obj4 = a2.getAll().get(str2);
                if (obj4 instanceof Boolean) {
                    booleanValue = ((Boolean) obj4).booleanValue();
                } else if (obj4 instanceof String) {
                    try {
                        booleanValue = Boolean.parseBoolean((String) obj4);
                    } catch (Exception unused5) {
                    }
                }
                return Boolean.valueOf(booleanValue);
            }
            if (i == 5) {
                if (t == 0 || (t instanceof Set)) {
                    return a2.getStringSet(str2, (Set) t);
                }
                throw new ClassCastException();
            }
        }
        return null;
    }
}
