package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.idsync.impl.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5185c implements JsonParser {
    public final C5187e a;
    public final String b = "id_sync";
    public final String c = "id_sync";
    public final String d = "launch_delay_seconds";
    public final String e = "requests";
    public final String f = "type";
    public final String g = "url";
    public final String h = "headers";
    public final String i = "resend_interval_for_valid_response";
    public final String j = "resend_interval_for_invalid_response";
    public final String k = "valid_response_codes";
    public final String l = "preconditions";
    public final String m = "network";
    public final String n = "cell";
    public final String o = "report_event_enabled";
    public final String p = "report_url";

    public C5185c(@NotNull C5187e c5187e) {
        this.a = c5187e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(@NotNull JSONObject jSONObject) {
        k[] kVarArr;
        JSONArray jSONArray;
        int i;
        i[] iVarArr;
        JSONArray jSONArray2;
        int i2;
        JSONObject jSONObject2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i3;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m mVar = new m();
        mVar.a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.b, mVar.a);
        l lVar = new l();
        lVar.a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.d, lVar.a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.e);
        int i4 = 0;
        if (optJSONArray == null) {
            kVarArr = new k[0];
        } else {
            int length = optJSONArray.length();
            k[] kVarArr2 = new k[length];
            int i5 = 0;
            while (i5 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i5);
                k kVar = new k();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i = length;
                    i3 = i4;
                } else {
                    String optString = optJSONObject2.optString(this.f);
                    Charset charset = Charsets.UTF_8;
                    kVar.a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.l);
                    j jVar = new j();
                    if (optJSONObject3 != null && Intrinsics.areEqual(optJSONObject3.optString(this.m), this.n)) {
                        jVar.a = 1;
                    }
                    kVar.b = jVar;
                    kVar.c = optJSONObject2.optString(this.g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.h);
                    if (optJSONObject4 == null) {
                        iVarArr = new i[i4];
                        jSONArray = optJSONArray;
                        i = length;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            i iVar = new i();
                            iVar.a = next.getBytes(Charsets.UTF_8);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i4][];
                                jSONArray2 = optJSONArray;
                                i2 = length;
                                jSONObject2 = optJSONObject4;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i6 = 0;
                                while (i6 < length2) {
                                    bArr2[i6] = optJSONArray2.optString(i6).getBytes(Charsets.UTF_8);
                                    i6++;
                                    length = length;
                                    optJSONObject4 = optJSONObject4;
                                }
                                i2 = length;
                                jSONObject2 = optJSONObject4;
                                bArr = bArr2;
                            }
                            iVar.b = bArr;
                            arrayList.add(iVar);
                            optJSONArray = jSONArray2;
                            length = i2;
                            optJSONObject4 = jSONObject2;
                            i4 = 0;
                        }
                        jSONArray = optJSONArray;
                        i = length;
                        iVarArr = (i[]) arrayList.toArray(new i[i4]);
                    }
                    kVar.d = iVarArr;
                    kVar.e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.i, kVar.e);
                    kVar.f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.j, kVar.f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i7 = 0; i7 < length3; i7++) {
                            iArr3[i7] = optJSONArray3.optInt(i7);
                        }
                        iArr = iArr3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i8 : iArr) {
                        if (i8 != 0) {
                            arrayList2.add(Integer.valueOf(i8));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null || (iArr2 = CollectionsKt.toIntArray(arrayList2)) == null) {
                        i3 = 0;
                        iArr2 = new int[]{200};
                    } else {
                        i3 = 0;
                    }
                    kVar.g = iArr2;
                    kVar.h = optJSONObject2.optBoolean(this.o, kVar.h);
                    kVar.i = optJSONObject2.optString(this.p);
                }
                kVarArr2[i5] = kVar;
                i5++;
                i4 = i3;
                optJSONArray = jSONArray;
                length = i;
            }
            kVarArr = kVarArr2;
        }
        lVar.b = kVarArr;
        mVar.b = lVar;
        return this.a.toModel(mVar);
    }

    @Nullable
    public final IdSyncConfig b(@NotNull JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
