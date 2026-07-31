package io.appmetrica.analytics.impl;

import android.content.Context;
import com.ironsource.X3;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Pk {
    public final C5638r7 a;
    public C5586p7 b;
    public C5323f3 c;
    public C5349g3 d;
    public Ob e;
    public Pb f;
    public Jn g;
    public Kn h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();

    public Pk(File file) {
        this.a = new C5638r7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        C5323f3 c5323f3 = this.c;
        if (c5323f3 != null) {
            return c5323f3;
        }
        C5323f3 c5323f32 = new C5323f3(new Kl(f(context)), "binary_data");
        this.c = c5323f32;
        return c5323f32;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        C5349g3 c5349g3;
        c5349g3 = this.d;
        if (c5349g3 == null) {
            c5349g3 = new C5349g3(a(context));
            this.d = c5349g3;
        }
        return c5349g3;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized InterfaceC5357gb d(Context context) {
        Pb pb;
        try {
            pb = this.f;
            if (pb == null) {
                Ob ob = this.e;
                if (ob == null) {
                    ob = new Ob("preferences", new Kl(f(context)), Ka.I.d.e());
                    this.e = ob;
                }
                pb = new Pb(ob);
                this.f = pb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return pb;
    }

    public final synchronized InterfaceC5357gb e(Context context) {
        Ob ob;
        ob = this.e;
        if (ob == null) {
            ob = new Ob("preferences", new Kl(f(context)), Ka.I.d.e());
            this.e = ob;
        }
        return ob;
    }

    public final synchronized C5586p7 f(Context context) {
        C5586p7 c5586p7;
        try {
            c5586p7 = this.b;
            if (c5586p7 == null) {
                C5638r7 c5638r7 = this.a;
                String a = new C5613q7(c5638r7.a, c5638r7.b, true).a(context, new C5781wk());
                C5276d7 c5276d7 = M5.c;
                c5276d7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", J5.a);
                hashMap.put("binary_data", H5.a);
                hashMap.put("temp_cache", Nn.a);
                Iterator<ModuleServicesDatabase> it = Ka.I.p().a().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C5810xn c5810xn = c5276d7.c;
                C5534n7 c5534n7 = c5276d7.a;
                C5482l7 c5482l7 = c5534n7.e;
                C5508m7 c5508m7 = c5534n7.f;
                Pa pa = new Pa(false);
                pa.a(114, new C5807xk());
                Iterator<ModuleServicesDatabase> it2 = Ka.I.p().a().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            pa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                An an = new An("service database", hashMap);
                c5810xn.getClass();
                c5586p7 = new C5586p7(context, a, new C5836yn(c5482l7, c5508m7, pa, an), PublicLogger.getAnonymousInstance());
                this.b = c5586p7;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5586p7;
    }

    public final synchronized C5586p7 c(Context context, C5351g5 c5351g5) {
        Object obj;
        try {
            String str = new X4(c5351g5).a;
            LinkedHashMap linkedHashMap = this.i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                C5638r7 c5638r7 = this.a;
                String a = new C5613q7(c5638r7.a, c5638r7.b, false).a(context, new X4(c5351g5));
                C5276d7 c5276d7 = M5.c;
                c5276d7.getClass();
                String str2 = c5351g5.b;
                if (str2 == null) {
                    str2 = X3.i.Z;
                }
                String format = String.format("component-%s", str2);
                C5810xn c5810xn = c5276d7.c;
                C5534n7 c5534n7 = c5276d7.a;
                C5327f7 c5327f7 = c5534n7.a;
                C5353g7 c5353g7 = c5534n7.b;
                Pa pa = new Pa(false);
                pa.a(112, new C5196a5());
                An an = new An(format, c5276d7.b.a);
                c5810xn.getClass();
                obj = new C5586p7(context, a, new C5836yn(c5327f7, c5353g7, pa, an), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C5586p7) obj;
    }

    public final synchronized IBinaryDataHelper a(Context context, C5351g5 c5351g5) {
        Object obj;
        try {
            String str = new X4(c5351g5).a;
            LinkedHashMap linkedHashMap = this.k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new C5323f3(new Kl(c(context, c5351g5)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized InterfaceC5357gb b(Context context, C5351g5 c5351g5) {
        Object obj;
        try {
            String str = new X4(c5351g5).a;
            LinkedHashMap linkedHashMap = this.j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new Ob("preferences", new Kl(c(context, c5351g5)), Ka.I.d.e());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC5357gb) obj;
    }
}
