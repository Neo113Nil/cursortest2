package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b;
import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzamn {
    private static final char[] zza;

    static String zza(zzamm zzammVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        zza(zzammVar, sb, 0);
        return sb.toString();
    }

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void zza(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(zzann.zza(zzajv.zza((String) obj))).append('\"');
            return;
        }
        if (obj instanceof zzajv) {
            sb.append(": \"").append(zzann.zza((zzajv) obj)).append('\"');
            return;
        }
        if (obj instanceof zzalf) {
            sb.append(" {");
            zza((zzalf) obj, sb, i + 2);
            sb.append("\n");
            zza(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            zza(sb, i3, "key", entry.getKey());
            zza(sb, i3, "value", entry.getValue());
            sb.append("\n");
            zza(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ").append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ac, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzamm zzammVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzammVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(b.au)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    zza(sb, i, substring.substring(0, substring.length() - 4), zzalf.zza(method2, zzammVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zza(sb, i, substring.substring(0, substring.length() - 3), zzalf.zza(method, zzammVar, new Object[0]));
            } else if (hashSet.contains("set" + substring)) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey(b.au + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object zza2 = zzalf.zza(method4, zzammVar, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (!(zza2 instanceof Boolean)) {
                            if (!(zza2 instanceof Integer)) {
                                if (!(zza2 instanceof Float)) {
                                    if (!(zza2 instanceof Double)) {
                                        if (zza2 instanceof String) {
                                            equals = zza2.equals("");
                                        } else if (zza2 instanceof zzajv) {
                                            equals = zza2.equals(zzajv.zza);
                                        } else {
                                            equals = !(zza2 instanceof zzamm) ? false : false;
                                        }
                                    }
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) zzalf.zza(method5, zzammVar, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        zza(sb, i, substring, zza2);
                    }
                }
            }
            i2 = i3;
        }
        if (zzammVar instanceof zzalf.zzd) {
            Iterator<Map.Entry<zzalf.zzc, Object>> zzd = ((zzalf.zzd) zzammVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzalf zzalfVar = (zzalf) zzammVar;
        if (zzalfVar.zzb != null) {
            zzalfVar.zzb.zza(sb, i);
        }
    }
}
