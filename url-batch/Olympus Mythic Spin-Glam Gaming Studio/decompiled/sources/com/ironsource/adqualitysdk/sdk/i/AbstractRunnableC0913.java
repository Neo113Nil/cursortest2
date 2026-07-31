package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC0913 implements Runnable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2205 = StringFog.decrypt("k7Vj7jJXasGpmVHtOFc=\n", "x/cwj1QyOLQ=\n");

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo3946();
        } catch (Throwable th) {
            try {
                mo4007(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ */
    public abstract void mo3946();

    /* renamed from: ﾒ */
    public void mo4007(Throwable th) {
        String str = f2205;
        String str2 = StringFog.decrypt("CiyEICHJzIdvPZouIJqF\n", "T172T1Pppek=\n") + getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("YgftegZg\n", "IWuMCXVIaww=\n"));
        sb.append(getClass().getName());
        try {
            AbstractC0577.m4067(str, str2, AbstractC1293.m4543("1w==\n", "/gdQZ4+UMYs=\n", sb), th, null, null, false, false, false);
        } catch (Throwable unused) {
        }
        AbstractC0580.m4072(str, StringFog.decrypt("Qyum5Dx9vqUmOrjqPS73\n", "BlnUi05d18s=\n") + getClass().getName());
        AbstractC0580.m4080(str, str, StringFog.decrypt("B+mPRP3mp+c=\n", "Q4z7JZSK1N0=\n"), th, null, false);
    }
}
