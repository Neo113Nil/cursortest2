package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ř, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0388 implements InterfaceC1212 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1336 f208;

    public C0388(C1336 c1336) {
        this.f208 = c1336;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1212
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3995() {
        String m4044;
        AbstractC0590 m4087 = AbstractC0590.m4087();
        C0545 c0545 = this.f208.f3683.f3187;
        C0839 c0839 = ((C0600) m4087).f2997;
        c0839.getClass();
        String decrypt = StringFog.decrypt("22otNTgi+GDE\n", "rxhMVl1AmQM=\n");
        String decrypt2 = StringFog.decrypt("Yv7p\n", "VdDZo1F9mlU=\n");
        C0843 c0843 = new C0843(c0839);
        c0545.getClass();
        C0538 c0538 = new C0538(decrypt, decrypt2);
        if (((C0600) AbstractC0590.m4087()).f1015.m4159()) {
            String m4160 = ((C0600) AbstractC0590.m4087()).f1015.m4160(decrypt);
            if (TextUtils.isEmpty(m4160)) {
                m4044 = null;
                if (TextUtils.isEmpty(m4044)) {
                    try {
                        c0839.f2054 = IronSourceNetworkBridge.jsonObjectInit(m4044);
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                return;
            }
            c0538 = new C0508(decrypt, decrypt2, m4160);
        }
        m4044 = c0545.m4044(c0538, c0843);
        if (TextUtils.isEmpty(m4044)) {
        }
    }
}
