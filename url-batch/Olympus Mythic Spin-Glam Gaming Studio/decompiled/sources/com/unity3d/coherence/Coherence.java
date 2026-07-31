package com.unity3d.coherence;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes9.dex */
final class Coherence {
    private static final Set SETTINGS_GETTERS;
    private static final Set SETTINGS_ROOTS;
    private final Object blobLock = new Object();
    private final Context context;
    private final SharedPreferences prefs;

    Coherence(Context context, SharedPreferences sharedPreferences) {
        this.context = context;
        this.prefs = sharedPreferences;
    }

    String kvGet(String str) {
        return this.prefs.getString(str, null);
    }

    boolean kvSet(String str, String str2) {
        this.prefs.edit().putString(str, str2).apply();
        return true;
    }

    String generateUuid() {
        return UUID.randomUUID().toString();
    }

    String reflectString(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof String) {
            return (String) resolvePath;
        }
        return null;
    }

    Long reflectInt(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Number) {
            return Long.valueOf(((Number) resolvePath).longValue());
        }
        return null;
    }

    Boolean reflectBool(String str) {
        Object resolvePath = resolvePath(str);
        if (resolvePath instanceof Boolean) {
            return (Boolean) resolvePath;
        }
        return null;
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("android.provider.Settings$Global");
        hashSet.add("android.provider.Settings$Secure");
        hashSet.add("android.provider.Settings$System");
        SETTINGS_ROOTS = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(Arrays.asList("getInt", "getString", "getFloat", "getLong"));
        SETTINGS_GETTERS = Collections.unmodifiableSet(hashSet2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r1 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Object resolvePath(String str) {
        Object obj;
        if (str != null && !str.isEmpty()) {
            List list = tokenize(str);
            if (!list.isEmpty() && list.size() <= 32) {
                int i = 0;
                String str2 = (String) list.get(0);
                int i2 = 1;
                if ("context".equals(str2)) {
                    obj = this.context;
                } else if (str2.startsWith("stickyIntent(")) {
                    String extractStringArg = extractStringArg(str2);
                    if (extractStringArg == null) {
                        return null;
                    }
                    try {
                        obj = this.context.registerReceiver(null, new IntentFilter(extractStringArg));
                    } catch (Throwable unused) {
                    }
                } else {
                    int size = list.size();
                    while (true) {
                        if (size < 1) {
                            obj = null;
                            i2 = -1;
                            break;
                        }
                        if (((String) list.get(size - 1)).indexOf(40) == -1) {
                            try {
                                obj = Class.forName(join(list, i, size));
                                i2 = size;
                                break;
                            } catch (ClassNotFoundException unused2) {
                                continue;
                            }
                        }
                        size--;
                    }
                    if (obj == null) {
                        return null;
                    }
                }
                while (i2 < list.size()) {
                    if (obj == null) {
                        return null;
                    }
                    obj = dispatchSegment(obj, (String) list.get(i2));
                    i2++;
                }
                return obj;
            }
        }
        return null;
        return null;
    }

    private Object dispatchSegment(Object obj, String str) {
        int indexOf = str.indexOf(40);
        if (indexOf == -1) {
            return resolveFieldOrZeroArgMethod(obj, str);
        }
        String substring = str.substring(0, indexOf);
        String extractStringArg = extractStringArg(str);
        if (extractStringArg == null) {
            return null;
        }
        return resolveMethodWithStringArg(obj, substring, extractStringArg);
    }

    private static Object resolveFieldOrZeroArgMethod(Object obj, String str) {
        boolean z = obj instanceof Class;
        Class<?> cls = z ? (Class) obj : obj.getClass();
        if (z) {
            obj = null;
        }
        try {
            try {
                return cls.getField(str).get(obj);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        } catch (IllegalAccessException unused2) {
            return null;
        } catch (NoSuchFieldException unused3) {
            return cls.getMethod(str, null).invoke(obj, null);
        }
    }

    private Object resolveMethodWithStringArg(Object obj, String str, String str2) {
        boolean z = obj instanceof Class;
        Class<?> cls = z ? (Class) obj : obj.getClass();
        if (z) {
            obj = null;
        }
        if (obj == null && SETTINGS_ROOTS.contains(cls.getName()) && SETTINGS_GETTERS.contains(str)) {
            try {
                return cls.getMethod(str, ContentResolver.class, String.class).invoke(null, this.context.getContentResolver(), str2);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        try {
            return cls.getMethod(str, String.class).invoke(obj, str2);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }

    static List tokenize(String str) {
        return splitOnTopLevel('.', str, false);
    }

    static List splitOnTopLevel(char c, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (z2) {
                sb.append(charAt);
                z2 = false;
            } else if (z3) {
                if (charAt == '\\') {
                    z2 = true;
                } else if (charAt == '\"') {
                    z3 = false;
                }
                sb.append(charAt);
            } else if (charAt == '\"') {
                sb.append(charAt);
                z3 = true;
            } else if (charAt == '(') {
                i++;
                sb.append(charAt);
            } else if (charAt == ')') {
                if (i > 0) {
                    i--;
                }
                sb.append(charAt);
            } else if (charAt == c && i == 0) {
                if (z || sb.length() > 0) {
                    arrayList.add(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
        }
        if (z || sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    static String extractStringArg(String str) {
        int i;
        char charAt;
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf != -1 && lastIndexOf != -1 && lastIndexOf >= indexOf) {
            String trim = str.substring(indexOf + 1, lastIndexOf).trim();
            if (trim.length() >= 2 && trim.startsWith("\"") && trim.endsWith("\"")) {
                String substring = trim.substring(1, trim.length() - 1);
                StringBuilder sb = new StringBuilder(substring.length());
                int i2 = 0;
                while (i2 < substring.length()) {
                    char charAt2 = substring.charAt(i2);
                    if (charAt2 == '\\' && (i = i2 + 1) < substring.length() && ((charAt = substring.charAt(i)) == '\"' || charAt == '\\')) {
                        sb.append(charAt);
                        i2 = i;
                    } else {
                        sb.append(charAt2);
                    }
                    i2++;
                }
                return sb.toString();
            }
        }
        return null;
    }

    private static String join(List list, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 > i) {
                sb.append('.');
            }
            sb.append((String) list.get(i3));
        }
        return sb.toString();
    }
}
