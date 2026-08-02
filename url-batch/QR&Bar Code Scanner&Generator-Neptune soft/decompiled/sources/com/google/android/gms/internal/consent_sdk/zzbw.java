package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzbw {
    public String zza;
    public String zzb;
    public String zzc;
    public int zzf = 1;
    public List<String> zzd = Collections.emptyList();
    public List<zzbv> zze = Collections.emptyList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b1, code lost:
    
        if (r1.equals("CONSENT_SIGNAL_UNKNOWN") != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzbw zza(JsonReader jsonReader) throws IOException {
        char c;
        boolean z;
        char c2;
        int i;
        zzbw zzbwVar = new zzbw();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            boolean z2 = false;
            int i2 = 5;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                String nextString = jsonReader.nextString();
                switch (nextString.hashCode()) {
                    case -2058725357:
                        if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                            z2 = 4;
                            break;
                        }
                        z2 = -1;
                        break;
                    case -1969035850:
                        if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                            z2 = 6;
                            break;
                        }
                        z2 = -1;
                        break;
                    case -1263695752:
                        break;
                    case -954325659:
                        if (nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                            z2 = 2;
                            break;
                        }
                        z2 = -1;
                        break;
                    case -918677260:
                        if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                            z2 = 7;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 429411856:
                        if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                            z2 = 3;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 467888915:
                        if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                            z2 = true;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 1725474845:
                        if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                            z2 = 5;
                            break;
                        }
                        z2 = -1;
                        break;
                    default:
                        z2 = -1;
                        break;
                }
                switch (z2) {
                    case false:
                        i2 = 1;
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        i2 = 2;
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        i2 = 3;
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        i2 = 4;
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        i2 = 6;
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        i2 = 7;
                        zzbwVar.zzf = i2;
                        break;
                    case true:
                        i2 = 8;
                        zzbwVar.zzf = i2;
                        break;
                    default:
                        String valueOf = String.valueOf(nextString);
                        throw new IOException(valueOf.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(valueOf) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
                }
            } else if (c == 1) {
                zzbwVar.zza = jsonReader.nextString();
            } else if (c == 2) {
                zzbwVar.zzb = jsonReader.nextString();
            } else if (c == 3) {
                zzbwVar.zzc = jsonReader.nextString();
            } else if (c == 4) {
                zzbwVar.zzd = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zzbwVar.zzd.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else if (c != 5) {
                jsonReader.skipValue();
            } else {
                zzbwVar.zze = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zzbv zzbvVar = new zzbv();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -2105551094) {
                            if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                z = false;
                            }
                            z = -1;
                        } else {
                            if (nextName2.equals("args_json")) {
                                z = true;
                            }
                            z = -1;
                        }
                        if (!z) {
                            String nextString2 = jsonReader.nextString();
                            int hashCode2 = nextString2.hashCode();
                            if (hashCode2 == 64208429) {
                                if (nextString2.equals("CLEAR")) {
                                    c2 = 2;
                                    if (c2 != 0) {
                                    }
                                    zzbvVar.zzb = i;
                                }
                                c2 = 65535;
                                if (c2 != 0) {
                                }
                                zzbvVar.zzb = i;
                            } else if (hashCode2 != 82862015) {
                                if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                    c2 = 0;
                                    if (c2 != 0) {
                                        i = 1;
                                    } else if (c2 == 1) {
                                        i = 2;
                                    } else {
                                        if (c2 != 2) {
                                            String valueOf2 = String.valueOf(nextString2);
                                            throw new IOException(valueOf2.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(valueOf2) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
                                        }
                                        i = 3;
                                    }
                                    zzbvVar.zzb = i;
                                }
                                c2 = 65535;
                                if (c2 != 0) {
                                }
                                zzbvVar.zzb = i;
                            } else {
                                if (nextString2.equals("WRITE")) {
                                    c2 = 1;
                                    if (c2 != 0) {
                                    }
                                    zzbvVar.zzb = i;
                                }
                                c2 = 65535;
                                if (c2 != 0) {
                                }
                                zzbvVar.zzb = i;
                            }
                        } else if (!z) {
                            jsonReader.skipValue();
                        } else {
                            zzbvVar.zza = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    zzbwVar.zze.add(zzbvVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return zzbwVar;
    }
}
