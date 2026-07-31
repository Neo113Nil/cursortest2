package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;

/* loaded from: classes4.dex */
public interface y7 {
    Object a(Context context, Object obj, t8 t8Var, v3 v3Var, String str, MediatedAdObjectInfo mediatedAdObjectInfo, q7 q7Var);

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed();

    void onInvalidated();
}
