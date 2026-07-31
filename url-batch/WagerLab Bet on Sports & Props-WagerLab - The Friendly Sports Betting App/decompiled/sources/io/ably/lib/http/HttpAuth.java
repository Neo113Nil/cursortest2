package io.ably.lib.http;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.amazon.a.a.o.b.f;
import com.google.common.base.Ascii;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.util.Base64Coder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes7.dex */
public class HttpAuth {
    private static final String HEX_LOOKUP = "0123456789abcdef";
    private static MessageDigest md5;
    private String HA1;
    private int ncCounter = 1;
    private String nonce;
    private String opaque;
    private final String password;
    private final Type prefType;
    private String[] qops;
    private String realm;
    private Type type;
    private final String username;

    public enum Type {
        BASIC,
        DIGEST,
        X_ABLY_TOKEN;

        static Type parse(String str) {
            String replace = str.toUpperCase(Locale.ROOT).replace('-', '_');
            try {
                return valueOf(replace);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Failed to parse conformed form '" + replace + "' of raw value '" + str + "'.", e);
            }
        }
    }

    HttpAuth(String str, String str2, Type type) {
        this.username = str;
        this.password = str2;
        this.prefType = type;
    }

    boolean hasChallenge() {
        return this.type != null;
    }

    public static Map<Type, String> sortAuthenticateHeaders(Collection<String> collection) throws AblyException {
        HashMap hashMap = new HashMap();
        for (String str : collection) {
            int indexOf = str.indexOf(32);
            if (indexOf == -1) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid authenticate header (no delimiter)", 40000, 400));
            }
            String trim = str.substring(0, indexOf).trim();
            hashMap.put(Type.parse(trim), str.substring(indexOf + 1).trim());
        }
        return hashMap;
    }

    /* renamed from: io.ably.lib.http.HttpAuth$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$http$HttpAuth$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$io$ably$lib$http$HttpAuth$Type = iArr;
            try {
                iArr[Type.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$http$HttpAuth$Type[Type.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public String getAuthorizationHeader(String str, String str2, byte[] bArr) throws AblyException {
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$http$HttpAuth$Type[this.type.ordinal()];
        if (i == 1) {
            return "Basic " + Base64Coder.encodeString(this.username + AbstractJsonLexerKt.COLON + this.password);
        }
        if (i != 2) {
            return null;
        }
        return getDigestHeader(str, str2, bArr);
    }

    public void processAuthenticateHeaders(Map<Type, String> map) throws AblyException {
        Type type = this.prefType;
        this.type = type;
        String str = map.get(type);
        if (str == null) {
            Map.Entry<Type, String> next = map.entrySet().iterator().next();
            if (next == null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid authenticate header (no entries)", 40000, 400));
            }
            this.type = next.getKey();
            str = next.getValue();
        }
        if (this.type == Type.DIGEST) {
            processDigestHeader(str);
        }
    }

    private synchronized void processDigestHeader(String str) throws AblyException {
        HashMap<String, String> splitAuthFields = splitAuthFields(str);
        this.realm = splitAuthFields.get("realm");
        this.nonce = splitAuthFields.get("nonce");
        this.opaque = splitAuthFields.get("opaque");
        this.HA1 = digestString(this.username + AbstractJsonLexerKt.COLON + this.realm + AbstractJsonLexerKt.COLON + this.password);
        String str2 = splitAuthFields.get("qop");
        if (str2 != null) {
            this.qops = str2.split(f.f598a);
        }
    }

    private String getDigestHeader(String str, String str2, byte[] bArr) throws AblyException {
        String str3;
        String digestString;
        String str4;
        String[] strArr = this.qops;
        String str5 = null;
        if (strArr != null) {
            for (String str6 : strArr) {
                if (bArr != null) {
                    str3 = "auth-int";
                    if (str6.trim().equals("auth-int")) {
                        break;
                    }
                }
                if (str6.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
            }
        }
        str3 = null;
        if (str3 == null) {
            digestString = digestString(this.HA1 + AbstractJsonLexerKt.COLON + this.nonce + AbstractJsonLexerKt.COLON + digestString(str + AbstractJsonLexerKt.COLON + str2));
            str4 = null;
        } else if (str3.equals("auth")) {
            int i = this.ncCounter;
            this.ncCounter = i + 1;
            str5 = String.format("%08X", Integer.valueOf(i));
            str4 = getClientNonce();
            digestString = digestString(this.HA1 + AbstractJsonLexerKt.COLON + this.nonce + AbstractJsonLexerKt.COLON + str5 + AbstractJsonLexerKt.COLON + str4 + AbstractJsonLexerKt.COLON + str3 + AbstractJsonLexerKt.COLON + digestString(str + AbstractJsonLexerKt.COLON + str2));
        } else {
            int i2 = this.ncCounter;
            this.ncCounter = i2 + 1;
            str5 = String.format("%08X", Integer.valueOf(i2));
            String clientNonce = getClientNonce();
            digestString = digestString(this.HA1 + AbstractJsonLexerKt.COLON + this.nonce + AbstractJsonLexerKt.COLON + str5 + AbstractJsonLexerKt.COLON + clientNonce + AbstractJsonLexerKt.COLON + str3 + AbstractJsonLexerKt.COLON + digestString(str + AbstractJsonLexerKt.COLON + str2 + AbstractJsonLexerKt.COLON + digestBytes(bArr)));
            str4 = clientNonce;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Digest username=\"");
        sb.append(this.username).append("\",realm=\"");
        sb.append(this.realm).append("\",nonce=\"");
        sb.append(this.nonce).append("\",uri=\"");
        sb.append(str2).append("\",algorithm=\"MD5\",");
        if (str3 != null) {
            sb.append("qop=\"").append(str3).append("\",nc=");
            sb.append(str5).append(",cnonce=\"");
            sb.append(str4).append("\",");
        }
        if (this.opaque != null) {
            sb.append("response=\"").append(digestString).append("\",opaque=\"");
            sb.append(this.opaque).append("\"");
        } else {
            sb.append("response=\"").append(digestString).append("\"");
        }
        return sb.toString();
    }

    private static HashMap<String, String> splitAuthFields(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(f.f598a)) {
            if (str2.contains(f.b)) {
                hashMap.put(str2.substring(0, str2.indexOf(f.b)).trim(), str2.substring(str2.indexOf(f.b) + 1).replaceAll("\"", "").trim());
            }
        }
        return hashMap;
    }

    private static String digestBytes(byte[] bArr) {
        md5.reset();
        md5.update(bArr);
        return bytesToHexString(md5.digest());
    }

    private static String digestString(String str) {
        try {
            return digestBytes(str.getBytes(CharEncoding.ISO_8859_1));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(HEX_LOOKUP.charAt((bArr[i] & 240) >> 4));
            sb.append(HEX_LOOKUP.charAt(bArr[i] & Ascii.SI));
        }
        return sb.toString();
    }

    private static String getClientNonce() {
        return digestString(new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date()) + Integer.valueOf(new Random(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US).nextInt()).toString()).substring(0, 8);
    }

    static {
        try {
            md5 = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException unused) {
        }
    }
}
