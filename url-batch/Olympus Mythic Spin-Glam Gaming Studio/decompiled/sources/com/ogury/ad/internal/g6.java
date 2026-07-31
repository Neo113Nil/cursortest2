package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SharedPrefsUtilsKt;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class g6 {
    public final v5 a;
    public final DataStore b;
    public final Mutex c;
    public ArrayList d;
    public final CoroutineScope e;
    public static final /* synthetic */ KProperty[] g = {Reflection.property2(new PropertyReference2Impl(g6.class, "dataStore", "getDataStore(Landroid/content/Context;)Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", 0))};
    public static final y5 f = new y5();
    public static final Preferences.Key h = PreferencesKeys.stringKey("monitoring");
    public static final Preferences.Key i = PreferencesKeys.intKey("monitoring_version");

    public g6(Context context) {
        v5 monitoringEventParser = new v5();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(monitoringEventParser, "monitoringEventParser");
        this.a = monitoringEventParser;
        ReadOnlyProperty preferencesDataStore$default = PreferenceDataStoreDelegateKt.preferencesDataStore$default("ogy-ads-monitoring", null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "<this>");
        this.b = (DataStore) preferencesDataStore$default.getValue(context, g[0]);
        this.c = MutexKt.Mutex$default(false, 1, null);
        this.d = new ArrayList();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.e = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new x5(this, null), 3, null);
        SharedPrefsUtilsKt.deleteLegacySharedPreferences(context, "ogy-ads-monitoring");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:39|40))(3:41|42|(1:44)(1:45))|12|(1:38)(9:16|(1:18)|19|20|21|22|(3:24|(2:26|27)(1:29)|28)|31|32)|33|34))|48|6|7|(0)(0)|12|(1:14)|38|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        com.ogury.core.internal.Logger.INSTANCE.e(com.ogury.core.internal.LogTag.INTERNAL, com.ogury.core.internal.SourceTag.ADS, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        c6 c6Var;
        int i2;
        g6 g6Var;
        Integer num;
        ArrayList arrayList;
        if (continuationImpl instanceof c6) {
            c6Var = (c6) continuationImpl;
            int i3 = c6Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c6Var.d = i3 - Integer.MIN_VALUE;
                Object obj = c6Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c6Var.d;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow data = this.b.getData();
                    c6Var.a = this;
                    c6Var.d = 1;
                    obj = FlowKt.first(data, c6Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    g6Var = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g6Var = c6Var.a;
                    ResultKt.throwOnFailure(obj);
                }
                Preferences preferences = (Preferences) obj;
                num = (Integer) preferences.get(i);
                IntRange intRange = new IntRange(1, 1);
                if (num == null && intRange.contains(num.intValue())) {
                    String str = (String) preferences.get(h);
                    if (str == null) {
                        str = "[]";
                    }
                    try {
                        v5 v5Var = g6Var.a;
                        try {
                            arrayList = new ArrayList();
                            JSONArray jSONArray = new JSONArray(str);
                            int length = jSONArray.length();
                            for (int i4 = 0; i4 < length; i4++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                                o5 a = v5.a(jSONObject);
                                if (a != null) {
                                    arrayList.add(a);
                                }
                            }
                        } catch (JSONException unused) {
                            arrayList = new ArrayList();
                        }
                    } catch (Exception unused2) {
                        arrayList = new ArrayList();
                    }
                    g6Var.d = arrayList;
                } else {
                    BuildersKt__Builders_commonKt.launch$default(g6Var.e, null, null, new a6(g6Var, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }
        c6Var = new c6(this, continuationImpl);
        Object obj2 = c6Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c6Var.d;
        if (i2 != 0) {
        }
        Preferences preferences2 = (Preferences) obj2;
        num = (Integer) preferences2.get(i);
        IntRange intRange2 = new IntRange(1, 1);
        if (num == null) {
        }
        BuildersKt__Builders_commonKt.launch$default(g6Var.e, null, null, new a6(g6Var, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(6:16|17|(6:20|21|22|24|25|18)|29|30|(1:32))|11|12))|35|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        com.ogury.core.internal.Logger.INSTANCE.e(com.ogury.core.internal.LogTag.INTERNAL, com.ogury.core.internal.SourceTag.ADS, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        e6 e6Var;
        int i2;
        if (continuationImpl instanceof e6) {
            e6Var = (e6) continuationImpl;
            int i3 = e6Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6Var.c = i3 - Integer.MIN_VALUE;
                Object obj = e6Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = e6Var.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List events = CollectionsKt.toList(list);
                    Intrinsics.checkNotNullParameter(events, "events");
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = events.iterator();
                    while (it.hasNext()) {
                        try {
                            jSONArray.put(n4.a((o5) it.next()));
                        } catch (Exception e) {
                            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
                        }
                    }
                    String jSONArray2 = jSONArray.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
                    DataStore dataStore = this.b;
                    f6 f6Var = new f6(jSONArray2, null);
                    e6Var.c = 1;
                    if (PreferencesKt.edit(dataStore, f6Var, e6Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        e6Var = new e6(this, continuationImpl);
        Object obj2 = e6Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = e6Var.c;
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }
}
