package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfln {
    public final List zza;
    public final zzflg zzb;
    public final List zzc;

    @Nullable
    public final Bundle zzd;

    zzfln(JsonReader jsonReader, @Nullable Bundle bundle) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && bundle != null) {
            bundle.putLong(zzdzs.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzflg zzflgVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfld(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzflgVar = new zzflg(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcT)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdzs.NORMALIZATION_AD_RESPONSE_START.zza(), zzflgVar.zzs);
                            bundle.putLong(zzdzs.NORMALIZATION_AD_RESPONSE_END.zza(), zzflgVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzflm(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzflgVar == null ? new zzflg(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzflgVar;
    }

    public static zzfln zza(Reader reader, @Nullable Bundle bundle) throws zzflh {
        try {
            try {
                return new zzfln(new JsonReader(reader), bundle);
            } finally {
                IOUtils.closeQuietly(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzflh("unable to parse ServerResponse", e);
        }
    }
}
