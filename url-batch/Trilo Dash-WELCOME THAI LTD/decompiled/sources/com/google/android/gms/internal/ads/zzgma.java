package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgma {
    static String zza(zzgly zzglyVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzglyVar, sb, 0);
        return sb.toString();
    }

    static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzgng.zza(zzgjg.zzx((String) obj)));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzgjg) {
            sb.append(": \"");
            sb.append(zzgng.zza((zzgjg) obj));
            sb.append(Typography.quote);
            return;
        }
        if (obj instanceof zzgko) {
            sb.append(" {");
            zzd((zzgko) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        zzb(sb, i4, "key", entry.getKey());
        zzb(sb, i4, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzgly zzglyVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzglyVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(concat), zzgko.zzaL(method2, zzglyVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzgko.zzaL(method3, zzglyVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(String.valueOf(substring)))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(String.valueOf(substring)));
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object zzaL = zzgko.zzaL(method4, zzglyVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaL instanceof Boolean) {
                            if (((Boolean) zzaL).booleanValue()) {
                                zzb(sb, i, zzc(concat3), zzaL);
                            }
                        } else if (zzaL instanceof Integer) {
                            if (((Integer) zzaL).intValue() != 0) {
                                zzb(sb, i, zzc(concat3), zzaL);
                            }
                        } else if (zzaL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaL).floatValue()) != 0) {
                                zzb(sb, i, zzc(concat3), zzaL);
                            }
                        } else if (!(zzaL instanceof Double)) {
                            if (zzaL instanceof String) {
                                equals = zzaL.equals("");
                            } else if (zzaL instanceof zzgjg) {
                                equals = zzaL.equals(zzgjg.zzb);
                            } else if (!(zzaL instanceof zzgly)) {
                                if ((zzaL instanceof Enum) && ((Enum) zzaL).ordinal() == 0) {
                                }
                                zzb(sb, i, zzc(concat3), zzaL);
                            } else if (zzaL != ((zzgly) zzaL).zzbh()) {
                                zzb(sb, i, zzc(concat3), zzaL);
                            }
                            if (!equals) {
                                zzb(sb, i, zzc(concat3), zzaL);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzaL).doubleValue()) != 0) {
                            zzb(sb, i, zzc(concat3), zzaL);
                        }
                    } else if (((Boolean) zzgko.zzaL(method5, zzglyVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, zzc(concat3), zzaL);
                    }
                }
            }
        }
        if (zzglyVar instanceof zzgkl) {
            zzgkf zzgkfVar = ((zzgkl) zzglyVar).zzb;
            throw null;
        }
        zzgnj zzgnjVar = ((zzgko) zzglyVar).zzc;
        if (zzgnjVar != null) {
            zzgnjVar.zzg(sb, i);
        }
    }
}
