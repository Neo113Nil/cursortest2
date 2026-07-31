package yads;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.ads.internal.util.zzs$$ExternalSyntheticApiModelOutline1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class wg1 {
    public final String a(Context context) {
        Object m8023constructorimpl;
        String a;
        LocaleList applicationLocales;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                applicationLocales = zzs$$ExternalSyntheticApiModelOutline1.m(systemService).getApplicationLocales();
                a = applicationLocales.isEmpty() ? ug1.a(context.getResources().getConfiguration().locale) : ug1.a(applicationLocales.get(0));
            } else {
                a = ug1.a(context.getResources().getConfiguration().locale);
            }
            m8023constructorimpl = Result.m8023constructorimpl(a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (String) m8023constructorimpl;
    }

    public final List b(Context context) {
        try {
            Result.Companion companion = Result.INSTANCE;
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            List createListBuilder = CollectionsKt.createListBuilder();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                createListBuilder.add(ug1.a(locales.get(i)));
            }
            return CollectionsKt.build(createListBuilder);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            return (List) m8023constructorimpl;
        }
    }
}
