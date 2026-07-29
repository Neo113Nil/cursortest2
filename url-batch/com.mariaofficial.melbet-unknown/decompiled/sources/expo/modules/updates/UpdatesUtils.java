package expo.modules.updates;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Base64;
import android.util.Log;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.facebook.common.util.UriUtil;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UpdatesUtils.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ \u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0013J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005J\f\u00100\u001a\u0004\u0018\u00010\u0005*\u00020\u0005R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lexpo/modules/updates/UpdatesUtils;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "UPDATES_DIRECTORY_NAME", "getMapFromJSONString", "", "stringifiedJSON", "getStringListFromJSONString", "", "getOrCreateUpdatesDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "sha256", "string", "", "file", "verifySHA256AndWriteToFile", "inputStream", "Ljava/io/InputStream;", "destination", "expectedBase64URLEncodedHash", "createFilenameForAsset", UriUtil.LOCAL_ASSET_SCHEME, "Lexpo/modules/updates/db/entity/AssetEntity;", "shouldCheckForUpdateOnLaunch", "", "updatesConfiguration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "HEX_ARRAY", "", "bytesToHex", "bytes", "parseDateString", "Ljava/util/Date;", "dateString", "PARAMETER_PATTERN", "Ljava/util/regex/Pattern;", "getPARAMETER_PATTERN", "()Ljava/util/regex/Pattern;", "PARAMETER_PATTERN$delegate", "Lkotlin/Lazy;", "parseContentDispositionNameParameter", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesUtils {
    private static final char[] HEX_ARRAY;

    /* renamed from: PARAMETER_PATTERN$delegate, reason: from kotlin metadata */
    private static final Lazy PARAMETER_PATTERN;
    private static final String UPDATES_DIRECTORY_NAME = ".expo-internal";
    public static final UpdatesUtils INSTANCE = new UpdatesUtils();
    private static final String TAG = "UpdatesUtils";

    /* compiled from: UpdatesUtils.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdatesConfiguration.CheckAutomaticallyConfiguration.values().length];
            try {
                iArr[UpdatesConfiguration.CheckAutomaticallyConfiguration.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdatesConfiguration.CheckAutomaticallyConfiguration.ERROR_RECOVERY_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdatesConfiguration.CheckAutomaticallyConfiguration.WIFI_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpdatesConfiguration.CheckAutomaticallyConfiguration.ALWAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private UpdatesUtils() {
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        HEX_ARRAY = charArray;
        PARAMETER_PATTERN = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.UpdatesUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Pattern PARAMETER_PATTERN_delegate$lambda$7;
                PARAMETER_PATTERN_delegate$lambda$7 = UpdatesUtils.PARAMETER_PATTERN_delegate$lambda$7();
                return PARAMETER_PATTERN_delegate$lambda$7;
            }
        });
    }

    public final Map<String, String> getMapFromJSONString(String stringifiedJSON) throws Exception {
        Intrinsics.checkNotNullParameter(stringifiedJSON, "stringifiedJSON");
        JSONObject jSONObject = new JSONObject(stringifiedJSON);
        Iterator<String> keys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(next, (String) obj);
            } catch (ClassCastException unused) {
                throw new Exception("The values in the JSON object must be strings");
            }
        }
        return linkedHashMap;
    }

    public final List<String> getStringListFromJSONString(String stringifiedJSON) throws Exception {
        Intrinsics.checkNotNullParameter(stringifiedJSON, "stringifiedJSON");
        JSONArray jSONArray = new JSONArray(stringifiedJSON);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public final File getOrCreateUpdatesDirectory(Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), UPDATES_DIRECTORY_NAME);
        if (file.exists()) {
            if (file.isFile()) {
                throw new Exception("File already exists at the location of the Updates Directory: " + file + " ; aborting");
            }
        } else if (!file.mkdir()) {
            throw new Exception("Failed to create Updates Directory: mkdir() returned false");
        }
        return file;
    }

    public final String sha256(String string) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = string.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNull(digest);
            return bytesToHex(digest);
        } catch (UnsupportedEncodingException e) {
            Log.e(TAG, "Failed to checksum string via SHA-256", e);
            throw e;
        } catch (NoSuchAlgorithmException e2) {
            Log.e(TAG, "Failed to checksum string via SHA-256", e2);
            throw e2;
        }
    }

    public final byte[] sha256(File file) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            DigestInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("SHA-256"));
                try {
                    byte[] digest = fileInputStream.getMessageDigest().digest();
                    Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    return digest;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            Log.e(TAG, "Failed to checksum file via SHA-256: " + file, e);
            throw e;
        } catch (NoSuchAlgorithmException e2) {
            Log.e(TAG, "Failed to checksum file via SHA-256: " + file, e2);
            throw e2;
        }
    }

    public final byte[] verifySHA256AndWriteToFile(InputStream inputStream, File destination, String expectedBase64URLEncodedHash) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(destination, "destination");
        FileOutputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance("SHA-256"));
        try {
            DigestInputStream digestInputStream2 = digestInputStream;
            File file = new File(destination.getAbsolutePath() + DefaultDiskStorage.FileType.TEMP);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            digestInputStream = digestInputStream2;
            try {
                DigestInputStream digestInputStream3 = digestInputStream;
                digestInputStream = new FileOutputStream(file);
                try {
                    ByteStreamsKt.copyTo$default(digestInputStream3, digestInputStream, 0, 2, null);
                    CloseableKt.closeFinally(digestInputStream, null);
                    CloseableKt.closeFinally(digestInputStream, null);
                    byte[] digest = digestInputStream2.getMessageDigest().digest();
                    String encodeToString = Base64.encodeToString(digest, 11);
                    if (expectedBase64URLEncodedHash != null && !Intrinsics.areEqual(expectedBase64URLEncodedHash, encodeToString)) {
                        throw new IOException("File download was successful but base64url-encoded SHA-256 did not match expected; expected: " + expectedBase64URLEncodedHash + "; actual: " + encodeToString);
                    }
                    try {
                        try {
                            FilesKt.copyTo$default(file, destination, true, 0, 4, null);
                            file.delete();
                            Intrinsics.checkNotNull(digest);
                            CloseableKt.closeFinally(digestInputStream, null);
                            return digest;
                        } catch (Throwable th) {
                            file.delete();
                            throw th;
                        }
                    } catch (NoSuchFileException unused) {
                        throw new IOException("File download was successful, but temp file " + file.getAbsolutePath() + " does not exist");
                    } catch (Exception e) {
                        throw new IOException("File download was successful, but an exception occurred: " + e);
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final String createFilenameForAsset(AssetEntity asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        String fileExtension$expo_updates_release = asset.getFileExtension$expo_updates_release();
        if (asset.getKey() == null) {
            return "asset-" + new Date().getTime() + "-" + new Random().nextInt() + fileExtension$expo_updates_release;
        }
        return asset.getKey() + fileExtension$expo_updates_release;
    }

    public final boolean shouldCheckForUpdateOnLaunch(UpdatesConfiguration updatesConfiguration, UpdatesLogger logger, Context context) {
        Intrinsics.checkNotNullParameter(updatesConfiguration, "updatesConfiguration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$0[updatesConfiguration.getCheckOnLaunch().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                logger.error("Could not determine active network connection is metered; not checking for updates", new Exception("Null ConnectivityManager system service"), UpdatesErrorCode.Unknown);
                return false;
            }
            if (!connectivityManager.isActiveNetworkMetered()) {
                return true;
            }
        }
        return false;
    }

    public final String bytesToHex(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            int i2 = b & UByte.MAX_VALUE;
            int i3 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final Date parseDateString(String dateString) throws ParseException {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'X'", Locale.US).parse(dateString);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            return parse;
        } catch (Exception unused) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date parse2 = simpleDateFormat.parse(dateString);
            Intrinsics.checkNotNull(parse2, "null cannot be cast to non-null type java.util.Date");
            return parse2;
        }
    }

    private final Pattern getPARAMETER_PATTERN() {
        Object value = PARAMETER_PATTERN.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Pattern) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern PARAMETER_PATTERN_delegate$lambda$7() {
        return Pattern.compile(";\\s*(?:\\s*([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)\\s*=\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?\\s*");
    }

    public final String parseContentDispositionNameParameter(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = str;
        Matcher matcher = getPARAMETER_PATTERN().matcher(str2);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, ';', 0, false, 6, (Object) null);
        while (indexOf$default < str.length()) {
            matcher.region(indexOf$default, str.length());
            if (!matcher.lookingAt()) {
                String substring = str.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + substring + "\" for: \"" + str + "\"").toString());
            }
            String group = matcher.group(1);
            if (group == null) {
                indexOf$default = matcher.end();
            } else {
                String group2 = matcher.group(2);
                if (group2 == null) {
                    group2 = matcher.group(3);
                } else if (StringsKt.startsWith$default(group2, "'", false, 2, (Object) null) && StringsKt.endsWith$default(group2, "'", false, 2, (Object) null) && group2.length() > 2) {
                    group2 = group2.substring(1, group2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(group2, "substring(...)");
                }
                if (!linkedHashMap.containsKey(group)) {
                    linkedHashMap.put(group, group2);
                }
                indexOf$default = matcher.end();
            }
        }
        return (String) linkedHashMap.get("name");
    }
}
