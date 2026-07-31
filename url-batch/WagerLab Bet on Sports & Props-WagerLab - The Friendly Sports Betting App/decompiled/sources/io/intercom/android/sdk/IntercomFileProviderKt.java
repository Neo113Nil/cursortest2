package io.intercom.android.sdk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomFileProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"fileProviderAuthority", "", "Landroid/content/Context;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomFileProviderKt {
    public static final String fileProviderAuthority(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageName() + ".IntercomFileProvider";
    }
}
