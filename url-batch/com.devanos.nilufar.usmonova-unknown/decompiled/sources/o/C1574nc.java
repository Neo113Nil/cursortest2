package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1574nc implements InterfaceC0504Ti, ComponentRegistrarProcessor, InterfaceC2372zj, InterfaceC2301ye, LibraryVersionComponent.VersionExtractor, ImmutableSortedMap.Builder.KeyTranslator, InterfaceC1363kP {
    public final /* synthetic */ int h;

    public /* synthetic */ C1574nc(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC2372zj
    public float a(float f) {
        return f;
    }

    @Override // o.InterfaceC1363kP
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                C0950e6 a = F7.a();
                a.P(rawQuery.getString(1));
                a.k = AbstractC1555nJ.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.j = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.l());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // o.InterfaceC0504Ti
    public double b(double d) {
        double d2;
        switch (this.h) {
            case 0:
                double d3 = d < 0.0d ? -d : d;
                if (d3 >= 0.0031308049535603718d) {
                    d3 = Math.pow(d3, 0.4166666666666667d) - 0.05213270142180095d;
                    d2 = 0.9478672985781991d;
                } else {
                    d2 = 0.07739938080495357d;
                }
                return Math.copySign(d3 / d2, d);
            case 1:
                double d4 = d < 0.0d ? -d : d;
                return Math.copySign(d4 >= 0.04045d ? Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d) : d4 * 0.07739938080495357d, d);
            default:
                return d;
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$0;
        String lambda$getComponents$1;
        String lambda$getComponents$2;
        String lambda$getComponents$3;
        Context context = (Context) obj;
        switch (this.h) {
            case 8:
                lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0(context);
                return lambda$getComponents$0;
            case 9:
                lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1(context);
                return lambda$getComponents$1;
            case 10:
                lambda$getComponents$2 = FirebaseCommonRegistrar.lambda$getComponents$2(context);
                return lambda$getComponents$2;
            default:
                lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3(context);
                return lambda$getComponents$3;
        }
    }

    @Override // o.InterfaceC2301ye
    public Object n(MU mu) {
        Integer lambda$startMessagingService$1;
        Integer lambda$bindToMessagingService$3;
        switch (this.h) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                lambda$startMessagingService$1 = FcmBroadcastProcessor.lambda$startMessagingService$1(mu);
                return lambda$startMessagingService$1;
            default:
                lambda$bindToMessagingService$3 = FcmBroadcastProcessor.lambda$bindToMessagingService$3(mu);
                return lambda$bindToMessagingService$3;
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
    public Object translate(Object obj) {
        Object lambda$static$0;
        lambda$static$0 = ImmutableSortedMap.Builder.lambda$static$0(obj);
        return lambda$static$0;
    }

    public /* synthetic */ C1574nc(NC nc) {
        this.h = 15;
    }
}
