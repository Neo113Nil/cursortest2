package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FirstMessageUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u000b"}, d2 = {"handleFirstMessageToast", "", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "twig", "Lcom/intercom/twig/Twig;", "context", "Landroid/content/Context;", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "showFirstMessageToast", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FirstMessageUtilsKt {
    public static final void handleFirstMessageToast(CoroutineScope applicationScope, Twig twig, Context context, IntercomDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        BuildersKt__Builders_commonKt.launch$default(applicationScope, null, null, new FirstMessageUtilsKt$handleFirstMessageToast$1(dataLayer, twig, context, null), 3, null);
    }

    public static final void showFirstMessageToast(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.intercom_onboarding_layout, (ViewGroup) null);
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        toast.setView(inflate);
        toast.show();
    }
}
