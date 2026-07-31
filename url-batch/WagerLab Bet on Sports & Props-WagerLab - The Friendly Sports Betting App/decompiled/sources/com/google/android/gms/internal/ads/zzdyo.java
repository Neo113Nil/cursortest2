package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdyo {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgv zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfdc zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfib zzi;
    private final zzdsg zzj;
    private final zzfjv zzk;
    private final zzcyw zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbvd zzq;

    zzdyo(zzcgv zzcgvVar, Context context, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar, Executor executor, String str, zzfib zzfibVar, zzdsg zzdsgVar, zzbvd zzbvdVar, zzeau zzeauVar, ScheduledExecutorService scheduledExecutorService, zzfjv zzfjvVar, zzcyw zzcywVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfdcVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfibVar;
        zzcgvVar.zzz();
        this.zzj = zzdsgVar;
        this.zzq = zzbvdVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjvVar;
        this.zzl = zzcywVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ListenableFuture zzg(String str, final String str2) {
        ListenableFuture zza2;
        String str3;
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgot.zzc(new zzeho(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfhr zzn = zzfhr.zzn(context, 11);
        zzn.zza();
        zzbod zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzv());
        zzbnx zzbnxVar = zzboa.zza;
        final zzbnt zza3 = zzb.zza("google.afma.response.normalize", zzbnxVar, zzbnxVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhz)).booleanValue()) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.zzn = jSONObject.optString("fetch_url", "");
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused2) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                str4 = this.zzn;
                final List list = this.zzo;
                if (TextUtils.isEmpty(str4)) {
                }
                zzgob zzgobVar = new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzdyn
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        String str6 = (String) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        String str7 = str2;
                        try {
                            jSONObject4.put("headers", new JSONObject());
                            jSONObject4.put("body", str6);
                            jSONObject3.put("base_url", "");
                            jSONObject3.put("signals", new JSONObject(str7));
                            jSONObject2.put("request", jSONObject3);
                            jSONObject2.put("response", jSONObject4);
                            jSONObject2.put(NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, new JSONObject());
                            return zzgot.zza(jSONObject2);
                        } catch (JSONException e) {
                            String valueOf = String.valueOf(e.getCause());
                            String.valueOf(valueOf);
                            throw new JSONException("Preloaded loader: ".concat(String.valueOf(valueOf)));
                        }
                    }
                };
                Executor executor = this.zzf;
                ListenableFuture zzj = zzgot.zzj(zzgot.zzj(zzgot.zzj(zza2, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyj
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzdyo.this.zzb(zza3, (JSONObject) obj);
                    }
                }, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyk
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzdyo.this.zzc((JSONObject) obj);
                    }
                }, executor);
                zzfia.zzd(zzj, this.zzi, zzn);
                zzgot.zzq(zzj, new zzdyi(this), zzbzh.zzg);
                return zzj;
            }
            str4 = this.zzn;
            final List list2 = this.zzo;
            if (TextUtils.isEmpty(str4)) {
                this.zzj.zzd("sst", ExifInterface.GPS_MEASUREMENT_2D);
                String str6 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhB);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhA)).booleanValue()) {
                    List zze = zzghq.zzb(zza).zze(str4);
                    if (zze.size() < 2) {
                        zza2 = zzgot.zzc(new zzeho(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) zze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                final zzear zzearVar = new zzear(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6, false);
                zza2 = (zzgol) zzgot.zzh((zzgol) zzgot.zzi(zzgol.zzw(zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyl
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzdyo.this.zzd(zzearVar);
                    }
                })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhC)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdym
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzdyo.this.zze(list2, (Exception) obj);
                    }
                }, this.zzf);
            } else {
                zza2 = zzgot.zza(str3);
                this.zzj.zzd("sst", "1");
            }
        } else {
            zza2 = zzgot.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzgob zzgobVar2 = new zzgob(this) { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str62 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str62);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put(NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, new JSONObject());
                    return zzgot.zza(jSONObject2);
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e.getCause());
                    String.valueOf(valueOf);
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(valueOf)));
                }
            }
        };
        Executor executor2 = this.zzf;
        ListenableFuture zzj2 = zzgot.zzj(zzgot.zzj(zzgot.zzj(zza2, zzgobVar2, executor2), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdyo.this.zzb(zza3, (JSONObject) obj);
            }
        }, executor2), new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdyo.this.zzc((JSONObject) obj);
            }
        }, executor2);
        zzfia.zzd(zzj2, this.zzi, zzn);
        zzgot.zzq(zzj2, new zzdyi(this), zzbzh.zzg);
        return zzj2;
    }

    private final void zzh(zzdru zzdruVar) {
        Bundle zze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhE)).booleanValue()) {
            zze.putLong(zzdruVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0234, code lost:
    
        if (r5.zze(r1, r2, r4) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2 A[Catch: all -> 0x024a, TryCatch #3 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0106, B:36:0x010e, B:37:0x0114, B:41:0x011d, B:44:0x0153, B:47:0x0131, B:50:0x013e, B:52:0x015b, B:55:0x00e4, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b9, B:68:0x01ce, B:70:0x01f2, B:71:0x0207, B:74:0x021b, B:76:0x0221, B:77:0x022e, B:79:0x0230, B:81:0x0239, B:86:0x0236, B:87:0x01fc, B:88:0x01e1, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x0080, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221 A[Catch: all -> 0x024a, TryCatch #3 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0106, B:36:0x010e, B:37:0x0114, B:41:0x011d, B:44:0x0153, B:47:0x0131, B:50:0x013e, B:52:0x015b, B:55:0x00e4, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b9, B:68:0x01ce, B:70:0x01f2, B:71:0x0207, B:74:0x021b, B:76:0x0221, B:77:0x022e, B:79:0x0230, B:81:0x0239, B:86:0x0236, B:87:0x01fc, B:88:0x01e1, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x0080, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0230 A[Catch: all -> 0x024a, TryCatch #3 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0106, B:36:0x010e, B:37:0x0114, B:41:0x011d, B:44:0x0153, B:47:0x0131, B:50:0x013e, B:52:0x015b, B:55:0x00e4, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b9, B:68:0x01ce, B:70:0x01f2, B:71:0x0207, B:74:0x021b, B:76:0x0221, B:77:0x022e, B:79:0x0230, B:81:0x0239, B:86:0x0236, B:87:0x01fc, B:88:0x01e1, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x0080, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc A[Catch: all -> 0x024a, TryCatch #3 {, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fa, B:34:0x0106, B:36:0x010e, B:37:0x0114, B:41:0x011d, B:44:0x0153, B:47:0x0131, B:50:0x013e, B:52:0x015b, B:55:0x00e4, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b9, B:68:0x01ce, B:70:0x01f2, B:71:0x0207, B:74:0x021b, B:76:0x0221, B:77:0x022e, B:79:0x0230, B:81:0x0239, B:86:0x0236, B:87:0x01fc, B:88:0x01e1, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x0080, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        String str;
        int i;
        String str2;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zze().putLong(zzdru.SCAR_PRELOADER_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String str3 = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(str3)) {
            String zzj = zzj(str3);
            zzbbz zzbbzVar = zzbci.zzhv;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && zzj.isEmpty()) {
                int lastIndexOf = str3.lastIndexOf("&request_id=");
                zzj = lastIndexOf != -1 ? str3.substring(lastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(zzj)) {
                return zzgot.zzc(new zzeho(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzv zzr = this.zzb.zzr();
                zzdsg zzdsgVar = this.zzj;
                String zzb = zzr.zzb(zzj, zzdsgVar);
                String str4 = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && !TextUtils.isEmpty(zzb)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(zzb).optJSONObject("extras");
                        if (optJSONObject != null) {
                            if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhx)).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhy)).split(f.f598a)) : Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhw)).split(f.f598a))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(optJSONObject.optString("query_info_type", "")))) {
                                int lastIndexOf2 = str3.lastIndexOf("&");
                                String substring = lastIndexOf2 != -1 ? str3.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = zzj.getBytes("UTF-8");
                                        if (!TextUtils.isEmpty(zzb)) {
                                            try {
                                                string = new JSONObject(zzb).getString("arek");
                                            } catch (JSONException e) {
                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                            }
                                            str3 = zzfds.zzb(decode, bytes, string, zzdsgVar);
                                        }
                                        string = null;
                                        str3 = zzfds.zzb(decode, bytes, string, zzdsgVar);
                                    } catch (UnsupportedEncodingException | IllegalArgumentException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    try {
                        str = new JSONObject(str3).optString("render_id", "");
                    } catch (JSONException unused2) {
                        str = "";
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    String str5 = "";
                    try {
                        str5 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                    } catch (IllegalArgumentException e3) {
                        String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "PreloadedLoader.decodeRenderId");
                    }
                    List zze = zzghq.zza(zzggo.zzc(AbstractJsonLexerKt.COLON)).zze(str5);
                    if (zze.size() == 2) {
                        str4 = (String) zze.get(0);
                        i = Integer.parseInt((String) zze.get(1));
                        Pair pair = str4 == null ? new Pair(str4, Integer.valueOf(i)) : new Pair("", 0);
                        str2 = (String) pair.first;
                        int intValue = ((Integer) pair.second).intValue();
                        if (!TextUtils.isEmpty(str2) && intValue > 0) {
                            if (!zzr.zzd(zzj, str2)) {
                                return zzgot.zzc(new zzeho(10, "The ad has already been shown."));
                            }
                        }
                        zzr.zzc(zzj);
                        if (!TextUtils.isEmpty(zzb)) {
                            return zzg(str3, zzi(zzb));
                        }
                    } else {
                        String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                    }
                }
                i = 0;
                if (str4 == null) {
                }
                str2 = (String) pair.first;
                int intValue2 = ((Integer) pair.second).intValue();
                if (!TextUtils.isEmpty(str2)) {
                    if (!zzr.zzd(zzj, str2)) {
                    }
                }
                zzr.zzc(zzj);
                if (!TextUtils.isEmpty(zzb)) {
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhn)).booleanValue()) {
                String str6 = zzcVar.zza;
                String str7 = zzcVar.zzb;
                String zzj2 = zzj(str6);
                String zzj3 = zzj(str7);
                if (TextUtils.isEmpty(zzj3) || !zzj2.equals(zzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzr().zzc(zzj2);
                    this.zzj.zzc().put("request_id", zzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzgot.zzc(new zzeho(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(zzbnt zzbntVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbntVar.zzb(jSONObject);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject) {
        zzfcr zzfcrVar = new zzfcr(this.zze);
        String jSONObject2 = jSONObject.toString();
        return zzgot.zza(new zzfcu(zzfcrVar, zzfct.zza(new StringReader(jSONObject2), this.zzp)));
    }

    final /* synthetic */ String zzd(zzear zzearVar) {
        zzh(zzdru.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhD)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i2);
                    throw new zzeho(1, sb.toString());
                }
                zzear zzearVar2 = zzearVar;
                zzeas zza2 = new zzeat(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid()).zza(zzearVar);
                zzeas zzeasVar = zza2;
                int i3 = zza2.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhE)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i));
                }
                if (i3 == 200) {
                    zzh(zzdru.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zza2.zzc;
                }
                i++;
                i2 = i3;
            } catch (Exception e) {
                throw new zzeho(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    final /* synthetic */ ListenableFuture zze(List list, Exception exc) {
        zzeho zzehoVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzehoVar = new zzeho(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzeho) {
            zzehoVar = (zzeho) exc;
        } else {
            zzehoVar = new zzeho(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzehoVar.getMessage() == null ? "" : zzehoVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zze = zzghq.zza(zzggo.zzc(AbstractJsonLexerKt.COLON)).zze(message);
                    if (zze.size() == 2) {
                        message = (String) zze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjr.zzd(zzfjr.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgot.zzc(zzehoVar);
    }

    final /* synthetic */ zzcyw zzf() {
        return this.zzl;
    }
}
