package yads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class cp {
    public static final Json a = ad1.a;

    public static void a(og1 og1Var, ap apVar) {
        List<ms1> emptyList;
        ArrayList<ba> arrayList = apVar.b;
        HashSet hashSet = new HashSet(arrayList.size());
        for (ba baVar : arrayList) {
            String str = baVar.b;
            String str2 = baVar.d;
            hashSet.add(str);
            ((qg1) og1Var).a(a(str), str2);
        }
        qg1 qg1Var = (qg1) og1Var;
        Set<String> a2 = qg1Var.a("BiddingSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (a2 == null) {
            a2 = SetsKt.emptySet();
        }
        for (String str3 : a2) {
            if (!hashSet.contains(str3)) {
                qg1Var.d(a(str3));
            }
        }
        qg1Var.a("BiddingSettingsAdUnitIdsSet", hashSet);
        vs1 vs1Var = apVar.c;
        long j = vs1Var != null ? vs1Var.b : 0L;
        if (vs1Var == null || (emptyList = vs1Var.c) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        HashSet hashSet2 = new HashSet(emptyList.size());
        for (ms1 ms1Var : emptyList) {
            hashSet2.add(ms1Var.b);
            String b = b(ms1Var.b);
            Json json = a;
            json.getSerializersModule();
            qg1Var.a(b, json.encodeToString(ms1.CREATOR.serializer(), ms1Var));
        }
        Set<String> a3 = qg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (a3 == null) {
            a3 = SetsKt.emptySet();
        }
        for (String str4 : a3) {
            if (!hashSet2.contains(str4)) {
                qg1Var.d(b(str4));
            }
        }
        qg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        qg1Var.a("MediationPrefetchLoadTimeoutMillis", j);
    }

    public static void b(og1 og1Var) {
        qg1 qg1Var = (qg1) og1Var;
        Set a2 = qg1Var.a("BiddingSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (a2 == null) {
            a2 = SetsKt.emptySet();
        }
        Set a3 = qg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (a3 == null) {
            a3 = SetsKt.emptySet();
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            qg1Var.d(a((String) it.next()));
        }
        Iterator it2 = a3.iterator();
        while (it2.hasNext()) {
            qg1Var.d(b((String) it2.next()));
        }
        qg1Var.d("BiddingSettingsAdUnitIdsSet");
        qg1Var.d("MediationPrefetchSettingsAdUnitIdsSet");
    }

    public static String b(String str) {
        return "MediationPrefetchSettingsAdUnitIdsInfo_" + str;
    }

    public static ap a(og1 og1Var) {
        qg1 qg1Var = (qg1) og1Var;
        Set a2 = qg1Var.a("BiddingSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (a2 == null) {
            a2 = SetsKt.emptySet();
        }
        Set a3 = qg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (a3 == null) {
            a3 = SetsKt.emptySet();
        }
        bp bpVar = new bp();
        ArrayList arrayList = new ArrayList(a2.size());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String c = qg1Var.c(a((String) it.next()));
            if (c != null && c.length() != 0) {
                try {
                    ba a4 = bpVar.a(new JSONObject(c));
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } catch (JSONException unused) {
                    boolean z = ob1.a;
                }
            }
        }
        long b = qg1Var.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(a3.size());
        Iterator it2 = a3.iterator();
        while (it2.hasNext()) {
            String c2 = qg1Var.c(b((String) it2.next()));
            if (c2 != null) {
                Json json = a;
                json.getSerializersModule();
                ms1 ms1Var = (ms1) json.decodeFromString(BuiltinSerializersKt.getNullable(ms1.CREATOR.serializer()), c2);
                if (ms1Var != null) {
                    arrayList2.add(ms1Var);
                }
            }
        }
        vs1 vs1Var = new vs1(b, arrayList2);
        if (arrayList.isEmpty() && a3.isEmpty()) {
            return null;
        }
        return new ap(arrayList, vs1Var);
    }

    public static String a(String str) {
        return "BiddingSettingsAdUnitIdsInfo_" + str;
    }
}
