package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.LocaleList;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserLocaleUtil.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getUserLocaleString", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserLocaleUtilKt {
    public static final String getUserLocaleString(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            arrayList.add(locale.getLanguage() + '-' + locale.getCountry());
        }
        return CollectionsKt.joinToString$default(arrayList, f.f598a, null, null, 0, null, null, 62, null);
    }
}
