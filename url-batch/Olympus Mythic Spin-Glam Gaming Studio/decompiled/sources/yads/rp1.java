package yads;

import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class rp1 extends Lambda implements Function1 {
    public final /* synthetic */ tp1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp1(tp1 tp1Var) {
        super(1);
        this.b = tp1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) obj;
        tp1 tp1Var = this.b;
        synchronized (tp1Var.c) {
            try {
                MediatedBannerAdapter.MediatedBannerAdapterListener mediatedBannerAdapterListener = tp1Var.d;
                tp1Var.d = null;
                if (mediatedBannerAdapterListener != null) {
                    mediatedBannerAdapterListener.onAdFailedToLoad(mediatedAdRequestError);
                }
                unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }
}
