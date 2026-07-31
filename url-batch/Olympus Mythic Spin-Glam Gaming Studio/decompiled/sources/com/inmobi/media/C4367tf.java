package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4367tf {
    public final Context a;
    public final C4493y9 b;
    public String c;
    public boolean d;
    public final SignalsConfig.NovatiqConfig e;

    public C4367tf(Context context, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = c4493y9;
        this.c = "";
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        this.e = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final C4314rf a() {
        if (this.d) {
            return new C4314rf(MapsKt.hashMapOf(TuplesKt.to("n-h-id", this.c)));
        }
        C4493y9 c4493y9 = this.b;
        if (c4493y9 != null) {
            c4493y9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C4314rf(MapsKt.emptyMap());
    }

    public final void b() {
        String str;
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.e.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
                str = "";
            }
            List<String> carrierNames = this.e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (StringsKt.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                        try {
                            String a = a(this.a);
                            this.d = true;
                            StringBuilder sb = new StringBuilder();
                            Random random = new Random();
                            for (int i = 0; i < 40; i++) {
                                char charAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i);
                                if (charAt == 'x') {
                                    sb.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb.append(charAt);
                                }
                            }
                            String sb2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                            this.c = sb2;
                            ((F9) Ve.c.getValue()).a(new C4394uf(this.e, new C4340sf(sb2, a), this.b).a()).invokeOnCompletion(new Function1() { // from class: com.inmobi.media.tf$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4367tf.a(C4367tf.this, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C4493y9 c4493y9 = this.b;
        if (c4493y9 != null) {
            c4493y9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final Unit a(C4367tf c4367tf, Throwable th) {
        if (th == null) {
            C4493y9 c4493y9 = c4367tf.b;
            if (c4493y9 != null) {
                c4493y9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C4493y9 c4493y92 = c4367tf.b;
            if (c4493y92 != null) {
                c4493y92.a("NovatiqDataHandler", "Error: " + th);
            }
        }
        return Unit.INSTANCE;
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.replace$default(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, (Object) null) + "_app";
    }
}
