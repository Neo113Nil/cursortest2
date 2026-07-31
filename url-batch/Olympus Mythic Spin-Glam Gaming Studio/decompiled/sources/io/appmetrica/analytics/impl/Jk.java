package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Jk implements InterfaceC5282dd {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        C5586p7 c5586p7;
        Ik ik = new Ik();
        Hk hk = new Hk();
        C5836yn c5836yn = new C5836yn(hk, hk, new Pa(false), new InterfaceC5862zn() { // from class: io.appmetrica.analytics.impl.Jk$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC5862zn
            public final boolean a(SQLiteDatabase sQLiteDatabase) {
                return Jk.a(sQLiteDatabase);
            }
        });
        Pk B = Ka.I.B();
        synchronized (B) {
            C5638r7 c5638r7 = B.a;
            c5586p7 = new C5586p7(context, new C5613q7(c5638r7.a, c5638r7.b, false).a(context, ik), c5836yn, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new C5323f3(new Kl(c5586p7), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            Ka.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5282dd
    public final void a(@NotNull Context context) {
        AbstractC5420in abstractC5420in = (AbstractC5420in) C5369gn.a(Am.class);
        ProtobufStateStorage<Object> a = abstractC5420in.a(context, abstractC5420in.b(context));
        Am am = (Am) a.read();
        C5861zm a2 = am.a(am.m);
        a2.o = 0L;
        a.save(new Am(a2));
        b(context);
    }
}
