package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.MBCountDownView;
import com.mbridge.msdk.dycreator.baseview.MBLinearLayout;
import com.mbridge.msdk.dycreator.baseview.MBRelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.utils.d;

/* compiled from: BindViewClickListener.java */
/* loaded from: classes4.dex */
public class a implements View.OnClickListener {
    private com.mbridge.msdk.dycreator.viewdata.base.a a;

    public a(com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BaseStrategy a;
        com.mbridge.msdk.dycreator.viewdata.base.a aVar;
        if (view == 0 || !(view instanceof InterBase)) {
            return;
        }
        if (!(view instanceof MBCountDownView) || (aVar = this.a) == null || aVar.getEffectData() == null || this.a.getEffectData().isCanSkip()) {
            com.mbridge.msdk.dycreator.viewdata.base.a aVar2 = this.a;
            if (aVar2 != null && (view instanceof MBRelativeLayout) && d.a(view, aVar2)) {
                com.mbridge.msdk.dycreator.viewdata.base.a aVar3 = this.a;
                if (aVar3 instanceof MBSplashData) {
                    MBRelativeLayout mBRelativeLayout = (MBRelativeLayout) view;
                    ((MBSplashData) aVar3).setxInScreen(mBRelativeLayout.getxInScreen());
                    ((MBSplashData) this.a).setyInScreen(mBRelativeLayout.getyInScreen());
                    ((MBSplashData) this.a).setClickType(1);
                }
            }
            com.mbridge.msdk.dycreator.viewdata.base.a aVar4 = this.a;
            if (aVar4 != null && (view instanceof MBLinearLayout) && d.a(view, aVar4)) {
                com.mbridge.msdk.dycreator.viewdata.base.a aVar5 = this.a;
                if (aVar5 instanceof MBSplashData) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) view;
                    ((MBSplashData) aVar5).setxInScreen(mBLinearLayout.getxInScreen());
                    ((MBSplashData) this.a).setyInScreen(mBLinearLayout.getyInScreen());
                    ((MBSplashData) this.a).setClickType(0);
                }
            }
            String strategyDes = ((InterBase) view).getStrategyDes();
            if (TextUtils.isEmpty(strategyDes) || (a = c.a().a(strategyDes)) == null) {
                return;
            }
            a.bindClickData(view, this.a);
        }
    }
}
