package com.iab.omid.library.pubmatic.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public class i implements b {
    private final Context a;
    private final j b;

    i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.a = context;
        this.b = j.a(context);
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? NastAdapter.ADAPTER_SDK_VERSION_NAME : str;
    }

    private boolean b(String str) {
        try {
            new URL(str);
            if (!str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u)) {
                if (!str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v)) {
                    return false;
                }
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.pubmatic.attestation.b
    public String a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.pubmatic.attestation.b
    public void a(a aVar) {
        String str;
        String str2;
        if (!this.b.b()) {
            str = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            str = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            str = "Attestation failed: attestationData is null";
        } else {
            String str3 = aVar.a().get("verifierurl");
            String a = a(aVar.a().get("version"));
            if (str3 == null || str3.trim().isEmpty()) {
                str = "Attestation failed: verifier URL is null or empty";
            } else {
                if (b(str3)) {
                    com.iab.omid.library.pubmatic.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: " + str3);
                    try {
                        if (this.a == null) {
                            com.iab.omid.library.pubmatic.utils.d.b("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str3)), (AttestAPICallback) null, a);
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str2 = "Attestation failed: Invalid input parameters";
                        com.iab.omid.library.pubmatic.utils.d.a(str2, e);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "Attestation failed: unexpected error";
                        com.iab.omid.library.pubmatic.utils.d.a(str2, e);
                        return;
                    }
                }
                str = "Attestation failed: invalid verifier URL format: " + str3;
            }
        }
        com.iab.omid.library.pubmatic.utils.d.b(str);
    }

    @Override // com.iab.omid.library.pubmatic.attestation.b
    public h b() {
        return h.NATIVE;
    }

    @Override // com.iab.omid.library.pubmatic.attestation.b
    public List<String> c() {
        return Collections.singletonList(NastAdapter.ADAPTER_SDK_VERSION_NAME);
    }
}
