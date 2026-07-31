package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4978y implements InterfaceC4864rf<JSONObject>, InterfaceC4829pf<C4942w> {

    @NotNull
    private final Map<String, I0> a = new LinkedHashMap();
    private int b;

    /* renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4811of.values().length];
            try {
                iArr[EnumC4811of.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4811of.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4811of.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4811of.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4811of.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    private final void b(C4942w c4942w) {
        int i;
        int i2 = a.a[c4942w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final int a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4829pf
    public void a(@NotNull C4942w record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c = record.c();
        Map<String, I0> map = this.a;
        I0 i0 = map.get(c);
        if (i0 == null) {
            i0 = new I0();
            map.put(c, i0);
        }
        i0.a(record.a(new C4960x()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC4624e7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4847qf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, I0> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jsonObjectInit.put(key, a2);
            }
        }
        return jsonObjectInit;
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}
