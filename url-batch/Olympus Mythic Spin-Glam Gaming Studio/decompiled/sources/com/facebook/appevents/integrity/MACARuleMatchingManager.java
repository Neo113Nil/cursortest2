package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MACARuleMatchingManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/facebook/appevents/integrity/MACARuleMatchingManager;", "", "()V", "MACARules", "Lorg/json/JSONArray;", "enabled", "", "keys", "", "", "[Ljava/lang/String;", a.k, "", "generateInfo", "params", "Landroid/os/Bundle;", "event", "getKey", "logic", "Lorg/json/JSONObject;", "getMatchPropertyIDs", "getStringArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "isMatchCCRule", "ruleString", "data", "loadMACARules", "processParameters", "removeGeneratedInfo", "stringComparison", "variable", "values", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class MACARuleMatchingManager {

    @Nullable
    private static JSONArray MACARules;
    private static boolean enabled;

    @NotNull
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();

    @NotNull
    private static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    private final void loadMACARules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            MACARules = queryAppSettings.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Nullable
    public static final String getKey(@NotNull JSONObject logic) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys2 = logic.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0291, B:75:0x0296, B:77:0x0297, B:78:0x029c, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02aa, B:104:0x02b2, B:105:0x02b6, B:107:0x02bc, B:109:0x02c4, B:111:0x02d3, B:117:0x02e2, B:118:0x02e7, B:120:0x02e8, B:121:0x02ed, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:186:0x018a, B:190:0x020a, B:194:0x0194, B:198:0x019e, B:202:0x0226, B:204:0x01a8, B:208:0x01c4, B:212:0x01ce, B:216:0x01ea, B:220:0x0200, B:224:0x021c, B:228:0x0230, B:232:0x024c, B:236:0x029d, B:240:0x02ee, B:244:0x02f8, B:246:0x02fe, B:248:0x0309, B:252:0x0318, B:253:0x031d, B:254:0x031e, B:255:0x0323, B:256:0x0324, B:260:0x032e, B:262:0x0338, B:268:0x0379, B:270:0x0342, B:274:0x034c, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0397, B:294:0x03a0, B:296:0x03a6, B:298:0x03b1, B:302:0x03c1, B:303:0x03c6, B:304:0x03c7, B:305:0x03cc, B:307:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038e A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0291, B:75:0x0296, B:77:0x0297, B:78:0x029c, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02aa, B:104:0x02b2, B:105:0x02b6, B:107:0x02bc, B:109:0x02c4, B:111:0x02d3, B:117:0x02e2, B:118:0x02e7, B:120:0x02e8, B:121:0x02ed, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:186:0x018a, B:190:0x020a, B:194:0x0194, B:198:0x019e, B:202:0x0226, B:204:0x01a8, B:208:0x01c4, B:212:0x01ce, B:216:0x01ea, B:220:0x0200, B:224:0x021c, B:228:0x0230, B:232:0x024c, B:236:0x029d, B:240:0x02ee, B:244:0x02f8, B:246:0x02fe, B:248:0x0309, B:252:0x0318, B:253:0x031d, B:254:0x031e, B:255:0x0323, B:256:0x0324, B:260:0x032e, B:262:0x0338, B:268:0x0379, B:270:0x0342, B:274:0x034c, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0397, B:294:0x03a0, B:296:0x03a6, B:298:0x03b1, B:302:0x03c1, B:303:0x03c6, B:304:0x03c7, B:305:0x03cc, B:307:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0378 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0379 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0291, B:75:0x0296, B:77:0x0297, B:78:0x029c, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02aa, B:104:0x02b2, B:105:0x02b6, B:107:0x02bc, B:109:0x02c4, B:111:0x02d3, B:117:0x02e2, B:118:0x02e7, B:120:0x02e8, B:121:0x02ed, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:186:0x018a, B:190:0x020a, B:194:0x0194, B:198:0x019e, B:202:0x0226, B:204:0x01a8, B:208:0x01c4, B:212:0x01ce, B:216:0x01ea, B:220:0x0200, B:224:0x021c, B:228:0x0230, B:232:0x024c, B:236:0x029d, B:240:0x02ee, B:244:0x02f8, B:246:0x02fe, B:248:0x0309, B:252:0x0318, B:253:0x031d, B:254:0x031e, B:255:0x0323, B:256:0x0324, B:260:0x032e, B:262:0x0338, B:268:0x0379, B:270:0x0342, B:274:0x034c, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0397, B:294:0x03a0, B:296:0x03a6, B:298:0x03b1, B:302:0x03c1, B:303:0x03c6, B:304:0x03c7, B:305:0x03cc, B:307:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0259 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0291, B:75:0x0296, B:77:0x0297, B:78:0x029c, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02aa, B:104:0x02b2, B:105:0x02b6, B:107:0x02bc, B:109:0x02c4, B:111:0x02d3, B:117:0x02e2, B:118:0x02e7, B:120:0x02e8, B:121:0x02ed, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:186:0x018a, B:190:0x020a, B:194:0x0194, B:198:0x019e, B:202:0x0226, B:204:0x01a8, B:208:0x01c4, B:212:0x01ce, B:216:0x01ea, B:220:0x0200, B:224:0x021c, B:228:0x0230, B:232:0x024c, B:236:0x029d, B:240:0x02ee, B:244:0x02f8, B:246:0x02fe, B:248:0x0309, B:252:0x0318, B:253:0x031d, B:254:0x031e, B:255:0x0323, B:256:0x0324, B:260:0x032e, B:262:0x0338, B:268:0x0379, B:270:0x0342, B:274:0x034c, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0397, B:294:0x03a0, B:296:0x03a6, B:298:0x03b1, B:302:0x03c1, B:303:0x03c6, B:304:0x03c7, B:305:0x03cc, B:307:0x0055), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean stringComparison(@NotNull String variable, @NotNull JSONObject values, @Nullable Bundle data) {
        Object obj;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(values, "values");
            String key = getKey(values);
            if (key == null) {
                return false;
            }
            String obj2 = values.get(key).toString();
            ArrayList<String> stringArrayList = getStringArrayList(values.optJSONArray(key));
            Boolean bool = null;
            if (Intrinsics.areEqual(key, "exists")) {
                if (data != null) {
                    bool = Boolean.valueOf(data.containsKey(variable));
                }
                return Intrinsics.areEqual(bool, Boolean.valueOf(Boolean.parseBoolean(obj2)));
            }
            if (data == null) {
                obj = null;
            } else {
                String lowerCase = variable.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = data.get(lowerCase);
            }
            if (obj == null) {
                obj = data == null ? null : data.get(variable);
                if (obj == null) {
                    return false;
                }
            }
            switch (key.hashCode()) {
                case -1729128927:
                    if (!key.equals("i_not_contains")) {
                        return false;
                    }
                    String obj3 = obj.toString();
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = obj3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase3 = obj2.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return !StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase3, false, 2, (Object) null);
                case -1179774633:
                    if (!key.equals("is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -1039699439:
                    if (!key.equals("not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -969266188:
                    if (key.equals("starts_with")) {
                        return StringsKt.startsWith$default(obj.toString(), obj2, false, 2, (Object) null);
                    }
                    return false;
                case -966353971:
                    if (key.equals("regex_match")) {
                        return new Regex(obj2).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!key.equals("is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case -567445985:
                    if (key.equals("contains")) {
                        return StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null);
                    }
                    return false;
                case -327990090:
                    if (!key.equals("i_str_neq")) {
                        return false;
                    }
                    String obj4 = obj.toString();
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale2 = Locale.ROOT;
                    String lowerCase4 = obj4.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase5 = obj2.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(lowerCase4, lowerCase5)) {
                        return false;
                    }
                case -159812115:
                    if (!key.equals("i_is_any")) {
                        return false;
                    }
                    if (stringArrayList == null && !stringArrayList.isEmpty()) {
                        for (String str : stringArrayList) {
                            if (str == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            Locale locale3 = Locale.ROOT;
                            String lowerCase6 = str.toLowerCase(locale3);
                            Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            String obj5 = obj.toString();
                            if (obj5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase7 = obj5.toLowerCase(locale3);
                            Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                            }
                        }
                        return false;
                    }
                    return false;
                case -92753547:
                    if (!key.equals("i_str_not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    if (!stringArrayList.isEmpty()) {
                        for (String str2 : stringArrayList) {
                            if (str2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            Locale locale4 = Locale.ROOT;
                            String lowerCase8 = str2.toLowerCase(locale4);
                            Intrinsics.checkNotNullExpressionValue(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            String obj6 = obj.toString();
                            if (obj6 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase9 = obj6.toLowerCase(locale4);
                            Intrinsics.checkNotNullExpressionValue(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (Intrinsics.areEqual(lowerCase8, lowerCase9)) {
                                return false;
                            }
                        }
                    }
                case 60:
                    if (!key.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                        return false;
                    }
                case 61:
                    if (!key.equals("=")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 62:
                    if (!key.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                        return false;
                    }
                case 1084:
                    if (!key.equals("!=")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), obj2)) {
                        return false;
                    }
                case 1921:
                    if (!key.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                        return false;
                    }
                case 1952:
                    if (!key.equals("==")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 1983:
                    if (!key.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                        return false;
                    }
                case 3244:
                    if (!key.equals("eq")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 3294:
                    if (!key.equals(UserDataStore.GENDER)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 3309:
                    if (!key.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 3365:
                    if (!key.equals("in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 3449:
                    if (!key.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 3464:
                    if (!key.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 3511:
                    if (!key.equals("ne")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                    break;
                case 102680:
                    if (!key.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 107485:
                    if (!key.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 108954:
                    if (!key.equals("neq")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                    break;
                case 127966736:
                    if (!key.equals("i_str_eq")) {
                        return false;
                    }
                    String obj7 = obj.toString();
                    if (obj7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale5 = Locale.ROOT;
                    String lowerCase10 = obj7.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase11 = obj2.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return Intrinsics.areEqual(lowerCase10, lowerCase11);
                case 127966857:
                    if (!key.equals("i_str_in")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    while (r9.hasNext()) {
                    }
                    return false;
                case 363990325:
                    if (!key.equals("i_contains")) {
                        return false;
                    }
                    String obj8 = obj.toString();
                    if (obj8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale6 = Locale.ROOT;
                    String lowerCase12 = obj8.toLowerCase(locale6);
                    Intrinsics.checkNotNullExpressionValue(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase13 = obj2.toLowerCase(locale6);
                    Intrinsics.checkNotNullExpressionValue(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.contains$default((CharSequence) lowerCase12, (CharSequence) lowerCase13, false, 2, (Object) null);
                case 1091487233:
                    if (!key.equals("i_is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 1918401035:
                    if (!key.equals("not_contains") || StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null)) {
                        return false;
                    }
                case 1961112862:
                    if (!key.equals("i_starts_with")) {
                        return false;
                    }
                    String obj9 = obj.toString();
                    if (obj9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    Locale locale7 = Locale.ROOT;
                    String lowerCase14 = obj9.toLowerCase(locale7);
                    Intrinsics.checkNotNullExpressionValue(lowerCase14, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase15 = obj2.toLowerCase(locale7);
                    Intrinsics.checkNotNullExpressionValue(lowerCase15, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.startsWith$default(lowerCase14, lowerCase15, false, 2, (Object) null);
                default:
                    return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return false;
        }
    }

    @Nullable
    public static final ArrayList<String> getStringArrayList(@Nullable JSONArray jsonArray) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) || jsonArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jsonArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(jsonArray.get(i).toString());
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final boolean isMatchCCRule(@Nullable String ruleString, @Nullable Bundle data) {
        int length;
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) && ruleString != null && data != null) {
            try {
                JSONObject jSONObject = new JSONObject(ruleString);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), data);
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (!isMatchCCRule(jSONArray.get(i).toString(), data)) {
                                    return false;
                                }
                                if (i2 >= length2) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (isMatchCCRule(jSONArray2.get(i3).toString(), data)) {
                                return true;
                            }
                            if (i4 >= length) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, data);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    @NotNull
    public static final String getMatchPropertyIDs(@Nullable Bundle params) {
        String optString;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return "[]";
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = MACARules;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    String optString2 = jSONArray2.optString(i);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong("id");
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && isMatchCCRule(optString, params)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final void processParameters(@Nullable Bundle params, @NotNull String event) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!enabled || params == null) {
                return;
            }
            try {
                generateInfo(params, event);
                params.putString("_audiencePropertyIds", getMatchPropertyIDs(params));
                params.putString("cs_maca", "1");
                removeGeneratedInfo(params);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x0049, B:16:0x005c, B:19:0x0072, B:22:0x0088, B:26:0x0042, B:29:0x002b), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void generateInfo(@NotNull Bundle params, @NotNull String event) {
        String language;
        Locale locale;
        String country;
        String versionName;
        String str;
        String versionName2;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString("event", event);
            StringBuilder sb = new StringBuilder();
            Utility utility = Utility.INSTANCE;
            Locale locale2 = utility.getLocale();
            String str2 = "";
            if (locale2 != null) {
                language = locale2.getLanguage();
                if (language == null) {
                }
                sb.append(language);
                sb.append('_');
                locale = utility.getLocale();
                if (locale != null) {
                    country = locale.getCountry();
                    if (country != null) {
                    }
                    sb.append(country);
                    params.putString("_locale", sb.toString());
                    versionName = utility.getVersionName();
                    if (versionName == null) {
                        versionName = "";
                    }
                    params.putString("_appVersion", versionName);
                    params.putString("_deviceOS", "ANDROID");
                    params.putString("_platform", "mobile");
                    str = Build.MODEL;
                    if (str == null) {
                        str = "";
                    }
                    params.putString("_deviceModel", str);
                    params.putString("_nativeAppID", FacebookSdk.getApplicationId());
                    versionName2 = utility.getVersionName();
                    if (versionName2 != null) {
                        str2 = versionName2;
                    }
                    params.putString("_nativeAppShortVersion", str2);
                    params.putString("_timezone", utility.getDeviceTimeZoneName());
                    params.putString("_carrier", utility.getCarrierName());
                    params.putString("_deviceOSTypeName", "ANDROID");
                    params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                    params.putLong("_remainingDiskGB", utility.getAvailableExternalStorageGB());
                }
                country = "";
                sb.append(country);
                params.putString("_locale", sb.toString());
                versionName = utility.getVersionName();
                if (versionName == null) {
                }
                params.putString("_appVersion", versionName);
                params.putString("_deviceOS", "ANDROID");
                params.putString("_platform", "mobile");
                str = Build.MODEL;
                if (str == null) {
                }
                params.putString("_deviceModel", str);
                params.putString("_nativeAppID", FacebookSdk.getApplicationId());
                versionName2 = utility.getVersionName();
                if (versionName2 != null) {
                }
                params.putString("_nativeAppShortVersion", str2);
                params.putString("_timezone", utility.getDeviceTimeZoneName());
                params.putString("_carrier", utility.getCarrierName());
                params.putString("_deviceOSTypeName", "ANDROID");
                params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                params.putLong("_remainingDiskGB", utility.getAvailableExternalStorageGB());
            }
            language = "";
            sb.append(language);
            sb.append('_');
            locale = utility.getLocale();
            if (locale != null) {
            }
            country = "";
            sb.append(country);
            params.putString("_locale", sb.toString());
            versionName = utility.getVersionName();
            if (versionName == null) {
            }
            params.putString("_appVersion", versionName);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            str = Build.MODEL;
            if (str == null) {
            }
            params.putString("_deviceModel", str);
            params.putString("_nativeAppID", FacebookSdk.getApplicationId());
            versionName2 = utility.getVersionName();
            if (versionName2 != null) {
            }
            params.putString("_nativeAppShortVersion", str2);
            params.putString("_timezone", utility.getDeviceTimeZoneName());
            params.putString("_carrier", utility.getCarrierName());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", utility.getAvailableExternalStorageGB());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final void removeGeneratedInfo(@NotNull Bundle params) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = keys;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                params.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }
}
